package com.google.android.apps.search.googleapp.search.suggest.p10464ui.viewbinders;

import android.net.Uri;
import android.view.View;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b.C138581f;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.viewbinders.z */
/* compiled from: PG */
public final /* synthetic */ class C138673z implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C138622aa f377178a;

    /* renamed from: b */
    public final /* synthetic */ View f377179b;

    public /* synthetic */ C138673z(C138622aa aaVar, View view) {
        this.f377178a = aaVar;
        this.f377179b = view;
    }

    public final void onClick(View view) {
        C138622aa aaVar = this.f377178a;
        View view2 = this.f377179b;
        aaVar.f377005a.f375618b++;
        C47393f.m84237h(new C138581f(Uri.parse("https://myactivity.google.com/product/search?utm_source=agsa-searchbox&utm_medium=btn&utm_campaign=15")), view2);
    }
}
