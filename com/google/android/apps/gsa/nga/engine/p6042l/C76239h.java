package com.google.android.apps.gsa.nga.engine.p6042l;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58733pz;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.apps.gsa.nga.engine.l.h */
/* compiled from: PG */
public final /* synthetic */ class C76239h implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C76244m f211252a;

    public /* synthetic */ C76239h(C76244m mVar) {
        this.f211252a = mVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C60870cx cxVar;
        C76244m mVar = this.f211252a;
        C22871g gVar = mVar.f211260d;
        if (mVar.f211258b == null) {
            cxVar = C118826c.f331423b;
        } else {
            synchronized (mVar.f211261e) {
                mVar.f211262f = C58733pz.f156496a;
            }
            C22871g gVar2 = mVar.f211260d;
            cxVar = gVar2.mo28209i(gVar2.mo28209i(gVar2.mo28210j(mVar.f211259c.mo37974b(), "[NGA] get assistant settings from geller", new C76236e(mVar)), "[NGA] extract device settings from assistant settings", C76235d.f211248a), "[NGA] registered devices callback", new C76238g(mVar));
        }
        return gVar.mo28206f(gVar.mo28209i(cxVar, "[NGA] refresh registered devices succeed", new C76233b(mVar)), "[NGA] refresh registered devices failed", Throwable.class, new C76234c(mVar));
    }
}
