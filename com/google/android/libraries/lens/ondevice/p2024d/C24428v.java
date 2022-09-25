package com.google.android.libraries.lens.ondevice.p2024d;

import android.graphics.Bitmap;
import com.google.android.libraries.lens.ondevice.C24292d;
import com.google.android.libraries.lens.ondevice.p2034k.C24668ey;
import com.google.android.libraries.lens.ondevice.p2034k.C24671fa;
import com.google.android.libraries.lens.ondevice.p2034k.C24682fl;
import com.google.android.libraries.lens.ondevice.p2034k.C24684fn;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68227m;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68249j;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.lens.ondevice.d.v */
/* compiled from: PG */
final class C24428v implements C68249j {

    /* renamed from: a */
    public final C68283d f66877a;

    /* renamed from: b */
    private final C24428v f66878b = this;

    /* renamed from: c */
    private final C69464a f66879c;

    /* renamed from: d */
    private final C69464a f66880d;

    /* renamed from: e */
    private final C69464a f66881e;

    /* renamed from: f */
    private final C69464a f66882f;

    /* renamed from: g */
    private final C69464a f66883g;

    /* renamed from: h */
    private final C68283d f66884h;

    /* renamed from: i */
    private final C69464a f66885i;

    /* renamed from: j */
    private final C68283d f66886j;

    /* renamed from: k */
    private final C68283d f66887k;

    /* renamed from: l */
    private final C69464a f66888l;

    /* renamed from: m */
    private final C68283d f66889m;

    /* renamed from: n */
    private final C68283d f66890n;

    /* renamed from: o */
    private final C68283d f66891o;

    /* renamed from: p */
    private final C68283d f66892p;

    public C24428v(C24292d dVar, C24668ey eyVar, C24682fl flVar, Bitmap bitmap) {
        C24427u uVar = new C24427u(dVar);
        this.f66879c = uVar;
        C69464a c = C68219e.m98519c(uVar);
        this.f66880d = c;
        C68220f a = C68221g.m98521a(this);
        this.f66881e = a;
        C69464a c2 = C68219e.m98519c(new C24412f(a, C68227m.f184586a));
        this.f66882f = c2;
        C68220f a2 = C68221g.m98521a(bitmap);
        this.f66883g = a2;
        C68283d e = C68236af.m98550e(a2);
        this.f66884h = e;
        C68220f a3 = C68221g.m98521a(flVar);
        this.f66885i = a3;
        C68283d e2 = C68236af.m98550e(a3);
        this.f66886j = e2;
        C24684fn fnVar = new C24684fn(c, c2, e, e2);
        this.f66887k = fnVar;
        C68220f a4 = C68221g.m98521a(eyVar);
        this.f66888l = a4;
        C68283d e3 = C68236af.m98550e(a4);
        this.f66889m = e3;
        C24671fa faVar = new C24671fa(c, c2, e, e3);
        this.f66890n = faVar;
        C24414h hVar = new C24414h(c, c2, fnVar, faVar);
        this.f66891o = hVar;
        C24415i iVar = new C24415i(c, c2, fnVar, hVar);
        this.f66892p = iVar;
        this.f66877a = C68236af.m98548c(iVar, this);
    }

    /* renamed from: a */
    public final void mo29865a(boolean z) {
        C68236af.m98551f(this.f66892p, z);
        C68236af.m98551f(this.f66891o, z);
        C68236af.m98551f(this.f66890n, z);
        C68236af.m98551f(this.f66889m, z);
        C68236af.m98551f(this.f66887k, z);
        C68236af.m98551f(this.f66886j, z);
        C68236af.m98551f(this.f66884h, z);
    }
}
