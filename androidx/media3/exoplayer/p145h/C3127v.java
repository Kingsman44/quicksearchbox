package androidx.media3.exoplayer.p145h;

import android.os.Handler;
import android.util.Pair;
import androidx.media3.common.C2590aq;
import androidx.media3.common.C2649bk;
import androidx.media3.common.C2650bl;
import androidx.media3.common.C2651bm;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.exoplayer.p151k.C3241g;
import androidx.media3.p132b.C2495an;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import java.util.IdentityHashMap;

/* renamed from: androidx.media3.exoplayer.h.v */
/* compiled from: PG */
public final class C3127v extends C3115j {

    /* renamed from: a */
    public boolean f9170a;

    /* renamed from: b */
    private final C2590aq f9171b;

    /* renamed from: c */
    private final C58485gu f9172c;

    /* renamed from: d */
    private final IdentityHashMap f9173d = new IdentityHashMap();

    /* renamed from: e */
    private Handler f9174e;

    public C3127v(C2590aq aqVar, C58485gu guVar) {
        this.f9171b = aqVar;
        this.f9172c = guVar;
    }

    /* renamed from: F */
    private final void m9100F() {
        int i = 0;
        while (true) {
            C58485gu guVar = this.f9172c;
            if (i < ((C58724pq) guVar).f156474d) {
                C3126u uVar = (C3126u) guVar.get(i);
                if (uVar.f9169d == 0) {
                    mo7102e(Integer.valueOf(uVar.f9167b));
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: n */
    public static int m9102n(Object obj) {
        return ((Integer) ((Pair) obj).first).intValue();
    }

    /* renamed from: E */
    public final C3125t mo7110E() {
        int i;
        C3126u uVar;
        C2650bl blVar = new C2650bl();
        C2649bk bkVar = new C2649bk();
        C58480gp e = C58485gu.m89837e();
        C58480gp e2 = C58485gu.m89837e();
        C58480gp e3 = C58485gu.m89837e();
        int i2 = 0;
        boolean z = true;
        int i3 = 0;
        long j = 0;
        boolean z2 = false;
        Object obj = null;
        boolean z3 = true;
        boolean z4 = false;
        long j2 = 0;
        long j3 = 0;
        while (true) {
            C58485gu guVar = this.f9172c;
            if (i2 < ((C58724pq) guVar).f156474d) {
                C3126u uVar2 = (C3126u) guVar.get(i2);
                C3029al alVar = uVar2.f9166a.f8786a;
                C2601a.m6831c(!alVar.mo6304o(), "Can't concatenate empty child Timeline.");
                e.mo55395g(alVar);
                e2.mo55395g(Integer.valueOf(i3));
                int b = i3 + alVar.f8765a.mo6021b();
                int i4 = 0;
                while (i4 < alVar.f8765a.mo6022c()) {
                    int i5 = b;
                    long j4 = j;
                    alVar.mo6024e(i4, blVar, 0);
                    Object obj2 = !z2 ? blVar.f7339d : obj;
                    z = z && C2612ak.m6951aa(obj2, blVar.f7339d);
                    long j5 = blVar.f7349n;
                    if (j5 == -9223372036854775807L) {
                        j5 = uVar2.f9168c;
                        if (j5 == -9223372036854775807L) {
                            return null;
                        }
                    }
                    j2 += j5;
                    if (uVar2.f9167b == 0 && i4 == 0) {
                        j3 = blVar.f7348m;
                        j = -blVar.f7352q;
                        i4 = 0;
                    } else {
                        C2601a.m6831c(blVar.f7352q == 0, "Can't concatenate windows. A window has a non-zero offset in a period.");
                        j = j4;
                    }
                    z3 &= blVar.f7343h || blVar.f7347l;
                    z4 |= blVar.f7344i;
                    i4++;
                    obj = obj2;
                    z2 = true;
                    b = i5;
                }
                int i6 = b;
                long j6 = j;
                int b2 = alVar.f8765a.mo6021b();
                int i7 = 0;
                while (i7 < b2) {
                    e3.mo55395g(Long.valueOf(j));
                    alVar.mo6023d(i7, bkVar, false);
                    long j7 = j;
                    long j8 = bkVar.f7331d;
                    if (j8 == -9223372036854775807L) {
                        C2601a.m6831c(b2 == 1, "Can't concatenate multiple periods with unknown duration in one window.");
                        long j9 = blVar.f7349n;
                        if (j9 == -9223372036854775807L) {
                            j9 = uVar2.f9168c;
                        }
                        uVar = uVar2;
                        i = b2;
                        j8 = j9 + blVar.f7352q;
                    } else {
                        uVar = uVar2;
                        i = b2;
                    }
                    i7++;
                    uVar2 = uVar;
                    j = j7 + j8;
                    b2 = i;
                }
                long j10 = j;
                i2++;
                i3 = i6;
            } else {
                Object obj3 = null;
                C2590aq aqVar = this.f9171b;
                C58485gu f = e.mo55394f();
                C58485gu f2 = e2.mo55394f();
                C58485gu f3 = e3.mo55394f();
                if (true == z) {
                    obj3 = obj;
                }
                return new C3125t(aqVar, f, f2, f3, z3, z4, j2, j3, obj3);
            }
        }
    }

    /* renamed from: a */
    public final C2590aq mo6745a() {
        return this.f9171b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ int mo7101b(Object obj, int i) {
        Integer num = (Integer) obj;
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ C3036as mo6963d(Object obj, C3036as asVar) {
        Integer num = (Integer) obj;
        if (num.intValue() != ((int) (asVar.f7207d % ((long) ((C58724pq) this.f9172c).f156474d)))) {
            return null;
        }
        long j = asVar.f7207d / ((long) ((C58724pq) this.f9172c).f156474d);
        int intValue = num.intValue();
        return asVar.mo6972b(Pair.create(Integer.valueOf(intValue), asVar.f7204a)).mo6973c(j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo6750f(C2495an anVar) {
        super.mo6750f(anVar);
        this.f9174e = new Handler(new C3123r(this));
        int i = 0;
        while (true) {
            C58485gu guVar = this.f9172c;
            if (i < ((C58724pq) guVar).f156474d) {
                mo7104k(Integer.valueOf(i), ((C3126u) guVar.get(i)).f9166a);
                i++;
            } else {
                m9101G();
                return;
            }
        }
    }

    /* renamed from: h */
    public final void mo6752h(C3034aq aqVar) {
        C3126u uVar = (C3126u) this.f9173d.remove(aqVar);
        uVar.getClass();
        uVar.f9166a.mo6752h(aqVar);
        uVar.f9169d--;
        if (!this.f9173d.isEmpty()) {
            m9100F();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo6753i() {
        super.mo6753i();
        Handler handler = this.f9174e;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
            this.f9174e = null;
        }
        this.f9170a = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final /* synthetic */ void mo6964j(Object obj, C3038au auVar, C2651bm bmVar) {
        Integer num = (Integer) obj;
        m9101G();
    }

    /* renamed from: m */
    public final C3034aq mo6757m(C3036as asVar, C3241g gVar, long j) {
        C3126u uVar = (C3126u) this.f9172c.get(m9102n(asVar.f7204a));
        C3036as b = asVar.mo6972b(((Pair) asVar.f7204a).second);
        long j2 = asVar.f7207d;
        int i = ((C58724pq) this.f9172c).f156474d;
        int i2 = uVar.f9167b;
        C3036as c = b.mo6973c((j2 * ((long) i)) + ((long) i2));
        mo7103g(Integer.valueOf(i2));
        uVar.f9169d++;
        C3028ak n = uVar.f9166a.mo6757m(c, gVar, j);
        this.f9173d.put(n, uVar);
        m9100F();
        return n;
    }

    /* renamed from: o */
    public final C2651bm mo6942o() {
        return mo7110E();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo6950w() {
    }

    /* renamed from: G */
    private final void m9101G() {
        if (!this.f9170a) {
            Handler handler = this.f9174e;
            handler.getClass();
            handler.obtainMessage(0).sendToTarget();
            this.f9170a = true;
        }
    }
}
