package com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1185e.p1192d.p1193a.p1194a;

import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16338al;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16339am;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16340an;
import com.google.android.libraries.search.assistant.p2786t.p2798c.C36607j;
import com.google.android.libraries.search.assistant.p2786t.p2798c.C36608k;
import com.google.android.libraries.search.assistant.p2786t.p2798c.C36609l;
import com.google.android.libraries.search.assistant.p2786t.p2801d.p2802a.C36619a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63062g;
import com.google.protobuf.C63070h;
import com.google.protobuf.C63088z;
import com.google.protos.p5124m.p5125a.C65603f;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.b.e.d.a.a.b */
/* compiled from: PG */
public final /* synthetic */ class C15865b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C15867d f47118a;

    public /* synthetic */ C15865b(C15867d dVar) {
        this.f47118a = dVar;
    }

    public final void run() {
        C15867d dVar = this.f47118a;
        C58976aa aaVar = C58975e.f156826a;
        if (C36619a.m65149e(dVar.f47123d)) {
            C36607j jVar = (C36607j) C36608k.f95440d.createBuilder();
            C36609l lVar = C36609l.NOTIFICATION_OBSERVER_AUTO_SUGGESTIONS;
            jVar.copyOnWrite();
            C36608k kVar = (C36608k) jVar.instance;
            kVar.f95443b = lVar.getNumber();
            kVar.f95442a |= 1;
            if (((C65603f) dVar.f47128i.mo17428b()).f178307a.contains("1")) {
                C63062g gVar = (C63062g) C63070h.f170215c.createBuilder();
                gVar.copyOnWrite();
                ((C63070h) gVar.instance).f170217a = "type.googleapis.com/com.google.android.libraries.assistant.auto.tng.suggestions.proto.SuggestionNotificationListeningConfig";
                C16339am amVar = (C16339am) C16340an.f48110c.createBuilder();
                C16338al alVar = C16338al.NOTIFICATION_CATEGORY_MESSAGE;
                amVar.copyOnWrite();
                C16340an anVar = (C16340an) amVar.instance;
                alVar.getClass();
                C62961ch chVar = anVar.f48112a;
                if (!chVar.mo58948c()) {
                    anVar.f48112a = C62942bv.mutableCopy(chVar);
                }
                anVar.f48112a.mo58916g(alVar.f48108d);
                C63088z byteString = ((C16340an) amVar.build()).toByteString();
                gVar.copyOnWrite();
                byteString.getClass();
                ((C63070h) gVar.instance).f170218b = byteString;
                jVar.copyOnWrite();
                C63070h hVar = (C63070h) gVar.build();
                hVar.getClass();
                ((C36608k) jVar.instance).f95444c = hVar;
            }
            C46459k.m82829b(dVar.f47126g.mo51512b(new C15864a(dVar, jVar), dVar.f47122c), "maybeRegisterListener failed", new Object[0]);
            return;
        }
        C59104x d = C15867d.f47120a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ListenerController");
        ((C59052c) ((C59052c) d).mo56372aa(46465)).mo56386p("No notification access permission. Keep waiting");
        C46459k.m82829b(dVar.f47125f.mo29164d(C47810es.m84977q(new C15865b(dVar)), ((Long) dVar.f47127h.mo17428b()).longValue(), TimeUnit.SECONDS), "Failed to schedule.", new Object[0]);
    }
}
