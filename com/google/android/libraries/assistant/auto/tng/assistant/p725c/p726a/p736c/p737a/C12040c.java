package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p736c.p737a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p743f.p747c.p749b.C12145a;
import com.google.android.libraries.search.p2904c.C37321a;
import com.google.android.libraries.search.p2904c.C37400be;
import com.google.android.libraries.search.p2904c.C37402bg;
import com.google.android.libraries.search.p2904c.C37410bo;
import com.google.android.libraries.search.p2904c.C37519dz;
import com.google.android.libraries.search.p2904c.C37561eb;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.a.c.a.c */
/* compiled from: PG */
public final /* synthetic */ class C12040c implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C12048k f38581a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f38582b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f38583c;

    /* renamed from: d */
    public final /* synthetic */ C37410bo f38584d;

    public /* synthetic */ C12040c(C12048k kVar, C60870cx cxVar, C60870cx cxVar2, C37410bo boVar) {
        this.f38581a = kVar;
        this.f38582b = cxVar;
        this.f38583c = cxVar2;
        this.f38584d = boVar;
    }

    public final Object call() {
        C37519dz dzVar;
        C37519dz dzVar2;
        C12048k kVar = this.f38581a;
        C60870cx cxVar = this.f38582b;
        C60870cx cxVar2 = this.f38583c;
        C37410bo boVar = this.f38584d;
        C37402bg bgVar = (C37402bg) C60856cj.m92909r(cxVar);
        C37400be beVar = (C37400be) C60856cj.m92909r(cxVar2);
        C58833ax b = beVar.mo40930b();
        C37561eb ebVar = beVar.mo40929a().f99350b;
        if (ebVar == null) {
            ebVar = C37561eb.f99800c;
        }
        C59104x b2 = C12048k.f38594a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "AudioLstnSessFctry");
        ((C59052c) ((C59052c) b2).mo56372aa(44006)).mo56389s("AudioSourceOpeningStatus: %s", ebVar);
        if (!b.mo56113h() || ebVar.f99802a != 1) {
            if (ebVar.f99802a == 2) {
                dzVar = C37519dz.m66524a(((Integer) ebVar.f99803b).intValue());
                if (dzVar == null) {
                    dzVar = C37519dz.UNKNOWN_OPENING_FAILURE;
                }
            } else {
                dzVar = C37519dz.UNKNOWN_OPENING_FAILURE;
            }
            String str = "Audio listening session failed, audioSourceOpeningStatus: " + dzVar.f99687U;
            if (ebVar.f99802a == 2) {
                dzVar2 = C37519dz.m66524a(((Integer) ebVar.f99803b).intValue());
                if (dzVar2 == null) {
                    dzVar2 = C37519dz.UNKNOWN_OPENING_FAILURE;
                }
            } else {
                dzVar2 = C37519dz.UNKNOWN_OPENING_FAILURE;
            }
            throw new C12145a(str, dzVar2);
        }
        long d = kVar.f38598e.mo26872d();
        C60870cx i = C60856cj.m92900i(Long.valueOf(d));
        if (((Boolean) kVar.f38599f.mo17428b()).booleanValue() && beVar.mo40932d().mo56113h()) {
            i = C60922j.m93044g((C60870cx) beVar.mo40932d().mo56107c(), C47810es.m84963c(new C12038a(d)), kVar.f38595b);
        }
        C12060w wVar = new C12060w(bgVar, kVar.f38595b);
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(new C12044g((C37321a) b.mo56107c(), wVar, boVar, bgVar)), kVar.f38596c), "Error streaming audio", new Object[0]);
        return new C12061x(wVar, i);
    }
}
