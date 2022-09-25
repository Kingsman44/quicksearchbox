package com.google.apps.tiktok.inject.p3654a;

import android.app.Activity;
import com.google.android.apps.gsa.binaries.satin.app.C73957bl;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47182a;
import com.google.apps.tiktok.inject.p3657c.C47215a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import dagger.hilt.C68286a;
import dagger.hilt.p5299a.C68288b;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.apps.tiktok.inject.a.d */
/* compiled from: PG */
public final class C47195d {

    /* renamed from: a */
    public final Object f122855a = new Object();

    /* renamed from: b */
    public final Map f122856b = new HashMap();

    /* renamed from: c */
    public final C47197e f122857c;

    /* renamed from: d */
    private final C47215a f122858d;

    /* renamed from: e */
    private final boolean f122859e;

    /* renamed from: com.google.apps.tiktok.inject.a.d$a */
    /* compiled from: PG */
    public interface C47196a {
        /* renamed from: a */
        C73957bl mo51104a();
    }

    public C47195d(C47215a aVar, C47197e eVar) {
        this.f122858d = aVar;
        this.f122857c = eVar;
        C58833ax axVar = eVar.f122860a;
        boolean z = false;
        if (axVar.mo56113h() && (axVar.mo56107c() instanceof C47182a)) {
            z = true;
        }
        this.f122859e = z;
    }

    /* renamed from: a */
    public final Object mo51101a(AccountId accountId) {
        Set c = mo51103c();
        boolean z = true;
        if (!this.f122859e && !c.isEmpty() && (c.size() != 1 || !c.contains(accountId))) {
            z = false;
        }
        C58838bb.m90890y(z, "There is already an account id in use! TikTok does not support multiple accounts yet.\n\tCurrent AccountId: %s\n\tNew AccountId: %s", c, accountId);
        C58838bb.m90887v(this.f122858d.mo51121p().getApplicationContext() instanceof C68288b, "Sting Activity must be attached to an @Sting Application. Found: %s", this.f122858d.mo51121p().getApplicationContext());
        C47197e eVar = this.f122857c;
        if (eVar.f122860a.mo56113h()) {
            C73957bl a = ((C47196a) C68286a.m98629a(eVar.f122861b.mo51094a(accountId).mo51100a(), C47196a.class)).mo51104a();
            a.f205201a = (Activity) eVar.f122860a.mo56107c();
            return a.mo68967a();
        }
        C73957bl a2 = ((C47196a) C68286a.m98629a(eVar.f122861b.mo51094a(accountId).mo51100a(), C47196a.class)).mo51104a();
        a2.f205202b = eVar.f122862c;
        return a2.mo68967a();
    }

    /* renamed from: b */
    public final Object mo51102b(AccountId accountId) {
        Object obj;
        synchronized (this.f122855a) {
            if (!this.f122856b.containsKey(accountId)) {
                this.f122856b.put(accountId, mo51101a(accountId));
            }
            obj = this.f122856b.get(accountId);
        }
        return obj;
    }

    /* renamed from: c */
    public final Set mo51103c() {
        Set unmodifiableSet;
        synchronized (this.f122855a) {
            unmodifiableSet = Collections.unmodifiableSet(this.f122856b.keySet());
        }
        return unmodifiableSet;
    }
}
