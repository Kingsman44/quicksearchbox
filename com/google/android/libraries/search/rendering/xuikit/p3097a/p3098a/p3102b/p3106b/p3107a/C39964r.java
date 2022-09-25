package com.google.android.libraries.search.rendering.xuikit.p3097a.p3098a.p3102b.p3106b.p3107a;

import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.FragmentManager;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.common.base.C58881cr;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4396b.p4400c.p4401a.C57722f;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.a.a.b.b.a.r */
/* compiled from: PG */
public final /* synthetic */ class C39964r implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ C39965s f105061a;

    /* renamed from: b */
    public final /* synthetic */ C57722f f105062b;

    /* renamed from: c */
    public final /* synthetic */ FragmentManager f105063c;

    public /* synthetic */ C39964r(C39965s sVar, C57722f fVar, FragmentManager fragmentManager) {
        this.f105061a = sVar;
        this.f105062b = fVar;
        this.f105063c = fragmentManager;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        C39965s sVar = this.f105061a;
        C57722f fVar = this.f105062b;
        FragmentManager fragmentManager = this.f105063c;
        AccountId accountId = sVar.f105064a;
        C39953i iVar = new C39953i();
        C68324h.m98669f(iVar);
        C47247a.m84047b(iVar, accountId);
        C47243l.m84039a(iVar, fVar);
        C0154a aVar = new C0154a(fragmentManager);
        aVar.mo685r(iVar, "$XUiKitMavatarCustomType$MavatarFragment");
        aVar.mo509f();
        return iVar;
    }
}
