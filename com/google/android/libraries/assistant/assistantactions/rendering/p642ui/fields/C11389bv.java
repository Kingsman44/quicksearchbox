package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.assistantactions.rendering.p641d.C11307e;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.bv */
/* compiled from: PG */
public final class C11389bv extends ArrayAdapter {

    /* renamed from: a */
    final /* synthetic */ RecurrenceSelectionField f37126a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11389bv(RecurrenceSelectionField recurrenceSelectionField, Context context) {
        super(context, R.layout.list_item_view);
        this.f37126a = recurrenceSelectionField;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        String str = (String) getItem(i);
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.recurrence_selection_field_current_list_item, (ViewGroup) null);
        }
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            textView.setText(str);
            RecurrenceSelectionField recurrenceSelectionField = this.f37126a;
            if (recurrenceSelectionField.f37151j) {
                textView.setTextColor(C11307e.m26908a(recurrenceSelectionField.f37159r, R.attr.fluid_actions_highlight_field_color));
            } else {
                textView.setTextColor(C11307e.m26908a(recurrenceSelectionField.f37159r, R.attr.fluid_actions_nonhighlight_field_color));
            }
        }
        return view;
    }
}
