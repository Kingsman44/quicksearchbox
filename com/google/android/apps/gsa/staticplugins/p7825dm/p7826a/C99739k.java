package com.google.android.apps.gsa.staticplugins.p7825dm.p7826a;

import com.google.android.apps.gsa.search.core.p6500ac.C84405i;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.search.p2904c.C37400be;
import com.google.android.libraries.search.p2904c.C37561eb;
import com.google.common.util.concurrent.C60856cj;

/* renamed from: com.google.android.apps.gsa.staticplugins.dm.a.k */
/* compiled from: PG */
public final /* synthetic */ class C99739k implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C99747s f279086a;

    public /* synthetic */ C99739k(C99747s sVar) {
        this.f279086a = sVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C99747s sVar = this.f279086a;
        C37400be beVar = (C37400be) obj;
        C37561eb ebVar = beVar.mo40929a().f99350b;
        if (ebVar == null) {
            ebVar = C37561eb.f99800c;
        }
        if (ebVar.f99802a == 1) {
            sVar.f279101j = 3;
            return C60856cj.m92900i(beVar.mo40930b());
        }
        throw new C84405i("Listening session could not be opened.");
    }
}
