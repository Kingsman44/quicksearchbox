package com.google.android.apps.gsa.staticplugins.s3request.p8690a;

import com.google.android.apps.gsa.p8889z.p8893c.p8901h.C118928k;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.HotwordResultMetadata;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.p5208h.C66626cx;
import com.google.speech.p5208h.C66628cz;
import com.google.speech.p5208h.C66634da;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.s3request.a.ba */
/* compiled from: PG */
public final class C116273ba extends C68247h {

    /* renamed from: a */
    private final C68283d f322381a;

    public C116273ba(C69464a aVar, C69464a aVar2, C68283d dVar) {
        super(aVar2, new C68277d(C116273ba.class), aVar);
        this.f322381a = C68236af.m98549d(dVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        C118928k kVar;
        Query query = (Query) obj;
        if (query.mo84368cA()) {
            HotwordResultMetadata hotwordResultMetadata = query.f252756N;
            if (hotwordResultMetadata != null) {
                C66628cz czVar = (C66628cz) C66634da.f181292g.createBuilder();
                float a = hotwordResultMetadata.mo84597a();
                czVar.copyOnWrite();
                C66634da daVar = (C66634da) czVar.instance;
                daVar.f181295a |= 2;
                daVar.f181297c = a;
                float b = hotwordResultMetadata.mo84598b();
                czVar.copyOnWrite();
                C66634da daVar2 = (C66634da) czVar.instance;
                daVar2.f181295a |= 1;
                daVar2.f181296b = b;
                C66626cx b2 = C116249ad.m192803b(query);
                czVar.copyOnWrite();
                C66634da daVar3 = (C66634da) czVar.instance;
                daVar3.f181299e = b2.f181272r;
                daVar3.f181295a |= 8;
                czVar.copyOnWrite();
                C66634da daVar4 = (C66634da) czVar.instance;
                daVar4.f181295a |= 16;
                daVar4.f181300f = false;
                kVar = new C118928k(C58833ax.m90834k((C66634da) czVar.build()), C66634da.f181293h);
                return C60856cj.m92900i(kVar);
            }
            C58976aa aaVar = C58975e.f156826a;
        }
        kVar = new C118928k(C58836b.f156633a, C66634da.f181293h);
        return C60856cj.m92900i(kVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return this.f322381a.mo60297gq();
    }
}
