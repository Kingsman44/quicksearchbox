package com.google.android.libraries.search.p2871b.p2872a.p2881i;

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

/* renamed from: com.google.android.libraries.search.b.a.i.b */
/* compiled from: PG */
public final class C37198b implements C37242d {

    /* renamed from: a */
    final Map f98679a;

    /* renamed from: b */
    final Map f98680b;

    /* renamed from: c */
    C37243e f98681c = null;

    public C37198b() {
        HashMap hashMap = new HashMap();
        this.f98679a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f98680b = hashMap2;
        hashMap.put(0, new C37245g(0, "FLOW_TYPE_UNKNOWN"));
        hashMap.put(1, new C37245g(1, "NONE"));
        hashMap.put(101, new C37245g(101, "CROSS_DEVICE_TIMER_TORUS_CONNECTION"));
        hashMap.put(102, new C37245g(102, "CROSS_DEVICE_TIMER_STATE_SYNCHRONIZATION_IN_AGSA"));
        hashMap.put(103, new C37245g(103, "CROSS_DEVICE_TIMER_WHOLE_HOME_CONVERSATION_INTERACTION"));
        hashMap2.put(0, new C37244f(0, "UNKNOWN_EVENT"));
        hashMap2.put(1, new C37244f(1, "META_START_EVENT"));
        hashMap2.put(2, new C37244f(2, "META_END_EVENT"));
        hashMap2.put(101, new C37244f(101, "CROSS_DEVICE_TIMER_TORUS_CONNECTION_REQUESTED"));
        hashMap2.put(102, new C37244f(102, "CROSS_DEVICE_TIMER_USONIA_DOWNLOADED_WHEN_CONNECTING_TO_TORUS"));
        hashMap2.put(103, new C37244f(103, "CROSS_DEVICE_TIMER_TORUS_CONNECTION_COMPLETED"));
        hashMap2.put(104, new C37244f(104, "CROSS_DEVICE_TIMER_REMOTE_STATUS_UPDATE_HANDLING_STARTED"));
        hashMap2.put(105, new C37244f(105, "CROSS_DEVICE_TIMER_REMOTE_STATUS_UPDATE_SHARED_TO_GELLER_AIAI_EGRESS"));
        hashMap2.put(106, new C37244f(106, "WHOLE_HOME_CONVERSATION_STARTED"));
        hashMap2.put(107, new C37244f(107, "WHOLE_HOME_CONVERSATION_CONTEXT_SESSION_READY"));
        hashMap2.put(108, new C37244f(108, "WHOLE_HOME_CONVERSATION_APA_CROSS_DEVICE_SERVICE_READY"));
        hashMap2.put(109, new C37244f(109, "WHOLE_HOME_CONVERSATION_APA_CONNECTION_READY"));
        hashMap2.put(110, new C37244f(110, "WHOLE_HOME_CONVERSATION_INTERACTION_FIRST_TURN_SUCCEED"));
        hashMap2.put(111, new C37244f(111, "WHOLE_HOME_CONVERSATION_INTERACTION_COMPLETED"));
        hashMap2.put(112, new C37244f(112, "WHOLE_HOME_CONVERSATION_INTERACTION_FIRST_TURN_FAILED"));
        hashMap2.put(113, new C37244f(113, "WHOLE_HOME_CONVERSATION_INTERACTION_SECOND_TURN_FAILED"));
        C58490gz gzVar = new C58490gz(4);
        new C58490gz(4);
        this.f98681c = new C37246h(1947, "opa_proactive_agsa", "Proactive Assistant in AGSA.", gzVar.mo55427f(true));
    }

    /* renamed from: a */
    public final C37239a mo40690a(int i) {
        Map map = this.f98680b;
        Integer valueOf = Integer.valueOf(i);
        if (map.containsKey(valueOf)) {
            return (C37239a) this.f98680b.get(valueOf);
        }
        return new C37244f(i, String.valueOf(i));
    }

    /* renamed from: b */
    public final C37240b mo40691b(int i) {
        C37240b bVar = (C37240b) this.f98679a.get(Integer.valueOf(i));
        if (bVar != null) {
            return bVar;
        }
        return new C37245g(i, String.valueOf(i));
    }

    /* renamed from: c */
    public final C37243e mo40692c() {
        return this.f98681c;
    }
}
