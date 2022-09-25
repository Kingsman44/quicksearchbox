package p3186j$.util.stream;

import java.util.Comparator;
import p3186j$.util.Spliterator;
import p3186j$.util.function.Supplier;

/* renamed from: j$.util.stream.k2 */
abstract class C41267k2 implements Spliterator {

    /* renamed from: a */
    final boolean f107956a;

    /* renamed from: b */
    final C41241e0 f107957b;

    /* renamed from: c */
    private Supplier f107958c;

    /* renamed from: d */
    Spliterator f107959d;

    /* renamed from: e */
    C41171L1 f107960e;

    /* renamed from: f */
    C41224a f107961f;

    /* renamed from: g */
    long f107962g;

    /* renamed from: h */
    C41240e f107963h;

    /* renamed from: i */
    boolean f107964i;

    C41267k2(C41241e0 e0Var, Spliterator spliterator, boolean z) {
        this.f107957b = e0Var;
        this.f107958c = null;
        this.f107959d = spliterator;
        this.f107956a = z;
    }

    C41267k2(C41241e0 e0Var, C41224a aVar, boolean z) {
        this.f107957b = e0Var;
        this.f107958c = aVar;
        this.f107959d = null;
        this.f107956a = z;
    }

    /* renamed from: d */
    private boolean m72162d() {
        boolean z;
        while (this.f107963h.count() == 0) {
            if (!this.f107960e.mo43664e()) {
                C41224a aVar = this.f107961f;
                int i = aVar.f107843a;
                Object obj = aVar.f107844b;
                switch (i) {
                    case 7:
                        C41295r2 r2Var = (C41295r2) obj;
                        z = r2Var.f107959d.tryAdvance(r2Var.f107960e);
                        break;
                    case 8:
                        C41307u2 u2Var = (C41307u2) obj;
                        z = u2Var.f107959d.tryAdvance(u2Var.f107960e);
                        break;
                    case 9:
                        C41315w2 w2Var = (C41315w2) obj;
                        z = w2Var.f107959d.tryAdvance(w2Var.f107960e);
                        break;
                    default:
                        C41176M2 m2 = (C41176M2) obj;
                        z = m2.f107959d.tryAdvance(m2.f107960e);
                        break;
                }
                if (z) {
                    continue;
                }
            }
            if (this.f107964i) {
                return false;
            }
            this.f107960e.end();
            this.f107964i = true;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo43857c() {
        C41240e eVar = this.f107963h;
        boolean z = false;
        if (eVar != null) {
            long j = this.f107962g + 1;
            this.f107962g = j;
            if (j < eVar.count()) {
                z = true;
            }
            if (z) {
                return z;
            }
            this.f107962g = 0;
            this.f107963h.clear();
            return m72162d();
        } else if (this.f107964i) {
            return false;
        } else {
            mo43858e();
            mo43777h();
            this.f107962g = 0;
            this.f107960e.mo43663c(this.f107959d.getExactSizeIfKnown());
            return m72162d();
        }
    }

    public final int characteristics() {
        mo43858e();
        int l = C41259i2.m72153l(this.f107957b.mo43815P()) & C41259i2.f107922f;
        if ((l & 64) != 0) {
            return (l & -16449) | (this.f107959d.characteristics() & 16448);
        }
        return l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo43858e() {
        if (this.f107959d == null) {
            this.f107959d = (Spliterator) this.f107958c.get();
            this.f107958c = null;
        }
    }

    public final long estimateSize() {
        mo43858e();
        return this.f107959d.estimateSize();
    }

    public final Comparator getComparator() {
        if (Spliterator.CC.$default$hasCharacteristics(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    public final long getExactSizeIfKnown() {
        mo43858e();
        if (C41259i2.SIZED.mo43855g(this.f107957b.mo43815P())) {
            return this.f107959d.getExactSizeIfKnown();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract void mo43777h();

    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public abstract C41267k2 mo43778j(Spliterator spliterator);

    public final String toString() {
        return String.format("%s[%s]", new Object[]{getClass().getName(), this.f107959d});
    }

    public Spliterator trySplit() {
        if (!this.f107956a || this.f107963h != null || this.f107964i) {
            return null;
        }
        mo43858e();
        Spliterator trySplit = this.f107959d.trySplit();
        if (trySplit == null) {
            return null;
        }
        return mo43778j(trySplit);
    }
}
