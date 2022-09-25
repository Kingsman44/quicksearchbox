package com.google.android.libraries.web.contrib.p3360c;

import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import com.google.android.libraries.web.contrib.p3360c.p3361a.C43406c;
import com.google.android.libraries.web.profile.Profile;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import dagger.hilt.android.internal.managers.C68324h;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.contrib.c.a */
/* compiled from: PG */
public final class C43403a {

    /* renamed from: a */
    private final Profile f113396a;

    /* renamed from: b */
    private final AccountId f113397b;

    /* renamed from: c */
    private final Fragment f113398c;

    public C43403a(Profile profile, AccountId accountId, Fragment fragment) {
        C69664n.m101061g(profile, "profile");
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(fragment, "fragment");
        this.f113396a = profile;
        this.f113397b = accountId;
        this.f113398c = fragment;
    }

    /* renamed from: a */
    public final void mo46502a(String str) {
        C69664n.m101061g(str, "url");
        if (str.length() != 0) {
            C43406c cVar = (C43406c) this.f113398c.getChildFragmentManager().f634a.mo671c("web-domain-prewarmer-fragment");
            if (cVar == null) {
                FragmentManager childFragmentManager = this.f113398c.getChildFragmentManager();
                C69664n.m101060f(childFragmentManager, "fragment.childFragmentManager");
                C0154a aVar = new C0154a(childFragmentManager);
                AccountId accountId = this.f113397b;
                Profile profile = this.f113396a;
                C69664n.m101061g(accountId, "accountId");
                C69664n.m101061g(str, "url");
                C69664n.m101061g(profile, "profile");
                C43406c cVar2 = new C43406c();
                C68324h.m98669f(cVar2);
                C47247a.m84047b(cVar2, accountId);
                C47243l.m84040b(cVar2, str);
                Bundle arguments = cVar2.getArguments();
                if (arguments == null) {
                    arguments = new Bundle();
                }
                arguments.putParcelable("profile", profile);
                cVar2.setArguments(arguments);
                aVar.mo685r(cVar2, "web-domain-prewarmer-fragment");
                aVar.mo509f();
            } else if (!C69664n.m101066l(cVar.mo17754z().f113416h, this.f113396a)) {
                throw new IllegalArgumentException("WebDomainPrewarmer can only be used for a single profile. Prewarming multiple web implentations is normally a sign of a bug, more likely you should prewarm one or other based on a flag.");
            }
        } else {
            throw new IllegalArgumentException("Cannot prewarm domain with an empty URL.");
        }
    }
}
