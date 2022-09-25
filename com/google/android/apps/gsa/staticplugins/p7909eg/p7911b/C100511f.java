package com.google.android.apps.gsa.staticplugins.p7909eg.p7911b;

import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90821bm;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.p5224k.p5225a.C67194al;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.eg.b.f */
/* compiled from: PG */
public final class C100511f {

    /* renamed from: b */
    private static final C59071e f281009b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.eg.b.f");

    /* renamed from: a */
    public C58485gu f281010a = C58485gu.m89845m();

    /* renamed from: c */
    private final List f281011c = new ArrayList();

    /* renamed from: d */
    private final C22871g f281012d;

    /* renamed from: e */
    private final C22871g f281013e;

    public C100511f(C90821bm bmVar, C22871g gVar) {
        this.f281012d = bmVar.mo85163a(C100510e.class);
        this.f281013e = gVar;
    }

    /* renamed from: a */
    public final void mo91943a() {
        if (!this.f281011c.isEmpty()) {
            for (C60870cx cxVar : this.f281011c) {
                if (!cxVar.isDone()) {
                    cxVar.cancel(true);
                }
            }
            this.f281011c.clear();
        }
    }

    /* renamed from: b */
    public final void mo91944b(C100509d dVar) {
        if (this.f281010a.isEmpty()) {
            C59104x c = f281009b.mo56225c();
            c.mo56378ag(C58975e.f156826a, "TimepointScheduler");
            ((C59052c) ((C59052c) c).mo56372aa(33491)).mo56386p("No timepoint task to schedule");
            return;
        }
        C58485gu guVar = this.f281010a;
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            C67194al alVar = (C67194al) guVar.get(i);
            double d = alVar.f182647c;
            C58976aa aaVar = C58975e.f156826a;
            C60870cx d2 = this.f281012d.mo28204d("TtsTimepointTimer", (long) (d * 1000.0d), new C100506a(alVar));
            this.f281011c.add(d2);
            new C90873ag(d2, this.f281013e, "Invoke TtsTimepointCallback", new C100507b(dVar)).mo85223a(C100508c.f281008a);
        }
    }
}
