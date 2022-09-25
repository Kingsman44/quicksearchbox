package com.google.android.libraries.web.p3420k;

import android.os.Bundle;
import com.evernote.android.state.BuildConfig;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import dagger.hilt.android.internal.managers.C68324h;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.k.j */
/* compiled from: PG */
public final class C43864j {
    /* renamed from: a */
    public static final C43861g m77435a(AccountId accountId, String str) {
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(str, "initialUrl");
        C43861g gVar = new C43861g();
        C68324h.m98669f(gVar);
        C47247a.m84047b(gVar, accountId);
        C47243l.m84040b(gVar, str);
        Bundle arguments = gVar.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putBoolean("com.google.android.libraries.web.WebFragment", true);
        gVar.setArguments(arguments);
        return gVar;
    }

    /* renamed from: b */
    public static final C43861g m77436b(AccountId accountId) {
        C69664n.m101061g(accountId, "accountId");
        return m77435a(accountId, BuildConfig.FLAVOR);
    }
}
