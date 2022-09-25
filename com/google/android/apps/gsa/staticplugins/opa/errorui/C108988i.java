package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
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
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.i */
/* compiled from: PG */
public final class C108988i extends C83907bm {

    /* renamed from: b */
    public boolean f303065b = false;

    /* renamed from: c */
    public C86124t f303066c;

    /* renamed from: d */
    public SharedPreferences f303067d;

    /* renamed from: e */
    public C108899db f303068e;

    /* renamed from: f */
    public C68214a f303069f;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    /* renamed from: e */
    public final void mo97348e() {
        this.f303067d.edit().putInt("opa_add_shortcut_screen_seen_count", this.f303067d.getInt("opa_add_shortcut_screen_seen_count", 0) + 1).apply();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        OpaPageLayout opaPageLayout = new OpaPageLayout(layoutInflater.getContext());
        C28295m.m52919e(opaPageLayout, new C28292j(97087));
        opaPageLayout.mo77370b(R.layout.error_add_shortcut);
        HeaderLayout headerLayout = (HeaderLayout) opaPageLayout.findViewById(R.id.opa_header);
        C84018m.m133908c(headerLayout.f228718a, C84018m.m133906a(R.string.opa_add_shortcut_screen_title, headerLayout), TextView.BufferType.NORMAL, headerLayout);
        C84012g a = opaPageLayout.mo77369a();
        a.mo77475d(2);
        C84010e e = C84011f.m133882e();
        e.mo77375c(getText(R.string.opa_add_shortcut_optin_screen_allow_button_text));
        ((C83958a) e).f228734b = new C89943l(new C108978g(this));
        a.mo77472a(e.mo77373a());
        C84010e e2 = C84011f.m133882e();
        e2.mo77375c(getText(R.string.opa_add_shortcut_optin_screen_disallow_button_text));
        ((C83958a) e2).f228734b = new C89943l(new C108987h(this));
        a.mo77473b(e2.mo77373a());
        if (!this.f303066c.mo79746e(C90037cp.f248439aT)) {
            mo97348e();
        }
        return opaPageLayout;
    }
}
