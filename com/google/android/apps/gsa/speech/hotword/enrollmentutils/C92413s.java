package com.google.android.apps.gsa.speech.hotword.enrollmentutils;

import android.content.Context;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.speech.dumper.C90548ak;
import com.google.android.apps.gsa.shared.speech.dumper.EventForDump;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f;
import com.google.android.apps.gsa.speech.p7272e.p7275c.C92284u;
import com.google.android.apps.gsa.speech.p7272e.p7275c.C92286w;
import com.google.android.libraries.assistant.soda.C19241ad;
import com.google.android.libraries.assistant.soda.C19389y;
import com.google.android.libraries.assistant.soda.C19390z;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59601ay;
import com.google.common.p4552o.C59651be;
import com.google.common.p4552o.C59687cb;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62974ct;
import com.google.speech.p5218j.C67125lz;
import com.google.speech.p5218j.C67136mj;
import com.google.speech.p5218j.C67137mk;
import com.google.speech.p5218j.C67139mm;
import dagger.C68214a;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.speech.hotword.enrollmentutils.s */
/* compiled from: PG */
public final class C92413s implements C92410p {

    /* renamed from: h */
    private static final C59071e f257718h = C59071e.m91332i("com.google.android.apps.gsa.speech.hotword.enrollmentutils.s");

    /* renamed from: a */
    public final C89994f f257719a;

    /* renamed from: b */
    public final C90021c f257720b;

    /* renamed from: c */
    public final C19390z f257721c;

    /* renamed from: d */
    public final Context f257722d;

    /* renamed from: e */
    public final C68214a f257723e;

    /* renamed from: f */
    public final C68214a f257724f;

    /* renamed from: g */
    public final C68214a f257725g;

    /* renamed from: i */
    private final C68214a f257726i;

    /* renamed from: j */
    private final C92286w f257727j;

    public C92413s(C89994f fVar, C90021c cVar, C19390z zVar, Context context, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C92286w wVar) {
        this.f257719a = fVar;
        this.f257720b = cVar;
        this.f257721c = zVar;
        this.f257722d = context;
        this.f257723e = aVar;
        this.f257724f = aVar2;
        this.f257725g = aVar3;
        this.f257726i = aVar4;
        this.f257727j = wVar;
    }

    /* renamed from: f */
    public static C92419y m151754f(int i) {
        C92418x xVar = (C92418x) C92419y.f257739e.createBuilder();
        if (m151755g(i)) {
            xVar.copyOnWrite();
            C92419y yVar = (C92419y) xVar.instance;
            yVar.f257741a |= 2;
            yVar.f257743c = false;
        }
        if (m151756h(i)) {
            xVar.copyOnWrite();
            C92419y yVar2 = (C92419y) xVar.instance;
            yVar2.f257741a |= 2;
            yVar2.f257743c = false;
        }
        return (C92419y) xVar.build();
    }

    /* renamed from: g */
    public static boolean m151755g(int i) {
        return i == 2 || i == 3 || i == 1;
    }

    /* renamed from: h */
    public static boolean m151756h(int i) {
        return i == 4 || i == 1;
    }

