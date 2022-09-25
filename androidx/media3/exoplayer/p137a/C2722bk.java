package androidx.media3.exoplayer.p137a;

import androidx.media3.common.C2646bh;
import androidx.media3.common.C2649bk;
import androidx.media3.common.C2651bm;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.exoplayer.p145h.C3036as;
import com.google.common.base.C58832aw;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;

/* renamed from: androidx.media3.exoplayer.a.bk */
/* compiled from: PG */
final class C2722bk {

    /* renamed from: a */
    public final C2649bk f7546a;

    /* renamed from: b */
    public C58485gu f7547b = C58485gu.m89845m();

    /* renamed from: c */
    public C3036as f7548c;

    /* renamed from: d */
    public C3036as f7549d;

    /* renamed from: e */
    public C3036as f7550e;

    /* renamed from: f */
    private C58495hd f7551f = C58729pv.f156485a;

    public C2722bk(C2649bk bkVar) {
        this.f7546a = bkVar;
    }

    /* renamed from: b */
    public static C3036as m7424b(C2646bh bhVar, C58485gu guVar, C3036as asVar, C2649bk bkVar) {
        C2651bm u = bhVar.mo6014u();
        int d = bhVar.mo5997d();
        Object f = u.mo6304o() ? null : u.mo6026f(d);
        int b = (bhVar.mo5989Q() || u.mo6304o()) ? -1 : u.mo6023d(d, bkVar, false).mo6281b(C2612ak.m6998w(bhVar.mo6004k()) - bkVar.f7332e);
        for (int i = 0; i < guVar.size(); i++) {
            C3036as asVar2 = (C3036as) guVar.get(i);
            if (m7426e(asVar2, f, bhVar.mo5989Q(), bhVar.mo5994a(), bhVar.mo5995b(), b)) {
                return asVar2;
            }
        }
        if (guVar.isEmpty() && asVar != null) {
            if (m7426e(asVar, f, bhVar.mo5989Q(), bhVar.mo5994a(), bhVar.mo5995b(), b)) {
                return asVar;
            }
        }
        return null;
    }

    /* renamed from: d */
    private final void m7425d(C58490gz gzVar, C3036as asVar, C2651bm bmVar) {
        if (asVar != null) {
            if (bmVar.mo6020a(asVar.f7204a) != -1) {
                gzVar.mo55429h(asVar, bmVar);
                return;
            }
            C2651bm bmVar2 = (C2651bm) this.f7551f.get(asVar);
            if (bmVar2 != null) {
                gzVar.mo55429h(asVar, bmVar2);
            }
        }
    }

    /* renamed from: e */
    private static boolean m7426e(C3036as asVar, Object obj, boolean z, int i, int i2, int i3) {
        if (!asVar.f7204a.equals(obj)) {
            return false;
        }
        if (z) {
            if (!(asVar.f7205b == i && asVar.f7206c == i2)) {
                return false;
            }
        } else if (!(asVar.f7205b == -1 && asVar.f7208e == i3)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final C2651bm mo6399a(C3036as asVar) {
        return (C2651bm) this.f7551f.get(asVar);
    }

    /* renamed from: c */
    public final void mo6400c(C2651bm bmVar) {
        C58490gz gzVar = new C58490gz(4);
        if (this.f7547b.isEmpty()) {
            m7425d(gzVar, this.f7549d, bmVar);
            if (!C58832aw.m90831a(this.f7550e, this.f7549d)) {
                m7425d(gzVar, this.f7550e, bmVar);
            }
            if (!C58832aw.m90831a(this.f7548c, this.f7549d) && !C58832aw.m90831a(this.f7548c, this.f7550e)) {
                m7425d(gzVar, this.f7548c, bmVar);
            }
        } else {
            for (int i = 0; i < this.f7547b.size(); i++) {
                m7425d(gzVar, (C3036as) this.f7547b.get(i), bmVar);
            }
            if (!this.f7547b.contains(this.f7548c)) {
                m7425d(gzVar, this.f7548c, bmVar);
            }
        }
        this.f7551f = gzVar.mo55427f(true);
    }
}
