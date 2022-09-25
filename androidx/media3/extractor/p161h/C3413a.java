package androidx.media3.extractor.p161h;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: androidx.media3.extractor.h.a */
/* compiled from: PG */
final class C3413a extends C3416c {

    /* renamed from: a */
    public final long f10451a;

    /* renamed from: b */
    public final List f10452b = new ArrayList();

    /* renamed from: c */
    public final List f10453c = new ArrayList();

    public C3413a(int i, long j) {
        super(i);
        this.f10451a = j;
    }

    /* renamed from: a */
    public final C3413a mo7379a(int i) {
        int size = this.f10453c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C3413a aVar = (C3413a) this.f10453c.get(i2);
            if (aVar.f10463d == i) {
                return aVar;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final C3415b mo7380b(int i) {
        int size = this.f10452b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C3415b bVar = (C3415b) this.f10452b.get(i2);
            if (bVar.f10463d == i) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: c */
    public final void mo7381c(C3413a aVar) {
        this.f10453c.add(aVar);
    }

    /* renamed from: d */
    public final void mo7382d(C3415b bVar) {
        this.f10452b.add(bVar);
    }

    public final String toString() {
        String f = m9894f(this.f10463d);
        String arrays = Arrays.toString(this.f10452b.toArray());
        String arrays2 = Arrays.toString(this.f10453c.toArray());
        return f + " leaves: " + arrays + " containers: " + arrays2;
    }
}
