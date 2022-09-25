package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1614t.C19391a;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components.SpinnerComponent;
import com.google.assistant.p3897e.p3902c.p3907c.C51027dr;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.bs */
/* compiled from: PG */
public final class C33313bs extends ArrayAdapter {

    /* renamed from: a */
    final /* synthetic */ ListField f89305a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33313bs(ListField listField, Context context, C51027dr[] drVarArr) {
        super(context, R.layout.fa_drop_down_list_item, drVarArr);
        this.f89305a = listField;
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        C51027dr drVar = (C51027dr) getItem(i);
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.fa_drop_down_list_item, (ViewGroup) null);
        }
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            textView.setText(drVar.f132855b == 2 ? (String) drVar.f132856c : BuildConfig.FLAVOR);
            if (i == this.f89305a.f89124c) {
                textView.setTextColor(C19391a.m36980a(getContext(), R.attr.colorPrimary));
            } else {
                textView.setTextColor(C19391a.m36980a(getContext(), R.attr.colorOnSurface));
            }
            return textView;
        }
        ((C59052c) ((C59052c) ListField.f89122a.mo56225c()).mo56372aa(51087)).mo56386p("convertView is not an instance of TextView");
        return view;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        SpinnerComponent spinnerComponent;
        C51027dr drVar = (C51027dr) getItem(i);
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.fa_drop_down_list_current_item, (ViewGroup) null);
        }
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            textView.setText(drVar.f132855b == 2 ? (String) drVar.f132856c : BuildConfig.FLAVOR);
            ListField listField = this.f89305a;
            C51941eu euVar = listField.f89126e;
            if (!(euVar == null || (spinnerComponent = listField.f89123b) == null)) {
                boolean z = false;
                if ((euVar.f136273a & 64) != 0 && euVar.f136282j) {
                    z = true;
                }
                spinnerComponent.mo38668c(textView, z, listField.f89125d);
            }
        }
        return view;
    }
}
