package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.p8923a.C119091p;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.c.bx */
/* compiled from: PG */
public final /* synthetic */ class C115254bx implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C115274cq f319800a;

    /* renamed from: b */
    public final /* synthetic */ int f319801b;

    /* renamed from: c */
    public final /* synthetic */ int f319802c;

    public /* synthetic */ C115254bx(C115274cq cqVar, int i, int i2) {
        this.f319800a = cqVar;
        this.f319801b = i;
        this.f319802c = i2;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C115274cq cqVar = this.f319800a;
        int i = this.f319801b;
        int i2 = this.f319802c;
        Optional findFirst = Collection.EL.stream((C58485gu) obj).filter(new C115239bi(i)).findFirst();
        if (!findFirst.isEmpty()) {
            cqVar.f319853g.mo101967o(i2, (int) ((C119091p) findFirst.get()).mo104167f());
        }
    }
}
