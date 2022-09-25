package androidx.media3.exoplayer.p145h;

import android.util.Pair;
import androidx.media3.common.C2583aj;
import androidx.media3.common.C2590aq;
import androidx.media3.common.C2649bk;
import androidx.media3.common.C2650bl;
import androidx.media3.common.C2651bm;
import androidx.media3.common.p136b.C2612ak;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;

/* renamed from: androidx.media3.exoplayer.h.t */
/* compiled from: PG */
final class C3125t extends C2651bm {

    /* renamed from: a */
    private final C2590aq f9157a;

    /* renamed from: b */
    private final C58485gu f9158b;

    /* renamed from: d */
    private final C58485gu f9159d;

    /* renamed from: e */
    private final C58485gu f9160e;

    /* renamed from: f */
    private final boolean f9161f;

    /* renamed from: g */
    private final boolean f9162g;

    /* renamed from: h */
    private final long f9163h;

    /* renamed from: i */
    private final long f9164i;

    /* renamed from: j */
    private final Object f9165j;

    public C3125t(C2590aq aqVar, C58485gu guVar, C58485gu guVar2, C58485gu guVar3, boolean z, boolean z2, long j, long j2, Object obj) {
        this.f9157a = aqVar;
        this.f9158b = guVar;
        this.f9159d = guVar2;
        this.f9160e = guVar3;
        this.f9161f = z;
        this.f9162g = z2;
        this.f9163h = j;
        this.f9164i = j2;
        this.f9165j = obj;
    }

    /* renamed from: p */
    private final int m9092p(int i) {
        return C2612ak.m6977b(this.f9159d, Integer.valueOf(i + 1), false, false);
    }

    /* renamed from: a */
    public final int mo6020a(Object obj) {
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            if (pair.first instanceof Integer) {
                int n = C3127v.m9102n(obj);
                int a = ((C2651bm) this.f9158b.get(n)).mo6020a(pair.second);
                if (a == -1) {
                    return -1;
                }
                return ((Integer) this.f9159d.get(n)).intValue() + a;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final int mo6021b() {
        return ((C58724pq) this.f9160e).f156474d;
    }

    /* renamed from: c */
    public final int mo6022c() {
        return 1;
    }

    /* renamed from: d */
    public final C2649bk mo6023d(int i, C2649bk bkVar, boolean z) {
        int p = m9092p(i);
        ((C2651bm) this.f9158b.get(p)).mo6023d(i - ((Integer) this.f9159d.get(p)).intValue(), bkVar, z);
        bkVar.f7330c = 0;
        bkVar.f7332e = ((Long) this.f9160e.get(i)).longValue();
        if (z) {
            Object obj = bkVar.f7329b;
            obj.getClass();
            bkVar.f7329b = Pair.create(Integer.valueOf(p), obj);
        }
        return bkVar;
    }

    /* renamed from: e */
    public final C2650bl mo6024e(int i, C2650bl blVar, long j) {
        Object obj = C2650bl.f7335a;
        C2590aq aqVar = this.f9157a;
        Object obj2 = this.f9165j;
        boolean z = this.f9161f;
        boolean z2 = this.f9162g;
        long j2 = this.f9164i;
        long j3 = this.f9163h;
        C58485gu guVar = this.f9160e;
        blVar.mo6293b(obj, aqVar, obj2, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, z, z2, (C2583aj) null, j2, j3, 0, ((C58724pq) guVar).f156474d - 1, -((Long) guVar.get(0)).longValue());
        return blVar;
    }

    /* renamed from: f */
    public final Object mo6026f(int i) {
        int p = m9092p(i);
        return Pair.create(Integer.valueOf(p), ((C2651bm) this.f9158b.get(p)).mo6026f(i - ((Integer) this.f9159d.get(p)).intValue()));
    }

    /* renamed from: n */
    public final C2649bk mo6303n(Object obj, C2649bk bkVar) {
        int n = C3127v.m9102n(obj);
        Object obj2 = ((Pair) obj).second;
        C2651bm bmVar = (C2651bm) this.f9158b.get(n);
        int intValue = ((Integer) this.f9159d.get(n)).intValue();
        int a = bmVar.mo6020a(obj2);
        bmVar.mo6303n(obj2, bkVar);
        bkVar.f7330c = 0;
        bkVar.f7332e = ((Long) this.f9160e.get(intValue + a)).longValue();
        bkVar.f7329b = obj;
        return bkVar;
    }
}
