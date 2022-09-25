package com.google.android.libraries.lens.view.srpx;

import android.net.Uri;
import com.google.android.libraries.web.contrib.requestblock.C43721h;
import com.google.android.libraries.web.p3353c.C43367l;

/* renamed from: com.google.android.libraries.lens.view.srpx.c */
/* compiled from: PG */
public final /* synthetic */ class C28037c implements C43721h {

    /* renamed from: a */
    public final /* synthetic */ C28041g f76312a;

    public /* synthetic */ C28037c(C28041g gVar) {
        this.f76312a = gVar;
    }

    /* renamed from: a */
    public final boolean mo30517a(C43367l lVar) {
        C28041g gVar = this.f76312a;
        Uri parse = Uri.parse(lVar.f113296b);
        return gVar.f76317b.mo33500e(parse) && parse.getQueryParameter("google_abuse") != null;
    }
}
