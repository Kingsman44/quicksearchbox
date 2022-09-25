package com.google.android.apps.gsa.staticplugins.opa.samson.charging.p8427c;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.assistant.settings.shared.h;
import com.google.android.apps.gsa.assistant.shared.v;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.p6461c.C83912c;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.FooterLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.util.p7184t.C91093c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.android.libraries.search.assistant.p2786t.p2801d.p2802a.C36619a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.charging.c.r */
/* compiled from: PG */
public final class C110080r extends C83907bm {

    /* renamed from: b */
    public static final C59071e f306691b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.samson.charging.c.r");

    /* renamed from: c */
    public Context f306692c;

    /* renamed from: d */
    public C91093c f306693d;

    /* renamed from: e */
    public C83912c f306694e;

    /* renamed from: f */
    public h f306695f;

    /* renamed from: g */
    public v f306696g;

    /* renamed from: h */
    public boolean f306697h;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        OpaPageLayout opaPageLayout = (OpaPageLayout) layoutInflater.inflate(R.layout.charging_mode_notification, (ViewGroup) null);
        C28295m.m52919e(opaPageLayout, new C28292j(78194));
        FooterLayout footerLayout = opaPageLayout.f228726a;
        footerLayout.mo77362c(2);
        C84018m.m133907b(footerLayout.mo77361b(), R.string.charging_mode_intro_decline, footerLayout);
        C84018m.m133907b(footerLayout.mo77360a(), R.string.charging_mode_notification_cta, footerLayout);
        this.f306697h = getArguments().getBoolean("key_track_opt_out", false);
        footerLayout.mo77361b().setOnClickListener(new C89943l(new C110078p(this)));
        footerLayout.mo77360a().setOnClickListener(new C89943l(new C110079q(this)));
        return opaPageLayout;
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f306694e.mo77328b(new C110077o(this));
    }

    public final void onResume() {
        super.onResume();
        this.f306694e.mo77328b(new C110077o(this));
        if (C36619a.m65148d(this.f306692c)) {
            C59104x b = f306691b.mo56224b();
            b.mo56378ag(C58975e.f156826a, "ChAmNotFragment");
            ((C59052c) ((C59052c) b).mo56372aa(25668)).mo56386p("Already have permission, exiting.");
            mo77318iT().mo77312a();
        }
    }
}
