package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p767b.p773b.p777b.p779b;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p760a.p761a.C12177c;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p767b.p773b.p774a.p775a.C12226a;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p855d.p856a.C12868a;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p855d.p856a.C12871d;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p855d.p856a.C12873f;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p855d.p856a.C12875h;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52076ei;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52083ep;
import com.google.assistant.p3897e.p3921j.aos;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.b.b.b.b.q */
/* compiled from: PG */
public final class C12264q extends C68247h {

    /* renamed from: a */
    private final C68283d f39033a;

    public C12264q(C69464a aVar, C69464a aVar2, C68283d dVar) {
        super(aVar2, new C68277d(C12264q.class), aVar);
        this.f39033a = C68236af.m98549d(dVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        C52076ei eiVar;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            ((C59052c) ((C59052c) C12260m.f39021a.mo56224b()).mo56372aa(44139)).mo56389s("Built AssistantResponse with ClientOps %s", new C12258k(axVar));
            C12177c cVar = new C12177c();
            cVar.mo20474b((C52081en) axVar.mo56107c());
            C58490gz gzVar = new C58490gz(4);
            for (C52083ep epVar : ((C52081en) axVar.mo56107c()).f136684d) {
                if (epVar.f136692b == 4) {
                    eiVar = (C52076ei) epVar.f136693c;
                } else {
                    eiVar = C52076ei.f136664f;
                }
                C51809dy dyVar = eiVar.f136668c;
                if (dyVar == null) {
                    dyVar = C51809dy.f135933f;
                }
                if (dyVar.f135936b.equals("tts.OUTPUT")) {
                    C51807dw dwVar = dyVar.f135938d;
                    if (dwVar == null) {
                        dwVar = C51807dw.f135930b;
                    }
                    Optional b = C12875h.m29134b(dwVar, "speech_output_args", aos.f135519e.getParserForType());
                    if (b.isPresent() && (((aos) b.get()).f135521a & 2) != 0) {
                        gzVar.mo55429h(Integer.valueOf(epVar.f136694d), new C12868a(new C12871d(new C12873f())));
                    }
                }
            }
            cVar.f38882a = gzVar.mo55427f(false);
            return C60856cj.m92900i(cVar.mo20473a());
        }
        ((C59052c) ((C59052c) C12260m.f39021a.mo56226d()).mo56372aa(44138)).mo56386p("No fulfillment built");
        throw new C12226a("No fulfillment built.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return this.f39033a.mo60297gq();
    }
}
