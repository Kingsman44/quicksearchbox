package com.google.android.apps.search.googleapp.accounts.p10126ui;

import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.googleapp.accounts.C133149a;
import com.google.android.apps.search.googleapp.accounts.p10124b.C133160h;
import com.google.android.libraries.onegoogle.accountmanagement.C30282k;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46108a;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.v */
/* compiled from: PG */
public final class C133365v extends C30282k {

    /* renamed from: a */
    private static final C59071e f363401a = C59071e.m91332i("com.google.android.apps.search.googleapp.accounts.ui.v");

    /* renamed from: b */
    private final AccountId f363402b;

    /* renamed from: c */
    private final Fragment f363403c;

    /* renamed from: d */
    private final C133160h f363404d;

    public C133365v(Fragment fragment, AccountId accountId, C133160h hVar) {
        this.f363403c = fragment;
        this.f363402b = accountId;
        this.f363404d = hVar;
    }

    /* renamed from: d */
    public final void mo18106c(C46108a aVar) {
        if (aVar == null || !this.f363402b.equals(aVar.mo50209a())) {
            C47393f.m84236g(new C133149a(), this.f363403c);
            this.f363404d.mo111001a(aVar);
            return;
        }
        ((C59052c) ((C59052c) f363401a.mo56226d()).mo56372aa(40014)).mo56386p("Trying to switch to the same account that's already selected");
    }
}
