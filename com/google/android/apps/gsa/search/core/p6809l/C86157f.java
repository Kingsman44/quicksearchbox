package com.google.android.apps.gsa.search.core.p6809l;

import com.google.android.apps.gsa.assist.p501a.C9317e;
import com.google.android.apps.gsa.assist.p501a.C9321i;
import com.google.android.apps.gsa.search.shared.p6926d.C87541c;
import com.google.android.apps.gsa.shared.util.p7159c.C90883aq;
import com.google.knowledge.p4671b.C61818k;

/* renamed from: com.google.android.apps.gsa.search.core.l.f */
/* compiled from: PG */
public final class C86157f extends C90883aq {

    /* renamed from: a */
    final /* synthetic */ C86159h f232827a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86157f(C86159h hVar) {
        super("AssistDataFailureCallback", 2, 0);
        this.f232827a = hVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C9321i iVar = ((C87541c) this.f232827a.f232834c.mo27525b()).f236453o;
        iVar.f32342c.mo28212l("NotifyAssistDataFailure", new C9317e(iVar));
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C61818k kVar = (C61818k) obj;
    }
}
