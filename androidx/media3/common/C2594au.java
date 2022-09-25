package androidx.media3.common;

/* renamed from: androidx.media3.common.au */
/* compiled from: PG */
public class C2594au {

    /* renamed from: a */
    public final Object f7204a;

    /* renamed from: b */
    public final int f7205b;

    /* renamed from: c */
    public final int f7206c;

    /* renamed from: d */
    public final long f7207d;

    /* renamed from: e */
    public final int f7208e;

    protected C2594au(C2594au auVar) {
        this.f7204a = auVar.f7204a;
        this.f7205b = auVar.f7205b;
        this.f7206c = auVar.f7206c;
        this.f7207d = auVar.f7207d;
        this.f7208e = auVar.f7208e;
    }

    public C2594au(Object obj, int i, int i2, long j, int i3) {
        this.f7204a = obj;
        this.f7205b = i;
        this.f7206c = i2;
        this.f7207d = j;
        this.f7208e = i3;
    }

    /* renamed from: a */
    public final boolean mo6102a() {
        return this.f7205b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2594au)) {
            return false;
        }
        C2594au auVar = (C2594au) obj;
        return this.f7204a.equals(auVar.f7204a) && this.f7205b == auVar.f7205b && this.f7206c == auVar.f7206c && this.f7207d == auVar.f7207d && this.f7208e == auVar.f7208e;
    }

    public final int hashCode() {
        return ((((((((this.f7204a.hashCode() + 527) * 31) + this.f7205b) * 31) + this.f7206c) * 31) + ((int) this.f7207d)) * 31) + this.f7208e;
    }
}
