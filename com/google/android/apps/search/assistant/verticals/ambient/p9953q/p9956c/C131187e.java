package com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9956c;

import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9957d.p9961d.C131223f;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9957d.p9961d.C131224g;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9957d.p9961d.C131225h;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9957d.p9961d.C131229l;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9957d.p9961d.C131230m;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3886c.C50794cr;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.q.c.e */
/* compiled from: PG */
public final /* synthetic */ class C131187e implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C131193k f358789a;

    /* renamed from: b */
    public final /* synthetic */ C50794cr f358790b;

    public /* synthetic */ C131187e(C131193k kVar, C50794cr crVar) {
        this.f358789a = kVar;
        this.f358790b = crVar;
    }

    public final C60870cx apply(Object obj) {
        C131193k kVar = this.f358789a;
        C50794cr crVar = this.f358790b;
        Optional optional = (Optional) obj;
        if (optional.isPresent()) {
            crVar.name();
            C131230m mVar = kVar.f358798b;
            C47633f e = C47633f.m84733g(mVar.f358855a.mo46039a(new C131223f(mVar, crVar), mVar.f358857c)).mo51515h(C131224g.f358849a, mVar.f358857c).mo51513e(C131229l.class, C131225h.f358850a, mVar.f358857c);
            C131186d dVar = new C131186d(optional, crVar);
            return C60922j.m93044g(e, C47810es.m84963c(dVar), kVar.f358799c);
        }
        ((C58970a) ((C58970a) kVar.f358797a.mo56224b()).mo56372aa(39076)).mo56389s("%s: No sign-up card generated.", crVar.name());
        return C60856cj.m92900i(Optional.empty());
    }
}