    /* renamed from: a */
    public final C60870cx mo87050a(List list, int i) {
        C60870cx b = mo87051b(list, i, true);
        C92412r rVar = new C92412r(i);
        return C60922j.m93045h(b, C47810es.m84966f(rVar), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final C60870cx mo87051b(List list, int i, boolean z) {
        C60870cx cxVar;
        C60870cx cxVar2;
        if (list.isEmpty()) {
            mo87054d(C89849ae.SODA_ENROLLMENT_UTTERANCES_NOT_FOUND);
            mo87055e("not running Soda Voice Match enrollment: no utterances found");
            return C60856cj.m92900i(m151754f(i));
        }
        String Z = this.f257719a.mo83863Z();
        boolean h = m151756h(i);
        if (h) {
            C92286w wVar = this.f257727j;
            cxVar = wVar.f257344c.mo28201a("getSodaResourceDir", new C92284u(wVar, Z));
        } else {
            cxVar = C60856cj.m92900i(C58836b.f156633a);
        }
        C60870cx cxVar3 = cxVar;
        if (h) {
            cxVar2 = this.f257727j.mo86966b(Z);
        } else {
            cxVar2 = C60856cj.m92900i(C58836b.f156633a);
        }
        C60870cx cxVar4 = cxVar2;
        return C60856cj.m92895d(cxVar3, cxVar4).mo57334a(new C92411q(this, list, i, cxVar3, cxVar4, z), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final C67139mm mo87053c(C67125lz lzVar, List list, C19389y yVar, boolean z) {
        C59104x b = f257718h.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SodaVoiceMatchEnroller");
        ((C59052c) ((C59052c) b).mo56372aa(12526)).mo56389s("running Soda Voice Match enrollment: %s", lzVar);
        C67136mj mjVar = (C67136mj) C67137mk.f182488g.createBuilder();
        String af = this.f257719a.mo83886af();
        mjVar.copyOnWrite();
        C67137mk mkVar = (C67137mk) mjVar.instance;
        af.getClass();
        mkVar.f182490a |= 2;
        mkVar.f182494e = af;
        mjVar.copyOnWrite();
        C67137mk mkVar2 = (C67137mk) mjVar.instance;
        mkVar2.f182493d = lzVar.f182473c;
        boolean z2 = true;
        mkVar2.f182490a |= 1;
        mjVar.copyOnWrite();
        C67137mk mkVar3 = (C67137mk) mjVar.instance;
        C62971cq cqVar = mkVar3.f182495f;
        if (!cqVar.mo58948c()) {
            mkVar3.f182495f = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) list, (List) mkVar3.f182495f);
        mjVar.copyOnWrite();
        C67137mk mkVar4 = (C67137mk) mjVar.instance;
        mkVar4.f182491b = 4;
        mkVar4.f182492c = Boolean.valueOf(z);
        C67137mk mkVar5 = (C67137mk) mjVar.build();
        C67139mm mmVar = null;
        if (yVar.f54240f.mo56113h()) {
            try {
                mmVar = ((C19241ad) yVar.f54240f.mo56107c()).mo24328e(mkVar5);
            } catch (C62974ct e) {
                ((C59052c) ((C59052c) ((C59052c) C19389y.f54228a.mo56225c()).mo56382g(e)).mo56372aa(47645)).mo56386p("Failed to parse VoiceMatchEnrollmentEvent");
            }
        }
        if (mmVar == null) {
            ((C90548ak) this.f257725g.mo27525b()).mo84668b(4, EventForDump.m147676e(8, "SodaDetectionHandler enrollForVoiceMatch failed!"), "error");
            mo87054d(C89849ae.SODA_ENROLLMENT_FAILED);
        }
        C59104x b2 = f257718h.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "SodaVoiceMatchEnroller");
        C59052c cVar = (C59052c) ((C59052c) b2).mo56372aa(12527);
        if (mmVar == null || !mmVar.f182499b) {
            z2 = false;
        }
        cVar.mo56389s("completed enrollment successfully: %b", Boolean.valueOf(z2));
        return mmVar;
    }

    /* renamed from: d */
    public final void mo87054d(C89849ae aeVar) {
        C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
        String Z = this.f257719a.mo83863Z();
        ajVar.copyOnWrite();
        C59687cb cbVar = (C59687cb) ajVar.instance;
        Z.getClass();
        cbVar.f160115b |= 4096;
        cbVar.f160048M = Z;
        C59601ay ayVar = (C59601ay) C59651be.f159929E.createBuilder();
        C90584f p = this.f257719a.mo83827p();
        ayVar.copyOnWrite();
        C59651be beVar = (C59651be) ayVar.instance;
        beVar.f159945k = p.f253255d;
        beVar.f159935a |= 4096;
        C59651be beVar2 = (C59651be) ayVar.build();
        ajVar.copyOnWrite();
        C59687cb cbVar2 = (C59687cb) ajVar.instance;
        beVar2.getClass();
        cbVar2.f160100al = beVar2;
        cbVar2.f160122c |= 16;
        C89856f fVar = new C89856f();
        fVar.f246201a = aeVar;
        fVar.f246203c = (C59687cb) ajVar.build();
        ((C89859i) this.f257726i.mo27525b()).mo74236a(fVar.mo83699a());
    }

    /* renamed from: e */
    public final void mo87055e(String str) {
        C59104x c = f257718h.mo56225c();
        c.mo56378ag(C58975e.f156826a, "SodaVoiceMatchEnroller");
        ((C59052c) ((C59052c) c).mo56372aa(12528)).mo56386p(str);
        ((C90548ak) this.f257725g.mo27525b()).mo84668b(4, EventForDump.m147676e(8, str), "error");
    }
}
