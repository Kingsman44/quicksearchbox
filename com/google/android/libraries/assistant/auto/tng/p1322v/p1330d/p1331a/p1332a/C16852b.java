package com.google.android.libraries.assistant.auto.tng.p1322v.p1330d.p1331a.p1332a;

import com.google.android.apps.search.assistant.platform.p9141h.p9156f.C121090b;
import com.google.android.libraries.assistant.auto.tng.p1322v.p1323a.C16833a;
import com.google.android.libraries.assistant.auto.tng.p1322v.p1330d.p1331a.p1333b.C16862a;
import com.google.android.libraries.assistant.auto.tng.p1322v.p1330d.p1331a.p1333b.C16863b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.v.d.a.a.b */
/* compiled from: PG */
public final /* synthetic */ class C16852b implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C16860j f49318a;

    public /* synthetic */ C16852b(C16860j jVar) {
        this.f49318a = jVar;
    }

    public final C60870cx apply(Object obj) {
        Optional optional;
        C16860j jVar = this.f49318a;
        Optional optional2 = (Optional) obj;
        if (optional2.isPresent()) {
            return C60856cj.m92900i((String) optional2.get());
        }
        if (jVar.f49336f.isPresent()) {
            C16863b bVar = (C16863b) jVar.f49336f.get();
            if (((Boolean) bVar.f49344a.mo17428b()).booleanValue()) {
                C60870cx b = ((C121090b) bVar.f49345b.mo17428b()).mo105044b();
                C16862a aVar = C16862a.f49343a;
                optional = Optional.m71637of(C60922j.m93044g(b, C47810es.m84963c(aVar), bVar.f49346c));
            } else {
                optional = Optional.empty();
            }
            if (optional.isPresent()) {
                return (C60870cx) optional.get();
            }
        }
        C60870cx b2 = jVar.f49331a.mo20979b(jVar.f49332b);
        C16833a aVar2 = jVar.f49333c;
        Objects.requireNonNull(aVar2);
        C16857g gVar = new C16857g(aVar2);
        C60870cx h = C60922j.m93045h(b2, C47810es.m84966f(gVar), jVar.f49334d);
        C16856f fVar = C16856f.f49325a;
        return C60922j.m93044g(h, C47810es.m84963c(fVar), jVar.f49334d);
    }
}
