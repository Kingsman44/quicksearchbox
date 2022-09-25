package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10288e;

import com.google.android.apps.search.googleapp.p10357n.p10358a.C136697e;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3132a.C40305b;
import com.google.android.libraries.web.p3353c.C43377v;
import com.google.android.libraries.web.p3353c.C43379x;
import com.google.apps.tiktok.cache.C46407v;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46726bj;
import com.google.apps.tiktok.dataservice.C46728bl;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60888db;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.e.i */
/* compiled from: PG */
public final class C135766i {

    /* renamed from: a */
    public static final C59071e f369797a = C59071e.m91332i("com.google.android.apps.search.googleapp.googleappbrowser.feature.e.i");

    /* renamed from: b */
    public final C136697e f369798b;

    /* renamed from: c */
    public final C21370a f369799c;

    /* renamed from: d */
    public final C60888db f369800d;

    /* renamed from: e */
    public final C43377v f369801e;

    /* renamed from: f */
    public final Duration f369802f;

    /* renamed from: g */
    public final C40305b f369803g;

    /* renamed from: h */
    public final C46407v f369804h;

    /* renamed from: i */
    private final C43379x f369805i;

    /* renamed from: j */
    private final C46728bl f369806j;

    public C135766i(C136697e eVar, C43379x xVar, C43377v vVar, C21370a aVar, C40305b bVar, C46728bl blVar, C46407v vVar2, C60888db dbVar, long j) {
        this.f369798b = eVar;
        this.f369805i = xVar;
        this.f369801e = vVar;
        this.f369799c = aVar;
        this.f369803g = bVar;
        this.f369800d = dbVar;
        this.f369804h = vVar2;
        this.f369806j = blVar;
        this.f369802f = Duration.ofMillis(j);
    }

    /* renamed from: a */
    public static C135774q m220268a(String str, boolean z) {
        C135773p pVar = (C135773p) C135774q.f369833d.createBuilder();
        pVar.copyOnWrite();
        C135774q qVar = (C135774q) pVar.instance;
        str.getClass();
        qVar.f369835a |= 1;
        qVar.f369836b = str;
        pVar.copyOnWrite();
        C135774q qVar2 = (C135774q) pVar.instance;
        qVar2.f369835a |= 2;
        qVar2.f369837c = z;
        return (C135774q) pVar.build();
    }

    /* renamed from: b */
    public final C46689ag mo112529b(boolean z, boolean z2) {
        return new C46726bj(this.f369806j, "GoogleOnContentDedupingManagerKey", this.f369805i.mo46471b(new C135764g(this, z, z2), new C135765h(this, z, z2)));
    }
}
