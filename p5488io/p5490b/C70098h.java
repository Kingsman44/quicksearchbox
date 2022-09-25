package p5488io.p5490b;

import com.google.android.libraries.elements.p1714d.C20867cr;
import p5488io.p5490b.p5495c.C69813f;
import p5488io.p5490b.p5496d.C69822d;
import p5488io.p5490b.p5497e.p5499b.C69841j;
import p5488io.p5490b.p5497e.p5502e.p5505c.C69916j;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: io.b.h */
/* compiled from: PG */
public abstract class C70098h implements C70102j {
    /* renamed from: a */
    public final C70098h mo61635a(C69822d dVar) {
        C69916j jVar = new C69916j(this, dVar);
        C69822d dVar2 = C70101a.f186845m;
        return jVar;
    }

    /* renamed from: b */
    public final void mo61636b(C70100i iVar) {
        C69841j.m101337b(iVar, "observer is null");
        C20867cr crVar = C70101a.f186852t;
        C69841j.m101337b(iVar, "The RxJavaPlugins.onSubscribe hook returned a null MaybeObserver. Please check the handler provided to RxJavaPlugins.setOnMaybeSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            mo61518c(iVar);
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
    /* renamed from: c */
    public abstract void mo61518c(C70100i iVar);
}
