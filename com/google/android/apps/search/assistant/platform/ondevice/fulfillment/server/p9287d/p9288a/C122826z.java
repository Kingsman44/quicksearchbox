package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9287d.p9288a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9295i.p9296a.p9297a.C122968a;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9295i.p9296a.p9297a.C122971d;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9295i.p9296a.p9297a.C122972e;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9295i.p9296a.p9297a.C122973f;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123051cr;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4522b.C58370cn;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import dagger.hilt.C68286a;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.d.a.z */
/* compiled from: PG */
public final /* synthetic */ class C122826z implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C122799ad f340207a;

    public /* synthetic */ C122826z(C122799ad adVar) {
        this.f340207a = adVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C122799ad adVar = this.f340207a;
        if (adVar.f340151c == null) {
            C122809i iVar = adVar.f340154f;
            adVar.f340154f = null;
            if (iVar != null) {
                iVar.hashCode();
                adVar.f340151c = new C123051cr(C47638k.m84750a((Iterable) Collection.EL.stream(((C122968a) C68286a.m98629a(iVar.f340170a.f340509a, C122968a.class)).mo105808d().f340516b).map(C122971d.f340511a).peek(C122972e.f340512a).collect(C58370cn.f155947b)).mo51520a(C122973f.f340513a, C60826bg.f164896a));
            } else {
                adVar.f340151c = new C123051cr(C60866ct.f164955a);
            }
        }
        return C60856cj.m92901j(adVar.f340151c.f340614a);
    }
}
