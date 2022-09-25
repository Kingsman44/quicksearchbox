package com.google.android.apps.search.googleapp.p10257g.p10258a;

import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46719bc;
import com.google.apps.tiktok.dataservice.C46723bg;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.common.util.concurrent.C60856cj;
import com.google.p337aa.p338a.C6610l;
import kotlinx.coroutines.p5574b.C71521by;
import kotlinx.coroutines.p5574b.C71548cy;
import kotlinx.coroutines.p5574b.C71571du;
import kotlinx.coroutines.p5574b.C71574dx;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.g.a.y */
/* compiled from: PG */
public final class C135408y {

    /* renamed from: a */
    public final C46723bg f368917a;

    /* renamed from: b */
    public final C71571du f368918b;

    /* renamed from: c */
    public final C71571du f368919c;

    /* renamed from: d */
    private final C46778cv f368920d;

    /* renamed from: e */
    private final C71548cy f368921e;

    /* renamed from: f */
    private final C71548cy f368922f;

    public C135408y(C46723bg bgVar, C46778cv cvVar) {
        C69664n.m101061g(bgVar, "dataSources");
        C69664n.m101061g(cvVar, "resultPropagator");
        this.f368917a = bgVar;
        this.f368920d = cvVar;
        C71548cy b = C71574dx.m104480b(true);
        this.f368921e = b;
        this.f368918b = C71521by.m104365c(b);
        C71548cy b2 = C71574dx.m104480b(C6610l.f19630i);
        this.f368922f = b2;
        this.f368919c = C71521by.m104365c(b2);
    }

    /* renamed from: a */
    public final C46689ag mo112310a() {
        return new C46719bc(this.f368917a, new C135406w(this), "DOODLE_IMAGE_DATA_SOURCE_KEY");
    }

    /* renamed from: b */
    public final void mo112311b(C6610l lVar) {
        C69664n.m101061g(lVar, "image");
        C19559g.m37304c();
        this.f368922f.mo62807f(lVar);
        this.f368920d.mo50787a(C60856cj.m92900i(this.f368922f.mo62784e()), "DOODLE_IMAGE_DATA_SOURCE_KEY");
    }

    /* renamed from: c */
    public final void mo112312c(boolean z) {
        if (((Boolean) this.f368921e.mo62784e()).booleanValue() != z) {
            C71548cy cyVar = this.f368921e;
            Boolean valueOf = Boolean.valueOf(z);
            cyVar.mo62807f(valueOf);
            this.f368920d.mo50787a(C60856cj.m92900i(valueOf), "ENABLE_DOODLE_ANIMATION_DATA_SOURCE_KEY");
        }
    }
}
