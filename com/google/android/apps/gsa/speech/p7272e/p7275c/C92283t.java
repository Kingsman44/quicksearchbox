package com.google.android.apps.gsa.speech.p7272e.p7275c;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.speech.p7139a.C90510b;
import com.google.android.apps.gsa.shared.speech.p7139a.C90513e;
import com.google.android.libraries.assistant.soda.C19247b;
import com.google.android.libraries.assistant.soda.C19387w;
import com.google.android.libraries.assistant.soda.C19389y;
import com.google.android.libraries.assistant.soda.p1603b.C19257j;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.C60790c;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.p5218j.C66964g;
import com.google.speech.p5218j.C67152mz;
import com.google.speech.p5218j.p5219a.C66722az;
import java.io.InputStream;

/* renamed from: com.google.android.apps.gsa.speech.e.c.t */
/* compiled from: PG */
public final class C92283t implements C92277n {

    /* renamed from: a */
    private final C92265b f257332a;

    /* renamed from: b */
    private final String f257333b;

    /* renamed from: c */
    private final C92281r f257334c;

    /* renamed from: d */
    private final long f257335d;

    /* renamed from: e */
    private final int f257336e;

    /* renamed from: f */
    private final boolean f257337f;

    public C92283t(C92281r rVar, C92265b bVar, String str, long j, int i, boolean z) {
        this.f257332a = bVar;
        this.f257333b = str;
        this.f257334c = rVar;
        this.f257335d = j;
        this.f257336e = i;
        this.f257337f = z;
    }

    /* renamed from: a */
    public final void mo86958a(C58833ax axVar, C89849ae aeVar, long j) {
        C92278o.m151529a(axVar, aeVar, j, this.f257334c.f257327f);
    }

    /* renamed from: b */
    public final synchronized void mo86959b() {
        C92278o.m151529a(C58836b.f156633a, C89849ae.SODA_OFFLINE_RECOGNITION_CLOSE, this.f257335d, this.f257334c.f257327f);
        this.f257334c.mo86964c();
    }

