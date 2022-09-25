package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.C29391eo;
import com.google.android.libraries.mdi.download.C29392ep;
import com.google.android.libraries.mdi.download.p2257l.C29670b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.io.IOException;

/* renamed from: com.google.android.libraries.mdi.download.d.do */
/* compiled from: PG */
public final /* synthetic */ class C28998do implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29117fe f78735a;

    /* renamed from: b */
    public final /* synthetic */ C29392ep f78736b;

    /* renamed from: c */
    public final /* synthetic */ C29334dr f78737c;

    public /* synthetic */ C28998do(C29117fe feVar, C29392ep epVar, C29334dr drVar) {
        this.f78735a = feVar;
        this.f78736b = epVar;
        this.f78737c = drVar;
    }

    public final C60870cx apply(Object obj) {
        C29117fe feVar = this.f78735a;
        C29392ep epVar = this.f78736b;
        C29334dr drVar = this.f78737c;
        if (((Boolean) obj).booleanValue()) {
            C29391eo eoVar = (C29391eo) epVar.toBuilder();
            eoVar.copyOnWrite();
            C29392ep epVar2 = (C29392ep) eoVar.instance;
            epVar2.f79681a |= 8;
            epVar2.f79685e = false;
            C29392ep epVar3 = (C29392ep) eoVar.build();
            C60870cx g = feVar.f78975d.mo34602g(epVar3);
            return C60922j.m93045h(C29670b.m54719g(g).mo34822i(new C28957cv(feVar, epVar3, drVar), feVar.f78980i).mo34822i(new C28958cw(feVar), feVar.f78980i).mo34822i(new C28959cx(feVar, drVar), feVar.f78980i).mo34822i(new C28960cy(feVar, g), feVar.f78980i), C47810es.m84966f(new C28999dp(feVar, drVar, epVar)), feVar.f78980i);
        }
        throw new IOException("Subscribing to group failed");
    }
}
