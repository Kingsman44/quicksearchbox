package com.google.android.apps.search.googleapp.settingsui;

import android.support.p031v4.app.Fragment;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.p10536x.C139873i;
import com.google.android.apps.search.googleapp.settingsui.p10482a.C139137a;
import com.google.android.apps.search.googleapp.settingsui.p10482a.C139138b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.protobuf.C62942bv;
import dagger.hilt.android.internal.managers.C68324h;
import p5462h.C69677g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.settingsui.ap */
/* compiled from: PG */
public final class C139162ap {

    /* renamed from: a */
    private final AccountId f378477a;

    public C139162ap(AccountId accountId) {
        C69664n.m101061g(accountId, "accountId");
        this.f378477a = accountId;
    }

    /* renamed from: a */
    public final Fragment mo114791a(C139161ao aoVar, C139873i iVar) {
        String str;
        if (aoVar instanceof C139159am) {
            throw new IllegalArgumentException("The destination must not be InvalidDestination.");
        } else if (aoVar instanceof C139160an) {
            AccountId accountId = this.f378477a;
            C139137a aVar = (C139137a) C139138b.f378426d.createBuilder();
            C69664n.m101060f(aVar, "newBuilder()");
            C69664n.m101061g(aVar, "builder");
            String name = ((C139160an) aoVar).f378476a.name();
            C69664n.m101061g(name, "value");
            aVar.copyOnWrite();
            C139138b bVar = (C139138b) aVar.instance;
            name.getClass();
            bVar.f378428a |= 1;
            bVar.f378429b = name;
            if (iVar == null || (str = iVar.name()) == null) {
                str = BuildConfig.FLAVOR;
            }
            C69664n.m101061g(str, "value");
            aVar.copyOnWrite();
            C139138b bVar2 = (C139138b) aVar.instance;
            str.getClass();
            bVar2.f378428a |= 2;
            bVar2.f378430c = str;
            C62942bv build = aVar.build();
            C69664n.m101060f(build, "_builder.build()");
            SettingsPageFragment settingsPageFragment = new SettingsPageFragment();
            C68324h.m98669f(settingsPageFragment);
            C47247a.m84047b(settingsPageFragment, accountId);
            C47243l.m84039a(settingsPageFragment, (C139138b) build);
            return settingsPageFragment;
        } else if (aoVar instanceof C139158al) {
            AccountId accountId2 = this.f378477a;
            String name2 = ((C139158al) aoVar).f378474a.name();
            SettingFragmentHostFragment settingFragmentHostFragment = new SettingFragmentHostFragment();
            C68324h.m98669f(settingFragmentHostFragment);
            C47247a.m84047b(settingFragmentHostFragment, accountId2);
            C47243l.m84040b(settingFragmentHostFragment, name2);
            return settingFragmentHostFragment;
        } else {
            throw new C69677g();
        }
    }
}
