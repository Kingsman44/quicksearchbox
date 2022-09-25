package com.google.android.libraries.lens.view.p2151m;

import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.p059a.C0962j;
import androidx.browser.p059a.C0963k;
import androidx.browser.p059a.C0964l;
import androidx.browser.p059a.C0967o;
import com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a;
import com.google.common.p4552o.p4563i.C59898bg;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60870cx;
import com.google.net.p4726a.p4727a.C62722b;

/* renamed from: com.google.android.libraries.lens.view.m.f */
/* compiled from: PG */
final class C27279f implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ Bundle f74604a;

    /* renamed from: b */
    final /* synthetic */ Uri f74605b;

    /* renamed from: c */
    final /* synthetic */ C60870cx f74606c;

    /* renamed from: d */
    final /* synthetic */ C27280g f74607d;

    public C27279f(C27280g gVar, Bundle bundle, Uri uri, C60870cx cxVar) {
        this.f74607d = gVar;
        this.f74604a = bundle;
        this.f74605b = uri;
        this.f74606c = cxVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        this.f74607d.mo32809a(C62722b.UNKNOWN, (C59898bg) null);
        if (this.f74606c.isCancelled()) {
            this.f74607d.f74610c.mo19974a(C37194a.f98525bi.mo40805c(C62722b.CANCELLED));
        } else {
            this.f74607d.f74610c.mo19974a(C37194a.f98525bi.mo40805c(C62722b.UNAVAILABLE));
            throw new RuntimeException("Failed to launch CustomTabs intent", th);
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C0962j jVar = (C0962j) obj;
        C0963k kVar = new C0963k();
        C27280g gVar = this.f74607d;
        if (jVar == null) {
            gVar.f74612e = null;
        } else if (gVar.f74612e == null) {
            gVar.f74612e = jVar.mo3581b(new C27278e(gVar), (PendingIntent) null);
        }
        C0967o oVar = this.f74607d.f74612e;
        if (oVar != null) {
            kVar.mo3587f(oVar);
        }
        Context context = this.f74607d.f74608a;
        Bundle bundle = this.f74604a;
        kVar.mo3588g(false);
        kVar.f3068b.mo3569c(-16777216);
        C0964l a = kVar.mo3582a();
        a.f3074a.putExtra("com.android.browser.application_id", context.getPackageName());
        if (bundle != null) {
            a.f3074a.putExtra("com.android.browser.headers", bundle);
        }
        a.mo3590a(this.f74607d.f74608a, this.f74605b);
        this.f74607d.f74610c.mo19974a(C37194a.f98519bc.mo40805c(C62722b.OK));
    }
}
