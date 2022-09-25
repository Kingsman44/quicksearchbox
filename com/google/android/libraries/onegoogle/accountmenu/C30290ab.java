package com.google.android.libraries.onegoogle.accountmenu;

import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30464e;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.ab */
/* compiled from: PG */
public final /* synthetic */ class C30290ab implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C30317ag f81921a;

    /* renamed from: b */
    public final /* synthetic */ C30464e f81922b;

    /* renamed from: c */
    public final /* synthetic */ int f81923c;

    public /* synthetic */ C30290ab(C30317ag agVar, int i, C30464e eVar) {
        this.f81921a = agVar;
        this.f81923c = i;
        this.f81922b = eVar;
    }

    public final void run() {
        C30317ag agVar = this.f81921a;
        int i = this.f81923c;
        C30464e eVar = this.f81922b;
        agVar.mo35885c(i);
        eVar.mo36064d().onClick(agVar.f81984b);
    }
}
