package com.google.assistant.p3838ao.p3839a.p3840a;

import com.google.assistant.p3838ao.p3839a.C49381a;
import com.google.assistant.p3838ao.p3839a.C49692r;
import com.google.assistant.p3838ao.p3839a.p3845e.C49609dl;
import com.google.assistant.p3838ao.p3839a.p3845e.C49611dn;
import com.google.assistant.p3838ao.p3839a.p3845e.C49613dp;

/* renamed from: com.google.assistant.ao.a.a.ap */
/* compiled from: PG */
final class C49398ap implements C49382a {
    /* renamed from: a */
    public final /* synthetic */ boolean mo53258a(C49692r rVar, Object obj) {
        C49613dp dpVar = (C49613dp) obj;
        int i = dpVar.f128027a;
        int i2 = dpVar.f128028b;
        int a = C49609dl.m85584a(i);
        if (a == 0) {
            a = 1;
        }
        int a2 = C49609dl.m85584a(i2);
        if (a2 == 0) {
            a2 = 1;
        }
        C49381a aVar = (C49381a) rVar;
        if (aVar.f127645k != 9) {
            return false;
        }
        C49611dn b = aVar.f127637c.mo53304b();
        int i3 = b.f128023c;
        int i4 = b.f128022b;
        int a3 = C49609dl.m85584a(i3);
        if (a3 == 0) {
            a3 = 1;
        }
        if (a3 != a) {
            return false;
        }
        int a4 = C49609dl.m85584a(i4);
        if (a4 == 0) {
            a4 = 1;
        }
        return a4 == a2;
    }
}
