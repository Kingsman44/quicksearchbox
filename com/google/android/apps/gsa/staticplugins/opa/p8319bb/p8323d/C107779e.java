package com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8323d;

import com.google.android.apps.gsa.search.core.p6491a.C84373s;
import com.google.android.apps.gsa.search.core.p6519al.p6520a.C84605a;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C85005h;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90029ch;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.C107932g;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52076ei;
import com.google.assistant.p3897e.p3921j.C52083ep;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.d.e */
/* compiled from: PG */
public final class C107779e {

    /* renamed from: a */
    public static final C59071e f299900a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.bb.d.e");

    /* renamed from: b */
    public final C107932g f299901b;

    /* renamed from: c */
    public final C84373s f299902c;

    /* renamed from: d */
    public final C84605a f299903d;

    /* renamed from: e */
    public final C85005h f299904e;

    /* renamed from: f */
    public final C89859i f299905f;

    /* renamed from: g */
    public final C86124t f299906g;

    /* renamed from: h */
    public final C58528ij f299907h;

    /* renamed from: i */
    public final C58528ij f299908i;

    public C107779e(C107932g gVar, C84373s sVar, C84605a aVar, C85005h hVar, C89859i iVar, C86124t tVar) {
        C58528ij ijVar;
        C58528ij ijVar2;
        this.f299901b = gVar;
        this.f299902c = sVar;
        this.f299903d = aVar;
        this.f299904e = hVar;
        this.f299905f = iVar;
        this.f299906g = tVar;
        if (C107764a.m178921a(tVar.mo79743a(C90029ch.f248285bs)) > 0) {
            ijVar = C58528ij.m90006F(tVar.mo79745c(C90029ch.f248196J));
        } else {
            ijVar = C58733pz.f156496a;
        }
        this.f299907h = ijVar;
        if (tVar.mo79746e(C90029ch.f248207U)) {
            ijVar2 = C58528ij.m90006F(tVar.mo79745c(C90029ch.f248195I));
        } else {
            ijVar2 = C58733pz.f156496a;
        }
        this.f299908i = ijVar2;
    }

    /* renamed from: a */
    public static String m178950a(C52083ep epVar) {
        C52076ei eiVar;
        C58833ax axVar;
        C52076ei eiVar2;
        if (epVar.f136692b == 4) {
            eiVar = (C52076ei) epVar.f136693c;
        } else {
            eiVar = C52076ei.f136664f;
        }
        if ((eiVar.f136666a & 32) != 0) {
            if (epVar.f136692b == 4) {
                eiVar2 = (C52076ei) epVar.f136693c;
            } else {
                eiVar2 = C52076ei.f136664f;
            }
            C51809dy dyVar = eiVar2.f136668c;
            if (dyVar == null) {
                dyVar = C51809dy.f135933f;
            }
            axVar = C58833ax.m90834k(dyVar);
        } else {
            axVar = C58836b.f156633a;
        }
        return axVar.mo56113h() ? ((C51809dy) axVar.mo56107c()).f135936b : "UNKNOWN";
    }
}
