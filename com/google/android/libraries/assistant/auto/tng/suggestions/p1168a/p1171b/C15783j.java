package com.google.android.libraries.assistant.auto.tng.suggestions.p1168a.p1171b;

import com.google.android.apps.search.assistant.platform.pcp.p9338h.C124031c;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16364bk;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16382r;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16389y;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3803ag.p3809c.C48942ap;
import com.google.assistant.p3803ag.p3809c.C48963bj;
import com.google.assistant.p3897e.p3917i.p3918a.C51418gz;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.p4479cg.C58078j;
import com.google.p4479cg.C58079k;
import p3186j$.time.Instant;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.a.b.j */
/* compiled from: PG */
public final class C15783j implements C124031c {

    /* renamed from: a */
    public C58833ax f47018a = C58836b.f156633a;

    /* renamed from: b */
    private final C21370a f47019b;

    public C15783j(C21370a aVar) {
        this.f47019b = aVar;
    }

    /* renamed from: a */
    public final C58833ax mo22558a() {
        C48942ap apVar;
        if (!this.f47018a.mo56113h()) {
            return C58836b.f156633a;
        }
        C15777d dVar = (C15777d) this.f47018a.mo56107c();
        if (!dVar.mo22554j().mo56113h()) {
            return C58836b.f156633a;
        }
        C16389y a = C16389y.m33345a(((C16364bk) dVar.mo22554j().mo56107c()).f48171b);
        if (a == null) {
            a = C16389y.DRIVE_STATUS_UNKNOWN;
        }
        int ordinal = a.ordinal();
        if (ordinal == 0) {
            apVar = C48942ap.UNSPECIFIED;
        } else if (ordinal == 1) {
            apVar = C48942ap.VEHICLE_INIT;
        } else if (ordinal == 2) {
            apVar = C48942ap.PRE_DRIVE;
        } else if (ordinal == 3) {
            apVar = C48942ap.DURING_DRIVE;
        } else if (ordinal != 4) {
            apVar = null;
        } else {
            apVar = C48942ap.POST_DRIVE;
        }
        return C58833ax.m90833j(apVar);
    }

    /* renamed from: b */
    public final C58833ax mo22559b() {
        return C58836b.f156633a;
    }

    /* renamed from: c */
    public final C58833ax mo22560c() {
        return this.f47018a.mo56106b(C15782i.f47017a);
    }

    /* renamed from: d */
    public final C58833ax mo22561d() {
        if (!this.f47018a.mo56113h()) {
            return C58836b.f156633a;
        }
        C15777d dVar = (C15777d) this.f47018a.mo56107c();
        if ((dVar.mo22546d().f48221a & 2) == 0) {
            return C58836b.f156633a;
        }
        C16382r rVar = dVar.mo22546d().f48223c;
        if (rVar == null) {
            rVar = C16382r.f48214d;
        }
        C58078j jVar = (C58078j) C58079k.f155250c.createBuilder();
        double d = rVar.f48217b;
        jVar.copyOnWrite();
        ((C58079k) jVar.instance).f155252a = d;
        double d2 = rVar.f48218c;
        jVar.copyOnWrite();
        ((C58079k) jVar.instance).f155253b = d2;
        return C58833ax.m90834k((C58079k) jVar.build());
    }

    /* renamed from: e */
    public final C58833ax mo22562e() {
        return C58833ax.m90834k(Instant.ofEpochMilli(this.f47019b.mo26870b()));
    }

    /* renamed from: f */
    public final C58833ax mo22563f() {
        return this.f47018a.mo56106b(C15779f.f47014a);
    }

    /* renamed from: g */
    public final C58833ax mo22564g() {
        return C58836b.f156633a;
    }

    /* renamed from: h */
    public final C58833ax mo22565h() {
        C48963bj bjVar;
        if (!this.f47018a.mo56113h()) {
            return C58836b.f156633a;
        }
        int a = C51418gz.m86179a(((C15777d) this.f47018a.mo56107c()).mo22546d().f48222b);
        if (a == 0) {
            a = 1;
        }
        C16389y yVar = C16389y.DRIVE_STATUS_UNKNOWN;
        int i = a - 1;
        if (i == 1) {
            bjVar = C48963bj.NO_NAVIGATION;
        } else if (i == 2) {
            bjVar = C48963bj.GUIDED_NAVIGATION;
        } else if (i != 3) {
            bjVar = C48963bj.UNSPECIFIED;
        } else {
            bjVar = C48963bj.FREE_NAVIGATION;
        }
        return C58833ax.m90833j(bjVar);
    }

    /* renamed from: i */
    public final C58833ax mo22566i() {
        return this.f47018a.mo56106b(C15781h.f47016a);
    }

    /* renamed from: j */
    public final C58833ax mo22567j() {
        return C58836b.f156633a;
    }

    /* renamed from: k */
    public final C58833ax mo22568k() {
        return C58836b.f156633a;
    }
}
