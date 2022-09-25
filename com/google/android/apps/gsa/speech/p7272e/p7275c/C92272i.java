package com.google.android.apps.gsa.speech.p7272e.p7275c;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.speech.p7139a.C90510b;
import com.google.android.apps.gsa.shared.speech.p7139a.C90513e;
import com.google.android.apps.gsa.shared.speech.p7139a.C90528t;
import com.google.android.apps.gsa.speech.p7272e.p7274b.C92249k;
import com.google.android.apps.gsa.speech.p7272e.p7274b.C92252n;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p395al.p408c.p414c.p416b.C8476as;
import com.google.speech.recognizer.p5233a.C67453av;
import java.io.InputStream;

/* renamed from: com.google.android.apps.gsa.speech.e.c.i */
/* compiled from: PG */
public final class C92272i implements C92277n {

    /* renamed from: a */
    private final C92271h f257293a;

    /* renamed from: b */
    private final C92265b f257294b;

    /* renamed from: c */
    private final C92276m f257295c;

    /* renamed from: d */
    private final String f257296d;

    /* renamed from: e */
    private final C92252n f257297e;

    /* renamed from: f */
    private final C92249k f257298f;

    /* renamed from: g */
    private final C67453av f257299g;

    /* renamed from: h */
    private final C89859i f257300h;

    /* renamed from: i */
    private final boolean f257301i;

    /* renamed from: j */
    private C92274k f257302j;

    /* renamed from: k */
    private long f257303k;

    /* renamed from: l */
    private C8476as f257304l;

    public C92272i(C92271h hVar, C92265b bVar, C92276m mVar, String str, long j, C92252n nVar, C92249k kVar, C67453av avVar, C89859i iVar, boolean z) {
        this.f257293a = hVar;
        this.f257294b = bVar;
        this.f257295c = mVar;
        this.f257296d = str;
        this.f257303k = j;
        this.f257297e = nVar;
        this.f257298f = kVar;
        this.f257299g = avVar;
        this.f257300h = iVar;
        this.f257301i = z;
    }

    /* renamed from: e */
    private final void m151511e(C90528t tVar, long j) {
        C92278o.m151529a(C58833ax.m90834k(tVar), C89849ae.GRECO3_INITIALIZATION_FAILED, j, this.f257300h);
        this.f257294b.mo86946b(tVar);
    }

    /* renamed from: f */
    private final synchronized boolean m151512f() {
        C92270g b = this.f257293a.mo86951b(this.f257296d, this.f257297e, this.f257298f);
        C58976aa aaVar = C58975e.f156826a;
        if (b != null) {
            if (b.f257277c.equals(this.f257296d)) {
                C67453av avVar = this.f257299g;
                C92274k b2 = C92274k.m151522b(b, (int) avVar.f183327d, avVar.f183332i);
                if (b2 == null) {
                    m151511e(new C90510b(458755), this.f257303k);
                    return false;
                }
                this.f257302j = b2;
                this.f257304l = b.f257280f;
                C92278o.m151529a(C58836b.f156633a, C89849ae.GRECO3_INITIALIZATION_SUCCESS, this.f257303k, this.f257300h);
                return true;
            }
        }
        m151511e(new C90513e(this.f257296d), this.f257303k);
        return false;
    }

    /* renamed from: a */
    public final void mo86958a(C58833ax axVar, C89849ae aeVar, long j) {
        C92278o.m151529a(axVar, aeVar, j, this.f257300h);
    }

    /* renamed from: b */
    public final synchronized void mo86959b() {
        C92274k kVar = this.f257302j;
        if (kVar != null) {
            C58976aa aaVar = C58975e.f156826a;
            this.f257293a.mo86955f(kVar);
            C92278o.m151529a(C58836b.f156633a, C89849ae.GRECO3_RECOGNITION_CLOSE, Long.valueOf(this.f257303k).longValue(), this.f257300h);
            this.f257302j = null;
            this.f257303k = -1;
        }
    }

    /* renamed from: c */
    public final synchronized void mo86960c(InputStream inputStream) {
        synchronized (this) {
            C92278o.m151529a(C58836b.f156633a, C89849ae.GRECO3_RECOGNITION_START, this.f257303k, this.f257300h);
            this.f257293a.mo86957h(this.f257302j, inputStream, this.f257294b, this.f257299g, this.f257303k, this.f257295c.mo86962a(this.f257297e), this.f257304l, this.f257301i);
        }
    }

    /* renamed from: d */
    public final synchronized boolean mo86961d() {
        C92278o.m151529a(C58836b.f156633a, C89849ae.GRECO3_INITIALIZATION_START, this.f257303k, this.f257300h);
        this.f257293a.mo86956g(this.f257303k);
        C92274k.m151521a();
        this.f257293a.mo86954e();
        return m151512f();
    }
}
