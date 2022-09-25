package com.google.android.libraries.search.p2904c.p2908b.p2909a;

import com.google.android.libraries.search.p2904c.p2908b.C37363a;
import com.google.android.libraries.search.p2904c.p2908b.C37384h;
import com.google.android.libraries.search.p2904c.p2916e.C37539c;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.libraries.search.c.b.a.f */
/* compiled from: PG */
public final class C37369f {

    /* renamed from: a */
    private static final C59071e f99253a = C59071e.m91332i("com.google.android.libraries.search.c.b.a.f");

    /* renamed from: b */
    private final EnumMap f99254b = new EnumMap(C37384h.class);

    /* renamed from: c */
    private final EnumMap f99255c = new EnumMap(C37384h.class);

    /* renamed from: a */
    public final synchronized int mo40907a(C37384h hVar, C37539c cVar) {
        Set set = (Set) this.f99255c.get(hVar);
        if (set == null) {
            set = new HashSet(1);
        } else if (set.contains(cVar)) {
            ((C59052c) ((C59052c) f99253a.mo56226d()).mo56372aa(52652)).mo56353F("#audio# Unexpected connection, adapter (%s) is already linked with (%s), skip", hVar.name(), cVar.f99731b);
            return -1;
        }
        set.add(cVar);
        this.f99255c.put(hVar, set);
        return set.size();
    }

    /* renamed from: b */
    public final synchronized int mo40908b(C37384h hVar, C37539c cVar) {
        Set set = (Set) this.f99255c.get(hVar);
        if (set != null) {
            if (set.contains(cVar)) {
                set.remove(cVar);
                return set.size();
            }
        }
        ((C59052c) ((C59052c) f99253a.mo56224b()).mo56372aa(52653)).mo56353F("#audio# Trying to disconnect adapter (%s), but no such (%s) connection", hVar.name(), cVar.f99731b);
        return -1;
    }

    /* renamed from: c */
    public final synchronized C58833ax mo40909c(C37384h hVar) {
        return C58833ax.m90833j((C37363a) this.f99254b.get(hVar));
    }

    /* renamed from: d */
    public final synchronized List mo40910d(C37384h hVar) {
        C58485gu guVar;
        Set set = (Set) this.f99255c.get(hVar);
        if (set != null) {
            guVar = C58485gu.m89842j(set);
        } else {
            guVar = C58485gu.m89845m();
        }
        return guVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        return false;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo40911e(com.google.android.libraries.search.p2904c.p2908b.C37384h r2, com.google.android.libraries.search.p2904c.p2916e.C37539c r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.EnumMap r0 = r1.f99255c     // Catch:{ all -> 0x0017 }
            java.lang.Object r2 = r0.get(r2)     // Catch:{ all -> 0x0017 }
            java.util.Set r2 = (java.util.Set) r2     // Catch:{ all -> 0x0017 }
            if (r2 == 0) goto L_0x0014
            boolean r2 = r2.contains(r3)     // Catch:{ all -> 0x0017 }
            if (r2 == 0) goto L_0x0014
            monitor-exit(r1)
            r2 = 1
            return r2
        L_0x0014:
            monitor-exit(r1)
            r2 = 0
            return r2
        L_0x0017:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.p2904c.p2908b.p2909a.C37369f.mo40911e(com.google.android.libraries.search.c.b.h, com.google.android.libraries.search.c.e.c):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final synchronized boolean mo40912f(C37384h hVar, C37363a aVar) {
        if (this.f99254b.containsKey(hVar)) {
            ((C59052c) ((C59052c) f99253a.mo56226d()).mo56372aa(52654)).mo56389s("#audio# Adapter (%s) is already registered, skip", hVar.name());
            return false;
        }
        this.f99254b.put(hVar, aVar);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final synchronized boolean mo40913g(C37384h hVar) {
        hVar.name();
        this.f99255c.remove(hVar);
        if (((C37363a) this.f99254b.remove(hVar)) != null) {
            return true;
        }
        ((C59052c) ((C59052c) f99253a.mo56226d()).mo56372aa(52656)).mo56389s("#audio# Trying to unregister AudioAdapter with key %s, but no AudioAdapter is registered to that key", hVar.name());
        return false;
    }
}
