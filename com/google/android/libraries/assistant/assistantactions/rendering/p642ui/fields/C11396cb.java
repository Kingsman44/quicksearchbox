package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.assistantactions.rendering.p641d.C11307e;
import com.google.assistant.p3897e.p3902c.p3907c.C51145ia;
import com.google.assistant.p3897e.p3902c.p3907c.C51146ib;
import com.google.assistant.p3897e.p3921j.C52403ql;
import com.google.common.p4526f.C59052c;
import java.util.Locale;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.cb */
/* compiled from: PG */
public final class C11396cb extends ArrayAdapter {

    /* renamed from: a */
    final /* synthetic */ TimeSelectionField f37135a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11396cb(TimeSelectionField timeSelectionField, Context context) {
        super(context, R.layout.list_item_view);
        this.f37135a = timeSelectionField;
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        C51146ib ibVar = (C51146ib) getItem(i);
        if (view == null) {
            view = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.list_item_view, (ViewGroup) null);
        }
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            textView.setText(ibVar.f133133b);
            TimeSelectionField timeSelectionField = this.f37135a;
            if (i == timeSelectionField.f37043c) {
                textView.setTextColor(C11307e.m26908a(timeSelectionField.f37159r, R.attr.fluid_actions_list_item_highlight_color));
            }
            return textView;
        }
        ((C59052c) ((C59052c) TimeSelectionField.f37041a.mo56225c()).mo56372aa(43285)).mo56386p("Convertview is not an instance of TextView");
        return view;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        CharSequence charSequence;
        int a;
        CharSequence charSequence2;
        C51146ib ibVar = (C51146ib) getItem(i);
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.time_selection_field_current_list_item, (ViewGroup) null);
        }
        TimeSelectionField timeSelectionField = this.f37135a;
        C51146ib ibVar2 = timeSelectionField.f37045e;
        int i2 = ibVar2.f133132a;
        if ((i2 & 2) == 0 || (a = C51145ia.m86043a(ibVar.f133138g)) == 0 || a != 2) {
            boolean z = view instanceof TextView;
            if (z) {
                TextView textView = (TextView) view;
                if (timeSelectionField.f37160s != 2) {
                    charSequence = (ibVar.f133132a & 16) != 0 ? ibVar.f133137f : ibVar.f133133b;
                } else if ((ibVar.f133132a & 2) != 0) {
                    C52403ql qlVar = ibVar.f133134c;
                    if (qlVar == null) {
                        qlVar = C52403ql.f137512f;
                    }
                    charSequence = C11307e.m26913f(qlVar, Locale.getDefault());
                } else {
                    charSequence = "--:--";
                }
                textView.setText(charSequence);
            }
            if (z) {
                TimeSelectionField timeSelectionField2 = this.f37135a;
                if (timeSelectionField2.f37151j) {
                    ((TextView) view).setTextColor(C11307e.m26908a(timeSelectionField2.f37159r, R.attr.fluid_actions_highlight_field_color));
                } else {
                    ((TextView) view).setTextColor(C11307e.m26908a(timeSelectionField2.f37159r, R.attr.fluid_actions_nonhighlight_field_color));
                }
            }
            return view;
        }
        TextView textView2 = (TextView) view;
        if (timeSelectionField.f37160s == 2) {
            C52403ql qlVar2 = ibVar2.f133134c;
            if (qlVar2 == null) {
                qlVar2 = C52403ql.f137512f;
            }
            charSequence2 = C11307e.m26913f(qlVar2, Locale.getDefault());
        } else if ((i2 & 16) != 0) {
            charSequence2 = ibVar2.f133137f;
        } else {
            charSequence2 = ibVar2.f133133b;
        }
        textView2.setText(charSequence2);
        return view;
    }
}
