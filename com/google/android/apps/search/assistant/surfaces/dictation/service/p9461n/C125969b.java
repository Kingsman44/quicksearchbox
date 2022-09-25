package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n;

import com.google.android.apps.gsa.nga.api.a.ag;
import com.google.android.apps.gsa.nga.api.a.aj;
import com.google.android.apps.gsa.nga.api.a.b;
import com.google.common.p4522b.C58733pz;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.b */
/* compiled from: PG */
public final class C125969b {

    /* renamed from: a */
    public final C126054bs f347191a;

    /* renamed from: b */
    public final boolean f347192b;

    /* renamed from: c */
    public final AtomicReference f347193c = new AtomicReference(C58733pz.f156496a);

    /* renamed from: d */
    private final C126114dy f347194d;

    public C125969b(C126054bs bsVar, C126114dy dyVar, boolean z) {
        this.f347191a = bsVar;
        this.f347194d = dyVar;
        this.f347192b = z;
    }

    /* renamed from: a */
    public final void mo107212a(b bVar) {
        if (!bVar.a.isEmpty()) {
            C126114dy dyVar = this.f347194d;
            ag createBuilder = aj.c.createBuilder();
            createBuilder.copyOnWrite();
            aj ajVar = createBuilder.instance;
            bVar.getClass();
            ajVar.b = bVar;
            ajVar.a = 12;
            dyVar.mo107365i(createBuilder.build());
        }
    }
}
