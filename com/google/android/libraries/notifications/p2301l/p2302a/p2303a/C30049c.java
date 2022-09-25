package com.google.android.libraries.notifications.p2301l.p2302a.p2303a;

import com.google.android.libraries.notifications.platform.p2307a.C30058b;
import com.google.apps.tiktok.account.data.C46108a;
import com.google.common.util.concurrent.C60845bz;
import java.util.List;

/* renamed from: com.google.android.libraries.notifications.l.a.a.c */
/* compiled from: PG */
final class C30049c implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C30050d f81305a;

    public C30049c(C30050d dVar) {
        this.f81305a = dVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C30058b.m55792d("TikTokContrib", th, "Failed to get enabled accounts", new Object[0]);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        for (C46108a b : (List) obj) {
            this.f81305a.mo35388c(b.mo50210b());
        }
    }
}
