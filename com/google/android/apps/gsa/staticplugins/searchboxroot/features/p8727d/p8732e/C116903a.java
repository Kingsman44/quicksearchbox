package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8727d.p8732e;

import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.searchbox.p6944c.C88616t;
import com.google.android.apps.gsa.searchbox.p6944c.p6946b.p6947a.C88552c;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89204i;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.d.e.a */
/* compiled from: PG */
public final class C116903a implements C88552c, C89204i {

    /* renamed from: a */
    public String f324571a;

    /* renamed from: c */
    public final int mo82214c(C88616t tVar) {
        String bk = tVar.f239556a.mo84352bk();
        if (TextUtils.isEmpty(this.f324571a) || !bk.startsWith(this.f324571a)) {
            return 1;
        }
        tVar.f239562g.mo55429h("gs_mss", this.f324571a);
        return 1;
    }

    /* renamed from: hE */
    public final void mo78006hE() {
        this.f324571a = BuildConfig.FLAVOR;
    }
}
