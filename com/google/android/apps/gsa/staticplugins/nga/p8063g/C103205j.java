package com.google.android.apps.gsa.staticplugins.nga.p8063g;

import android.accounts.Account;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.protos.p4874ap.p4875a.p4876a.C63662ac;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65798cb;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.g.j */
/* compiled from: PG */
public final /* synthetic */ class C103205j implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C103206k f287961a;

    /* renamed from: b */
    public final /* synthetic */ Account f287962b;

    public /* synthetic */ C103205j(C103206k kVar, Account account) {
        this.f287961a = kVar;
        this.f287962b = account;
    }

    public final void run() {
        String str;
        C103206k kVar = this.f287961a;
        Account account = this.f287962b;
        if (account == null) {
            str = BuildConfig.FLAVOR;
        } else {
            str = account.name;
        }
        kVar.f287968f.mo28209i(kVar.f287966d.a(str, C65753ak.PRIVACY_SETTINGS, (String) null, C63662ac.f172144a, C65798cb.f178854e), "[NGA] updatePrivacySettings", new C103197b(kVar, str));
    }
}
