package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.p9870a;

import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.DynamicResponseLayerView;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.response.a.a */
/* compiled from: PG */
public final class C130150a {

    /* renamed from: b */
    private static final C59071e f356847b = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.ui.response.a.a");

    /* renamed from: a */
    public Fragment f356848a;

    /* renamed from: a */
    public final Fragment mo109535a(String str) {
        Fragment fragment = this.f356848a;
        if (fragment == null) {
            ((C59052c) ((C59052c) f356847b.mo56224b()).mo56372aa(38767)).mo56386p("#findFragmentByTag, called when fragment is not active");
            return null;
        }
        Fragment c = fragment.getChildFragmentManager().f634a.mo671c(str);
        if (c == null || !c.isVisible()) {
            return null;
        }
        return c;
    }

    /* renamed from: b */
    public final void mo109536b() {
        Fragment fragment = this.f356848a;
        if (fragment != null) {
            ((DynamicResponseLayerView) fragment.requireView().findViewById(R.id.assistant_response_container)).mo17754z().mo109609b(true);
        }
    }
}