    /* renamed from: c */
    public final synchronized void mo86960c(InputStream inputStream) {
        C66722az azVar;
        C92278o.m151529a(C58836b.f156633a, C89849ae.SODA_OFFLINE_RECOGNITION_START, this.f257335d, this.f257334c.f257327f);
        C92281r rVar = this.f257334c;
        int i = this.f257336e;
        boolean z = this.f257337f;
        if (rVar.f257325d.mo24537j()) {
            C59104x d = C92281r.f257322a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SodaEngManager");
            ((C59052c) ((C59052c) d).mo56372aa(12409)).mo56386p("Soda already running! Restarting new recognition.");
            rVar.mo86964c();
        }
        C59104x b = C92281r.f257322a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SodaEngManager");
        ((C59052c) ((C59052c) b).mo56372aa(12407)).mo56387q("startDetection with channel count %d", i);
        C58833ax axVar = C58836b.f156633a;
        if (rVar.f257329h.mo79746e(C90082eg.f249934ax)) {
            C59104x b2 = C92281r.f257322a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "SodaEngManager");
            ((C59052c) ((C59052c) b2).mo56372aa(12408)).mo56386p("Extracting recognition context on start capture");
            C19257j jVar = rVar.f257328g;
            if (jVar.f53964a.mo79746e(C90082eg.f249930at)) {
                azVar = jVar.f53965b.f53963a;
            } else {
                azVar = C66722az.f181493f;
            }
            axVar = C58833ax.m90834k(azVar);
        }
        C19389y yVar = rVar.f257325d;
        C58836b bVar = C58836b.f156633a;
        C58833ax k = C58833ax.m90834k(Boolean.valueOf(z));
        C60870cx a = yVar.mo24528a(16000, i, inputStream, bVar, axVar, k);
        C92279p pVar = new C92279p();
        C60856cj.m92911t(a, C47810es.m84974n(pVar), C60826bg.f164896a);
    }

    /* renamed from: d */
    public final synchronized boolean mo86961d() {
        C67152mz mzVar;
        C92278o.m151529a(C58836b.f156633a, C89849ae.SODA_OFFLINE_INITIALIZATION_START, this.f257335d, this.f257334c.f257327f);
        C92281r rVar = this.f257334c;
        String str = this.f257333b;
        C92265b bVar = this.f257332a;
        long j = this.f257335d;
        int i = this.f257336e;
        C19389y yVar = rVar.f257325d;
        if (yVar != null) {
            if (str.equals(yVar.f54236b)) {
                C59104x b = C92281r.f257322a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "SodaEngManager");
                ((C59052c) ((C59052c) b).mo56372aa(12403)).mo56386p("Soda already initialized. Updating the callback..");
                C92280q qVar = rVar.f257326e;
                if (qVar != null) {
                    qVar.f257319a = bVar;
                    C92278o.m151529a(C58836b.f156633a, C89849ae.SODA_OFFLINE_INITIALIZATION_SUCCESS, j, rVar.f257327f);
                    mzVar = C67152mz.NO_ERROR;
                } else {
                    C59104x c = C92281r.f257322a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "SodaEngManager");
                    ((C59052c) ((C59052c) c).mo56372aa(12404)).mo56386p("Soda callbackAdapter is null!");
                    rVar.mo86963a(new C90510b(C89885b.SODA_INITIALIZATION_FAILED_VALUE), j, bVar);
                    mzVar = C67152mz.UNDEFINED_BEHAVIOR;
                }
            }
        }
        C59104x b2 = C92281r.f257322a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "SodaEngManager");
        ((C59052c) ((C59052c) b2).mo56372aa(12401)).mo56386p("initSoda");
        C92281r.m151535b();
        rVar.f257326e = new C92280q(rVar, bVar, j);
        C58833ax a = ((C92286w) rVar.f257330i.mo27525b()).mo86965a(str);
        if (!a.mo56113h()) {
            mzVar = C67152mz.INVALID_LANGUAGE_PACK;
        } else {
            C19387w B = C19247b.m36941B();
            B.mo24385z((String) a.mo56107c());
            B.mo24378s(str);
            B.mo24382w(C60790c.m92793a(rVar.f257324c.getCacheDir().getAbsolutePath(), "soda-offline/"));
            C92280q qVar2 = rVar.f257326e;
            qVar2.getClass();
            B.mo24383x(qVar2);
            B.mo24364e(C66964g.DEFAULT_ONESHOT);
            B.mo24373n(((C86124t) rVar.f257331j.f257351a.mo27525b()).mo79746e(C90082eg.f249861D));
            B.mo24374o(((C86124t) rVar.f257331j.f257351a.mo27525b()).mo79746e(C90082eg.f249862E));
            B.mo24367h(i);
            rVar.f257325d = B.mo24527C(rVar.f257323b);
            C67152mz b3 = rVar.f257325d.mo24529b();
            if (b3 != C67152mz.NO_ERROR) {
                if (b3.ordinal() != 5) {
                    rVar.mo86963a(new C90510b(C89885b.SODA_INITIALIZATION_FAILED_VALUE), j, bVar);
                } else {
                    rVar.mo86963a(new C90513e(str), j, bVar);
                }
                C59104x c2 = C92281r.f257322a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "SodaEngManager");
                ((C59052c) ((C59052c) c2).mo56372aa(12402)).mo56389s("Soda init failed with error - %s", b3.name());
                rVar.f257325d = null;
                mzVar = b3;
            }
            C92278o.m151529a(C58836b.f156633a, C89849ae.SODA_OFFLINE_INITIALIZATION_SUCCESS, j, rVar.f257327f);
            mzVar = C67152mz.NO_ERROR;
        }
        return mzVar == C67152mz.NO_ERROR;
    }
}
