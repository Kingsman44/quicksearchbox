package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.C29391eo;
import com.google.android.libraries.mdi.download.C29392ep;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.d.df */
/* compiled from: PG */
public final /* synthetic */ class C28989df implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29117fe f78709a;

    /* renamed from: b */
    public final /* synthetic */ C29334dr f78710b;

    /* renamed from: c */
    public final /* synthetic */ C29392ep f78711c;

    public /* synthetic */ C28989df(C29117fe feVar, C29334dr drVar, C29392ep epVar) {
        this.f78709a = feVar;
        this.f78710b = drVar;
        this.f78711c = epVar;
    }

    public final C60870cx apply(Object obj) {
        C29117fe feVar = this.f78709a;
        C29334dr drVar = this.f78710b;
        C29392ep epVar = this.f78711c;
        C29334dr drVar2 = (C29334dr) obj;
        if (drVar2 != null) {
            return C60856cj.m92900i(Boolean.valueOf(C29117fe.m54050q(drVar, drVar2)));
        }
        C29391eo eoVar = (C29391eo) epVar.toBuilder();
        eoVar.copyOnWrite();
        C29392ep epVar2 = (C29392ep) eoVar.instance;
        epVar2.f79681a |= 8;
        epVar2.f79685e = true;
        return C60922j.m93045h(feVar.f78975d.mo34602g((C29392ep) eoVar.build()), C47810es.m84966f(new C28940ce(drVar)), feVar.f78980i);
    }
}
