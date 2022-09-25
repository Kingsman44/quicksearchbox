package com.google.android.libraries.assistant.p1363c.p1398g.p1404c;

import com.google.android.libraries.assistant.p1363c.p1398g.p1405d.C17377g;
import com.google.android.libraries.assistant.p1363c.p1398g.p1405d.C17378h;
import com.google.android.libraries.assistant.p1363c.p1398g.p1430h.C17427a;
import com.google.android.libraries.assistant.p1363c.p1398g.p1430h.p1431a.C17429b;
import com.google.android.libraries.assistant.p1363c.p1398g.p1430h.p1431a.C17434g;
import com.google.android.libraries.assistant.p1363c.p1398g.p1430h.p1431a.C17436i;
import com.google.android.libraries.assistant.p1363c.p1398g.p1430h.p1431a.C17437j;
import com.google.android.libraries.assistant.p1363c.p1398g.p1432i.C17438a;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17477am;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17508k;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17522y;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4449cd.p4456g.C57981b;

/* renamed from: com.google.android.libraries.assistant.c.g.c.c */
/* compiled from: PG */
public final class C17365c implements C17378h {

    /* renamed from: a */
    private static final C59071e f50219a = C59071e.m91332i("com.google.android.libraries.assistant.c.g.c.c");

    /* renamed from: b */
    private C17427a f50220b;

    /* renamed from: c */
    private final C17437j f50221c;

    public C17365c(C17437j jVar) {
        this.f50221c = jVar;
    }

    /* renamed from: e */
    private final synchronized void m34621e(C17508k kVar, C17477am amVar, C57981b bVar, C17522y yVar) {
        C17427a aVar = this.f50220b;
        if (aVar == null) {
            this.f50220b = this.f50221c.mo23354a(kVar, amVar, bVar, yVar);
        } else if (!((C17436i) aVar).f50360c.equals(amVar)) {
            C59104x b = f50219a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "TTS");
            ((C59052c) ((C59052c) b).mo56372aa(42678)).mo56354G("Stopping existing AudioOutputSession before starting new session with clientInfo %s, sessionToken %s", C17377g.m34653a(kVar), C17377g.m34655c(amVar));
            C17427a aVar2 = this.f50220b;
            aVar2.getClass();
            aVar2.mo23347a();
            this.f50220b = this.f50221c.mo23354a(kVar, amVar, bVar, yVar);
        } else {
            C59104x b2 = f50219a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "TTS");
            ((C59052c) ((C59052c) b2).mo56372aa(42677)).mo56386p("Proceed with existing AudioOutputSession");
        }
    }

    /* renamed from: a */
    public final synchronized String mo23315a() {
        StringBuilder sb;
        sb = new StringBuilder("PlaybackManager: ");
        C17427a aVar = this.f50220b;
        if (aVar == null) {
            sb.append("has no session.\n");
        } else {
            sb.append("playing ");
            sb.append(C17377g.m34655c(((C17436i) aVar).f50360c));
            sb.append(" session.\n");
        }
        return sb.toString();
    }

    /* renamed from: b */
    public final synchronized void mo23316b(C17508k kVar, C17477am amVar) {
        C17427a aVar = this.f50220b;
        if (aVar == null) {
            C59104x d = f50219a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "TTS");
            ((C59052c) ((C59052c) d).mo56372aa(42675)).mo56354G("Attempt to stop playback of session with clientInfo %s, sessionToken %s failed. No session is currently playing.", C17377g.m34653a(kVar), C17377g.m34655c(amVar));
            return;
        }
        C17477am amVar2 = ((C17436i) aVar).f50360c;
        if (!amVar2.equals(amVar)) {
            C59104x d2 = f50219a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "TTS");
            ((C59052c) ((C59052c) d2).mo56372aa(42674)).mo56359L("Attempt to stop playback of session with clientInfo %s, sessionToken %s ignored. Currently playing sessionToken %s", C17377g.m34653a(kVar), C17377g.m34655c(amVar), C17377g.m34655c(amVar2));
            return;
        }
        C59071e eVar = f50219a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TTS");
        ((C59052c) ((C59052c) b).mo56372aa(42672)).mo56354G("Stopping playback of session with clientInfo %s, sessionToken %s", C17377g.m34653a(kVar), C17377g.m34655c(amVar));
        C17427a aVar2 = this.f50220b;
        aVar2.getClass();
        aVar2.mo23347a();
        this.f50220b = null;
        C59104x b2 = eVar.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "TTS");
        ((C59052c) ((C59052c) b2).mo56372aa(42673)).mo56354G("Stopped playback of session with clientInfo %s, sessionToken %s", C17377g.m34653a(kVar), C17377g.m34655c(amVar));
    }

    /* renamed from: c */
    public final synchronized void mo23317c(C17508k kVar, C17477am amVar, C57981b bVar, C17522y yVar) {
        C59104x b = f50219a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TTS");
        ((C59052c) ((C59052c) b).mo56372aa(42676)).mo56354G("Prewarming playback of session with clientInfo %s, sessionToken %s", C17377g.m34653a(kVar), C17377g.m34655c(amVar));
        m34621e(kVar, amVar, bVar, yVar);
        C17427a aVar = this.f50220b;
        aVar.getClass();
        C59104x b2 = C17436i.f50358a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "TTS");
        ((C59052c) ((C59052c) b2).mo56372aa(42745)).mo56354G("Prewarming ExoPlayer for clientInfo %s, sessionToken %s", C17377g.m34653a(((C17436i) aVar).f50359b), C17377g.m34655c(((C17436i) aVar).f50360c));
        ((C17436i) aVar).f50362e.execute(C47810es.m84977q(new C17429b((C17436i) aVar)));
    }

    /* renamed from: d */
    public final synchronized C17438a mo23318d(C17508k kVar, C17477am amVar, C57981b bVar, C17522y yVar) {
        C17427a aVar;
        C59104x b = f50219a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TTS");
        ((C59052c) ((C59052c) b).mo56372aa(42671)).mo56354G("Playing session with clientInfo %s, sessionToken %s", C17377g.m34653a(kVar), C17377g.m34655c(amVar));
        m34621e(kVar, amVar, bVar, yVar);
        aVar = this.f50220b;
        aVar.getClass();
        C59104x b2 = C17436i.f50358a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "TTS");
        ((C59052c) ((C59052c) b2).mo56372aa(42739)).mo56354G("Starting playback using ExoPlayer for clientInfo %s, sessionToken %s", C17377g.m34653a(((C17436i) aVar).f50359b), C17377g.m34655c(((C17436i) aVar).f50360c));
        ((C17436i) aVar).f50362e.execute(C47810es.m84977q(new C17434g((C17436i) aVar)));
        return new C17438a(((C17436i) aVar).f50365h, ((C17436i) aVar).f50366i);
    }
}
