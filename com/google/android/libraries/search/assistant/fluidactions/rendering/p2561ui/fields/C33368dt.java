package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1614t.C19391a;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33184i;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2560e.C33233k;
import com.google.assistant.p3897e.p3902c.p3907c.C51145ia;
import com.google.assistant.p3897e.p3902c.p3907c.C51146ib;
import com.google.assistant.p3897e.p3921j.C52403ql;
import com.google.assistant.p3897e.p3921j.p3926e.C51950fc;
import com.google.common.p4526f.C59052c;
import java.util.Locale;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.dt */
/* compiled from: PG */
public final class C33368dt extends ArrayAdapter {

    /* renamed from: a */
    final /* synthetic */ TimeSelectionField f89413a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33368dt(TimeSelectionField timeSelectionField, Context context) {
        super(context, R.layout.fa_drop_down_list_item);
        this.f89413a = timeSelectionField;
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        C51146ib ibVar = (C51146ib) getItem(i);
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.fa_drop_down_list_item, (ViewGroup) null);
        }
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            textView.setText(ibVar.f133133b);
            if (i == this.f89413a.f89193d) {
                textView.setTextColor(C19391a.m36980a(getContext(), R.attr.colorPrimary));
            }
            return textView;
        }
        ((C59052c) ((C59052c) TimeSelectionField.f89190a.mo56225c()).mo56372aa(51148)).mo56386p("Convertview is not an instance of TextView");
        return view;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        CharSequence charSequence;
        int a;
        CharSequence charSequence2;
        C51146ib ibVar = (C51146ib) getItem(i);
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.fa_time_selection_field_current_list_item, (ViewGroup) null);
        }
        TimeSelectionField timeSelectionField = this.f89413a;
        if ((timeSelectionField.f89194e.f133132a & 2) == 0 || (a = C51145ia.m86043a(ibVar.f133138g)) == 0 || a != 2) {
            boolean z = view instanceof TextView;
            if (z) {
                TextView textView = (TextView) view;
                C33184i iVar = timeSelectionField.f89197h;
                if (iVar == null || iVar.f88751a != C51950fc.FORM_UI_THEME_IRIS_GLANCEABILITY) {
                    charSequence = (ibVar.f133132a & 16) != 0 ? ibVar.f133137f : ibVar.f133133b;
                } else if ((ibVar.f133132a & 2) != 0) {
                    C52403ql qlVar = ibVar.f133134c;
                    if (qlVar == null) {
                        qlVar = C52403ql.f137512f;
                    }
                    charSequence = C33233k.m61636b(qlVar, Locale.getDefault());
                } else {
                    charSequence = "--:--";
                }
                textView.setText(charSequence);
            }
            if (z) {
                if (this.f89413a.f89195f) {
                    ((TextView) view).setTextColor(C19391a.m36980a(getContext(), R.attr.colorPrimary));
                } else {
                    ((TextView) view).setTextColor(C19391a.m36980a(getContext(), R.attr.colorOnSurface));
                }
            }
            return view;
        }
        TextView textView2 = (TextView) view;
        C33184i iVar2 = timeSelectionField.f89197h;
        if (iVar2 == null || iVar2.f88751a != C51950fc.FORM_UI_THEME_IRIS_GLANCEABILITY) {
            C51146ib ibVar2 = this.f89413a.f89194e;
            charSequence2 = (ibVar2.f133132a & 16) != 0 ? ibVar2.f133137f : ibVar2.f133133b;
        } else {
            C52403ql qlVar2 = this.f89413a.f89194e.f133134c;
            if (qlVar2 == null) {
                qlVar2 = C52403ql.f137512f;
            }
            charSequence2 = C33233k.m61636b(qlVar2, Locale.getDefault());
        }
        textView2.setText(charSequence2);
        return view;
    }
}
