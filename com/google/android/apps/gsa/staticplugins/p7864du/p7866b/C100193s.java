package com.google.android.apps.gsa.staticplugins.p7864du.p7866b;

import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8885y.C118827a;
import com.google.android.apps.gsa.search.core.p6505af.p6506a.C84466a;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.store.C118334w;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.du.b.s */
/* compiled from: PG */
public final /* synthetic */ class C100193s implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C100125ad f280221a;

    /* renamed from: b */
    public final /* synthetic */ C118334w f280222b;

    public /* synthetic */ C100193s(C100125ad adVar, C118334w wVar) {
        this.f280221a = adVar;
        this.f280222b = wVar;
    }

    public final Object call() {
        C100125ad adVar = this.f280221a;
        C118334w wVar = this.f280222b;
        C21370a aVar = adVar.f279969e;
        C118827a aVar2 = adVar.f279973i;
        C100147az azVar = adVar.f279983s;
        C84466a aVar3 = adVar.f279982r;
        Throwable th = new Throwable();
        C118575h hVar = adVar.f279974j;
        C118561t tVar = adVar.f279975k;
        C100181g gVar = adVar.f279979o;
        C89356b a = aVar3.mo78025a("SqliteKeyBlobQuery", 163, hVar.f330812sk);
        C100175c cVar = new C100175c();
        C60870cx gq = new C100178d(new C100149ba(cVar, aVar, wVar, aVar2, adVar, azVar, th, hVar, tVar, gVar), a).f280139a.mo60297gq();
        cVar.mo91780a(gq);
        return gq;
    }
}
