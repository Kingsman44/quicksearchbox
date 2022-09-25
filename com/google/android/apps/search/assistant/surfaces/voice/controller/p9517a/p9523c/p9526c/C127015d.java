package com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9526c;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119861db;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119863dd;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9519b.p9520a.C126933a;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f.C127050h;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f.C127051i;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9530g.p9531a.C127081o;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62912at;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.controller.conversation.controller.impl.ControllerServiceBackendImpl$stopInteraction$1", mo61344c = "ControllerServiceBackendImpl.kt", mo61345d = "invokeSuspend", mo61346e = {112})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.c.d */
/* compiled from: PG */
final class C127015d extends C69572j implements C69626l {

    /* renamed from: a */
    int f349756a;

    /* renamed from: b */
    final /* synthetic */ C127018g f349757b;

    /* renamed from: c */
    final /* synthetic */ C127051i f349758c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C127015d(C127018g gVar, C127051i iVar, C69577g gVar2) {
        super(1, gVar2);
        this.f349757b = gVar;
        this.f349758c = iVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C127015d(this.f349757b, this.f349758c, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C119863dd ddVar;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f349756a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C127081o oVar = this.f349757b.f349769g;
            if (oVar != null) {
                oVar.close();
            }
            C119834cb cbVar = ((C127034w) this.f349757b.f349765c.f349746e.mo62784e()).f349813d;
            if ((this.f349758c.f349866a & 1) != 0 && !C69664n.m101066l(cbVar, C119834cb.f333765b)) {
                C119834cb cbVar2 = this.f349758c.f349867b;
                if (cbVar2 == null) {
                    cbVar2 = C119834cb.f333765b;
                }
                if (!C69664n.m101066l(cbVar2, cbVar)) {
                    C59052c cVar = (C59052c) C127018g.f349763a.mo56225c();
                    String str = cbVar.f333767a;
                    C119834cb cbVar3 = this.f349758c.f349867b;
                    if (cbVar3 == null) {
                        cbVar3 = C119834cb.f333765b;
                    }
                    String str2 = cbVar3.f333767a;
                    cVar.mo56379ah(new C59094n(37344));
                    cVar.mo56354G("Interaction id does not match. currentInteractionId is %s. requestedId is %s.", str, str2);
                    return null;
                }
            }
            C127012af afVar = this.f349757b.f349765c;
            afVar.mo107893d(new C127036y(afVar));
            if ((this.f349758c.f349866a & 1) != 0) {
                C119861db dbVar = (C119861db) C119863dd.f333821c.createBuilder();
                C119834cb cbVar4 = this.f349758c.f349867b;
                if (cbVar4 == null) {
                    cbVar4 = C119834cb.f333765b;
                }
                dbVar.copyOnWrite();
                C119863dd ddVar2 = (C119863dd) dbVar.instance;
                cbVar4.getClass();
                ddVar2.f333824b = cbVar4;
                ddVar2.f333823a = 2;
                ddVar = (C119863dd) dbVar.build();
            } else {
                C119861db dbVar2 = (C119861db) C119863dd.f333821c.createBuilder();
                C62912at atVar = C62912at.f169862a;
                dbVar2.copyOnWrite();
                C119863dd ddVar3 = (C119863dd) dbVar2.instance;
                atVar.getClass();
                ddVar3.f333824b = atVar;
                ddVar3.f333823a = 1;
                ddVar = (C119863dd) dbVar2.build();
            }
            C69664n.m101060f(ddVar, "if (request.hasInteracti…       .build()\n        }");
            C126933a aVar2 = this.f349757b.f349766d;
            C127050h a = C127050h.m207796a(this.f349758c.f349868c);
            if (a == null) {
                a = C127050h.UNRECOGNIZED;
            }
            C60870cx b = aVar2.mo107857b(ddVar, a, cbVar);
            C69664n.m101060f(b, "conversationConnectionMa…on, currentInteractionId)");
            this.f349756a = 1;
            obj = C71663i.m104690c(b, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
