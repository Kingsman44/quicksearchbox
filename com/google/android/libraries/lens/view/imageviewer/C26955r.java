package com.google.android.libraries.lens.view.imageviewer;

import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.web.base.C43264o;
import com.google.android.libraries.web.base.WebConfig;
import com.google.apps.tiktok.account.AccountId;

/* renamed from: com.google.android.libraries.lens.view.imageviewer.r */
/* compiled from: PG */
public final class C26955r {

    /* renamed from: a */
    public final C26952o f73467a;

    /* renamed from: b */
    public final AccountId f73468b;

    /* renamed from: c */
    public final WebConfig f73469c;

    /* renamed from: d */
    public final String f73470d;

    /* renamed from: e */
    public final C28306ab f73471e;

    public C26955r(C26952o oVar, AccountId accountId, WebConfig webConfig, String str, C28306ab abVar) {
        this.f73467a = oVar;
        this.f73468b = accountId;
        this.f73471e = abVar;
        this.f73469c = webConfig;
        this.f73470d = str;
    }

    /* renamed from: a */
    public final C26940d mo32344a() {
        C43264o oVar = (C43264o) this.f73467a.getChildFragmentManager().f634a.mo671c("image-viewer-web-coordinator-tag");
        if (oVar != null) {
            return (C26940d) oVar.mo17754z().mo46379a();
        }
        return null;
    }
}
