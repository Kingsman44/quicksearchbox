package com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9276d;

import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17078w;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58370cn;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.d.aq */
/* compiled from: PG */
public final /* synthetic */ class C122231aq implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C122261bt f338968a;

    /* renamed from: b */
    public final /* synthetic */ C17078w f338969b;

    public /* synthetic */ C122231aq(C122261bt btVar, C17078w wVar) {
        this.f338968a = btVar;
        this.f338969b = wVar;
    }

    public final C60870cx apply(Object obj) {
        return C60856cj.m92896e((Iterable) Collection.EL.stream(this.f338969b.f49716b).map(new C122236av(this.f338968a, (C58833ax) obj)).collect(C58370cn.f155946a));
    }
}
