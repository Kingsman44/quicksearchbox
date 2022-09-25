package androidx.media3.p132b;

import android.net.Uri;
import androidx.media3.common.C2591ar;
import androidx.media3.common.p136b.C2601a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.media3.b.n */
/* compiled from: PG */
public final class C2510n {

    /* renamed from: a */
    public final Uri f6891a;

    /* renamed from: b */
    public final long f6892b;

    /* renamed from: c */
    public final int f6893c;

    /* renamed from: d */
    public final byte[] f6894d;

    /* renamed from: e */
    public final Map f6895e;

    /* renamed from: f */
    public final long f6896f;

    /* renamed from: g */
    public final long f6897g;

    /* renamed from: h */
    public final String f6898h;

    /* renamed from: i */
    public final int f6899i;

    static {
        C2591ar.m6797b("media3.datasource");
    }

    public C2510n(Uri uri) {
        this(uri, 0, -1);
    }

    /* renamed from: d */
    public static String m6616d() {
        return "GET";
    }

    /* renamed from: a */
    public final C2510n mo5936a(long j) {
        long j2 = this.f6897g;
        long j3 = -1;
        if (j2 != -1) {
            j3 = j2 - j;
        }
        return mo5937b(j, j3);
    }

    /* renamed from: b */
    public final C2510n mo5937b(long j, long j2) {
        long j3 = 0;
        if (j != 0) {
            j3 = j;
        } else if (this.f6897g == j2) {
            return this;
        }
        return new C2510n(this.f6891a, this.f6892b, this.f6895e, this.f6896f + j3, j2, this.f6898h, this.f6899i);
    }

    /* renamed from: c */
    public final boolean mo5938c(int i) {
        return (this.f6899i & i) == i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f6891a);
        long j = this.f6896f;
        long j2 = this.f6897g;
        String str = this.f6898h;
        int i = this.f6899i;
        return "DataSpec[GET " + valueOf + ", " + j + ", " + j2 + ", " + str + ", " + i + "]";
    }

    public C2510n(Uri uri, long j, Map map, long j2, long j3, String str, int i) {
        long j4;
        long j5 = j;
        long j6 = j2;
        boolean z = false;
        C2601a.m6830b(j5 + j6 >= 0);
        C2601a.m6830b(j6 >= 0);
        if (j3 <= 0) {
            j4 = -1;
            if (j3 != -1) {
                j4 = j3;
                C2601a.m6830b(z);
                this.f6891a = uri;
                this.f6892b = j5;
                this.f6893c = 1;
                this.f6894d = null;
                this.f6895e = Collections.unmodifiableMap(new HashMap(map));
                this.f6896f = j6;
                this.f6897g = j4;
                this.f6898h = str;
                this.f6899i = i;
            }
        } else {
            j4 = j3;
        }
        z = true;
        C2601a.m6830b(z);
        this.f6891a = uri;
        this.f6892b = j5;
        this.f6893c = 1;
        this.f6894d = null;
        this.f6895e = Collections.unmodifiableMap(new HashMap(map));
        this.f6896f = j6;
        this.f6897g = j4;
        this.f6898h = str;
        this.f6899i = i;
    }

    public C2510n(Uri uri, long j, long j2) {
        this(uri, 0, Collections.emptyMap(), j, j2, (String) null, 0);
    }
}
