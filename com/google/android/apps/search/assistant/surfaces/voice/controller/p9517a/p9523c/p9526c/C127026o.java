package com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9526c;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119851cs;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9524a.C126978e;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126988i;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f.C127046d;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f.C127055m;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9537c.C127147g;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34710a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.c.o */
/* compiled from: PG */
public final class C127026o implements C126978e {

    /* renamed from: b */
    private static final C59071e f349782b = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.c.o");

    /* renamed from: a */
    public final C127055m f349783a;

    /* renamed from: c */
    private final C127147g f349784c;

    public C127026o(C127055m mVar, C127147g gVar) {
        this.f349783a = mVar;
        this.f349784c = gVar;
    }

    /* renamed from: a */
    public final C60870cx mo107878a(C127046d dVar) {
        C59071e eVar = f349782b;
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(37348)).mo56389s("#startConversation: %s", dVar);
        C119851cs csVar = dVar.f349840b;
        if (csVar == null) {
            csVar = C119851cs.f333803i;
        }
        if ((csVar.f333805a & 1) != 0) {
            C59052c cVar = (C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(37349);
            C119851cs csVar2 = dVar.f349840b;
            if (csVar2 == null) {
                csVar2 = C119851cs.f333803i;
            }
            C34053bp bpVar = csVar2.f333808d;
            if (bpVar == null) {
                bpVar = C34053bp.f90753a;
            }
            cVar.mo56389s("#startConversation invocationToken: %s", C34710a.m63444a(bpVar));
        }
        C60870cx b = mo107897b();
        C127021j jVar = new C127021j(this, dVar);
        return C60922j.m93045h(b, C47810es.m84966f(jVar), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final C60870cx mo107897b() {
        C60870cx b = this.f349784c.mo107971b(C126988i.f349669h);
        C127024m mVar = C127024m.f349780a;
        return C60922j.m93045h(b, C47810es.m84966f(mVar), C60826bg.f164896a);
    }
}
