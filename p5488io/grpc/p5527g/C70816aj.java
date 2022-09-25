package p5488io.grpc.p5527g;

import java.io.IOException;
import p5488io.grpc.p5527g.p5528a.p5529a.C70774c;
import p5488io.grpc.p5527g.p5528a.p5529a.C70782k;
import p5589m.C71828e;

/* renamed from: io.grpc.g.aj */
/* compiled from: PG */
public final class C70816aj {

    /* renamed from: a */
    public final C71828e f188866a = new C71828e();

    /* renamed from: b */
    public int f188867b;

    /* renamed from: c */
    public int f188868c;

    /* renamed from: d */
    public boolean f188869d = false;

    /* renamed from: e */
    final /* synthetic */ C70819am f188870e;

    /* renamed from: f */
    private final int f188871f;

    /* renamed from: g */
    private final C70815ai f188872g;

    public C70816aj(C70819am amVar, int i, int i2, C70815ai aiVar) {
        this.f188870e = amVar;
        this.f188871f = i;
        this.f188867b = i2;
        this.f188872g = aiVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo62522a() {
        return Math.max(0, Math.min(this.f188867b, (int) this.f188866a.f191356b));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo62523b() {
        return Math.min(this.f188867b, this.f188870e.f188877d.f188867b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo62524c(C71828e eVar, int i, boolean z) {
        do {
            int min = Math.min(i, ((C70782k) ((C70828i) ((C70827h) this.f188870e.f188875b).f188896b).f188898b).f188755a);
            int i2 = -min;
            this.f188870e.f188877d.mo62527f(i2);
            mo62527f(i2);
            try {
                boolean z2 = eVar.f191356b == ((long) min) && z;
                C70774c cVar = this.f188870e.f188875b;
                int i3 = this.f188871f;
                ((C70827h) cVar).f188897c.mo62512b(2, i3, eVar, min, z2);
                try {
                    ((C70828i) ((C70827h) cVar).f188896b).f188898b.mo62452c(z2, i3, eVar, min);
                } catch (IOException e) {
                    ((C70827h) cVar).f188895a.mo62539a(e);
                }
                this.f188872g.mo62521m(min);
                i -= min;
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        } while (i > 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo62525d() {
        return this.f188866a.f191356b > 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo62526e(int i, C70818al alVar) {
        int min = Math.min(i, mo62523b());
        int i2 = 0;
        while (mo62525d() && min > 0) {
            C71828e eVar = this.f188866a;
            long j = eVar.f191356b;
            if (((long) min) >= j) {
                int i3 = (int) j;
                i2 += i3;
                mo62524c(eVar, i3, this.f188869d);
            } else {
                i2 += min;
                mo62524c(eVar, min, false);
            }
            alVar.f188873a++;
            min = Math.min(i - i2, mo62523b());
        }
    }

    /* renamed from: f */
    public final void mo62527f(int i) {
        if (i <= 0 || Integer.MAX_VALUE - i >= this.f188867b) {
            this.f188867b += i;
            return;
        }
        throw new IllegalArgumentException("Window size overflow for stream: " + this.f188871f);
    }
}
