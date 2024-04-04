package com.example.sidenav;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class Fragment2 extends Fragment {
    RecyclerView main_recyclerView;
    RV_Adapter adapter;
    ArrayList<Items> data;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_2, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        main_recyclerView = view.findViewById(R.id.fragment2_recycler);
        data = new ArrayList<Items>();

        //region Adding Cata Datas
        Items cat1 = new Items();
        cat1.setName("Devon Rex");
        cat1.setDescription("The Devon Rex is a tall-eared, short-haired breed of cat that emerged in England during the late 1950s.");
        cat1.setImage("https://www.catster.com/wp-content/uploads/2023/12/Devon-Rex_Simona-Melegova_Unsplash.jpg.webp");
        data.add(cat1);

        Items cat2 = new Items();
        cat2.setName("European Shorthair");
        cat2.setDescription("European Shorthair has its counterparts in UK and the US, though these breeds have been bred for longer.");
        cat2.setImage("https://www.catster.com/wp-content/uploads/2023/12/European-Short-hair_Marcus-Roeske_Unsplash.jpg.webp");
        data.add(cat2);

        Items cat3 = new Items();
        cat3.setName("Scottish Fold");
        cat3.setDescription("The Scottish Fold is a distinctive breed of domestic cat characterised by the curling of the ears.");
        cat3.setImage("https://www.catster.com/wp-content/uploads/2023/12/Scottish-Fold_Sophkins_Pixabay.jpg.webp");
        data.add(cat3);

        Items cat4 = new Items();
        cat4.setName("Chartreux");
        cat4.setDescription("The Chartreux is a rare breed of cat from France, and is recognised by a number of registries around the world.");
        cat4.setImage("https://www.catster.com/wp-content/uploads/2023/12/Chartreux_Lucas-Bouillon_Pixabay.jpg.webp");
        data.add(cat4);

        Items cat5 = new Items();
        cat5.setName("Aegean Cats");
        cat5.setDescription("Aegean cats are a naturally occurrence of domestic cat originating from the Cycladic Islands of Greece and western Turkey.");
        cat5.setImage("https://www.catster.com/wp-content/uploads/2023/12/Aegean-Cat_pinggr_shutterstock.jpg.webp");
        data.add(cat5);

        Items cat6 = new Items();
        cat6.setName("Manx Cat");
        cat6.setDescription("The Manx cat is a breed of domestic cat originating on the Isle of Man, with a mutation that shortens the tail.");
        cat6.setImage("https://www.catster.com/wp-content/uploads/2023/12/blue-smoke-manx-cat_Edi-Libedinsky_Shutterstock.jpg.webp");
        data.add(cat6);

        Items cat7 = new Items();
        cat7.setName("Russian Blue");
        cat7.setDescription("The russian blue is a cat breed with colors that vary from a light shimmering silver to a darker, slate grey.");
        cat7.setImage("https://upload.wikimedia.org/wikipedia/commons/3/3a/Russian_blue.jpg");
        data.add(cat7);

        Items cat8 = new Items();
        cat8.setName("German Rex");
        cat8.setDescription("The German Rex is a medium-sized breed with slender legs of a medium length. The head is round with large, open ears.");
        cat8.setImage("https://www.catster.com/wp-content/uploads/2023/12/German-Rex_Shutterstock_Prasanna-photography-1.jpg.webp");
        data.add(cat8);
        //endregion

        adapter = new RV_Adapter(getContext(), data);
        main_recyclerView.setAdapter(adapter);
        main_recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
    }
}