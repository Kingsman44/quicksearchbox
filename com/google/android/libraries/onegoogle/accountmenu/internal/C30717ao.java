package com.google.android.libraries.onegoogle.accountmenu.internal;

import android.view.View;
import androidx.core.p098j.C2043bi;
import androidx.core.widget.C2129p;
import androidx.core.widget.NestedScrollView;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.internal.ao */
/* compiled from: PG */
public final /* synthetic */ class C30717ao implements C2129p {

    /* renamed from: a */
    public final /* synthetic */ C30718ap f82928a;

    public /* synthetic */ C30717ao(C30718ap apVar) {
        this.f82928a = apVar;
    }

    /* renamed from: a */
    public final void mo4777a(NestedScrollView nestedScrollView, int i, int i2, int i3) {
        int i4;
        C30718ap apVar = this.f82928a;
        apVar.mo36417g(i2);
        boolean z = ((float) i2) >= apVar.mo36412b();
        View c = apVar.mo36413c();
        if (z) {
            i4 = apVar.f82932d;
        } else {
            i4 = apVar.getResources().getColor(R.color.google_transparent);
        }
        c.setBackgroundColor(i4);
        C2043bi.m5548ab(c, z ? apVar.mo36412b() : 0.0f);
    }
}
