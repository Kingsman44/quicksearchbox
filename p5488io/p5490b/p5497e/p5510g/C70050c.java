package p5488io.p5490b.p5497e.p5510g;

import java.util.concurrent.ThreadFactory;
import p5488io.p5490b.p5497e.p5502e.p5507e.C70006j;

/* renamed from: io.b.e.g.c */
/* compiled from: PG */
final class C70050c implements C70073z {

    /* renamed from: a */
    final int f186730a;

    /* renamed from: b */
    final C70051d[] f186731b;

    /* renamed from: c */
    long f186732c;

    public C70050c(int i, ThreadFactory threadFactory) {
        this.f186730a = i;
        this.f186731b = new C70051d[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.f186731b[i2] = new C70051d(threadFactory);
        }
    }

    /* renamed from: a */
    public final C70051d mo61594a() {
        int i = this.f186730a;
        if (i == 0) {
            return C70052e.f186736e;
        }
        C70051d[] dVarArr = this.f186731b;
        long j = this.f186732c;
        this.f186732c = 1 + j;
        return dVarArr[(int) (j % ((long) i))];
    }

    /* renamed from: b */
    public final void mo61595b() {
        for (C70051d dispose : this.f186731b) {
            dispose.dispose();
        }
    }

    /* renamed from: e */
    public final void mo61596e(int i, C70006j jVar) {
        int i2 = this.f186730a;
        if (i2 == 0) {
            for (int i3 = 0; i3 < i; i3++) {
                jVar.mo61574a(i3, C70052e.f186736e);
            }
            return;
        }
        int i4 = ((int) this.f186732c) % i2;
        for (int i5 = 0; i5 < i; i5++) {
            jVar.mo61574a(i5, new C70049b(this.f186731b[i4]));
            i4++;
            if (i4 == i2) {
                i4 = 0;
            }
        }
        this.f186732c = (long) i4;
    }
}
