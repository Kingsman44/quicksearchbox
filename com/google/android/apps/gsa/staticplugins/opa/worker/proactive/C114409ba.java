package com.google.android.apps.gsa.staticplugins.opa.worker.proactive;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.search.assistant.proactive.C36231b;
import com.google.apps.tiktok.account.AccountId;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.p4552o.ajz;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.ba */
/* compiled from: PG */
public final /* synthetic */ class C114409ba implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C114418bj f317228a;

    /* renamed from: b */
    public final /* synthetic */ String f317229b;

    /* renamed from: c */
    public final /* synthetic */ ajz f317230c;

    public /* synthetic */ C114409ba(C114418bj bjVar, String str, ajz ajz) {
        this.f317228a = bjVar;
        this.f317229b = str;
        this.f317230c = ajz;
    }

    public final Object apply(Object obj) {
        C114418bj bjVar = this.f317228a;
        String str = this.f317229b;
        ajz ajz = this.f317230c;
        C36231b bVar = bjVar.f317261g;
        C58833ax.m90834k((AccountId) obj);
        bVar.mo40048d(str, ajz);
        return C118826c.f331422a;
    }
}
