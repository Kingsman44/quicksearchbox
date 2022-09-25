package com.google.android.apps.gsa.staticplugins.bubble.p7568a.p7569a.p7570a;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.staticplugins.bubble.p7568a.p7569a.C96882b;
import com.google.android.apps.gsa.staticplugins.bubble.p7568a.p7569a.C96883c;
import com.google.android.apps.gsa.staticplugins.bubble.p7568a.p7569a.C96884d;
import com.google.android.apps.gsa.staticplugins.bubble.p7568a.p7569a.C96900t;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.protostore.C42872a;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.android.libraries.storage.protostore.C42877ac;
import com.google.android.libraries.storage.protostore.C42878ad;
import com.google.android.libraries.storage.protostore.C42880af;
import com.google.android.libraries.storage.protostore.C42901b;
import com.google.android.libraries.storage.protostore.C42967dc;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60930r;
import com.google.frameworks.client.data.android.C61512j;
import com.google.frameworks.client.data.android.p4632a.C61333a;
import com.google.protos.p4874ap.p4877b.p4878a.C63691b;
import com.google.protos.p4874ap.p4877b.p4878a.C63692c;
import com.google.protos.p4874ap.p4877b.p4878a.p4879a.C63690b;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68225k;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.a.a.a.f */
/* compiled from: PG */
public final class C96880f implements C68220f {
    /* renamed from: a */
    public static C96900t m160490a(Context context, C60888db dbVar, C42880af afVar, C86054o oVar, C96883c cVar, C61512j jVar, C21370a aVar, C86124t tVar) {
        C96900t tVar2;
        Uri a = C96876b.m160482a(context, oVar, tVar);
        Account a2 = oVar.mo79668a();
        if (!C96876b.m160483b(a2, tVar)) {
            C96884d dVar = new C96884d();
            C42877ac i = C42878ad.m75739i();
            i.mo45968e(a);
            i.mo45967d(C96882b.f270854g);
            dVar.f270865a = afVar.mo45979a(i.mo45964a());
            dVar.f270866b = C96875a.f270853a;
            tVar2 = dVar.mo90368a();
        } else {
            C58836b bVar = C58836b.f156633a;
            C42967dc dcVar = C42967dc.f112396a;
            C63691b bVar2 = (C63691b) C63692c.m96284a(jVar.mo58044a(C63690b.f172206c)).mo62577p(C61333a.f165865a, C61333a.m93820a(a2.name));
            if (dbVar == null) {
                throw new NullPointerException("Null scheduledExecutor");
            } else if (aVar != null) {
                C42872a aVar2 = new C42872a(cVar, bVar2, dbVar, aVar, dcVar, bVar, bVar);
                C42877ac i2 = C42878ad.m75739i();
                i2.mo45968e(a);
                i2.mo45967d(C96882b.f270854g);
                ((C42901b) i2).f112236b = aVar2;
                C42876ab a3 = afVar.mo45979a(i2.mo45964a());
                C96884d dVar2 = new C96884d();
                dVar2.f270865a = a3;
                C60930r rVar = aVar2.f112470a;
                if (rVar != null) {
                    dVar2.f270866b = rVar;
                    tVar2 = dVar2.mo90368a();
                } else {
                    throw new NullPointerException("Null syncCallback");
                }
            } else {
                throw new NullPointerException("Null clock");
            }
        }
        C68225k.m98532d(tVar2);
        return tVar2;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
