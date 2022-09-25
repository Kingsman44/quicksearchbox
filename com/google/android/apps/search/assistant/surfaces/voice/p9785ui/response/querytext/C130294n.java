package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.querytext;

import android.view.View;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.utils.C130303a;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.response.querytext.n */
/* compiled from: PG */
final class C130294n implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C130293m f357159a;

    public C130294n(C130293m mVar) {
        this.f357159a = mVar;
    }

    public final void onClick(View view) {
        C130293m mVar = this.f357159a;
        if (mVar.f357157i) {
            mVar.f357157i = false;
            return;
        }
        mVar.f357155g.mo108811c(view);
        C47393f.m84237h(new C130303a(mVar.mo109628b().toString()), view);
    }
}
