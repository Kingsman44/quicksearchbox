package org.p5633c.p5634a;

/* renamed from: org.c.a.f */
/* compiled from: PG */
public final class C72270f extends C72283g {
    private static final long serialVersionUID = -9937958251642L;

    /* renamed from: A */
    private final byte f192350A;

    /* renamed from: a */
    public final transient C72293q f192351a;

    /* renamed from: b */
    public final transient C72293q f192352b;

    public C72270f(String str, byte b, C72293q qVar, C72293q qVar2) {
        super(str);
        this.f192350A = b;
        this.f192351a = qVar;
        this.f192352b = qVar2;
    }

    private Object readResolve() {
        switch (this.f192350A) {
            case 1:
                return C72283g.f192387c;
            case 2:
                return C72283g.f192388d;
            case 3:
                return C72283g.f192389e;
            case 4:
                return C72283g.f192390f;
            case 5:
                return C72283g.f192391g;
            case 6:
                return C72283g.f192392h;
            case 7:
                return C72283g.f192393i;
            case 8:
                return C72283g.f192394j;
            case 9:
                return C72283g.f192395k;
            case 10:
                return C72283g.f192396l;
            case 11:
                return C72283g.f192397m;
            case 12:
                return C72283g.f192398n;
            case 13:
                return C72283g.f192399o;
            case 14:
                return C72283g.f192400p;
            case 15:
                return C72283g.f192401q;
            case 16:
                return C72283g.f192402r;
            case 17:
                return C72283g.f192403s;
            case 18:
                return C72283g.f192404t;
            case 19:
                return C72283g.f192405u;
            case 20:
                return C72283g.f192406v;
            case 21:
                return C72283g.f192407w;
            case 22:
                return C72283g.f192408x;
            default:
                return C72283g.f192409y;
        }
    }

    /* renamed from: a */
    public final C72233e mo63646a(C72132a aVar) {
        C72132a c = C72285i.m106775c(aVar);
        switch (this.f192350A) {
            case 1:
                return c.mo63355l();
            case 2:
                return c.mo63324B();
            case 3:
                return c.mo63349f();
            case 4:
                return c.mo63323A();
            case 5:
                return c.mo63370z();
            case 6:
                return c.mo63354k();
            case 7:
                return c.mo63363t();
            case 8:
                return c.mo63352i();
            case 9:
                return c.mo63369y();
            case 10:
                return c.mo63368x();
            case 11:
                return c.mo63367w();
            case 12:
                return c.mo63353j();
            case 13:
                return c.mo63356m();
            case 14:
                return c.mo63358o();
            case 15:
                return c.mo63351h();
            case 16:
                return c.mo63350g();
            case 17:
                return c.mo63357n();
            case 18:
                return c.mo63361r();
            case 19:
                return c.mo63362s();
            case 20:
                return c.mo63365u();
            case 21:
                return c.mo63366v();
            case 22:
                return c.mo63359p();
            default:
                return c.mo63360q();
        }
    }

    /* renamed from: b */
    public final C72293q mo63647b() {
        return this.f192351a;
    }

    /* renamed from: c */
    public final C72293q mo63648c() {
        return this.f192352b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C72270f) && this.f192350A == ((C72270f) obj).f192350A;
    }

    public final int hashCode() {
        return 1 << this.f192350A;
    }
}
