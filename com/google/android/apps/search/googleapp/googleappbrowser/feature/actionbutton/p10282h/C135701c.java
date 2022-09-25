package com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.p10282h;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.google.android.apps.search.googleapp.amp.p10138a.C133456e;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.web.contrib.p3358b.C43387a;
import com.google.android.libraries.web.p3353c.C43367l;
import com.google.android.libraries.web.p3353c.C43376u;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3712c.C47709i;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.h.c */
/* compiled from: PG */
final class C135701c implements C43387a {

    /* renamed from: a */
    final /* synthetic */ C135702d f369639a;

    public C135701c(C135702d dVar) {
        this.f369639a = dVar;
    }

    /* renamed from: a */
    public final int mo46485a() {
        return R.string.googleapp_browser_share_url;
    }

    /* renamed from: b */
    public final int mo46486b() {
        return R.drawable.quantum_gm_ic_share_vd_theme_24;
    }

    /* renamed from: c */
    public final int mo46487c() {
        return R.id.googleapp_browser_share_url_action_button;
    }

    /* renamed from: d */
    public final int mo46488d() {
        return 80192;
    }

    /* renamed from: e */
    public final void mo46489e(View view, C28439i iVar) {
        Intent intent;
        C43376u a = this.f369639a.f369646g.mo46468a();
        C135702d dVar = this.f369639a;
        if (!dVar.f369641b) {
            intent = dVar.f369644e.mo47065a(a);
        } else {
            String str = a.f113329b;
            if (str.isEmpty()) {
                C43367l lVar = a.f113335h;
                if (lVar == null) {
                    lVar = C43367l.f113293h;
                }
                str = lVar.f113296b;
            }
            if (!str.isEmpty()) {
                Uri parse = Uri.parse(str);
                intent = dVar.f369644e.mo47066b((Uri) C133456e.m216615b(parse).orElse(parse), a.f113334g);
            } else {
                ((C59052c) ((C59052c) C135702d.f369640a.mo56226d()).mo56372aa(40594)).mo56386p("Cannot share an empty URL.");
                throw new IllegalStateException("Cannot share an empty URL.");
            }
        }
        intent.addFlags(536870912);
        C47709i.m84861a(this.f369639a.f369643d, intent);
    }
}
