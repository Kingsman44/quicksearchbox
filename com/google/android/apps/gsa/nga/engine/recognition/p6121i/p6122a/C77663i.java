package com.google.android.apps.gsa.nga.engine.recognition.p6121i.p6122a;

import com.google.android.apps.gsa.nga.engine.b.g.ac;
import com.google.android.apps.gsa.nga.engine.d.a.a.c;
import com.google.android.apps.gsa.nga.engine.p6260x.C79856d;
import com.google.android.apps.gsa.nga.engine.recognition.C77549ab;
import com.google.android.apps.gsa.nga.engine.recognition.C77581c;
import com.google.android.apps.gsa.nga.engine.recognition.C77632g;
import com.google.android.apps.gsa.nga.engine.recognition.C77890v;
import com.google.android.apps.gsa.nga.engine.recognition.p6119h.p6120a.C77652a;
import com.google.android.apps.gsa.nga.engine.recognition.p6136o.C77881f;
import com.google.android.apps.gsa.nga.shared.p6363s.C81459h;
import com.google.android.apps.gsa.nga.shared.p6363s.C81465n;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.assistant.soda.C19243af;
import com.google.android.libraries.assistant.soda.C19347o;
import com.google.android.libraries.assistant.soda.p1605d.C19282t;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4580v.C60950i;
import com.google.speech.p5218j.C67023ie;
import com.google.speech.p5218j.C67024if;
import com.google.speech.p5218j.C67083kk;
import com.google.speech.p5218j.C67087ko;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.i.a.i */
/* compiled from: PG */
public final class C77663i implements C19347o, C19282t {

    /* renamed from: p */
    private static final C58974d f213911p = C58974d.m91136j();

    /* renamed from: a */
    public final C60950i f213912a;

    /* renamed from: b */
    public final C77549ab f213913b;

    /* renamed from: c */
    public final c f213914c;

    /* renamed from: d */
    public final C91142g f213915d;

    /* renamed from: e */
    public final Optional f213916e;

    /* renamed from: f */
    public final C21370a f213917f;

    /* renamed from: g */
    public final C77881f f213918g;

    /* renamed from: h */
    public final C77581c f213919h;

    /* renamed from: i */
    public final C77671q f213920i;

    /* renamed from: j */
    public final C81459h f213921j;

    /* renamed from: k */
    public final C77632g f213922k;

    /* renamed from: l */
    public final AtomicReference f213923l = new AtomicReference();

    /* renamed from: m */
    public final AtomicReference f213924m = new AtomicReference();

    /* renamed from: n */
    public boolean f213925n = true;

    /* renamed from: o */
    public final C77652a f213926o;

    /* renamed from: q */
    private final C22871g f213927q;

    /* renamed from: r */
    private final C22871g f213928r;

    public C77663i(C60950i iVar, C77549ab abVar, c cVar, C91142g gVar, Optional optional, C21370a aVar, C22871g gVar2, C81465n nVar, C22871g gVar3, C77881f fVar, C77581c cVar2, C22871g gVar4, C77671q qVar, C77652a aVar2, C77632g gVar5) {
        this.f213912a = iVar;
        this.f213913b = abVar;
        this.f213914c = cVar;
        this.f213915d = gVar;
        this.f213916e = optional;
        this.f213917f = aVar;
        this.f213927q = gVar2;
        this.f213918g = fVar;
        this.f213919h = cVar2;
        this.f213928r = gVar4;
        this.f213920i = qVar;
        this.f213926o = aVar2;
        C81465n nVar2 = nVar;
        C22871g gVar6 = gVar3;
        this.f213921j = nVar.mo75095b(gVar3, C77662h.f213910a);
        this.f213922k = gVar5;
    }

    /* renamed from: e */
    public final Optional mo24439e() {
        ac acVar;
        C79856d dVar = (C79856d) this.f213923l.get();
        if (dVar == null || (acVar = dVar.f218924a) == null) {
            return Optional.empty();
        }
        return Optional.m71637of(acVar.b());
    }

    /* renamed from: t */
    public final void mo23782t(C67087ko koVar) {
        boolean z;
        boolean z2 = true;
        if ((koVar.f182368a & C89885b.HTTP_VALUE) != 0) {
            if (this.f213916e.isPresent()) {
                this.f213927q.mo28212l("[NGA] RohanSodaCallbackAdapter.logBatchMetricsEvent", new C77657c(this, koVar));
            } else {
                ((C58970a) ((C58970a) f213911p.mo56226d()).mo56372aa(4351)).mo56386p("Missing Soda metrics logger");
            }
            z = true;
        } else {
            z = false;
        }
        if (this.f213925n) {
            this.f213923l.set((C79856d) this.f213924m.get());
        }
        C79856d dVar = (C79856d) this.f213923l.get();
        if (dVar == null) {
            ((C58970a) ((C58970a) f213911p.mo56226d()).mo56372aa(4350)).mo56386p("Candidate identifiers aren't set, ignoring.");
            return;
        }
        if ((koVar.f182368a & 2) != 0) {
            C67083kk kkVar = koVar.f182370c;
            if (kkVar == null) {
                kkVar = C67083kk.f182351g;
            }
            int i = kkVar.f182354b;
            this.f213928r.mo28212l("[NGA] RohanSodaCallbackAdapter.processRecognitionEvent", new C77658d(this, koVar, dVar));
            z = true;
        }
        if ((koVar.f182368a & 4) != 0) {
            this.f213928r.mo28212l("[NGA] RohanSodaCallbackAdapter.processPredictedRecognitionEvent", new C77659e(this, koVar, dVar));
            z = true;
        }
        if ((koVar.f182368a & 32) != 0) {
            this.f213927q.mo28212l("[NGA] RohanSodaCallbackAdapter.processAudioLevelInfo", new C77660f(this, koVar, dVar));
            this.f213927q.mo28212l("[NGA] RohanSodaCallbackAdapter.recordAudioLevelInfo", new C77661g(this, koVar, dVar));
        } else {
            z2 = z;
        }
        if ((koVar.f182368a & 8) == 0 && !z2) {
            ((C58970a) ((C58970a) f213911p.mo56226d()).mo56372aa(4348)).mo56386p("Received SodaEvent with no valid events");
        }
    }

    /* renamed from: u */
    public final /* synthetic */ void mo23783u() {
    }

    /* renamed from: v */
    public final void mo23784v(C19243af afVar) {
        this.f213925n = true;
        if (afVar == C19243af.HOTWORD_TIMEOUT) {
            ((C58970a) ((C58970a) f213911p.mo56226d()).mo56372aa(4352)).mo56386p("Soda failed validating preamble audio!");
        }
        this.f213923l.set((Object) null);
        this.f213924m.set((Object) null);
    }

    /* renamed from: d */
    public static Optional m124633d(C67024if ifVar) {
        int a = C67023ie.m97409a(ifVar.f182186a);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i == 1) {
            return Optional.m71637of(C77890v.HOTWORD_NOT_FOUND);
        }
        if (i != 2) {
            return Optional.empty();
        }
        return Optional.m71637of(C77890v.HOTWORD_FOUND);
    }
}
