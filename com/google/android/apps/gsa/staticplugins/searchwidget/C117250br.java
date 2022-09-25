package com.google.android.apps.gsa.staticplugins.searchwidget;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.p6995aq.C89257aa;
import com.google.android.apps.gsa.shared.util.p7159c.C90888av;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.br */
/* compiled from: PG */
final class C117250br extends C90888av {

    /* renamed from: a */
    public volatile String f325488a = BuildConfig.FLAVOR;

    /* renamed from: b */
    final /* synthetic */ C117251bs f325489b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C117250br(C117251bs bsVar, String str) {
        super("Run update hint text task", 1, 0);
        this.f325489b = bsVar;
        this.f325488a = str;
    }

    public final void run() {
        synchronized (this.f325489b.f325492c) {
            this.f325489b.f325491b.sendBroadcast(C89257aa.m145199v(this.f325488a));
            this.f325489b.f325493f = null;
        }
    }
}
