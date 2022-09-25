package com.google.android.apps.gsa.staticplugins.p8019j;

import com.google.android.apps.gsa.assist.p501a.C9318f;
import com.google.android.apps.gsa.assist.p501a.C9321i;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.j.d */
/* compiled from: PG */
public final class C102581d extends C68247h {

    /* renamed from: a */
    private final C68283d f286286a;

    /* renamed from: c */
    private final C68283d f286287c;

    public C102581d(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C102581d.class), aVar);
        this.f286286a = C68236af.m98549d(dVar);
        this.f286287c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C9321i iVar = (C9321i) list.get(0);
        if (!((Query) list.get(1)).mo84363bw("com.google.opa.SEND_ORIGINAL_IMAGE")) {
            return C102580c.m170113a(iVar, C9318f.CONTEXTUAL);
        }
        return C60856cj.m92900i(C58836b.f156633a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f286286a.mo60297gq(), this.f286287c.mo60297gq());
    }
}
