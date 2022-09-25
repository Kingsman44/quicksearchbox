package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.LegacyOpaStandardPage;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58833ax;
import com.google.common.base.C58837ba;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.bu */
/* compiled from: PG */
public final class C96117bu extends C96363kx {
    /* renamed from: g */
    private final String m159417g(String str) {
        Bundle arguments = getArguments();
        if (arguments == null) {
            return null;
        }
        return arguments.getString(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    /* renamed from: e */
    public final String mo89934e() {
        return "Custom";
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LegacyOpaStandardPage legacyOpaStandardPage = (LegacyOpaStandardPage) layoutInflater.inflate(R.layout.intro, (ViewGroup) null);
        String g = C58837ba.m90858g(m159417g("title"));
        HeaderLayout headerLayout = legacyOpaStandardPage.f228723b;
        C84018m.m133908c(headerLayout.f228718a, g, TextView.BufferType.NORMAL, headerLayout);
        String g2 = m159417g("message");
        HeaderLayout headerLayout2 = legacyOpaStandardPage.f228723b;
        C84018m.m133908c(headerLayout2.f228719b, C58837ba.m90858g(g2), TextView.BufferType.NORMAL, headerLayout2);
        String g3 = m159417g("url");
        String g4 = m159417g("url_description");
        if (g3 != null) {
            new C96153dc(legacyOpaStandardPage, (C68214a) null, 0).mo89991a(legacyOpaStandardPage.f228724c.f228893p, g3, C58833ax.m90833j(g4));
        }
        legacyOpaStandardPage.f228725d.mo77360a().setOnClickListener(new C89943l(new C96116bt(this)));
        return legacyOpaStandardPage;
    }
}
