package com.google.android.libraries.lens.view.srpx;

import android.net.Uri;
import com.google.android.libraries.web.contrib.requestblock.C43721h;
import com.google.android.libraries.web.p3353c.C43367l;

/* renamed from: com.google.android.libraries.lens.view.srpx.b */
/* compiled from: PG */
public final /* synthetic */ class C28034b implements C43721h {

    /* renamed from: a */
    public final /* synthetic */ C28041g f76305a;

    public /* synthetic */ C28034b(C28041g gVar) {
        this.f76305a = gVar;
    }

    /* renamed from: a */
    public final boolean mo30517a(C43367l lVar) {
        C28041g gVar = this.f76305a;
        Uri parse = Uri.parse(lVar.f113296b);
        boolean f = C28045k.m52258f(parse);
        if (f) {
            gVar.f76316a = parse.getQueryParameter("continue");
        }
        int i = LensRequestBlockObserver.f76282a;
        return f;
    }
}
