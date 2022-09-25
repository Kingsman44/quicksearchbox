package com.google.android.apps.gsa.staticplugins.p7388al;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.FooterLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.al.aa */
/* compiled from: PG */
public final class C93924aa extends C83907bm {

    /* renamed from: b */
    public C93946t f262293b;

    /* renamed from: c */
    public C89859i f262294c;

    /* renamed from: d */
    public boolean f262295d;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        OpaPageLayout opaPageLayout = (OpaPageLayout) layoutInflater.inflate(R.layout.no_device_found, (ViewGroup) null);
        HeaderLayout headerLayout = (HeaderLayout) opaPageLayout.f228728c.findViewById(R.id.opa_header);
        Bundle arguments = getArguments();
        String string = arguments.getString("WifiName");
        if (string != null) {
            C84018m.m133908c(headerLayout.f228718a, C84018m.m133906a(R.string.devices_not_found_title, headerLayout), TextView.BufferType.NORMAL, headerLayout);
            C84018m.m133908c(headerLayout.f228719b, getContext().getString(R.string.devices_not_found_explanation, new Object[]{string}), TextView.BufferType.NORMAL, headerLayout);
        } else {
            C84018m.m133908c(headerLayout.f228718a, C84018m.m133906a(R.string.no_wifi_connection_title, headerLayout), TextView.BufferType.NORMAL, headerLayout);
            C84018m.m133908c(headerLayout.f228719b, C84018m.m133906a(R.string.no_wifi_connection_explanation, headerLayout), TextView.BufferType.NORMAL, headerLayout);
        }
        FooterLayout footerLayout = opaPageLayout.f228726a;
        footerLayout.mo77362c(2);
        Button a = footerLayout.mo77360a();
        a.setText(R.string.devices_not_found_action_button);
        a.setOnClickListener(new C93951y(this));
        int i = true != arguments.getBoolean("is_in_custodio_flow") ? R.string.devices_scan_cancel_button : R.string.device_select_parental_controls_skip_button;
        Button b = footerLayout.mo77361b();
        b.setText(i);
        b.setOnClickListener(new C93952z(this));
        return opaPageLayout;
    }

    public final void onDestroy() {
        super.onDestroy();
        if (!this.f262295d) {
            this.f262294c.mo83702b(C89849ae.FACE_MATCH_DEVICE_SCAN_SCREEN_EXIT);
            this.f262294c.mo83702b(C89849ae.VOICE_MATCH_FACE_MATCH_ENROLLMENT_DEVICE_SCAN_EXIT_WITH_NO_SUPPORTED_DEVICE_FOUND);
        }
    }
}
