package p3186j$.util.stream;

import java.util.concurrent.CountedCompleter;

/* renamed from: j$.util.stream.d1 */
abstract class C41238d1 extends CountedCompleter {

    /* renamed from: a */
    protected final C41277n0 f107870a;

    /* renamed from: b */
    protected final int f107871b;

    C41238d1(C41238d1 d1Var, C41277n0 n0Var, int i) {
        super(d1Var);
        this.f107870a = n0Var;
        this.f107871b = i;
    }

    C41238d1(C41277n0 n0Var) {
        this.f107870a = n0Var;
        this.f107871b = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo43826a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract C41234c1 mo43827b(int i, int i2);

    public final void compute() {
        int i;
        C41238d1 d1Var = this;
        while (d1Var.f107870a.mo43651l() != 0) {
            C41277n0 n0Var = d1Var.f107870a;
            d1Var.setPendingCount(n0Var.mo43651l() - 1);
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int l = n0Var.mo43651l() - 1;
                i = d1Var.f107871b + i2;
                if (i3 >= l) {
                    break;
                }
                C41234c1 b = d1Var.mo43827b(i3, i);
                i2 = (int) (((long) i2) + b.f107870a.count());
                b.fork();
                i3++;
            }
            d1Var = d1Var.mo43827b(i3, i);
        }
        d1Var.mo43826a();
        d1Var.propagateCompletion();
    }
}
