package com.google.android.apps.search.assistant.platform.appintegration.p9001g;

import com.google.android.apps.search.assistant.platform.appintegration.grpc.C119624f;
import com.google.android.apps.search.assistant.platform.appintegration.grpc.C119625g;
import com.google.android.apps.search.assistant.platform.appintegration.grpc.C119626h;
import com.google.android.apps.search.assistant.platform.appintegration.grpc.C119627i;
import com.google.android.apps.search.assistant.platform.appintegration.grpc.C119640v;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.C119650a;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.C119670b;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.C119748c;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.C119908e;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9007a.p9009b.C119662e;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119785ag;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119793ao;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119816bk;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119837ce;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119844cl;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119867dh;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119885dz;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119904w;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C51785da;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.platform.appintegration.g.q */
/* compiled from: PG */
final class C119566q implements C119670b {

    /* renamed from: a */
    public static final C59071e f333235a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.appintegration.g.q");

    /* renamed from: b */
    public final C119548ac f333236b;

    /* renamed from: c */
    private final Executor f333237c;

    /* renamed from: d */
    private final C119640v f333238d;

    /* renamed from: e */
    private final C119662e f333239e;

    public C119566q(C119548ac acVar, C119640v vVar, Executor executor, C119662e eVar) {
        this.f333238d = vVar;
        this.f333236b = acVar;
        this.f333239e = eVar;
        this.f333237c = executor;
    }

    /* renamed from: a */
    public final C119908e mo40056a(C51809dy dyVar, C119793ao aoVar) {
        ((C59052c) ((C59052c) f333235a.mo56224b()).mo56372aa(34540)).mo56389s("startPrefetch: %s", dyVar);
        for (C51785da daVar : this.f333238d.f333413d) {
            if (daVar.f135878b.equals(dyVar.f135936b)) {
                ((C59052c) ((C59052c) f333235a.mo56224b()).mo56372aa(34541)).mo56389s("it's a remote clientOp: %s", dyVar);
                C70862aj ajVar = this.f333236b.f333189a;
                C119624f fVar = (C119624f) C119627i.f333384i.createBuilder();
                C119625g gVar = (C119625g) C119626h.f333378d.createBuilder();
                gVar.copyOnWrite();
                C119626h hVar = (C119626h) gVar.instance;
                dyVar.getClass();
                hVar.f333381b = dyVar;
                hVar.f333380a |= 1;
                gVar.copyOnWrite();
                C119626h hVar2 = (C119626h) gVar.instance;
                aoVar.getClass();
                hVar2.f333382c = aoVar;
                hVar2.f333380a |= 2;
                C119626h hVar3 = (C119626h) gVar.build();
                fVar.copyOnWrite();
                C119627i iVar = (C119627i) fVar.instance;
                hVar3.getClass();
                iVar.f333390e = hVar3;
                iVar.f333386a |= 8;
                ajVar.mo20123c((C119627i) fVar.build());
                return new C119565p();
            }
        }
        return this.f333239e.mo104425a(dyVar, aoVar);
    }

    /* renamed from: b */
    public final /* synthetic */ C60870cx mo40057b(C119816bk bkVar) {
        return C60866ct.f164955a;
    }

    /* renamed from: c */
    public final void mo40058c(C119904w wVar) {
        ((C59052c) ((C59052c) f333235a.mo56224b()).mo56372aa(34543)).mo56389s("onAssistantStateUpdate: %s", wVar);
        C70862aj ajVar = this.f333236b.f333189a;
        C119624f fVar = (C119624f) C119627i.f333384i.createBuilder();
        fVar.copyOnWrite();
        C119627i iVar = (C119627i) fVar.instance;
        wVar.getClass();
        iVar.f333388c = wVar;
        iVar.f333386a |= 2;
        ajVar.mo20123c((C119627i) fVar.build());
    }

    /* renamed from: d */
    public final /* synthetic */ void mo40059d(C119785ag agVar) {
    }

    /* renamed from: e */
    public final void mo40060e(C119748c cVar) {
        this.f333237c.execute(C47810es.m84977q(new C119564o(this)));
    }

    /* renamed from: f */
    public final void mo40061f(Throwable th) {
        this.f333236b.mo104428b("onDisconnected:".concat(String.valueOf(String.valueOf(th))));
        if (th != null) {
            this.f333236b.mo104427a(th);
        }
        ((C59052c) ((C59052c) ((C59052c) f333235a.mo56226d()).mo56382g(th)).mo56372aa(34544)).mo56389s("onDisconnected, error=%s", th);
    }

    /* renamed from: g */
    public final void mo40062g(C119844cl clVar) {
        ((C59052c) ((C59052c) f333235a.mo56224b()).mo56372aa(34545)).mo56389s("onInteractionFinished: %s", clVar);
        C70862aj ajVar = this.f333236b.f333189a;
        C119624f fVar = (C119624f) C119627i.f333384i.createBuilder();
        fVar.copyOnWrite();
        C119627i iVar = (C119627i) fVar.instance;
        clVar.getClass();
        iVar.f333392g = clVar;
        iVar.f333386a |= 32;
        ajVar.mo20123c((C119627i) fVar.build());
    }

    /* renamed from: h */
    public final /* synthetic */ void mo40063h(C119837ce ceVar) {
    }

    /* renamed from: i */
    public final /* synthetic */ void mo40064i(C119867dh dhVar) {
    }

    /* renamed from: j */
    public final void mo40065j(C119885dz dzVar) {
        String str = dzVar.f333868b;
        C70862aj ajVar = this.f333236b.f333189a;
        C119624f fVar = (C119624f) C119627i.f333384i.createBuilder();
        fVar.copyOnWrite();
        C119627i iVar = (C119627i) fVar.instance;
        str.getClass();
        iVar.f333386a |= 4;
        iVar.f333389d = str;
        ajVar.mo20123c((C119627i) fVar.build());
    }

    /* renamed from: k */
    public final /* synthetic */ C60870cx mo40066k() {
        return C119650a.m198564a();
    }
}
