package com.google.android.apps.gsa.staticplugins.p7864du.p7866b;

import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8885y.C118827a;
import com.google.android.apps.gsa.search.core.p6505af.p6506a.C84466a;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.store.C118309ag;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.du.b.w */
/* compiled from: PG */
public final /* synthetic */ class C100197w implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C100125ad f280226a;

    /* renamed from: b */
    public final /* synthetic */ C118309ag[] f280227b;

    public /* synthetic */ C100197w(C100125ad adVar, C118309ag[] agVarArr) {
        this.f280226a = adVar;
        this.f280227b = agVarArr;
    }

    public final Object call() {
        C100125ad adVar = this.f280226a;
        C118309ag[] agVarArr = this.f280227b;
        C21370a aVar = adVar.f279969e;
        C118827a aVar2 = adVar.f279973i;
        C100147az azVar = adVar.f279983s;
        C84466a aVar3 = adVar.f279982r;
        C118575h hVar = adVar.f279974j;
        C118561t tVar = adVar.f279975k;
        C100180f fVar = adVar.f279971g.f280217e;
        C100181g gVar = adVar.f279979o;
        C89356b a = aVar3.mo78025a("SqliteOperations", 165, hVar.f330812sk);
        C100175c cVar = new C100175c();
        C60870cx gq = new C100179e(new C100165bq(cVar, aVar, agVarArr, aVar2, adVar, azVar, hVar, tVar, fVar, gVar), a).f280178a.mo60297gq();
        cVar.mo91780a(gq);
        return gq;
    }
}
