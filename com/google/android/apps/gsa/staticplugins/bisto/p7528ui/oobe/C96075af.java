package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.accounts.Account;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.af */
/* compiled from: PG */
public final /* synthetic */ class C96075af implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C96082am f268991a;

    /* renamed from: b */
    public final /* synthetic */ Account f268992b;

    /* renamed from: c */
    public final /* synthetic */ String f268993c;

    /* renamed from: d */
    public final /* synthetic */ Duration f268994d;

    public /* synthetic */ C96075af(C96082am amVar, Account account, String str, Duration duration) {
        this.f268991a = amVar;
        this.f268992b = account;
        this.f268993c = str;
        this.f268994d = duration;
    }

    public final C60870cx apply(Object obj) {
        return (C60870cx) ((C58833ax) obj).mo56106b(C96073ad.f268986a).mo56108d(new C96074ae(this.f268991a, this.f268992b, this.f268993c, this.f268994d));
    }
}
