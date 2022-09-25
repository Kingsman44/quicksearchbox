package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1614t.C19391a;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.dg */
/* compiled from: PG */
public final class C33355dg extends ArrayAdapter {

    /* renamed from: a */
    final /* synthetic */ RecurrenceSelectionField f89397a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33355dg(RecurrenceSelectionField recurrenceSelectionField, Context context) {
        super(context, R.layout.fa_drop_down_list_item);
        this.f89397a = recurrenceSelectionField;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        String str = (String) getItem(i);
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.fa_recurrence_selection_field_current_list_item, (ViewGroup) null);
        }
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            textView.setText(str);
            if (this.f89397a.f89174b) {
                textView.setTextColor(C19391a.m36980a(getContext(), R.attr.colorPrimary));
            } else {
                textView.setTextColor(C19391a.m36980a(getContext(), R.attr.colorOnSurface));
            }
        }
        return view;
    }
}
