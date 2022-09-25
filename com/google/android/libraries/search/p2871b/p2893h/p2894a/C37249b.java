package com.google.android.libraries.search.p2871b.p2893h.p2894a;

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

/* renamed from: com.google.android.libraries.search.b.h.a.b */
/* compiled from: PG */
public final class C37249b implements C37242d {

    /* renamed from: a */
    final Map f98985a;

    /* renamed from: b */
    final Map f98986b;

    /* renamed from: c */
    C37243e f98987c = null;

    public C37249b() {
        HashMap hashMap = new HashMap();
        this.f98985a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f98986b = hashMap2;
        hashMap.put(0, new C37245g(0, "FLOW_TYPE_UNKNOWN"));
        hashMap.put(1, new C37245g(1, "NONE"));
        hashMap.put(101, new C37245g(101, "STARTUP_APPLICATION_INTERACTIVE"));
        hashMap.put(102, new C37245g(102, "STARTUP_FIRST_DRAW_DONE"));
        hashMap2.put(0, new C37244f(0, "UNKNOWN_EVENT"));
        hashMap2.put(1, new C37244f(1, "META_START_EVENT"));
        hashMap2.put(2, new C37244f(2, "META_END_EVENT"));
        hashMap2.put(101, new C37244f(101, "PROCESS_FORK"));
        hashMap2.put(102, new C37244f(102, "PROCESS_FORK_INTERACTIVE"));
        hashMap2.put(103, new C37244f(103, "APPLICATION_CREATE"));
        hashMap2.put(104, new C37244f(104, "TRAMPOLINE_CREATE"));
        hashMap2.put(105, new C37244f(105, "TRAMPOLINE_CREATE_INTERACTIVE"));
        hashMap2.put(106, new C37244f(106, "INTERMEDIATE_TRAMPOLINE_CREATE"));
        hashMap2.put(107, new C37244f(107, "ACTIVITY_CREATE"));
        hashMap2.put(108, new C37244f(108, "ACTIVITY_CREATE_INTERACTIVE"));
        hashMap2.put(109, new C37244f(109, "INTERMEDIATE_ACTIVITY_CREATE"));
        hashMap2.put(110, new C37244f(110, "SEARCH_SERVICE_CREATE"));
        hashMap2.put(111, new C37244f(111, "FIRST_DRAW_DONE_DISCOVER_GOOGLE_APP"));
        hashMap2.put(112, new C37244f(112, "FIRST_DRAW_DONE_HOME_NIU"));
        hashMap2.put(113, new C37244f(113, "FIRST_DRAW_DONE_HOTWORD_OPA"));
        hashMap2.put(114, new C37244f(114, "FIRST_DRAW_DONE_INTERESTS_TAB_SNA"));
        hashMap2.put(115, new C37244f(115, "FIRST_DRAW_DONE_LONG_PRESS_HOME_OPA"));
        hashMap2.put(116, new C37244f(116, "FIRST_DRAW_DONE_NOTIFICATION_SEARCH_SNA"));
        hashMap2.put(117, new C37244f(117, "FIRST_DRAW_DONE_OTHER"));
        hashMap2.put(118, new C37244f(118, "FIRST_DRAW_DONE_OTHER_OPA"));
        hashMap2.put(119, new C37244f(119, "FIRST_DRAW_DONE_SHELL_APP_OPA"));
        hashMap2.put(120, new C37244f(120, "FIRST_DRAW_DONE_SRP_NIU"));
        hashMap2.put(121, new C37244f(121, "FIRST_DRAW_DONE_SUGGEST_NIU"));
        hashMap2.put(122, new C37244f(122, "FIRST_DRAW_DONE_TEXT_SEARCH_GOOGLE_APP"));
        hashMap2.put(123, new C37244f(123, "FIRST_DRAW_DONE_TEXT_SEARCH_SNA"));
        hashMap2.put(124, new C37244f(124, "FIRST_DRAW_DONE_TEXT_SEARCH_QEA"));
        hashMap2.put(125, new C37244f(125, "FIRST_DRAW_DONE_UNKNOWN"));
        hashMap2.put(126, new C37244f(126, "FIRST_DRAW_DONE_VOICE_SEARCH_QEA"));
        hashMap2.put(127, new C37244f(127, "FIRST_DRAW_DONE_VOICE_SEARCH_SNA"));
        hashMap2.put(128, new C37244f(128, "APPLICATION_INTERACTIVE_DISCOVER_GOOGLE_APP"));
        hashMap2.put(129, new C37244f(129, "APPLICATION_INTERACTIVE_INTERESTS_TAB_SNA"));
        hashMap2.put(130, new C37244f(130, "APPLICATION_INTERACTIVE_HOTWORD_VOICE_INPUT_OPA"));
        hashMap2.put(131, new C37244f(131, "APPLICATION_INTERACTIVE_LONG_PRESS_HOME_TEXT_INPUT_OPA"));
        hashMap2.put(132, new C37244f(132, "APPLICATION_INTERACTIVE_LONG_PRESS_HOME_VOICE_INPUT_OPA"));
        hashMap2.put(133, new C37244f(133, "APPLICATION_INTERACTIVE_SHELL_APP_TEXT_INPUT_OPA"));
        hashMap2.put(134, new C37244f(134, "APPLICATION_INTERACTIVE_SHELL_APP_VOICE_INPUT_OPA"));
        hashMap2.put(135, new C37244f(135, "APPLICATION_INTERACTIVE_TEXT_SEARCH_SNA"));
        hashMap2.put(136, new C37244f(136, "APPLICATION_INTERACTIVE_TEXT_SEARCH_GOOGLE_APP"));
        hashMap2.put(137, new C37244f(137, "APPLICATION_INTERACTIVE_TEXT_SEARCH_QEA"));
        hashMap2.put(138, new C37244f(138, "APPLICATION_INTERACTIVE_VOICE_SEARCH_SNA"));
        hashMap2.put(139, new C37244f(139, "APPLICATION_INTERACTIVE_VOICE_SEARCH_QEA"));
        hashMap2.put(140, new C37244f(140, "SEARCH_OVERLAY_STARTUP_KEYBOARD_SHOWN"));
        hashMap2.put(141, new C37244f(141, "SEARCH_OVERLAY_STARTUP_SUGGESTIONS_SHOWN"));
        hashMap2.put(142, new C37244f(142, "SEARCH_OVERLAY_STARTUP_ZERO_PREFIX_SUGGESTIONS_SHOWN"));
        hashMap2.put(143, new C37244f(143, "FIRST_DRAW_DONE_VOICE_SEARCH_GOOGLE_APP"));
        hashMap2.put(144, new C37244f(144, "APPLICATION_INTERACTIVE_VOICE_SEARCH_GOOGLE_APP"));
        hashMap2.put(145, new C37244f(145, "TRAMPOLINE_CREATE_APP_STARTED_IN_BACKGROUND"));
        hashMap2.put(146, new C37244f(146, "TRAMPOLINE_CREATE_INTERACTIVE_APP_STARTED_IN_BACKGROUND"));
        hashMap2.put(147, new C37244f(147, "ACTIVITY_CREATE_APP_STARTED_IN_BACKGROUND"));
        hashMap2.put(148, new C37244f(148, "ACTIVITY_CREATE_INTERACTIVE_APP_STARTED_IN_BACKGROUND"));
        hashMap2.put(149, new C37244f(149, "INTERMEDIATE_ACTIVITY_START"));
        C58490gz gzVar = new C58490gz(4);
        new C58490gz(4);
        C58490gz gzVar2 = new C58490gz(4);
        gzVar2.mo55429h(0, "SUCCESS");
        gzVar.mo55429h("agsa_startup_success", gzVar2.mo55427f(true));
        C58490gz gzVar3 = new C58490gz(4);
        gzVar3.mo55429h(0, "CANCEL_UNKNOWN");
        gzVar3.mo55429h(1, "CANCEL_FEATURE_DISABLED");
        gzVar3.mo55429h(2, "CANCEL_ACTIVITY_STOPPED");
        gzVar.mo55429h("agsa_startup_cancel", gzVar3.mo55427f(true));
        C58490gz gzVar4 = new C58490gz(4);
        gzVar4.mo55429h(0, "FAILURE_UNKNOWN");
        gzVar4.mo55429h(1, "FAILURE_ACCOUNT_ERROR");
        gzVar4.mo55429h(2, "FAILURE_PROCESS_FORK_UNKNOWN");
        gzVar4.mo55429h(3, "FAILURE_NO_FIRST_DRAW_DONE_LOGGED");
        gzVar.mo55429h("agsa_startup_failure", gzVar4.mo55427f(true));
        this.f98987c = new C37246h(2, "AGSA_STARTUP", "AGSA Startup Latency", gzVar.mo55427f(true));
    }

    /* renamed from: a */
    public final C37239a mo40690a(int i) {
        Map map = this.f98986b;
        Integer valueOf = Integer.valueOf(i);
        if (map.containsKey(valueOf)) {
            return (C37239a) this.f98986b.get(valueOf);
        }
        return new C37244f(i, String.valueOf(i));
    }

    /* renamed from: b */
    public final C37240b mo40691b(int i) {
        C37240b bVar = (C37240b) this.f98985a.get(Integer.valueOf(i));
        if (bVar != null) {
            return bVar;
        }
        return new C37245g(i, String.valueOf(i));
    }

    /* renamed from: c */
    public final C37243e mo40692c() {
        return this.f98987c;
    }
}
