package p3186j$.util.stream;

import java.util.ArrayDeque;
import java.util.Comparator;
import p3186j$.util.Spliterator;

/* renamed from: j$.util.stream.R0 */
abstract class C41193R0 implements Spliterator {

    /* renamed from: a */
    C41277n0 f107792a;

    /* renamed from: b */
    int f107793b;

    /* renamed from: c */
    Spliterator f107794c;

    /* renamed from: d */
    Spliterator f107795d;

    /* renamed from: e */
    ArrayDeque f107796e;

    C41193R0(C41277n0 n0Var) {
        this.f107792a = n0Var;
    }

    /* renamed from: c */
    protected static C41277n0 m71911c(ArrayDeque arrayDeque) {
        while (true) {
            C41277n0 n0Var = (C41277n0) arrayDeque.pollFirst();
            if (n0Var != null) {
                if (n0Var.mo43651l() != 0) {
                    int l = n0Var.mo43651l();
                    while (true) {
                        l--;
                        if (l < 0) {
                            break;
                        }
                        arrayDeque.addFirst(n0Var.mo43644a(l));
                    }
                } else if (n0Var.count() > 0) {
                    return n0Var;
                }
            } else {
                return null;
            }
        }
    }

    public final int characteristics() {
        return 64;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final ArrayDeque mo43788d() {
        ArrayDeque arrayDeque = new ArrayDeque(8);
        int l = this.f107792a.mo43651l();
        while (true) {
            l--;
            if (l < this.f107793b) {
                return arrayDeque;
            }
            arrayDeque.addFirst(this.f107792a.mo43644a(l));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo43789e() {
        if (this.f107792a == null) {
            return false;
        }
        if (this.f107795d != null) {
            return true;
        }
        Spliterator spliterator = this.f107794c;
        if (spliterator == null) {
            ArrayDeque d = mo43788d();
            this.f107796e = d;
            C41277n0 c = m71911c(d);
            if (c != null) {
                spliterator = c.spliterator();
            } else {
                this.f107792a = null;
                return false;
            }
        }
        this.f107795d = spliterator;
        return true;
    }

    public final long estimateSize() {
        long j = 0;
        if (this.f107792a == null) {
            return 0;
        }
        Spliterator spliterator = this.f107794c;
        if (spliterator != null) {
            return spliterator.estimateSize();
        }
        for (int i = this.f107793b; i < this.f107792a.mo43651l(); i++) {
            j += this.f107792a.mo43644a(i).count();
        }
        return j;
    }

    public final /* synthetic */ Comparator getComparator() {
        return Spliterator.CC.$default$getComparator(this);
    }

    public final /* synthetic */ long getExactSizeIfKnown() {
        return Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    public final Spliterator trySplit() {
        C41277n0 n0Var = this.f107792a;
        if (n0Var == null || this.f107795d != null) {
            return null;
        }
        Spliterator spliterator = this.f107794c;
        if (spliterator != null) {
            return spliterator.trySplit();
        }
        if (this.f107793b < n0Var.mo43651l() - 1) {
            C41277n0 n0Var2 = this.f107792a;
            int i = this.f107793b;
            this.f107793b = i + 1;
            return n0Var2.mo43644a(i).spliterator();
        }
        C41277n0 a = this.f107792a.mo43644a(this.f107793b);
        this.f107792a = a;
        if (a.mo43651l() == 0) {
            Spliterator spliterator2 = this.f107792a.spliterator();
            this.f107794c = spliterator2;
            return spliterator2.trySplit();
        }
        C41277n0 n0Var3 = this.f107792a;
        this.f107793b = 0 + 1;
        return n0Var3.mo43644a(0).spliterator();
    }
}
