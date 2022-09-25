package com.google.android.apps.gsa.search.core.google.p6790a;

import com.google.android.apps.gsa.nga.api.C74713bn;
import com.google.android.apps.gsa.nga.api.C74715bp;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.assistant.p3897e.p3917i.p3918a.C51313db;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.search.core.google.a.ax */
/* compiled from: PG */
public final class C85805ax {

    /* renamed from: a */
    private final C86124t f232023a;

    /* renamed from: b */
    private final C58833ax f232024b;

    /* renamed from: c */
    private final C58833ax f232025c;

    public C85805ax(C86124t tVar, C58833ax axVar, C58833ax axVar2) {
        this.f232023a = tVar;
        this.f232024b = axVar;
        this.f232025c = axVar2;
    }

    /* renamed from: a */
    public final C51313db mo79449a(Query query) {
        String bn = query.mo84355bn();
        if ("and.opa.chrome.mic".equals(query.mo84355bn()) && query.mo84263a("android.opa.extra.TRIGGERED_BY") == 103) {
            return C51313db.CHROME;
        }
        if (query.mo84375cH()) {
            if (query.mo84263a("android.opa.extra.TRIGGERED_BY") == 32) {
                return C51313db.LENS_INTENT;
            }
            return C51313db.EYES;
        } else if ("com.waze".equals(query.mo84351bj())) {
            return C51313db.WAZE;
        } else {
            String bn2 = query.mo84355bn();
            if (bn2 != null && bn2.startsWith("and.opa.appinteg.youtube")) {
                return C51313db.YT_APP_INTEGRATION;
            }
            if (this.f232023a.mo79746e(C90014bt.f247558jS) && (query.mo84363bw("android.opa.extra.PROACTIVE_ENABLED") || (bn != null && bn.startsWith("and.opa.appinteg.am")))) {
                return C51313db.MAESTRO_PROACTIVE;
            }
            if (query.mo84404ck()) {
                return C51313db.GMM;
            }
            if (query.mo84263a("android.opa.extra.TRIGGERED_BY") == 49 || query.mo84263a("android.opa.extra.LAUNCHED_ON") == 7 || "and.opa.appinteg.gha.mic".equals(query.mo84355bn())) {
                return C51313db.GHA;
            }
            if (query.mo84338bW() || !this.f232023a.mo79746e(C90014bt.f247444hK) || !this.f232024b.mo56113h() || !((C74715bp) this.f232024b.mo56107c()).mo71084e() || !this.f232025c.mo56113h() || !((C74713bn) this.f232025c.mo56107c()).mo71078c() || !query.mo84363bw("android.opa.extra.QUERY_INITIATED_BY_NGA")) {
                return C51313db.OPA;
            }
            return C51313db.NGA;
        }
    }
}
