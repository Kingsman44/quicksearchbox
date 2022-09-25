package com.google.android.libraries.onegoogle.accountmenu.features.education;

import com.google.android.libraries.onegoogle.accountmenu.features.education.p2369db.C30576c;
import com.google.android.libraries.onegoogle.accountmenu.features.education.p2369db.C30577d;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.features.education.g */
/* compiled from: PG */
public final /* synthetic */ class C30589g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C30601s f82628a;

    /* renamed from: b */
    public final /* synthetic */ C30576c f82629b;

    /* renamed from: c */
    public final /* synthetic */ C30577d f82630c;

    /* renamed from: d */
    public final /* synthetic */ C30546a f82631d;

    public /* synthetic */ C30589g(C30601s sVar, C30576c cVar, C30577d dVar, C30546a aVar) {
        this.f82628a = sVar;
        this.f82629b = cVar;
        this.f82630c = dVar;
        this.f82631d = aVar;
    }

    public final void run() {
        C30601s sVar = this.f82628a;
        sVar.f82670f.execute(new C30588f(sVar, this.f82629b, this.f82630c, this.f82631d));
    }
}
