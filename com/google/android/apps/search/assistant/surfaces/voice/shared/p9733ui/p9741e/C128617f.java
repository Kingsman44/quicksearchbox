package com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9741e;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import dagger.hilt.android.internal.managers.C68324h;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.shared.ui.e.f */
/* compiled from: PG */
public final class C128617f {
    /* renamed from: a */
    public static final C128614c m209909a(AccountId accountId, C128616e eVar) {
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(eVar, "args");
        C128614c cVar = new C128614c();
        C68324h.m98669f(cVar);
        C47247a.m84047b(cVar, accountId);
        C47243l.m84039a(cVar, eVar);
        return cVar;
    }

    /* renamed from: b */
    public static /* synthetic */ C128614c m209910b(AccountId accountId) {
        C128616e eVar = C128616e.f353611c;
        C69664n.m101060f(eVar, "getDefaultInstance()");
        return m209909a(accountId, eVar);
    }

    /* renamed from: c */
    public static final C128614c m209911c(AccountId accountId) {
        C69664n.m101061g(accountId, "accountId");
        return m209910b(accountId);
    }
}
