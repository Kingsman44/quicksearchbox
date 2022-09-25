package com.google.android.libraries.lens.view.gallery.p2111d;

import android.view.View;
import com.google.android.libraries.lens.view.p2078at.C25512ar;
import com.google.android.libraries.lens.view.p2078at.C25534q;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;

/* renamed from: com.google.android.libraries.lens.view.gallery.d.t */
/* compiled from: PG */
public final /* synthetic */ class C26374t implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C28443m f71742a;

    /* renamed from: b */
    public final /* synthetic */ boolean f71743b;

    public /* synthetic */ C26374t(C28443m mVar, boolean z) {
        this.f71742a = mVar;
        this.f71743b = z;
    }

    public final void onClick(View view) {
        C28443m mVar = this.f71742a;
        boolean z = this.f71743b;
        mVar.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
        if (z) {
            C47393f.m84237h(new C25512ar(), view);
        } else {
            C47393f.m84237h(new C25534q(150901), view);
        }
    }
}
