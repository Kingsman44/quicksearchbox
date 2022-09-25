package com.google.android.apps.search.podcasts.explore;

import android.support.p031v4.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.google.android.apps.search.podcasts.explore.C140266f;
import com.google.android.apps.search.podcasts.explore.p10564a.C140248a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.p4017at.p4082j.p4083a.C54449n;
import com.google.protobuf.C62942bv;
import dagger.hilt.android.internal.managers.C68324h;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.explore.e */
/* compiled from: PG */
public final class C140265e extends FragmentStateAdapter {

    /* renamed from: f */
    final /* synthetic */ C140248a f381054f;

    /* renamed from: g */
    final /* synthetic */ C140266f.C140267a f381055g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C140265e(C140248a aVar, C140266f.C140267a aVar2, Fragment fragment) {
        super(fragment);
        this.f381054f = aVar;
        this.f381055g = aVar2;
    }

    /* renamed from: b */
    public final Fragment mo9192b(int i) {
        AccountId accountId = this.f381055g.f381068a;
        C140247a aVar = (C140247a) C140262b.f381049c.createBuilder();
        String str = ((C54449n) this.f381054f.f381017a.get(i)).f142981b;
        aVar.copyOnWrite();
        str.getClass();
        ((C140262b) aVar.instance).f381052b = str;
        boolean z = i == 0;
        aVar.copyOnWrite();
        ((C140262b) aVar.instance).f381051a = z;
        C62942bv build = aVar.build();
        C69664n.m101060f(build, "newBuilder()\n           …                 .build()");
        C140262b bVar = (C140262b) build;
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(bVar, "exploreArgs");
        C140272k kVar = new C140272k();
        C68324h.m98669f(kVar);
        C47247a.m84047b(kVar, accountId);
        C47243l.m84039a(kVar, bVar);
        return kVar;
    }

    public final int getItemCount() {
        return this.f381054f.f381017a.size();
    }
}
