package com.google.android.apps.gsa.staticplugins.p7635c.p7637b;

import android.net.Uri;
import android.view.MotionEvent;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6519al.p6729e.C85461a;
import com.google.android.apps.gsa.search.core.service.p6856h.C86744b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.c.b.d */
/* compiled from: PG */
public final class C97501d implements C85461a, C86744b {

    /* renamed from: a */
    public final C97498a f272304a;

    /* renamed from: b */
    private final C22871g f272305b;

    public C97501d(C97498a aVar, C22871g gVar) {
        this.f272304a = aVar;
        this.f272305b = gVar;
    }

    /* renamed from: a */
    public final C60870cx mo78987a(MotionEvent motionEvent) {
        return this.f272305b.mo28202b("addTouchEvent", new C97499b(this, motionEvent));
    }

    /* renamed from: c */
    public final C60870cx mo78988c(Uri uri) {
        return this.f272305b.mo28202b("getUpdatedUriWithAdSignals", new C97500c(this, uri));
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        this.f272304a.mo17602gS(fVar);
    }

    /* renamed from: hY */
    public final void mo79108hY() {
    }

    /* renamed from: hZ */
    public final C118575h mo80348hZ() {
        return this.f272304a.f234292d;
    }

    /* renamed from: ia */
    public final String mo80349ia() {
        return this.f272304a.f234293e;
    }

    /* renamed from: ib */
    public final void mo80350ib() {
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }
}
