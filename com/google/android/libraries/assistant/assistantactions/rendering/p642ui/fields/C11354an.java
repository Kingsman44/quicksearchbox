package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.assistantactions.rendering.p641d.C11307e;
import com.google.assistant.p3897e.p3902c.p3907c.C50975bt;
import com.google.assistant.p3897e.p3902c.p3907c.C50976bu;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.an */
/* compiled from: PG */
public final class C11354an extends ArrayAdapter {

    /* renamed from: a */
    final /* synthetic */ DateSelectionField f37083a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11354an(DateSelectionField dateSelectionField, Context context) {
        super(context, R.layout.list_item_view);
        this.f37083a = dateSelectionField;
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        C50976bu buVar = (C50976bu) getItem(i);
        if (view == null) {
            view = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.list_item_view, (ViewGroup) null);
        }
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            textView.setText(buVar.f132706b);
            DateSelectionField dateSelectionField = this.f37083a;
            if (i == dateSelectionField.f36971c) {
                textView.setTextColor(C11307e.m26908a(dateSelectionField.f37159r, R.attr.fluid_actions_list_item_highlight_color));
            }
            return textView;
        }
        ((C59052c) ((C59052c) DateSelectionField.f36969a.mo56225c()).mo56372aa(43246)).mo56386p("Convertview is not an instance of TextView");
        return view;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        int a;
        C50976bu buVar = (C50976bu) getItem(i);
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.current_list_item_view, (ViewGroup) null);
        }
        C50976bu buVar2 = this.f37083a.f36973e;
        int i2 = buVar2.f132705a;
        if ((i2 & 4) == 0 || (a = C50975bt.m85998a(buVar.f132711g)) == 0 || a != 2) {
            if (view instanceof TextView) {
                if ((buVar.f132705a & 32) != 0) {
                    ((TextView) view).setText(buVar.f132710f);
                } else {
                    ((TextView) view).setText(buVar.f132706b);
                }
                DateSelectionField dateSelectionField = this.f37083a;
                dateSelectionField.f36970b.mo19803c((TextView) view, dateSelectionField.f37153l.mo19717a(), this.f37083a.f37151j);
            }
            return view;
        }
        if ((i2 & 32) != 0) {
            ((TextView) view).setText(buVar2.f132710f);
        } else {
            ((TextView) view).setText(buVar2.f132706b);
        }
        return view;
    }
}
