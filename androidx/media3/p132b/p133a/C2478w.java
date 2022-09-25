package androidx.media3.p132b.p133a;

import java.util.TreeSet;

/* renamed from: androidx.media3.b.a.w */
/* compiled from: PG */
public final class C2478w {

    /* renamed from: a */
    private final TreeSet f6814a = new TreeSet(C2477v.f6813a);

    /* renamed from: b */
    private long f6815b;

    /* renamed from: a */
    public final void mo5913a(C2457b bVar, long j) {
        while (this.f6815b + j > 104857600 && !this.f6814a.isEmpty()) {
            bVar.mo5874g((C2467l) this.f6814a.first());
        }
    }

    /* renamed from: b */
    public final void mo5914b(C2457b bVar, C2467l lVar) {
        this.f6814a.add(lVar);
        this.f6815b += lVar.f6784c;
        mo5913a(bVar, 0);
    }

    /* renamed from: c */
    public final void mo5915c(C2467l lVar) {
        this.f6814a.remove(lVar);
        this.f6815b -= lVar.f6784c;
    }
}
