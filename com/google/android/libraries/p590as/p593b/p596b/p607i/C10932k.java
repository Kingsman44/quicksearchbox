package com.google.android.libraries.p590as.p593b.p596b.p607i;

import com.google.android.libraries.mdi.download.C28806cu;
import com.google.android.libraries.mdi.download.C28807cv;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.as.b.b.i.k */
/* compiled from: PG */
public final class C10932k {

    /* renamed from: a */
    public static final C58974d f36041a = C58974d.m91136j();

    /* renamed from: b */
    public final C42813k f36042b;

    /* renamed from: c */
    public final C60887da f36043c;

    /* renamed from: d */
    private final C58485gu f36044d;

    /* renamed from: e */
    private final C60887da f36045e;

    public C10932k(C58485gu guVar, C42813k kVar, C60887da daVar, C60887da daVar2) {
        this.f36044d = (C58485gu) Collection.EL.stream(guVar).filter(C10931j.f36040a).collect(C58370cn.f155946a);
        this.f36042b = kVar;
        this.f36045e = daVar;
        this.f36043c = daVar2;
    }

    /* renamed from: a */
    public final C60870cx mo19342a() {
        ((C58970a) ((C58970a) f36041a.mo56224b()).mo56372aa(54017)).mo56386p("#getDownloadableLanguagePacks");
        return C60856cj.m92900i((C58485gu) Collection.EL.stream(this.f36044d).map(C10929h.f36038a).collect(C58370cn.f155946a));
    }

    /* renamed from: b */
    public final C60870cx mo19343b(C29409fd fdVar) {
        ((C58970a) ((C58970a) f36041a.mo56224b()).mo56372aa(54019)).mo56386p("#getInstalledPackages");
        C60870cx c = mo19344c(fdVar);
        C10897a aVar = new C10897a(this);
        return C60922j.m93044g(c, C47810es.m84963c(aVar), this.f36043c);
    }

    /* renamed from: c */
    public final C60870cx mo19344c(C29409fd fdVar) {
        C28806cu h = C28807cv.m53759h();
        h.mo34460d(true);
        h.mo34461e(true);
        C60870cx g = fdVar.mo34718g(h.mo34462f());
        C10923b bVar = C10923b.f36032a;
        return C60922j.m93044g(g, C47810es.m84963c(bVar), this.f36045e);
    }
}
