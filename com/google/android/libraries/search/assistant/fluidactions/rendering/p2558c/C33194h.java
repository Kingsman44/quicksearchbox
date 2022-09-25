package com.google.android.libraries.search.assistant.fluidactions.rendering.p2558c;

import android.support.p031v4.app.Fragment;
import com.google.android.libraries.search.assistant.fluidactions.p2538b.C32951d;
import com.google.android.libraries.search.assistant.fluidactions.p2538b.C32953f;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2559d.C33212a;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2559d.C33215d;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2559d.C33216e;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.protobuf.C62942bv;
import dagger.hilt.android.internal.managers.C68324h;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.c.h */
/* compiled from: PG */
public final class C33194h {

    /* renamed from: a */
    private final AccountId f88780a;

    /* renamed from: b */
    private final C33212a f88781b;

    public C33194h(AccountId accountId, C33212a aVar) {
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(aVar, "argumentCache");
        this.f88780a = accountId;
        this.f88781b = aVar;
    }

    /* renamed from: a */
    public final Fragment mo38588a(C32953f fVar, C32951d dVar) {
        C69664n.m101061g(fVar, "freeFormCallback");
        C69664n.m101061g(dVar, "fluidActionsConfig");
        C33215d dVar2 = (C33215d) C33216e.f88826c.createBuilder();
        C69664n.m101060f(dVar2, "newBuilder()");
        C69664n.m101061g(dVar2, "builder");
        int andIncrement = this.f88781b.f88816a.getAndIncrement();
        dVar2.copyOnWrite();
        C33216e eVar = (C33216e) dVar2.instance;
        eVar.f88828a |= 1;
        eVar.f88829b = andIncrement;
        C62942bv build = dVar2.build();
        C69664n.m101060f(build, "_builder.build()");
        C33216e eVar2 = (C33216e) build;
        C33212a aVar = this.f88781b;
        int i = eVar2.f88829b;
        C69664n.m101061g(dVar, "fluidActionsConfig");
        aVar.f88817b.put(Integer.valueOf(i), dVar);
        C33212a aVar2 = this.f88781b;
        int i2 = eVar2.f88829b;
        C69664n.m101061g(fVar, "freeFormCallback");
        aVar2.f88818c.put(Integer.valueOf(i2), fVar);
        AccountId accountId = this.f88780a;
        C33193g gVar = new C33193g();
        C68324h.m98669f(gVar);
        C47247a.m84047b(gVar, accountId);
        C47243l.m84039a(gVar, eVar2);
        return gVar;
    }
}
