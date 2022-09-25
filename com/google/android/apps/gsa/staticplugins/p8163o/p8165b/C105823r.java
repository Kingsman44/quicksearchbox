package com.google.android.apps.gsa.staticplugins.p8163o.p8165b;

import android.os.Handler;
import androidx.media3.common.C2590aq;
import androidx.media3.common.C2651bm;
import androidx.media3.exoplayer.p145h.C3034aq;
import androidx.media3.exoplayer.p145h.C3036as;
import androidx.media3.exoplayer.p145h.C3038au;
import androidx.media3.exoplayer.p145h.C3115j;
import androidx.media3.exoplayer.p145h.C3128w;
import androidx.media3.exoplayer.p151k.C3241g;
import androidx.media3.p132b.C2495an;
import com.google.android.apps.gsa.search.core.p6519al.p6694dd.C85346o;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.o.b.r */
/* compiled from: PG */
public final class C105823r extends C3115j {

    /* renamed from: a */
    public static final C59071e f295207a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.o.b.r");

    /* renamed from: b */
    public final C60870cx f295208b;

    /* renamed from: c */
    public final C3128w f295209c = new C3128w(new C3038au[0]);

    /* renamed from: d */
    public final ArrayList f295210d = new ArrayList();

    /* renamed from: e */
    public final C2590aq f295211e;

    /* renamed from: f */
    public final int f295212f;

    /* renamed from: g */
    public final C105808c f295213g;

    /* renamed from: h */
    public boolean f295214h = false;

    /* renamed from: i */
    public C58833ax f295215i;

    /* renamed from: j */
    public C58833ax f295216j;

    /* renamed from: k */
    public final C105824s f295217k;

    public C105823r(C60870cx cxVar, C2590aq aqVar, int i, C105824s sVar) {
        C58836b bVar = C58836b.f156633a;
        this.f295215i = bVar;
        this.f295216j = bVar;
        this.f295208b = cxVar;
        this.f295211e = aqVar;
        this.f295212f = i;
        this.f295217k = sVar;
        for (int i2 = 0; i2 < i; i2++) {
            C105830y yVar = new C105830y(cxVar, aqVar, i2, sVar);
            this.f295209c.mo7111E(yVar);
            this.f295210d.add(yVar);
        }
        C105808c cVar = new C105808c(cxVar);
        this.f295213g = cVar;
        cVar.mo95075d(new C105815j(this));
    }

    /* renamed from: D */
    public final boolean mo6941D() {
        return false;
    }

    /* renamed from: a */
    public final C2590aq mo6745a() {
        return this.f295211e;
    }

    /* renamed from: c */
    public final void mo6747c() {
        if (!this.f295216j.mo56113h()) {
            super.mo6747c();
            return;
        }
        throw ((IOException) this.f295216j.mo56107c());
    }

    /* renamed from: f */
    public final void mo6750f(C2495an anVar) {
        super.mo6750f(new C105818m(this, C58833ax.m90833j(anVar)));
        this.f295215i = C58833ax.m90834k(new Handler());
        C60856cj.m92911t(C60922j.m93044g(C60922j.m93045h(C60838bs.m92859i(this.f295208b), C105813h.f295196a, C60826bg.f164896a), C105814i.f295197a, C60826bg.f164896a), new C105820o(this), C60826bg.f164896a);
        this.f295213g.mo95074c();
    }

    /* renamed from: h */
    public final void mo6752h(C3034aq aqVar) {
        this.f295209c.mo6752h(aqVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo6753i() {
        super.mo6753i();
        this.f295213g.mo95072a();
        this.f295214h = true;
        C85346o oVar = (C85346o) C60856cj.m92910s(this.f295208b);
        C60856cj.m92911t(oVar.f231139b.mo78876k(oVar.f231138a), new C105821p(), C60826bg.f164896a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final /* synthetic */ void mo6964j(Object obj, C3038au auVar, C2651bm bmVar) {
        Void voidR = (Void) obj;
        mo6952y(bmVar);
    }

    /* renamed from: m */
    public final C3034aq mo6757m(C3036as asVar, C3241g gVar, long j) {
        return this.f295209c.mo6757m(asVar, gVar, j);
    }

    /* renamed from: o */
    public final C2651bm mo6942o() {
        return this.f295209c.mo6942o();
    }
}
