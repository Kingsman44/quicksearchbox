package com.google.frameworks.client.data.android.server.tiktok.aga;

import com.google.android.libraries.search.p2476a.C32160b;
import com.google.android.libraries.search.p2476a.p2479c.C32204e;
import com.google.apps.tiktok.account.AccountId;
import p5488io.grpc.Status;

/* renamed from: com.google.frameworks.client.data.android.server.tiktok.aga.j */
/* compiled from: PG */
public final class C61586j {

    /* renamed from: a */
    public static final Status f166438a = Status.f186912j.withDescription("Primary account mismatch");

    /* renamed from: b */
    public static final Status f166439b = Status.f186904b.withDescription("Primary account changed");

    /* renamed from: c */
    public final C32160b f166440c;

    /* renamed from: d */
    public final C32204e f166441d;

    /* renamed from: e */
    public final AccountId f166442e;

    public C61586j(C32160b bVar, C32204e eVar, AccountId accountId) {
        this.f166440c = bVar;
        this.f166441d = eVar;
        this.f166442e = accountId;
    }
}
