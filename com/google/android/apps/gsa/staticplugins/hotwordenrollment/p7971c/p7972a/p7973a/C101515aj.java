package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7972a.p7973a;

import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3861at.C49879cj;
import com.google.assistant.p3861at.C49891cv;
import com.google.assistant.p3861at.C49893cx;
import com.google.assistant.p3861at.act;
import com.google.assistant.p3897e.p3929l.p3930a.C52710bp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62971cq;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.a.a.aj */
/* compiled from: PG */
public final class C101515aj {

    /* renamed from: a */
    public static final Duration f283309a = Duration.ofSeconds(2);

    /* renamed from: b */
    public static final C59071e f283310b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.a.a.aj");

    /* renamed from: c */
    public final l f283311c;

    /* renamed from: d */
    public final C90021c f283312d;

    /* renamed from: e */
    public final String f283313e;

    /* renamed from: f */
    public final C86054o f283314f;

    /* renamed from: g */
    public final C22871g f283315g;

    public C101515aj(l lVar, C90021c cVar, String str, C86054o oVar, C22871g gVar) {
        this.f283311c = lVar;
        this.f283312d = cVar;
        this.f283313e = str;
        this.f283314f = oVar;
        this.f283315g = gVar;
    }

    /* renamed from: a */
    public static C52710bp m167884a(act act, com.google.android.apps.gsa.assistant.shared.l lVar) {
        if (act == null) {
            ((C59052c) ((C59052c) f283310b.mo56224b()).mo56372aa(20317)).mo56386p("Keep trying for empty result.");
            return C52710bp.VOICE_ENROLLMENT_UNKNOWN_STATUS;
        } else if ((act.f128894a & 64) != 0) {
            C49893cx cxVar = act.f128900g;
            if (cxVar == null) {
                cxVar = C49893cx.f129688b;
            }
            C62971cq<C49879cj> cqVar = cxVar.f129690a;
            String b = lVar.b();
            for (C49879cj cjVar : cqVar) {
                String str = cjVar.f129631b;
                if (b.equals(str)) {
                    C49891cv cvVar = cjVar.f129639j;
                    if (cvVar == null) {
                        cvVar = C49891cv.f129647N;
                    }
                    if ((cvVar.f129663a & 4096) != 0) {
                        C49891cv cvVar2 = cjVar.f129639j;
                        if (cvVar2 == null) {
                            cvVar2 = C49891cv.f129647N;
                        }
                        C52710bp a = C52710bp.m86700a(cvVar2.f129672j);
                        return a == null ? C52710bp.VOICE_ENROLLMENT_UNKNOWN_STATUS : a;
                    }
                    ((C59052c) ((C59052c) f283310b.mo56224b()).mo56372aa(20315)).mo56389s("Device %s has no VoiceEnrollmentStatus. Retry.", str);
                    return C52710bp.VOICE_ENROLLMENT_UNKNOWN_STATUS;
                }
            }
            ((C59052c) ((C59052c) f283310b.mo56225c()).mo56372aa(20313)).mo56389s("Some devices not found in the returned settings. Device list is %s", lVar.d());
            return C52710bp.VOICE_ENROLLMENT_UNKNOWN_STATUS;
        } else {
            ((C59052c) ((C59052c) f283310b.mo56224b()).mo56372aa(20316)).mo56386p("Keep trying for empty assistantDeviceSettings.");
            return C52710bp.VOICE_ENROLLMENT_UNKNOWN_STATUS;
        }
    }
}
