package com.google.android.apps.search.googleapp.p10257g.p10258a;

import com.google.apps.tiktok.concurrent.C46463o;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46723bg;
import com.google.common.util.concurrent.C60817ay;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69613f;
import p5462h.C69747m;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.g.a.r */
/* compiled from: PG */
public final class C135401r implements C46689ag {

    /* renamed from: a */
    public final C46723bg f368895a;

    /* renamed from: b */
    public final C135388e f368896b;

    /* renamed from: c */
    private final C71422aw f368897c;

    /* renamed from: d */
    private final C69613f f368898d = new C69747m(new C135398o(this));

    public C135401r(C46723bg bgVar, C71422aw awVar, C135388e eVar) {
        C69664n.m101061g(bgVar, "dataSources");
        C69664n.m101061g(awVar, "backgroundScope");
        this.f368895a = bgVar;
        this.f368897c = awVar;
        this.f368896b = eVar;
    }

    /* renamed from: a */
    public final C46463o mo18086a() {
        return new C46463o(new C60817ay(C71663i.m104692e(this.f368897c, (C71424ay) null, new C135400q(this, (C69577g) null), 3)));
    }

    /* renamed from: b */
    public final C60870cx mo18087b() {
        return C71663i.m104692e(this.f368897c, (C71424ay) null, new C135399p(this, (C69577g) null), 3);
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo18088c() {
        return "DOODLE_KEY";
    }

    /* renamed from: d */
    public final C46689ag mo112308d() {
        Object a = this.f368898d.mo5768a();
        C69664n.m101060f(a, "<get-emptyDataSource>(...)");
        return (C46689ag) a;
    }
}
