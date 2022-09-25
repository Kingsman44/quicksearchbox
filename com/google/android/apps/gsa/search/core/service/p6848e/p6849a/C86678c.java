package com.google.android.apps.gsa.search.core.service.p6848e.p6849a;

import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.libraries.gsa.p1876k.C22871g;
import java.util.EnumMap;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.search.core.service.e.a.c */
/* compiled from: PG */
public final class C86678c {

    /* renamed from: a */
    public final Object f234152a = new Object();

    /* renamed from: b */
    public final EnumMap f234153b = new EnumMap(C88244um.class);

    /* renamed from: c */
    public final C22871g f234154c;

    public C86678c(C22871g gVar) {
        this.f234154c = gVar;
    }

    /* renamed from: a */
    public final void mo80282a(ServiceEventData serviceEventData) {
        EnumMap enumMap = this.f234153b;
        C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
        if (a == null) {
            a = C88244um.ATTACH_WEBVIEW;
        }
        List<C86677b> list = (List) enumMap.get(a);
        if (list != null) {
            for (C86677b a2 : list) {
                a2.mo80281a(serviceEventData);
            }
        }
    }
}
