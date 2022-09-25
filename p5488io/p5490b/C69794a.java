package p5488io.p5490b;

import com.google.android.libraries.elements.p1714d.C20867cr;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5495c.C69813f;
import p5488io.p5490b.p5496d.C69819a;
import p5488io.p5490b.p5496d.C69821c;
import p5488io.p5490b.p5496d.C69822d;
import p5488io.p5490b.p5497e.p5499b.C69840i;
import p5488io.p5490b.p5497e.p5499b.C69841j;
import p5488io.p5490b.p5497e.p5501d.C69857j;
import p5488io.p5490b.p5497e.p5502e.p5503a.C69861aa;
import p5488io.p5490b.p5497e.p5502e.p5503a.C69873h;
import p5488io.p5490b.p5497e.p5502e.p5503a.C69875j;
import p5488io.p5490b.p5497e.p5502e.p5503a.C69876k;
import p5488io.p5490b.p5497e.p5502e.p5503a.C69878m;
import p5488io.p5490b.p5497e.p5502e.p5503a.C69881p;
import p5488io.p5490b.p5497e.p5502e.p5503a.C69886u;
import p5488io.p5490b.p5497e.p5502e.p5503a.C69890y;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: io.b.a */
/* compiled from: PG */
public abstract class C69794a implements C69818d {
    /* renamed from: c */
    public static C69794a m101253c(C69807c cVar) {
        C69841j.m101337b(cVar, "source is null");
        C69873h hVar = new C69873h(cVar);
        C69822d dVar = C70101a.f186847o;
        return hVar;
    }

    /* renamed from: f */
    public static C69794a m101254f(Throwable th) {
        C69875j jVar = new C69875j(th);
        C69822d dVar = C70101a.f186847o;
        return jVar;
    }

    /* renamed from: g */
    public static C69794a m101255g(C69819a aVar) {
        C69841j.m101337b(aVar, "run is null");
        C69876k kVar = new C69876k(aVar);
        C69822d dVar = C70101a.f186847o;
        return kVar;
    }

    /* renamed from: h */
    public static C69794a m101256h(Runnable runnable) {
        C69841j.m101337b(runnable, "run is null");
        C69878m mVar = new C69878m(runnable);
        C69822d dVar = C70101a.f186847o;
        return mVar;
    }

    /* renamed from: a */
    public final void mo42459a(C69801b bVar) {
        C69841j.m101337b(bVar, "observer is null");
        try {
            C20867cr crVar = C70101a.f186855w;
            C69841j.m101337b(bVar, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            mo61454l(bVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C69813f.m101292a(th);
            C70101a.m102023e(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* renamed from: b */
    public final C69794a mo61448b(C69824e eVar) {
        C69841j.m101337b(eVar, "transformer is null");
        C69818d a = eVar.mo26126a(this);
        C69841j.m101337b(a, "source is null");
        if (a instanceof C69794a) {
            C69794a aVar = (C69794a) a;
            C69822d dVar = C70101a.f186847o;
            return aVar;
        }
        C69881p pVar = new C69881p(a);
        C69822d dVar2 = C70101a.f186847o;
        return pVar;
    }

    /* renamed from: d */
    public final C69794a mo61449d(C69821c cVar) {
        return mo61455m(C69840i.f186211d, cVar, C69840i.f186210c);
    }

    /* renamed from: e */
    public final C69794a mo61450e(C69821c cVar) {
        return mo61455m(cVar, C69840i.f186211d, C69840i.f186210c);
    }

    /* renamed from: i */
    public final C69794a mo61451i(C70128t tVar) {
        C69841j.m101337b(tVar, "scheduler is null");
        C69886u uVar = new C69886u(this, tVar);
        C69822d dVar = C70101a.f186847o;
        return uVar;
    }

    /* renamed from: j */
    public final C69794a mo61452j(C70128t tVar) {
        C69841j.m101337b(tVar, "scheduler is null");
        C69861aa aaVar = new C69861aa(this, tVar);
        C69822d dVar = C70101a.f186847o;
        return aaVar;
    }

    /* renamed from: k */
    public final C69803b mo61453k() {
        C69857j jVar = new C69857j();
        mo42459a(jVar);
        return jVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract void mo61454l(C69801b bVar);

    /* renamed from: m */
    public final C69794a mo61455m(C69821c cVar, C69821c cVar2, C69819a aVar) {
        C69841j.m101337b(cVar, "onSubscribe is null");
        C69841j.m101337b(cVar2, "onError is null");
        C69841j.m101337b(aVar, "onComplete is null");
        C69890y yVar = new C69890y(this, cVar, cVar2, aVar);
        C69822d dVar = C70101a.f186847o;
        return yVar;
    }
}
