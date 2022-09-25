package p5488io.grpc.p5527g.p5528a.p5529a;

/* renamed from: io.grpc.g.a.a.o */
/* compiled from: PG */
public final class C70786o {

    /* renamed from: a */
    public int f188769a;

    /* renamed from: b */
    public final int[] f188770b = new int[10];

    /* renamed from: a */
    public final int mo62479a() {
        if ((this.f188769a & 2) != 0) {
            return this.f188770b[1];
        }
        return -1;
    }

    /* renamed from: b */
    public final boolean mo62480b(int i) {
        return ((1 << i) & this.f188769a) != 0;
    }

    /* renamed from: c */
    public final void mo62481c(int i, int i2) {
        if (i < 10) {
            this.f188769a |= 1 << i;
            this.f188770b[i] = i2;
        }
    }
}
