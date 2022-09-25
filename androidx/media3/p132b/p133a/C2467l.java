package androidx.media3.p132b.p133a;

import java.io.File;

/* renamed from: androidx.media3.b.a.l */
/* compiled from: PG */
public class C2467l implements Comparable {

    /* renamed from: a */
    public final String f6782a;

    /* renamed from: b */
    public final long f6783b;

    /* renamed from: c */
    public final long f6784c;

    /* renamed from: d */
    public final boolean f6785d;

    /* renamed from: e */
    public final File f6786e;

    /* renamed from: f */
    public final long f6787f;

    public C2467l(String str, long j, long j2, long j3, File file) {
        this.f6782a = str;
        this.f6783b = j;
        this.f6784c = j2;
        this.f6785d = file != null;
        this.f6786e = file;
        this.f6787f = j3;
    }

    /* renamed from: a */
    public final int compareTo(C2467l lVar) {
        if (!this.f6782a.equals(lVar.f6782a)) {
            return this.f6782a.compareTo(lVar.f6782a);
        }
        long j = this.f6783b - lVar.f6783b;
        if (j == 0) {
            return 0;
        }
        return j >= 0 ? 1 : -1;
    }

    /* renamed from: b */
    public final boolean mo5891b() {
        return !this.f6785d;
    }

    public final String toString() {
        long j = this.f6783b;
        long j2 = this.f6784c;
        return "[" + j + ", " + j2 + "]";
    }
}
