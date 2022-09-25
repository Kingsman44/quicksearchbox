package com.google.android.libraries.onegoogle.accountmenu.features.education;

import com.google.android.libraries.onegoogle.accountmenu.features.education.p2369db.C30576c;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.features.education.k */
/* compiled from: PG */
public final /* synthetic */ class C30593k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C30601s f82642a;

    /* renamed from: b */
    public final /* synthetic */ C30546a f82643b;

    /* renamed from: c */
    public final /* synthetic */ C30576c f82644c;

    public /* synthetic */ C30593k(C30601s sVar, C30546a aVar, C30576c cVar) {
        this.f82642a = sVar;
        this.f82643b = aVar;
        this.f82644c = cVar;
    }

    public final void run() {
        C30601s sVar = this.f82642a;
        C30546a aVar = this.f82643b;
        sVar.f82670f.execute(new C30596n(sVar, aVar, this.f82644c));
        aVar.mo36211f();
    }
}
