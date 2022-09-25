package org.p5633c.p5634a;

/* renamed from: org.c.a.r */
/* compiled from: PG */
public final class C72294r extends IllegalArgumentException {
    private static final long serialVersionUID = 6305711765985447737L;

    /* renamed from: a */
    public String f192449a = super.getMessage();

    public C72294r(C72283g gVar, Number number, Number number2, Number number3) {
        super(m106828a(gVar.f192410z, number, number2, number3, (String) null));
        String str = gVar.f192410z;
    }

    /* renamed from: a */
    private static String m106828a(String str, Number number, Number number2, Number number3, String str2) {
        StringBuilder sb = new StringBuilder("Value ");
        sb.append(number);
        sb.append(" for ");
        sb.append(str);
        sb.append(' ');
        if (number2 == null) {
            if (number3 == null) {
                sb.append("is not supported");
            } else {
                sb.append("must not be larger than ");
                sb.append(number3);
            }
        } else if (number3 == null) {
            sb.append("must not be smaller than ");
            sb.append(number2);
        } else {
            sb.append("must be in the range [");
            sb.append(number2);
            sb.append(',');
            sb.append(number3);
            sb.append(']');
        }
        if (str2 != null) {
            sb.append(": ");
            sb.append(str2);
        }
        return sb.toString();
    }

    public final String getMessage() {
        return this.f192449a;
    }

    public C72294r(C72283g gVar, Number number, String str) {
        super(m106828a(gVar.f192410z, number, (Number) null, (Number) null, str));
        String str2 = gVar.f192410z;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C72294r(org.p5633c.p5634a.C72283g r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r3 = r3.f192410z
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            java.lang.String r1 = "Value \""
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = "\" for "
            r0.append(r4)
            r0.append(r3)
            java.lang.String r3 = " is not supported"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            java.lang.String r3 = super.getMessage()
            r2.f192449a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.p5633c.p5634a.C72294r.<init>(org.c.a.g, java.lang.String):void");
    }
}
