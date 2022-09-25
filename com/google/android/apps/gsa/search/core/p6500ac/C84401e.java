package com.google.android.apps.gsa.search.core.p6500ac;

import com.google.p4283bv.p4287b.p4288a.p4322b.C56847c;
import com.google.p4283bv.p4287b.p4288a.p4322b.C56848d;

/* renamed from: com.google.android.apps.gsa.search.core.ac.e */
/* compiled from: PG */
public final class C84401e extends C84403g {

    /* renamed from: a */
    public static final C56848d f229665a;

    static {
        C56847c cVar = (C56847c) C56848d.f151669d.createBuilder();
        cVar.copyOnWrite();
        C56848d dVar = (C56848d) cVar.instance;
        dVar.f151671a |= 1;
        dVar.f151672b = "no_callback_attached_error";
        cVar.copyOnWrite();
        C56848d dVar2 = (C56848d) cVar.instance;
        dVar2.f151671a |= 2;
        dVar2.f151673c = "A callback has not yet been attached to the MediaRouter.";
        f229665a = (C56848d) cVar.build();
    }

    public C84401e() {
        super(f229665a);
    }
}
