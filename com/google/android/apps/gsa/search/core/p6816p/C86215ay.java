package com.google.android.apps.gsa.search.core.p6816p;

import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.C57940c;
import com.google.protos.p4816ai.p4818b.C63196b;
import dagger.p5295b.C68282c;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.search.core.p.ay */
/* compiled from: PG */
public final class C86215ay extends C68247h {

    /* renamed from: a */
    private final C68283d f232982a;

    /* renamed from: c */
    private final C68283d f232983c;

    public C86215ay(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C86215ay.class), aVar);
        this.f232982a = C68236af.m98549d(dVar);
        this.f232983c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        Object obj2;
        List list = (List) obj;
        Query query = (Query) list.get(0);
        C68282c cVar = (C68282c) list.get(1);
        if (C57940c.m88583j(cVar)) {
            C58976aa aaVar = C58975e.f156826a;
            C86232bo boVar = (C86232bo) ((C58833ax) cVar.mo60292a()).mo56107c();
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 220;
            String b = C39191a.m68623b(query.f252749G);
            tzVar.copyOnWrite();
            C60555uf ufVar2 = (C60555uf) tzVar.instance;
            b.getClass();
            ufVar2.f164093a |= 4;
            ufVar2.f164259n = b;
            String b2 = C39191a.m68623b(boVar.mo79890n().f233052a);
            tzVar.copyOnWrite();
            C60555uf ufVar3 = (C60555uf) tzVar.instance;
            b2.getClass();
            ufVar3.f164093a |= 32;
            ufVar3.f164262q = b2;
            String b3 = C39191a.m68623b(boVar.mo79890n().f233053b);
            tzVar.copyOnWrite();
            C60555uf ufVar4 = (C60555uf) tzVar.instance;
            b3.getClass();
            ufVar4.f164093a |= 8;
            ufVar4.f164260o = b3;
            C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
            obj2 = (C58833ax) cVar.mo60292a();
        } else {
            obj2 = C58836b.f156633a;
        }
        return C60856cj.m92900i(obj2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f232982a.mo60297gq(), C68236af.m98546a(this.f232983c.mo60297gq()));
    }
}
