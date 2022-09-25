package com.google.android.apps.gsa.staticplugins.p7421aw;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90085ej;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p395al.p417d.p418a.C8575bc;
import com.google.p4449cd.C57940c;
import dagger.p5295b.C68282c;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.aw.v */
/* compiled from: PG */
public final class C94409v extends C68247h {

    /* renamed from: a */
    private final C68283d f263937a;

    /* renamed from: c */
    private final C68283d f263938c;

    /* renamed from: d */
    private final C68283d f263939d;

    public C94409v(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C94409v.class), aVar);
        this.f263937a = C68236af.m98549d(dVar);
        this.f263938c = C68236af.m98549d(dVar2);
        this.f263939d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C86124t tVar = (C86124t) list.get(0);
        C68282c cVar = (C68282c) list.get(1);
        C68283d dVar = this.f263939d;
        if (C57940c.m88583j(cVar)) {
            C8575bc bcVar = (C8575bc) C57940c.m88578e(cVar, C8575bc.f29690g);
            if (tVar.mo79746e(C90085ej.f250118V) || tVar.mo79746e(C90085ej.f250117U) || (bcVar.f29692a & 1) != 0 || bcVar.f29694c.size() > 0) {
                return dVar.mo60297gq();
            }
        }
        return C118826c.f331423b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f263937a.mo60297gq(), C68236af.m98546a(this.f263938c.mo60297gq()));
    }
}
