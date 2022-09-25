package com.google.android.libraries.componentview.p1699f;

import android.text.TextUtils;
import com.google.android.libraries.componentview.components.base.p1687a.C19983f;
import com.google.android.libraries.componentview.p1675a.p1677b.C19742a;
import com.google.android.libraries.componentview.services.application.C20578be;
import com.google.android.libraries.componentview.services.application.C20614e;
import com.google.common.util.concurrent.C60845bz;
import com.google.p4271bq.C56429h;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.libraries.componentview.f.k */
/* compiled from: PG */
final class C20523k implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C56429h f57652a;

    /* renamed from: b */
    final /* synthetic */ C19983f f57653b;

    /* renamed from: c */
    final /* synthetic */ C20524l f57654c;

    public C20523k(C20524l lVar, C56429h hVar, C19983f fVar) {
        this.f57654c = lVar;
        this.f57652a = hVar;
        this.f57653b = fVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if (!(th instanceof CancellationException)) {
            C20614e eVar = new C20614e();
            eVar.mo25535e(C19742a.REDIRECT_FETCH_FAILURE);
            eVar.f57822b = "Unable to handle action: ".concat(String.valueOf(this.f57653b.toString()));
            C56429h hVar = this.f57652a;
            eVar.f57823c = hVar != null ? hVar.f150556h : null;
            eVar.f57821a = th;
            C20520h.m38498c("NavigationHelper", eVar.mo25531a(), this.f57654c.f57656b, new Object[0]);
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C20578be beVar = (C20578be) obj;
        String str = null;
        if (beVar == null || !beVar.f57759c) {
            C20520h.m38497b(6, "NavigationHelper", (Throwable) null, "Ad fetch failed with result null or failure", new Object[0]);
            return;
        }
        int i = beVar.f57760d;
        if ((i == 301 || i == 302) && !TextUtils.isEmpty(beVar.f57762f)) {
            this.f57654c.mo25439a(beVar.f57762f, this.f57653b, (C56429h) null);
            return;
        }
        C20614e eVar = new C20614e();
        eVar.mo25535e(C19742a.REDIRECT_FETCH_FAILURE);
        int i2 = beVar.f57760d;
        eVar.f57822b = "Ad fetch failed with status as " + i2;
        C56429h hVar = this.f57652a;
        if (hVar != null) {
            str = hVar.f150556h;
        }
        eVar.f57823c = str;
        C20520h.m38498c("NavigationHelper", eVar.mo25531a(), this.f57654c.f57656b, new Object[0]);
    }
}
