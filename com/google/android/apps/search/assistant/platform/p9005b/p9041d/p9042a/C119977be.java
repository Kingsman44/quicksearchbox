package com.google.android.apps.search.assistant.platform.p9005b.p9041d.p9042a;

import androidx.p104d.p105a.C2169h;
import com.google.android.apps.search.assistant.platform.p9005b.p9039c.C119938a;
import com.google.android.apps.search.assistant.platform.p9005b.p9041d.p9042a.C119979bg;
import com.google.android.apps.search.assistant.platform.p9080f.p9109g.p9110a.C120678r;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import dagger.hilt.C68286a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.b.d.a.be */
/* compiled from: PG */
public final /* synthetic */ class C119977be implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C119979bg f334087a;

    /* renamed from: b */
    public final /* synthetic */ Optional f334088b;

    public /* synthetic */ C119977be(C119979bg bgVar, Optional optional) {
        this.f334087a = bgVar;
        this.f334088b = optional;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C119979bg bgVar = this.f334087a;
        Optional optional = this.f334088b;
        if (optional.isEmpty()) {
            bgVar.mo104597a(C119979bg.f334090b);
            return C60866ct.f164955a;
        }
        C59104x b = C119979bg.f334089a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ConvEngine.ClientInteraction");
        C59052c cVar = (C59052c) b;
        cVar.mo56378ag(C119938a.f334011a, ((C120678r) optional.get()).f335644a.f333767a);
        ((C59052c) cVar.mo56372aa(34628)).mo56386p("#onInteractionChange");
        return C2169h.m6027a(new C119958ao(((C119979bg.C119980a) C68286a.m98629a(((C120678r) optional.get()).f335645b.f89543a, C119979bg.C119980a.class)).mo104598c()));
    }
}
