package p5488io.p5490b.p5497e.p5502e.p5506d;

import p5488io.p5490b.C70120l;
import p5488io.p5490b.C70123o;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5495c.C69813f;
import p5488io.p5490b.p5497e.p5498a.C69828d;
import p5488io.p5490b.p5497e.p5513j.C70085f;
import p5488io.p5490b.p5514f.C70093a;

/* renamed from: io.b.e.e.d.az */
/* compiled from: PG */
public final class C69945az extends C70120l {

    /* renamed from: a */
    final C70093a f186434a;

    /* renamed from: b */
    C69943ax f186435b;

    public C69945az(C70093a aVar) {
        this.f186434a = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo61530a(C69943ax axVar) {
        synchronized (this) {
            C69943ax axVar2 = this.f186435b;
            if (axVar2 != null && axVar2 == axVar) {
                C69803b bVar = axVar.f186426b;
                long j = axVar.f186427c - 1;
                axVar.f186427c = j;
                if (j == 0) {
                    this.f186435b = null;
                    ((C69956bj) this.f186434a).mo61540a((C69803b) axVar.get());
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo61531b(C69943ax axVar) {
        synchronized (this) {
            if (axVar.f186427c == 0 && axVar == this.f186435b) {
                this.f186435b = null;
                C69803b bVar = (C69803b) axVar.get();
                C69828d.m101309f(axVar);
                C70093a aVar = this.f186434a;
                if (bVar == null) {
                    axVar.f186429e = true;
                } else {
                    ((C69956bj) aVar).mo61540a(bVar);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo61493q(C70123o oVar) {
        C69943ax axVar;
        boolean z;
        C69956bj bjVar;
        C69953bg bgVar;
        synchronized (this) {
            axVar = this.f186435b;
            if (axVar == null) {
                axVar = new C69943ax(this);
                this.f186435b = axVar;
            }
            long j = axVar.f186427c;
            if (j == 0) {
                j = 0;
            }
            long j2 = j + 1;
            axVar.f186427c = j2;
            if (axVar.f186428d || j2 != 1) {
                z = false;
            } else {
                axVar.f186428d = true;
                z = true;
            }
        }
        this.f186434a.mo61539p(new C69944ay(oVar, this, axVar));
        if (z) {
            C70093a aVar = this.f186434a;
            while (true) {
                bjVar = (C69956bj) aVar;
                bgVar = (C69953bg) bjVar.f186457b.get();
                if (bgVar != null && bgVar.f186452e.get() != C69953bg.f186449b) {
                    break;
                }
                C69953bg bgVar2 = new C69953bg(new C69955bi());
                if (C69947ba.m101641a(bjVar.f186457b, bgVar, bgVar2)) {
                    bgVar = bgVar2;
                    break;
                }
            }
            boolean z2 = !bgVar.f186453f.get() && bgVar.f186453f.compareAndSet(false, true);
            try {
                axVar.mo25818a(bgVar);
                if (z2) {
                    bjVar.f186456a.mo61539p(bgVar);
                }
            } catch (Throwable th) {
                if (z2) {
                    bgVar.f186453f.compareAndSet(true, false);
                }
                C69813f.m101292a(th);
                throw C70085f.m101984a(th);
            }
        }
    }
}
