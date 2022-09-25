package com.google.android.apps.gsa.tasks;

import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84474e;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C89963ab;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.common.p4522b.C58662ni;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.tasks.bf */
/* compiled from: PG */
public final class C118503bf {

    /* renamed from: b */
    private static final C59071e f328906b = C59071e.m91332i("com.google.android.apps.gsa.tasks.bf");

    /* renamed from: c */
    private static final C118502be f328907c = C118499bb.f328903a;

    /* renamed from: d */
    private static final C118502be f328908d = C118500bc.f328904a;

    /* renamed from: e */
    private static final C118502be f328909e = C118501bd.f328905a;

    /* renamed from: a */
    public final AtomicReference f328910a = new AtomicReference(new EnumMap(C118522by.class));

    /* renamed from: f */
    private final C86124t f328911f;

    /* renamed from: g */
    private final C84474e f328912g;

    /* renamed from: h */
    private final Map f328913h;

    public C118503bf(Map map, C86124t tVar, C84474e eVar) {
        C58976aa aaVar = C58975e.f156826a;
        this.f328913h = map;
        this.f328911f = tVar;
        this.f328912g = eVar;
    }

    /* renamed from: a */
    static /* synthetic */ C118474ai m196724a(C118474ai aiVar, String str) {
        long j;
        try {
            if (str.length() >= 2) {
                char lowerCase = Character.toLowerCase(str.charAt(str.length() - 1));
                long parseLong = Long.parseLong(str.substring(0, str.length() - 1));
                if (lowerCase == 'd') {
                    j = TimeUnit.DAYS.toMillis(parseLong);
                } else if (lowerCase == 'h') {
                    j = TimeUnit.HOURS.toMillis(parseLong);
                } else if (lowerCase == 'm') {
                    j = TimeUnit.MINUTES.toMillis(parseLong);
                } else if (lowerCase == 'w') {
                    j = TimeUnit.DAYS.toMillis(parseLong * 7);
                } else {
                    throw new NumberFormatException("Wrong time unit: " + lowerCase);
                }
                if (j < C118567z.f329183a) {
                    C59104x d = f328906b.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "PerTaskSpecUpdater");
                    ((C59052c) ((C59052c) d).mo56372aa(33988)).mo56388r("Received period is too short: %d", j);
                    int i = C90755l.f253831a;
                    return aiVar;
                }
                C58976aa aaVar = C58975e.f156826a;
                C118473ah ahVar = (C118473ah) aiVar.toBuilder();
                ahVar.copyOnWrite();
                C118474ai aiVar2 = (C118474ai) ahVar.instance;
                aiVar2.f328832a |= 1;
                aiVar2.f328833b = j;
                return (C118474ai) ahVar.build();
            }
            throw new NumberFormatException("Time duration should be at least 2 characters long.");
        } catch (NumberFormatException e) {
            C59104x d2 = f328906b.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "PerTaskSpecUpdater");
            ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e)).mo56372aa(33987)).mo56389s("Received period is improperly formatted: %s", str);
            int i2 = C90755l.f253831a;
        }
    }

    /* renamed from: c */
    private static void m196725c(C118502be beVar, List list, Map map) {
        C118522by byVar;
        if (list.size() % 2 == 0) {
            for (int i = 0; i < list.size() - 1; i += 2) {
                String str = (String) list.get(i);
                String str2 = (String) list.get(i + 1);
                try {
                    byVar = C118522by.m196757a(str);
                } catch (IllegalArgumentException unused) {
                    byVar = null;
                }
                C118474ai aiVar = (C118474ai) map.get(byVar);
                if (!(byVar == null || aiVar == null)) {
                    map.put(byVar, beVar.mo103725a(aiVar, str2));
                }
            }
            return;
        }
        C59104x c = f328906b.mo56225c();
        c.mo56378ag(C58975e.f156826a, "PerTaskSpecUpdater");
        ((C59052c) ((C59052c) c).mo56372aa(33990)).mo56386p("The size of key-value array should be even.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo103726b() {
        C118474ai aiVar;
        EnumMap enumMap = new EnumMap(C118522by.class);
        for (Map.Entry entry : this.f328913h.entrySet()) {
            C118474ai aiVar2 = (C118474ai) ((C69464a) entry.getValue()).mo17428b();
            if (aiVar2.f328837f) {
                enumMap.put((C118522by) entry.getKey(), aiVar2);
            }
        }
        m196725c(f328909e, this.f328911f.mo79745c(C89963ab.f246492i), enumMap);
        m196725c(f328907c, this.f328911f.mo79745c(C89963ab.f246491h), enumMap);
        m196725c(f328908d, this.f328911f.mo79745c(C89963ab.f246489f), enumMap);
        long b = this.f328912g.mo78113b();
        if (b > 0 && (aiVar = (C118474ai) enumMap.get(C118522by.REFRESH_SEARCH_HISTORY)) != null) {
            C118522by byVar = C118522by.REFRESH_SEARCH_HISTORY;
            enumMap.put(byVar, m196724a(aiVar, b + "m"));
        }
        this.f328910a.set(C58662ni.m90343b(enumMap));
    }
}
