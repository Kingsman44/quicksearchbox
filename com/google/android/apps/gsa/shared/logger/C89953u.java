package com.google.android.apps.gsa.shared.logger;

import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p395al.p408c.p414c.p416b.C8502l;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.shared.logger.u */
/* compiled from: PG */
public final class C89953u {

    /* renamed from: b */
    private static final long f246464b = TimeUnit.HOURS.toMillis(2);

    /* renamed from: c */
    private static final long f246465c = TimeUnit.HOURS.toMillis(2);

    /* renamed from: d */
    private static final Object f246466d = new Object();

    /* renamed from: a */
    public volatile List f246467a = new ArrayList();

    /* renamed from: e */
    private final C21370a f246468e;

    /* renamed from: f */
    private final Map f246469f = new EnumMap(C8502l.class);

    public C89953u(C21370a aVar) {
        this.f246468e = aVar;
    }

    /* renamed from: a */
    public final void mo83805a(C8502l lVar) {
        synchronized (f246466d) {
            this.f246469f.put(lVar, Long.valueOf(this.f246468e.mo26871c()));
        }
    }

    /* renamed from: b */
    public final boolean mo83806b(C8502l lVar) {
        long j;
        C8502l lVar2 = C8502l.STATE_DUMP;
        int ordinal = lVar.ordinal();
        if (ordinal == 0) {
            j = f246464b;
        } else if (ordinal != 1) {
            j = -1;
        } else {
            j = f246465c;
        }
        if (j < 0) {
            C58976aa aaVar = C58975e.f156826a;
            return true;
        }
        synchronized (f246466d) {
            Long l = (Long) this.f246469f.get(lVar);
            if (l == null) {
                C58976aa aaVar2 = C58975e.f156826a;
                return false;
            } else if (this.f246468e.mo26871c() - l.longValue() <= j) {
                C58976aa aaVar3 = C58975e.f156826a;
                return true;
            } else {
                C58976aa aaVar4 = C58975e.f156826a;
                return false;
            }
        }
    }
}
