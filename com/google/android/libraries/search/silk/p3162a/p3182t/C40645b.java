package com.google.android.libraries.search.silk.p3162a.p3182t;

import com.google.android.apps.search.webglide.p10699b.C142174e;
import com.google.android.libraries.silk.p3205a.p3210ad.C41713a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4294ad.C56636f;
import com.google.p4283bv.p4287b.p4288a.p4322b.C56847c;
import com.google.p4283bv.p4287b.p4288a.p4322b.C56848d;

/* renamed from: com.google.android.libraries.search.silk.a.t.b */
/* compiled from: PG */
public final class C40645b implements C41713a {

    /* renamed from: a */
    public static final C56848d f106658a;

    /* renamed from: b */
    public final C142174e f106659b;

    static {
        C56847c cVar = (C56847c) C56848d.f151669d.createBuilder();
        cVar.copyOnWrite();
        C56848d dVar = (C56848d) cVar.instance;
        dVar.f151671a |= 1;
        dVar.f151672b = "failed_to_open";
        cVar.copyOnWrite();
        C56848d dVar2 = (C56848d) cVar.instance;
        dVar2.f151671a |= 2;
        dVar2.f151673c = "Failed to open WebGlide.";
        f106658a = (C56848d) cVar.build();
    }

    public C40645b(C142174e eVar) {
        this.f106659b = eVar;
    }

    /* renamed from: a */
    public final C60870cx mo42577a(C56636f fVar) {
        C60870cx a = this.f106659b.f385687b.mo47087a();
        C40644a aVar = new C40644a(this, fVar);
        return C60922j.m93045h(a, C47810es.m84966f(aVar), C60826bg.f164896a);
    }
}
