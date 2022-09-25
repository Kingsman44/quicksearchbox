package com.google.android.apps.search.weather.suggestions;

import android.view.View;
import com.google.android.apps.search.weather.suggestions.p10695b.C142133a;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.p5269w.p5270a.C67962d;

/* renamed from: com.google.android.apps.search.weather.suggestions.a */
/* compiled from: PG */
public final /* synthetic */ class C142123a implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C142132b f385573a;

    /* renamed from: b */
    public final /* synthetic */ C67962d f385574b;

    public /* synthetic */ C142123a(C142132b bVar, C67962d dVar) {
        this.f385573a = bVar;
        this.f385574b = dVar;
    }

    public final void onClick(View view) {
        C142132b bVar = this.f385573a;
        C67962d dVar = this.f385574b;
        bVar.f385590e.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
        C47393f.m84237h(new C142133a(dVar), view);
    }
}
