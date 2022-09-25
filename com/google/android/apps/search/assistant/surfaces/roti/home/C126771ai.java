package com.google.android.apps.search.assistant.surfaces.roti.home;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119898q;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119899r;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119900s;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119902u;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119903v;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119904w;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;

/* renamed from: com.google.android.apps.search.assistant.surfaces.roti.home.ai */
/* compiled from: PG */
public final /* synthetic */ class C126771ai implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C126778ap f349108a;

    /* renamed from: b */
    public final /* synthetic */ C119904w f349109b;

    public /* synthetic */ C126771ai(C126778ap apVar, C119904w wVar) {
        this.f349108a = apVar;
        this.f349109b = wVar;
    }

    public final void run() {
        C119903v vVar;
        C119903v vVar2;
        C119899r rVar;
        C126778ap apVar = this.f349108a;
        C119904w wVar = this.f349109b;
        C59071e eVar = C126780ar.f349122a;
        C58976aa aaVar = C58975e.f156826a;
        C126780ar arVar = apVar.f349121a;
        int i = wVar.f333911a;
        int b = C119900s.m198775b(i);
        int i2 = b - 1;
        if (b != 0) {
            if (i2 == 0) {
                arVar.f349130i.mo19974a(C37176a.f97328v);
            } else if (i2 == 1) {
                if (i == 2) {
                    vVar = (C119903v) wVar.f333912b;
                } else {
                    vVar = C119903v.f333904d;
                }
                int a = C119902u.m198776a(vVar.f333906a);
                int i3 = a - 1;
                if (a == 0) {
                    throw null;
                } else if (i3 == 0) {
                    if (wVar.f333911a == 2) {
                        vVar2 = (C119903v) wVar.f333912b;
                    } else {
                        vVar2 = C119903v.f333904d;
                    }
                    if (vVar2.f333906a == 1) {
                        rVar = (C119899r) vVar2.f333907b;
                    } else {
                        rVar = C119899r.f333900c;
                    }
                    int a2 = C119898q.m198773a(rVar.f333902a);
                    int i4 = a2 - 1;
                    if (a2 == 0) {
                        throw null;
                    } else if (i4 == 0) {
                        arVar.f349130i.mo19974a(C37176a.f96844aO);
                    } else if (i4 == 1) {
                        arVar.f349130i.mo19974a(C37176a.f97327u);
                    } else if (i4 == 2) {
                        arVar.f349130i.mo19974a(C37176a.f96842aM);
                    } else if (i4 != 3) {
                        throw new AssertionError();
                    }
                } else if (i3 == 1) {
                    arVar.f349130i.mo19974a(C37176a.f96843aN);
                } else if (!(i3 == 2 || i3 == 3)) {
                    throw new AssertionError();
                }
            } else if (i2 != 2) {
                throw new AssertionError();
            }
            C126786ax axVar = apVar.f349121a.f349129h;
            axVar.f349151f.set(wVar);
            axVar.f349150e.mo50787a(C60866ct.f164955a, C126786ax.f349147b);
            return;
        }
        throw null;
    }
}
