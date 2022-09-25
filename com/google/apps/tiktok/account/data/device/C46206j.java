package com.google.apps.tiktok.account.data.device;

import android.content.Context;
import android.content.IntentFilter;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import java.util.Set;

/* renamed from: com.google.apps.tiktok.account.data.device.j */
/* compiled from: PG */
public final class C46206j {

    /* renamed from: a */
    public final Set f121141a;

    /* renamed from: b */
    private final Context f121142b;

    /* renamed from: c */
    private final C60887da f121143c;

    /* renamed from: d */
    private final C46459k f121144d;

    /* renamed from: e */
    private boolean f121145e = false;

    public C46206j(Context context, Set set, C60887da daVar, C46459k kVar) {
        this.f121142b = context;
        this.f121141a = set;
        this.f121143c = daVar;
        this.f121144d = kVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C60870cx mo50260a() {
        C60870cx n = C60856cj.m92905n(C47810es.m84965e(new C46205i(this)), this.f121143c);
        this.f121144d.mo50456d(n, C47831fm.m85015j());
        return n;
    }

    /* renamed from: b */
    public final synchronized void mo50261b() {
        if (!this.f121145e) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.accounts.LOGIN_ACCOUNTS_CHANGED");
            this.f121142b.registerReceiver(new C46204h(), intentFilter);
            this.f121145e = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized boolean mo50262c() {
        return this.f121145e;
    }
}
