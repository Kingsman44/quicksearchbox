package com.google.android.apps.gsa.search.core.google.gaia;

import android.accounts.Account;
import android.net.Uri;
import com.google.android.apps.gsa.shared.util.C91043j;
import com.google.android.apps.gsa.shared.util.p7159c.C90888av;

/* renamed from: com.google.android.apps.gsa.search.core.google.gaia.ao */
/* compiled from: PG */
final class C86004ao extends C90888av {

    /* renamed from: a */
    final /* synthetic */ Account f232528a;

    /* renamed from: b */
    final /* synthetic */ Uri f232529b;

    /* renamed from: c */
    final /* synthetic */ String f232530c;

    /* renamed from: d */
    final /* synthetic */ C91043j f232531d;

    /* renamed from: e */
    final /* synthetic */ C86013ax f232532e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86004ao(C86013ax axVar, Account account, Uri uri, String str, C91043j jVar) {
        super("get link", 1, 4);
        this.f232532e = axVar;
        this.f232528a = account;
        this.f232529b = uri;
        this.f232530c = str;
        this.f232531d = jVar;
    }

    public final void run() {
        this.f232531d.mo17709a(this.f232532e.mo79690x(this.f232528a, this.f232529b, this.f232530c));
    }
}
