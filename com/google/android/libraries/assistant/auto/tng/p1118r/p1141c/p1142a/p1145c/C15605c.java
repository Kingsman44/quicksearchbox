package com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1145c;

import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1152b.C15666r;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15669a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protos.p4850an.C63595f;
import com.google.protos.p4850an.p4855d.p4858c.C63498af;
import com.google.protos.p4850an.p4855d.p4858c.C63541n;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.c.a.c.c */
/* compiled from: PG */
public final /* synthetic */ class C15605c implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C15609g f46657a;

    /* renamed from: b */
    public final /* synthetic */ C15666r f46658b;

    /* renamed from: c */
    public final /* synthetic */ C63595f f46659c;

    public /* synthetic */ C15605c(C15609g gVar, C15666r rVar, C63595f fVar) {
        this.f46657a = gVar;
        this.f46658b = rVar;
        this.f46659c = fVar;
    }

    public final Object call() {
        C15609g gVar = this.f46657a;
        C15666r rVar = this.f46658b;
        C63595f fVar = this.f46659c;
        int e = rVar.mo22479e();
        int i = e - 1;
        if (e != 0) {
            switch (i) {
                case 0:
                    C59104x d = C15609g.f46664a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "PortableDispatcher");
                    ((C59052c) ((C59052c) d).mo56372aa(46191)).mo56386p("#handleAnalyzerResponse: No fulfiller can handle");
                    gVar.f46676m = C58836b.f156633a;
                    break;
                case 1:
                    C59104x b = C15609g.f46664a.mo56224b();
                    b.mo56378ag(C58975e.f156826a, "PortableDispatcher");
                    ((C59052c) ((C59052c) b).mo56372aa(46187)).mo56386p("dispatch AnalyzerResponse to answers fulfiller");
                    gVar.f46676m = C58833ax.m90834k(gVar.f46667d);
                    break;
                case 2:
                    C59104x b2 = C15609g.f46664a.mo56224b();
                    b2.mo56378ag(C58975e.f156826a, "PortableDispatcher");
                    ((C59052c) ((C59052c) b2).mo56372aa(46188)).mo56386p("dispatch AnalyzerResponse to device action fulfiller");
                    gVar.f46676m = C58833ax.m90834k(gVar.f46668e);
                    break;
                case 3:
                case 5:
                case 7:
                    C59104x b3 = C15609g.f46664a.mo56224b();
                    b3.mo56378ag(C58975e.f156826a, "PortableDispatcher");
                    ((C59052c) ((C59052c) b3).mo56372aa(46190)).mo56386p("dispatch AnalyzerResponse to local fulfiller");
                    gVar.f46676m = C58833ax.m90834k(gVar.f46673j);
                    break;
                case 4:
                    C59104x b4 = C15609g.f46664a.mo56224b();
                    b4.mo56378ag(C58975e.f156826a, "PortableDispatcher");
                    ((C59052c) ((C59052c) b4).mo56372aa(46189)).mo56386p("dispatch AnalyzerResponse to help fulfiller");
                    gVar.f46676m = C58833ax.m90834k(gVar.f46669f);
                    break;
                case 6:
                    C63498af afVar = (C63498af) C15669a.m32464c(fVar, C63498af.f171735f);
                    if (afVar != null) {
                        if (afVar.f171738b) {
                            if (afVar.f171739c.size() != 1) {
                                if (afVar.f171739c.size() == 0 && afVar.f171740d.size() == 1) {
                                    C59104x b5 = C15609g.f46664a.mo56224b();
                                    b5.mo56378ag(C58975e.f156826a, "PortableDispatcher");
                                    ((C59052c) ((C59052c) b5).mo56372aa(46201)).mo56386p("dispatch AnalyzerResponse to open app fulfiller");
                                    gVar.f46676m = C58833ax.m90834k(gVar.f46672i);
                                    break;
                                }
                            } else if ((((C63541n) afVar.f171739c.get(0)).f171867a & 16) != 0 && gVar.f46665b.mo56113h()) {
                                C59104x b6 = C15609g.f46664a.mo56224b();
                                b6.mo56378ag(C58975e.f156826a, "PortableDispatcher");
                                ((C59052c) ((C59052c) b6).mo56372aa(46203)).mo56386p("dispatch AnalyzerResponse to radio fulfiller");
                                gVar.f46676m = gVar.f46665b;
                                break;
                            } else {
                                C59104x b7 = C15609g.f46664a.mo56224b();
                                b7.mo56378ag(C58975e.f156826a, "PortableDispatcher");
                                ((C59052c) ((C59052c) b7).mo56372aa(46202)).mo56386p("dispatch AnalyzerResponse to media init fulfiller");
                                gVar.f46676m = C58833ax.m90834k(gVar.f46671h);
                                break;
                            }
                        } else {
                            C59104x b8 = C15609g.f46664a.mo56224b();
                            b8.mo56378ag(C58975e.f156826a, "PortableDispatcher");
                            ((C59052c) ((C59052c) b8).mo56372aa(46204)).mo56386p("dispatch AnalyzerResponse to media control fulfiller");
                            gVar.f46676m = C58833ax.m90834k(gVar.f46670g);
                            break;
                        }
                    } else {
                        C59104x c = C15609g.f46664a.mo56225c();
                        c.mo56378ag(C58975e.f156826a, "PortableDispatcher");
                        ((C59052c) ((C59052c) c).mo56372aa(46205)).mo56386p("Media action is null");
                        break;
                    }
                    break;
            }
            return gVar.f46676m;
        }
        throw null;
    }
}
