package androidx.media3.exoplayer.p139c;

import androidx.media3.exoplayer.p145h.C3036as;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.media3.exoplayer.c.e */
/* compiled from: PG */
public final class C2862e {

    /* renamed from: a */
    public final int f8044a;

    /* renamed from: b */
    public final C3036as f8045b;

    /* renamed from: c */
    private final CopyOnWriteArrayList f8046c;

    public C2862e() {
        this(new CopyOnWriteArrayList(), 0, (C3036as) null);
    }

    private C2862e(CopyOnWriteArrayList copyOnWriteArrayList, int i, C3036as asVar) {
        this.f8046c = copyOnWriteArrayList;
        this.f8044a = i;
        this.f8045b = asVar;
    }

    /* renamed from: a */
    public final C2862e mo6607a(int i, C3036as asVar) {
        return new C2862e(this.f8046c, i, asVar);
    }

    /* renamed from: b */
    public final void mo6608b(C2863f fVar) {
        Iterator it = this.f8046c.iterator();
        while (it.hasNext()) {
            C2861d dVar = (C2861d) it.next();
            if (dVar.f8043a == fVar) {
                this.f8046c.remove(dVar);
            }
        }
    }

    /* renamed from: c */
    public final void mo6609c(C2863f fVar) {
        fVar.getClass();
        this.f8046c.add(new C2861d(fVar));
    }
}
