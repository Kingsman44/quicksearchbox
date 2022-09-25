package com.google.android.apps.gsa.staticplugins.p7327ac;

import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.C21532b;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.p1765a.C21529b;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.p1765a.C21530c;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.p1766b.C21543k;
import com.google.android.libraries.gcoreclient.p1803w.p1804a.C21708a;
import com.google.android.libraries.gcoreclient.p1803w.p1804a.C21710c;
import com.google.android.libraries.gcoreclient.p1803w.p1804a.C21711d;
import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4552o.C59752ei;
import com.google.common.p4552o.C59753ej;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protos.p4816ai.p4818b.C63196b;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.ac.o */
/* compiled from: PG */
public final /* synthetic */ class C92708o implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C92711r f258786a;

    public /* synthetic */ C92708o(C92711r rVar) {
        this.f258786a = rVar;
    }

    public final void run() {
        C21708a aVar;
        C92711r rVar = this.f258786a;
        C21530c cVar = new C21530c(rVar.f258791c);
        cVar.mo26980a((C21532b) rVar.f258796h.mo27525b());
        C21529b h = cVar.mo26989h();
        h.f59932a.mo119131f();
        rVar.mo87445c();
        C21710c cVar2 = (C21710c) C21711d.m40833b(h, rVar.mo87443a()).mo26995b(60000, TimeUnit.MILLISECONDS);
        h.f59932a.mo119132g();
        if (!((C21543k) cVar2.mo26997c()).f59946b.mo119097c()) {
            ((C59052c) ((C59052c) C92711r.f258789a.mo56226d()).mo56372aa(19020)).mo56354G("Retrieving full configuration for %s failed with %s", "com.google.android.googlequicksearchbox", cVar2.mo26997c());
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 1436;
            C59752ei eiVar = (C59752ei) C59753ej.f161449e.createBuilder();
            int i = ((C21543k) cVar2.mo26997c()).f59946b.f389621g;
            eiVar.copyOnWrite();
            C59753ej ejVar = (C59753ej) eiVar.instance;
            ejVar.f161451a |= 1;
            ejVar.f161452b = i;
            tzVar.copyOnWrite();
            C60555uf ufVar2 = (C60555uf) tzVar.instance;
            C59753ej ejVar2 = (C59753ej) eiVar.build();
            ejVar2.getClass();
            ufVar2.f164076J = ejVar2;
            ufVar2.f164146b |= 8192;
            aVar = null;
            C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
        } else {
            C89949q.m146523g(1435);
            aVar = cVar2.mo27074a();
        }
        rVar.mo87444b(aVar);
    }
}
