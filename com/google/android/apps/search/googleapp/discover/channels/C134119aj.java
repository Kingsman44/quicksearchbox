package com.google.android.apps.search.googleapp.discover.channels;

import android.net.Uri;
import android.view.View;

/* renamed from: com.google.android.apps.search.googleapp.discover.channels.aj */
/* compiled from: PG */
public final /* synthetic */ class C134119aj implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C134121al f365340a;

    /* renamed from: b */
    public final /* synthetic */ String f365341b;

    public /* synthetic */ C134119aj(C134121al alVar, String str) {
        this.f365340a = alVar;
        this.f365341b = str;
    }

    public final void onClick(View view) {
        this.f365340a.f365359q.mo111465a(Uri.parse(this.f365341b), false);
    }
}
