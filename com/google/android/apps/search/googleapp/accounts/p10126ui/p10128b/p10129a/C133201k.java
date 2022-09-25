package com.google.android.apps.search.googleapp.accounts.p10126ui.p10128b.p10129a;

import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.b.a.k */
/* compiled from: PG */
final class C133201k implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C133202l f363065a;

    public C133201k(C133202l lVar) {
        this.f363065a = lVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if (th instanceof CancellationException) {
            ((C59052c) ((C59052c) C133202l.f363067b.mo56224b()).mo56372aa(40022)).mo56386p("Delete History request was successfully cancelled.");
            return;
        }
        ((C59052c) ((C59052c) ((C59052c) C133202l.f363067b.mo56225c()).mo56382g(th)).mo56372aa(40021)).mo56386p("Failed to delete search history.");
        C133202l lVar = this.f363065a;
        lVar.f363073h.mo50787a(lVar.mo111021a(true), C133202l.f363066a);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        ((C59052c) ((C59052c) C133202l.f363067b.mo56224b()).mo56372aa(40023)).mo56386p("Delete History request was successful.");
    }
}
