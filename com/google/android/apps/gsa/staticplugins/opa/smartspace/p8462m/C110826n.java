package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8462m;

import android.net.Uri;
import com.google.android.apps.gsa.opa.smartspace.C83741am;
import com.google.android.apps.gsa.opa.smartspace.C83798n;
import com.google.android.apps.gsa.opa.smartspace.C83799o;
import com.google.android.apps.gsa.opa.smartspace.C83800p;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a.C95883aa;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.p8461l.C110764bi;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123744bk;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.assistant.p3886c.C50818do;
import com.google.assistant.p3886c.p3888b.C50729n;
import com.google.common.util.concurrent.C60856cj;
import java.util.ArrayList;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.m.n */
/* compiled from: PG */
public final /* synthetic */ class C110826n implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C110835w f308773a;

    /* renamed from: b */
    public final /* synthetic */ C123744bk f308774b;

    public /* synthetic */ C110826n(C110835w wVar, C123744bk bkVar) {
        this.f308773a = wVar;
        this.f308774b = bkVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        List list;
        List list2;
        C110835w wVar = this.f308773a;
        C123744bk bkVar = this.f308774b;
        C83800p pVar = (C83800p) obj;
        ArrayList arrayList = new ArrayList();
        if (pVar.mo77065i().containsKey(C83799o.CURRENT) && (list2 = (List) pVar.mo77065i().get(C83799o.CURRENT)) != null) {
            arrayList.addAll(list2);
        }
        if (!wVar.f308788d.mo77184w() && !wVar.f308788d.mo77185x() && pVar.mo77065i().containsKey(C83799o.OTHER) && (list = (List) pVar.mo77065i().get(C83799o.OTHER)) != null) {
            arrayList.addAll(list);
        }
        Optional findFirst = Collection.EL.stream(arrayList).filter(new C110823k(bkVar)).findFirst();
        if (findFirst.isEmpty()) {
            C95883aa.m158983d(wVar.f308785a.mo56226d(), "Primary card is missing in cache or filtered out inappropriately", 26791, C38505d.f101863a, Integer.valueOf(C89885b.PCP_DATA_IS_MISSING_IN_CACHE_OR_FILTERED_OUT_VALUE));
            return C118826c.f331423b;
        }
        C50818do doVar = ((C83741am) findFirst.get()).f228252c;
        if (doVar == null) {
            doVar = C50818do.f132293H;
        }
        C50729n nVar = doVar.f132314k;
        if (nVar == null) {
            nVar = C50729n.f132007g;
        }
        if ((nVar.f132009a & 4) != 0) {
            C50818do doVar2 = ((C83741am) findFirst.get()).f228252c;
            if (doVar2 == null) {
                doVar2 = C50818do.f132293H;
            }
            C50729n nVar2 = doVar2.f132314k;
            if (nVar2 == null) {
                nVar2 = C50729n.f132007g;
            }
            return wVar.f308791g.mo28210j(wVar.f308794j.mo85418e(Uri.parse(nVar2.f132011c), 7), "fetchImage", new C110824l(wVar, pVar, findFirst));
        }
        C110764bi biVar = wVar.f308790f;
        C83798n a = pVar.mo77055a();
        a.mo77043b((C83741am) findFirst.get());
        return biVar.mo98871i(C60856cj.m92900i(a.mo77042a()));
    }
}
