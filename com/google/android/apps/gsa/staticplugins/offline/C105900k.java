package com.google.android.apps.gsa.staticplugins.offline;

import android.content.Context;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4460h.p4461a.C58009ae;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.offline.k */
/* compiled from: PG */
public final class C105900k extends C68247h {

    /* renamed from: a */
    private final C68283d f295557a;

    /* renamed from: c */
    private final C68283d f295558c;

    /* renamed from: d */
    private final C68283d f295559d;

    /* renamed from: e */
    private final C68283d f295560e;

    /* renamed from: f */
    private final C68283d f295561f;

    public C105900k(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5) {
        super(aVar2, new C68277d(C105900k.class), aVar);
        this.f295557a = C68236af.m98549d(dVar);
        this.f295558c = C68236af.m98549d(dVar2);
        this.f295559d = C68236af.m98549d(dVar3);
        this.f295560e = C68236af.m98549d(dVar4);
        this.f295561f = C68236af.m98549d(dVar5);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C118826c cVar = (C118826c) list.get(1);
        return ((C58009ae) list.get(0)).mo54597a(new C105896g((OfflineLoader) list.get(4), (Context) list.get(2), (String) list.get(3)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f295557a.mo60297gq(), this.f295558c.mo60297gq(), this.f295559d.mo60297gq(), this.f295560e.mo60297gq(), this.f295561f.mo60297gq());
    }
}
