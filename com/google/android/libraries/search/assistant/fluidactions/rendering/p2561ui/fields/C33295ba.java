package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1614t.C19391a;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33184i;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2560e.C33233k;
import com.google.assistant.p3897e.p3902c.p3907c.C50990ch;
import com.google.assistant.p3897e.p3902c.p3907c.C50991ci;
import com.google.assistant.p3897e.p3921j.C52460so;
import com.google.common.p4526f.C59052c;
import java.util.Locale;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.ba */
/* compiled from: PG */
public final class C33295ba extends ArrayAdapter {

    /* renamed from: a */
    final /* synthetic */ DurationSelectionField f89285a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33295ba(DurationSelectionField durationSelectionField, Context context) {
        super(context, R.layout.fa_drop_down_list_item);
        this.f89285a = durationSelectionField;
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        C50991ci ciVar = (C50991ci) getItem(i);
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.fa_drop_down_list_item, (ViewGroup) null);
        }
        if (ciVar == null) {
            return view;
        }
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            textView.setText(ciVar.f132744b);
            if (i == this.f89285a.f89079c) {
                textView.setTextColor(C19391a.m36980a(getContext(), R.attr.colorPrimary));
            }
            return textView;
        }
        ((C59052c) ((C59052c) DurationSelectionField.f89076a.mo56225c()).mo56372aa(51062)).mo56386p("ConvertView is not an instance of TextView");
        return view;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        CharSequence charSequence;
        int a;
        CharSequence charSequence2;
        C50991ci ciVar = (C50991ci) getItem(i);
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.fa_duration_selection_field_current_list_item, (ViewGroup) null);
        }
        if (ciVar == null) {
            return view;
        }
        boolean z = view instanceof TextView;
        if (z) {
            DurationSelectionField durationSelectionField = this.f89285a;
            C50991ci ciVar2 = durationSelectionField.f89081e;
            int i2 = ciVar2.f132743a;
            if (!((i2 & 32) == 0 || (a = C50990ch.m86003a(ciVar.f132747e)) == 0 || a != 2)) {
                TextView textView = (TextView) view;
                C33184i iVar = durationSelectionField.f89084h;
                if (iVar != null && iVar.f88753c) {
                    C52460so soVar = ciVar2.f132749g;
                    if (soVar == null) {
                        soVar = C52460so.f137714d;
                    }
                    charSequence2 = C33233k.m61635a(soVar, Locale.getDefault(), getContext().getResources());
                } else if ((i2 & 16) != 0) {
                    charSequence2 = ciVar2.f132748f;
                } else {
                    charSequence2 = ciVar2.f132744b;
                }
                textView.setText(charSequence2);
                return view;
            }
        }
        if (z) {
            TextView textView2 = (TextView) view;
            DurationSelectionField durationSelectionField2 = this.f89285a;
            C33184i iVar2 = durationSelectionField2.f89084h;
            if (iVar2 == null || !iVar2.f88753c) {
                charSequence = (ciVar.f132743a & 16) != 0 ? ciVar.f132748f : ciVar.f132744b;
            } else if ((ciVar.f132743a & 32) != 0) {
                C52460so soVar2 = ciVar.f132749g;
                if (soVar2 == null) {
                    soVar2 = C52460so.f137714d;
                }
                charSequence = C33233k.m61635a(soVar2, Locale.getDefault(), getContext().getResources());
            } else {
                charSequence = TextUtils.expandTemplate(C33233k.m61639e(durationSelectionField2.getContext().getResources(), 3), new CharSequence[]{"00", "00", "00"});
            }
            textView2.setText(charSequence);
        }
        if (z) {
            if (this.f89285a.f89082f) {
                ((TextView) view).setTextColor(C19391a.m36980a(getContext(), R.attr.colorPrimary));
            } else {
                ((TextView) view).setTextColor(C19391a.m36980a(getContext(), R.attr.colorOnSurface));
            }
        }
        return view;
    }
}
