package com.google.android.libraries.search.p3055n.p3061c.p3062a;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.android.libraries.search.p2871b.p2895i.C37259h;
import com.google.android.libraries.search.p3055n.C39767h;
import com.google.android.libraries.search.p3055n.C39821y;
import com.google.android.libraries.search.p3055n.C39822z;
import com.google.android.libraries.search.p3055n.p3061c.C39645b;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3064b.C39419h;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3068f.p3069a.C39518a;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3068f.p3069a.C39526i;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62940bt;
import com.google.speech.p5218j.C67086kn;
import com.google.speech.p5218j.C67087ko;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71080dz;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71082ea;

/* renamed from: com.google.android.libraries.search.n.c.a.bo */
/* compiled from: PG */
public final /* synthetic */ class C39438bo implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C39479cu f103826a;

    /* renamed from: b */
    public final /* synthetic */ C39419h f103827b;

    public /* synthetic */ C39438bo(C39479cu cuVar, C39419h hVar) {
        this.f103826a = cuVar;
        this.f103827b = hVar;
    }

    public final C60870cx apply(Object obj) {
        C37259h hVar;
        int i;
        C37259h hVar2;
        C39479cu cuVar = this.f103826a;
        C39419h hVar3 = this.f103827b;
        C39395ak akVar = (C39395ak) obj;
        if (akVar.mo41813b()) {
            C59104x b = C39479cu.f103938a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "SodaTriggeringFrontend");
            ((C59052c) ((C59052c) b).mo56372aa(53589)).mo56386p("Hotword started successfully.");
            C39645b bVar = cuVar.f103951b;
            C67086kn knVar = (C67086kn) C67087ko.f182366n.createBuilder();
            C62940bt btVar = C39822z.f104715d;
            C39821y yVar = (C39821y) C39822z.f104714c.createBuilder();
            C39767h a = hVar3.mo41825a();
            yVar.copyOnWrite();
            C39822z zVar = (C39822z) yVar.instance;
            a.getClass();
            zVar.f104718b = a;
            zVar.f104717a |= 1;
            knVar.mo58885m(btVar, (C39822z) yVar.build());
            bVar.mo39385a((C67087ko) knVar.build());
            C59104x b2 = C39479cu.f103938a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "SodaTriggeringFrontend");
            ((C59052c) ((C59052c) b2).mo56372aa(53590)).mo56386p("after notify apa");
            if (hVar3.mo41826b().mo41820a() == C39389ae.HOTWORD_TIMEOUT) {
                hVar2 = C37176a.f97311je.mo40806d();
            } else {
                hVar2 = C37176a.f97249hw.mo40806d();
            }
            return cuVar.mo41857s(hVar2, hVar3.mo41826b(), C39518a.m68940b(hVar3), 3);
        }
        C39526i iVar = cuVar.f103970u;
        if (hVar3.mo41826b().mo41820a() == C39389ae.HOTWORD_TIMEOUT) {
            hVar = C37176a.f97312jf.mo40806d();
        } else {
            hVar = C37176a.f97250hx.mo40806d();
        }
        iVar.mo41873g(hVar, hVar3.mo41826b(), C39518a.m68940b(hVar3), C39518a.m68941c((C39393ai) akVar.mo41812a().mo56107c()));
        C39636r rVar = new C39636r();
        rVar.mo41791b(C39389ae.HOTWORD_START_ERROR);
        rVar.f104346a = cuVar.mo41850k(C39389ae.HOTWORD_START_ERROR.name());
        C39411b a2 = rVar.mo41790a();
        C59104x b3 = C39479cu.f103938a.mo56224b();
        b3.mo56378ag(C58975e.f156826a, "SodaTriggeringFrontend");
        ((C59052c) ((C59052c) b3).mo56372aa(53588)).mo56359L("Cannot start hotword detection. Error code: %s, error message: %s, appFlowLoggingTag: %s", ((C39393ai) akVar.mo41812a().mo56107c()).mo41808a(), ((C39393ai) akVar.mo41812a().mo56107c()).mo41809b(), a2.mo41821b());
        if (cuVar.f103963n == null) {
            cuVar.f103963n = (C39393ai) akVar.mo41812a().mo56107c();
        }
        if (cuVar.f103962m == null) {
            cuVar.f103962m = hVar3.mo41826b().mo41821b();
        }
        C39526i iVar2 = cuVar.f103970u;
        C37252a c = C37176a.f97167gT.mo40779c();
        String str = cuVar.f103962m;
        C39393ai aiVar = cuVar.f103963n;
        C39393ai aiVar2 = (C39393ai) akVar.mo41812a().mo56107c();
        C71080dz dzVar = (C71080dz) C71082ea.f189563q.createBuilder();
        if (str == null) {
            str = "null";
        }
        dzVar.copyOnWrite();
        C71082ea eaVar = (C71082ea) dzVar.instance;
        eaVar.f189565a |= 2;
        eaVar.f189567c = str;
        if (aiVar == null) {
            i = 29;
        } else {
            i = C39518a.m68941c(aiVar);
        }
        dzVar.copyOnWrite();
        C71082ea eaVar2 = (C71082ea) dzVar.instance;
        eaVar2.f189568d = i - 2;
        eaVar2.f189565a |= 4;
        int c2 = C39518a.m68941c(aiVar2);
        dzVar.copyOnWrite();
        C71082ea eaVar3 = (C71082ea) dzVar.instance;
        eaVar3.f189580p = c2 - 2;
        eaVar3.f189565a |= C89885b.S3REQUEST_VALUE;
        ((C37253b) c).mo40794r(String.valueOf(cuVar.f103962m));
        iVar2.mo41871e(c, a2, (C71082ea) dzVar.build());
        cuVar.mo41851l((C39393ai) akVar.mo41812a().mo56107c(), a2);
        return C60866ct.f164955a;
    }
}
