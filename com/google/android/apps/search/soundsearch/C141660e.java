package com.google.android.apps.search.soundsearch;

import android.content.Context;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.FragmentManager;
import com.google.android.apps.search.soundsearch.homescreen.C141724g;
import com.google.android.apps.search.soundsearch.p10657f.p10658a.p10659a.C141665a;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.account.AccountId;
import com.google.common.p4526f.C59071e;
import com.google.net.p4726a.p4727a.C62722b;

/* renamed from: com.google.android.apps.search.soundsearch.e */
/* compiled from: PG */
public final class C141660e {

    /* renamed from: a */
    public static final C59071e f384502a = C59071e.m91332i("com.google.android.apps.search.soundsearch.e");

    /* renamed from: b */
    public final C141650d f384503b;

    /* renamed from: c */
    public final Context f384504c;

    /* renamed from: d */
    public final C141665a f384505d;

    /* renamed from: e */
    private final AccountId f384506e;

    public C141660e(Context context, AccountId accountId, C141650d dVar, C141665a aVar) {
        this.f384506e = accountId;
        this.f384503b = dVar;
        this.f384504c = context;
        this.f384505d = aVar;
    }

    /* renamed from: a */
    public final void mo116638a() {
        FragmentManager childFragmentManager = this.f384503b.getChildFragmentManager();
        if (childFragmentManager.f634a.mo671c("HOME_SCREEN_TAG") == null) {
            C0154a aVar = new C0154a(childFragmentManager);
            aVar.mo511h(R.id.soundsearch_content, C141724g.m229958c(this.f384506e), "HOME_SCREEN_TAG", 1);
            aVar.mo509f();
            this.f384505d.mo116639a(C62722b.OK);
        }
    }
}
