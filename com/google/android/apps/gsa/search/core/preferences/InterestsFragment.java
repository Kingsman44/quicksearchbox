package com.google.android.apps.gsa.search.core.preferences;

import android.os.Bundle;
import com.google.android.apps.gsa.settingsui.C88988c;
import com.google.android.apps.gsa.settingsui.C88990e;
import com.google.android.apps.gsa.settingsui.SettingsFragmentBase;
import com.google.apps.tiktok.inject.C47266f;
import com.google.common.base.C58833ax;
import dagger.C68214a;

/* compiled from: PG */
public final class InterestsFragment extends SettingsFragmentBase {

    /* renamed from: a */
    public C68214a f233281a;

    /* renamed from: com.google.android.apps.gsa.search.core.preferences.InterestsFragment$a */
    /* compiled from: PG */
    public interface C86275a {
        /* renamed from: qd */
        void mo79981qd(InterestsFragment interestsFragment);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo79969a() {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C88990e mo79971b() {
        if (((C58833ax) this.f233281a.mo27525b()).mo56113h()) {
            return new C88988c();
        }
        return null;
    }

    public final void onCreate(Bundle bundle) {
        ((C86275a) C47266f.m84076a(getActivity(), C86275a.class)).mo79981qd(this);
        super.onCreate(bundle);
    }
}
