package com.google.android.apps.gsa.staticplugins.p7442bc;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6816p.C86232bo;
import com.google.android.apps.gsa.shared.p6968aa.C89044bo;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bc.v */
/* compiled from: PG */
public final class C94529v extends C68247h {

    /* renamed from: a */
    private final C68283d f264410a;

    /* renamed from: c */
    private final C68283d f264411c;

    /* renamed from: d */
    private final C68283d f264412d;

    public C94529v(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C94529v.class), aVar);
        this.f264410a = C68236af.m98549d(dVar);
        this.f264411c = C68236af.m98549d(dVar2);
        this.f264412d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C89044bo boVar = (C89044bo) list.get(0);
        C58833ax axVar = (C58833ax) list.get(1);
        if (((Integer) list.get(2)).intValue() == 1) {
            C58838bb.m90884s(axVar.mo56113h(), "OnlineFetcher returned absent SearchResult");
            C86232bo boVar2 = (C86232bo) axVar.mo56107c();
            if (boVar2.mo79882R()) {
                return boVar2.mo79898v();
            }
            boVar.mo57356n(axVar);
        }
        return C118826c.f331423b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f264410a.mo60297gq(), this.f264411c.mo60297gq(), this.f264412d.mo60297gq());
    }
}
