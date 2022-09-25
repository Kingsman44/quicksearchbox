package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.assistantactions.rendering.p641d.C11307e;
import com.google.assistant.p3897e.p3902c.p3907c.C51027dr;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.bh */
/* compiled from: PG */
public final class C11375bh extends ArrayAdapter {

    /* renamed from: a */
    final /* synthetic */ ListField f37111a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11375bh(ListField listField, Context context, C51027dr[] drVarArr) {
        super(context, R.layout.list_item_view, drVarArr);
        this.f37111a = listField;
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        C51027dr drVar = (C51027dr) getItem(i);
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.list_item_view, (ViewGroup) null);
        }
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            textView.setText(drVar.f132855b == 2 ? (String) drVar.f132856c : BuildConfig.FLAVOR);
            ListField listField = this.f37111a;
            if (i == listField.f37005c) {
                textView.setTextColor(C11307e.m26908a(listField.f37159r, R.attr.fluid_actions_highlight_field_color));
            } else {
                textView.setTextColor(C11307e.m26908a(listField.f37159r, R.attr.fluid_actions_nonhighlight_field_color));
            }
            return textView;
        }
        ((C59052c) ((C59052c) ListField.f37003a.mo56225c()).mo56372aa(43265)).mo56386p("Convertview is not an instance of TextView");
        return view;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        C51027dr drVar = (C51027dr) getItem(i);
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.current_list_item_view, (ViewGroup) null);
        }
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            textView.setText(drVar.f132855b == 2 ? (String) drVar.f132856c : BuildConfig.FLAVOR);
            ListField listField = this.f37111a;
            listField.f37004b.mo19803c(textView, listField.f37153l.mo19717a(), this.f37111a.f37151j);
        }
        return view;
    }
}
