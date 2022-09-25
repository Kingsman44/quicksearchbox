package com.google.android.apps.gsa.p8867w.p8872c;

import com.google.android.libraries.assistant.auto.tng.p1322v.p1338e.p1341b.C16890c;
import com.google.android.libraries.assistant.auto.tng.p1322v.p1338e.p1341b.C16891d;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.w.c.u */
/* compiled from: PG */
public final /* synthetic */ class C118770u implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C118744ab f331290a;

    /* renamed from: b */
    public final /* synthetic */ String f331291b;

    public /* synthetic */ C118770u(C118744ab abVar, String str) {
        this.f331290a = abVar;
        this.f331291b = str;
    }

    public final Object call() {
        C118744ab abVar = this.f331290a;
        String str = this.f331291b;
        C16890c cVar = (C16890c) C16891d.f49387g.createBuilder();
        abVar.mo103949e("notification-enable-status", new C118771v(abVar, cVar, str));
        abVar.mo103949e("home-screen-notification-enable-status", new C118772w(abVar, cVar, str));
        abVar.mo103949e("suggestions-enable-status", new C118773x(abVar, cVar, str));
        abVar.mo103949e("pr_enabled_on_lockscreen", new C118774y(abVar, cVar, str));
        boolean f = abVar.mo103950f(str, 6);
        if (abVar.f331224f) {
            C58976aa aaVar = C58975e.f156826a;
            cVar.copyOnWrite();
            C16891d dVar = (C16891d) cVar.instance;
            dVar.f49389a |= 8;
            dVar.f49392d = f;
        } else {
            boolean f2 = abVar.mo103950f(str, 3);
            C59104x b = C118744ab.f331219a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "AutoClassSetData");
            ((C59052c) ((C59052c) b).mo56372aa(11480)).mo56358K("ThirdPartyDisclosureStatus hasAckedOnOpaAndroid: %b, hasAckedOnOpaAndroidAuto: %b", f2, f);
            boolean z = true;
            if (!f2 && !f) {
                z = false;
            }
            cVar.copyOnWrite();
            C16891d dVar2 = (C16891d) cVar.instance;
            dVar2.f49389a |= 8;
            dVar2.f49392d = z;
        }
        return (C16891d) cVar.build();
    }
}
