package com.google.android.apps.gsa.search.core.service.p6852g.p6855b;

import com.google.android.apps.gsa.search.core.service.p6852g.C86726f;
import com.google.common.base.C58838bb;
import java.util.Observable;
import java.util.Observer;

/* renamed from: com.google.android.apps.gsa.search.core.service.g.b.e */
/* compiled from: PG */
final class C86721e implements Observer {

    /* renamed from: a */
    final /* synthetic */ C86722f f234257a;

    public C86721e(C86722f fVar) {
        this.f234257a = fVar;
    }

    public final void update(Observable observable, Object obj) {
        C58838bb.m90884s(obj instanceof C86726f, "Passed-in object is not an instance of UserAdvocateObservable");
        C86722f fVar = this.f234257a;
        C86726f fVar2 = (C86726f) obj;
        C86726f fVar3 = fVar.f234259b;
        if (fVar3 != fVar2) {
            fVar3.deleteObserver(fVar.f234258a);
            fVar2.addObserver(fVar.f234258a);
            fVar.f234259b = fVar2;
            fVar.mo80335a();
        }
    }
}
