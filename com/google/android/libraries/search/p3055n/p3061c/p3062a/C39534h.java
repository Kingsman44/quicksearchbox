package com.google.android.libraries.search.p3055n.p3061c.p3062a;

import android.media.AudioFormat;
import android.service.voice.AlwaysOnHotwordDetector;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p2904c.C37461cj;
import com.google.android.libraries.search.p2904c.C37462ck;
import com.google.android.libraries.search.p2904c.C37466co;
import com.google.android.libraries.search.p2904c.C37467cp;
import com.google.android.libraries.search.p2904c.C37477cz;
import com.google.android.libraries.search.p2904c.C37494da;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3068f.p3069a.C39526i;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3071h.C39536aa;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3071h.C39538ac;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3071h.C39580br;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3071h.C39584c;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3071h.C39587f;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3071h.C39589h;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3071h.C39591j;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.protobuf.C62910ar;

/* renamed from: com.google.android.libraries.search.n.c.a.h */
/* compiled from: PG */
public final /* synthetic */ class C39534h implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C39633o f104100a;

    /* renamed from: b */
    public final /* synthetic */ AlwaysOnHotwordDetector.EventPayload f104101b;

    /* renamed from: c */
    public final /* synthetic */ C62910ar f104102c;

    public /* synthetic */ C39534h(C39633o oVar, AlwaysOnHotwordDetector.EventPayload eventPayload, C62910ar arVar) {
        this.f104100a = oVar;
        this.f104101b = eventPayload;
        this.f104102c = arVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C39633o oVar = this.f104100a;
        AlwaysOnHotwordDetector.EventPayload eventPayload = this.f104101b;
        C62910ar arVar = this.f104102c;
        C59104x b = C39633o.f104316a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "AOHotwordDetectorMgr");
        ((C59052c) ((C59052c) b).mo56372aa(53493)).mo56386p("#onDetected. DSP hotword detected, will verify it with Soda.");
        int i = -1;
        try {
            Integer num = (Integer) eventPayload.getClass().getMethod("getCaptureSession", new Class[0]).invoke(eventPayload, new Object[0]);
            if (num != null) {
                i = num.intValue();
            }
        } catch (Exception e) {
            ((C59052c) ((C59052c) ((C59052c) C39635q.f104345a.mo56225c()).mo56382g(e)).mo56372aa(53511)).mo56386p("Failed to get captureSession");
        }
        if (i >= 0) {
            C59104x b2 = C39633o.f104316a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "AOHotwordDetectorMgr");
            ((C59052c) ((C59052c) b2).mo56372aa(53504)).mo56387q("Capture session id %d", i);
            C39526i iVar = oVar.f104328m;
            AudioFormat captureAudioFormat = eventPayload.getCaptureAudioFormat();
            if (captureAudioFormat == null) {
                iVar.mo41869c(C37176a.f97282ic);
                ((C59052c) ((C59052c) C39635q.f104345a.mo56225c()).mo56372aa(53512)).mo56386p("AudioFormat is not available in EventPayload");
                captureAudioFormat = new AudioFormat.Builder().setChannelMask(16).setEncoding(2).setSampleRate(16000).build();
            }
            C39587f fVar = new C39587f();
            fVar.mo41934b(captureAudioFormat.getChannelCount());
            fVar.mo41935c(true);
            fVar.mo41936d(captureAudioFormat.getSampleRate());
            C39536aa a = fVar.mo41933a();
            C39589h hVar = new C39589h();
            hVar.mo41887c(oVar.f104329n.mo41814a());
            hVar.mo41888d(oVar.f104329n.mo41817d());
            hVar.mo41889e(oVar.f104329n.mo41815b());
            hVar.mo41886b(oVar.f104325j.f395905z);
            C39538ac a2 = hVar.mo41885a();
            C39580br brVar = oVar.f104321f;
            C39591j jVar = new C39591j();
            jVar.mo41918d(a2);
            jVar.mo41917c(a);
            C39584c cVar = new C39584c();
            cVar.mo41881b(C39635q.m69089a(captureAudioFormat, true));
            C37461cj cjVar = (C37461cj) C37462ck.f99442c.createBuilder();
            C37466co coVar = (C37466co) C37467cp.f99458c.createBuilder();
            C37477cz czVar = (C37477cz) C37494da.f99545c.createBuilder();
            czVar.copyOnWrite();
            C37494da daVar = (C37494da) czVar.instance;
            daVar.f99547a |= 1;
            daVar.f99548b = i;
            coVar.copyOnWrite();
            C37467cp cpVar = (C37467cp) coVar.instance;
            C37494da daVar2 = (C37494da) czVar.build();
            daVar2.getClass();
            cpVar.f99461b = daVar2;
            cpVar.f99460a = 3;
            cjVar.copyOnWrite();
            C37462ck ckVar = (C37462ck) cjVar.instance;
            C37467cp cpVar2 = (C37467cp) coVar.build();
            cpVar2.getClass();
            ckVar.f99445b = cpVar2;
            ckVar.f99444a |= 1;
            cVar.f104204a = C58833ax.m90834k((C37462ck) cjVar.build());
            jVar.mo41916b(cVar.mo41880a());
            jVar.f104226a = C58833ax.m90834k(arVar);
            C39390af afVar = oVar.f104331p;
            afVar.getClass();
            jVar.f104227b = afVar;
            return brVar.mo41908f(jVar.mo41915a());
        }
        C59104x d = C39633o.f104316a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "AOHotwordDetectorMgr");
        ((C59052c) ((C59052c) d).mo56372aa(53505)).mo56387q("captureSession: %d is invalid", i);
        oVar.f104328m.mo41872f(C37176a.f97285if.mo40806d(), C58836b.f156633a, 3);
        throw new IllegalStateException(String.format("Invalid capture session : %d", new Object[]{Integer.valueOf(i)}));
    }
}
