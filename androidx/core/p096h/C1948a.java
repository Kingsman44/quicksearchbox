package androidx.core.p096h;

import java.util.Locale;

/* renamed from: androidx.core.h.a */
/* compiled from: PG */
public final class C1948a {

    /* renamed from: a */
    private boolean f5854a;

    /* renamed from: b */
    private int f5855b;

    /* renamed from: c */
    private C1956i f5856c;

    public C1948a() {
        m5268b(C1950c.m5275d(Locale.getDefault()));
    }

    /* renamed from: b */
    private final void m5268b(boolean z) {
        this.f5854a = z;
        this.f5856c = C1950c.f5862a;
        this.f5855b = 2;
    }

    /* renamed from: a */
    public final C1950c mo5098a() {
        if (this.f5855b == 2 && this.f5856c == C1950c.f5862a) {
            return this.f5854a ? C1950c.f5864c : C1950c.f5863b;
        }
        return new C1950c(this.f5854a, this.f5855b, this.f5856c);
    }

    public C1948a(Locale locale) {
        m5268b(C1950c.m5275d(locale));
    }

    public C1948a(boolean z) {
        m5268b(z);
    }
}
