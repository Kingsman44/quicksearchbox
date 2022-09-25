package androidx.media3.exoplayer.dash;

import androidx.media3.common.C2583aj;
import androidx.media3.common.C2590aq;
import androidx.media3.common.C2649bk;
import androidx.media3.common.C2650bl;
import androidx.media3.common.C2651bm;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.exoplayer.dash.p141a.C2910a;
import androidx.media3.exoplayer.dash.p141a.C2912c;
import androidx.media3.exoplayer.dash.p141a.C2917h;
import androidx.media3.exoplayer.dash.p141a.C2922m;

/* renamed from: androidx.media3.exoplayer.dash.i */
/* compiled from: PG */
final class C2940i extends C2651bm {

    /* renamed from: a */
    private final long f8438a;

    /* renamed from: b */
    private final long f8439b;

    /* renamed from: d */
    private final long f8440d;

    /* renamed from: e */
    private final int f8441e;

    /* renamed from: f */
    private final long f8442f;

    /* renamed from: g */
    private final long f8443g;

    /* renamed from: h */
    private final long f8444h;

    /* renamed from: i */
    private final C2912c f8445i;

    /* renamed from: j */
    private final C2590aq f8446j;

    /* renamed from: k */
    private final C2583aj f8447k;

    public C2940i(long j, long j2, long j3, int i, long j4, long j5, long j6, C2912c cVar, C2590aq aqVar, C2583aj ajVar) {
        C2912c cVar2 = cVar;
        C2583aj ajVar2 = ajVar;
        C2601a.m6832d(cVar2.f8319d == (ajVar2 != null));
        this.f8438a = j;
        this.f8439b = j2;
        this.f8440d = j3;
        this.f8441e = i;
        this.f8442f = j4;
        this.f8443g = j5;
        this.f8444h = j6;
        this.f8445i = cVar2;
        this.f8446j = aqVar;
        this.f8447k = ajVar2;
    }

    /* renamed from: p */
    private static boolean m8310p(C2912c cVar) {
        return cVar.f8319d && cVar.f8320e != -9223372036854775807L && cVar.f8317b == -9223372036854775807L;
    }

    /* renamed from: a */
    public final int mo6020a(Object obj) {
        int intValue;
        if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue() - this.f8441e) >= 0 && intValue < this.f8445i.mo6764a()) {
            return intValue;
        }
        return -1;
    }

    /* renamed from: b */
    public final int mo6021b() {
        return this.f8445i.mo6764a();
    }

    /* renamed from: c */
    public final int mo6022c() {
        return 1;
    }

    /* renamed from: d */
    public final C2649bk mo6023d(int i, C2649bk bkVar, boolean z) {
        C2601a.m6834f(i, this.f8445i.mo6764a());
        Integer num = null;
        String str = z ? this.f8445i.mo6766c(i).f8350a : null;
        if (z) {
            num = Integer.valueOf(this.f8441e + i);
        }
        bkVar.mo6291j(str, num, 0, C2612ak.m6998w(this.f8445i.mo6765b(i)), C2612ak.m6998w(this.f8445i.mo6766c(i).f8351b - this.f8445i.mo6766c(0).f8351b) - this.f8442f);
        return bkVar;
    }

    /* renamed from: e */
    public final C2650bl mo6024e(int i, C2650bl blVar, long j) {
        C2947p k;
        C2601a.m6834f(i, 1);
        long j2 = this.f8444h;
        if (m8310p(this.f8445i)) {
            if (j > 0) {
                j2 += j;
                if (j2 > this.f8443g) {
                    j2 = -9223372036854775807L;
                }
            }
            long j3 = this.f8442f + j2;
            long w = C2612ak.m6998w(this.f8445i.mo6765b(0));
            int i2 = 0;
            while (i2 < this.f8445i.mo6764a() - 1 && j3 >= w) {
                j3 -= w;
                i2++;
                w = C2612ak.m6998w(this.f8445i.mo6765b(i2));
            }
            C2917h c = this.f8445i.mo6766c(i2);
            int size = c.f8352c.size();
            int i3 = 0;
            while (true) {
                if (i3 < size) {
                    if (((C2910a) c.f8352c.get(i3)).f8307b == 2) {
                        break;
                    }
                    i3++;
                } else {
                    i3 = -1;
                    break;
                }
            }
            if (!(i3 == -1 || (k = ((C2922m) ((C2910a) c.f8352c.get(i3)).f8308c.get(0)).mo6789k()) == null || k.mo6784f(w) == 0)) {
                j2 = (j2 + k.mo6786h(k.mo6785g(j3, w))) - j3;
            }
        }
        long j4 = j2;
        Object obj = C2650bl.f7335a;
        C2590aq aqVar = this.f8446j;
        C2912c cVar = this.f8445i;
        blVar.mo6293b(obj, aqVar, cVar, this.f8438a, this.f8439b, this.f8440d, true, m8310p(cVar), this.f8447k, j4, this.f8443g, 0, this.f8445i.mo6764a() - 1, this.f8442f);
        return blVar;
    }

    /* renamed from: f */
    public final Object mo6026f(int i) {
        C2601a.m6834f(i, this.f8445i.mo6764a());
        return Integer.valueOf(this.f8441e + i);
    }
}
