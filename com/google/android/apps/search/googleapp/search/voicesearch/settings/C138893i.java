package com.google.android.apps.search.googleapp.search.voicesearch.settings;

import android.view.View;
import com.google.android.apps.search.googleapp.search.voicesearch.settings.C138889f;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.settings.i */
/* compiled from: PG */
final class C138893i implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C138889f f377791a;

    /* renamed from: b */
    final /* synthetic */ C138892h f377792b;

    public C138893i(C138889f fVar, C138892h hVar) {
        this.f377791a = fVar;
        this.f377792b = hVar;
    }

    public final void onClick(View view) {
        this.f377791a.f377780b.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
        C47393f.m84237h(new C138889f.C138890a(((C138891g) this.f377791a.f377779a.get(this.f377792b.getBindingAdapterPosition())).f377786b), view);
    }
}
