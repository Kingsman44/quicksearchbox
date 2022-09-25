package com.google.android.libraries.search.assistant.p2803u.p2808b.p2813c.p2815b.p2816a;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import dagger.hilt.android.internal.managers.C68324h;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.assistant.u.b.c.b.a.x */
/* compiled from: PG */
public final /* synthetic */ class C36749x implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C36704ac f95758a;

    /* renamed from: b */
    public final /* synthetic */ C36713aj f95759b;

    public /* synthetic */ C36749x(C36704ac acVar, C36713aj ajVar) {
        this.f95758a = acVar;
        this.f95759b = ajVar;
    }

    public final void accept(Object obj) {
        C36704ac acVar = this.f95758a;
        C36713aj ajVar = this.f95759b;
        AccountId accountId = acVar.f95614f;
        C36738n nVar = new C36738n();
        C68324h.m98669f(nVar);
        C47247a.m84047b(nVar, accountId);
        C47243l.m84039a(nVar, ajVar);
        acVar.mo40337a(nVar, (String) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
