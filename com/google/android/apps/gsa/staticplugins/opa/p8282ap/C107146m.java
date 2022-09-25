package com.google.android.apps.gsa.staticplugins.opa.p8282ap;

import android.content.Context;
import android.widget.Toast;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ap.m */
/* compiled from: PG */
public final /* synthetic */ class C107146m implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C107156w f298252a;

    public /* synthetic */ C107146m(C107156w wVar) {
        this.f298252a = wVar;
    }

    public final void run() {
        Context context = this.f298252a.f298273c;
        Toast.makeText(context, context.getString(R.string.photo_downloading_error_toast_text), 0).show();
    }
}
