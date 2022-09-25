package com.google.android.libraries.social.populous.p3296e.p3298b;

/* renamed from: com.google.android.libraries.social.populous.e.b.i */
/* compiled from: PG */
public final class C42430i extends C42420aq {

    /* renamed from: a */
    private C42419ap f111334a;

    /* renamed from: b */
    private double f111335b;

    /* renamed from: c */
    private double f111336c;

    /* renamed from: d */
    private byte f111337d;

    /* renamed from: a */
    public final C42421ar mo45440a() {
        C42419ap apVar;
        if (this.f111337d == 3 && (apVar = this.f111334a) != null) {
            return new C42431j(apVar, this.f111335b, this.f111336c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f111334a == null) {
            sb.append(" featureType");
        }
        if ((this.f111337d & 1) == 0) {
            sb.append(" weight");
        }
        if ((this.f111337d & 2) == 0) {
            sb.append(" exponent");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo45441b(double d) {
        this.f111336c = d;
        this.f111337d = (byte) (this.f111337d | 2);
    }

    /* renamed from: c */
    public final void mo45442c(C42419ap apVar) {
        if (apVar != null) {
            this.f111334a = apVar;
            return;
        }
        throw new NullPointerException("Null featureType");
    }

    /* renamed from: d */
    public final void mo45443d(double d) {
        this.f111335b = d;
        this.f111337d = (byte) (this.f111337d | 1);
    }
}
