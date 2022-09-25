package com.google.android.apps.search.weather.p10686e;

import android.support.p031v4.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.apps.search.weather.e.i */
/* compiled from: PG */
public final class C142086i extends FragmentStateAdapter {

    /* renamed from: f */
    private final AccountId f385486f;

    /* renamed from: g */
    private final C142084g f385487g;

    public C142086i(Fragment fragment, AccountId accountId, C142084g gVar) {
        super(fragment);
        this.f385486f = accountId;
        this.f385487g = gVar;
    }

    /* renamed from: b */
    public final Fragment mo9192b(int i) {
        AccountId accountId = this.f385486f;
        C142084g gVar = this.f385487g;
        C142079b bVar = new C142079b();
        C68324h.m98669f(bVar);
        C47247a.m84047b(bVar, accountId);
        C47243l.m84039a(bVar, gVar);
        return bVar;
    }

    public final int getItemCount() {
        return 1;
    }
}
