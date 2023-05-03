package com.example.fragmentsample2;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MenuListFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //このフラグメントが所属するActivityオブジェクトを取得
        Activity parentActivity = getActivity();
        //フラグメントで表示する画面をXMLファイルからインフレートする
        View view = inflater.inflate(R.layout.fragment_menu_list, container, false);
        //画面部品のListViewを取得
        ListView lvMenu = view.findViewById(R.id.lvMenu);
        //SimpleAdapterで使用するListオブジェクトを用意
        List<Map<String, String>> menuList = new ArrayList<>();

        //「から揚げ定食」のデータを格納するMapオブジェクトの用意とmenuListへのデータ登録
        Map<String, String> menu = new HashMap<>();
        menu.put("name", "から揚げ定食");
        menu.put("price", "800円");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name", "ハンバーグ定食");
        menu.put("price", "850円");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name", "焼き魚定食");
        menu.put("price", "700円");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name", "野菜炒め定食");
        menu.put("price", "600円");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name", "とんかつ定食");
        menu.put("price", "900円");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name", "ハンバーグ定食");
        menu.put("price", "850円");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name", "焼き魚定食");
        menu.put("price", "700円");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name", "野菜炒め定食");
        menu.put("price", "600円");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name", "とんかつ定食");
        menu.put("price", "900円");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name", "ハンバーグ定食");
        menu.put("price", "850円");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name", "焼き魚定食");
        menu.put("price", "700円");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name", "野菜炒め定食");
        menu.put("price", "600円");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name", "とんかつ定食");
        menu.put("price", "900円");
        menuList.add(menu);

        //SimpleAdapter第4引数from用データ作成
        String[] from = {"name", "price"};
        //SimpleAdapter第５引数to用データ作成
        int[] to = {android.R.id.text1, android.R.id.text2};
        //SimpleAdapterを生成
        SimpleAdapter adapter = new SimpleAdapter(parentActivity, menuList,
                android.R.layout.simple_expandable_list_item_2, from, to);
        //adapterの登録
        lvMenu.setAdapter(adapter);

        return view;
    }
}