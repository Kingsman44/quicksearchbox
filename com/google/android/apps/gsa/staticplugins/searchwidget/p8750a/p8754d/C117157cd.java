package com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8754d;

import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23123s;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.a.d.cd */
/* compiled from: PG */
public final /* synthetic */ class C117157cd implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C117161ch f325230a;

    public /* synthetic */ C117157cd(C117161ch chVar) {
        this.f325230a = chVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C117161ch chVar = this.f325230a;
        int intValue = ((Integer) obj).intValue();
        if (intValue == 0) {
            chVar.f325234a.setImageResource(R.drawable.search_widget_bg_2dp);
            chVar.f325236c.setBackgroundResource(R.drawable.search_widget_shadow_2dp);
            chVar.f325235b.setImageResource(R.drawable.gradient_protection_2dp);
        } else if (intValue == 1) {
            chVar.f325234a.setImageResource(R.drawable.search_widget_bg_8dp);
            chVar.f325236c.setBackgroundResource(R.drawable.search_widget_shadow_8dp);
            chVar.f325235b.setImageResource(R.drawable.gradient_protection_8dp);
        } else if (intValue == 2) {
            chVar.f325234a.setImageResource(R.drawable.search_widget_bg_24dp);
            chVar.f325236c.setBackgroundResource(R.drawable.search_widget_shadow_24dp);
            chVar.f325235b.setImageResource(R.drawable.gradient_protection_24dp);
        }
    }
}
