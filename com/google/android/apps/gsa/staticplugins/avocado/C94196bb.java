package com.google.android.apps.gsa.staticplugins.avocado;

import android.os.Bundle;
import com.google.android.apps.gsa.assistant.settings.features.avocado.ai;
import com.google.android.apps.gsa.assistant.shared.p5809c.C73849a;
import com.google.android.apps.gsa.opaonboarding.C83869ac;
import com.google.android.apps.gsa.opaonboarding.C83956t;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83923j;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.bb */
/* compiled from: PG */
public final class C94196bb extends C83869ac {

    /* renamed from: a */
    private static final C59071e f263190a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.avocado.bb");

    /* renamed from: b */
    private final Bundle f263191b;

    /* renamed from: c */
    private final C90021c f263192c;

    /* renamed from: d */
    private final C94324k f263193d;

    /* renamed from: e */
    private final C94267ds f263194e;

    /* renamed from: f */
    private final ai f263195f;

    public C94196bb(Bundle bundle, C90021c cVar, C94324k kVar, C94267ds dsVar, ai aiVar) {
        this.f263191b = bundle;
        this.f263192c = cVar;
        this.f263193d = kVar;
        this.f263194e = dsVar;
        this.f263195f = aiVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C83956t mo77207a() {
        if (this.f263195f.e()) {
            C94267ds dsVar = this.f263194e;
            Bundle bundle = this.f263191b;
            bundle.getClass();
            C94324k kVar = (C94324k) dsVar.f263434a.mo17428b();
            kVar.getClass();
            C94263do doVar = (C94263do) dsVar.f263435b.mo17428b();
            doVar.getClass();
            C94175as asVar = (C94175as) dsVar.f263436c.mo17428b();
            asVar.getClass();
            C94299ex exVar = (C94299ex) dsVar.f263437d.mo17428b();
            exVar.getClass();
            C90021c cVar = (C90021c) dsVar.f263438e.mo17428b();
            cVar.getClass();
            ai aiVar = (ai) dsVar.f263439f.mo17428b();
            aiVar.getClass();
            return new C94266dr(bundle, kVar, doVar, asVar, exVar, cVar, aiVar);
        }
        C83923j jVar = (C83923j) ProtoParsers.m95522e(this.f263191b, "AvocadoRetrainDevices", C83923j.f228570d, C62921ba.m95368a());
        ((C59052c) ((C59052c) f263190a.mo56224b()).mo56372aa(14237)).mo56387q("Retrain for %d device(s)", jVar.f228573b.size());
        return this.f263193d.mo88460a(jVar, this.f263192c.mo79746e(C90082eg.f249909aY));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo77208b() {
        return C73849a.m108439a(this.f263192c);
    }
}
