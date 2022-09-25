package com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9736c;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.protobuf.C62942bv;
import dagger.hilt.android.internal.managers.C68324h;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.shared.ui.c.e */
/* compiled from: PG */
public final class C128587e {
    /* renamed from: a */
    public static final C128582b m209855a(AccountId accountId, C128586d dVar) {
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(dVar, "args");
        C128582b bVar = new C128582b();
        C68324h.m98669f(bVar);
        C47247a.m84047b(bVar, accountId);
        C47243l.m84039a(bVar, dVar);
        return bVar;
    }

    /* renamed from: b */
    public static /* synthetic */ C128582b m209856b(AccountId accountId) {
        C128585c cVar = (C128585c) C128586d.f353551d.createBuilder();
        cVar.copyOnWrite();
        C128586d dVar = (C128586d) cVar.instance;
        dVar.f353553a |= 1;
        dVar.f353554b = false;
        C62942bv build = cVar.build();
        C69664n.m101060f(build, "newBuilder().setMicVisib…itialState(false).build()");
        return m209855a(accountId, (C128586d) build);
    }
}
