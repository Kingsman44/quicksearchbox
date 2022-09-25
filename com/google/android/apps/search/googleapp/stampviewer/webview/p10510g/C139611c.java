package com.google.android.apps.search.googleapp.stampviewer.webview.p10510g;

import android.net.Uri;
import android.view.View;
import com.google.android.apps.search.googleapp.saves.savefeature.p10397b.C137282a;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3712c.C47709i;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56610b;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.webview.g.c */
/* compiled from: PG */
public final /* synthetic */ class C139611c implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C139612d f379509a;

    public /* synthetic */ C139611c(C139612d dVar) {
        this.f379509a = dVar;
    }

    public final void onClick(View view) {
        C139612d dVar = this.f379509a;
        dVar.f379514e.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
        String str = dVar.f379518i.mo46468a().f113334g;
        C56610b bVar = dVar.f379511b.f379032b;
        if (bVar == null) {
            bVar = C56610b.f151140k;
        }
        C47709i.m84861a(dVar.f379512c, C137282a.m223048b(str, Uri.parse(bVar.f151143b), 6, dVar.f379513d));
    }
}
