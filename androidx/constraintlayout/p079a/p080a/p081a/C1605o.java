package androidx.constraintlayout.p079a.p080a.p081a;

/* renamed from: androidx.constraintlayout.a.a.a.o */
/* compiled from: PG */
public final class C1605o extends C1596f {

    /* renamed from: a */
    final double f4437a;

    /* renamed from: b */
    final double f4438b;

    public C1605o(String str) {
        this.f4400g = str;
        int indexOf = str.indexOf(40);
        int indexOf2 = str.indexOf(44, indexOf);
        this.f4437a = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
        int i = indexOf2 + 1;
        this.f4438b = Double.parseDouble(str.substring(i, str.indexOf(44, i)).trim());
    }

    /* renamed from: a */
    public final double mo4521a(double d) {
        double d2 = this.f4438b;
        return d < d2 ? (d2 * d) / (d + (this.f4437a * (d2 - d))) : ((1.0d - d2) * (-1.0d + d)) / ((1.0d - d) - (this.f4437a * (d2 - d)));
    }

    /* renamed from: b */
    public final double mo4522b(double d) {
        double d2 = this.f4438b;
        if (d < d2) {
            double d3 = this.f4437a;
            double d4 = ((d2 - d) * d3) + d;
            return ((d3 * d2) * d2) / (d4 * d4);
        }
        double d5 = this.f4437a;
        double d6 = -1.0d + d2;
        double d7 = (((-d5) * (d2 - d)) - d) + 1.0d;
        return ((d5 * d6) * d6) / (d7 * d7);
    }
}
