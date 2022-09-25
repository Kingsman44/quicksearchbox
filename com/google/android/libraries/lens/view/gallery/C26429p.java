package com.google.android.libraries.lens.view.gallery;

import android.view.View;
import com.google.android.libraries.lens.view.gallery.p2111d.C26363i;
import com.google.android.libraries.lens.view.p2078at.C25512ar;
import com.google.android.libraries.lens.view.p2078at.C25534q;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;

/* renamed from: com.google.android.libraries.lens.view.gallery.p */
/* compiled from: PG */
public final /* synthetic */ class C26429p implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C26299ac f71917a;

    public /* synthetic */ C26429p(C26299ac acVar) {
        this.f71917a = acVar;
    }

    public final void onClick(View view) {
        C26299ac acVar = this.f71917a;
        acVar.f71498f.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
        C26363i iVar = acVar.f71469A;
        if (iVar == null || iVar.mo31555b()) {
            C47393f.m84237h(new C25534q(152482), view);
        } else {
            C47393f.m84237h(new C25512ar(), view);
        }
    }
}
