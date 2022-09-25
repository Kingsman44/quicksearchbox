package com.google.android.apps.search.googleapp.search.suggest.p10464ui.viewbinders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.search.googleapp.search.suggest.C138010ab;
import com.google.android.apps.search.googleapp.search.suggest.C138012ad;
import com.google.android.apps.search.googleapp.search.suggest.C138015ag;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.dataservice.p3638c.C46756m;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.viewbinders.w */
/* compiled from: PG */
public final class C138670w extends C46756m {

    /* renamed from: a */
    private final boolean f377172a;

    /* renamed from: b */
    private final boolean f377173b;

    public C138670w(boolean z, boolean z2) {
        this.f377172a = z;
        this.f377173b = z2;
    }

    /* renamed from: a */
    public final View mo18113a(ViewGroup viewGroup) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(true != this.f377172a ? R.layout.googleapp_suggestion_header : R.layout.googleapp_pixel_suggestion_header, viewGroup, false);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo18114b(View view, Object obj) {
        int a;
        C138015ag agVar = (C138015ag) obj;
        C58838bb.m90868c(agVar.f375483c.size() == 0);
        TextView textView = (TextView) view.findViewById(R.id.googleapp_text);
        C138010ab abVar = agVar.f375484d;
        if (abVar == null) {
            abVar = C138010ab.f375456d;
        }
        textView.setPadding(textView.getPaddingStart(), textView.getPaddingTop(), textView.getPaddingEnd(), textView.getContext().getResources().getDimensionPixelSize(R.dimen.googleapp_suggestion_group_header_padding_bottom));
        int i = abVar.f375458a;
        if ((i & 1) != 0) {
            textView.setText(abVar.f375459b);
        } else if ((i & 2) != 0) {
            int i2 = abVar.f375460c;
            int a2 = C138012ad.m224325a(i2);
            if (a2 != 0 && a2 == 2) {
                textView.setText(R.string.ga_on_device_header_text);
                return;
            }
            int a3 = C138012ad.m224325a(i2);
            if (a3 != 0 && a3 == 3) {
                textView.setText(R.string.ga_app_strip_header_text);
                return;
            }
            int a4 = C138012ad.m224325a(i2);
            if (a4 != 0 && a4 == 4) {
                textView.setText(R.string.googleapp_incognito_app_strip_header);
            } else if (this.f377173b && (a = C138012ad.m224325a(i2)) != 0 && a == 7) {
                textView.setText(R.string.googleapp_personalized_suggestions_header);
            }
        }
    }
}
