package com.google.android.libraries.lens.ondevice.p2024d;

import android.graphics.Bitmap;
import com.google.android.libraries.lens.ondevice.C24292d;
import com.google.android.libraries.lens.ondevice.p2034k.C24754x;
import com.google.android.libraries.lens.ondevice.p2034k.C24756z;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68227m;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68249j;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.lens.ondevice.d.x */
/* compiled from: PG */
final class C24430x implements C68249j {

    /* renamed from: a */
    public final C68283d f66894a;

    /* renamed from: b */
    private final C24430x f66895b = this;

    /* renamed from: c */
    private final C69464a f66896c;

    /* renamed from: d */
    private final C69464a f66897d;

    /* renamed from: e */
    private final C69464a f66898e;

    /* renamed from: f */
    private final C69464a f66899f;

    /* renamed from: g */
    private final C69464a f66900g;

    /* renamed from: h */
    private final C68283d f66901h;

    /* renamed from: i */
    private final C69464a f66902i;

    /* renamed from: j */
    private final C68283d f66903j;

    /* renamed from: k */
    private final C68283d f66904k;

    public C24430x(C24292d dVar, C24754x xVar, Bitmap bitmap) {
        C24429w wVar = new C24429w(dVar);
        this.f66896c = wVar;
        C69464a c = C68219e.m98519c(wVar);
        this.f66897d = c;
        C68220f a = C68221g.m98521a(this);
        this.f66898e = a;
        C69464a c2 = C68219e.m98519c(new C24338br(a, C68227m.f184586a));
        this.f66899f = c2;
        C68220f a2 = C68221g.m98521a(bitmap);
        this.f66900g = a2;
        C68283d e = C68236af.m98550e(a2);
        this.f66901h = e;
        C68220f a3 = C68221g.m98521a(xVar);
        this.f66902i = a3;
        C68283d e2 = C68236af.m98550e(a3);
        this.f66903j = e2;
        C24756z zVar = new C24756z(c, c2, e, e2);
        this.f66904k = zVar;
        this.f66894a = C68236af.m98548c(zVar, this);
    }

    /* renamed from: a */
    public final void mo29865a(boolean z) {
        C68236af.m98551f(this.f66904k, z);
        C68236af.m98551f(this.f66903j, z);
        C68236af.m98551f(this.f66901h, z);
    }
}
