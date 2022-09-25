package com.google.android.libraries.web.weblayer.contrib.p3457e;

import org.chromium.weblayer.C72602bk;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.web.weblayer.contrib.e.g */
/* compiled from: PG */
final class C44200g extends C72602bk {

    /* renamed from: a */
    final /* synthetic */ C44201h f114978a;

    public C44200g(C44201h hVar) {
        this.f114978a = hVar;
    }

    /* renamed from: b */
    public final void mo47132b(int i, float f) {
        C44201h hVar = this.f114978a;
        if (i == 0) {
            Collection.EL.stream(hVar.f114979a).forEach(new C44198e(f));
        } else if (i == 1) {
            Collection.EL.stream(hVar.f114979a).forEach(new C44199f(f));
        }
    }
}
