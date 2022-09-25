package p5488io.p5490b;

import com.google.android.libraries.elements.p1714d.C20867cr;
import org.p5649d.C72638a;
import org.p5649d.C72639b;
import p5488io.p5490b.p5495c.C69813f;
import p5488io.p5490b.p5496d.C69822d;
import p5488io.p5490b.p5497e.p5499b.C69841j;
import p5488io.p5490b.p5497e.p5502e.p5504b.C69899h;
import p5488io.p5490b.p5497e.p5502e.p5504b.C69906o;
import p5488io.p5490b.p5497e.p5511h.C70076c;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: io.b.f */
/* compiled from: PG */
public abstract class C70092f implements C72638a {

    /* renamed from: a */
    public static final int f186825a = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    /* renamed from: a */
    public static C70092f m101995a(Iterable iterable) {
        C69841j.m101337b(iterable, "source is null");
        C69899h hVar = new C69899h(iterable);
        C69822d dVar = C70101a.f186842j;
        return hVar;
    }

    /* renamed from: b */
    public final C70092f mo61632b(C69822d dVar) {
        C69841j.m101337b(dVar, "mapper is null");
        C69906o oVar = new C69906o(this, dVar);
        C69822d dVar2 = C70101a.f186842j;
        return oVar;
    }

    /* renamed from: c */
    public final void mo61633c(C70094g gVar) {
        C69841j.m101337b(gVar, "s is null");
        try {
            C20867cr crVar = C70101a.f186851s;
            C69841j.m101337b(gVar, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            mo61492e(gVar);
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

    /* renamed from: d */
    public final void mo61634d(C72639b bVar) {
        if (bVar instanceof C70094g) {
            mo61633c((C70094g) bVar);
            return;
        }
        C69841j.m101337b(bVar, "s is null");
        mo61633c(new C70076c(bVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo61492e(C72639b bVar);
}
