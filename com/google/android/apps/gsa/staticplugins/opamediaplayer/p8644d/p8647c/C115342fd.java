package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.assistant.p3897e.p3902c.p3907c.C51011db;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3921j.C52170hv;
import com.google.assistant.p3897e.p3921j.C52171hw;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.assistant.p3897e.p3921j.C52406qo;
import com.google.assistant.p3897e.p3921j.C52407qp;
import com.google.assistant.p3897e.p3921j.C52563wj;
import com.google.assistant.p3897e.p3921j.C52567wn;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.assistant.p3897e.p3921j.C52575wv;
import com.google.assistant.p3897e.p3921j.C52577wx;
import com.google.assistant.p3897e.p3921j.C52579wz;
import com.google.assistant.p3897e.p3921j.C52583xc;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C63042fg;
import com.google.protobuf.C63088z;
import p5285d.p5286a.p5287a.p5288a.p5289a.C68113f;
import p5285d.p5286a.p5287a.p5288a.p5289a.C68115h;
import p5285d.p5286a.p5287a.p5288a.p5289a.C68117j;
import p5285d.p5286a.p5287a.p5288a.p5289a.C68119l;
import p5285d.p5286a.p5287a.p5288a.p5289a.C68121n;
import p5285d.p5286a.p5287a.p5288a.p5289a.C68122o;
import p5285d.p5290b.p5291a.p5292a.C68189by;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.c.fd */
/* compiled from: PG */
final class C115342fd implements C70862aj {

    /* renamed from: a */
    final /* synthetic */ boolean f320022a;

    /* renamed from: b */
    final /* synthetic */ C115343fe f320023b;

    public C115342fd(C115343fe feVar, boolean z) {
        this.f320023b = feVar;
        this.f320022a = z;
    }

