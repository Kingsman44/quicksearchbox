package p5488io.p5490b;

import com.google.android.libraries.elements.p1714d.C20867cr;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5495c.C69813f;
import p5488io.p5490b.p5496d.C69819a;
import p5488io.p5490b.p5496d.C69821c;
import p5488io.p5490b.p5496d.C69822d;
import p5488io.p5490b.p5497e.p5499b.C69836e;
import p5488io.p5490b.p5497e.p5499b.C69841j;
import p5488io.p5490b.p5497e.p5501d.C69853f;
import p5488io.p5490b.p5497e.p5501d.C69854g;
import p5488io.p5490b.p5497e.p5502e.p5503a.C69880o;
import p5488io.p5490b.p5497e.p5502e.p5508f.C70015f;
import p5488io.p5490b.p5497e.p5502e.p5508f.C70017h;
import p5488io.p5490b.p5497e.p5502e.p5508f.C70019j;
import p5488io.p5490b.p5497e.p5502e.p5508f.C70021l;
import p5488io.p5490b.p5497e.p5502e.p5508f.C70022m;
import p5488io.p5490b.p5497e.p5502e.p5508f.C70025p;
import p5488io.p5490b.p5497e.p5502e.p5508f.C70027r;
import p5488io.p5490b.p5497e.p5502e.p5508f.C70028s;
import p5488io.p5490b.p5497e.p5502e.p5508f.C70030u;
import p5488io.p5490b.p5497e.p5502e.p5508f.C70032w;
import p5488io.p5490b.p5497e.p5502e.p5508f.C70034y;
import p5488io.p5490b.p5497e.p5513j.C70085f;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: io.b.u */
/* compiled from: PG */
public abstract class C70129u implements C70131w {
    /* renamed from: g */
    public static C70129u m102078g(Throwable th) {
        C70022m mVar = new C70022m(new C69836e(th));
        C69822d dVar = C70101a.f186846n;
        return mVar;
    }

    /* renamed from: i */
    public static C70129u m102079i(Object obj) {
        C69841j.m101337b(obj, "item is null");
        C70028s sVar = new C70028s(obj);
        C69822d dVar = C70101a.f186846n;
        return sVar;
    }

    /* renamed from: a */
    public final C69794a mo61663a(C69822d dVar) {
        C69841j.m101337b(dVar, "mapper is null");
        C70027r rVar = new C70027r(this, dVar);
        C69822d dVar2 = C70101a.f186847o;
        return rVar;
    }

    /* renamed from: b */
    public final C69794a mo61664b() {
        C69880o oVar = new C69880o(this);
        C69822d dVar = C70101a.f186847o;
        return oVar;
    }

    /* renamed from: c */
    public final C70129u mo61665c(C69819a aVar) {
        C69841j.m101337b(aVar, "onAfterTerminate is null");
        C70015f fVar = new C70015f(this, aVar);
        C69822d dVar = C70101a.f186846n;
        return fVar;
    }

    /* renamed from: d */
    public final C70129u mo61666d(C69819a aVar) {
        C69841j.m101337b(aVar, "onFinally is null");
        C70017h hVar = new C70017h(this, aVar);
        C69822d dVar = C70101a.f186846n;
        return hVar;
    }

    /* renamed from: e */
    public final C70129u mo61667e(C69821c cVar) {
        C69841j.m101337b(cVar, "onError is null");
        C70019j jVar = new C70019j(this, cVar);
        C69822d dVar = C70101a.f186846n;
        return jVar;
    }

    /* renamed from: f */
    public final C70129u mo61668f(C69821c cVar) {
        C69841j.m101337b(cVar, "onSuccess is null");
        C70021l lVar = new C70021l(this, cVar);
        C69822d dVar = C70101a.f186846n;
        return lVar;
    }

    /* renamed from: h */
    public final C70129u mo61669h(C69822d dVar) {
        C70025p pVar = new C70025p(this, dVar);
        C69822d dVar2 = C70101a.f186846n;
        return pVar;
    }

    /* renamed from: j */
    public final C70129u mo61670j(C69822d dVar) {
        C69841j.m101337b(dVar, "mapper is null");
        C70030u uVar = new C70030u(this, dVar);
        C69822d dVar2 = C70101a.f186846n;
        return uVar;
    }

    /* renamed from: k */
    public final C70129u mo61671k(C69822d dVar) {
        C69841j.m101337b(dVar, "resumeFunction is null");
        C70032w wVar = new C70032w(this, dVar);
        C69822d dVar2 = C70101a.f186846n;
        return wVar;
    }

    /* renamed from: l */
    public final C70129u mo61672l(C70128t tVar) {
        C69841j.m101337b(tVar, "scheduler is null");
        C70034y yVar = new C70034y(this, tVar);
        C69822d dVar = C70101a.f186846n;
        return yVar;
    }

    /* renamed from: m */
    public final C69803b mo61673m() {
        C69854g gVar = new C69854g();
        mo61675o(gVar);
        return gVar;
    }

    /* renamed from: n */
    public final Object mo61674n() {
        C69853f fVar = new C69853f();
        mo61675o(fVar);
        if (fVar.getCount() != 0) {
            try {
                boolean z = C70101a.f186850r;
                fVar.await();
            } catch (InterruptedException e) {
                fVar.f186225d = true;
                C69803b bVar = fVar.f186224c;
                if (bVar != null) {
                    bVar.dispose();
                }
                throw C70085f.m101984a(e);
            }
        }
        Throwable th = fVar.f186223b;
        if (th == null) {
            return fVar.f186222a;
        }
        throw C70085f.m101984a(th);
    }

    /* renamed from: o */
    public final void mo61675o(C70130v vVar) {
        C69841j.m101337b(vVar, "observer is null");
        C20867cr crVar = C70101a.f186854v;
        C69841j.m101337b(vVar, "The RxJavaPlugins.onSubscribe hook returned a null SingleObserver. Please check the handler provided to RxJavaPlugins.setOnSingleSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            mo61519p(vVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C69813f.m101292a(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public abstract void mo61519p(C70130v vVar);
}
