package com.google.android.apps.gsa.nowoverlayservice.p6426d;

import android.view.View;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.p3603a.C45954d;

/* renamed from: com.google.android.apps.gsa.nowoverlayservice.d.h */
/* compiled from: PG */
public final /* synthetic */ class C83525h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C83531n f227712a;

    /* renamed from: b */
    public final /* synthetic */ boolean f227713b;

    /* renamed from: c */
    public final /* synthetic */ View f227714c;

    /* renamed from: d */
    public final /* synthetic */ AccountId f227715d;

    public /* synthetic */ C83525h(C83531n nVar, boolean z, View view, AccountId accountId) {
        this.f227712a = nVar;
        this.f227713b = z;
        this.f227714c = view;
        this.f227715d = accountId;
    }

    public final void run() {
        C83531n nVar = this.f227712a;
        boolean z = this.f227713b;
        View view = this.f227714c;
        AccountId accountId = this.f227715d;
        if (z) {
            C28306ab abVar = ((C28310af) nVar.f227740b.mo27525b()).f76997b;
            C28306ab.m52929e(view);
        }
        C28313c a = ((C28310af) nVar.f227740b.mo27525b()).f76997b.mo33800a(C28427h.m53115a(97964));
        a.mo33861i(C28439i.f77216b);
        a.mo33859g(C28375ak.m53061c(98125));
        a.mo33859g(C45954d.m82060a(accountId));
        a.mo33811d(view);
    }
}
