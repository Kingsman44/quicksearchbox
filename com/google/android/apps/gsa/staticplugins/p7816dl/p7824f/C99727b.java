package com.google.android.apps.gsa.staticplugins.p7816dl.p7824f;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.shared.p7066m.C90138q;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.staticplugins.p7816dl.p7821e.p7822a.C99719a;
import com.google.android.libraries.gsa.p1859d.p1860a.C22733d;
import com.google.android.libraries.gsa.p1859d.p1860a.C22734e;
import com.google.android.libraries.gsa.p1859d.p1860a.C22735f;
import com.google.android.libraries.gsa.p1859d.p1860a.C22736g;
import com.google.android.libraries.gsa.p1859d.p1860a.C22737h;
import com.google.android.libraries.gsa.p1859d.p1860a.C22744o;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.dl.f.b */
/* compiled from: PG */
public final class C99727b extends C86734a implements C99719a {

    /* renamed from: a */
    private final C22744o f279067a;

    /* renamed from: b */
    private final C91189au f279068b;

    /* renamed from: c */
    private final C21370a f279069c;

    /* renamed from: f */
    private final C86124t f279070f;

    protected C99727b(C22744o oVar, C91189au auVar, C21370a aVar, C86124t tVar) {
        super(C118575h.WORKER_PARTNER_TAB, "pomo");
        this.f279067a = oVar;
        this.f279068b = auVar;
        this.f279069c = aVar;
        this.f279070f = tVar;
    }

    /* renamed from: a */
    public final C60870cx mo91574a(String str) {
        String format = String.format("https://www.gstatic.com/android_search/partnertab/%s/logo.png", new Object[]{str});
        long a = this.f279070f.mo79743a(C90138q.f251843q);
        return C60922j.m93044g(this.f279068b.mo85433w(Uri.parse(format), String.valueOf((int) a)), C99726a.f279066a, C60826bg.f164896a);
    }

    /* renamed from: b */
    public final C60870cx mo91575b(String str, boolean z, boolean z2) {
        C22744o oVar = this.f279067a;
        oVar.mo27894f(str);
        synchronized (oVar.f62573a) {
            oVar.f62574b = z;
        }
        oVar.mo27893e(z2);
        SettableFuture settableFuture = new SettableFuture();
        oVar.mo27889a(new C22733d(oVar, settableFuture));
        return settableFuture;
    }

    /* renamed from: c */
    public final C60870cx mo91576c(String str, boolean z, Bundle bundle, Bundle bundle2) {
        C22744o oVar = this.f279067a;
        oVar.mo27894f(str);
        oVar.mo27893e(z);
        SettableFuture settableFuture = new SettableFuture();
        oVar.mo27889a(new C22734e(oVar, settableFuture, bundle, bundle2));
        SettableFuture settableFuture2 = new SettableFuture();
        C60856cj.m92911t(settableFuture, new C22735f(settableFuture2), C60826bg.f164896a);
        return settableFuture2;
    }

    /* renamed from: d */
    public final void mo91577d(String str, boolean z) {
        C22744o oVar = this.f279067a;
        oVar.mo27894f(str);
        oVar.mo27893e(true);
        long b = this.f279069c.mo26870b();
        Log.w("PomoConnector", "notifyPartnerContentsVisibilityChanged: " + z + " timestamp: " + b);
        oVar.mo27890b(new C22736g(new SettableFuture(), z, b));
    }

    /* renamed from: e */
    public final void mo91578e(String str, int i, boolean z) {
        C22744o oVar = this.f279067a;
        oVar.mo27894f(str);
        oVar.mo27893e(true);
        long b = this.f279069c.mo26870b();
        Log.w("PomoConnector", "notifySingleContentVisibilityChanged, index: " + i + " isVisible: " + z + " timestamp: " + b);
        oVar.mo27890b(new C22737h(new SettableFuture(), i, z, b));
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }
}
