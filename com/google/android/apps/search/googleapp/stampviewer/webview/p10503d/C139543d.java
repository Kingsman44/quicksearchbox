package com.google.android.apps.search.googleapp.stampviewer.webview.p10503d;

import android.view.View;
import com.google.android.apps.search.googleapp.stampviewer.p10490d.C139377c;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56610b;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.webview.d.d */
/* compiled from: PG */
public final /* synthetic */ class C139543d implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C139544e f379383a;

    public /* synthetic */ C139543d(C139544e eVar) {
        this.f379383a = eVar;
    }

    public final void onClick(View view) {
        C139544e eVar = this.f379383a;
        eVar.f379385b.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
        C139377c cVar = eVar.f379390g;
        C56610b bVar = eVar.f379388e.f379032b;
        if (bVar == null) {
            bVar = C56610b.f151140k;
        }
        C60870cx c = cVar.mo114938c(bVar.f151143b);
        Object[] objArr = new Object[1];
        C56610b bVar2 = eVar.f379388e.f379032b;
        if (bVar2 == null) {
            bVar2 = C56610b.f151140k;
        }
        objArr[0] = bVar2.f151143b;
        C46459k.m82829b(c, "Cannot create an un-heart reaction for story with URL: %s", objArr);
    }
}
