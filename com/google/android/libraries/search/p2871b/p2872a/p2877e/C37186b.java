package com.google.android.libraries.search.p2871b.p2872a.p2877e;

import com.google.android.libraries.search.p2871b.p2892g.C37239a;
import com.google.android.libraries.search.p2871b.p2892g.C37240b;
import com.google.android.libraries.search.p2871b.p2892g.C37242d;
import com.google.android.libraries.search.p2871b.p2892g.C37243e;
import com.google.android.libraries.search.p2871b.p2892g.C37244f;
import com.google.android.libraries.search.p2871b.p2892g.C37245g;
import com.google.android.libraries.search.p2871b.p2892g.C37246h;
import com.google.common.p4522b.C58490gz;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.libraries.search.b.a.e.b */
/* compiled from: PG */
public final class C37186b implements C37242d {

    /* renamed from: a */
    final Map f98337a;

    /* renamed from: b */
    final Map f98338b;

    /* renamed from: c */
    C37243e f98339c = null;

    public C37186b() {
        HashMap hashMap = new HashMap();
        this.f98337a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f98338b = hashMap2;
        hashMap.put(0, new C37245g(0, "FLOW_TYPE_UNKNOWN"));
        hashMap.put(1, new C37245g(1, "NONE"));
        hashMap.put(101, new C37245g(101, "WORKS_WITH_GOOGLE_ACCOUNT_LINKING"));
        hashMap2.put(0, new C37244f(0, "UNKNOWN_EVENT"));
        hashMap2.put(1, new C37244f(1, "META_START_EVENT"));
        hashMap2.put(2, new C37244f(2, "META_END_EVENT"));
        hashMap2.put(101, new C37244f(101, "WORKS_WITH_GOOGLE_ACCOUNT_LINKING_START_FROM_PROVIDER_LINK_INTENT"));
        hashMap2.put(102, new C37244f(102, "WORKS_WITH_GOOGLE_ACCOUNT_LINKING_START_FROM_USER_LINK_SELECTION"));
        hashMap2.put(103, new C37244f(103, "WORKS_WITH_GOOGLE_ACCOUNT_LINKING_START_FROM_USER_RESYNC_SELECTION"));
        hashMap2.put(105, new C37244f(105, "WORKS_WITH_GOOGLE_ACCOUNT_LINKING_OAUTH"));
        hashMap2.put(106, new C37244f(106, "WORKS_WITH_GOOGLE_ACCOUNT_LINKING_SYNC"));
        hashMap2.put(107, new C37244f(107, "WORKS_WITH_GOOGLE_ACCOUNT_LINKING_END"));
        C58490gz gzVar = new C58490gz(4);
        new C58490gz(4);
        this.f98339c = new C37246h(1962, "home_library_android", "Android Home Library", gzVar.mo55427f(true));
    }

    /* renamed from: a */
    public final C37239a mo40690a(int i) {
        Map map = this.f98338b;
        Integer valueOf = Integer.valueOf(i);
        if (map.containsKey(valueOf)) {
            return (C37239a) this.f98338b.get(valueOf);
        }
        return new C37244f(i, String.valueOf(i));
    }

    /* renamed from: b */
    public final C37240b mo40691b(int i) {
        C37240b bVar = (C37240b) this.f98337a.get(Integer.valueOf(i));
        if (bVar != null) {
            return bVar;
        }
        return new C37245g(i, String.valueOf(i));
    }

    /* renamed from: c */
    public final C37243e mo40692c() {
        return this.f98339c;
    }
}
