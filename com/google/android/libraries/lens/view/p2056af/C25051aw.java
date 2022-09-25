package com.google.android.libraries.lens.view.p2056af;

import com.google.android.libraries.lens.view.C28224z;
import com.google.android.libraries.search.logging.p3034a.C38768q;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.C60706zv;
import com.google.common.p4552o.C60708zx;
import com.google.common.p4552o.aac;
import com.google.common.p4552o.aar;
import com.google.common.p4552o.aas;
import com.google.common.p4552o.p4559e.C59743a;
import com.google.common.p4552o.p4563i.C59901bj;
import com.google.common.p4552o.p4563i.C59902bk;

/* renamed from: com.google.android.libraries.lens.view.af.aw */
/* compiled from: PG */
public final class C25051aw implements C25050av {

    /* renamed from: a */
    private final C28224z f68280a;

    /* renamed from: b */
    private final C38768q f68281b;

    static {
        C58974d.m91135i("LensEventLoggerTngImpl");
    }

    public C25051aw(C28224z zVar, C38768q qVar) {
        this.f68280a = zVar;
        this.f68281b = qVar;
    }

    /* renamed from: a */
    public final void mo30241a(C60555uf ufVar) {
        C59743a aVar;
        C60708zx zxVar = this.f68280a.f76837c;
        zxVar.getClass();
        aas aas = ufVar.f164197by;
        if (aas == null) {
            aas = aas.f158145p;
        }
        aac aac = aas.f158156j;
        if (aac == null) {
            aac = aac.f158079h;
        }
        C60706zv zvVar = (C60706zv) aac.toBuilder();
        zvVar.copyOnWrite();
        aac aac2 = (aac) zvVar.instance;
        aac2.f158087g = zxVar;
        aac2.f158081a |= 32;
        aac aac3 = (aac) zvVar.build();
        aas aas2 = ufVar.f164197by;
        if (aas2 == null) {
            aas2 = aas.f158145p;
        }
        aar aar = (aar) aas2.toBuilder();
        aar.copyOnWrite();
        aas aas3 = (aas) aar.instance;
        aac3.getClass();
        aas3.f158156j = aac3;
        aas3.f158147a |= 32768;
        aas aas4 = (aas) aar.build();
        C59901bj bjVar = (C59901bj) C59902bk.f161903c.createBuilder();
        bjVar.copyOnWrite();
        C59902bk bkVar = (C59902bk) bjVar.instance;
        aas4.getClass();
        bkVar.f161907b = aas4;
        bkVar.f161906a |= 1;
        C59902bk bkVar2 = (C59902bk) bjVar.build();
        C38768q qVar = this.f68281b;
        int i = ufVar.f164258m;
        switch (i) {
            case 1088:
                aVar = C59743a.OPA_ANDROID_EYES_PREFETCH_REQUEST;
                break;
            case 1089:
                aVar = C59743a.OPA_ANDROID_EYES_PREFETCH_ACKNOWLEDGED;
                break;
            case 1090:
                aVar = C59743a.OPA_ANDROID_EYES_FINAL_REQUEST;
                break;
            case 1091:
                aVar = C59743a.OPA_ANDROID_EYES_RESPONSE_RECEIVED;
                break;
            case 1151:
                aVar = C59743a.LENS_IMAGE_QUERY;
                break;
            case 1209:
                aVar = C59743a.LENS_CAMERA_CONFIGURED;
                break;
            case 1227:
                aVar = C59743a.LENS_RECEIVED_GLEAM_RESPONSE;
                break;
            case 1290:
                aVar = C59743a.LENS_STOPPED;
                break;
            case 1357:
                aVar = C59743a.LENS_CAMERA_SESSION;
                break;
            case 1398:
                aVar = C59743a.LENS_SDK_TRIGGER;
                break;
            case 1407:
                aVar = C59743a.LENS_SYSTEM_CAPABILITIES;
                break;
            case 1438:
                aVar = C59743a.LENS_GLEAMS_MERGE_LATENCY;
                break;
            case 1451:
                aVar = C59743a.LENS_ON_RESUME;
                break;
            case 1452:
                aVar = C59743a.LENS_ON_PAUSE;
                break;
            case 1502:
                aVar = C59743a.LENS_REFINEMENT_QUERY;
                break;
            case 1532:
                aVar = C59743a.LENS_ANDROID_HATS_NEXT_SURVEY_PROMPTED;
                break;
            case 1534:
                aVar = C59743a.LENS_ANDROID_HATS_NEXT_SURVEY_CLOSED;
                break;
            default:
                throw new AssertionError("Unsupported eventType: " + i);
        }
        qVar.mo41590b(aVar, C59902bk.f161904d, bkVar2);
    }
}
