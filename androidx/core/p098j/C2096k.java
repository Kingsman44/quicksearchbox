package androidx.core.p098j;

import android.view.ContentInfo;
import p3186j$.util.Objects;

/* renamed from: androidx.core.j.k */
/* compiled from: PG */
public final class C2096k {

    /* renamed from: a */
    public final C2094i f6012a;

    public C2096k(C2094i iVar) {
        this.f6012a = iVar;
    }

    /* renamed from: b */
    public static C2096k m5775b(ContentInfo contentInfo) {
        return new C2096k(new C2093h(contentInfo));
    }

    /* renamed from: a */
    public final ContentInfo mo5268a() {
        return (ContentInfo) Objects.requireNonNull(this.f6012a.mo5265d());
    }

    public final String toString() {
        return this.f6012a.toString();
    }
}
