package com.google.android.apps.gsa.staticplugins.opa.worker.p8613h;

import android.content.SharedPreferences;
import androidx.work.WorkerParameters;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.staticplugins.opa.p8625z.p8626a.C114540i;
import com.google.android.apps.gsa.staticplugins.opa.util.C113779av;
import com.google.android.apps.gsa.staticplugins.opa.util.C113780aw;
import com.google.android.apps.gsa.staticplugins.opa.util.C113785ba;
import com.google.android.apps.gsa.staticplugins.opa.util.C113879j;
import com.google.android.apps.gsa.staticplugins.opa.util.C113880k;
import com.google.android.apps.gsa.staticplugins.opa.util.p8593a.C113746a;
import com.google.apps.tiktok.contrib.work.C46575i;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import dagger.p5294a.C68225k;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.h.k */
/* compiled from: PG */
public final class C114328k implements C46575i {

    /* renamed from: a */
    private static final C59071e f316993a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.worker.h.k");

    /* renamed from: b */
    private final C113880k f316994b;

    public C114328k(C113880k kVar) {
        this.f316994b = kVar;
    }

    /* renamed from: b */
    public final C60870cx mo21393b(WorkerParameters workerParameters) {
        ((C59052c) ((C59052c) f316993a.mo56224b()).mo56372aa(28953)).mo56386p("Start work");
        C113880k kVar = this.f316994b;
        C113785ba baVar = (C113785ba) kVar.f315313h.mo27525b();
        C86124t tVar = baVar.f315128f;
        tVar.getClass();
        C113779av avVar = new C113779av(baVar);
        C113780aw awVar = new C113780aw(baVar);
        Boolean valueOf = Boolean.valueOf(((Boolean) baVar.f315126d.mo6453a()).booleanValue());
        C89356b b = baVar.f315130h.mo78026b("NgaInteractionReset", C118575h.GRAPH_INPUT_PLATE_QUERY_COUNTER_RESET, C118575h.GRAPH_INPUT_PLATE_QUERY_COUNTER_RESET);
        C114540i iVar = (C114540i) kVar.f315310e.mo27525b();
        iVar.getClass();
        SharedPreferences sharedPreferences = kVar.f315307b;
        sharedPreferences.getClass();
        C68214a aVar = kVar.f315311f;
        Objects.requireNonNull(aVar);
        C113879j jVar = new C113879j(aVar);
        C68225k.m98529a(tVar, C86124t.class);
        C68225k.m98529a(avVar, C58881cr.class);
        C68225k.m98529a(iVar, C114540i.class);
        C68225k.m98529a(awVar, C58881cr.class);
        C68225k.m98529a(valueOf, Boolean.class);
        C68225k.m98529a(b, C89356b.class);
        C68225k.m98529a(sharedPreferences, SharedPreferences.class);
        C68225k.m98529a(jVar, C58881cr.class);
        C60870cx g = C60922j.m93044g(new C113746a(tVar, avVar, iVar, awVar, valueOf, b, sharedPreferences, jVar).f315012a.mo60297gq(), C114327j.f316992a, C60826bg.f164896a);
        C90476a aVar2 = C91018d.f254254a;
        return g;
    }
}
