package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.C29392ep;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29035b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.d.ds */
/* compiled from: PG */
public final /* synthetic */ class C29002ds implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29117fe f78746a;

    /* renamed from: b */
    public final /* synthetic */ C29035b f78747b;

    /* renamed from: c */
    public final /* synthetic */ C29334dr f78748c;

    /* renamed from: d */
    public final /* synthetic */ boolean f78749d;

    /* renamed from: e */
    public final /* synthetic */ C29392ep f78750e;

    public /* synthetic */ C29002ds(C29117fe feVar, C29035b bVar, C29334dr drVar, boolean z, C29392ep epVar) {
        this.f78746a = feVar;
        this.f78747b = bVar;
        this.f78748c = drVar;
        this.f78749d = z;
        this.f78750e = epVar;
    }

    public final C60870cx apply(Object obj) {
        C29117fe feVar = this.f78746a;
        C29035b bVar = this.f78747b;
        C29334dr drVar = this.f78748c;
        boolean z = this.f78749d;
        C29392ep epVar = this.f78750e;
        if (((Boolean) obj).booleanValue()) {
            return C60866ct.f164955a;
        }
        bVar.mo34555b(drVar);
        C60870cx i = C60856cj.m92900i(true);
        if (z) {
            i = feVar.f78975d.mo34604i(epVar);
        }
        C28843az azVar = new C28843az(feVar, epVar);
        return C60922j.m93045h(i, C47810es.m84966f(azVar), feVar.f78980i);
    }
}
