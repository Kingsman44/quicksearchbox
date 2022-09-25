package com.google.android.apps.gsa.nga.engine.recognition.p6127l.p6128a;

import com.google.android.apps.gsa.nga.engine.b.g.ac;
import com.google.android.apps.gsa.nga.engine.d.a.a.c;
import com.google.android.apps.gsa.nga.engine.p6260x.C79856d;
import com.google.android.apps.gsa.nga.engine.recognition.C77549ab;
import com.google.android.apps.gsa.nga.engine.recognition.C77581c;
import com.google.android.apps.gsa.nga.engine.recognition.C77632g;
import com.google.android.apps.gsa.nga.engine.recognition.C77890v;
import com.google.android.apps.gsa.nga.engine.recognition.p6119h.p6120a.C77652a;
import com.google.android.apps.gsa.nga.engine.recognition.p6125k.C77732a;
import com.google.android.apps.gsa.nga.engine.recognition.p6136o.C77881f;
import com.google.android.apps.gsa.nga.shared.p6363s.C81459h;
import com.google.android.apps.gsa.nga.shared.p6363s.C81465n;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82452fs;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90821bm;
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

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.l.a.af */
/* compiled from: PG */
public final class C77752af implements C19347o, C19282t {

    /* renamed from: q */
    private static final C58974d f214182q = C58974d.m91136j();

    /* renamed from: a */
    public final C60950i f214183a;

    /* renamed from: b */
    public final C77549ab f214184b;

    /* renamed from: c */
    public final c f214185c;

    /* renamed from: d */
    public final C91142g f214186d;

    /* renamed from: e */
    public final Optional f214187e;

    /* renamed from: f */
    public final C21370a f214188f;

    /* renamed from: g */
    public final C77782bi f214189g;

    /* renamed from: h */
    public final C77810o f214190h;

    /* renamed from: i */
    public final C77881f f214191i;

    /* renamed from: j */
    public final C77581c f214192j;

    /* renamed from: k */
    public final C77795bv f214193k;

    /* renamed from: l */
    public final C77732a f214194l;

    /* renamed from: m */
    public final C81459h f214195m;

    /* renamed from: n */
    public final C77632g f214196n;

    /* renamed from: o */
    public boolean f214197o = true;

    /* renamed from: p */
    public final C77652a f214198p;

    /* renamed from: r */
    private final C22871g f214199r;

    /* renamed from: s */
    private final C22871g f214200s;

    /* renamed from: t */
    private final AtomicReference f214201t = new AtomicReference();

    /* renamed from: u */
    private final AtomicReference f214202u = new AtomicReference();

    public C77752af(C60950i iVar, C77549ab abVar, c cVar, C91142g gVar, Optional optional, C21370a aVar, C90821bm bmVar, C22871g gVar2, C81465n nVar, C22871g gVar3, C77782bi biVar, C77810o oVar, C77881f fVar, C77581c cVar2, C77795bv bvVar, C77732a aVar2, C77652a aVar3, C77632g gVar4) {
        this.f214183a = iVar;
        this.f214184b = abVar;
        this.f214185c = cVar;
        this.f214186d = gVar;
        this.f214187e = optional;
        this.f214188f = aVar;
        this.f214199r = gVar2;
        this.f214189g = biVar;
        this.f214190h = oVar;
        this.f214191i = fVar;
        this.f214192j = cVar2;
        C90821bm bmVar2 = bmVar;
        this.f214200s = bmVar.mo85163a(C77751ae.class);
        this.f214193k = bvVar;
        this.f214194l = aVar2;
        this.f214198p = aVar3;
        C81465n nVar2 = nVar;
        C22871g gVar5 = gVar3;
        this.f214195m = nVar.mo75095b(gVar3, C77749ac.f214180a);
        this.f214196n = gVar4;
    }

