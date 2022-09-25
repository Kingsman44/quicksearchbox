package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1614t.C19391a;
import com.google.assistant.p3897e.p3902c.p3907c.C50975bt;
import com.google.assistant.p3897e.p3902c.p3907c.C50976bu;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.am */
/* compiled from: PG */
public final class C33280am extends ArrayAdapter {

    /* renamed from: a */
    final /* synthetic */ DateSelectionField f89253a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33280am(DateSelectionField dateSelectionField, Context context) {
        super(context, R.layout.fa_drop_down_list_item);
        this.f89253a = dateSelectionField;
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        C50976bu buVar = (C50976bu) getItem(i);
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.fa_drop_down_list_item, (ViewGroup) null);
        }
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            textView.setText(buVar.f132706b);
            if (i == this.f89253a.f89061c) {
                textView.setTextColor(C19391a.m36980a(getContext(), R.attr.colorPrimary));
            }
            return textView;
        }
        ((C59052c) ((C59052c) DateSelectionField.f89059a.mo56225c()).mo56372aa(51042)).mo56386p("Convertview is not an instance of TextView");
        return view;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        int a;
        C50976bu buVar = (C50976bu) getItem(i);
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.fa_drop_down_list_current_item, (ViewGroup) null);
        }
        if (view instanceof TextView) {
            C50976bu buVar2 = this.f89253a.f89063e;
            int i2 = buVar2.f132705a;
            if ((i2 & 4) == 0 || (a = C50975bt.m85998a(buVar.f132711g)) == 0 || a != 2) {
                if ((buVar.f132705a & 32) != 0) {
                    ((TextView) view).setText(buVar.f132710f);
                } else {
                    ((TextView) view).setText(buVar.f132706b);
                }
                DateSelectionField dateSelectionField = this.f89253a;
                C51941eu euVar = dateSelectionField.f89065g;
                boolean z = false;
                if (!(euVar == null || (euVar.f136273a & 64) == 0 || !euVar.f136282j)) {
                    z = true;
                }
                dateSelectionField.f89060b.mo38668c(view, z, dateSelectionField.f89064f);
            } else {
                if ((i2 & 32) != 0) {
                    ((TextView) view).setText(buVar2.f132710f);
                } else {
                    ((TextView) view).setText(buVar2.f132706b);
                }
                return view;
            }
        }
        return view;
    }
}
