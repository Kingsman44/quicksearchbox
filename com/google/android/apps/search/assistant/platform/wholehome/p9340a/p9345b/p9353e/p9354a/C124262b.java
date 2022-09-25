package com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9353e.p9354a;

import com.google.android.libraries.search.assistant.p2705n.C34819a;
import com.google.android.libraries.search.assistant.p2705n.p2706a.C34830d;
import com.google.android.libraries.search.assistant.p2705n.p2708b.C34834b;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.net.p4726a.p4727a.C62722b;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.a.b.e.a.b */
/* compiled from: PG */
public final class C124262b {

    /* renamed from: a */
    public final C37215b f343081a;

    public C124262b(C37215b bVar) {
        this.f343081a = bVar;
    }

    /* renamed from: a */
    public final void mo106353a(Optional optional) {
        if (optional.isPresent()) {
            C34834b bVar = C34830d.m63595b((Throwable) optional.get()).f92362c;
            if (bVar == null) {
                bVar = C34834b.f92401c;
            }
            C34819a b = C34819a.m63579b(bVar);
            this.f343081a.mo19974a(C37176a.f97102fH.mo40803a(b.mo39520a(), b.mo39522e()));
            return;
        }
        this.f343081a.mo19974a(C37176a.f97102fH.mo40805c(C62722b.OK));
    }
}
