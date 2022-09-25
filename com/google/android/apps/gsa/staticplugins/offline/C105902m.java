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

/* renamed from: com.google.android.apps.gsa.staticplugins.offline.m */
/* compiled from: PG */
public final class C105902m extends C68247h {

    /* renamed from: a */
    private final C68283d f295568a;

    /* renamed from: c */
    private final C68283d f295569c;

    /* renamed from: d */
    private final C68283d f295570d;

    /* renamed from: e */
    private final C68283d f295571e;

    /* renamed from: f */
    private final C68283d f295572f;

    public C105902m(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5) {
        super(aVar2, new C68277d(C105902m.class), aVar);
        this.f295568a = C68236af.m98549d(dVar);
        this.f295569c = C68236af.m98549d(dVar2);
        this.f295570d = C68236af.m98549d(dVar3);
        this.f295571e = C68236af.m98549d(dVar4);
        this.f295572f = C68236af.m98549d(dVar5);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C118826c cVar = (C118826c) list.get(1);
        return ((C58009ae) list.get(0)).mo54597a(new C105895f((OfflineLoader) list.get(4), (Context) list.get(2), (String) list.get(3)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f295568a.mo60297gq(), this.f295569c.mo60297gq(), this.f295570d.mo60297gq(), this.f295571e.mo60297gq(), this.f295572f.mo60297gq());
    }
}
