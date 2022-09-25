package com.google.android.apps.gsa.nga.engine.warmactions.p6248a;

import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79570b;
import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79583o;
import com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9722a.C128461e;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.Optional;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.a.ag */
/* compiled from: PG */
public final /* synthetic */ class C79411ag implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ C79418an f218050a;

    /* renamed from: b */
    public final /* synthetic */ C128461e f218051b;

    public /* synthetic */ C79411ag(C79418an anVar, C128461e eVar) {
        this.f218050a = anVar;
        this.f218051b = eVar;
    }

    public final Object get() {
        C79418an anVar = this.f218050a;
        C79570b b = this.f218051b.mo108448b();
        Optional flatMap = anVar.f218063d.mo74149a().flatMap(new C79415ak(b));
        if (flatMap.isEmpty()) {
            ((C58970a) ((C58970a) C79418an.f218059a.mo56226d()).mo56372aa(5624)).mo56389s("#MWW No config available for context: %s.", b.name());
            anVar.f218062c.mo74787c(b, 1);
            return Optional.empty();
        } else if (!((C79583o) flatMap.get()).f218361b.isEmpty()) {
            return flatMap;
        } else {
            ((C58970a) ((C58970a) C79418an.f218059a.mo56226d()).mo56372aa(5623)).mo56389s("#MWW No phrases available for context: %s.", b.name());
            anVar.f218062c.mo74790f(b, 3);
            return Optional.empty();
        }
    }
}
