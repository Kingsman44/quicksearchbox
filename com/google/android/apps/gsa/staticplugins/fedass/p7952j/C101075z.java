package com.google.android.apps.gsa.staticplugins.fedass.p7952j;

import android.accounts.Account;
import com.google.android.apps.gsa.p6482q.p6483a.C84235h;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.j.z */
/* compiled from: PG */
public final /* synthetic */ class C101075z implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ Account f282240a;

    /* renamed from: b */
    public final /* synthetic */ Optional f282241b;

    public /* synthetic */ C101075z(Account account, Optional optional) {
        this.f282240a = account;
        this.f282241b = optional;
    }

    public final C60870cx apply(Object obj) {
        Account account = this.f282240a;
        Void voidR = (Void) obj;
        return ((C84235h) this.f282241b.get()).mo77715e(account == null ? null : account.name);
    }
}
