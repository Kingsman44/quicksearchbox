package com.google.android.apps.gsa.opaonboarding.p6463ui;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.googlequicksearchbox.R;
import com.google.android.setupcompat.p3549a.C45238a;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.android.setupcompat.p3549a.C45241d;
import com.google.android.setupdesign.view.IllustrationVideoView;

/* renamed from: com.google.android.apps.gsa.opaonboarding.ui.p */
/* compiled from: PG */
public class C84021p extends C83907bm {
    /* renamed from: e */
    public void mo77485e() {
        mo77318iT().mo77312a();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        C45241d f = C45240c.m80574e(context).mo49102f(context, C45238a.CONFIG_PROGRESS_ILLUSTRATION_DEFAULT);
        if (f != null) {
            OpaPageLayout opaPageLayout = new OpaPageLayout(context);
            opaPageLayout.mo77370b(R.layout.glif_v3_loading);
            HeaderLayout headerLayout = (HeaderLayout) opaPageLayout.findViewById(R.id.opa_header);
            C84018m.m133908c(headerLayout.f228718a, C84018m.m133906a(R.string.onboarding_loading_content, headerLayout), TextView.BufferType.NORMAL, headerLayout);
            opaPageLayout.findViewById(R.id.progress_bar).setVisibility(8);
            IllustrationVideoView illustrationVideoView = (IllustrationVideoView) opaPageLayout.findViewById(R.id.illustration_video_view);
            illustrationVideoView.setVisibility(0);
            illustrationVideoView.mo49265c(f.f118174c, f.f118172a);
            return opaPageLayout;
        }
        OpaPageLayout opaPageLayout2 = new OpaPageLayout(getContext());
        opaPageLayout2.mo77370b(R.layout.glif_v3_loading);
        HeaderLayout headerLayout2 = (HeaderLayout) opaPageLayout2.findViewById(R.id.opa_header);
        C84018m.m133908c(headerLayout2.f228718a, C84018m.m133906a(R.string.onboarding_loading_title, headerLayout2), TextView.BufferType.NORMAL, headerLayout2);
        C84018m.m133908c(headerLayout2.f228719b, C84018m.m133906a(R.string.onboarding_loading_content, headerLayout2), TextView.BufferType.NORMAL, headerLayout2);
        return opaPageLayout2;
    }
}
