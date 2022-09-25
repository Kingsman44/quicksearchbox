package com.google.android.apps.search.assistant.verticals.ambient.trigger.location;

import com.google.android.apps.search.assistant.p8938a.p8939a.p8940a.C119185b;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.trigger.location.u */
/* compiled from: PG */
public final /* synthetic */ class C131809u implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C131763ad f360003a;

    public /* synthetic */ C131809u(C131763ad adVar) {
        this.f360003a = adVar;
    }

    public final C60870cx apply(Object obj) {
        C131763ad adVar = this.f360003a;
        C119185b bVar = (C119185b) obj;
        if ((bVar.f332384a & 1) != 0) {
            C60870cx a = adVar.f359941h.mo50203a(bVar.f332385b);
            C47633f g = C47633f.m84733g(a);
            C46128f fVar = adVar.f359936c;
            Objects.requireNonNull(fVar);
            C47633f h = g.mo51516i(new C131799k(fVar), adVar.f359938e).mo51515h(C131800l.f359992a, C60826bg.f164896a).mo51515h(new C131802n(adVar), adVar.f359938e);
            return C47638k.m84753d(a, h).mo51521b(new C131803o(adVar, h, a), adVar.f359938e);
        }
        ((C58970a) ((C58970a) adVar.f359943j.mo56226d()).mo56372aa(39351)).mo56386p("No CSL subscription record");
        return adVar.f359940g.mo46039a(C131814z.f360009a, adVar.f359938e);
    }
}
