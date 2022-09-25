package com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.p10274b;

import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.web.contrib.p3358b.C43387a;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.b.e */
/* compiled from: PG */
final class C135623e implements C43387a {

    /* renamed from: a */
    final /* synthetic */ C135624f f369429a;

    public C135623e(C135624f fVar) {
        this.f369429a = fVar;
    }

    /* renamed from: a */
    public final int mo46485a() {
        return R.string.webx_back_button_label;
    }

    /* renamed from: b */
    public final int mo46486b() {
        return R.drawable.quantum_gm_ic_arrow_back_vd_theme_24;
    }

    /* renamed from: c */
    public final int mo46487c() {
        return R.id.webx_back_action_button;
    }

    /* renamed from: d */
    public final int mo46488d() {
        return 100501;
    }

    /* renamed from: e */
    public final void mo46489e(View view, C28439i iVar) {
        if (this.f369429a.f369433d.mo110979b() || this.f369429a.f369434e.mo112949a()) {
            C47393f.m84236g(new C135619a(), this.f369429a.f369431b);
        } else if (this.f369429a.f369432c.mo46337f()) {
            this.f369429a.f369435f.mo112392a(2);
        } else {
            this.f369429a.f369435f.mo112392a(1);
            this.f369429a.f369431b.requireActivity().finish();
        }
    }
}
