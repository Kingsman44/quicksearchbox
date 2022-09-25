package com.google.android.apps.gsa.staticplugins.p7922eo;

import com.google.android.apps.gsa.p8889z.p8890a.C118843f;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.amo;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.staticplugins.eo.z */
/* compiled from: PG */
public final /* synthetic */ class C100629z implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C100585an f281394a;

    /* renamed from: b */
    public final /* synthetic */ int f281395b;

    /* renamed from: c */
    public final /* synthetic */ ClientConfig f281396c;

    /* renamed from: d */
    public final /* synthetic */ Query f281397d;

    public /* synthetic */ C100629z(C100585an anVar, int i, ClientConfig clientConfig, Query query) {
        this.f281394a = anVar;
        this.f281395b = i;
        this.f281396c = clientConfig;
        this.f281397d = query;
    }

    public final void run() {
        C100585an anVar = this.f281394a;
        int i = this.f281395b;
        ClientConfig clientConfig = this.f281396c;
        Query query = this.f281397d;
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = i;
        int f = anVar.f281248j.mo78232f();
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        ufVar2.f164075I = f;
        ufVar2.f164146b |= 4096;
        amo b = C89949q.m146518b(clientConfig.f236951d, query.mo84337bV(), query.mo84412cs(), anVar.f281240b.mo80452c());
        tzVar.copyOnWrite();
        C60555uf ufVar3 = (C60555uf) tzVar.instance;
        ufVar3.f164070D = b.f159234au;
        ufVar3.f164146b |= 8;
        String b2 = C39191a.m68623b(query.f252749G);
        tzVar.copyOnWrite();
        C60555uf ufVar4 = (C60555uf) tzVar.instance;
        b2.getClass();
        ufVar4.f164093a |= 4;
        ufVar4.f164259n = b2;
        boolean bV = query.mo84337bV();
        tzVar.copyOnWrite();
        C60555uf ufVar5 = (C60555uf) tzVar.instance;
        ufVar5.f164146b |= C89885b.S3REQUEST_VALUE;
        ufVar5.f164079M = bV;
        int e = ((C118843f) anVar.f281251m.mo27525b()).mo71744e();
        tzVar.copyOnWrite();
        C60555uf ufVar6 = (C60555uf) tzVar.instance;
        ufVar6.f164199c |= 32;
        ufVar6.f164122ac = e;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
    }
}
