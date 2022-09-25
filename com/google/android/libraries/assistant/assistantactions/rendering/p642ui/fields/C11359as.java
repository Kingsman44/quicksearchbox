package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.assistantactions.rendering.p641d.C11307e;
import com.google.assistant.p3897e.p3902c.p3907c.C50990ch;
import com.google.assistant.p3897e.p3902c.p3907c.C50991ci;
import com.google.assistant.p3897e.p3921j.C52460so;
import com.google.common.p4526f.C59052c;
import java.util.Locale;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.as */
/* compiled from: PG */
public final class C11359as extends ArrayAdapter {

    /* renamed from: a */
    final /* synthetic */ DurationSelectionField f37088a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11359as(DurationSelectionField durationSelectionField, Context context) {
        super(context, R.layout.list_item_view);
        this.f37088a = durationSelectionField;
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        C50991ci ciVar = (C50991ci) getItem(i);
        if (view == null) {
            view = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.list_item_view, (ViewGroup) null);
        }
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            textView.setText(ciVar.f132744b);
            DurationSelectionField durationSelectionField = this.f37088a;
            if (i == durationSelectionField.f36979c) {
                textView.setTextColor(C11307e.m26908a(durationSelectionField.f37159r, R.attr.fluid_actions_list_item_highlight_color));
            }
            return textView;
        }
        ((C59052c) ((C59052c) DurationSelectionField.f36977a.mo56225c()).mo56372aa(43251)).mo56386p("Convertview is not an instance of TextView");
        return view;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        CharSequence charSequence;
        int a;
        CharSequence charSequence2;
        C50991ci ciVar = (C50991ci) getItem(i);
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.duration_selection_field_current_list_item, (ViewGroup) null);
        }
        DurationSelectionField durationSelectionField = this.f37088a;
        C50991ci ciVar2 = durationSelectionField.f36981e;
        int i2 = ciVar2.f132743a;
        if ((i2 & 32) == 0 || (a = C50990ch.m86003a(ciVar.f132747e)) == 0 || a != 2) {
            boolean z = view instanceof TextView;
            if (z) {
                TextView textView = (TextView) view;
                if (durationSelectionField.f37160s != 2) {
                    charSequence = (ciVar.f132743a & 16) != 0 ? ciVar.f132748f : ciVar.f132744b;
                } else if ((ciVar.f132743a & 32) != 0) {
                    C52460so soVar = ciVar.f132749g;
                    if (soVar == null) {
                        soVar = C52460so.f137714d;
                    }
                    charSequence = C11307e.m26912e(soVar, Locale.getDefault(), getContext().getResources());
                } else {
                    Locale.getDefault();
                    charSequence = TextUtils.expandTemplate(C11307e.m26915h(getContext().getResources(), 3), new CharSequence[]{"00", "00", "00"});
                }
                textView.setText(charSequence);
            }
            if (z) {
                DurationSelectionField durationSelectionField2 = this.f37088a;
                if (durationSelectionField2.f37151j) {
                    ((TextView) view).setTextColor(C11307e.m26908a(durationSelectionField2.f37159r, R.attr.fluid_actions_highlight_field_color));
                } else {
                    ((TextView) view).setTextColor(C11307e.m26908a(durationSelectionField2.f37159r, R.attr.fluid_actions_nonhighlight_field_color));
                }
            }
            return view;
        }
        TextView textView2 = (TextView) view;
        if (durationSelectionField.f37160s == 2) {
            C52460so soVar2 = ciVar2.f132749g;
            if (soVar2 == null) {
                soVar2 = C52460so.f137714d;
            }
            charSequence2 = C11307e.m26912e(soVar2, Locale.getDefault(), getContext().getResources());
        } else if ((i2 & 16) != 0) {
            charSequence2 = ciVar2.f132748f;
        } else {
            charSequence2 = ciVar2.f132744b;
        }
        textView2.setText(charSequence2);
        return view;
    }
}
