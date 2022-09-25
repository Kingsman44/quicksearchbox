package p5488io.p5490b.p5497e.p5509f;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p5488io.p5490b.p5497e.p5500c.C69846e;
import p5488io.p5490b.p5497e.p5513j.C70091l;

/* renamed from: io.b.e.f.c */
/* compiled from: PG */
public final class C70037c extends AtomicReferenceArray implements C69846e {

    /* renamed from: f */
    private static final Integer f186682f = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    private static final long serialVersionUID = -1296597691183856449L;

    /* renamed from: a */
    final int f186683a = (length() - 1);

    /* renamed from: b */
    final AtomicLong f186684b = new AtomicLong();

    /* renamed from: c */
    long f186685c;

    /* renamed from: d */
    final AtomicLong f186686d = new AtomicLong();

    /* renamed from: e */
    final int f186687e;

    public C70037c(int i) {
        super(C70091l.m101994a(i));
        this.f186687e = Math.min(i / 4, f186682f.intValue());
    }

    /* renamed from: c */
    public final void mo61475c() {
        while (true) {
            if (mo61479lN() == null && mo61476i()) {
                return;
            }
        }
    }

    /* renamed from: i */
    public final boolean mo61476i() {
        return this.f186684b.get() == this.f186686d.get();
    }

    /* renamed from: j */
    public final boolean mo61477j(Object obj) {
        if (obj != null) {
            int i = this.f186683a;
            long j = this.f186684b.get();
            int i2 = ((int) j) & i;
            if (j >= this.f186685c) {
                long j2 = ((long) this.f186687e) + j;
                if (get(i & ((int) j2)) == null) {
                    this.f186685c = j2;
                } else if (get(i2) != null) {
                    return false;
                }
            }
            lazySet(i2, obj);
            this.f186684b.lazySet(j + 1);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    /* renamed from: lN */
    public final Object mo61479lN() {
        long j = this.f186686d.get();
        int i = ((int) j) & this.f186683a;
        Object obj = get(i);
        if (obj == null) {
            return null;
        }
        this.f186686d.lazySet(j + 1);
        lazySet(i, (Object) null);
        return obj;
    }
}
