package com.google.android.apps.gsa.staticplugins.opa.samson.p8435j;

import android.accounts.Account;
import android.os.Bundle;
import com.google.android.apps.gsa.assistant.shared.l.t;
import com.google.android.apps.gsa.opaonboarding.C83869ac;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.apps.gsa.opaonboarding.C83956t;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8443o.C110308s;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.j.ak */
/* compiled from: PG */
public final class C110200ak extends C83869ac {

    /* renamed from: a */
    private final C110202am f307074a;

    /* renamed from: b */
    private final C83893b f307075b;

    /* renamed from: c */
    private final C110308s f307076c;

    protected C110200ak(C110202am amVar, C83893b bVar, C110308s sVar) {
        this.f307074a = amVar;
        this.f307075b = bVar;
        this.f307076c = sVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C83956t mo77207a() {
        C110198ai aiVar = (C110198ai) C110199aj.f307070c.createBuilder();
        t tVar = this.f307074a.f307080b;
        if (tVar == null) {
            tVar = t.d;
        }
        aiVar.copyOnWrite();
        C110199aj ajVar = (C110199aj) aiVar.instance;
        tVar.getClass();
        ajVar.f307073b = tVar;
        ajVar.f307072a |= 1;
        C58976aa aaVar = C58975e.f156826a;
        C110197ah ahVar = new C110197ah();
        Bundle bundle = new Bundle();
        bundle.putByteArray("args", ((C110199aj) aiVar.build()).toByteArray());
        return C83875ai.m133540e(ahVar, bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo77208b() {
        Account account;
        if (this.f307075b.mo77278a().mo56113h() && (account = (Account) this.f307075b.mo77278a().mo56107c()) != null) {
            t tVar = this.f307074a.f307080b;
            if (tVar == null) {
                tVar = t.d;
            }
            if (!tVar.b.isEmpty()) {
                C110308s sVar = this.f307076c;
                t tVar2 = this.f307074a.f307080b;
                if (tVar2 == null) {
                    tVar2 = t.d;
                }
                if (!sVar.mo98555c(account, tVar2.b)) {
                    return true;
                }
            }
        }
        return false;
    }
}
