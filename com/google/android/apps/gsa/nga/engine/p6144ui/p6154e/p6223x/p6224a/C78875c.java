package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6223x.p6224a;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.p6167b.C78245d;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s.C78815q;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s.C78816r;
import com.google.android.apps.gsa.nga.shared.p6417x.C83344ae;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.x.a.c */
/* compiled from: PG */
public final /* synthetic */ class C78875c implements C83344ae {

    /* renamed from: a */
    public static final /* synthetic */ C78875c f217057a = new C78875c();

    private /* synthetic */ C78875c() {
    }

    /* renamed from: a */
    public final Object mo73140a(Object obj, Object obj2, Object obj3, Object obj4) {
        C78815q qVar = (C78815q) obj;
        C78245d dVar = (C78245d) obj2;
        Boolean bool = (Boolean) obj3;
        if (((Boolean) obj4).booleanValue()) {
            return Optional.empty();
        }
        if (C78816r.m126609n(qVar) && C78883k.m126757a(dVar, bool.booleanValue())) {
            return dVar.mo73180b().mo73170c().map(C78873a.f217055a);
        }
        if (C78816r.m126605j(qVar) || C78816r.m126603h(qVar)) {
            return C78816r.m126596a(qVar);
        }
        return Optional.empty();
    }
}
