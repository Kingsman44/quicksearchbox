package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.FooterLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.p7066m.C90053de;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.gh */
/* compiled from: PG */
public final class C108986gh extends C83907bm {

    /* renamed from: b */
    public C86124t f303062b;

    /* renamed from: c */
    public boolean f303063c;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        OpaPageLayout opaPageLayout = new OpaPageLayout(layoutInflater.getContext());
        C28295m.m52919e(opaPageLayout, new C28292j(101924));
        opaPageLayout.mo77370b(R.layout.wakeup_routine_value_prop);
        HeaderLayout headerLayout = (HeaderLayout) opaPageLayout.findViewById(R.id.opa_header);
        if (this.f303062b.mo79746e(C90053de.f248968ah)) {
            C84018m.m133908c(headerLayout.f228718a, C84018m.m133906a(R.string.opa_wakeup_routine_screen_title_v2, headerLayout), TextView.BufferType.NORMAL, headerLayout);
            C84018m.m133908c(headerLayout.f228719b, C84018m.m133906a(R.string.opa_wakeup_routine_screen_message_v2, headerLayout), TextView.BufferType.NORMAL, headerLayout);
        } else {
            C84018m.m133908c(headerLayout.f228718a, C84018m.m133906a(R.string.opa_wakeup_routine_screen_title, headerLayout), TextView.BufferType.NORMAL, headerLayout);
            C84018m.m133908c(headerLayout.f228719b, C84018m.m133906a(R.string.opa_wakeup_routine_screen_message, headerLayout), TextView.BufferType.NORMAL, headerLayout);
        }
        if (this.f303062b.mo79746e(C90053de.f248968ah)) {
            ImageView imageView = (ImageView) opaPageLayout.findViewById(R.id.wakeup_routine_value_prop_screen_image);
            imageView.setImageResource(R.drawable.wakeup_routine_prop_material);
            if (this.f303063c) {
                imageView.setForceDarkAllowed(false);
            }
        }
        FooterLayout footerLayout = opaPageLayout.f228726a;
        footerLayout.mo77362c(1);
        footerLayout.mo77360a().setOnClickListener(new C89943l(new C108985gg(this)));
        return opaPageLayout;
    }
}
