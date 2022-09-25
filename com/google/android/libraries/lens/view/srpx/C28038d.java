package com.google.android.libraries.lens.view.srpx;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.libraries.web.contrib.requestblock.C43721h;
import com.google.android.libraries.web.p3353c.C43367l;

/* renamed from: com.google.android.libraries.lens.view.srpx.d */
/* compiled from: PG */
public final /* synthetic */ class C28038d implements C43721h {

    /* renamed from: a */
    public final /* synthetic */ C28041g f76313a;

    public /* synthetic */ C28038d(C28041g gVar) {
        this.f76313a = gVar;
    }

    /* renamed from: a */
    public final boolean mo30517a(C43367l lVar) {
        C28041g gVar = this.f76313a;
        if (!lVar.f113298d) {
            return false;
        }
        Uri parse = Uri.parse(lVar.f113297c);
        Uri parse2 = Uri.parse(lVar.f113296b);
        if (!gVar.f76317b.mo33500e(parse) || !gVar.f76317b.mo33500e(parse2)) {
            return false;
        }
        boolean equals = TextUtils.equals(C28045k.m52256b(parse), C28045k.m52256b(parse2));
        int i = LensRequestBlockObserver.f76282a;
        return equals;
    }
}
