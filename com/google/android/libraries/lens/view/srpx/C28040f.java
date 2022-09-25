package com.google.android.libraries.lens.view.srpx;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.libraries.web.contrib.requestblock.C43721h;
import com.google.android.libraries.web.p3353c.C43367l;

/* renamed from: com.google.android.libraries.lens.view.srpx.f */
/* compiled from: PG */
public final /* synthetic */ class C28040f implements C43721h {

    /* renamed from: a */
    public final /* synthetic */ C28041g f76315a;

    public /* synthetic */ C28040f(C28041g gVar) {
        this.f76315a = gVar;
    }

    /* renamed from: a */
    public final boolean mo30517a(C43367l lVar) {
        C28041g gVar = this.f76315a;
        boolean z = false;
        if (gVar.f76317b.mo33500e(Uri.parse(lVar.f113296b)) && TextUtils.equals(gVar.f76316a, lVar.f113296b)) {
            z = true;
        }
        int i = LensRequestBlockObserver.f76282a;
        if (z) {
            gVar.f76316a = null;
        }
        return z;
    }
}
