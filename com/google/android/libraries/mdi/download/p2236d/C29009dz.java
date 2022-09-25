package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29392ep;
import com.google.android.libraries.mdi.download.p2257l.C29672d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.mdi.download.d.dz */
/* compiled from: PG */
public final /* synthetic */ class C29009dz implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29117fe f78767a;

    /* renamed from: b */
    public final /* synthetic */ boolean f78768b;

    /* renamed from: c */
    public final /* synthetic */ C60931s f78769c;

    public /* synthetic */ C29009dz(C29117fe feVar, boolean z, C60931s sVar) {
        this.f78767a = feVar;
        this.f78768b = z;
        this.f78769c = sVar;
    }

    public final C60870cx apply(Object obj) {
        C29117fe feVar = this.f78767a;
        boolean z = this.f78768b;
        C60931s sVar = this.f78769c;
        ArrayList arrayList = new ArrayList();
        for (C29392ep epVar : (List) obj) {
            if (!epVar.f79685e) {
                C60870cx g = feVar.f78975d.mo34602g(epVar);
                C28828ak akVar = new C28828ak(feVar, z, epVar, sVar);
                arrayList.add(C60922j.m93045h(g, C47810es.m84966f(akVar), feVar.f78980i));
            }
        }
        return C29672d.m54726a(arrayList).mo34823a(C28839av.f78343a, feVar.f78980i);
    }
}
