package com.google.android.apps.search.googleapp.launcher.minusone;

import android.support.p031v4.app.Fragment;
import android.view.View;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10344c.C136455h;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.p337aa.p338a.C6610l;
import dagger.hilt.android.internal.managers.C68324h;
import java.io.PrintWriter;

/* renamed from: com.google.android.apps.search.googleapp.launcher.minusone.cn */
/* compiled from: PG */
final class C136636cn implements C136580ao {

    /* renamed from: a */
    private final AccountId f371936a;

    /* renamed from: b */
    private final C136455h f371937b;

    /* renamed from: c */
    private final boolean f371938c;

    /* renamed from: d */
    private final boolean f371939d;

    /* renamed from: e */
    private int f371940e = 0;

    public C136636cn(AccountId accountId, C136455h hVar, boolean z, boolean z2) {
        this.f371936a = accountId;
        this.f371937b = hVar;
        this.f371938c = z;
        this.f371939d = z2;
    }

    /* renamed from: a */
    public final int mo113241a(int i, int i2) {
        return (i2 - i) + this.f371940e;
    }

    /* renamed from: b */
    public final Fragment mo113242b() {
        AccountId accountId = this.f371936a;
        C136455h hVar = this.f371937b;
        C136630ch chVar = new C136630ch();
        C68324h.m98669f(chVar);
        C47247a.m84047b(chVar, accountId);
        C47243l.m84039a(chVar, hVar);
        return chVar;
    }

    /* renamed from: c */
    public final /* synthetic */ void mo113243c(PrintWriter printWriter, String str, Fragment fragment) {
        C136579an.m221960a(this, printWriter, "         ", fragment);
    }

    /* renamed from: d */
    public final /* synthetic */ void mo113244d(View view, View view2) {
        C136579an.m221961b(this, view, view2);
    }

    /* renamed from: e */
    public final /* synthetic */ void mo113245e(View view, C6610l lVar) {
    }

    /* renamed from: f */
    public final /* synthetic */ void mo113246f(float f, Fragment fragment) {
        C136579an.m221965f(f, fragment);
    }

    /* renamed from: g */
    public final void mo113247g(View view) {
        C136579an.m221962c(this, view);
        if (mo113248h()) {
            this.f371940e = view.getResources().getDimensionPixelSize(R.dimen.googleapp_minus_one_feed_background_shared_oem_post_mvp_top_padding);
        }
    }

    /* renamed from: h */
    public final boolean mo113248h() {
        return !this.f371938c || !this.f371939d;
    }

    /* renamed from: i */
    public final /* synthetic */ void mo113249i(View view, View view2, int i, Fragment fragment) {
        C136579an.m221964e(this, view, view2, i, fragment);
    }

    /* renamed from: j */
    public final /* synthetic */ void mo113250j(View view) {
        C136579an.m221966g(this, view);
    }
}
