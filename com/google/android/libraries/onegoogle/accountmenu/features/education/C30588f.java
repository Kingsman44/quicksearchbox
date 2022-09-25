package com.google.android.libraries.onegoogle.accountmenu.features.education;

import com.google.android.libraries.onegoogle.accountmenu.features.education.p2369db.C30576c;
import com.google.android.libraries.onegoogle.accountmenu.features.education.p2369db.C30577d;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.features.education.f */
/* compiled from: PG */
public final /* synthetic */ class C30588f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C30601s f82624a;

    /* renamed from: b */
    public final /* synthetic */ C30576c f82625b;

    /* renamed from: c */
    public final /* synthetic */ C30577d f82626c;

    /* renamed from: d */
    public final /* synthetic */ C30546a f82627d;

    public /* synthetic */ C30588f(C30601s sVar, C30576c cVar, C30577d dVar, C30546a aVar) {
        this.f82624a = sVar;
        this.f82625b = cVar;
        this.f82626c = dVar;
        this.f82627d = aVar;
    }

    public final void run() {
        C30601s sVar = this.f82624a;
        C30576c cVar = this.f82625b;
        C30577d dVar = this.f82626c;
        C30546a aVar = this.f82627d;
        C30576c a = C30576c.m57147a(cVar);
        if (aVar.mo36208c()) {
            dVar.f82610e = true;
            if (cVar.mo36259b()) {
                cVar.f82605h = true;
            }
        }
        sVar.f82669e.mo36272f(dVar);
        if (!cVar.equals(a)) {
            sVar.f82669e.mo36271e(cVar);
        }
    }
}
