package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6218v.p6219a;

import android.text.TextUtils;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.p6167b.C78245d;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6218v.C78846b;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.v.a.c */
/* compiled from: PG */
public final /* synthetic */ class C78843c implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C78844d f216987a;

    /* renamed from: b */
    public final /* synthetic */ String f216988b;

    public /* synthetic */ C78843c(C78844d dVar, String str) {
        this.f216987a = dVar;
        this.f216988b = str;
    }

    public final void run() {
        C78844d dVar = this.f216987a;
        String str = this.f216988b;
        if (!TextUtils.isEmpty(str)) {
            C78245d dVar2 = (C78245d) dVar.f216990a.mo76657c();
            if (dVar2.mo73189l()) {
                dVar.mo73647b(C78846b.m126666c(str));
                dVar.mo73648c();
            } else if (dVar2.mo73180b().mo73175h() == 3) {
                dVar.mo73649d(false);
            } else {
                dVar.mo73647b(C78846b.m126666c(str));
            }
        }
    }
}
