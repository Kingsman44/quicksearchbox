package com.google.android.libraries.onegoogle.accountmenu.features.education;

import com.google.android.libraries.onegoogle.accountmenu.features.education.p2369db.C30576c;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.features.education.n */
/* compiled from: PG */
public final /* synthetic */ class C30596n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C30601s f82651a;

    /* renamed from: b */
    public final /* synthetic */ C30546a f82652b;

    /* renamed from: c */
    public final /* synthetic */ C30576c f82653c;

    public /* synthetic */ C30596n(C30601s sVar, C30546a aVar, C30576c cVar) {
        this.f82651a = sVar;
        this.f82652b = aVar;
        this.f82653c = cVar;
    }

    public final void run() {
        C30601s sVar = this.f82651a;
        C30546a aVar = this.f82652b;
        C30576c cVar = this.f82653c;
        sVar.mo36289e(cVar);
        cVar.f82603f = System.currentTimeMillis();
        if (aVar.mo36207b()) {
            cVar.f82600c = 1;
            if (sVar.f82667c.isEmpty()) {
                cVar.f82605h = true;
            }
        }
        sVar.f82668d.mo36258A().mo36271e(cVar);
    }
}
