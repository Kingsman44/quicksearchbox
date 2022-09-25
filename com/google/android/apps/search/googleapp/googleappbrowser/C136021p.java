package com.google.android.apps.search.googleapp.googleappbrowser;

import android.support.p031v4.app.C0213ce;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.tabs.C135948d;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.tabs.C135949e;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.common.p4526f.C59071e;
import dagger.hilt.android.internal.managers.C68324h;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.p */
/* compiled from: PG */
public final /* synthetic */ class C136021p implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C0213ce f370446a;

    public /* synthetic */ C136021p(C0213ce ceVar) {
        this.f370446a = ceVar;
    }

    public final void accept(Object obj) {
        C0213ce ceVar = this.f370446a;
        C59071e eVar = C136109q.f370678a;
        AccountId accountId = ((C135949e) obj).f370281a;
        C135948d dVar = new C135948d();
        C68324h.m98669f(dVar);
        C47247a.m84047b(dVar, accountId);
        ceVar.mo685r(dVar, "googleappbrowser_tabs");
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
