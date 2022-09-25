package com.google.android.libraries.lens.view.weblrp;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.web.base.C43264o;
import com.google.android.libraries.web.base.WebConfig;
import com.google.apps.tiktok.account.AccountId;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.lens.view.weblrp.p */
/* compiled from: PG */
public final class C28202p {

    /* renamed from: a */
    public static final C59071e f76762a = C59071e.m91332i("com.google.android.libraries.lens.view.weblrp.p");

    /* renamed from: b */
    public final C28201o f76763b;

    /* renamed from: c */
    public final AccountId f76764c;

    /* renamed from: d */
    public final WebConfig f76765d;

    /* renamed from: e */
    public final C37215b f76766e;

    /* renamed from: f */
    public final boolean f76767f;

    public C28202p(C28201o oVar, AccountId accountId, WebConfig webConfig, String str, C37215b bVar) {
        this.f76763b = oVar;
        this.f76764c = accountId;
        this.f76765d = webConfig;
        this.f76767f = Boolean.parseBoolean(str);
        this.f76766e = bVar;
    }

    /* renamed from: a */
    public final C28191f mo33715a() {
        C43264o oVar = (C43264o) this.f76763b.getChildFragmentManager().f634a.mo671c("web-lrp-web-coordinator-fragment");
        if (oVar != null) {
            return (C28191f) oVar.mo17754z().mo46379a();
        }
        return null;
    }

    /* renamed from: b */
    public final void mo33716b(int i) {
        View view;
        C28191f a = mo33715a();
        if (a != null && (view = a.mo17754z().f76734h.getView()) != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = i;
            view.setLayoutParams(layoutParams);
        }
    }
}
