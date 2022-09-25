package com.google.android.apps.gsa.staticplugins.opa.worker.proactive;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.search.assistant.proactive.C36231b;
import com.google.apps.tiktok.account.AccountId;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.p4552o.ajz;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.bf */
/* compiled from: PG */
public final /* synthetic */ class C114414bf implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C114418bj f317241a;

    /* renamed from: b */
    public final /* synthetic */ String f317242b;

    /* renamed from: c */
    public final /* synthetic */ ajz f317243c;

    /* renamed from: d */
    public final /* synthetic */ boolean f317244d;

    public /* synthetic */ C114414bf(C114418bj bjVar, String str, ajz ajz, boolean z) {
        this.f317241a = bjVar;
        this.f317242b = str;
        this.f317243c = ajz;
        this.f317244d = z;
    }

    public final Object apply(Object obj) {
        C114418bj bjVar = this.f317241a;
        String str = this.f317242b;
        ajz ajz = this.f317243c;
        boolean z = this.f317244d;
        AccountId accountId = (AccountId) obj;
        C36231b bVar = bjVar.f317261g;
        if (!z) {
            C58833ax.m90834k(accountId);
        }
        bVar.mo40049e(str, ajz);
        return C118826c.f331422a;
    }
}
