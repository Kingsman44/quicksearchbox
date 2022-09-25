package com.google.android.libraries.elements.p1714d.p1719e.p1720a;

import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21312s;
import com.google.android.libraries.elements.interfaces.C21313t;
import com.google.common.base.C58833ax;
import com.google.protobuf.C62917ay;
import com.google.protos.youtube.elements.C66059au;
import com.google.protos.youtube.elements.C66202dp;
import dagger.C68214a;
import p5488io.p5490b.C69794a;
import p5488io.p5490b.C70092f;
import p5488io.p5490b.C70128t;
import p5488io.p5490b.p5496d.C69822d;
import p5488io.p5490b.p5497e.p5499b.C69841j;
import p5488io.p5490b.p5497e.p5502e.p5503a.C69874i;
import p5488io.p5490b.p5497e.p5502e.p5503a.C69884s;
import p5488io.p5490b.p5497e.p5502e.p5504b.C69903l;
import p5488io.p5490b.p5497e.p5502e.p5507e.C69997a;
import p5488io.p5490b.p5497e.p5502e.p5507e.C70000d;
import p5488io.p5490b.p5497e.p5502e.p5507e.C70004h;
import p5488io.p5490b.p5497e.p5502e.p5507e.C70009m;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: com.google.android.libraries.elements.d.e.a.ag */
/* compiled from: PG */
public final class C20943ag implements C21312s {

    /* renamed from: a */
    private final C68214a f58725a;

    /* renamed from: b */
    private final boolean f58726b;

    /* renamed from: c */
    private final C70128t f58727c;

    public C20943ag(C68214a aVar, C58833ax axVar, C70128t tVar) {
        this.f58725a = aVar;
        this.f58726b = ((Boolean) axVar.mo56109e(false)).booleanValue();
        this.f58727c = tVar;
    }

    /* renamed from: a */
    public final C62917ay mo25802a() {
        return C66202dp.f180024c;
    }

    /* renamed from: b */
    public final /* synthetic */ C66059au mo25803b() {
        return null;
    }

    /* renamed from: c */
    public final /* synthetic */ C69794a mo25804c(Object obj, C21311r rVar) {
        C66202dp dpVar = (C66202dp) obj;
        C21313t tVar = (C21313t) this.f58725a.mo27525b();
        if (dpVar.f180026a.size() <= 0) {
            C69794a aVar = C69874i.f186267a;
            C69822d dVar = C70101a.f186847o;
            return aVar;
        } else if (this.f58726b) {
            C70092f a = C70092f.m101995a(dpVar.f180026a);
            int availableProcessors = Runtime.getRuntime().availableProcessors();
            int i = C70092f.f186825a;
            C69841j.m101338c(availableProcessors, "parallelism");
            C69841j.m101338c(i, "prefetch");
            C70000d dVar2 = new C70000d(a, availableProcessors, i);
            C69822d dVar3 = C70101a.f186848p;
            C70128t tVar2 = this.f58727c;
            int i2 = C70092f.f186825a;
            C69841j.m101338c(i2, "prefetch");
            C70009m mVar = new C70009m(dVar2, tVar2, i2);
            C69822d dVar4 = C70101a.f186848p;
            C20941ae aeVar = new C20941ae(tVar, rVar);
            int i3 = C70092f.f186825a;
            C69841j.m101338c(i3, "prefetch");
            C69997a aVar2 = new C69997a(mVar, aeVar, i3);
            C69822d dVar5 = C70101a.f186848p;
            int i4 = C70092f.f186825a;
            C69841j.m101338c(i4, "prefetch");
            C70004h hVar = new C70004h(aVar2, i4);
            C69822d dVar6 = C70101a.f186842j;
            C69903l lVar = new C69903l(hVar);
            C69822d dVar7 = C70101a.f186847o;
            return lVar;
        } else {
            C69884s sVar = new C69884s(C70092f.m101995a(dpVar.f180026a).mo61632b(new C20942af(tVar, rVar)));
            C69822d dVar8 = C70101a.f186847o;
            return sVar;
        }
    }
}
