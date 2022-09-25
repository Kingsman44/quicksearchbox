package com.google.android.apps.gsa.staticplugins.p7371ae;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.base.C58847bk;
import com.google.common.p4552o.C60580vd;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.ae.bc */
/* compiled from: PG */
public final class C93744bc extends C68247h {

    /* renamed from: a */
    private final C68283d f261621a;

    /* renamed from: c */
    private final C68283d f261622c;

    /* renamed from: d */
    private final C68283d f261623d;

    /* renamed from: e */
    private final C68283d f261624e;

    public C93744bc(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C93744bc.class), aVar);
        this.f261621a = C68236af.m98549d(dVar);
        this.f261622c = C68236af.m98549d(dVar2);
        this.f261623d = C68236af.m98549d(dVar3);
        this.f261624e = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C60580vd vdVar = (C60580vd) list.get(0);
        C93742ba baVar = (C93742ba) list.get(1);
        C93713a aVar = (C93713a) list.get(2);
        C118826c cVar = (C118826c) list.get(3);
        if (vdVar == C60580vd.DISPLAYED || vdVar == C60580vd.APP_JUST_GRANTED_DEVICE_ALREADY_GRANTED || vdVar == C60580vd.APP_JUST_GRANTED_LSD_DISPLAYED) {
            int d = baVar.f261615b.mo70991d();
            int i = d - 1;
            if (d == 0) {
                throw null;
            } else if (i == 3) {
                ((Long) ((C58847bk) baVar.f261614a).f156646a).longValue();
                aVar.mo88158g();
            }
        } else {
            baVar.f261617d.mo57356n(false);
        }
        return C60856cj.m92900i(C118826c.f331422a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f261621a.mo60297gq(), this.f261622c.mo60297gq(), this.f261623d.mo60297gq(), this.f261624e.mo60297gq());
    }
}
