package com.google.android.apps.gsa.staticplugins.p7327ac;

import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.util.p7158b.C90748e;
import com.google.android.gms.common.api.C143841m;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.phenotype.C145738p;
import com.google.android.gms.phenotype.p10859a.C145706f;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.C21532b;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.p1765a.C21529b;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.p1765a.C21530c;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.p1766b.C21539g;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.p1766b.C21543k;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.p1766b.C21544l;
import com.google.android.libraries.gcoreclient.p1803w.p1804a.C21708a;
import com.google.android.libraries.gcoreclient.p1803w.p1804a.C21710c;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4552o.C59752ei;
import com.google.common.p4552o.C59753ej;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protos.p4816ai.p4818b.C63196b;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.ac.q */
/* compiled from: PG */
public final /* synthetic */ class C92710q implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C92711r f258788a;

    public /* synthetic */ C92710q(C92711r rVar) {
        this.f258788a = rVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C21708a aVar;
        C92711r rVar = this.f258788a;
        C90748e.m148224b();
        C21530c cVar = new C21530c(rVar.f258791c);
        cVar.mo26980a((C21532b) rVar.f258796h.mo27525b());
        C21529b h = cVar.mo26989h();
        h.f59932a.mo119131f();
        rVar.mo87445c();
        int intValue = ((Integer) rVar.f258795g.mo27525b()).intValue();
        String[] strArr = C92711r.f258790b;
        String a = rVar.mo87443a();
        C143841m mVar = C145738p.f394058a;
        C143851w c = C21544l.m40656c(h);
        C21710c cVar2 = (C21710c) new C21539g(c.mo119159d(new C145706f(c, intValue, strArr, (byte[]) obj, a)), C21710c.f60027a).mo26995b(60000, TimeUnit.MILLISECONDS);
        h.f59932a.mo119132g();
        if (!((C21543k) cVar2.mo26997c()).f59946b.mo119097c()) {
            ((C59052c) ((C59052c) C92711r.f258789a.mo56226d()).mo56372aa(19021)).mo56386p("Calling registerSyncInternal api failed.");
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 922;
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
            C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
            aVar = null;
        } else {
            C89949q.m146523g(923);
            aVar = cVar2.mo27074a();
        }
        rVar.mo87444b(aVar);
        return null;
    }
}
