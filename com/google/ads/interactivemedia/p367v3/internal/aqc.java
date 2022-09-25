package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aqc */
/* compiled from: PG */
final class aqc extends aqa {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final Object f21381a;

    public aqc(Object obj) {
        this.f21381a = obj;
    }

    /* renamed from: a */
    public final Object mo15155a() {
        return this.f21381a;
    }

    /* renamed from: b */
    public final aqa mo15156b(apw apw) {
        Object apply = apw.apply(this.f21381a);
        aqd.m19283k(apply, "the Function passed to Optional.transform() must not return null.");
        return new aqc(apply);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aqc) {
            return this.f21381a.equals(((aqc) obj).f21381a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21381a.hashCode() + 1502476572;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f21381a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
        sb.append("Optional.of(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
