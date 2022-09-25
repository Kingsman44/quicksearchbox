package com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9736c;

import android.view.View;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9736c.p9738b.C128584b;
import com.google.android.libraries.animation.C147785k;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.shared.ui.c.m */
/* compiled from: PG */
final class C128595m implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C128593k f353574a;

    public C128595m(C128593k kVar) {
        this.f353574a = kVar;
    }

    public final void onClick(View view) {
        C128593k kVar = this.f353574a;
        C69664n.m101061g(view, "view");
        C147785k kVar2 = kVar.f353567d;
        if ((kVar2 == null || !kVar2.mo124462d()) && view.getVisibility() != 4) {
            kVar.f353565b.mo108811c(view);
            kVar.mo108533c();
            C47393f.m84237h(new C128584b(), view);
        }
    }
}
