package com.google.android.apps.search.googleapp.accounts.p10126ui.features;

import android.support.p031v4.app.Fragment;
import android.view.View;
import com.google.android.apps.search.googleapp.accounts.p10126ui.features.p10134a.C133260b;
import com.google.android.libraries.search.p3025k.p3026a.C38524a;
import com.google.android.libraries.search.p3025k.p3026a.C38525b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import dagger.hilt.android.internal.managers.C68324h;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.features.r */
/* compiled from: PG */
public final /* synthetic */ class C133330r implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f363310a;

    /* renamed from: b */
    public final /* synthetic */ AccountId f363311b;

    /* renamed from: c */
    public final /* synthetic */ Fragment f363312c;

    /* renamed from: d */
    public final /* synthetic */ boolean f363313d;

    /* renamed from: e */
    public final /* synthetic */ C38524a f363314e;

    public /* synthetic */ C133330r(AtomicReference atomicReference, AccountId accountId, Fragment fragment, boolean z, C38524a aVar) {
        this.f363310a = atomicReference;
        this.f363311b = accountId;
        this.f363312c = fragment;
        this.f363313d = z;
        this.f363314e = aVar;
    }

    public final void onClick(View view) {
        AtomicReference atomicReference = this.f363310a;
        AccountId accountId = this.f363311b;
        Fragment fragment = this.f363312c;
        boolean z = this.f363313d;
        C38524a aVar = this.f363314e;
        C133260b bVar = new C133260b();
        C68324h.m98669f(bVar);
        C47247a.m84047b(bVar, accountId);
        C47243l.m84040b(bVar, (String) atomicReference.get());
        bVar.showNow(fragment.getChildFragmentManager(), "chrome_incognito_interstitial_dialog");
        if (z) {
            aVar.f101896a.mo37765a(new C38525b());
        }
    }
}
