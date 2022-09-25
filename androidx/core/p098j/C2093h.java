package androidx.core.p098j;

import android.content.ClipData;
import android.view.ContentInfo;

/* renamed from: androidx.core.j.h */
/* compiled from: PG */
final class C2093h implements C2094i {

    /* renamed from: a */
    private final ContentInfo f6006a;

    public C2093h(ContentInfo contentInfo) {
        contentInfo.getClass();
        this.f6006a = contentInfo;
    }

    /* renamed from: a */
    public final int mo5262a() {
        return this.f6006a.getFlags();
    }

    /* renamed from: b */
    public final int mo5263b() {
        return this.f6006a.getSource();
    }

    /* renamed from: c */
    public final ClipData mo5264c() {
        return this.f6006a.getClip();
    }

    /* renamed from: d */
    public final ContentInfo mo5265d() {
        return this.f6006a;
    }

    public final String toString() {
        return "ContentInfoCompat{" + this.f6006a + "}";
    }
}
