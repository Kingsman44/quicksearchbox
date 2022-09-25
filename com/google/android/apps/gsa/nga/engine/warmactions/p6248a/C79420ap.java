package com.google.android.apps.gsa.nga.engine.warmactions.p6248a;

import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79570b;
import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79573e;
import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79574f;
import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79583o;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.a.ap */
/* compiled from: PG */
abstract class C79420ap {
    /* renamed from: a */
    public abstract long mo74039a();

    /* renamed from: b */
    public abstract C79570b mo74040b();

    /* renamed from: c */
    public abstract C79583o mo74041c();

    /* renamed from: d */
    public abstract Instant mo74042d();

    /* renamed from: e */
    public final C79574f mo74043e() {
        C79573e eVar = (C79573e) C79574f.f218345d.createBuilder();
        long a = mo74039a();
        eVar.copyOnWrite();
        C79574f fVar = (C79574f) eVar.instance;
        fVar.f218347a |= 1;
        fVar.f218348b = a;
        C79570b b = mo74040b();
        eVar.copyOnWrite();
        C79574f fVar2 = (C79574f) eVar.instance;
        fVar2.f218349c = b.f218339o;
        fVar2.f218347a |= 2;
        return (C79574f) eVar.build();
    }
}
