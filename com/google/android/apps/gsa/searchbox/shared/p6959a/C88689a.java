package com.google.android.apps.gsa.searchbox.shared.p6959a;

import android.support.p033v7.widget.LinearLayoutManager;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89205j;
import com.google.common.p4552o.amt;
import com.google.common.p4552o.apd;

/* renamed from: com.google.android.apps.gsa.searchbox.shared.a.a */
/* compiled from: PG */
public final class C88689a {
    /* renamed from: a */
    public static void m143517a(C89205j jVar, amt amt) {
        m143518b(jVar, ((apd) amt.instance).f159618j);
        long b = jVar.mo83162b("CLIENT_EXPERIMENT_TRIGGERED_FLAGS");
        amt.copyOnWrite();
        apd apd = (apd) amt.instance;
        apd.f159610b |= LinearLayoutManager.INVALID_OFFSET;
        apd.f159588ae = b;
    }

    /* renamed from: b */
    public static void m143518b(C89205j jVar, String str) {
        if (!str.equals(jVar.mo83166f("PREVIOUS_QUERY"))) {
            long b = jVar.mo83162b("CLIENT_EXPERIMENT_TRIGGERED_FLAGS");
            jVar.mo83173m("CLIENT_EXPERIMENT_TRIGGERED_FLAGS", (b | (b << 32)) & -4294967296L);
            jVar.mo83176p("PREVIOUS_QUERY", str);
        }
    }

    /* renamed from: c */
    public static void m143519c(C89205j jVar) {
        jVar.mo83173m("CLIENT_EXPERIMENT_TRIGGERED_FLAGS", 0);
    }

    /* renamed from: d */
    public static void m143520d(C89205j jVar, long j, String str) {
        m143518b(jVar, str);
        jVar.mo83173m("CLIENT_EXPERIMENT_TRIGGERED_FLAGS", j | jVar.mo83162b("CLIENT_EXPERIMENT_TRIGGERED_FLAGS"));
    }
}
