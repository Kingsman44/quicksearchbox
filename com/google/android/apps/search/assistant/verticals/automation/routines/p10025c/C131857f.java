package com.google.android.apps.search.assistant.verticals.automation.routines.p10025c;

import com.google.android.apps.search.assistant.verticals.automation.routines.p10028d.C131860c;
import com.google.android.apps.search.assistant.verticals.automation.routines.p10028d.C131871n;
import com.google.android.apps.search.assistant.verticals.automation.routines.p10034g.C131895a;
import com.google.common.base.C58838bb;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.C62948a;

/* renamed from: com.google.android.apps.search.assistant.verticals.automation.routines.c.f */
/* compiled from: PG */
public final class C131857f {
    /* renamed from: a */
    public static void m214332a(C131860c cVar) {
        boolean z = true;
        if (1 != (cVar.f360090a & 1)) {
            z = false;
        }
        C58838bb.m90869d(z, "All geofence parameters must be specified for the standalone app");
        C62910ar arVar = cVar.f360091b;
        if (arVar == null) {
            arVar = C62910ar.f169858c;
        }
        m214335d((int) C62948a.m95454e(arVar));
    }

    /* renamed from: b */
    public static void m214333b(C131871n nVar) {
        int i = nVar.f360108a;
        boolean z = false;
        C58838bb.m90869d(((i & 1) == 0 || (i & 2) == 0 || (i & 4) == 0 || (i & 8) == 0 || (i & 16) == 0) ? false : true, "All geofence parameters must be specified for the standalone app");
        int i2 = (int) nVar.f360109b;
        C58838bb.m90875j(C131895a.m214361a(i2) <= 4, "Geofence radius meters of %s cannot exceed the allowed maximum digits %s for the standalone app", i2, 4);
        C62910ar arVar = nVar.f360110c;
        if (arVar == null) {
            arVar = C62910ar.f169858c;
        }
        m214335d((int) C62948a.m95454e(arVar));
        C62910ar arVar2 = nVar.f360111d;
        if (arVar2 == null) {
            arVar2 = C62910ar.f169858c;
        }
        int d = (int) C62948a.m95453d(arVar2);
        C58838bb.m90875j(C131895a.m214361a(d) <= 7, "Geofence notification responsiveness milliseconds of %s cannot exceed the allowed maximum digits %s for the standalone app", d, 7);
        C62910ar arVar3 = nVar.f360112e;
        if (arVar3 == null) {
            arVar3 = C62910ar.f169858c;
        }
        int d2 = (int) C62948a.m95453d(arVar3);
        if (C131895a.m214361a(d2) <= 7) {
            z = true;
        }
        C58838bb.m90875j(z, "Geofence loitering delay milliseconds of %s cannot exceed the allowed maximum digits %s for the standalone app", d2, 7);
    }

    /* renamed from: c */
    public static boolean m214334c(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (RuntimeException unused) {
            return false;
        }
    }

    /* renamed from: d */
    private static void m214335d(int i) {
        C58838bb.m90875j(C131895a.m214361a(i) <= 6, "Geofence expiry duration minutes of %s cannot exceed the allowed maximum digits %s for the standalone app", i, 6);
    }
}
