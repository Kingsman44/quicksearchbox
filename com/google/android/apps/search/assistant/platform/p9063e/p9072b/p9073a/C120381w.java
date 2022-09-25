package com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a;

import com.google.android.libraries.assistant.p1363c.p1386e.p1387a.C17235c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.speech.p5208h.C66606cd;
import com.google.speech.p5208h.C66626cx;
import com.google.speech.p5208h.C66628cz;
import com.google.speech.p5208h.C66634da;
import com.google.speech.p5218j.C67030il;
import com.google.speech.p5218j.C67050je;
import com.google.speech.p5218j.C67052jg;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.e.b.a.w */
/* compiled from: PG */
final class C120381w implements C17235c {

    /* renamed from: a */
    final /* synthetic */ Optional f334881a;

    /* renamed from: b */
    final /* synthetic */ C66626cx f334882b;

    public C120381w(Optional optional, C66626cx cxVar) {
        this.f334881a = optional;
        this.f334882b = cxVar;
    }

    /* renamed from: a */
    public final void mo23244a(C66606cd cdVar) {
        if (this.f334881a.isPresent()) {
            C67052jg jgVar = ((C67050je) this.f334881a.get()).f182268e;
            if (jgVar == null) {
                jgVar = C67052jg.f182269e;
            }
            C67030il ilVar = jgVar.f182273c;
            if (ilVar == null) {
                ilVar = C67030il.f182195e;
            }
            C59104x b = C120382x.f334883a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "ConvEngine.OnlineProcessing");
            ((C59052c) ((C59052c) b).mo56372aa(34676)).mo56390t("Cloud arbitration: setting hotword power %f and background power %f", ilVar.f182198b, ilVar.f182199c);
            C66628cz czVar = (C66628cz) C66634da.f181292g.createBuilder();
            float f = ilVar.f182199c;
            czVar.copyOnWrite();
            C66634da daVar = (C66634da) czVar.instance;
            daVar.f181295a |= 2;
            daVar.f181297c = f;
            float f2 = ilVar.f182198b;
            czVar.copyOnWrite();
            C66634da daVar2 = (C66634da) czVar.instance;
            daVar2.f181295a |= 1;
            daVar2.f181296b = f2;
            C66626cx cxVar = this.f334882b;
            czVar.copyOnWrite();
            C66634da daVar3 = (C66634da) czVar.instance;
            daVar3.f181299e = cxVar.f181272r;
            daVar3.f181295a |= 8;
            cdVar.mo58885m(C66634da.f181293h, (C66634da) czVar.build());
        }
    }
}
