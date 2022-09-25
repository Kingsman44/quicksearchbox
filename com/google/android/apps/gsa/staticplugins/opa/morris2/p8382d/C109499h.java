package com.google.android.apps.gsa.staticplugins.opa.morris2.p8382d;

import android.databinding.C0118a;
import com.google.android.libraries.assistant.p1467d.p1471b.C17823i;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.d.h */
/* compiled from: PG */
final class C109499h implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C109500i f304965a;

    public C109499h(C109500i iVar) {
        this.f304965a = iVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C109500i.f304966a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "Morris.MiniCtrl");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(24966)).mo56386p("Failed to poll foreground app");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        String str = (String) obj;
        if (this.f304965a.f304974i.getResources().getConfiguration().orientation == 2) {
            C59104x c = C109500i.f304966a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "Morris.MiniCtrl");
            C0118a.m108p(c, "#onPoll(): device is in landscape mode.", 24968, C38505d.f101864b, 192495104);
            this.f304965a.mo97869k();
        }
        if (str != null) {
            C109500i iVar = this.f304965a;
            if (iVar.f304984s != null && !iVar.f304982q.contains(str)) {
                C109500i iVar2 = this.f304965a;
                if (!iVar2.f304982q.contains(iVar2.f304984s)) {
                    C59104x c2 = C109500i.f304966a.mo56225c();
                    c2.mo56378ag(C58975e.f156826a, "Morris.MiniCtrl");
                    C59052c cVar = (C59052c) c2;
                    cVar.mo56378ag(C38505d.f101864b, 192494920);
                    ((C59052c) cVar.mo56372aa(24967)).mo56389s("#onPoll(): %s is not an allowed host app.", str);
                    if (!this.f304965a.f304981p.isPresent() || !((C17823i) this.f304965a.f304981p.get()).equals(C17823i.RUNNING_IN_BACKGROUND)) {
                        this.f304965a.mo97869k();
                    } else {
                        this.f304965a.mo97860e(C17823i.RUNNING_IN_BACKGROUND, str, Optional.empty(), Optional.empty());
                        return;
                    }
                }
            }
        }
        this.f304965a.f304984s = str;
    }
}
