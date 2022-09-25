package p5462h.p5480j;

import java.util.NoSuchElementException;
import p5462h.p5463a.C69503at;

/* renamed from: h.j.e */
/* compiled from: PG */
public final class C69697e extends C69503at {

    /* renamed from: a */
    private final long f186070a;

    /* renamed from: b */
    private boolean f186071b;

    /* renamed from: c */
    private long f186072c;

    public C69697e(long j, long j2) {
        this.f186070a = j2;
        boolean z = j <= j2;
        this.f186071b = z;
        this.f186072c = true != z ? j2 : j;
    }

    /* renamed from: a */
    public final long mo61233a() {
        long j = this.f186072c;
        if (j != this.f186070a) {
            this.f186072c = 1 + j;
        } else if (this.f186071b) {
            this.f186071b = false;
        } else {
            throw new NoSuchElementException();
        }
        return j;
    }

    public final boolean hasNext() {
        return this.f186071b;
    }
}
