package com.google.apps.tiktok.contrib.p3629c;

import android.app.Activity;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.View;
import androidx.navigation.C3807af;
import androidx.navigation.fragment.C3883g;
import androidx.navigation.fragment.C3884h;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.base.C58833ax;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.apps.tiktok.contrib.c.f */
/* compiled from: PG */
public final class C46485f {

    /* renamed from: a */
    private final AccountId f121632a;

    /* renamed from: b */
    private final C47770dh f121633b;

    /* renamed from: c */
    private final C69464a f121634c;

    public C46485f(AccountId accountId, C47770dh dhVar, C69464a aVar) {
        this.f121632a = accountId;
        this.f121633b = dhVar;
        this.f121634c = aVar;
    }

    /* renamed from: a */
    public final View.OnClickListener mo50480a(int i, Bundle bundle, String str) {
        return new C47591co(this.f121633b, str, new C46481b(this, i, bundle));
    }

    /* renamed from: b */
    public final C3884h mo50481b(int i, Bundle bundle) {
        C46493n.m82877b(C58833ax.m90834k(this.f121632a), bundle);
        return C3883g.m11185a(i, bundle);
    }

    /* renamed from: c */
    public final C46496q mo50482c(Fragment fragment) {
        return new C46498s(C58833ax.m90834k(this.f121632a), new C46483d(fragment), this.f121634c);
    }

    /* renamed from: d */
    public final C46496q mo50483d(View view) {
        return new C46498s(C58833ax.m90834k(this.f121632a), new C46482c(view), this.f121634c);
    }

    /* renamed from: e */
    public final C46496q mo50484e(C3807af afVar) {
        return new C46498s(C58833ax.m90834k(this.f121632a), new C46480a(afVar), this.f121634c);
    }

    /* renamed from: f */
    public final C46496q mo50485f(Activity activity) {
        return new C46498s(C58833ax.m90834k(this.f121632a), new C46484e(activity), this.f121634c);
    }
}
