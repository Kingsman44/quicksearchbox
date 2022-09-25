package androidx.media3.exoplayer.hls.p148a;

import androidx.media3.common.DrmInitData;

/* renamed from: androidx.media3.exoplayer.hls.a.j */
/* compiled from: PG */
public class C3142j implements Comparable {

    /* renamed from: c */
    public final String f9259c;

    /* renamed from: d */
    public final C3141i f9260d;

    /* renamed from: e */
    public final long f9261e;

    /* renamed from: f */
    public final int f9262f;

    /* renamed from: g */
    public final long f9263g;

    /* renamed from: h */
    public final DrmInitData f9264h;

    /* renamed from: i */
    public final String f9265i;

    /* renamed from: j */
    public final String f9266j;

    /* renamed from: k */
    public final long f9267k;

    /* renamed from: l */
    public final long f9268l;

    /* renamed from: m */
    public final boolean f9269m;

    public C3142j(String str, C3141i iVar, long j, int i, long j2, DrmInitData drmInitData, String str2, String str3, long j3, long j4, boolean z) {
        this.f9259c = str;
        this.f9260d = iVar;
        this.f9261e = j;
        this.f9262f = i;
        this.f9263g = j2;
        this.f9264h = drmInitData;
        this.f9265i = str2;
        this.f9266j = str3;
        this.f9267k = j3;
        this.f9268l = j4;
        this.f9269m = z;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        Long l = (Long) obj;
        if (this.f9263g > l.longValue()) {
            return 1;
        }
        return this.f9263g >= l.longValue() ? 0 : -1;
    }
}
