package com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9736c;

import android.view.View;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9736c.p9738b.C128583a;
import com.google.android.libraries.search.p6glow.C39872c;
import com.google.android.libraries.search.p6glow.C39882m;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.shared.ui.c.l */
/* compiled from: PG */
final class C128594l implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C128593k f353573a;

    public C128594l(C128593k kVar) {
        this.f353573a = kVar;
    }

    public final void onClick(View view) {
        C128593k kVar = this.f353573a;
        C69664n.m101061g(view, "view");
        C39882m mVar = kVar.f353566c;
        if ((mVar != null ? mVar.mo42062a() : null) != C39872c.GONE) {
            kVar.f353565b.mo108811c(view);
            C39882m mVar2 = kVar.f353566c;
            if (mVar2 != null) {
                mVar2.mo42063b(C39872c.GONE);
            }
            C47393f.m84237h(new C128583a(), view);
        }
    }
}
