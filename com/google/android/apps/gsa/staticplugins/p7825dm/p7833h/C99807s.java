package com.google.android.apps.gsa.staticplugins.p7825dm.p7833h;

import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.search.location.p3029a.C38627bs;
import com.google.android.libraries.search.location.p3029a.C38628bt;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47245e;
import com.google.common.util.concurrent.C60856cj;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4307l.C56733i;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4307l.C56734j;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.dm.h.s */
/* compiled from: PG */
public final /* synthetic */ class C99807s implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C99812x f279219a;

    public /* synthetic */ C99807s(C99812x xVar) {
        this.f279219a = xVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        Optional ia = ((C38628bt) C47245e.m84045a(this.f279219a.f279229g, C38628bt.class, (AccountId) obj)).mo41526ia();
        if (ia.isPresent()) {
            return ((C38627bs) ia.get()).mo41507c();
        }
        C56733i iVar = (C56733i) C56734j.f151421c.createBuilder();
        iVar.copyOnWrite();
        C56734j jVar = (C56734j) iVar.instance;
        jVar.f151424b = 1;
        jVar.f151423a = 1 | jVar.f151423a;
        return C60856cj.m92900i((C56734j) iVar.build());
    }
}