    /* renamed from: a */
    public final void mo20121a() {
        C58976aa aaVar = C58975e.f156826a;
        this.f320023b.f320029f.mo83702b(C89849ae.SPEAKR_PLAYLIST_REQUEST_SUCCEEDED);
        this.f320023b.f320028e.mo28212l("run-read-it-later", new C115340fb(this, this.f320022a));
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        C59104x c = C115343fe.f320024a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "SpeakrRootControl");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(29868)).mo56386p("Failed fetching playlist");
        this.f320023b.f320029f.mo83702b(C89849ae.SPEAKR_PLAYLIST_REQUEST_FAILED);
        this.f320023b.f320028e.mo28212l("finishActivity", new C115341fc(this));
    }

    /* renamed from: c */
    public final /* synthetic */ void mo20123c(Object obj) {
        C52579wz wzVar;
        C58976aa aaVar = C58975e.f156826a;
        C115343fe feVar = this.f320023b;
        C68117j jVar = ((C68113f) obj).f184352a;
        if (jVar == null) {
            jVar = C68117j.f184361b;
        }
        C52170hv hvVar = (C52170hv) C52176ia.f136911k.createBuilder();
        C58480gp e = C58485gu.m89837e();
        for (C68119l lVar : jVar.f184363a) {
            C52171hw hwVar = (C52171hw) C52174hz.f136892m.createBuilder();
            C52575wv wvVar = (C52575wv) C52583xc.f138063o.createBuilder();
            C52577wx wxVar = C52577wx.READ_IT_LATER;
            wvVar.copyOnWrite();
            C52583xc xcVar = (C52583xc) wvVar.instance;
            xcVar.f138069e = wxVar.f138041e;
            xcVar.f138065a |= 8;
            C68121n nVar = lVar.f184368c;
            if (nVar == null) {
                nVar = C68121n.f184372c;
            }
            int i = nVar.f184374a;
            wvVar.copyOnWrite();
            C52583xc xcVar2 = (C52583xc) wvVar.instance;
            xcVar2.f138065a |= 2;
            xcVar2.f138067c = i;
            C68115h hVar = lVar.f184367b;
            if (hVar == null) {
                hVar = C68115h.f184353g;
            }
            C62910ar arVar = hVar.f184358d;
            if (arVar == null) {
                arVar = C62910ar.f169858c;
            }
            wvVar.copyOnWrite();
            C52583xc xcVar3 = (C52583xc) wvVar.instance;
            arVar.getClass();
            xcVar3.f138068d = arVar;
            xcVar3.f138065a |= 4;
            C68122o oVar = C68122o.SPEAKR_ITEM_STATE_UNKNOWN;
            C68121n nVar2 = lVar.f184368c;
            if (nVar2 == null) {
                nVar2 = C68121n.f184372c;
            }
            C68122o a = C68122o.m98452a(nVar2.f184375b);
            if (a == null) {
                a = C68122o.UNRECOGNIZED;
            }
            int ordinal = a.ordinal();
            if (ordinal == 1) {
                wzVar = C52579wz.READ;
            } else if (ordinal == 2) {
                wzVar = C52579wz.INCOMPLETE;
            } else if (ordinal == 3) {
                wzVar = C52579wz.UNREAD;
            } else if (ordinal != 4) {
                wzVar = C52579wz.UNKNOWN_READ_STATE;
            } else {
                wzVar = C52579wz.ARCHIVED;
            }
            wvVar.copyOnWrite();
            C52583xc xcVar4 = (C52583xc) wvVar.instance;
            xcVar4.f138066b = wzVar.f138049f;
            xcVar4.f138065a |= 1;
            C62910ar arVar2 = lVar.f184370e;
            if (arVar2 == null) {
                arVar2 = C62910ar.f169858c;
            }
            wvVar.copyOnWrite();
            C52583xc xcVar5 = (C52583xc) wvVar.instance;
            arVar2.getClass();
            xcVar5.f138070f = arVar2;
            xcVar5.f138065a |= 16;
            C68115h hVar2 = lVar.f184367b;
            if (hVar2 == null) {
                hVar2 = C68115h.f184353g;
            }
            String str = hVar2.f184360f;
            wvVar.copyOnWrite();
            C52583xc xcVar6 = (C52583xc) wvVar.instance;
            str.getClass();
            xcVar6.f138065a |= 128;
            xcVar6.f138073i = str;
            if (lVar.f184371f) {
                C68115h hVar3 = lVar.f184367b;
                if (hVar3 == null) {
                    hVar3 = C68115h.f184353g;
                }
                String str2 = hVar3.f184360f;
                wvVar.copyOnWrite();
                C52583xc xcVar7 = (C52583xc) wvVar.instance;
                str2.getClass();
                xcVar7.f138065a |= 64;
                xcVar7.f138072h = str2;
            }
            C52563wj wjVar = (C52563wj) C52568wo.f137992v.createBuilder();
            C68115h hVar4 = lVar.f184367b;
            if (hVar4 == null) {
                hVar4 = C68115h.f184353g;
            }
            String str3 = hVar4.f184355a;
            wjVar.copyOnWrite();
            C52568wo woVar = (C52568wo) wjVar.instance;
            str3.getClass();
            woVar.f137994a |= 1;
            woVar.f137998e = str3;
            C68115h hVar5 = lVar.f184367b;
            if (hVar5 == null) {
                hVar5 = C68115h.f184353g;
            }
            String str4 = hVar5.f184356b;
            wjVar.copyOnWrite();
            C52568wo woVar2 = (C52568wo) wjVar.instance;
            str4.getClass();
            woVar2.f137994a |= 8;
            woVar2.f138000g = str4;
            C68115h hVar6 = lVar.f184367b;
            if (hVar6 == null) {
                hVar6 = C68115h.f184353g;
            }
            String str5 = hVar6.f184356b;
            wjVar.copyOnWrite();
            C52568wo woVar3 = (C52568wo) wjVar.instance;
            str5.getClass();
            woVar3.f137994a |= 8192;
            woVar3.f138006m = str5;
            C51011db dbVar = (C51011db) C51012dc.f132813k.createBuilder();
            C63088z zVar = lVar.f184369d;
            dbVar.copyOnWrite();
            C51012dc dcVar = (C51012dc) dbVar.instance;
            zVar.getClass();
            dcVar.f132815a |= 8;
            dcVar.f132819e = zVar;
            C68115h hVar7 = lVar.f184367b;
            if (hVar7 == null) {
                hVar7 = C68115h.f184353g;
            }
            String str6 = hVar7.f184359e;
            dbVar.copyOnWrite();
            C51012dc dcVar2 = (C51012dc) dbVar.instance;
            str6.getClass();
            dcVar2.f132815a = 2 | dcVar2.f132815a;
            dcVar2.f132817c = str6;
            C51012dc dcVar3 = (C51012dc) dbVar.build();
            wjVar.copyOnWrite();
            C52568wo woVar4 = (C52568wo) wjVar.instance;
            dcVar3.getClass();
            woVar4.f138004k = dcVar3;
            woVar4.f137994a |= 1024;
            C52567wn wnVar = C52567wn.NARRATED_WEB;
            wjVar.copyOnWrite();
            C52568wo woVar5 = (C52568wo) wjVar.instance;
            woVar5.f138003j = wnVar.f137991y;
            woVar5.f137994a |= 512;
            wjVar.copyOnWrite();
            C52568wo woVar6 = (C52568wo) wjVar.instance;
            C52583xc xcVar8 = (C52583xc) wvVar.build();
            xcVar8.getClass();
            woVar6.f137997d = xcVar8;
            woVar6.f137996c = 26;
            C68115h hVar8 = lVar.f184367b;
            if (hVar8 == null) {
                hVar8 = C68115h.f184353g;
            }
            C63042fg fgVar = hVar8.f184357c;
            if (fgVar == null) {
                fgVar = C63042fg.f170152c;
            }
            if (!fgVar.equals(C63042fg.f170152c)) {
                C52406qo qoVar = (C52406qo) C52407qp.f137523d.createBuilder();
                C68115h hVar9 = lVar.f184367b;
                if (hVar9 == null) {
                    hVar9 = C68115h.f184353g;
                }
                C63042fg fgVar2 = hVar9.f184357c;
                if (fgVar2 == null) {
                    fgVar2 = C63042fg.f170152c;
                }
                long j = fgVar2.f170154a;
                qoVar.copyOnWrite();
                C52407qp qpVar = (C52407qp) qoVar.instance;
                qpVar.f137525a |= 1;
                qpVar.f137526b = j;
                wjVar.copyOnWrite();
                C52568wo woVar7 = (C52568wo) wjVar.instance;
                C52407qp qpVar2 = (C52407qp) qoVar.build();
                qpVar2.getClass();
                woVar7.f138005l = qpVar2;
                woVar7.f137994a |= 4096;
            }
            C52568wo woVar8 = (C52568wo) wjVar.build();
            hwVar.copyOnWrite();
            C52174hz hzVar = (C52174hz) hwVar.instance;
            woVar8.getClass();
            hzVar.f136897d = woVar8;
            hzVar.f136894a |= 8;
            String str7 = lVar.f184366a;
            hwVar.copyOnWrite();
            C52174hz hzVar2 = (C52174hz) hwVar.instance;
            str7.getClass();
            hzVar2.f136894a |= 1;
            hzVar2.f136895b = str7;
            e.mo55395g((C52174hz) hwVar.build());
        }
        hvVar.mo53806b(e.mo55394f());
        feVar.f320025b = C115343fe.m191259e((C52176ia) hvVar.build(), C68189by.f184505b, C58836b.f156633a);
    }
}
