package com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1179d.p1183d;

import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.C15785a;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1176b.C15809s;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1179d.C15832a;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.C15924c;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.C15936f;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.C15937g;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.C15938h;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1208b.C15944b;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16359bf;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.b.d.d.a */
/* compiled from: PG */
public final class C15836a implements C15832a {

    /* renamed from: a */
    private static final C59071e f47076a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.suggestions.b.d.d.a");

    /* renamed from: b */
    private final C15944b f47077b;

    public C15836a(C15944b bVar) {
        this.f47077b = bVar;
    }

    /* renamed from: c */
    private final void m32625c(C15924c cVar) {
        C15944b bVar = this.f47077b;
        C15936f d = C15938h.m32735d();
        d.mo22603b(true);
        d.mo22604c(C15937g.IMMEDIATE_ONEOFF_SUGGESTION_GENERATION);
        C46459k.m82829b(bVar.mo22621b(cVar, d.mo22602a()), "Failed to trigger PCP fetch.", new Object[0]);
    }

    /* renamed from: a */
    public final C15785a mo22582a() {
        return C15809s.f47037b;
    }

    /* renamed from: b */
    public final /* synthetic */ void mo22583b(C58833ax axVar, MessageLite messageLite) {
        C16359bf bfVar = (C16359bf) messageLite;
        if (!axVar.mo56113h()) {
            C58976aa aaVar = C58975e.f156826a;
        } else if (((C16359bf) axVar.mo56107c()).f48155b != bfVar.f48155b) {
            C59104x b = f47076a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "SettingsObserver");
            ((C59052c) ((C59052c) b).mo56372aa(46442)).mo56386p("Refresh suggestions on PR bit or HSN bit changes");
            m32625c(C15924c.PCP_FETCH);
        } else if (!((C16359bf) axVar.mo56107c()).f48156c.equals(bfVar.f48156c)) {
            C59104x b2 = f47076a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "SettingsObserver");
            ((C59052c) ((C59052c) b2).mo56372aa(46441)).mo56386p("Refresh suggestions on locale changes.");
            m32625c(C15924c.PCP_FETCH);
        } else if (((C16359bf) axVar.mo56107c()).f48158e != bfVar.f48158e) {
            C59104x b3 = f47076a.mo56224b();
            b3.mo56378ag(C58975e.f156826a, "SettingsObserver");
            ((C59052c) ((C59052c) b3).mo56372aa(46440)).mo56386p("Refresh suggestions on suggestions enabled bit changes.");
            m32625c(C15924c.SUGGESTION_GENERATION);
        }
    }
}
