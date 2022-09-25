package com.google.android.apps.gsa.staticplugins.p7666ci;

import android.content.Context;
import com.google.android.apps.gsa.opa.smartspace.C83794j;
import com.google.android.apps.gsa.p8839t.p8842c.C118348a;
import com.google.android.apps.gsa.search.core.google.gaia.p6800c.p6801a.C86034c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90070dv;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile.C110619bw;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.android.apps.search.assistant.platform.pcp.featuredata.p9333c.C123841an;
import com.google.android.apps.search.assistant.platform.pcp.featuredata.p9333c.C123853az;
import com.google.android.apps.search.assistant.platform.pcp.featuredata.p9333c.C123881z;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.gsa.staticplugins.ci.ao */
/* compiled from: PG */
public final class C97775ao implements C118549h {

    /* renamed from: a */
    public static final C59071e f272987a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.ci.ao");

    /* renamed from: b */
    public final C123853az f272988b;

    /* renamed from: c */
    public final Context f272989c;

    /* renamed from: d */
    public final C86034c f272990d;

    /* renamed from: e */
    public final C123841an f272991e;

    /* renamed from: f */
    public final C60888db f272992f;

    /* renamed from: g */
    public final Executor f272993g;

    /* renamed from: h */
    public final C123881z f272994h;

    /* renamed from: i */
    public final boolean f272995i;

    /* renamed from: j */
    private final C58833ax f272996j;

    /* renamed from: k */
    private final C83794j f272997k;

    /* renamed from: l */
    private final C86124t f272998l;

    /* renamed from: m */
    private final C110619bw f272999m;

    public C97775ao(C58833ax axVar, C123853az azVar, C110619bw bwVar, C83794j jVar, Context context, C86034c cVar, C123841an anVar, C86124t tVar, C90851k kVar, Executor executor, boolean z, C123881z zVar) {
        this.f272996j = axVar;
        this.f272988b = azVar;
        this.f272999m = bwVar;
        this.f272997k = jVar;
        this.f272989c = context;
        this.f272990d = cVar;
        this.f272991e = anVar;
        this.f272998l = tVar;
        this.f272992f = kVar.mo85208a("backgroundExecutor");
        this.f272993g = executor;
        this.f272994h = zVar;
        this.f272995i = z;
    }

    /* renamed from: a */
    public final C60870cx mo65234a(C118476ak akVar) {
        C58976aa aaVar = C58975e.f156826a;
        ArrayList arrayList = new ArrayList();
        if (this.f272997k.mo77185x()) {
            arrayList.add(C60922j.m93045h(this.f272999m.mo98817a(), new C97766af(this), C60826bg.f164896a));
        }
        if (!this.f272996j.mo56113h() || !this.f272998l.mo79746e(C90070dv.f249750b)) {
            C59104x c = f272987a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "PCP.BackgroundTask");
            ((C59052c) ((C59052c) c).mo56372aa(30250)).mo56386p("Missing PCP TNG entry point binding, or zero state response to PCP is not enabled.");
        } else {
            arrayList.add(((C118348a) this.f272996j.mo56107c()).mo90803a());
        }
        return C47638k.m84750a(arrayList).mo51521b(C97767ag.f272981a, this.f272993g);
    }
}
