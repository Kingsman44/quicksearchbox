package com.google.android.apps.search.assistant.surfaces.voice.p9510b;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119845cm;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119850cr;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119851cs;
import com.google.android.apps.search.assistant.surfaces.common.p9419a.p9421b.C125013b;
import com.google.android.apps.search.assistant.surfaces.common.p9419a.p9421b.C125017f;
import com.google.android.apps.search.assistant.surfaces.common.p9419a.p9421b.C125018g;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9524a.C126978e;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f.C127043a;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f.C127046d;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2693a.C34708c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.b.c */
/* compiled from: PG */
public final class C126911c implements C126909a {

    /* renamed from: a */
    public static final C59071e f349424a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.b.c");

    /* renamed from: b */
    private final C126978e f349425b;

    /* renamed from: c */
    private final Executor f349426c;

    public C126911c(C126978e eVar, Executor executor) {
        this.f349425b = eVar;
        this.f349426c = executor;
    }

    /* renamed from: a */
    public final void mo107852a(C125018g gVar) {
        Optional optional;
        C125013b bVar;
        C59071e eVar = f349424a;
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(37235)).mo56389s("TRIGGER onTrigger: %s", C125017f.m204944a(gVar.f344936a).name());
        int ordinal = C125017f.m204944a(gVar.f344936a).ordinal();
        if (ordinal == 0 || ordinal == 1) {
            C119845cm cmVar = (C119845cm) C119851cs.f333803i.createBuilder();
            C34053bp a = C34708c.m63442a("Assistant Powered Voice Search");
            cmVar.copyOnWrite();
            C119851cs csVar = (C119851cs) cmVar.instance;
            a.getClass();
            csVar.f333808d = a;
            csVar.f333805a |= 1;
            C119850cr crVar = C119850cr.f333797d;
            cmVar.copyOnWrite();
            C119851cs csVar2 = (C119851cs) cmVar.instance;
            crVar.getClass();
            csVar2.f333807c = crVar;
            csVar2.f333806b = 2;
            optional = Optional.m71637of((C119851cs) cmVar.build());
        } else if (ordinal == 2) {
            if (gVar.f344936a == 3) {
                bVar = (C125013b) gVar.f344937b;
            } else {
                bVar = C125013b.f344923b;
            }
            C119851cs csVar3 = bVar.f344925a;
            if (csVar3 == null) {
                csVar3 = C119851cs.f333803i;
            }
            C119845cm cmVar2 = (C119845cm) csVar3.toBuilder();
            C34053bp a2 = C34708c.m63442a("Assistant Powered Voice Search");
            cmVar2.copyOnWrite();
            C119851cs csVar4 = (C119851cs) cmVar2.instance;
            a2.getClass();
            csVar4.f333808d = a2;
            csVar4.f333805a |= 1;
            C119850cr crVar2 = C119850cr.f333797d;
            cmVar2.copyOnWrite();
            C119851cs csVar5 = (C119851cs) cmVar2.instance;
            crVar2.getClass();
            csVar5.f333807c = crVar2;
            csVar5.f333806b = 2;
            optional = Optional.m71637of((C119851cs) cmVar2.build());
        } else if (ordinal == 3) {
            optional = Optional.empty();
        } else {
            throw new AssertionError();
        }
        if (optional.isEmpty()) {
            ((C59052c) ((C59052c) eVar.mo56226d()).mo56372aa(37236)).mo56389s("Received Invalid Trigger type. Request Ignored :%s ", C125017f.m204944a(gVar.f344936a));
            return;
        }
        C127043a aVar = (C127043a) C127046d.f349837e.createBuilder();
        C119851cs csVar6 = (C119851cs) optional.get();
        aVar.copyOnWrite();
        C127046d dVar = (C127046d) aVar.instance;
        csVar6.getClass();
        dVar.f349840b = csVar6;
        dVar.f349839a |= 2;
        C60856cj.m92911t(this.f349425b.mo107878a((C127046d) aVar.build()), C47810es.m84974n(new C126910b()), this.f349426c);
    }
}
