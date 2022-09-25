package com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9703f.p9704a;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119851cs;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9524a.C126977d;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9524a.C126978e;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f.C127043a;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f.C127045c;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f.C127046d;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f.C127050h;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f.C127062t;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127110b;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127113e;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127114f;
import com.google.android.apps.search.assistant.surfaces.voice.lockscreen.keyguard.p9694b.C128258a;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127285e;
import com.google.android.apps.search.assistant.surfaces.voice.p9590e.C127406c;
import com.google.android.apps.search.assistant.surfaces.voice.p9590e.C127407d;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.C127410a;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.C127413b;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.C127436d;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9600g.C127454b;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9600g.C127455c;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34065ca;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.m.f.a.a */
/* compiled from: PG */
public final /* synthetic */ class C128307a implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C128309c f352892a;

    /* renamed from: b */
    public final /* synthetic */ byte[] f352893b;

    public /* synthetic */ C128307a(C128309c cVar, byte[] bArr) {
        this.f352892a = cVar;
        this.f352893b = bArr;
    }

    public final C60870cx apply(Object obj) {
        C128309c cVar = this.f352892a;
        byte[] bArr = this.f352893b;
        C128258a aVar = (C128258a) obj;
        ((C59052c) ((C59052c) C128309c.f352896a.mo56224b()).mo56372aa(37843)).mo56389s("#WaitforAuthenticationPerformer keyguardDismissState: %s", aVar);
        cVar.f352898c.mo19974a(C37176a.f97188go);
        if (aVar != C128258a.SUCCEEDED) {
            if (aVar == C128258a.CANCELLED) {
                cVar.f352898c.mo19974a(C37176a.f97184gk.mo40805c(C62722b.CANCELLED));
            }
            if (aVar == C128258a.ERROR) {
                cVar.f352898c.mo19974a(C37176a.f97185gl.mo40805c(C62722b.UNKNOWN));
            }
            C126977d dVar = cVar.f352897b;
            C127113e eVar = (C127113e) C127114f.f350009c.createBuilder();
            C127050h hVar = C127050h.ASSISTANT_DISMISSED;
            eVar.copyOnWrite();
            C127114f fVar = (C127114f) eVar.instance;
            fVar.f350012b = hVar.getNumber();
            fVar.f350011a |= 1;
            C46459k.m82829b(dVar.mo107876b((C127114f) eVar.build()), "Failed to stop conversation", new Object[0]);
            return C60856cj.m92900i(C127406c.f350821b);
        } else if (bArr == null || bArr.length == 0) {
            cVar.f352898c.mo19974a(C37176a.f97183gj.mo40805c(C62722b.OK));
            return C60856cj.m92900i(C127406c.f350821b);
        } else {
            C51805du duVar = C51805du.f135924e;
            try {
                C51805du duVar2 = (C51805du) C62942bv.parseFrom((C62942bv) C51805du.f135924e, bArr, C62921ba.m95368a());
                C127454b bVar = C127454b.CLIENT_INPUT;
                C127285e eVar2 = cVar.f352899d.f350570h;
                if (eVar2 == null) {
                    eVar2 = C127285e.f350551c;
                }
                C119851cs csVar = eVar2.f350554b;
                if (csVar == null) {
                    csVar = C119851cs.f333803i;
                }
                C34053bp bpVar = csVar.f333808d;
                if (bpVar == null) {
                    bpVar = C34053bp.f90753a;
                }
                C127110b b = C127407d.m208362b(bVar, duVar2, bpVar);
                C126977d dVar2 = cVar.f352897b;
                C69664n.m101061g(b, "startRequest");
                C119851cs csVar2 = b.f350003b;
                if (csVar2 == null) {
                    csVar2 = C119851cs.f333803i;
                }
                if ((csVar2.f333805a & 1) != 0) {
                    C126978e eVar3 = dVar2.f349648a;
                    C127043a aVar2 = (C127043a) C127046d.f349837e.createBuilder();
                    C69664n.m101060f(aVar2, "newBuilder()");
                    C127062t a = C69664n.m101061g(aVar2, "builder");
                    C119851cs csVar3 = b.f350003b;
                    if (csVar3 == null) {
                        csVar3 = C119851cs.f333803i;
                    }
                    C69664n.m101060f(csVar3, "startRequest.request");
                    a.mo107915c(csVar3);
                    C127410a aVar3 = (C127410a) C127413b.f350829i.createBuilder();
                    C69664n.m101060f(aVar3, "newBuilder()");
                    C127436d a2 = C69664n.m101061g(aVar3, "builder");
                    C127455c cVar2 = b.f350005d;
                    if (cVar2 == null) {
                        cVar2 = C127455c.f350936b;
                    }
                    C69664n.m101060f(cVar2, "startRequest.entryPointContext");
                    a2.mo108066g(cVar2);
                    C34065ca caVar = b.f350006e;
                    if (caVar == null) {
                        caVar = C34065ca.f90770i;
                    }
                    C69664n.m101060f(caVar, "startRequest.requestedSharedResources");
                    a2.mo108065f(caVar);
                    a.mo107914b(a2.mo108060a());
                    C127045c cVar3 = b.f350004c;
                    if (cVar3 == null) {
                        cVar3 = C127045c.f349832d;
                    }
                    C69664n.m101060f(cVar3, "startRequest.queryContextParams");
                    a.mo107916d(cVar3);
                    C60870cx a3 = eVar3.mo107878a(a.mo107913a());
                    C69664n.m101060f(a3, "conversationController.s…ntextParams\n      }\n    )");
                    C46459k.m82829b(a3, "Failed to start conversation", new Object[0]);
                    cVar.f352898c.mo19974a(C37176a.f97183gj.mo40805c(C62722b.OK));
                    return C60856cj.m92900i(C127406c.f350821b);
                }
                throw new IllegalArgumentException("Starting an interaction without self trigger requires an invocation token.");
            } catch (C62974ct e) {
                cVar.f352898c.mo19974a(C37176a.f97186gm.mo40805c(C62722b.INVALID_ARGUMENT));
                ((C59052c) ((C59052c) ((C59052c) C128309c.f352896a.mo56225c()).mo56382g(e)).mo56372aa(37845)).mo56386p("#onCreate: Failed to reconstruct client input");
                return C60856cj.m92900i(C127406c.f350821b);
            }
        }
    }
}
