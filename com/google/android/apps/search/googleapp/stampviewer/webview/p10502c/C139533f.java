package com.google.android.apps.search.googleapp.stampviewer.webview.p10502c;

import android.net.Uri;
import android.view.View;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.stampviewer.p10499j.C139435b;
import com.google.android.apps.search.googleapp.urlhandler.C139795f;
import com.google.android.apps.search.googleapp.urlhandler.C139798i;
import com.google.android.apps.search.googleapp.urlhandler.C139823j;
import com.google.android.apps.search.googleapp.urlhandler.C139851q;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56610b;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.webview.c.f */
/* compiled from: PG */
final class C139533f implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C139532e f379369a;

    public C139533f(C139532e eVar) {
        this.f379369a = eVar;
    }

    public final void onClick(View view) {
        C139532e eVar = this.f379369a;
        String str = (String) C139435b.m226584a(eVar.f379365b).map(C139531d.f379363a).orElse(BuildConfig.FLAVOR);
        if (str.length() == 0) {
            C56610b bVar = eVar.f379365b.f379032b;
            if (bVar == null) {
                bVar = C56610b.f151140k;
            }
            Uri parse = Uri.parse(bVar.f151143b);
            str = parse.getScheme() + "://" + parse.getHost();
        }
        C139795f fVar = eVar.f379367d;
        Uri parse2 = Uri.parse(str);
        C139798i iVar = (C139798i) C139823j.f380066m.createBuilder();
        C139851q qVar = C139851q.UNKNOWN;
        iVar.copyOnWrite();
        C139823j jVar = (C139823j) iVar.instance;
        jVar.f380069b = qVar.f380143m;
        jVar.f380068a |= 1;
        fVar.mo115250a(parse2, (C139823j) iVar.build());
    }
}
