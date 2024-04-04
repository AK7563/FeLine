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

public class Fragment3 extends Fragment {

    RecyclerView main_recyclerView;
    RV_Adapter adapter;
    ArrayList<Items> data;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_3, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        main_recyclerView = view.findViewById(R.id.fragment3_recycler);
        data = new ArrayList<Items>();

        //region Adding Cata Datas
        Items cat1 = new Items();
        cat1.setName("Siamese Cat");
        cat1.setDescription("The Siamese cat is one of the first distinctly recognised breeds of Asian cat, derived from the Wichianmat landrace.");
        cat1.setImage("https://www.thesprucepets.com/thmb/L4aCCnKpWNGOTxXQGIq8ImlE0ys=/750x0/filters:no_upscale():max_bytes(150000):strip_icc():format(webp)/GettyImages-901825714-89cb2b6c5deb4578924fc6c66d0f1ff5.jpg");
        data.add(cat1);

        Items cat2 = new Items();
        cat2.setName("Persian Cat");
        cat2.setDescription("The Persian cat, also known as the Persian Longhair, is a long-haired breed of cat characterised by a round face and short muzzle.");
        cat2.setImage("https://www.thesprucepets.com/thmb/CoKTx8OTliNg6owSKlUNPaqPUDs=/750x0/filters:no_upscale():max_bytes(150000):strip_icc():format(webp)/brown-persian-cat-laying-on-edge-of-green-carpet-456750383-581211b53df78c2c7320b40b.jpg");
        data.add(cat2);

        Items cat3 = new Items();
        cat3.setName("Turkish Angora");
        cat3.setDescription("The Turkish Angora is a breed of domestic cat. Turkish Angoras are one of the ancient breeds of cat having originated in central Anatolia.");
        cat3.setImage("https://www.thesprucepets.com/thmb/UI8diccup577fNvh9g-wlJE5uy4=/750x0/filters:no_upscale():max_bytes(150000):strip_icc():format(webp)/GettyImages-6473672371-44c84b36842444b4814e6565b3eb4467.jpg");
        data.add(cat3);

        Items cat4 = new Items();
        cat4.setName("Bengal");
        cat4.setDescription("The Bengal cat is a breed of hybrid cat created from crossing of an Asian leopard cat, with domestic cats, especially the spotted Egyptian Mau.");
        cat4.setImage("https://www.thesprucepets.com/thmb/7xMG-xo_q_y7_MebKTLHGIeVz8k=/750x0/filters:no_upscale():max_bytes(150000):strip_icc():format(webp)/GettyImages-7172340531-e1ba6785690d4400bfbae02e8069d4c8.jpg");
        data.add(cat4);

        Items cat5 = new Items();
        cat5.setName("Japanese Bobtail");
        cat5.setDescription("The Japanese Bobtail is a breed of domestic cat with an unusual bobtail more closely resembling the tail of a rabbit than that of other cats.");
        cat5.setImage("https://www.thesprucepets.com/thmb/CwMVH5qg44C-hB7cAliZbbl3daU=/750x0/filters:no_upscale():max_bytes(150000):strip_icc():format(webp)/JapaneseBobtailonMantle-e133db4a91c24d2ca35f98ad4455c213.jpg");
        data.add(cat5);

        Items cat6 = new Items();
        cat6.setName("Korat Cat");
        cat6.setDescription("The Korat cat is a silver-tipped blue-grey, short-haired breed of domestic cat with a small to medium build and a low percentage of body fat.");
        cat6.setImage("https://www.thesprucepets.com/thmb/NJt5IbagpSygxynnEOvfuNxTXco=/750x0/filters:no_upscale():max_bytes(150000):strip_icc():format(webp)/GettyImages-1174072142-c51eeba298b14b6381dab7a1973b7148.jpg");
        data.add(cat6);

        Items cat7 = new Items();
        cat7.setName("Dragon Li");
        cat7.setDescription("The Dragon Li is a recently established Chinese breed of domestic cat. It was developed from a common landrace of cats in China.");
        cat7.setImage("https://www.thesprucepets.com/thmb/ltJqP-ZpyC7kkegIaKsu1Rx6IQ8=/750x0/filters:no_upscale():max_bytes(150000):strip_icc():format(webp)/GettyImages-1067924434-968fc586872c4bc081cabffeac3583f6.jpg");
        data.add(cat7);

        Items cat8 = new Items();
        cat8.setName("Burmese");
        cat8.setDescription("The Burmese cat is a breed of domestic cat, originating in Burma, believed to be developed in the United States and Britain.");
        cat8.setImage("https://www.thesprucepets.com/thmb/rR8iLwZzzCsrJ9JPSlTKPDiBXMg=/750x0/filters:no_upscale():max_bytes(150000):strip_icc():format(webp)/GettyImages-87883771-ee2be9f8c52b47eba954bef86885a404.jpg");
        data.add(cat8);
        //endregion

        adapter = new RV_Adapter(getContext(), data);
        main_recyclerView.setAdapter(adapter);
        main_recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
    }
}