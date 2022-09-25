package com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7727b.p7749g;

import com.google.android.apps.gsa.c.f.u;
import com.google.android.apps.gsa.p5836c.p5843f.C74458k;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.speech.p7272e.p7275c.C92263a;
import com.google.android.apps.gsa.speech.p7298l.C92460b;
import com.google.android.apps.gsa.speech.p7298l.C92473f;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4460h.p4461a.C58009ae;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.i.b.g.af */
/* compiled from: PG */
public final class C99140af extends C68247h {

    /* renamed from: a */
    private final C68283d f277278a;

    /* renamed from: c */
    private final C68283d f277279c;

    /* renamed from: d */
    private final C68283d f277280d;

    /* renamed from: e */
    private final C68283d f277281e;

    /* renamed from: f */
    private final C68283d f277282f;

    /* renamed from: g */
    private final C68283d f277283g;

    public C99140af(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5, C68283d dVar6) {
        super(aVar2, new C68277d(C99140af.class), aVar);
        this.f277278a = C68236af.m98549d(dVar);
        this.f277279c = C68236af.m98549d(dVar2);
        this.f277280d = C68236af.m98549d(dVar3);
        this.f277281e = C68236af.m98549d(dVar4);
        this.f277282f = C68236af.m98549d(dVar5);
        this.f277283g = C68236af.m98549d(dVar6);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C118826c cVar = (C118826c) list.get(0);
        C58009ae aeVar = (C58009ae) list.get(1);
        C92263a aVar = (C92263a) list.get(2);
        C92473f fVar = (C92473f) list.get(3);
        C58833ax axVar = (C58833ax) list.get(4);
        u uVar = (u) list.get(5);
        C58976aa aaVar = C58975e.f156826a;
        if (axVar.mo56113h()) {
            C99138ad adVar = new C99138ad(uVar, axVar);
            C92460b a = ((C74458k) axVar.mo56107c()).mo70774a();
            return aeVar.mo54598b(new C99139ae(aVar, adVar, fVar, a.mo87195f(), Integer.bitCount(a.mo87190a())));
        }
        throw new RuntimeException("AudioListeningSessionAdapter is missing");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f277278a.mo60297gq(), this.f277279c.mo60297gq(), this.f277280d.mo60297gq(), this.f277281e.mo60297gq(), this.f277282f.mo60297gq(), this.f277283g.mo60297gq());
    }
}
