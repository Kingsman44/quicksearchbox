package com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9526c;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119851cs;
import com.google.android.apps.search.assistant.platform.p9141h.p9152d.p9153a.C121040c;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9524a.C126974a;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f.C127046d;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9533a.C127086d;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127289i;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9581g.C127355c;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.C127413b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.c.q */
/* compiled from: PG */
public final /* synthetic */ class C127028q implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C127032u f349788a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f349789b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f349790c;

    /* renamed from: d */
    public final /* synthetic */ C127046d f349791d;

    /* renamed from: e */
    public final /* synthetic */ C60870cx f349792e;

    /* renamed from: f */
    public final /* synthetic */ C127289i f349793f;

    public /* synthetic */ C127028q(C127032u uVar, C60870cx cxVar, C60870cx cxVar2, C127046d dVar, C60870cx cxVar3, C127289i iVar) {
        this.f349788a = uVar;
        this.f349789b = cxVar;
        this.f349790c = cxVar2;
        this.f349791d = dVar;
        this.f349792e = cxVar3;
        this.f349793f = iVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C127032u uVar = this.f349788a;
        C60870cx cxVar = this.f349789b;
        C60870cx cxVar2 = this.f349790c;
        C127046d dVar = this.f349791d;
        C60870cx cxVar3 = this.f349792e;
        C127289i iVar = this.f349793f;
        if (!((Boolean) C60856cj.m92909r(cxVar)).booleanValue()) {
            C59104x b = C127032u.f349799a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "ConvControllerService");
            ((C59052c) ((C59052c) b).mo56372aa(37355)).mo56386p("Assistant is not enabled, interaction is canceled");
            return C60856cj.m92898g();
        }
        if (C60856cj.m92909r(cxVar2) == C121040c.TOUCH && (dVar.f349839a & 4) != 0) {
            C127413b bVar = dVar.f349841c;
            if (bVar == null) {
                bVar = C127413b.f350829i;
            }
            if (bVar.f350832b != 6) {
                C119851cs csVar = dVar.f349840b;
                if (csVar == null) {
                    csVar = C119851cs.f333803i;
                }
                if (csVar.f333806b == 2) {
                    C59104x b2 = C127032u.f349799a.mo56224b();
                    b2.mo56378ag(C58975e.f156826a, "ConvControllerService");
                    ((C59052c) ((C59052c) b2).mo56372aa(37354)).mo56386p("Touch input modality detected, cancelling interaction");
                    return C60856cj.m92898g();
                }
            }
        }
        if (!((C127086d) C60856cj.m92909r(cxVar3)).f349942b) {
            uVar.f349801c.f350715a.set(true);
            C127355c cVar = uVar.f349801c;
            C127413b bVar2 = dVar.f349841c;
            if (bVar2 == null) {
                bVar2 = C127413b.f350829i;
            }
            cVar.f350716b.set(bVar2.f350838h);
        }
        C126974a aVar = uVar.f349800b;
        C119851cs csVar2 = dVar.f349840b;
        if (csVar2 == null) {
            csVar2 = C119851cs.f333803i;
        }
        return aVar.mo107873a(csVar2, iVar);
    }
}
