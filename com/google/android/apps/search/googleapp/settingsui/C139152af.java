package com.google.android.apps.search.googleapp.settingsui;

import com.google.android.apps.search.googleapp.p10536x.C139873i;
import com.google.android.apps.search.googleapp.p10536x.C139875k;
import com.google.android.apps.search.googleapp.settingsui.selectedpreference.C139253b;
import com.google.apps.tiktok.account.AccountId;
import java.util.Map;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.settingsui.af */
/* compiled from: PG */
public final class C139152af {

    /* renamed from: a */
    public final AccountId f378458a;

    /* renamed from: b */
    public final SettingFragmentHostFragment f378459b;

    /* renamed from: c */
    public final C139253b f378460c;

    /* renamed from: d */
    public final C139873i f378461d;

    /* renamed from: e */
    public final C139875k f378462e;

    public C139152af(AccountId accountId, SettingFragmentHostFragment settingFragmentHostFragment, String str, Map map, C139253b bVar) {
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(map, "settingUiElements");
        C69664n.m101061g(bVar, "currentDestinationDataService");
        this.f378458a = accountId;
        this.f378459b = settingFragmentHostFragment;
        this.f378460c = bVar;
        C139873i a = C139873i.m227462a(str);
        this.f378461d = a;
        Object obj = map.get(a);
        C69664n.m101059e(obj, "null cannot be cast to non-null type com.google.android.apps.search.googleapp.settings.HostedFragmentLinkSettingUiElement");
        this.f378462e = (C139875k) obj;
    }
}
