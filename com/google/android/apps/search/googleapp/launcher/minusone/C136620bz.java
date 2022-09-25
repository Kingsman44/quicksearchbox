package com.google.android.apps.search.googleapp.launcher.minusone;

import android.support.p031v4.app.Fragment;
import android.view.View;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.p337aa.p338a.C6610l;
import dagger.hilt.android.internal.managers.C68324h;
import java.io.PrintWriter;

/* renamed from: com.google.android.apps.search.googleapp.launcher.minusone.bz */
/* compiled from: PG */
final class C136620bz implements C136580ao {

    /* renamed from: a */
    private final AccountId f371909a;

    public C136620bz(AccountId accountId) {
        this.f371909a = accountId;
    }

    /* renamed from: a */
    public final /* synthetic */ int mo113241a(int i, int i2) {
        return i2 - i;
    }

    /* renamed from: b */
    public final Fragment mo113242b() {
        AccountId accountId = this.f371909a;
        C136588aw awVar = new C136588aw();
        C68324h.m98669f(awVar);
        C47247a.m84047b(awVar, accountId);
        return awVar;
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
    public final /* synthetic */ void mo113247g(View view) {
    }

    /* renamed from: h */
    public final /* synthetic */ boolean mo113248h() {
        return false;
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
