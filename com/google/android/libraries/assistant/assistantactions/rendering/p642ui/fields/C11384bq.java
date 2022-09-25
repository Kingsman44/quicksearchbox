package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3897e.p3902c.p3907c.C51119hb;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.bq */
/* compiled from: PG */
public final class C11384bq extends ArrayAdapter {
    public C11384bq(Context context, C51119hb[] hbVarArr) {
        super(context, R.layout.receipt_card_list_view_item, hbVarArr);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        C51119hb hbVar = (C51119hb) getItem(i);
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.receipt_card_list_view_item, (ViewGroup) null);
        }
        TextView textView = (TextView) view.findViewById(R.id.title);
        TextView textView2 = (TextView) view.findViewById(R.id.description);
        textView.setVisibility(8);
        textView2.setVisibility(8);
        if ((hbVar.f133060a & 1) != 0) {
            textView.setText(hbVar.f133061b);
            textView.setVisibility(0);
        }
        if ((hbVar.f133060a & 2) != 0) {
            textView2.setText(hbVar.f133062c);
            textView2.setVisibility(0);
        }
        return view;
    }
}
