package com.google.android.apps.search.googleapp.settingsui;

import com.google.android.apps.search.googleapp.settingsui.selectedpreference.C139253b;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.synthetic.C28452b;
import com.google.android.libraries.search.p3025k.C38553h;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.settingsui.bo */
/* compiled from: PG */
public final class C139192bo extends C139193bp {

    /* renamed from: a */
    public final AccountId f378549a;

    /* renamed from: b */
    public final SettingsSearchFragment f378550b;

    /* renamed from: c */
    public final Map f378551c;

    /* renamed from: d */
    public final C139189bl f378552d;

    /* renamed from: e */
    public final C46801dp f378553e;

    /* renamed from: f */
    public final C28310af f378554f;

    /* renamed from: g */
    public final C28306ab f378555g;

    /* renamed from: h */
    public final C139253b f378556h;

    /* renamed from: i */
    public final C46792di f378557i = new C139191bn(this);

    /* renamed from: j */
    public final List f378558j = new ArrayList();

    /* renamed from: k */
    public C28452b f378559k;

    /* renamed from: l */
    public final Map f378560l = new HashMap();

    /* renamed from: m */
    public final C38553h f378561m;

    public C139192bo(AccountId accountId, SettingsSearchFragment settingsSearchFragment, Map map, C139189bl blVar, C46801dp dpVar, C28310af afVar, C28306ab abVar, C38553h hVar, C139253b bVar) {
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(map, "settingUiElements");
        C69664n.m101061g(dpVar, "subscriptionMixin");
        C69664n.m101061g(afVar, "visualElements");
        C69664n.m101061g(abVar, "viewVisualElements");
        C69664n.m101061g(hVar, "fragmentIncognitoChecker");
        C69664n.m101061g(bVar, "currentDestinationDataService");
        this.f378549a = accountId;
        this.f378550b = settingsSearchFragment;
        this.f378551c = map;
        this.f378552d = blVar;
        this.f378553e = dpVar;
        this.f378554f = afVar;
        this.f378555g = abVar;
        this.f378561m = hVar;
        this.f378556h = bVar;
    }

    /* renamed from: a */
    public final C28452b mo114810a() {
        C28452b bVar = this.f378559k;
        if (bVar != null) {
            return bVar;
        }
        C69664n.m101065k("preferenceContainer");
        return null;
    }
}
