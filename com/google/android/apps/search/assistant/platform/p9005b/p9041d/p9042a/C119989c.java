package com.google.android.apps.search.assistant.platform.p9005b.p9041d.p9042a;

import com.google.android.apps.gsa.binaries.satin.app.C74091jf;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119779aa;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119787ai;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119789ak;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119803ay;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119804az;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119829bx;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119869dj;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119870dk;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119874do;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119893l;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119906y;
import com.google.android.apps.search.assistant.platform.p9005b.p9041d.p9042a.C119970b;
import com.google.android.libraries.search.assistant.p2570h.p2571a.p2572a.p2573a.C33435c;
import com.google.android.libraries.search.assistant.p2570h.p2571a.p2572a.p2573a.C33436d;
import com.google.android.libraries.search.assistant.p2570h.p2578b.p2579a.C33463b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62912at;
import com.google.protobuf.C62963cj;
import dagger.hilt.C68286a;
import dagger.p5294a.C68221g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p5488io.grpc.Status;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.platform.b.d.a.c */
/* compiled from: PG */
final class C119989c implements C70862aj {

    /* renamed from: a */
    final /* synthetic */ C119970b f334108a;

    /* renamed from: b */
    private final C70862aj f334109b;

    /* renamed from: c */
    private C70862aj f334110c = null;

    public C119989c(C119970b bVar, C70862aj ajVar) {
        this.f334108a = bVar;
        this.f334109b = ajVar;
    }

    /* renamed from: d */
    private final void m198893d(Throwable th) {
        this.f334110c = C119970b.f334080a;
        this.f334109b.mo20122b(th);
    }

    /* renamed from: a */
    public final void mo20121a() {
        C70862aj ajVar = this.f334110c;
        if (ajVar != null) {
            ajVar.mo20121a();
        } else {
            m198893d(Status.f186906d.withDescription("First ClientToPlatform should be ClientToPlatform.Connect").asException());
        }
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        C70862aj ajVar = this.f334110c;
        if (ajVar != null) {
            ajVar.mo20122b(th);
        } else {
            m198893d(th);
        }
    }

    /* renamed from: c */
    public final /* synthetic */ void mo20123c(Object obj) {
        C119804az azVar = (C119804az) obj;
        C70862aj ajVar = this.f334110c;
        if (ajVar != null) {
            ajVar.mo20123c(azVar);
        } else if (azVar.f333705a == 1) {
            C119970b bVar = this.f334108a;
            C70862aj ajVar2 = this.f334109b;
            C119789ak akVar = ((C119803ay) azVar.f333706b).f333701a;
            if (akVar == null) {
                akVar = C119789ak.f333656k;
            }
            C119990d dVar = new C119990d(akVar, ajVar2);
            C33436d dVar2 = bVar.f334081b;
            C74091jf jfVar = (C74091jf) dVar2.f89536a.mo17428b();
            jfVar.getClass();
            Optional optional = (Optional) ((C68221g) dVar2.f89537b).f184583a;
            optional.getClass();
            C33435c cVar = new C33435c(dVar, jfVar, optional);
            C119996j a = ((C119970b.C119971a) C68286a.m98629a(cVar.f89535a, C119970b.C119971a.class)).mo104592a();
            C58976aa aaVar = C58975e.f156826a;
            C58838bb.m90884s(a.f334126h == null, "#start was already called");
            a.f334126h = cVar;
            C119870dk dkVar = (C119870dk) C119874do.f333841c.createBuilder();
            C62912at atVar = C62912at.f169862a;
            dkVar.copyOnWrite();
            C119874do doVar = (C119874do) dkVar.instance;
            atVar.getClass();
            doVar.f333844b = atVar;
            doVar.f333843a = 1;
            a.mo104614b((C119874do) dkVar.build());
            a.f334125g.mo38840a(new C119992f(a));
            C119997k kVar = (C119997k) a.f334120b.mo17428b();
            C119979bg bgVar = kVar.f334128a;
            bgVar.f334091c.mo104877b().mo104264b(new C119975bc(bgVar));
            bgVar.f334092d.execute(C47810es.m84977q(new C119976bd(bgVar)));
            C120003q qVar = kVar.f334129b;
            qVar.f334137a.mo38870a("Preferred ASR Engines (AsrConfiguration.preferredEngine):", (List) Collection.EL.stream(new C62963cj(qVar.f334138b.f333896b, C119893l.f333892c)).map(C120002p.f334136a).collect(C58370cn.f155946a));
            qVar.f334137a.mo38870a("Preferred Fulfillment Engines (FulfillmentConfiguration.preferredEngine):", (List) Collection.EL.stream(new C62963cj(qVar.f334139c.f333760b, C119829bx.f333756c)).map(C120001o.f334135a).collect(C58370cn.f155946a));
            ArrayList arrayList = new ArrayList();
            C119829bx bxVar = qVar.f334139c;
            if ((bxVar.f333759a & 1) != 0) {
                boolean z = bxVar.f333761d;
                arrayList.add("Use Final Pipeline Mode: " + z);
            }
            C119829bx bxVar2 = qVar.f334139c;
            if ((bxVar2.f333759a & 2) != 0) {
                boolean z2 = bxVar2.f333762e;
                arrayList.add("Ignore Auth Token Fetch Failures: " + z2);
            }
            if (!arrayList.isEmpty()) {
                qVar.f334137a.mo38870a("Fulfillment Configuration (FulfillmentConfiguration):", arrayList);
            }
            C119779aa aaVar2 = qVar.f334140d;
            if ((aaVar2.f333644a & 1) != 0) {
                C119906y yVar = aaVar2.f333645b;
                if (yVar == null) {
                    yVar = C119906y.f333913e;
                }
                ArrayList arrayList2 = new ArrayList();
                if ((yVar.f333915a & 1) != 0) {
                    boolean z3 = yVar.f333916b;
                    arrayList2.add("Ignore Focus Loss: " + z3);
                }
                if ((yVar.f333915a & 2) != 0) {
                    boolean z4 = yVar.f333917c;
                    arrayList2.add("Ignore Focus Acquisition Error: " + z4);
                }
                if (!arrayList2.isEmpty()) {
                    qVar.f334137a.mo38870a("Manage Audio Focus (AudioConfiguration.manageAudioFocus):", arrayList2);
                }
            }
            C119869dj djVar = qVar.f334141e;
            if ((djVar.f333834a & 1) != 0) {
                C33463b bVar2 = qVar.f334137a;
                boolean z5 = djVar.f333835b;
                bVar2.mo38870a("On-device MDA Configuration (OnDeviceMdaConfiguration):", Arrays.asList(new String[]{"Use On-device Arbitration: " + z5}));
            }
            ArrayList arrayList3 = new ArrayList();
            C119787ai aiVar = qVar.f334142f;
            if ((1 & aiVar.f333653a) != 0) {
                int i = aiVar.f333654b;
                arrayList3.add("No Speech Timeout: " + i);
            }
            C119787ai aiVar2 = qVar.f334142f;
            if ((aiVar2.f333653a & 2) != 0) {
                int i2 = aiVar2.f333655c;
                arrayList3.add("Fallback Trigger Duration (ms): " + i2);
            }
            if (!arrayList3.isEmpty()) {
                qVar.f334137a.mo38870a("Backup Speech Timeout Configuration (BackupSpeechTimeoutConfiguration)", arrayList3);
            }
            this.f334110c = new C119995i(a);
        } else {
            m198893d(Status.f186906d.withDescription("First ClientToPlatform should be ClientToPlatform.Connect").asException());
        }
    }
}
