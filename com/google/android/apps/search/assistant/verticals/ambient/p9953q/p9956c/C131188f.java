package com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9956c;

import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9957d.p9961d.C131226i;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9957d.p9961d.C131228k;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9957d.p9961d.C131230m;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3886c.C50794cr;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.q.c.f */
/* compiled from: PG */
public final /* synthetic */ class C131188f implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C131193k f358791a;

    /* renamed from: b */
    public final /* synthetic */ C50794cr f358792b;

    /* renamed from: c */
    public final /* synthetic */ boolean f358793c;

    /* renamed from: d */
    public final /* synthetic */ boolean f358794d;

    /* renamed from: e */
    public final /* synthetic */ C131192j f358795e;

    public /* synthetic */ C131188f(C131193k kVar, C50794cr crVar, boolean z, boolean z2, C131192j jVar) {
        this.f358791a = kVar;
        this.f358792b = crVar;
        this.f358793c = z;
        this.f358794d = z2;
        this.f358795e = jVar;
    }

    public final C60870cx apply(Object obj) {
        C131193k kVar = this.f358791a;
        C50794cr crVar = this.f358792b;
        boolean z = this.f358793c;
        boolean z2 = this.f358794d;
        C131192j jVar = this.f358795e;
        C131191i iVar = (C131191i) obj;
        Optional a = iVar.mo110106a();
        if (a.isPresent()) {
            ((C58970a) ((C58970a) kVar.f358797a.mo56224b()).mo56372aa(39075)).mo56389s("%s: Generated a regular card.", crVar.name());
            if (!z) {
                return C60856cj.m92900i(a);
            }
            C131230m mVar = kVar.f358798b;
            C60870cx a2 = mVar.f358855a.mo46039a(new C131226i(crVar), mVar.f358857c);
            C131185c cVar = new C131185c(a);
            return C60922j.m93044g(a2, C47810es.m84963c(cVar), kVar.f358799c);
        }
        ((C58970a) ((C58970a) kVar.f358797a.mo56224b()).mo56372aa(39072)).mo56389s("%s: No regular card generated, trying to generate a sign-up card.", crVar.name());
        if (!z2) {
            ((C58970a) ((C58970a) kVar.f358797a.mo56224b()).mo56372aa(39074)).mo56389s("%s: Sign-up disabled.", crVar.name());
            return C60856cj.m92900i(Optional.empty());
        }
        Optional b = iVar.mo110107b();
        if (b.isEmpty()) {
            crVar.name();
            return C60856cj.m92900i(Optional.empty());
        }
        Object obj2 = b.get();
        C131230m mVar2 = kVar.f358798b;
        C60870cx d = mVar2.f358855a.mo46042d();
        C131228k kVar2 = new C131228k(mVar2, crVar);
        C60870cx g = C60922j.m93044g(d, C47810es.m84963c(kVar2), mVar2.f358857c);
        C131184b bVar = new C131184b(kVar, crVar, obj2, jVar);
        return C60922j.m93045h(g, C47810es.m84966f(bVar), kVar.f358799c);
    }
}
