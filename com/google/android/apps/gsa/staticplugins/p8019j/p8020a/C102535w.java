package com.google.android.apps.gsa.staticplugins.p8019j.p8020a;

import com.google.android.apps.gsa.search.core.google.p6790a.C85840y;
import com.google.android.apps.gsa.search.core.google.p6790a.C85841z;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.j.a.w */
/* compiled from: PG */
public final class C102535w extends C68247h {

    /* renamed from: a */
    private final C68283d f286157a;

    /* renamed from: c */
    private final C68283d f286158c;

    public C102535w(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C102535w.class), aVar);
        this.f286157a = C68236af.m98549d(dVar);
        this.f286158c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C85841z zVar = (C85841z) list.get(1);
        if (((C86124t) list.get(0)).mo79746e(C90014bt.f247226dE)) {
            return zVar.mo79474e(C85840y.OPA_TASK_REQUEST);
        }
        return C60856cj.m92900i(C58836b.f156633a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f286157a.mo60297gq(), this.f286158c.mo60297gq());
    }
}
