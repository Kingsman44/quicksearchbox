package androidx.media3.exoplayer.dash.p141a;

import androidx.media3.common.C2680x;
import com.google.common.p4573p.C60711a;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* renamed from: androidx.media3.exoplayer.dash.a.p */
/* compiled from: PG */
public final class C2925p extends C2923n {

    /* renamed from: e */
    final C2931v f8378e;

    /* renamed from: f */
    final C2931v f8379f;

    /* renamed from: g */
    final long f8380g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2925p(C2919j jVar, long j, long j2, long j3, long j4, long j5, List list, long j6, C2931v vVar, C2931v vVar2, long j7, long j8) {
        super(jVar, j, j2, j3, j5, list, j6, j7, j8);
        this.f8378e = vVar;
        this.f8379f = vVar2;
        this.f8380g = j4;
    }

    /* renamed from: c */
    public final long mo6794c(long j) {
        List list = this.f8373c;
        if (list != null) {
            return (long) list.size();
        }
        long j2 = this.f8380g;
        if (j2 != -1) {
            return (j2 - this.f8371a) + 1;
        }
        if (j != -9223372036854775807L) {
            return C60711a.m92638a(BigInteger.valueOf(j).multiply(BigInteger.valueOf(this.f8386i)), BigInteger.valueOf(this.f8372b).multiply(BigInteger.valueOf(1000000)), RoundingMode.CEILING).longValue();
        }
        return -1;
    }

    /* renamed from: g */
    public final C2919j mo6798g(C2922m mVar, long j) {
        long j2;
        List list = this.f8373c;
        if (list != null) {
            j2 = ((C2926q) list.get((int) (j - this.f8371a))).f8381a;
        } else {
            j2 = (j - this.f8371a) * this.f8372b;
        }
        long j3 = j2;
        C2931v vVar = this.f8379f;
        C2680x xVar = mVar.f8366b;
        return new C2919j(vVar.mo6803a(xVar.f7485c, j, xVar.f7492j, j3), 0, -1);
    }

    /* renamed from: i */
    public final C2919j mo6800i(C2922m mVar) {
        C2931v vVar = this.f8378e;
        if (vVar == null) {
            return this.f8385h;
        }
        C2680x xVar = mVar.f8366b;
        return new C2919j(vVar.mo6803a(xVar.f7485c, 0, xVar.f7492j, 0), 0, -1);
    }
}
