package com.google.android.apps.gsa.staticplugins.nga.p8069l;

import com.google.android.apps.gsa.n.b;
import com.google.android.apps.gsa.nga.api.C74714bo;
import com.google.android.apps.gsa.nga.shared.p6407v.C83278h;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82421eo;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82453ft;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.staticplugins.nga.p8044a.p8045a.C102909ar;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119291m;
import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119295q;
import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119302x;
import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119303y;
import com.google.android.apps.search.assistant.libraries.dictation.starter.p8962a.C119312g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4552o.ahi;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65806cj;
import p3186j$.time.Duration;
import p3186j$.util.Optional;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.l.e */
/* compiled from: PG */
public final class C103393e implements C118549h {

    /* renamed from: a */
    public static final C58974d f288216a = C58974d.m91136j();

    /* renamed from: b */
    public static final C65753ak f288217b = C65753ak.PRIVACY_SETTINGS;

    /* renamed from: c */
    public static final String f288218c = C65806cj.SEARCH_AND_ASSISTANT.name();

    /* renamed from: d */
    public static final Duration f288219d = Duration.ofDays(1);

    /* renamed from: e */
    public final C83278h f288220e;

    /* renamed from: f */
    public final C102909ar f288221f;

    /* renamed from: g */
    public final b f288222g;

    /* renamed from: h */
    public final C86054o f288223h;

    /* renamed from: i */
    public final C83305i f288224i;

    /* renamed from: j */
    public final C60950i f288225j;

    /* renamed from: k */
    private final C74714bo f288226k;

    /* renamed from: l */
    private final Optional f288227l;

    /* renamed from: m */
    private final C86124t f288228m;

    /* renamed from: n */
    private final C22871g f288229n;

    public C103393e(C74714bo boVar, C83278h hVar, C102909ar arVar, b bVar, Optional optional, C86124t tVar, C86054o oVar, C83305i iVar, C60950i iVar2, C22871g gVar) {
        this.f288226k = boVar;
        this.f288220e = hVar;
        this.f288221f = arVar;
        this.f288222g = bVar;
        this.f288227l = optional;
        this.f288228m = tVar;
        this.f288223h = oVar;
        this.f288224i = iVar;
        this.f288225j = iVar2;
        this.f288229n = gVar;
    }

    /* renamed from: a */
    public final C60870cx mo65234a(C118476ak akVar) {
        C60870cx cxVar;
        ahi b = this.f288226k.mo71080b();
        String name = b.name();
        if (name != null) {
            this.f288224i.mo75579d(new C82453ft("NGA_USER_ELIGIBLE", name));
            this.f288224i.mo75579d(new C82421eo("NGA_SAA_ENABLED", this.f288221f.mo93531k()));
            C22871g gVar = this.f288229n;
            if (!this.f288228m.mo79746e(C90126fx.f251446iv)) {
                cxVar = C60856cj.m92900i(false);
            } else if (this.f288227l.isEmpty()) {
                cxVar = C60856cj.m92900i(false);
            } else {
                C22871g gVar2 = this.f288229n;
                C119291m mVar = (C119291m) ((C119312g) this.f288227l.get()).f332704a.mo17428b();
                C119302x xVar = (C119302x) C119303y.f332680b.createBuilder();
                xVar.copyOnWrite();
                ((C119303y) xVar.instance).f332682a = true;
                cxVar = gVar2.mo28209i(C70876o.m103760a(mVar.f189039a.mo39510a(C119295q.m197987c(), mVar.f189040b), (C119303y) xVar.build()), "[NGA] NgaStateReportTask.getDictationUsedTodayOrSinceLastTaskRun", new C103385a(this));
            }
            return C118826c.m197212b(C58485gu.m89847o(gVar.mo28209i(cxVar, "[NGA] NgaStateReportTask.getDictationUsedTodayOrSinceLastTaskRun", new C103391c(this, b)), this.f288229n.mo28201a("[NGA] NgaStateReportTask.logGellerStatus", new C103392d(this))));
        }
        throw new NullPointerException("Null eligibilityReason");
    }
}
