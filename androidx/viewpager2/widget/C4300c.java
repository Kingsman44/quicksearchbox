package androidx.viewpager2.widget;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

/* renamed from: androidx.viewpager2.widget.c */
/* compiled from: PG */
public final class C4300c extends C4313p {

    /* renamed from: a */
    private final List f13914a = new ArrayList(3);

    /* renamed from: f */
    private static final void m12344f(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }

    /* renamed from: a */
    public final void mo9201a(int i) {
        try {
            for (C4313p a : this.f13914a) {
                a.mo9201a(i);
            }
        } catch (ConcurrentModificationException e) {
            m12344f(e);
        }
    }

    /* renamed from: b */
    public final void mo9202b(int i) {
        try {
            for (C4313p b : this.f13914a) {
                b.mo9202b(i);
            }
        } catch (ConcurrentModificationException e) {
            m12344f(e);
        }
    }

    /* renamed from: c */
    public final void mo9232c(C4313p pVar) {
        this.f13914a.add(pVar);
    }

    /* renamed from: d */
    public final void mo9233d(int i, float f, int i2) {
        try {
            for (C4313p d : this.f13914a) {
                d.mo9233d(i, f, i2);
            }
        } catch (ConcurrentModificationException e) {
            m12344f(e);
        }
    }

    /* renamed from: e */
    public final void mo9234e(C4313p pVar) {
        this.f13914a.remove(pVar);
    }
}
