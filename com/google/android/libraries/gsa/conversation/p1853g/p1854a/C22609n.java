package com.google.android.libraries.gsa.conversation.p1853g.p1854a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.gsa.conversation.p1850d.C22554d;
import com.google.android.libraries.gsa.conversation.p1850d.C22559i;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.libraries.gsa.conversation.g.a.n */
/* compiled from: PG */
public final /* synthetic */ class C22609n implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C22612q f62280a;

    public /* synthetic */ C22609n(C22612q qVar) {
        this.f62280a = qVar;
    }

    public final C60870cx apply(Object obj) {
        C22559i iVar = this.f62280a.f62294d;
        C58976aa aaVar = C58975e.f156826a;
        long b = iVar.f62186g.mo26870b();
        SettableFuture settableFuture = new SettableFuture();
        iVar.f62184e.post(new C22554d(iVar, (String) ((C58833ax) obj).mo56109e(BuildConfig.FLAVOR), b, settableFuture));
        iVar.mo27649b(settableFuture, C22559i.f62181b, "Initialization didn't finish in time");
        return settableFuture;
    }
}
