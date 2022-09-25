package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9291g;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.C123534h;
import com.google.android.libraries.search.assistant.p2716p.p2717a.p2718a.p2719a.C34922b;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import java.util.ArrayList;
import java.util.Set;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.g.g */
/* compiled from: PG */
public final /* synthetic */ class C122889g implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ boolean f340351a;

    /* renamed from: b */
    public final /* synthetic */ C123534h f340352b;

    /* renamed from: c */
    public final /* synthetic */ Set f340353c;

    /* renamed from: d */
    public final /* synthetic */ C34922b f340354d;

    public /* synthetic */ C122889g(boolean z, C123534h hVar, C34922b bVar, Set set) {
        this.f340351a = z;
        this.f340352b = hVar;
        this.f340354d = bVar;
        this.f340353c = set;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        boolean z = this.f340351a;
        C123534h hVar = this.f340352b;
        C34922b bVar = this.f340354d;
        Set set = this.f340353c;
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(C122890h.m202214b(hVar.mo106031a()));
        } else {
            arrayList.add(C122890h.m202214b(bVar.mo39635b()));
        }
        Collection.EL.stream(set).forEach(new C122887e(arrayList));
        return C47638k.m84750a(arrayList).mo51520a(C122888f.f340350a, C60826bg.f164896a);
    }
}
