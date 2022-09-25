package com.google.android.apps.gsa.staticplugins.opa.worker.proactive;

import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.search.assistant.proactive.C36201a;
import com.google.apps.tiktok.account.AccountId;
import com.google.assistant.p3897e.p3921j.aas;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.p4552o.ajz;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.bd */
/* compiled from: PG */
public final /* synthetic */ class C114412bd implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C114418bj f317235a;

    /* renamed from: b */
    public final /* synthetic */ aas f317236b;

    /* renamed from: c */
    public final /* synthetic */ ajz f317237c;

    public /* synthetic */ C114412bd(C114418bj bjVar, aas aas, ajz ajz) {
        this.f317235a = bjVar;
        this.f317236b = aas;
        this.f317237c = ajz;
    }

    public final Object apply(Object obj) {
        C114418bj bjVar = this.f317235a;
        aas aas = this.f317236b;
        ajz ajz = this.f317237c;
        return new C36201a((C28293k) null, bjVar.f317261g.mo40050f(aas, C58833ax.m90834k((AccountId) obj), ajz), ajz);
    }
}
