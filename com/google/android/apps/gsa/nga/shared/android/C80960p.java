package com.google.android.apps.gsa.nga.shared.android;

import android.accounts.AccountManager;
import com.google.android.p10905k.C146602a;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4526f.C59071e;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.gsa.nga.shared.android.p */
/* compiled from: PG */
public final class C80960p {
    @Deprecated

    /* renamed from: a */
    public static final String f221955a = C146602a.m238836a("uca");
    @Deprecated

    /* renamed from: b */
    public static final C59071e f221956b = C59071e.m91331h();

    /* renamed from: c */
    public final AccountManager f221957c;

    /* renamed from: d */
    public final C58881cr f221958d;

    public C80960p(AccountManager accountManager) {
        C69664n.m101061g(accountManager, "accountManager");
        this.f221957c = accountManager;
        C58881cr a = C58886cw.m90973a(new C80959o(this));
        C69664n.m101060f(a, "memoize { getUnicornAccountStatus() }");
        this.f221958d = a;
    }
}
