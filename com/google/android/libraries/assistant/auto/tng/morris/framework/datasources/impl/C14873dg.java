package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123762cb;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123764cd;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123768ch;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123770cj;
import com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.C14781a;
import com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.C14782b;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14218bb;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14219bc;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14220bd;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14221be;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14324f;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14499lm;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14544nd;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14545ne;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14546nf;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1243h.p1253e.C16269a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3994s.p3995a.C53270hr;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.Iterator;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.dg */
/* compiled from: PG */
public final class C14873dg implements C14781a {

    /* renamed from: b */
    private static final C59071e f44758b = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.dg");

    /* renamed from: a */
    public Optional f44759a = Optional.empty();

    /* renamed from: c */
    private final C16269a f44760c;

    /* renamed from: d */
    private final C60887da f44761d;

    public C14873dg(C16269a aVar, C60887da daVar) {
        this.f44760c = aVar;
        this.f44761d = daVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo21501a() {
    }

    /* renamed from: b */
    public final /* synthetic */ void mo21502b() {
    }

    /* renamed from: c */
    public final /* synthetic */ void mo21503c() {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo21504d() {
    }

    /* renamed from: e */
    public final /* synthetic */ void mo21505e() {
    }

    /* renamed from: g */
    public final /* synthetic */ void mo21506g() {
    }

    /* renamed from: h */
    public final C14221be mo21727h(C14219bc bcVar) {
        C14544nd ndVar;
        if (C14218bb.m30579a(bcVar.f43038a) != C14218bb.TOP_CONTACT_DATA_REQUEST || this.f44759a.isEmpty()) {
            C59104x c = f44758b.mo56225c();
            c.mo56378ag(C58975e.f156826a, "Morris.TopContctDataSrc");
            ((C59052c) ((C59052c) c).mo56372aa(45665)).mo56355H("Error fetching data for request type %s. Data present: %b", C14218bb.m30579a(bcVar.f43038a).name(), this.f44759a.isPresent());
            return C14221be.f43041c;
        }
        C14545ne neVar = (C14545ne) C14546nf.f43997b.createBuilder();
        Iterator it = ((C123770cj) this.f44759a.get()).f341901a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C123768ch chVar = (C123768ch) it.next();
            if (chVar.f341897b.isEmpty()) {
                C58976aa aaVar = C58975e.f156826a;
                C123762cb a = C123762cb.m203107a(chVar.f341898c);
                if (a == null) {
                    a = C123762cb.AFFINITY_TYPE_UNSPECIFIED;
                }
                a.name();
            } else {
                if (bcVar.f43038a == 14) {
                    ndVar = (C14544nd) bcVar.f43039b;
                } else {
                    ndVar = C14544nd.f43994b;
                }
                C123764cd cdVar = ndVar.f43996a;
                if (cdVar == null) {
                    cdVar = C123764cd.f341880c;
                }
                C123762cb a2 = C123762cb.m203107a(cdVar.f341883b);
                if (a2 == null) {
                    a2 = C123762cb.AFFINITY_TYPE_UNSPECIFIED;
                }
                C123762cb a3 = C123762cb.m203107a(chVar.f341898c);
                if (a3 == null) {
                    a3 = C123762cb.AFFINITY_TYPE_UNSPECIFIED;
                }
                if (a2.equals(a3)) {
                    C62971cq cqVar = chVar.f341897b;
                    neVar.copyOnWrite();
                    C14546nf nfVar = (C14546nf) neVar.instance;
                    C62971cq cqVar2 = nfVar.f43999a;
                    if (!cqVar2.mo58948c()) {
                        nfVar.f43999a = C62942bv.mutableCopy(cqVar2);
                    }
                    C62947c.addAll((Iterable) cqVar, (List) nfVar.f43999a);
                }
            }
        }
        C14220bd bdVar = (C14220bd) C14221be.f43041c.createBuilder();
        bdVar.copyOnWrite();
        C14221be beVar = (C14221be) bdVar.instance;
        C14546nf nfVar2 = (C14546nf) neVar.build();
        nfVar2.getClass();
        beVar.f43044b = nfVar2;
        beVar.f43043a = 10;
        return (C14221be) bdVar.build();
    }

    /* renamed from: i */
    public final C60870cx mo21728i(C14219bc bcVar) {
        if (C14218bb.m30579a(bcVar.f43038a) != C14218bb.TOP_CONTACT_DATA_REQUEST) {
            return C60856cj.m92900i(C14782b.FAILED);
        }
        if (this.f44759a.isPresent()) {
            C58976aa aaVar = C58975e.f156826a;
            return C60856cj.m92900i(C14782b.SUCCESS);
        }
        this.f44759a = Optional.m71637of(C123770cj.f341899b);
        C60870cx a = this.f44760c.mo22867a(C53306j.MORRIS, C58485gu.m89846n(8), true, C53270hr.FOREGROUND, Optional.empty());
        C14872df dfVar = new C14872df(this);
        return C60922j.m93045h(a, C47810es.m84966f(dfVar), this.f44761d);
    }

    /* renamed from: t */
    public final void mo21729t(C14219bc bcVar, C14324f fVar, C14499lm lmVar) {
    }
}
