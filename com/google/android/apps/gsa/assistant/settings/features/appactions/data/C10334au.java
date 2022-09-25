package com.google.android.apps.gsa.assistant.settings.features.appactions.data;

import com.google.android.apps.gsa.assistant.settings.shared.e.j;
import com.google.android.apps.gsa.assistant.shared.appactions.p5805d.C73812a;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.data.au */
/* compiled from: PG */
public abstract class C10334au implements j {

    /* renamed from: b */
    public static final C59071e f35010b = C59071e.m91332i("com.google.android.apps.gsa.assistant.settings.features.appactions.data.au");

    /* renamed from: c */
    public final C22871g f35011c;

    /* renamed from: d */
    public final C73812a f35012d;

    /* renamed from: e */
    public final C60870cx f35013e;

    protected C10334au(C22871g gVar, C73812a aVar, C60870cx cxVar) {
        this.f35011c = gVar;
        this.f35012d = aVar;
        this.f35013e = cxVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo18342a(Object obj, C58495hd hdVar);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C60870cx mo18343b();

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ int mo18428c(Object obj) {
        C89849ae aeVar;
        C10333at atVar = (C10333at) obj;
        int a = mo18342a(atVar.f35008a, atVar.f35009b);
        C73812a aVar = this.f35012d;
        if (a == 0) {
            aeVar = C89849ae.APP_ACTIONS_SETTINGS_PAGE_LOADED;
        } else {
            aeVar = C89849ae.APP_ACTIONS_SETTINGS_DATA_FETCH_ERROR;
        }
        aVar.mo65294a(aeVar);
        return a;
    }

    /* renamed from: d */
    public final C60870cx mo18429d() {
        C60870cx j = this.f35011c.mo28210j(mo18430e(mo18343b(), C89849ae.APP_ACTIONS_SETTINGS_SERVER_DATA_FETCHED), "transform result", new C10330aq(this));
        new C90873ag(j, this.f35011c, "handle result", C10331ar.f35006a).mo85223a(new C10332as(this));
        return j;
    }

    /* renamed from: e */
    public final C60870cx mo18430e(C60870cx cxVar, C89849ae aeVar) {
        return this.f35011c.mo28209i(cxVar, "with logging", new C10327an(this, aeVar));
    }
}
