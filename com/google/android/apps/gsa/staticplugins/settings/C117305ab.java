package com.google.android.apps.gsa.staticplugins.settings;

import android.content.Intent;
import com.google.android.apps.gsa.nga.api.C74710bk;
import com.google.android.apps.gsa.staticplugins.settings.preferences.ViewHolderPreference;
import com.google.android.libraries.logging.p2185ve.C28442l;

/* renamed from: com.google.android.apps.gsa.staticplugins.settings.ab */
/* compiled from: PG */
public final /* synthetic */ class C117305ab implements C74710bk {

    /* renamed from: a */
    public final /* synthetic */ RootSettingsFragment f325640a;

    /* renamed from: b */
    public final /* synthetic */ ViewHolderPreference f325641b;

    public /* synthetic */ C117305ab(RootSettingsFragment rootSettingsFragment, ViewHolderPreference viewHolderPreference) {
        this.f325640a = rootSettingsFragment;
        this.f325641b = viewHolderPreference;
    }

    /* renamed from: a */
    public final void mo18103a(Intent intent) {
        RootSettingsFragment rootSettingsFragment = this.f325640a;
        ViewHolderPreference viewHolderPreference = this.f325641b;
        if (C117322n.f325671a.containsKey(viewHolderPreference.f12748t)) {
            rootSettingsFragment.f325607h.mo33853c(C28442l.m53142h().mo33894a(), rootSettingsFragment.f325614o.mo33908b(viewHolderPreference.f12748t));
        }
        rootSettingsFragment.f325605f.mo65090b(intent, C117306ac.f325642a);
    }
}
