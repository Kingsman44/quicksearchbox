package com.google.android.apps.gsa.speech.p7272e.p7275c;

import android.content.Context;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.speech.p7139a.C90528t;
import com.google.android.apps.gsa.shared.util.C90727ak;
import com.google.android.libraries.assistant.soda.C19242ae;
import com.google.android.libraries.assistant.soda.C19389y;
import com.google.android.libraries.assistant.soda.C19390z;
import com.google.android.libraries.assistant.soda.p1603b.C19257j;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.speech.e.c.r */
/* compiled from: PG */
public final class C92281r {

    /* renamed from: a */
    public static final C59071e f257322a = C59071e.m91332i("com.google.android.apps.gsa.speech.e.c.r");

    /* renamed from: b */
    public final C19390z f257323b;

    /* renamed from: c */
    public final Context f257324c;

    /* renamed from: d */
    public C19389y f257325d;

    /* renamed from: e */
    C92280q f257326e;

    /* renamed from: f */
    public final C89859i f257327f;

    /* renamed from: g */
    public final C19257j f257328g;

    /* renamed from: h */
    public final C86124t f257329h;

    /* renamed from: i */
    public final C68214a f257330i;

    /* renamed from: j */
    public final C92288y f257331j;

    public C92281r(C19390z zVar, Context context, C89859i iVar, C19257j jVar, C86124t tVar, C68214a aVar, C92288y yVar) {
        this.f257323b = zVar;
        this.f257324c = context;
        this.f257327f = iVar;
        this.f257328g = jVar;
        this.f257329h = tVar;
        this.f257330i = aVar;
        this.f257331j = yVar;
    }

    /* renamed from: b */
    public static void m151535b() {
        C58485gu guVar = C19242ae.f53915a;
        int i = ((C58724pq) guVar).f156474d;
        int i2 = 0;
        while (i2 < i) {
            String str = (String) guVar.get(i2);
            try {
                C90727ak.m148184a(str);
                C59104x b = f257322a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "SodaEngManager");
                ((C59052c) ((C59052c) b).mo56372aa(12406)).mo56389s("SODA lib '%s' loaded safely and successfully.", str);
                return;
            } catch (UnsatisfiedLinkError unused) {
                i2++;
            }
        }
        C59104x c = f257322a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "SodaEngManager");
        ((C59052c) ((C59052c) c).mo56372aa(12405)).mo56386p("Could not safely load SODA native lib or unpack from APK! SODA will fail.");
    }

    /* renamed from: a */
    public final void mo86963a(C90528t tVar, long j, C92265b bVar) {
        C92278o.m151529a(C58833ax.m90834k(tVar), C89849ae.SODA_OFFLINE_INITIALIZATION_FAILED, j, this.f257327f);
        bVar.mo86946b(tVar);
    }

    /* renamed from: c */
    public final void mo86964c() {
        C59104x b = f257322a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SodaEngManager");
        ((C59052c) ((C59052c) b).mo56372aa(12410)).mo56386p("stopDetection");
        this.f257325d.mo24535h();
    }
}
