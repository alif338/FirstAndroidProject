package com.dicoding.antreyuk;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class HomePageCompany extends RecyclerView.Adapter<HomePageCompany.ListViewHolder> {
    private ArrayList<Company> listCompany;

    public HomePageCompany(ArrayList<Company> company) {
        this.listCompany = company;
    }

    public OnItemClickAction onItemClickAction;

    public void setOnItemClickAction(OnItemClickAction onItemClickAction){
        this.onItemClickAction = onItemClickAction;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_company,viewGroup,false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final HomePageCompany.ListViewHolder holder, int position) {
        Company company =listCompany.get(position);
        Glide.with(holder.itemView.getContext())
                .load(company.getBrand())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgBrand);
        holder.tvName.setText(company.getCompany());
        holder.tvAddress.setText(company.getAddress());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickAction.onItemClicked(listCompany.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listCompany.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgBrand;
        TextView  tvName, tvAddress;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgBrand =itemView.findViewById(R.id.company_photo);
            tvName = itemView.findViewById(R.id.company_name);
            tvAddress = itemView.findViewById(R.id.company_address);
        }
    }

    public interface OnItemClickAction {
        void onItemClicked(Company data);
    }
}
