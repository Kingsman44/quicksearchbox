package com.google.android.libraries.search.p2476a;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import com.google.android.apps.gsa.shared.util.p7188v.C91124a;
import com.google.android.apps.gsa.shared.util.p7188v.p7189a.C91129b;
import com.google.android.apps.gsa.shared.util.p7188v.p7189a.C91132e;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.android.libraries.search.p2476a.p2478b.C32162b;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.libraries.search.a.h */
/* compiled from: PG */
final class C32234h implements C32160b {

    /* renamed from: a */
    public final C60887da f86447a;

    /* renamed from: b */
    public final AccountManager f86448b;

    /* renamed from: c */
    public final C47770dh f86449c;

    /* renamed from: d */
    public final C39141kp f86450d;

    /* renamed from: e */
    public final Set f86451e = new HashSet();

    /* renamed from: f */
    public final Object f86452f = new Object();

    /* renamed from: g */
    public final C91124a f86453g;

    /* renamed from: h */
    private final Context f86454h;

    /* renamed from: i */
    private final C32162b f86455i;

    /* renamed from: j */
    private C32233g f86456j;

    public C32234h(Context context, C60887da daVar, AccountManager accountManager, C91124a aVar, C32162b bVar, C47770dh dhVar, C39141kp kpVar) {
        this.f86454h = context;
        this.f86447a = daVar;
        this.f86448b = accountManager;
        this.f86453g = aVar;
        this.f86455i = bVar;
        this.f86449c = dhVar;
        this.f86450d = kpVar;
    }

    /* renamed from: e */
    public static boolean m60014e(Account account, C58833ax axVar) {
        return !axVar.mo56113h() || ((Set) axVar.mo56107c()).contains(account.name);
    }

    /* renamed from: a */
    public final C60870cx mo37973a() {
        C60870cx b = mo37974b();
        C60870cx a = this.f86455i.mo37977a();
        return C47638k.m84753d(b, a).mo51520a(new C32211d(this, b, a), this.f86447a);
    }

    /* renamed from: b */
    public final C60870cx mo37974b() {
        C91132e eVar = (C91132e) this.f86455i;
        C91129b bVar = new C91129b(eVar);
        return C60856cj.m92905n(C47810es.m84965e(bVar), eVar.f254453c);
    }

    /* renamed from: c */
    public final void mo37975c(C32150a aVar) {
        synchronized (this.f86452f) {
            if (this.f86451e.isEmpty()) {
                if (this.f86456j == null) {
                    this.f86456j = new C32233g(this);
                }
                this.f86454h.registerReceiver(this.f86456j, new IntentFilter("com.google.android.apps.now.account_update_broadcast"), "com.google.android.apps.now.CURRENT_ACCOUNT_ACCESS", (Handler) null);
            }
            this.f86451e.add(aVar);
        }
    }

    /* renamed from: d */
    public final void mo37976d(C32150a aVar) {
        synchronized (this.f86452f) {
            this.f86451e.remove(aVar);
            if (this.f86451e.isEmpty()) {
                this.f86454h.unregisterReceiver(this.f86456j);
            }
        }
    }
}
