package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90053de;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.es */
/* compiled from: PG */
public final class C108943es extends C83907bm {

    /* renamed from: d */
    private static final C59071e f302970d = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.errorui.es");

    /* renamed from: b */
    public C86124t f302971b;

    /* renamed from: c */
    public SharedPreferences f302972c;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10000) {
            mo77318iT().mo77312a();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f302972c.edit().putInt("opa_subscription_in_oobe_seen_count", this.f302972c.getInt("opa_subscription_in_oobe_seen_count", 0) + 1).apply();
        ((C59052c) ((C59052c) f302970d.mo56224b()).mo56372aa(24459)).mo56386p("Starting Onboarding Web Activity.");
        Intent className = new Intent().setClassName(getContext(), "com.google.android.apps.search.assistant.surfaces.onboarding.web.OnboardingWebActivity");
        className.setData(Uri.parse(this.f302971b.mo79758x(C90053de.f248951R)));
        className.putExtra("intent_extra_orientation_mode", getActivity().getRequestedOrientation());
        className.putExtra("intent_extra_additional_ve", 119080);
        startActivityForResult(className, 10000);
    }
}
