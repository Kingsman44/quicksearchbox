package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import android.os.Bundle;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.p6463ui.LegacyOpaStandardPage;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.assistant.p3861at.C50246pz;
import com.google.common.base.C58831av;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.nio.charset.Charset;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.ak */
/* compiled from: PG */
public final class C108549ak extends C83907bm {

    /* renamed from: b */
    public C108556ar f301982b;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C58976aa aaVar = C58975e.f156826a;
        LegacyOpaStandardPage legacyOpaStandardPage = (LegacyOpaStandardPage) layoutInflater.inflate(R.layout.confirm_device, (ViewGroup) null);
        C28295m.m52919e(legacyOpaStandardPage, new C28292j(44735));
        try {
            legacyOpaStandardPage.f228724c.f228893p.loadData(Base64.encodeToString(((C50246pz) C62942bv.parseFrom((C62942bv) C50246pz.f130660d, (byte[]) C58838bb.m90866a(((Bundle) C58831av.m90830c(getArguments(), Bundle.EMPTY)).getByteArray("confirmation-ui"), "Must call setArguments(Bundle)"), C62921ba.m95368a())).f130664c.getBytes(Charset.forName("UTF-8")), 2), "text/html", "base64");
            legacyOpaStandardPage.f228724c.mo77494d(5, true);
            legacyOpaStandardPage.f228725d.mo77360a().setText(getString(R.string.device_setup_confirmation_code_matches_button));
            legacyOpaStandardPage.f228725d.mo77360a().setOnClickListener(new C89943l(new C108547ai(this)));
            legacyOpaStandardPage.f228725d.mo77361b().setText(getString(R.string.device_setup_confirmation_code_does_not_match_button));
            legacyOpaStandardPage.f228725d.mo77361b().setOnClickListener(new C89943l(new C108548aj(this)));
            return legacyOpaStandardPage;
        } catch (C62974ct e) {
            throw new IllegalArgumentException("Could not deserialize LinkDeviceConfirmationUi", e);
        }
    }
}
