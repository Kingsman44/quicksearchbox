package com.google.android.apps.gsa.staticplugins.actions.p7360f;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.f.x */
/* compiled from: PG */
public final class C93384x extends C68247h {

    /* renamed from: a */
    private final C68283d f260456a;

    /* renamed from: c */
    private final C68283d f260457c;

    /* renamed from: d */
    private final C68283d f260458d;

    public C93384x(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C93384x.class), aVar);
        this.f260456a = C68236af.m98549d(dVar);
        this.f260457c = C68236af.m98549d(dVar2);
        this.f260458d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C118826c cVar = (C118826c) list.get(0);
        C68283d dVar = this.f260458d;
        if (((Boolean) list.get(1)).booleanValue()) {
            return C60856cj.m92900i(true);
        }
        return dVar.mo60297gq();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f260456a.mo60297gq(), this.f260457c.mo60297gq());
    }
}
