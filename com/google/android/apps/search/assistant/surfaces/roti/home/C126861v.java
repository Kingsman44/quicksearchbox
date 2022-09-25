package com.google.android.apps.search.assistant.surfaces.roti.home;

import androidx.p104d.p105a.C2164c;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.roti.home.v */
/* compiled from: PG */
public final /* synthetic */ class C126861v implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C126780ar f349335a;

    /* renamed from: b */
    public final /* synthetic */ int f349336b;

    public /* synthetic */ C126861v(C126780ar arVar, int i) {
        this.f349335a = arVar;
        this.f349336b = i;
    }

    public final void run() {
        C126780ar arVar = this.f349335a;
        if (this.f349336b == arVar.f349135n && arVar.f349137p != null) {
            C58976aa aaVar = C58975e.f156826a;
            if (arVar.f349133l.isPresent()) {
                ((C2164c) arVar.f349133l.get()).mo5439d(new C126846g());
                arVar.f349133l = Optional.empty();
                arVar.f349132k = C119834cb.f333765b;
                C60856cj.m92911t(arVar.mo107773c(), C47810es.m84974n(new C126765ac()), arVar.f349126e);
            }
            arVar.f349137p = null;
        }
    }
}
