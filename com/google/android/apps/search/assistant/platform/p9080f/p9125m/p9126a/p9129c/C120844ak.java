package com.google.android.apps.search.assistant.platform.p9080f.p9125m.p9126a.p9129c;

import com.google.android.apps.search.assistant.platform.p9005b.p9036b.C119935d;
import com.google.android.apps.search.assistant.platform.p9080f.p9109g.C120695j;
import com.google.android.apps.search.assistant.platform.p9080f.p9111h.C120704a;
import com.google.android.libraries.search.assistant.p2570h.p2571a.p2576c.p2577a.C33447g;
import com.google.android.libraries.search.p2904c.p2990z.p2991a.C38289e;
import com.google.android.libraries.search.p2992d.C38296g;
import com.google.android.libraries.search.p3055n.C39275ay;
import com.google.android.libraries.search.p3055n.C39276az;
import com.google.android.libraries.search.p3055n.C39651ce;
import com.google.android.libraries.search.p3055n.C39652cf;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.grpc.C47686k;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import java.util.concurrent.Executor;
import p5488io.grpc.p5533i.C70862aj;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.search.assistant.platform.f.m.a.c.ak */
/* compiled from: PG */
public final class C120844ak {

    /* renamed from: a */
    public static final C59071e f336019a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.f.m.a.c.ak");

    /* renamed from: b */
    public final C120861ba f336020b;

    /* renamed from: c */
    public final C60870cx f336021c;

    /* renamed from: d */
    public final C119935d f336022d;

    /* renamed from: e */
    public final C60870cx f336023e;

    /* renamed from: f */
    public final C120704a f336024f;

    /* renamed from: g */
    public final C120695j f336025g;

    /* renamed from: h */
    public final Executor f336026h;

    /* renamed from: i */
    public final C120862bb f336027i;

    /* renamed from: j */
    public final C120851ar f336028j;

    /* renamed from: k */
    public final C70862aj f336029k;

    /* renamed from: l */
    public final C38296g f336030l;

    /* renamed from: m */
    public final boolean f336031m;

    public C120844ak(C60870cx cxVar, C119935d dVar, C60870cx cxVar2, C120704a aVar, C120695j jVar, Executor executor, C39651ce ceVar, C120862bb bbVar, C33447g gVar, C38289e eVar, C120861ba baVar, C38296g gVar2, boolean z) {
        C39651ce ceVar2 = ceVar;
        C120861ba baVar2 = baVar;
        C60870cx cxVar3 = cxVar;
        this.f336021c = cxVar3;
        this.f336022d = dVar;
        this.f336023e = cxVar2;
        C60904dr drVar = new C60904dr(executor);
        this.f336026h = drVar;
        this.f336024f = aVar;
        this.f336025g = jVar;
        C120862bb bbVar2 = bbVar;
        this.f336027i = bbVar2;
        this.f336020b = baVar2;
        this.f336030l = gVar2;
        this.f336031m = z;
        C120851ar arVar = new C120851ar(cxVar3, drVar, bbVar2, eVar, baVar);
        this.f336028j = arVar;
        this.f336029k = C70876o.m103761b(ceVar2.f189039a.mo39510a(C39652cf.m69119c(), ceVar2.f189040b), C47686k.m84827a(arVar), true);
        C60856cj.m92911t(C47633f.m84733g(arVar.f336044e).f164926b, C47810es.m84974n(new C120841ah(this)), drVar);
        gVar.mo38849b(new C120884x(this, baVar2));
    }

    /* renamed from: a */
    public final C60870cx mo104941a(String str) {
        C120865e eVar = new C120865e(str);
        this.f336028j.mo20122b(eVar);
        return C60856cj.m92899h(eVar);
    }

    /* renamed from: b */
    public final C60870cx mo104942b(String str) {
        IllegalStateException illegalStateException = new IllegalStateException(str);
        this.f336028j.mo20122b(illegalStateException);
        return C60856cj.m92899h(illegalStateException);
    }

    /* renamed from: c */
    public final C60870cx mo104943c() {
        C39275ay ayVar = (C39275ay) C39276az.f103456b.createBuilder();
        return C47633f.m84733g(this.f336024f.mo104904c()).mo51516i(new C120882v(this, ayVar), this.f336026h).mo51515h(new C120883w(ayVar), this.f336026h);
    }
}
