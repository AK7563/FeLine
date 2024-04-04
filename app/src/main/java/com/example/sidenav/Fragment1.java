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

public class Fragment1 extends Fragment {

    RecyclerView main_recyclerView;
    RV_Adapter adapter;
    ArrayList<Items> data;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_1, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        main_recyclerView = view.findViewById(R.id.fragment1_recycler);
        data = new ArrayList<Items>();

        //region Adding Cata Datas
        Items cat1 = new Items();
        cat1.setName("American Shorthair");
        cat1.setDescription("The American Shorthair is a breed of cat descended from Europe brought to America to protect valuable cargo.");
        cat1.setImage("https://www.thesprucepets.com/thmb/i1bApxAq-m9EY1lcJui0FWf8b6Q=/750x0/filters:no_upscale():max_bytes(150000):strip_icc():format(webp)/GettyImages-1002000798-fd487d72fce14d2aa96ca5bb8fe7499a.jpg");
        data.add(cat1);

        Items cat2 = new Items();
        cat2.setName("American Curl");
        cat2.setDescription("The American Curl is a cat known for its unusual ears, which curl back toward the center of the back of the skull.");
        cat2.setImage("https://www.thesprucepets.com/thmb/bss7gdR1vzA8u2V2w2PeMyserx4=/750x0/filters:no_upscale():max_bytes(150000):strip_icc():format(webp)/AmericanCurlCat-1eba48478681484d983413df045f6316.jpg");
        data.add(cat2);

        Items cat3 = new Items();
        cat3.setName("Maine Coon");
        cat3.setDescription("The Maine Coon is a large domesticated cat breed. It is one of the oldest natural breeds in North America.");
        cat3.setImage("https://www.thesprucepets.com/thmb/KpS8NoJ4-k3V12ebHtmfZR6YQ20=/750x0/filters:no_upscale():max_bytes(150000):strip_icc():format(webp)/Mainecoonkitten-ceadb9058af14771901c8729f54258af.jpg");
        data.add(cat3);

        Items cat4 = new Items();
        cat4.setName("American Bobtail");
        cat4.setDescription("The American Bobtail is an uncommon breed of domestic cat which was developed in the late 1960s.");
        cat4.setImage("https://encrypted-tbn2.gstatic.com/licensed-image?q=tbn:ANd9GcRGQVztWFyi0AjIPmjNvc3mK7N8ECprv2f92KNEtJ9zmFtz20p4DkNTvehBiqPtRQb-0qZMmZt1UwGvj4Q");
        data.add(cat4);

        Items cat5 = new Items();
        cat5.setName("Ragdoll");
        cat5.setDescription("The Ragdoll is a breed of cat with a distinct colorpoint coat and blue eyes. Its morphology is large and weighty, and it has a semi-long and silky soft coat.");
        cat5.setImage("https://upload.wikimedia.org/wikipedia/commons/6/64/Ragdoll_from_Gatil_Ragbelas.jpg");
        data.add(cat5);

        Items cat6 = new Items();
        cat6.setName("Selkirk Rex");
        cat6.setDescription("The Selkirk Rex is distinct from all other Rex breeds. Unlike the Devon Rex and Cornish Rex, the hair is of normal length and not partly missing.");
        cat6.setImage("https://upload.wikimedia.org/wikipedia/en/c/c3/PolloSelkirkRex.jpg");
        data.add(cat6);

        Items cat7 = new Items();
        cat7.setName("LaPerm");
        cat7.setDescription("The LaPerm is a breed of cat. A LaPerm's fur is curly (hence the name \"perm\"), with the tightest curls being on the throat and on the base of the ears.");
        cat7.setImage("https://www.litter-robot.com/media/wysiwyg/laperm-cat4.png");
        data.add(cat7);

        Items cat8 = new Items();
        cat8.setName("American Wirehair");
        cat8.setDescription("The American Wirehair is a mutation of the American Shorthair. It first occurred as a mutation in upstate New York. This single red-and-white male had wiry fur.");
        cat8.setImage("https://www.litter-robot.com/media/wysiwyg/american-wirehair-cat_2.png");
        data.add(cat8);
        //endregion

        adapter = new RV_Adapter(getContext(), data);
        main_recyclerView.setAdapter(adapter);
        main_recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
    }
}