package com.google.android.apps.search.googleapp.launcher.minusone;

import android.support.p031v4.app.Fragment;
import android.view.View;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10344c.C136455h;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.p337aa.p338a.C6610l;
import dagger.hilt.android.internal.managers.C68324h;
import java.io.PrintWriter;

/* renamed from: com.google.android.apps.search.googleapp.launcher.minusone.cm */
/* compiled from: PG */
final class C136635cm implements C136580ao {

    /* renamed from: a */
    private final AccountId f371934a;

    /* renamed from: b */
    private final C136455h f371935b;

    public C136635cm(AccountId accountId, C136455h hVar) {
        this.f371934a = accountId;
        this.f371935b = hVar;
    }

    /* renamed from: a */
    public final /* synthetic */ int mo113241a(int i, int i2) {
        return i2 - i;
    }

    /* renamed from: b */
    public final Fragment mo113242b() {
        AccountId accountId = this.f371934a;
        C136455h hVar = this.f371935b;
        C136624cb cbVar = new C136624cb();
        C68324h.m98669f(cbVar);
        C47247a.m84047b(cbVar, accountId);
        C47243l.m84039a(cbVar, hVar);
        return cbVar;
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
