package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2675a;

import com.google.android.apps.gsa.shared.speech.hotword.C90578a;
import com.google.android.apps.gsa.shared.speech.hotword.C90599p;
import com.google.android.apps.gsa.shared.speech.hotword.HotwordResult;
import com.google.android.libraries.search.p3055n.C39260aj;
import com.google.android.libraries.search.p3055n.C39277b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.p4751a.C62949a;
import com.google.speech.p5218j.C67030il;
import com.google.speech.p5218j.C67048jc;
import com.google.speech.p5218j.C67050je;
import com.google.speech.p5218j.C67052jg;
import com.google.speech.p5218j.C67073ka;
import com.google.speech.p5218j.C67091ks;
import com.google.speech.p5218j.C67171p;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.a.i */
/* compiled from: PG */
public final class C34511i {

    /* renamed from: a */
    private static final C59071e f91725a = C59071e.m91331h();

    /* renamed from: a */
    public static final HotwordResult m63236a(C39260aj ajVar, C69626l lVar) {
        int i;
        C69664n.m101061g(ajVar, "event");
        C67050je jeVar = ajVar.f103420d;
        if (jeVar == null) {
            jeVar = C67050je.f182262f;
        }
        C69664n.m101060f(jeVar, "event.hotwordEvent");
        C39277b bVar = ajVar.f103419c;
        if (bVar == null) {
            bVar = C39277b.f103459e;
        }
        C69664n.m101060f(bVar, "event.audioConfig");
        C90599p F = HotwordResult.m147742F();
        C67091ks ksVar = jeVar.f182267d;
        if (ksVar == null) {
            ksVar = C67091ks.f182386h;
        }
        F.mo84735x(ksVar.f182389b);
        C67048jc jcVar = jeVar.f182265b;
        if (jcVar == null) {
            jcVar = C67048jc.f182253h;
        }
        F.mo84731t(jcVar.f182258d);
        C67048jc jcVar2 = jeVar.f182265b;
        if (jcVar2 == null) {
            jcVar2 = C67048jc.f182253h;
        }
        C90578a aVar = (C90578a) F;
        aVar.f253211a = jcVar2.f182261g;
        C67091ks ksVar2 = jeVar.f182267d;
        if (ksVar2 == null) {
            ksVar2 = C67091ks.f182386h;
        }
        F.mo84734w(ksVar2.f182391d);
        C67052jg jgVar = jeVar.f182268e;
        if (jgVar == null) {
            jgVar = C67052jg.f182269e;
        }
        C67030il ilVar = jgVar.f182273c;
        if (ilVar == null) {
            ilVar = C67030il.f182195e;
        }
        F.mo84722k(ilVar.f182198b);
        C67052jg jgVar2 = jeVar.f182268e;
        if (jgVar2 == null) {
            jgVar2 = C67052jg.f182269e;
        }
        C67030il ilVar2 = jgVar2.f182273c;
        if (ilVar2 == null) {
            ilVar2 = C67030il.f182195e;
        }
        F.mo84715d(ilVar2.f182199c);
        C67073ka kaVar = jeVar.f182266c;
        if (kaVar == null) {
            kaVar = C67073ka.f182324f;
        }
        C67171p pVar = kaVar.f182327b;
        if (pVar == null) {
            pVar = C67171p.f182575e;
        }
        aVar.f253212b = C69664n.m101061g(pVar.f182578b.mo59174N(), "<this>");
        int i2 = bVar.f103463c;
        boolean z = false;
        if (i2 == 12) {
            i = 2;
        } else if (i2 != 16) {
            C59052c cVar = (C59052c) f91725a.mo56226d();
            cVar.mo56378ag(C58975e.f156826a, "TRG.HotwordLegacyEvent");
            cVar.mo56379ah(new C59094n(51386));
            cVar.mo56387q("Unsupported channel config: %s.", i2);
            i = 0;
        } else {
            i = 1;
        }
        F.mo84717f(i);
        F.mo84721j(bVar.f103464d);
        F.mo84728q(bVar.f103462b);
        F.mo84719h((ajVar.f103417a & 8) != 0);
        if ((ajVar.f103417a & 8) != 0) {
            z = true;
        }
        F.mo84732u(!z);
        C67048jc jcVar3 = jeVar.f182265b;
        if (jcVar3 == null) {
            jcVar3 = C67048jc.f182253h;
        }
        F.mo84726o(jcVar3.f182259e);
        C67048jc jcVar4 = jeVar.f182265b;
        if (jcVar4 == null) {
            jcVar4 = C67048jc.f182253h;
        }
        aVar.f253215e = jcVar4.f182257c;
        C67091ks ksVar3 = jeVar.f182267d;
        if (ksVar3 == null) {
            ksVar3 = C67091ks.f182386h;
        }
        F.mo84730s(ksVar3.f182392e);
        C62910ar arVar = ajVar.f103421e;
        if (arVar == null) {
            arVar = C62910ar.f169858c;
        }
        C69664n.m101060f(arVar, "event.dspHotwordDetectedTime");
        F.mo84720i(C62949a.m95468c(arVar).toMillis());
        F.mo84716e(bVar.f103463c);
        lVar.mo5761a(F);
        HotwordResult a = F.mo84712a();
        C69664n.m101060f(a, "builder()\n      .setSpea…lder(it) }\n      .build()");
        return a;
    }
}
