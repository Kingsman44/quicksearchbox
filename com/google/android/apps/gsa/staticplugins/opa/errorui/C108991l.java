package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.content.Intent;
import android.content.pm.ResolveInfo;
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
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.l */
/* compiled from: PG */
public final class C108991l extends C83907bm {

    /* renamed from: b */
    public C108992m f303073b;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        View.OnClickListener onClickListener;
        OpaPageLayout opaPageLayout = (OpaPageLayout) layoutInflater.inflate(R.layout.error_assist_app, (ViewGroup) null);
        Bundle bundle2 = new Bundle();
        bundle2.putString(":settings:fragment_args_key", "default_assist");
        Intent intent = new Intent("android.settings.VOICE_INPUT_SETTINGS");
        intent.putExtra(":settings:show_fragment_args", bundle2);
        intent.setFlags(268468224);
        List<ResolveInfo> queryIntentActivities = getActivity().getPackageManager().queryIntentActivities(intent, C89885b.S3REQUEST_VALUE);
        boolean z = false;
        if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
            z = true;
        }
        C58976aa aaVar = C58975e.f156826a;
        if (z) {
            onClickListener = new C108989j(this, intent);
            i = R.string.opa_assist_app_screen_button;
        } else {
            onClickListener = new C108990k(this);
            i = R.string.opa_consent_check_error_button;
        }
        HeaderLayout headerLayout = (HeaderLayout) opaPageLayout.f228728c.findViewById(R.id.opa_header);
        C84018m.m133908c(headerLayout.f228718a, C84018m.m133906a(R.string.opa_assist_app_screen_title_more_context, headerLayout), TextView.BufferType.NORMAL, headerLayout);
        C84018m.m133908c(headerLayout.f228719b, C84018m.m133906a(R.string.opa_assist_app_screen_explanation_more_context, headerLayout), TextView.BufferType.NORMAL, headerLayout);
        FooterLayout footerLayout = opaPageLayout.f228726a;
        footerLayout.mo77362c(1);
        Button a = footerLayout.mo77360a();
        a.setText(i);
        a.setOnClickListener(new C89943l(onClickListener));
        return opaPageLayout;
    }

    public final void onResume() {
        super.onResume();
        if (this.f303073b.f303074a.mo17534a()) {
            mo77318iT().mo77312a();
        }
    }
}
