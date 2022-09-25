package p5462h.p5480j;

import java.util.NoSuchElementException;
import p5462h.p5463a.C69502as;

/* renamed from: h.j.b */
/* compiled from: PG */
public final class C69694b extends C69502as {

    /* renamed from: a */
    public boolean f186062a;

    /* renamed from: b */
    private final int f186063b;

    /* renamed from: c */
    private final int f186064c;

    /* renamed from: d */
    private int f186065d;

    public C69694b(int i, int i2, int i3) {
        this.f186063b = i3;
        this.f186064c = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.f186062a = z;
        this.f186065d = true != z ? i2 : i;
    }

    /* renamed from: a */
    public final int mo5128a() {
        int i = this.f186065d;
        if (i != this.f186064c) {
            this.f186065d = this.f186063b + i;
        } else if (this.f186062a) {
            this.f186062a = false;
        } else {
            throw new NoSuchElementException();
        }
        return i;
    }

    public final boolean hasNext() {
        return this.f186062a;
    }
}
