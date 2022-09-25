package p5488io.p5490b.p5497e.p5513j;

import java.util.concurrent.atomic.AtomicReference;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5495c.C69816i;
import p5488io.p5490b.p5497e.p5498a.C69828d;
import p5488io.p5490b.p5497e.p5499b.C69841j;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: io.b.e.j.d */
/* compiled from: PG */
public final class C70083d {
    /* renamed from: a */
    public static void m101983a(AtomicReference atomicReference, C69803b bVar, Class cls) {
        C69841j.m101337b(bVar, "next is null");
        while (!atomicReference.compareAndSet((Object) null, bVar)) {
            if (atomicReference.get() != null) {
                bVar.dispose();
                if (atomicReference.get() != C69828d.f186198a) {
                    String name = cls.getName();
                    C70101a.m102023e(new C69816i("It is not allowed to subscribe with a(n) " + name + " multiple times. Please create a fresh instance of " + name + " and subscribe that to the target source instead."));
                    return;
                }
                return;
            }
        }
    }
}
