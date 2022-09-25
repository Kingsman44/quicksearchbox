package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.assistant.p510b.p511a.C9439b;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.libraries.assistant.p1535p.C18509a;
import com.google.android.libraries.assistant.p1535p.C18522b;
import com.google.android.libraries.assistant.p1535p.C18523c;
import com.google.common.base.C58831av;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.bs */
/* compiled from: PG */
public final class C108862bs extends C83907bm {
    /* renamed from: e */
    private static C9439b m181072e(Bundle bundle) {
        return C9439b.m23955a(((Bundle) C58831av.m90830c(bundle, Bundle.EMPTY)).getInt("enrollment_entry_id", 0));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 10005) {
            return;
        }
        if (i2 == -1) {
            mo77318iT().mo77312a();
        } else {
            getActivity().finish();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m181072e(getArguments());
        C18509a c = C18522b.m35986c();
        ((C18523c) c).f52492a = "lockscreen_consent";
        c.mo24023e(true != (m181072e(getArguments()).f32835aq == 74 || m181072e(getArguments()).f32835aq == 18) ? "assistant_lockscreen_notification" : "assistant_blocking_oobe");
        startActivityForResult(c.mo24020b().mo24031a(), 10005);
    }
}
