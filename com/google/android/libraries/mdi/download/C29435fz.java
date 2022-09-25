package com.google.android.libraries.mdi.download;

import com.google.android.libraries.mdi.download.p2236d.C28962d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.libraries.mdi.download.fz */
/* compiled from: PG */
public final /* synthetic */ class C29435fz implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C29647hr f79794a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f79795b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f79796c;

    /* renamed from: d */
    public final /* synthetic */ C29392ep f79797d;

    /* renamed from: e */
    public final /* synthetic */ boolean f79798e;

    /* renamed from: f */
    public final /* synthetic */ C28740br f79799f;

    /* renamed from: g */
    public final /* synthetic */ String f79800g;

    public /* synthetic */ C29435fz(C29647hr hrVar, C60870cx cxVar, C60870cx cxVar2, C29392ep epVar, boolean z, C28740br brVar, String str) {
        this.f79794a = hrVar;
        this.f79795b = cxVar;
        this.f79796c = cxVar2;
        this.f79797d = epVar;
        this.f79798e = z;
        this.f79799f = brVar;
        this.f79800g = str;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C29647hr hrVar = this.f79794a;
        C60870cx cxVar = this.f79795b;
        C60870cx cxVar2 = this.f79796c;
        C29392ep epVar = this.f79797d;
        boolean z = this.f79798e;
        C28740br brVar = this.f79799f;
        String str = this.f79800g;
        if (((C58833ax) C60856cj.m92909r(cxVar)).mo56113h()) {
            return C60856cj.m92900i(new C28962d((C60870cx) ((C58833ax) C60856cj.m92909r(cxVar)).mo56107c()));
        }
        if (((C58833ax) C60856cj.m92909r(cxVar2)).mo56113h()) {
            return C60856cj.m92900i(new C28962d((C60870cx) ((C58833ax) C60856cj.m92909r(cxVar2)).mo56107c()));
        }
        C60870cx g = hrVar.f80297c.mo34631g(epVar, false);
        C29418fm fmVar = new C29418fm(hrVar, epVar);
        C60870cx h = C60922j.m93045h(g, C47810es.m84966f(fmVar), hrVar.f80301g);
        C29419fn fnVar = new C29419fn(hrVar, epVar, z, brVar, str);
        return C60922j.m93045h(h, C47810es.m84966f(fnVar), hrVar.f80301g);
    }
}
