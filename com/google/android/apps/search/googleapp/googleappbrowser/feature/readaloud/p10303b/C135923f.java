package com.google.android.apps.search.googleapp.googleappbrowser.feature.readaloud.p10303b;

import com.google.android.apps.search.googleapp.googleappbrowser.feature.readaloud.C135924c;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.readaloud.p10302a.C135908a;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.readaloud.p10302a.C135914g;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.readaloud.p10302a.C135915h;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.readaloud.p10302a.C135916i;
import com.google.android.apps.search.googleapp.googleappbrowser.p10269f.C135587c;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.web.p3353c.C43379x;
import com.google.apps.tiktok.cache.C46407v;
import com.google.apps.tiktok.dataservice.C46689ag;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.readaloud.b.f */
/* compiled from: PG */
public final class C135923f {

    /* renamed from: a */
    public final C46407v f370181a;

    /* renamed from: b */
    public final C135908a f370182b;

    /* renamed from: c */
    public final C135924c f370183c;

    /* renamed from: d */
    public final C135587c f370184d;

    /* renamed from: e */
    public final C21370a f370185e;

    /* renamed from: f */
    private final C43379x f370186f;

    public C135923f(C43379x xVar, C46407v vVar, C135908a aVar, C135924c cVar, C135587c cVar2, C21370a aVar2) {
        this.f370186f = xVar;
        this.f370181a = vVar;
        this.f370182b = aVar;
        this.f370183c = cVar;
        this.f370184d = cVar2;
        this.f370185e = aVar2;
    }

    /* renamed from: a */
    public static C135916i m220532a(C135914g gVar) {
        C135915h hVar = (C135915h) C135916i.f370168c.createBuilder();
        hVar.copyOnWrite();
        C135916i iVar = (C135916i) hVar.instance;
        iVar.f370171b = gVar.f370167f;
        iVar.f370170a |= 1;
        return (C135916i) hVar.build();
    }

    /* renamed from: b */
    public final C46689ag mo112623b() {
        return this.f370186f.mo46471b(new C135920c(this), new C135921d(this));
    }
}
