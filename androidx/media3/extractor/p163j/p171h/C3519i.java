package androidx.media3.extractor.p163j.p171h;

/* renamed from: androidx.media3.extractor.j.h.i */
/* compiled from: PG */
final class C3519i implements Comparable {

    /* renamed from: a */
    public final int f11000a;

    /* renamed from: b */
    public final C3514d f11001b;

    public C3519i(int i, C3514d dVar) {
        this.f11000a = i;
        this.f11001b = dVar;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int i = this.f11000a;
        int i2 = ((C3519i) obj).f11000a;
        if (i == i2) {
            return 0;
        }
        return i >= i2 ? 1 : -1;
    }
}
