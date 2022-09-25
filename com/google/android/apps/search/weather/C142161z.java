package com.google.android.apps.search.weather;

import android.support.p031v4.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.google.android.apps.search.weather.p10692j.C142110b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.p4017at.p4060h.p4075e.p4076a.C54269e;
import com.google.p4017at.p4060h.p4075e.p4076a.C54272h;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57784p;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.apps.search.weather.z */
/* compiled from: PG */
final class C142161z extends FragmentStateAdapter {

    /* renamed from: f */
    private final AccountId f385662f;

    /* renamed from: g */
    private final C54272h f385663g;

    public C142161z(Fragment fragment, AccountId accountId, C54272h hVar) {
        super(fragment);
        this.f385662f = accountId;
        this.f385663g = hVar;
    }

    /* renamed from: b */
    public final Fragment mo9192b(int i) {
        AccountId accountId = this.f385662f;
        C57784p pVar = ((C54269e) this.f385663g.f142515b.get(i)).f142500a;
        if (pVar == null) {
            pVar = C57784p.f154382f;
        }
        C142110b bVar = new C142110b();
        C68324h.m98669f(bVar);
        C47247a.m84047b(bVar, accountId);
        C47243l.m84039a(bVar, pVar);
        return bVar;
    }

    public final int getItemCount() {
        return this.f385663g.f142515b.size();
    }
}