    /* renamed from: e */
    public final Optional mo24439e() {
        ac acVar;
        C79856d dVar = (C79856d) this.f214201t.get();
        if (dVar == null || (acVar = dVar.f218924a) == null) {
            return Optional.empty();
        }
        return Optional.m71637of(acVar.b());
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x000c A[LOOP:0: B:1:0x000c->B:4:0x0018, LOOP_START] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo72812f(com.google.android.apps.gsa.nga.engine.p6260x.C79856d r3) {
        /*
            r2 = this;
            com.google.android.apps.gsa.nga.engine.b.g.ac r0 = r3.f218924a
            r0.c()
            java.util.concurrent.atomic.AtomicReference r0 = r2.f214202u
            r0.set(r3)
            java.util.concurrent.atomic.AtomicReference r0 = r2.f214201t
        L_0x000c:
            r1 = 0
            boolean r1 = r0.compareAndSet(r1, r3)
            if (r1 == 0) goto L_0x0014
            goto L_0x001a
        L_0x0014:
            java.lang.Object r1 = r0.get()
            if (r1 == 0) goto L_0x000c
        L_0x001a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.recognition.p6127l.p6128a.C77752af.mo72812f(com.google.android.apps.gsa.nga.engine.x.d):void");
    }

    /* renamed from: t */
    public final void mo23782t(C67087ko koVar) {
        boolean z;
        boolean z2 = true;
        if ((koVar.f182368a & C89885b.HTTP_VALUE) != 0) {
            if (this.f214187e.isPresent()) {
                this.f214199r.mo28212l("[NGA] SodaCallbackAdapter.logBatchMetricsEvent", new C77819x(this, koVar));
            } else {
                ((C58970a) ((C58970a) f214182q.mo56226d()).mo56372aa(4432)).mo56386p("Missing Soda metrics logger");
            }
            z = true;
        } else {
            z = false;
        }
        if (this.f214197o) {
            this.f214201t.set((C79856d) this.f214202u.get());
        }
        C79856d dVar = (C79856d) this.f214201t.get();
        if (dVar == null) {
            ((C58970a) ((C58970a) f214182q.mo56226d()).mo56372aa(4431)).mo56386p("Candidate identifiers aren't set, ignoring.");
            return;
        }
        if ((koVar.f182368a & 2) != 0) {
            C67083kk kkVar = koVar.f182370c;
            if (kkVar == null) {
                kkVar = C67083kk.f182351g;
            }
            int i = kkVar.f182354b;
            this.f214200s.mo28212l("[NGA] SodaCallbackAdapter.processRecognitionEvent", new C77820y(this, koVar, dVar));
            z = true;
        }
        if ((koVar.f182368a & 4) != 0) {
            this.f214200s.mo28212l("[NGA] SodaCallbackAdapter.processPredictedRecognitionEvent", new C77821z(this, koVar, dVar));
            z = true;
        }
        if ((koVar.f182368a & 32) != 0) {
            this.f214199r.mo28212l("[NGA] SodaCallbackAdapter.processAudioLevelInfo", new C77747aa(this, koVar, dVar));
            this.f214200s.mo28212l("[NGA] SodaCallbackAdapter.recordAudioLevelInfo", new C77748ab(this, koVar, dVar));
        } else {
            z2 = z;
        }
        if ((koVar.f182368a & 8) == 0 && !z2) {
            ((C58970a) ((C58970a) f214182q.mo56226d()).mo56372aa(4429)).mo56386p("Received SodaEvent with no valid events");
        }
    }

    /* renamed from: u */
    public final /* synthetic */ void mo23783u() {
    }

    /* renamed from: v */
    public final void mo23784v(C19243af afVar) {
        this.f214197o = true;
        if (afVar == C19243af.HOTWORD_TIMEOUT) {
            this.f214194l.f214135e.mo75579d(new C82452fs("NGA_UNEXPECTED_HOTWORD_TIMEOUT"));
            ((C58970a) ((C58970a) f214182q.mo56226d()).mo56372aa(4433)).mo56386p("Soda failed validating preamble audio!");
        }
        this.f214201t.set((Object) null);
        this.f214202u.set((Object) null);
    }

    /* renamed from: d */
    public static Optional m124749d(C67024if ifVar) {
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
