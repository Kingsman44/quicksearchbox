package com.google.android.apps.gsa.nga.engine.warmactions.p6250c;

import com.google.android.apps.gsa.nga.engine.recognition.C77566as;
import com.google.android.apps.gsa.nga.engine.warmactions.C79403a;
import com.google.android.apps.gsa.nga.engine.warmactions.C79566g;
import com.google.android.apps.gsa.nga.engine.warmactions.p6259k.C79720c;
import com.google.android.libraries.gsa.p1876k.C22864c;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.c.d */
/* compiled from: PG */
public final /* synthetic */ class C79479d implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C79483h f218160a;

    /* renamed from: b */
    public final /* synthetic */ C79566g f218161b;

    public /* synthetic */ C79479d(C79483h hVar, C79566g gVar) {
        this.f218160a = hVar;
        this.f218161b = gVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C79483h hVar = this.f218160a;
        C79566g gVar = this.f218161b;
        C77566as asVar = (C77566as) obj;
        C79403a aVar = (C79403a) gVar;
        C79720c.m127813a(aVar.f218040a);
        Optional empty = Optional.empty();
        if (asVar != null) {
            C79476a aVar2 = new C79476a(empty, asVar, gVar);
            hVar.f218169c.mo73250a(gVar);
            C79720c.m127814b(aVar.f218040a);
            return hVar.f218168b.mo74180b(aVar2);
        }
        throw new NullPointerException("Null speechSessionParams");
    }
}
