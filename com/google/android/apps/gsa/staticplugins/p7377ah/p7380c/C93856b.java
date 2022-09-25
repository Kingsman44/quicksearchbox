package com.google.android.apps.gsa.staticplugins.p7377ah.p7380c;

import com.google.android.apps.gsa.shared.search.corpus.Corpus;
import com.google.android.material.bottomsheet.C44565p;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.ah.c.b */
/* compiled from: PG */
public final /* synthetic */ class C93856b implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C93858d f262127a;

    public /* synthetic */ C93856b(C93858d dVar) {
        this.f262127a = dVar;
    }

    public final void accept(Object obj) {
        C93858d dVar = this.f262127a;
        Corpus corpus = (Corpus) obj;
        C44565p pVar = dVar.f262134f;
        if (pVar != null) {
            pVar.dismiss();
            dVar.f262134f = null;
        }
        dVar.f262131c.mo88190e(corpus);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
