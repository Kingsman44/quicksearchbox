package com.google.android.apps.search.weather.p10692j;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.elements.C21196h;
import com.google.android.libraries.elements.interfaces.C21255ay;
import com.google.android.libraries.elements.interfaces.C21256az;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.search.rendering.xuikit.p3097a.p3115c.C40058w;
import com.google.android.libraries.search.rendering.xuikit.p3097a.p3115c.C40060y;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3132a.C40305b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.p3603a.C45954d;
import com.google.apps.tiktok.dataservice.p3638c.C46756m;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57784p;

/* renamed from: com.google.android.apps.search.weather.j.e */
/* compiled from: PG */
public final class C142113e extends C46756m {

    /* renamed from: a */
    private final C21256az f385543a;

    /* renamed from: b */
    private final C40305b f385544b;

    /* renamed from: c */
    private final C40060y f385545c;

    /* renamed from: d */
    private final AccountId f385546d;

    public C142113e(C40305b bVar, C40060y yVar, AccountId accountId) {
        this.f385544b = bVar;
        this.f385543a = bVar.mo32548g().mo26713a();
        this.f385545c = yVar;
        this.f385546d = accountId;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ View mo18113a(ViewGroup viewGroup) {
        this.f385544b.mo32553l();
        return new C21196h(viewGroup.getContext(), this.f385543a);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo50773c(View view) {
        C21196h hVar = (C21196h) view;
        this.f385544b.mo32553l();
        hVar.mo26215b((byte[]) null);
        C40058w wVar = (C40058w) hVar.f59458a.mo26722c();
        if (wVar != null) {
            wVar.mo42158f();
        }
    }

    /* renamed from: d */
    public final C21196h mo117016d(Context context, C28439i iVar) {
        C40058w a = this.f385545c.mo42163a(iVar, C45954d.m82060a(this.f385546d));
        C21255ay b = this.f385543a.mo26721b();
        b.mo26714b(a);
        C21256az a2 = b.mo26713a();
        this.f385544b.mo32553l();
        return new C21196h(context, a2);
    }

    /* renamed from: e */
    public final void mo18114b(C21196h hVar, C57784p pVar) {
        this.f385544b.mo32553l().mo42108a(hVar, pVar);
    }
}
