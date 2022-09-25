package com.google.android.apps.search.assistant.surfaces.p9372b.p9379d.p9380a.p9382b;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119900s;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119902u;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119903v;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119904w;
import com.google.android.apps.search.assistant.surfaces.p9372b.p9379d.p9380a.C124445ap;

/* renamed from: com.google.android.apps.search.assistant.surfaces.b.d.a.b.a */
/* compiled from: PG */
public final class C124457a {
    /* renamed from: a */
    public static boolean m203932a(C124445ap apVar) {
        C119903v vVar;
        if (!m203933b(apVar)) {
            return false;
        }
        C119904w wVar = apVar.f343448b;
        if (wVar == null) {
            wVar = C119904w.f333909c;
        }
        if (wVar.f333911a == 2) {
            vVar = (C119903v) wVar.f333912b;
        } else {
            vVar = C119903v.f333904d;
        }
        int a = C119902u.m198776a(vVar.f333906a);
        if (a == 0) {
            throw null;
        } else if (a == 1) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m203933b(C124445ap apVar) {
        C119904w wVar = apVar.f343448b;
        if (wVar == null) {
            wVar = C119904w.f333909c;
        }
        int b = C119900s.m198775b(wVar.f333911a);
        boolean z = b == 2;
        if (b != 0) {
            return z;
        }
        throw null;
    }
}
