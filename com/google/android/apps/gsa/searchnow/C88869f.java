package com.google.android.apps.gsa.searchnow;

import com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90286b;
import com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90291g;
import com.google.android.apps.gsa.shared.p6990an.C89228s;
import com.google.android.apps.gsa.shared.p6990an.C89229t;
import com.google.android.apps.gsa.shared.util.C90736at;
import com.google.android.libraries.searchbox.shared.response.C41658m;

/* renamed from: com.google.android.apps.gsa.searchnow.f */
/* compiled from: PG */
public final /* synthetic */ class C88869f implements C90736at {

    /* renamed from: a */
    public final /* synthetic */ C90286b f240647a;

    public /* synthetic */ C88869f(C90286b bVar) {
        this.f240647a = bVar;
    }

    /* renamed from: a */
    public final void mo17700a(Object obj) {
        C90286b bVar = this.f240647a;
        C41658m mVar = (C41658m) obj;
        C89229t tVar = ((C90291g) bVar.instance).f252193i;
        if (tVar == null) {
            tVar = C89229t.f241959d;
        }
        C89228s sVar = (C89228s) tVar.toBuilder();
        sVar.copyOnWrite();
        C89229t tVar2 = (C89229t) sVar.instance;
        mVar.getClass();
        tVar2.f241962b = mVar;
        tVar2.f241961a |= 1;
        bVar.copyOnWrite();
        C90291g gVar = (C90291g) bVar.instance;
        C89229t tVar3 = (C89229t) sVar.build();
        tVar3.getClass();
        gVar.f252193i = tVar3;
        gVar.f252185a |= 64;
    }
}
