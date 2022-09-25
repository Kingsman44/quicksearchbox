package com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9956c;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3886c.C50794cr;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.q.c.b */
/* compiled from: PG */
public final /* synthetic */ class C131184b implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C131193k f358782a;

    /* renamed from: b */
    public final /* synthetic */ C50794cr f358783b;

    /* renamed from: c */
    public final /* synthetic */ Object f358784c;

    /* renamed from: d */
    public final /* synthetic */ C131192j f358785d;

    public /* synthetic */ C131184b(C131193k kVar, C50794cr crVar, Object obj, C131192j jVar) {
        this.f358782a = kVar;
        this.f358783b = crVar;
        this.f358784c = obj;
        this.f358785d = jVar;
    }

    public final C60870cx apply(Object obj) {
        C131193k kVar = this.f358782a;
        C50794cr crVar = this.f358783b;
        Object obj2 = this.f358784c;
        C131192j jVar = this.f358785d;
        if (!((Boolean) obj).booleanValue()) {
            ((C58970a) ((C58970a) kVar.f358797a.mo56224b()).mo56372aa(39071)).mo56389s("%s: Not eligible for a sign-up card.", crVar.name());
            return C60856cj.m92900i(Optional.empty());
        }
        crVar.name();
        C60870cx a = jVar.mo110113a(obj2);
        C131187e eVar = new C131187e(kVar, crVar);
        return C60922j.m93045h(a, C47810es.m84966f(eVar), kVar.f358799c);
    }
}
