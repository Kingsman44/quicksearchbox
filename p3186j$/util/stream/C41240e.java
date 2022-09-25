package p3186j$.util.stream;

/* renamed from: j$.util.stream.e */
abstract class C41240e {

    /* renamed from: a */
    protected int f107878a;

    /* renamed from: b */
    protected int f107879b;

    /* renamed from: c */
    protected long[] f107880c;

    protected C41240e() {
    }

    public abstract void clear();

    public final long count() {
        int i = this.f107879b;
        return i == 0 ? (long) this.f107878a : this.f107880c[i] + ((long) this.f107878a);
    }
}
