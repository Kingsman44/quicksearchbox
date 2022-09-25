package org.p5633c.p5634a;

/* renamed from: org.c.a.p */
/* compiled from: PG */
final class C72292p extends C72293q {
    private static final long serialVersionUID = 31156755687123L;

    /* renamed from: n */
    private final byte f192435n;

    public C72292p(String str, byte b) {
        super(str);
        this.f192435n = b;
    }

    private Object readResolve() {
        switch (this.f192435n) {
            case 1:
                return f192436a;
            case 2:
                return f192437b;
            case 3:
                return f192438c;
            case 4:
                return f192439d;
            case 5:
                return f192440e;
            case 6:
                return f192441f;
            case 7:
                return f192442g;
            case 8:
                return f192443h;
            case 9:
                return f192444i;
            case 10:
                return f192445j;
            case 11:
                return f192446k;
            default:
                return f192447l;
        }
    }

    /* renamed from: a */
    public final C72291o mo63674a(C72132a aVar) {
        C72132a c = C72285i.m106775c(aVar);
        switch (this.f192435n) {
            case 1:
                return c.mo63328F();
            case 2:
                return c.mo63326D();
            case 3:
                return c.mo63336N();
            case 4:
                return c.mo63337O();
            case 5:
                return c.mo63333K();
            case 6:
                return c.mo63335M();
            case 7:
                return c.mo63327E();
            case 8:
                return c.mo63329G();
            case 9:
                return c.mo63330H();
            case 10:
                return c.mo63332J();
            case 11:
                return c.mo63334L();
            default:
                return c.mo63331I();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C72292p) && this.f192435n == ((C72292p) obj).f192435n;
    }

    public final int hashCode() {
        return 1 << this.f192435n;
    }
}
