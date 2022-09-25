package com.google.android.apps.gsa.store.tasks;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6505af.p6506a.C84466a;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.util.ProguardMustNotDelete;
import com.google.android.apps.gsa.store.C118312c;
import com.google.android.apps.gsa.store.C118315f;
import com.google.android.apps.gsa.store.C118319j;
import com.google.android.apps.gsa.store.C118325p;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4540k.C59311a;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60934v;
import java.util.ArrayList;
import java.util.Set;
import p5460g.p5461a.C69464a;

@ProguardMustNotDelete
/* compiled from: PG */
public class DeleteExpiredContentTask implements C118549h {

    /* renamed from: a */
    private final C21370a f328457a;

    /* renamed from: b */
    private final C118319j f328458b;

    /* renamed from: c */
    private final Set f328459c;

    public DeleteExpiredContentTask(C21370a aVar, C84466a aVar2, Set set) {
        C118319j jVar = new C118319j(aVar2);
        this.f328457a = aVar;
        this.f328459c = set;
        this.f328458b = jVar;
    }

    /* renamed from: a */
    public final C60870cx mo65234a(C118476ak akVar) {
        ArrayList arrayList = new ArrayList(this.f328459c.size());
        for (C118325p pVar : this.f328459c) {
            C118319j jVar = this.f328458b;
            C21370a aVar = this.f328457a;
            C118312c cVar = (C118312c) pVar.f328450a.mo17428b();
            C69464a aVar2 = pVar.f328451b;
            C89356b a = jVar.f328437a.mo78025a("DeleteExpiredContent", 186, pVar.f328452c.f330812sk);
            aVar.getClass();
            cVar.getClass();
            arrayList.add(new C118315f(aVar, cVar, (Set) ((C59311a) aVar2).f157481a, a).f328407a.mo60297gq());
        }
        return C60856cj.m92892a(arrayList).mo57334a(new C60934v(C118826c.f331422a), C60826bg.f164896a);
    }
}
