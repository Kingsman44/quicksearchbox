package com.google.android.libraries.lens.view.session;

import android.graphics.PointF;
import android.graphics.RectF;
import android.util.SizeF;
import com.google.android.libraries.lens.common.p1998a.C24093a;
import com.google.android.libraries.lens.p2014e.C24231w;
import com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25980d;
import com.google.android.libraries.lens.view.gleam.C26504ci;
import com.google.android.libraries.lens.view.p2069am.C25349y;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.lens.p4699e.C62245z;
import com.google.lens.p4707j.C62441br;
import com.google.lens.p4707j.C62445bv;

/* renamed from: com.google.android.libraries.lens.view.session.bn */
/* compiled from: PG */
public final class C27778bn {

    /* renamed from: a */
    private static final C58528ij f75784a = C58528ij.m90014N(C24231w.FILTER_SHUTTER, C24231w.FILTER_SWITCH, C24231w.POSTCAPTURE_INJECTED_IMAGE, C24231w.RETICLE_SELECTION, C24231w.SCREEN);

    /* renamed from: a */
    public static C27772bh m51729a(PointF pointF, C26504ci ciVar, C24231w wVar, boolean z) {
        C27771bg g = C27772bh.m51678g();
        g.mo33268e(pointF);
        g.mo33267d(z);
        g.mo33266c(wVar);
        g.mo33269f(C58485gu.m89842j(ciVar.mo31768m()));
        return g.mo33270g();
    }

    /* renamed from: b */
    public static C27772bh m51730b(PointF pointF, C24231w wVar, boolean z) {
        C27771bg g = C27772bh.m51678g();
        g.mo33268e(pointF);
        g.mo33267d(z);
        g.mo33266c(wVar);
        g.mo33269f(C58485gu.m89845m());
        return g.mo33270g();
    }

    /* renamed from: c */
    public static C27774bj m51731c(RectF rectF, C58833ax axVar, C24231w wVar, boolean z) {
        C58485gu guVar;
        if (axVar.mo56113h()) {
            guVar = C58485gu.m89842j(((C26504ci) axVar.mo56107c()).mo31768m());
        } else {
            guVar = C58485gu.m89845m();
        }
        C27787g gVar = new C27787g();
        gVar.mo33276d(C24231w.REGION_SEARCH);
        gVar.mo33277e(C58485gu.m89845m());
        gVar.f75808c = 1;
        gVar.mo33275c(rectF);
        gVar.mo33276d(wVar);
        gVar.mo33277e(guVar);
        gVar.f75806a = z;
        gVar.f75807b = 1;
        return gVar.mo33279g();
    }

    /* renamed from: d */
    public static C27774bj m51732d(RectF rectF, boolean z) {
        return m51733e(C58836b.f156633a, rectF, z);
    }

    /* renamed from: e */
    public static C27774bj m51733e(C58833ax axVar, RectF rectF, boolean z) {
        if (!axVar.mo56113h() || ((C27777bm) axVar.mo56107c()).mo33263k() != 5 || ((C27777bm) axVar.mo56107c()).mo33256c() != C24231w.FILTER_SHUTTER || ((C27777bm) axVar.mo56107c()).mo33257d()) {
            return m51731c(rectF, C58836b.f156633a, C24231w.REGION_SEARCH, z);
        }
        return m51731c(rectF, C58836b.f156633a, C24231w.FILTER_SHUTTER, z);
    }

    /* renamed from: f */
    public static C58833ax m51734f(C26504ci ciVar, boolean z, C25980d dVar, boolean z2, boolean z3) {
        boolean z4 = ciVar.mo31760d() == C25349y.OBJECT_REGION_GLEAM;
        if (ciVar.mo31760d() != C25349y.MATH_GLEAM || !dVar.equals(C25980d.EDUCATION)) {
            if (z4) {
                C58833ax axVar = ciVar.f72232z;
                if (axVar.mo56113h()) {
                    C62445bv bvVar = ((C62245z) axVar.mo56107c()).f168051b;
                    if (bvVar == null) {
                        bvVar = C62445bv.f168618e;
                    }
                    C62441br brVar = bvVar.f168621b;
                    if (brVar == null) {
                        brVar = C62441br.f168608h;
                    }
                    return C58833ax.m90834k(m51731c(C24093a.m44751g(new PointF(brVar.f168611b, brVar.f168612c), new SizeF(brVar.f168613d, brVar.f168614e), brVar.f168615f, 2, 0.0f), C58833ax.m90834k(ciVar), z3 ? C24231w.OBJECT : C24231w.REGION_GLEAM, z));
                }
            }
            if (((!ciVar.mo31765j() || !z2) && !z4) || ciVar.f72232z.mo56113h()) {
                return C58836b.f156633a;
            }
            return C58833ax.m90834k(m51733e(C58836b.f156633a, ciVar.mo31759c(), z));
        }
        C27773bi b = m51731c(ciVar.mo31759c(), C58836b.f156633a, C24231w.REGION_SEARCH, z).mo33281b();
        b.mo33278f(5);
        return C58833ax.m90834k(b.mo33279g());
    }

    /* renamed from: g */
    public static boolean m51735g(C27777bm bmVar) {
        return bmVar.mo33260h() == 3 && f75784a.contains(bmVar.mo33256c());
    }
}
