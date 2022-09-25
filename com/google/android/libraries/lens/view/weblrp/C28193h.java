package com.google.android.libraries.lens.view.weblrp;

import com.google.android.libraries.lens.view.infopanel.p2138a.C26968d;
import com.google.android.libraries.lens.view.infopanel.p2142c.C27079f;
import com.google.android.libraries.web.contrib.p3389i.C43627a;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;

/* renamed from: com.google.android.libraries.lens.view.weblrp.h */
/* compiled from: PG */
public final /* synthetic */ class C28193h implements C43627a {

    /* renamed from: a */
    public final /* synthetic */ C28195j f76725a;

    public /* synthetic */ C28193h(C28195j jVar) {
        this.f76725a = jVar;
    }

    /* renamed from: a */
    public final void mo33711a(int i) {
        C28195j jVar = this.f76725a;
        boolean z = false;
        if (jVar.f76751y) {
            if (i != 0) {
                return;
            }
        } else if (i <= 0) {
            return;
        } else {
            if (i > 0) {
                z = true;
            }
        }
        jVar.f76751y = z;
        if (!z || jVar.f76735i.mo32435a() != C26968d.OPEN) {
            C47393f.m84236g(new C27079f(z), jVar.f76734h);
        }
    }
}
