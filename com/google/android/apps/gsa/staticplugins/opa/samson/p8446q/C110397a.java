package com.google.android.apps.gsa.staticplugins.opa.samson.p8446q;

import android.accounts.Account;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.apps.gsa.assistant.shared.u;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.q.a */
/* compiled from: PG */
public final class C110397a {

    /* renamed from: a */
    public final C68214a f307677a;

    /* renamed from: b */
    private final C68214a f307678b;

    /* renamed from: c */
    private final C68214a f307679c;

    public C110397a(C68214a aVar, C68214a aVar2, C68214a aVar3) {
        this.f307677a = aVar;
        this.f307678b = aVar2;
        this.f307679c = aVar3;
    }

    /* renamed from: a */
    public final String mo98623a() {
        Account a = ((C86054o) this.f307678b.mo27525b()).mo79668a();
        if (a == null) {
            C58976aa aaVar = C58975e.f156826a;
            return null;
        }
        String str = a.name;
        if (str != null) {
            return str;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        return null;
    }

    /* renamed from: b */
    public final boolean mo98624b(boolean z) {
        if (mo98625c()) {
            return true;
        }
        if (!z) {
            return false;
        }
        C110399c cVar = (C110399c) this.f307679c.mo27525b();
        Boolean bool = cVar.f307686b;
        if (bool == null) {
            Intent registerReceiver = cVar.f307685a.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            return (registerReceiver == null || registerReceiver.getIntExtra("plugged", -1) == 0) ? false : true;
        } else if (bool.booleanValue()) {
            return true;
        }
    }

    /* renamed from: c */
    public final boolean mo98625c() {
        return ((u) this.f307677a.mo27525b()).c(mo98623a()) && ((u) this.f307677a.mo27525b()).b();
    }
}
