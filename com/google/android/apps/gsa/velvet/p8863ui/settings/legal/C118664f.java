package com.google.android.apps.gsa.velvet.p8863ui.settings.legal;

import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.android.libraries.social.licenses.C41958f;
import com.google.android.libraries.social.licenses.License;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.velvet.ui.settings.legal.f */
/* compiled from: PG */
public final /* synthetic */ class C118664f implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C118669k f331038a;

    public /* synthetic */ C118664f(C118669k kVar) {
        this.f331038a = kVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C118669k kVar = this.f331038a;
        ArrayList<License> c = C41958f.m73472c(kVar.f331045b);
        List<License> a = kVar.f331048e.mo95126a();
        if (!a.isEmpty()) {
            HashSet hashSet = new HashSet();
            for (License license : c) {
                hashSet.add(license.f109503a);
            }
            for (License license2 : a) {
                if (hashSet.add(license2.f109503a)) {
                    c.add(license2);
                }
            }
            Collections.sort(c);
        }
        return c;
    }
}
