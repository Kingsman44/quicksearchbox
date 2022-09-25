package androidx.media3.exoplayer.p150j;

import android.os.SystemClock;
import androidx.media3.common.C2652bn;
import androidx.media3.common.C2680x;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.exoplayer.p145h.p147b.C3059o;
import androidx.media3.exoplayer.p145h.p147b.C3061q;
import androidx.media3.exoplayer.p151k.C3240f;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58557jl;
import java.util.List;

/* renamed from: androidx.media3.exoplayer.j.b */
/* compiled from: PG */
public final class C3206b extends C3208d {

    /* renamed from: e */
    private final C3240f f9618e;

    /* renamed from: f */
    private final C58485gu f9619f;

    /* renamed from: g */
    private float f9620g = 1.0f;

    /* renamed from: h */
    private int f9621h;

    /* renamed from: i */
    private int f9622i = 0;

    /* renamed from: j */
    private long f9623j = -9223372036854775807L;

    /* renamed from: k */
    private C3059o f9624k;

    public C3206b(C2652bn bnVar, int[] iArr, C3240f fVar, List list) {
        super(bnVar, iArr);
        this.f9618e = fVar;
        this.f9619f = C58485gu.m89842j(list);
    }

    /* renamed from: t */
    public static void m9391t(List list, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < list.size(); i++) {
            C58480gp gpVar = (C58480gp) list.get(i);
            if (gpVar != null) {
                gpVar.mo55395g(new C3193a(j, jArr[i]));
            }
        }
    }

    /* renamed from: u */
    private static final long m9392u(List list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        C3059o oVar = (C3059o) C58557jl.m90131l(list);
        long j = oVar.f8851q;
        if (j != -9223372036854775807L) {
            long j2 = oVar.f8852r;
            if (j2 != -9223372036854775807L) {
                return j2 - j;
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: v */
    private final int m9393v(long j) {
        long e = (long) (((float) ((long) (((float) this.f9618e.mo7233e()) * 0.7f))) / this.f9620g);
        if (!this.f9619f.isEmpty()) {
            int i = 1;
            while (i < this.f9619f.size() - 1 && ((C3193a) this.f9619f.get(i)).f9581a < e) {
                i++;
            }
            C3193a aVar = (C3193a) this.f9619f.get(i - 1);
            C3193a aVar2 = (C3193a) this.f9619f.get(i);
            long j2 = aVar.f9581a;
            long j3 = aVar2.f9581a;
            long j4 = aVar.f9582b;
            e = ((long) ((((float) (e - j2)) / ((float) (j3 - j2))) * ((float) (aVar2.f9582b - j4)))) + j4;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f9627b; i3++) {
            if (j == Long.MIN_VALUE || !mo7040r(i3, j)) {
                if (((long) this.f9629d[i3].f7492j) <= e) {
                    return i3;
                }
                i2 = i3;
            }
        }
        return i2;
    }

    /* renamed from: a */
    public final int mo7021a() {
        return this.f9621h;
    }

    /* renamed from: b */
    public final int mo7022b() {
        return this.f9622i;
    }

    /* renamed from: c */
    public final Object mo7023c() {
        return null;
    }

    /* renamed from: d */
    public final void mo7024d(long j, long j2, long j3, List list, C3061q[] qVarArr) {
        long u;
        C3061q[] qVarArr2 = qVarArr;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i = this.f9621h;
        int length = qVarArr2.length;
        int i2 = 0;
        if (i >= length || !qVarArr2[i].mo6981d()) {
            while (true) {
                if (i2 >= length) {
                    u = m9392u(list);
                    break;
                }
                C3061q qVar = qVarArr2[i2];
                if (qVar.mo6981d()) {
                    u = qVar.mo6838a() - qVar.mo6839b();
                    break;
                }
                i2++;
            }
        } else {
            C3061q qVar2 = qVarArr2[this.f9621h];
            u = qVar2.mo6838a() - qVar2.mo6839b();
        }
        int i3 = this.f9622i;
        if (i3 == 0) {
            this.f9622i = 1;
            this.f9621h = m9393v(elapsedRealtime);
            return;
        }
        int i4 = this.f9621h;
        int i5 = list.isEmpty() ? -1 : mo7031i(((C3059o) C58557jl.m90131l(list)).f8848n);
        if (i5 != -1) {
            i3 = ((C3059o) C58557jl.m90131l(list)).f8849o;
            i4 = i5;
        }
        int v = m9393v(elapsedRealtime);
        if (!mo7040r(i4, elapsedRealtime)) {
            C2680x[] xVarArr = this.f9629d;
            C2680x xVar = xVarArr[i4];
            C2680x xVar2 = xVarArr[v];
            long j4 = 10000000;
            if (j3 != -9223372036854775807L) {
                j4 = Math.min((long) (((float) (u != -9223372036854775807L ? j3 - u : j3)) * 0.75f), 10000000);
            }
            int i6 = xVar2.f7492j;
            int i7 = xVar.f7492j;
            if ((i6 > i7 && j2 < j4) || (i6 < i7 && j2 >= 25000000)) {
                v = i4;
            }
        }
        if (v != i4) {
            i3 = 3;
        }
        this.f9622i = i3;
        this.f9621h = v;
    }

    /* renamed from: e */
    public final int mo7025e(long j, List list) {
        int i;
        int i2;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.f9623j;
        if (j2 != -9223372036854775807L && elapsedRealtime - j2 < 1000 && (list.isEmpty() || ((C3059o) C58557jl.m90131l(list)).equals(this.f9624k))) {
            return list.size();
        }
        this.f9623j = elapsedRealtime;
        this.f9624k = list.isEmpty() ? null : (C3059o) C58557jl.m90131l(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        if (C2612ak.m6997v(((C3059o) list.get(size - 1)).f8851q - j, this.f9620g) < 25000000) {
            return size;
        }
        m9392u(list);
        C2680x xVar = this.f9629d[m9393v(elapsedRealtime)];
        for (int i3 = 0; i3 < size; i3++) {
            C3059o oVar = (C3059o) list.get(i3);
            C2680x xVar2 = oVar.f8848n;
            if (C2612ak.m6997v(oVar.f8851q - j, this.f9620g) >= 25000000 && xVar2.f7492j < xVar.f7492j && (i = xVar2.f7502t) != -1 && i <= 719 && (i2 = xVar2.f7501s) != -1 && i2 <= 1279 && i < xVar.f7502t) {
                return i3;
            }
        }
        return size;
    }

    /* renamed from: n */
    public final void mo7036n() {
        this.f9624k = null;
    }

    /* renamed from: o */
    public final void mo7037o() {
        this.f9623j = -9223372036854775807L;
        this.f9624k = null;
    }

    /* renamed from: p */
    public final void mo7038p(float f) {
        this.f9620g = f;
    }
}
