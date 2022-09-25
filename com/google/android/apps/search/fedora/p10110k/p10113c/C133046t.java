package com.google.android.apps.search.fedora.p10110k.p10113c;

import android.content.Context;
import com.google.android.apps.search.fedora.metrics.C133072j;
import com.google.android.gms.learning.InAppTrainerOptions;
import com.google.android.gms.learning.internal.training.C144791ab;
import com.google.android.gms.learning.internal.training.C144796ag;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.libraries.assistant.trainingcache.p1615a.p1616a.C19416t;
import com.google.android.libraries.p3339v.C43205e;
import com.google.android.play.core.p3538g.C45188w;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.apps.tiktok.tracing.contrib.p3707h.C47689c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.search.fedora.k.c.t */
/* compiled from: PG */
public final class C133046t implements C133026a {

    /* renamed from: a */
    public static final C59071e f362774a = C59071e.m91332i("com.google.android.apps.search.fedora.k.c.t");

    /* renamed from: b */
    public final AtomicBoolean f362775b = new AtomicBoolean(false);

    /* renamed from: c */
    public final Context f362776c;

    /* renamed from: d */
    public final Set f362777d;

    /* renamed from: e */
    public final Executor f362778e;

    /* renamed from: f */
    public final C133072j f362779f;

    /* renamed from: g */
    private final Set f362780g;

    public C133046t(Context context, Set set, Set set2, Executor executor, C133072j jVar) {
        this.f362776c = context;
        this.f362780g = set;
        this.f362777d = set2;
        this.f362778e = executor;
        this.f362779f = jVar;
    }

    /* renamed from: d */
    private final boolean m216000d() {
        return C45188w.m80459a(this.f362776c).mo49000g().contains("fedora_brella_feature_module");
    }

    /* renamed from: a */
    public final C60870cx mo110955a(boolean z) {
        C59071e eVar = f362774a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "FedoraTrngRegServ");
        ((C59052c) ((C59052c) b).mo56372aa(39989)).mo56386p("Received the register training request.");
        boolean d = m216000d();
        this.f362779f.mo110965c("FedoraTNG.Brella.SplitApkStatus.Register", d ? 1 : 0);
        if (d) {
            ArrayList arrayList = new ArrayList();
            C59104x b2 = eVar.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "FedoraTrngRegServ");
            ((C59052c) ((C59052c) b2).mo56372aa(39987)).mo56386p("Processing FedoraTngFlTrainerOptionsProviders...");
            C47633f g = C47633f.m84733g(C60866ct.f164955a);
            ArrayList arrayList2 = new ArrayList();
            for (C19416t bVar : this.f362780g) {
                C47633f i = g.mo51516i(new C133028b(bVar), this.f362778e).mo51516i(new C133036j(this, z), this.f362778e);
                arrayList2.add(i);
                g = i.mo51514f(Throwable.class, C133037k.f362763a, this.f362778e);
            }
            C47633f g2 = C47633f.m84733g(C47638k.m84752c(arrayList2).mo51521b(C133038l.f362764a, this.f362778e));
            arrayList.add(g2);
            arrayList.add(g2.mo51514f(Throwable.class, C133039m.f362765a, this.f362778e).mo51516i(new C133040n(this, z), this.f362778e));
            return C47638k.m84752c(arrayList).mo51521b(C133041o.f362768a, this.f362778e);
        } else if (this.f362775b.get()) {
            return C60866ct.f164955a;
        } else {
            C59104x b3 = eVar.mo56224b();
            b3.mo56378ag(C58975e.f156826a, "FedoraTrngRegServ");
            ((C59052c) ((C59052c) b3).mo56372aa(39978)).mo56389s("Installing %s...", "fedora_brella_feature_module");
            this.f362779f.mo110963a("FedoraTNG.Brella.NumInstallSplitApkStart");
            C146006ab a = C45188w.m80459a(this.f362776c).mo48994a(Arrays.asList(new String[]{"fedora_brella_feature_module"}));
            a.mo122499r(new C133042p(this));
            a.mo122498q(new C133043q(this));
            return C47689c.m84830a(a);
        }
    }

    /* renamed from: b */
    public final C60870cx mo110956b() {
        C59104x b = f362774a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "FedoraTrngRegServ");
        ((C59052c) ((C59052c) b).mo56372aa(39990)).mo56386p("Received the unregister training request.");
        this.f362779f.mo110965c("FedoraTNG.Brella.SplitApkStatus.UnRegister", m216000d() ? 1 : 0);
        return C43205e.m76192b(C144791ab.m235321b(this.f362776c, this.f362778e).mo122484c(this.f362778e, C133044r.f362771a));
    }

    /* renamed from: c */
    public final C60870cx mo110957c(InAppTrainerOptions inAppTrainerOptions) {
        this.f362779f.mo110963a("FedoraTNG.Brella.NumRegisterTraining");
        C146006ab c = C144796ag.m235326b(this.f362776c, this.f362778e, inAppTrainerOptions).mo122484c(this.f362778e, C133029c.f362752a);
        c.mo122499r(new C133030d(inAppTrainerOptions));
        c.mo122498q(new C133031e(inAppTrainerOptions));
        return C43205e.m76192b(c);
    }
}
