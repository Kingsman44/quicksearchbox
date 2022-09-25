package com.google.apps.tiktok.account.api.controller;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.p104d.p105a.C2169h;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.C46428ao;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;

/* renamed from: com.google.apps.tiktok.account.api.controller.ck */
/* compiled from: PG */
final class C46027ck implements C45966ad {

    /* renamed from: a */
    public final Context f120877a;

    /* renamed from: b */
    public final C46428ao f120878b;

    /* renamed from: c */
    public final String f120879c;

    /* renamed from: d */
    private final C45966ad f120880d;

    /* renamed from: e */
    private final Object f120881e = new Object();

    /* renamed from: f */
    private volatile boolean f120882f;

    public C46027ck(Context context, C45974al alVar, C46428ao aoVar) {
        this.f120877a = context;
        this.f120880d = alVar;
        this.f120878b = aoVar;
        this.f120879c = "com.google.android.apps.gsa.nga.permissions.EDIT_PREFERENCES";
    }

    /* renamed from: a */
    public final C60870cx mo50117a() {
        C47558bi a = C47831fm.m85006a("Notify requirement state changed");
        try {
            Intent intent = new Intent("com.google.apps.tiktok.account.api.controller.REQUIREMENT_STATE_CHANGED");
            intent.setPackage(this.f120877a.getPackageName());
            C60870cx a2 = C2169h.m6027a(new C46025ci(this, intent, C47816ey.m84988b()));
            a.mo51417a(a2);
            a.close();
            return a2;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }

    /* renamed from: b */
    public final C60870cx mo50118b(AccountId accountId) {
        return ((C45974al) this.f120880d).mo50124h(accountId);
    }

    /* renamed from: c */
    public final void mo50119c(C45965ac acVar) {
        if (!this.f120882f) {
            synchronized (this.f120881e) {
                if (!this.f120882f) {
                    this.f120877a.registerReceiver(new C46021ce(), new IntentFilter("com.google.apps.tiktok.account.api.controller.REQUIREMENT_STATE_CHANGED"), this.f120879c, this.f120878b);
                    this.f120882f = true;
                }
            }
        }
        this.f120880d.mo50119c(acVar);
    }

    /* renamed from: d */
    public final void mo50120d(C45965ac acVar) {
        this.f120880d.mo50120d(acVar);
    }

    /* renamed from: e */
    public final C58485gu mo50121e() {
        return this.f120880d.mo50121e();
    }

    /* renamed from: f */
    public final C60870cx mo50122f(AccountId accountId, C58485gu guVar) {
        return ((C45974al) this.f120880d).mo50125i(accountId, guVar);
    }

    /* renamed from: g */
    public final C60870cx mo50123g(AccountId accountId, List list, Intent intent) {
        return this.f120880d.mo50123g(accountId, list, intent);
    }
}
