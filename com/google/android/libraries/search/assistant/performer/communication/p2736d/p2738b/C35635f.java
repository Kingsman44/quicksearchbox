package com.google.android.libraries.search.assistant.performer.communication.p2736d.p2738b;

import com.google.android.libraries.search.assistant.p2786t.p2787a.C36405a;
import com.google.android.libraries.search.assistant.p2786t.p2787a.C36451b;
import com.google.android.libraries.search.assistant.p2786t.p2787a.C36456g;
import com.google.android.libraries.search.assistant.p2786t.p2790b.p2793c.C36478b;
import com.google.android.libraries.search.assistant.p2786t.p2790b.p2793c.C36479c;
import com.google.android.libraries.search.assistant.p2786t.p2790b.p2793c.C36480d;
import com.google.android.libraries.search.assistant.p2786t.p2790b.p2793c.C36485i;
import com.google.android.libraries.search.assistant.p2786t.p2790b.p2796f.C36506b;
import com.google.android.libraries.search.assistant.p2786t.p2790b.p2796f.C36507c;
import com.google.android.libraries.search.assistant.p2786t.p2790b.p2796f.C36508d;
import com.google.android.libraries.search.assistant.p2786t.p2790b.p2796f.C36511g;
import com.google.android.libraries.search.assistant.performer.communication.p2736d.C35648i;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.android.libraries.search.p3047m.p3050b.C39227c;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.d.b.f */
/* compiled from: PG */
public final class C35635f implements C35648i {

    /* renamed from: a */
    private final C36456g f93490a;

    /* renamed from: b */
    private final Executor f93491b;

    /* renamed from: c */
    private final C39226b f93492c;

    public C35635f(C36456g gVar, Executor executor, C39226b bVar) {
        this.f93490a = gVar;
        this.f93491b = executor;
        this.f93492c = bVar;
    }

    /* renamed from: a */
    public final C60870cx mo20795a() {
        C36456g gVar = this.f93490a;
        C36405a aVar = (C36405a) C36451b.f95174d.createBuilder();
        C36506b bVar = (C36506b) C36511g.f95278c.createBuilder();
        C36507c cVar = (C36507c) C36508d.f95271d.createBuilder();
        String b = C39227c.m68658b(this.f93492c);
        cVar.copyOnWrite();
        C36508d dVar = (C36508d) cVar.instance;
        b.getClass();
        dVar.f95273a |= 1;
        dVar.f95274b = b;
        C36508d dVar2 = (C36508d) cVar.build();
        bVar.copyOnWrite();
        C36511g gVar2 = (C36511g) bVar.instance;
        dVar2.getClass();
        gVar2.f95281b = dVar2;
        gVar2.f95280a = 1;
        C36511g gVar3 = (C36511g) bVar.build();
        aVar.copyOnWrite();
        C36451b bVar2 = (C36451b) aVar.instance;
        gVar3.getClass();
        bVar2.f95178c = gVar3;
        bVar2.f95176a |= 2;
        C36478b bVar3 = (C36478b) C36485i.f95232e.createBuilder();
        C36479c cVar2 = (C36479c) C36480d.f95218d.createBuilder();
        cVar2.mo40192a();
        C36480d dVar3 = (C36480d) cVar2.build();
        bVar3.copyOnWrite();
        C36485i iVar = (C36485i) bVar3.instance;
        dVar3.getClass();
        iVar.f95236c = dVar3;
        iVar.f95234a |= 2;
        C36485i iVar2 = (C36485i) bVar3.build();
        aVar.copyOnWrite();
        C36451b bVar4 = (C36451b) aVar.instance;
        iVar2.getClass();
        bVar4.f95177b = iVar2;
        bVar4.f95176a |= 1;
        return C47633f.m84733g(gVar.mo40169a((C36451b) aVar.build())).mo51515h(C35633d.f93488a, this.f93491b);
    }
}
