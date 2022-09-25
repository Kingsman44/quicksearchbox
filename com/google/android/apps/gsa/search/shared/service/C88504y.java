package com.google.android.apps.gsa.search.shared.service;

import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.libraries.gsa.p1876k.C22869e;
import java.util.EnumMap;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.search.shared.service.y */
/* compiled from: PG */
public final /* synthetic */ class C88504y implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C88505z f239214a;

    /* renamed from: b */
    public final /* synthetic */ ServiceEventData f239215b;

    public /* synthetic */ C88504y(C88505z zVar, ServiceEventData serviceEventData) {
        this.f239214a = zVar;
        this.f239215b = serviceEventData;
    }

    public final void run() {
        C88505z zVar = this.f239214a;
        ServiceEventData serviceEventData = this.f239215b;
        if (zVar.f239216a != null) {
            zVar.f239216a.mo19965fM(serviceEventData);
        }
        EnumMap enumMap = zVar.f239219d;
        C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
        if (a == null) {
            a = C88244um.ATTACH_WEBVIEW;
        }
        Set<C87682aj> set = (Set) enumMap.get(a);
        if (set != null) {
            for (C87682aj fM : set) {
                fM.mo19965fM(serviceEventData);
            }
        }
    }
}
