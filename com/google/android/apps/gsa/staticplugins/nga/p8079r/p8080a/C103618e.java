package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68282c;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.concurrent.ExecutionException;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.a.e */
/* compiled from: PG */
public final class C103618e extends C68247h {

    /* renamed from: a */
    private final C68283d f288651a;

    /* renamed from: c */
    private final C68283d f288652c;

    public C103618e(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C103618e.class), aVar);
        this.f288651a = C68236af.m98549d(dVar);
        this.f288652c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C118826c cVar = (C118826c) list.get(0);
        try {
            return C60856cj.m92900i((C118826c) ((C68282c) list.get(1)).mo60292a());
        } catch (ExecutionException e) {
            return C60856cj.m92899h((Throwable) C58833ax.m90833j(e.getCause()).mo56109e(e));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f288651a.mo60297gq(), C68236af.m98546a(this.f288652c.mo60297gq()));
    }
}
