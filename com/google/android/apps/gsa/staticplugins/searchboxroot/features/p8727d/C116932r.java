package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8727d;

import com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8727d.C116935u;
import com.google.android.apps.search.googleapp.search.suggest.p10443a.p10444a.C137907b;
import com.google.android.apps.search.googleapp.search.suggest.p10443a.p10444a.C137914i;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47245e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.d.r */
/* compiled from: PG */
public final /* synthetic */ class C116932r implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C116935u f324655a;

    public /* synthetic */ C116932r(C116935u uVar) {
        this.f324655a = uVar;
    }

    public final C60870cx apply(Object obj) {
        Optional ic = ((C116935u.C116936a) C47245e.m84045a(this.f324655a.f324658a, C116935u.C116936a.class, (AccountId) obj)).mo103064ic();
        if (ic.isPresent()) {
            return ((C137907b) ic.get()).mo114041a();
        }
        return C60856cj.m92900i(C137914i.f375234c);
    }
}
