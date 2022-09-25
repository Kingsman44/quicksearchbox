package p5488io.p5490b;

import com.google.android.libraries.elements.p1714d.C20867cr;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5495c.C69813f;
import p5488io.p5490b.p5496d.C69819a;
import p5488io.p5490b.p5496d.C69821c;
import p5488io.p5490b.p5496d.C69822d;
import p5488io.p5490b.p5496d.C69823e;
import p5488io.p5490b.p5497e.p5499b.C69840i;
import p5488io.p5490b.p5497e.p5499b.C69841j;
import p5488io.p5490b.p5497e.p5501d.C69852e;
import p5488io.p5490b.p5497e.p5501d.C69858k;
import p5488io.p5490b.p5497e.p5502e.p5506d.C69931al;
import p5488io.p5490b.p5497e.p5502e.p5506d.C69933an;
import p5488io.p5490b.p5497e.p5502e.p5506d.C69936aq;
import p5488io.p5490b.p5497e.p5502e.p5506d.C69940au;
import p5488io.p5490b.p5497e.p5502e.p5506d.C69976f;
import p5488io.p5490b.p5497e.p5502e.p5506d.C69978h;
import p5488io.p5490b.p5497e.p5502e.p5506d.C69979i;
import p5488io.p5490b.p5497e.p5502e.p5506d.C69986p;
import p5488io.p5490b.p5497e.p5502e.p5506d.C69990t;
import p5488io.p5490b.p5497e.p5502e.p5506d.C69993w;
import p5488io.p5490b.p5497e.p5513j.C70085f;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: io.b.l */
/* compiled from: PG */
public abstract class C70120l implements C70122n {
    /* renamed from: e */
    public static C70120l m102046e(Iterable iterable, C69822d dVar, int i) {
        C69841j.m101337b(dVar, "combiner is null");
        C69841j.m101338c(i, "bufferSize");
        C69976f fVar = new C69976f(iterable, dVar, i + i);
        C69822d dVar2 = C70101a.f186843k;
        return fVar;
    }

    /* renamed from: f */
    public static C70120l m102047f(C70121m mVar) {
        C69841j.m101337b(mVar, "source is null");
        C69978h hVar = new C69978h(mVar);
        C69822d dVar = C70101a.f186843k;
        return hVar;
    }

    /* renamed from: g */
    public static C70120l m102048g(Callable callable) {
        C69841j.m101337b(callable, "supplier is null");
        C69979i iVar = new C69979i(callable);
        C69822d dVar = C70101a.f186843k;
        return iVar;
    }

    /* renamed from: j */
    public static C70120l m102049j(Iterable iterable) {
        C69841j.m101337b(iterable, "source is null");
        C69931al alVar = new C69931al(iterable);
        C69822d dVar = C70101a.f186843k;
        return alVar;
    }

    /* renamed from: k */
    public static C70120l m102050k(long j, long j2, TimeUnit timeUnit, C70128t tVar) {
        C69841j.m101337b(timeUnit, "unit is null");
        C69841j.m101337b(tVar, "scheduler is null");
        C69933an anVar = new C69933an(Math.max(0, j), Math.max(0, j2), timeUnit, tVar);
        C69822d dVar = C70101a.f186843k;
        return anVar;
    }

    /* renamed from: h */
    public final C70120l mo61650h(C69821c cVar, C69819a aVar) {
        C69841j.m101337b(cVar, "onSubscribe is null");
        C69841j.m101337b(aVar, "onDispose is null");
        C69986p pVar = new C69986p(this, cVar, aVar);
        C69822d dVar = C70101a.f186843k;
        return pVar;
    }

    /* renamed from: i */
    public final C70120l mo61651i(C69823e eVar) {
        C69841j.m101337b(eVar, "predicate is null");
        C69993w wVar = new C69993w(this, eVar);
        C69822d dVar = C70101a.f186843k;
        return wVar;
    }

    /* renamed from: l */
    public final C70120l mo61652l(C69822d dVar) {
        C69841j.m101337b(dVar, "mapper is null");
        C69936aq aqVar = new C69936aq(this, dVar);
        C69822d dVar2 = C70101a.f186843k;
        return aqVar;
    }

    /* renamed from: m */
    public final C70120l mo61653m(C70128t tVar) {
        int i = C70092f.f186825a;
        C69841j.m101337b(tVar, "scheduler is null");
        C69841j.m101338c(i, "bufferSize");
        C69940au auVar = new C69940au(this, tVar, i);
        C69822d dVar = C70101a.f186843k;
        return auVar;
    }

    /* renamed from: n */
    public final C69803b mo61654n(C69821c cVar) {
        return mo61658t(cVar, C69840i.f186212e, C69840i.f186211d);
    }

    /* renamed from: o */
    public final Object mo61655o() {
        C69852e eVar = new C69852e();
        mo61539p(eVar);
        if (eVar.getCount() != 0) {
            try {
                boolean z = C70101a.f186850r;
                eVar.await();
            } catch (InterruptedException e) {
                eVar.dispose();
                throw C70085f.m101984a(e);
            }
        }
        Throwable th = eVar.f186219b;
        if (th == null) {
            Object obj = eVar.f186218a;
            if (obj != null) {
                return obj;
            }
            throw new NoSuchElementException();
        }
        throw C70085f.m101984a(th);
    }

    /* renamed from: p */
    public final void mo61539p(C70123o oVar) {
        C69841j.m101337b(oVar, "observer is null");
        try {
            C20867cr crVar = C70101a.f186853u;
            C69841j.m101337b(oVar, "The RxJavaPlugins.onSubscribe hook returned a null Observer. Please change the handler provided to RxJavaPlugins.setOnObservableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            mo61493q(oVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C69813f.m101292a(th);
            C70101a.m102023e(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public abstract void mo61493q(C70123o oVar);

    /* renamed from: r */
    public final C70129u mo61656r(Object obj) {
        C69841j.m101337b(obj, "defaultItem is null");
        C69990t tVar = new C69990t(this, obj);
        C69822d dVar = C70101a.f186846n;
        return tVar;
    }

    /* renamed from: s */
    public final C70129u mo61657s() {
        C69990t tVar = new C69990t(this, (Object) null);
        C69822d dVar = C70101a.f186846n;
        return tVar;
    }

    /* renamed from: t */
    public final C69803b mo61658t(C69821c cVar, C69821c cVar2, C69821c cVar3) {
        C69841j.m101337b(cVar, "onNext is null");
        C69858k kVar = new C69858k(cVar, cVar2);
        mo61539p(kVar);
        return kVar;
    }
}
