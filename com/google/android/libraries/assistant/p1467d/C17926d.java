package com.google.android.libraries.assistant.p1467d;

import android.content.Context;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.search.assistant.platform.appintegration.p8990b.C119515a;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.libraries.assistant.d.d */
/* compiled from: PG */
final class C17926d implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ boolean f51353a;

    /* renamed from: b */
    final /* synthetic */ Context f51354b;

    /* renamed from: c */
    final /* synthetic */ C58881cr f51355c;

    /* renamed from: d */
    final /* synthetic */ C17928f f51356d;

    public C17926d(C17928f fVar, boolean z, Context context, C58881cr crVar) {
        this.f51356d = fVar;
        this.f51353a = z;
        this.f51354b = context;
        this.f51355c = crVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C17928f.f51358a.mo56225c()).mo56382g(th)).mo56372aa(42833)).mo56386p("Couldn't read whether gRPC is supported from public value");
        this.f51356d.f51359b.mo57356n(new C17935m(this.f51354b, false));
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C17814b bVar = (C17814b) obj;
        ((C59052c) ((C59052c) C17928f.f51358a.mo56224b()).mo56372aa(42834)).mo56389s("Fetched assistant config: %s", bVar);
        if (this.f51353a || (bVar != null && ((Boolean) bVar.f51116b.mo56109e(false)).booleanValue())) {
            C89849ae aeVar = C89849ae.UNKNOWN_EVENT;
            SettableFuture settableFuture = this.f51356d.f51359b;
            Context context = this.f51354b;
            ((C59052c) ((C59052c) C17814b.f51115a.mo56224b()).mo56372aa(42832)).mo56389s("#isTngMorrisSupported = %s", bVar.f51117c);
            settableFuture.mo57356n(new C17935m(context, ((Boolean) bVar.f51117c.mo56109e(false)).booleanValue()));
            return;
        }
        C89849ae aeVar2 = C89849ae.UNKNOWN_EVENT;
        this.f51356d.f51359b.mo57356n((C119515a) this.f51355c.mo6453a());
    }
}
