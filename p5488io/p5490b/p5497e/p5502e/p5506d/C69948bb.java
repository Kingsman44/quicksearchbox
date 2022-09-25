package p5488io.p5490b.p5497e.p5502e.p5506d;

import java.util.concurrent.atomic.AtomicReference;
import p5488io.p5490b.p5497e.p5513j.C70089j;

/* renamed from: io.b.e.e.d.bb */
/* compiled from: PG */
abstract class C69948bb extends AtomicReference implements C69951be {
    private static final long serialVersionUID = 2346567790059478686L;

    /* renamed from: a */
    C69950bd f186441a;

    /* renamed from: b */
    int f186442b;

    public C69948bb() {
        C69950bd bdVar = new C69950bd((Object) null);
        this.f186441a = bdVar;
        set(bdVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo61532a(C69950bd bdVar) {
        this.f186441a.set(bdVar);
        this.f186441a = bdVar;
        this.f186442b++;
    }

    /* renamed from: b */
    public final void mo61533b(C69949bc bcVar) {
        if (bcVar.getAndIncrement() == 0) {
            int i = 1;
            do {
                C69950bd bdVar = bcVar.f186445c;
                if (bdVar == null) {
                    bdVar = (C69950bd) get();
                    bcVar.f186445c = bdVar;
                }
                while (!bcVar.f186446d) {
                    C69950bd bdVar2 = (C69950bd) ((C69950bd) bdVar).get();
                    if (bdVar2 == null) {
                        bcVar.f186445c = bdVar;
                        i = bcVar.addAndGet(-i);
                    } else if (!C70089j.m101990c(bdVar2.f186447a, bcVar.f186444b)) {
                        bdVar = bdVar2;
                    } else {
                        bcVar.f186445c = null;
                        return;
                    }
                }
                bcVar.f186445c = null;
                return;
            } while (i != 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo61534c() {
        C69950bd bdVar = (C69950bd) get();
        if (bdVar.f186447a != null) {
            C69950bd bdVar2 = new C69950bd((Object) null);
            bdVar2.lazySet((C69950bd) bdVar.get());
            set(bdVar2);
        }
    }

    /* renamed from: d */
    public abstract void mo61535d();
}
