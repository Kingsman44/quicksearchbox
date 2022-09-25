package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.news;

import android.view.View;
import androidx.core.p098j.C2043bi;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8641b.p8642a.C115142a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.news.y */
/* compiled from: PG */
public final /* synthetic */ class C115605y implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C115572as f320697a;

    /* renamed from: b */
    public final /* synthetic */ View f320698b;

    public /* synthetic */ C115605y(C115572as asVar, View view) {
        this.f320697a = asVar;
        this.f320698b = view;
    }

    public final void onClick(View view) {
        C115572as asVar = this.f320697a;
        C115142a.m190821e(this.f320698b, asVar.f320585x, 1387);
        C115572as.m191690m(asVar.f320569h);
        C115572as.m191690m(asVar.f320579r);
        C115572as.m191690m(asVar.f320571j);
        asVar.f320570i.setAlpha(0.54f);
        asVar.f320570i.animate().alpha(0.0f).setDuration(400).setListener(new C115561ah(asVar));
        asVar.f320580s.mo47519v(4);
        C2043bi.m5551ae(asVar.f320572k, 0);
        C2043bi.m5551ae(asVar.f320578q, 0);
    }
}
