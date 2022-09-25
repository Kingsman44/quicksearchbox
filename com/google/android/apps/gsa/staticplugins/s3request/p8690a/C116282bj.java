package com.google.android.apps.gsa.staticplugins.s3request.p8690a;

import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90114fl;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4460h.C58003a;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.s3request.a.bj */
/* compiled from: PG */
public final class C116282bj extends C68247h {

    /* renamed from: a */
    private final C68283d f322399a;

    /* renamed from: c */
    private final C68283d f322400c;

    /* renamed from: d */
    private final C68283d f322401d;

    public C116282bj(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C116282bj.class), aVar);
        this.f322399a = C68236af.m98549d(dVar);
        this.f322400c = C68236af.m98549d(dVar2);
        this.f322401d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        return ((C58003a) list.get(0)).mo54593a(this.f322399a, ((C90021c) list.get(1)).mo79743a(C90114fl.f250731e), TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f322400c.mo60297gq(), this.f322401d.mo60297gq());
    }
}
