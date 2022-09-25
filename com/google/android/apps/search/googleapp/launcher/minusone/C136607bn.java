package com.google.android.apps.search.googleapp.launcher.minusone;

import android.support.p031v4.app.Fragment;
import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.p337aa.p338a.C6610l;
import dagger.hilt.android.internal.managers.C68324h;
import java.io.PrintWriter;

/* renamed from: com.google.android.apps.search.googleapp.launcher.minusone.bn */
/* compiled from: PG */
final class C136607bn implements C136580ao {

    /* renamed from: a */
    private final AccountId f371869a;

    /* renamed from: b */
    private final boolean f371870b;

    /* renamed from: c */
    private final boolean f371871c;

    public C136607bn(AccountId accountId, boolean z, boolean z2) {
        this.f371869a = accountId;
        this.f371870b = z;
        this.f371871c = z2;
    }

    /* renamed from: a */
    public final /* synthetic */ int mo113241a(int i, int i2) {
        return i2 - i;
    }

    /* renamed from: b */
    public final Fragment mo113242b() {
        AccountId accountId = this.f371869a;
        C136596bc bcVar = new C136596bc();
        C68324h.m98669f(bcVar);
        C47247a.m84047b(bcVar, accountId);
        return bcVar;
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
        if (mo113248h()) {
            C136579an.m221962c(this, view);
        } else {
            view.setBackgroundResource(R.color.googleapp_minus_one_feed_background);
        }
    }

    /* renamed from: h */
    public final boolean mo113248h() {
        return !this.f371870b || !this.f371871c;
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
