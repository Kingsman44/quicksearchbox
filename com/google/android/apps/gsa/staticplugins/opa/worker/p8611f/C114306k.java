package com.google.android.apps.gsa.staticplugins.opa.worker.p8611f;

import com.google.android.apps.gsa.staticplugins.opa.worker.p8611f.C114310o;
import com.google.android.apps.search.googleapp.search.suggest.p10443a.C137916ab;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47245e;
import com.google.common.util.concurrent.C60866ct;
import p3186j$.time.Duration;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.f.k */
/* compiled from: PG */
public final /* synthetic */ class C114306k implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C114310o f316946a;

    public /* synthetic */ C114306k(C114310o oVar) {
        this.f316946a = oVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        Optional id = ((C114310o.C114311a) C47245e.m84045a(this.f316946a.f316954f, C114310o.C114311a.class, (AccountId) obj)).mo101298id();
        if (id.isPresent()) {
            ((C137916ab) id.get()).mo114045a(Duration.ZERO);
        }
        return C60866ct.f164955a;
    }
}
