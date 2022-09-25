package androidx.media3.p132b.p133a;

import java.util.Comparator;

/* renamed from: androidx.media3.b.a.v */
/* compiled from: PG */
public final /* synthetic */ class C2477v implements Comparator {

    /* renamed from: a */
    public static final /* synthetic */ C2477v f6813a = new C2477v();

    private /* synthetic */ C2477v() {
    }

    public final int compare(Object obj, Object obj2) {
        C2467l lVar = (C2467l) obj;
        C2467l lVar2 = (C2467l) obj2;
        long j = lVar.f6787f;
        long j2 = lVar2.f6787f;
        if (j - j2 == 0) {
            return lVar.compareTo(lVar2);
        }
        return j >= j2 ? 1 : -1;
    }
}
