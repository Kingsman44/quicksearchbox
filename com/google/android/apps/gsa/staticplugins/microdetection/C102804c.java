package com.google.android.apps.gsa.staticplugins.microdetection;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.hotword.a;
import com.google.android.apps.gsa.hotword.b;
import com.google.android.apps.gsa.p8889z.p8907d.p8908a.C118948b;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.speech.dumper.EventForDump;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90582d;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f;
import com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.speech.microdetection.C92528b;
import com.google.android.apps.gsa.speech.microdetection.p7303a.p7306c.C92496a;
import com.google.android.apps.gsa.speech.microdetection.p7303a.p7306c.C92497b;
import com.google.android.apps.gsa.speech.microdetection.p7303a.p7306c.C92504i;
import com.google.android.apps.gsa.staticplugins.microdetection.p8042d.C102834c;
import com.google.android.apps.gsa.staticplugins.microdetection.p8042d.C102835d;
import com.google.android.apps.gsa.staticplugins.microdetection.p8042d.C102839h;
import com.google.android.apps.gsa.staticplugins.microdetection.p8042d.C102840i;
import com.google.android.apps.gsa.staticplugins.microdetection.p8042d.C102846o;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68226l;
import java.util.ArrayList;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.microdetection.c */
/* compiled from: PG */
public final class C102804c implements C92528b {

    /* renamed from: a */
    private final C102840i f287060a;

    /* renamed from: b */
    private final C69464a f287061b;

    public C102804c(C102840i iVar, C69464a aVar) {
        this.f287060a = iVar;
        this.f287061b = aVar;
    }

    /* renamed from: a */
    public final C118948b mo87297a() {
        return (C118948b) this.f287061b.mo17428b();
    }

    /* renamed from: b */
    public final void mo87298b(String str, C90582d dVar, int i, boolean z, boolean z2, boolean z3, a aVar, b bVar) {
        C102840i iVar = this.f287060a;
        dVar.getClass();
        Context context = (Context) iVar.f287208a.mo17428b();
        context.getClass();
        C92504i iVar2 = (C92504i) iVar.f287209b.mo17428b();
        iVar2.getClass();
        C22871g gVar = (C22871g) iVar.f287210c.mo17428b();
        gVar.getClass();
        C90021c cVar = (C90021c) iVar.f287211d.mo17428b();
        cVar.getClass();
        C68214a a = C68219e.m98518a(((C68226l) iVar.f287212e).f184585a);
        a.getClass();
        C102846o oVar = (C102846o) iVar.f287213f.mo17428b();
        oVar.getClass();
        C68214a a2 = C68219e.m98518a(((C68226l) iVar.f287214g).f184585a);
        a2.getClass();
        C102839h hVar = r2;
        C102839h hVar2 = new C102839h(str, dVar, 16000, i, false, z, z2, z3, context, iVar2, gVar, cVar, a, oVar, a2);
        if (aVar.b()) {
            ((C59052c) ((C59052c) C102839h.f287184a.mo56225c()).mo56372aa(21272)).mo56386p("Not enrolling an empty list of samples");
            C89849ae aeVar = C89849ae.RUN_ENROLLMENT_NO_UTTERANCES;
            C92496a aVar2 = (C92496a) C92497b.f258129f.createBuilder();
            C102839h hVar3 = hVar;
            int i2 = hVar3.f287187d;
            aVar2.copyOnWrite();
            C92497b bVar2 = (C92497b) aVar2.instance;
            bVar2.f258131a |= 2;
            bVar2.f258133c = i2;
            int i3 = hVar3.f287188e;
            aVar2.copyOnWrite();
            C92497b bVar3 = (C92497b) aVar2.instance;
            bVar3.f258131a |= 4;
            bVar3.f258134d = i3;
            aVar2.copyOnWrite();
            C92497b bVar4 = (C92497b) aVar2.instance;
            bVar4.f258131a |= 8;
            bVar4.f258135e = 0;
            new C90873ag(hVar3.f287195l.mo87262b(hVar3.f287190g, (C92497b) aVar2.build(), hVar3.f287185b, false), hVar3.f287199p, "getHotwordDataForAppFlow", new C102834c(hVar3, aeVar)).mo85223a(C102835d.f287180a);
            hVar3.mo93501a();
            return;
        }
        C102839h hVar4 = hVar;
        if (hVar4.f287200q.mo79746e(C90082eg.f249888aD)) {
            ((C59052c) ((C59052c) C102839h.f287184a.mo56224b()).mo56372aa(21270)).mo56387q("Running enrollment from %d samples", aVar.a());
        }
        hVar4.f287191h = aVar;
        hVar4.f287197n = bVar;
        hVar4.f287192i = new ArrayList();
        hVar4.f287198o.sendBroadcast(new Intent("com.google.android.googlequicksearchbox.action.PAUSE_HOTWORD").putExtra("com.google.android.googlequicksearchbox.extra.PAUSE_HOTWORD_REQUESTING_PACKAGE", hVar4.f287198o.getPackageName()));
        ((C59052c) ((C59052c) C102839h.f287184a.mo56224b()).mo56372aa(21271)).mo56389s("#runEnrollment [hotwordSpec: %s]", hVar4.f287190g);
        hVar4.f287193j = 0;
        hVar4.f287194k = 0;
        if (hVar4.mo93505e()) {
            hVar4.mo93504d();
            return;
        }
        if (hVar4.f287205v) {
            C90584f a3 = C90584f.m147800a(hVar4.f287190g.f253248b);
            if (a3 == null) {
                a3 = C90584f.OK_GOOGLE;
            }
            EventForDump e = EventForDump.m147676e(6, "model removed by enrollment runner type:" + a3.f253255d + " locale:" + hVar4.f287190g.f253249c);
            if (hVar4.f287200q.mo79746e(C90082eg.f249999cI)) {
                ((C89994f) hVar4.f287201r.mo27525b()).mo83845H(new SpeakerIdModel(hVar4.f287186c), false, e);
            } else {
                ((C89994f) hVar4.f287201r.mo27525b()).mo83843F(hVar4.f287186c, e);
            }
        }
        hVar4.mo93504d();
    }
}
