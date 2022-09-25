package com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.p10280f;

import android.net.Uri;
import android.view.View;
import com.google.android.apps.search.googleapp.saves.savefeature.p10397b.C137282a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.web.contrib.p3358b.C43387a;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.f.d */
/* compiled from: PG */
final class C135685d implements C43387a {

    /* renamed from: a */
    final /* synthetic */ C135682c f369591a;

    public C135685d(C135682c cVar) {
        this.f369591a = cVar;
    }

    /* renamed from: a */
    public final int mo46485a() {
        return R.string.gab_actionbutton_save;
    }

    /* renamed from: b */
    public final int mo46486b() {
        return R.drawable.quantum_gm_ic_bookmark_border_vd_theme_24;
    }

    /* renamed from: c */
    public final int mo46487c() {
        return R.id.googleapp_browser_actionbutton_save;
    }

    /* renamed from: d */
    public final int mo46488d() {
        return 88689;
    }

    /* renamed from: e */
    public final void mo46489e(View view, C28439i iVar) {
        this.f369591a.f369583d.startActivity(C137282a.m223048b(this.f369591a.f369585f.mo46468a().f113334g, Uri.parse(this.f369591a.f369585f.mo46468a().f113329b), 5, this.f369591a.f369581b));
    }
}
