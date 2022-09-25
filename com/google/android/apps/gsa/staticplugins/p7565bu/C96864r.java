package com.google.android.apps.gsa.staticplugins.p7565bu;

import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.android.libraries.mdi.download.C28734bl;
import com.google.android.libraries.phenotype.client.C31650af;
import com.google.android.libraries.phenotype.client.C31652ah;
import com.google.android.libraries.phenotype.client.C31676o;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58801sm;
import java.util.Collection;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.bu.r */
/* compiled from: PG */
public final /* synthetic */ class C96864r implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C96810ac f270840a;

    public /* synthetic */ C96864r(C96810ac acVar) {
        this.f270840a = acVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C96810ac acVar = this.f270840a;
        C31652ah ahVar = new C31652ah(C31676o.m59019a("com.google.android.googlequicksearchbox"));
        C58490gz gzVar = new C58490gz(4);
        C58801sm G = ((C58485gu) acVar.f270737a).listIterator(0);
        while (G.hasNext()) {
            String str = (String) G.next();
            gzVar.mo55429h(str, C58485gu.m89842j((Collection) Collection.EL.stream(((C28734bl) new C31650af(ahVar, str, C28734bl.f78057b, false, C96869w.f270846a).mo37303b()).f78059a).map(new C96870x(ahVar)).map(C96871y.f270848a).collect(Collectors.toList())));
        }
        return gzVar.mo55427f(false);
    }
}
