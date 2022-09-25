package p3186j$.util.stream;

import java.util.ArrayDeque;
import p3186j$.util.C41041I;
import p3186j$.util.Spliterator;

/* renamed from: j$.util.stream.P0 */
abstract class C41186P0 extends C41193R0 implements C41041I {
    C41186P0(C41273m0 m0Var) {
        super(m0Var);
    }

    /* renamed from: forEachRemaining */
    public final void mo43787l(Object obj) {
        if (this.f107792a != null) {
            if (this.f107795d == null) {
                Spliterator spliterator = this.f107794c;
                if (spliterator == null) {
                    ArrayDeque d = mo43788d();
                    while (true) {
                        C41273m0 m0Var = (C41273m0) C41193R0.m71911c(d);
                        if (m0Var != null) {
                            m0Var.mo43649g(obj);
                        } else {
                            this.f107792a = null;
                            return;
                        }
                    }
                } else {
                    ((C41041I) spliterator).forEachRemaining(obj);
                }
            } else {
                do {
                } while (mo43786i(obj));
            }
        }
    }

    /* renamed from: tryAdvance */
    public final boolean mo43786i(Object obj) {
        C41273m0 m0Var;
        if (!mo43789e()) {
            return false;
        }
        boolean tryAdvance = ((C41041I) this.f107795d).tryAdvance(obj);
        if (!tryAdvance) {
            if (this.f107794c != null || (m0Var = (C41273m0) C41193R0.m71911c(this.f107796e)) == null) {
                this.f107792a = null;
            } else {
                C41041I spliterator = m0Var.spliterator();
                this.f107795d = spliterator;
                return spliterator.tryAdvance(obj);
            }
        }
        return tryAdvance;
    }
}
