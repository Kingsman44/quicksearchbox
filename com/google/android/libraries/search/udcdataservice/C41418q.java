package com.google.android.libraries.search.udcdataservice;

import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.android.libraries.search.udcdataservice.facs.C41396f;
import com.google.android.libraries.search.udcdataservice.facs.C41406p;
import com.google.android.libraries.search.udcdataservice.ulr.C41438q;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58817ah;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.libraries.search.udcdataservice.q */
/* compiled from: PG */
public final class C41418q implements C41409h {

    /* renamed from: d */
    public static final /* synthetic */ int f108190d = 0;

    /* renamed from: e */
    private static final C58495hd f108191e = C58495hd.m89905s(C41385a.SEARCH, "Search", C41385a.GOOGLE_APP_BROWSER, "GoogleAppBrowser", C41385a.LENS, "Lens", C41385a.MAVATAR, "Mavatar", C41385a.PROMO_MANAGER, "PromoManager", C41385a.ASSISTANT, "Assistant");

    /* renamed from: a */
    public final C41396f f108192a;

    /* renamed from: b */
    public final C41438q f108193b;

    /* renamed from: c */
    public final C60887da f108194c;

    /* renamed from: f */
    private final C39141kp f108195f;

    /* renamed from: g */
    private final C60887da f108196g;

    /* renamed from: h */
    private final AccountId f108197h;

    /* renamed from: i */
    private final C41420s f108198i;

    public C41418q(C39141kp kpVar, C41396f fVar, C41438q qVar, C60887da daVar, C60887da daVar2, AccountId accountId, C41420s sVar) {
        this.f108192a = fVar;
        this.f108196g = daVar2;
        this.f108193b = qVar;
        this.f108195f = kpVar;
        this.f108194c = daVar;
        this.f108197h = accountId;
        this.f108198i = sVar;
    }

    /* renamed from: d */
    private final C60870cx m72399d(C41387c[] cVarArr, C58817ah ahVar) {
        for (C41387c cVar : cVarArr) {
            boolean z = true;
            if (!C41406p.f108170a.containsKey(cVar) && cVar != C41387c.LOCATION_HISTORY_AND_REPORTING) {
                z = false;
            }
            C58838bb.m90869d(z, "requestedSetting must be within SETTING_TO_ACTIVITY_CONTROLS_SETTING_MAP or equal to LOCATION_HISTORY_AND_REPORTING");
        }
        return C60922j.m93045h(this.f108198i.mo43952a(this.f108197h), C47810es.m84966f(new C41415n(cVarArr, ahVar)), this.f108196g);
    }

    /* renamed from: a */
    public final C60870cx mo43948a(C41387c[] cVarArr, C41385a aVar) {
        C39141kp kpVar = this.f108195f;
        ((C19567d) kpVar.f102946cX.mo6453a()).mo24822a(1, (String) f108191e.get(aVar));
        return m72399d(cVarArr, new C41416o(this));
    }

    /* renamed from: b */
    public final C60870cx mo43949b(C41387c[] cVarArr, C41385a aVar) {
        C39141kp kpVar = this.f108195f;
        ((C19567d) kpVar.f102945cW.mo6453a()).mo24822a(1, (String) f108191e.get(aVar));
        return m72399d(cVarArr, new C41414m(this));
    }

    /* renamed from: c */
    public final C60870cx mo43950c(C41385a aVar) {
        C39141kp kpVar = this.f108195f;
        ((C19567d) kpVar.f102948cZ.mo6453a()).mo24822a(1, (String) f108191e.get(aVar));
        C60870cx a = this.f108198i.mo43952a(this.f108197h);
        C41410i iVar = new C41410i(this);
        return C60922j.m93045h(a, C47810es.m84966f(iVar), this.f108196g);
    }
}
