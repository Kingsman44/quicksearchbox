package com.google.android.libraries.search.p2871b.p2872a.p2885m;

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

/* renamed from: com.google.android.libraries.search.b.a.m.b */
/* compiled from: PG */
public final class C37210b implements C37242d {

    /* renamed from: a */
    final Map f98848a;

    /* renamed from: b */
    final Map f98849b;

    /* renamed from: c */
    C37243e f98850c = null;

    public C37210b() {
        HashMap hashMap = new HashMap();
        this.f98848a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f98849b = hashMap2;
        hashMap.put(0, new C37245g(0, "FLOW_TYPE_UNKNOWN"));
        hashMap.put(1, new C37245g(1, "NONE"));
        hashMap.put(101, new C37245g(101, "SODA_ASR_SESSION"));
        hashMap.put(102, new C37245g(102, "SODA_QUICK_PHRASES_CONFIG_SESSION"));
        hashMap2.put(0, new C37244f(0, "UNKNOWN_EVENT"));
        hashMap2.put(1, new C37244f(1, "META_START_EVENT"));
        hashMap2.put(2, new C37244f(2, "META_END_EVENT"));
        hashMap2.put(101, new C37244f(101, "SODA_START_ASR"));
        hashMap2.put(102, new C37244f(102, "SODA_START_ASR_ON_HOTWORD"));
        hashMap2.put(103, new C37244f(103, "SODA_STOP"));
        hashMap2.put(104, new C37244f(104, "SODA_RESTART_ASR"));
        hashMap2.put(105, new C37244f(105, "SODA_ON_DEVICE_ASR_START"));
        hashMap2.put(106, new C37244f(106, "SODA_ON_DEVICE_ASR_END"));
        hashMap2.put(107, new C37244f(107, "SODA_ON_DEVICE_ASR_CANCEL"));
        hashMap2.put(108, new C37244f(108, "SODA_ON_DEVICE_ASR_PARTIAL"));
        hashMap2.put(109, new C37244f(109, "SODA_ON_DEVICE_ASR_PREFETCH"));
        hashMap2.put(110, new C37244f(110, "SODA_ON_DEVICE_ASR_FINAL"));
        hashMap2.put(111, new C37244f(111, "SODA_SERVER_ASR_START"));
        hashMap2.put(112, new C37244f(112, "SODA_SERVER_ASR_END"));
        hashMap2.put(113, new C37244f(113, "SODA_SERVER_ASR_PARTIAL"));
        hashMap2.put(114, new C37244f(114, "SODA_SERVER_ASR_PREFETCH"));
        hashMap2.put(115, new C37244f(115, "SODA_SERVER_ASR_FINAL"));
        hashMap2.put(116, new C37244f(116, "SODA_HYBRID_SESSION_START"));
        hashMap2.put(117, new C37244f(117, "SODA_HYBRID_SESSION_END"));
        hashMap2.put(118, new C37244f(118, "SODA_HYBRID_PARTIAL_SELECTION"));
        hashMap2.put(119, new C37244f(119, "SODA_HYBRID_PREFETCH_SELECTION"));
        hashMap2.put(120, new C37244f(120, "SODA_HYBRID_FINAL_SELECTION"));
        hashMap2.put(121, new C37244f(121, "SODA_WARM_WORDS_FINAL_MATCH_REJECTION"));
        hashMap2.put(122, new C37244f(122, "SODA_QUICK_PHRASES_CONFIG_START"));
        hashMap2.put(123, new C37244f(123, "SODA_QUICK_PHRASES_CONFIG_END"));
        hashMap2.put(124, new C37244f(124, "SODA_QUICK_PHRASES_MIC_OPEN"));
        hashMap2.put(125, new C37244f(125, "SODA_QUICK_PHRASES_MIC_CLOSE"));
        C58490gz gzVar = new C58490gz(4);
        new C58490gz(4);
        this.f98850c = new C37246h(2369, "soda_android", "SODA Android", gzVar.mo55427f(true));
    }

    /* renamed from: a */
    public final C37239a mo40690a(int i) {
        Map map = this.f98849b;
        Integer valueOf = Integer.valueOf(i);
        if (map.containsKey(valueOf)) {
            return (C37239a) this.f98849b.get(valueOf);
        }
        return new C37244f(i, String.valueOf(i));
    }

    /* renamed from: b */
    public final C37240b mo40691b(int i) {
        C37240b bVar = (C37240b) this.f98848a.get(Integer.valueOf(i));
        if (bVar != null) {
            return bVar;
        }
        return new C37245g(i, String.valueOf(i));
    }

    /* renamed from: c */
    public final C37243e mo40692c() {
        return this.f98850c;
    }
}
