package com.google.android.libraries.lens.view;

import com.google.android.libraries.lens.view.p2049a.C24948b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46719bc;
import com.google.apps.tiktok.dataservice.C46723bg;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.libraries.lens.view.m */
/* compiled from: PG */
public final class C27273m {

    /* renamed from: a */
    public final C46689ag f74590a;

    /* renamed from: b */
    public final C46801dp f74591b;

    /* renamed from: c */
    public boolean f74592c;

    /* renamed from: d */
    private final C26894i f74593d;

    /* renamed from: e */
    private final AccountId f74594e;

    /* renamed from: f */
    private C27220l f74595f;

    public C27273m(C26894i iVar, AccountId accountId, C24948b bVar, C46801dp dpVar, C46723bg bgVar) {
        this.f74593d = iVar;
        this.f74594e = accountId;
        this.f74591b = dpVar;
        this.f74590a = new C46719bc(bgVar, new C27211j(bVar), "AccountNameDataSourceKey");
    }

    /* renamed from: a */
    public final void mo32804a() {
        C27220l lVar = this.f74595f;
        if (lVar != null && this.f74592c) {
            lVar.mo32661y(this.f74594e);
            this.f74595f = null;
        }
    }

    /* renamed from: b */
    public final void mo32805b(C27220l lVar) {
        C58838bb.m90884s(this.f74593d.isAdded(), "callback should only be registered while Fragment is added");
        this.f74595f = lVar;
        mo32804a();
    }
}
