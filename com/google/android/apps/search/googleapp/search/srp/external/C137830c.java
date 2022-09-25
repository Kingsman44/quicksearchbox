package com.google.android.apps.search.googleapp.search.srp.external;

import com.google.android.libraries.web.shared.p3441a.C44077a;
import com.google.apps.tiktok.cache.C46370ah;
import com.google.apps.tiktok.cache.C46401p;
import com.google.protobuf.C62912at;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.external.c */
/* compiled from: PG */
public final class C137830c {
    /* renamed from: a */
    public static final C46401p m224073a(C44077a aVar) {
        return aVar.f114747a.mo50325a("browser_state", C137829b.f374984d);
    }

    /* renamed from: b */
    public static final void m224074b(C46401p pVar) {
        C69664n.m101061g(pVar, "<this>");
        C62912at atVar = C62912at.f169862a;
        C137828a aVar = (C137828a) C137829b.f374984d.createBuilder();
        aVar.copyOnWrite();
        C137829b bVar = (C137829b) aVar.instance;
        bVar.f374986a |= 1;
        bVar.f374987b = false;
        C63042fg i = C62953e.m95484i(-1);
        aVar.copyOnWrite();
        C137829b bVar2 = (C137829b) aVar.instance;
        i.getClass();
        bVar2.f374988c = i;
        bVar2.f374986a |= 2;
        pVar.mo50381d(atVar, aVar.build());
    }

    /* renamed from: c */
    public static final boolean m224075c(C46401p pVar) {
        C137829b bVar;
        C69664n.m101061g(pVar, "<this>");
        C46370ah a = pVar.mo50378a(C62912at.f169862a);
        if (a == null || (bVar = (C137829b) a.f121384a) == null) {
            return false;
        }
        return bVar.f374987b;
    }
}
