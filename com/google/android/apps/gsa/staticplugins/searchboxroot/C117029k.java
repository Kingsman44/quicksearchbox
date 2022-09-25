package com.google.android.apps.gsa.staticplugins.searchboxroot;

import com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8727d.C116935u;
import com.google.android.apps.search.googleapp.search.suggest.p10443a.p10444a.C137907b;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47245e;
import com.google.common.util.concurrent.C60866ct;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.k */
/* compiled from: PG */
public final /* synthetic */ class C117029k implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C117042x f324913a;

    public /* synthetic */ C117029k(C117042x xVar) {
        this.f324913a = xVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        Optional ic = ((C116935u.C116936a) C47245e.m84045a(this.f324913a.f324954c, C116935u.C116936a.class, (AccountId) obj)).mo103064ic();
        if (ic.isPresent()) {
            return ((C137907b) ic.get()).mo114042b();
        }
        return C60866ct.f164955a;
    }
}
