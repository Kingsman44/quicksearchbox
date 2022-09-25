package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.gsa.assistant.settings.shared.ai;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C83958a;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84010e;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84011f;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84012g;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.s */
/* compiled from: PG */
public final class C108998s extends C83907bm {

    /* renamed from: b */
    public boolean f303090b = false;

    /* renamed from: c */
    public C86124t f303091c;

    /* renamed from: d */
    public ai f303092d;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        OpaPageLayout opaPageLayout = new OpaPageLayout(layoutInflater.getContext());
        C28295m.m52919e(opaPageLayout, new C28292j(117673));
        opaPageLayout.mo77370b(R.layout.error_chathead_optin);
        HeaderLayout headerLayout = (HeaderLayout) opaPageLayout.findViewById(R.id.opa_header);
        String x = this.f303091c.mo79758x(C90037cp.f248626v);
        String x2 = this.f303091c.mo79758x(C90037cp.f248627w);
        C84018m.m133908c(headerLayout.f228718a, x, TextView.BufferType.NORMAL, headerLayout);
        ((TextView) opaPageLayout.findViewById(R.id.opa_illustration)).setText(x2);
        C84012g a = opaPageLayout.mo77369a();
        a.mo77475d(2);
        C84010e e = C84011f.m133882e();
        e.mo77375c(getText(R.string.opa_add_shortcut_optin_screen_allow_button_text));
        ((C83958a) e).f228734b = new C89943l(new C108996q(this));
        a.mo77472a(e.mo77373a());
        C84010e e2 = C84011f.m133882e();
        e2.mo77375c(getText(R.string.opa_add_shortcut_optin_screen_disallow_button_text));
        ((C83958a) e2).f228734b = new C89943l(new C108997r(this));
        a.mo77473b(e2.mo77373a());
        return opaPageLayout;
    }
}
