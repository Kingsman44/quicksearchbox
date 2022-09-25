package com.google.android.apps.gsa.staticplugins.opa.util.p8593a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.a.k */
/* compiled from: PG */
public final class C113756k extends C68247h {

    /* renamed from: a */
    private final C68283d f315055a;

    /* renamed from: c */
    private final C68283d f315056c;

    /* renamed from: d */
    private final C68283d f315057d;

    public C113756k(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C113756k.class), aVar);
        this.f315055a = C68236af.m98549d(dVar);
        this.f315056c = C68236af.m98549d(dVar2);
        this.f315057d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        int intValue = ((Integer) list.get(0)).intValue();
        C68283d dVar = this.f315057d;
        if (intValue >= ((int) ((C86124t) list.get(1)).mo79743a(C90037cp.f248569cr))) {
            return C60856cj.m92900i(C118826c.f331422a);
        }
        return dVar.mo60297gq();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f315055a.mo60297gq(), this.f315056c.mo60297gq());
    }
}
