package com.google.android.libraries.web.contrib.p3358b.p3359a;

import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.web.contrib.p3358b.C43387a;

/* renamed from: com.google.android.libraries.web.contrib.b.a.c */
/* compiled from: PG */
final class C43390c implements C43387a {

    /* renamed from: a */
    final /* synthetic */ C43391d f113367a;

    public C43390c(C43391d dVar) {
        this.f113367a = dVar;
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
        if (!this.f113367a.f113370c.mo46337f()) {
            this.f113367a.f113369b.requireActivity().finish();
        }
    }
}
