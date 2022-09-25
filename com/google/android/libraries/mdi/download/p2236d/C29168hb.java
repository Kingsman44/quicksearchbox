package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.p2236d.p2242f.C29098l;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.Comparator;

/* renamed from: com.google.android.libraries.mdi.download.d.hb */
/* compiled from: PG */
public final /* synthetic */ class C29168hb implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29170hd f79089a;

    /* renamed from: b */
    public final /* synthetic */ Comparator f79090b;

    public /* synthetic */ C29168hb(C29170hd hdVar, Comparator comparator) {
        this.f79089a = hdVar;
        this.f79090b = comparator;
    }

    public final C60870cx apply(Object obj) {
        C29170hd hdVar = this.f79089a;
        Comparator comparator = this.f79090b;
        C60870cx b = hdVar.mo34617b(hdVar.f79096c.mo34618c());
        C29158gs gsVar = new C29158gs(hdVar, (C29098l) obj, comparator);
        return C60922j.m93045h(b, C47810es.m84966f(gsVar), hdVar.f79097d);
    }
}
