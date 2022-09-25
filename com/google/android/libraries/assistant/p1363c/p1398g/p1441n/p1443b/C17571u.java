package com.google.android.libraries.assistant.p1363c.p1398g.p1441n.p1443b;

import androidx.p104d.p105a.C2164c;
import com.google.android.libraries.assistant.p1363c.p1398g.p1405d.C17377g;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17477am;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17495bd;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17496be;
import com.google.android.libraries.assistant.p1363c.p1398g.p1444o.p1447c.C17586a;
import com.google.android.libraries.search.assistant.p2498ac.p2499a.p2500a.C32432a;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.p4449cd.p4456g.C57974a;
import com.google.p4449cd.p4456g.C57996c;
import com.google.p4449cd.p4456g.p4458b.C57987f;
import com.google.protobuf.C63088z;
import com.google.speech.p5224k.p5225a.C67186ad;
import com.google.speech.p5224k.p5225a.C67194al;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.assistant.c.g.n.b.u */
/* compiled from: PG */
final class C17571u implements C57974a {

    /* renamed from: a */
    public final long f50654a;

    /* renamed from: b */
    final /* synthetic */ C17572v f50655b;

    /* renamed from: c */
    private final AtomicBoolean f50656c = new AtomicBoolean(false);

    /* renamed from: d */
    private C60870cx f50657d = C60866ct.f164955a;

    public C17571u(C17572v vVar, long j) {
        this.f50655b = vVar;
        this.f50654a = j;
    }

    /* renamed from: e */
    private final C60870cx m34853e(Exception exc) {
        C17570t tVar = new C17570t(this, exc);
        return C60856cj.m92902k(C47810es.m84965e(tVar), this.f50654a, TimeUnit.MILLISECONDS, this.f50655b.f50660c);
    }

    /* renamed from: c */
    public final /* synthetic */ void mo20337c(Object obj) {
        C67186ad adVar = (C67186ad) obj;
        this.f50657d.cancel(false);
        this.f50657d = m34853e(new Exception("Streaming of SinkWithTimeout is timing out."));
        if ((adVar.f182613a & 1) != 0) {
            C57987f fVar = this.f50655b.f50663f;
            C17495bd bdVar = (C17495bd) C17496be.f50505c.createBuilder();
            C63088z zVar = adVar.f182614b;
            bdVar.copyOnWrite();
            C17496be beVar = (C17496be) bdVar.instance;
            zVar.getClass();
            beVar.f50507a |= 1;
            beVar.f50508b = zVar;
            fVar.f155056f.mo54591h((C17496be) bdVar.build());
        }
        if ((adVar.f182613a & 16) != 0) {
            C57987f fVar2 = this.f50655b.f50664g;
            C67194al alVar = adVar.f182616d;
            if (alVar == null) {
                alVar = C67194al.f182643d;
            }
            fVar2.f155056f.mo54591h(alVar);
        }
        if (adVar.f182615c) {
            C58976aa aaVar = C58975e.f156826a;
            mo20339gQ(false);
        }
    }

    /* renamed from: d */
    public final void mo20338d(C57996c cVar) {
        this.f50657d = m34853e(new Exception("Start of SinkWithTimeout is timing out."));
    }

    /* renamed from: gQ */
    public final void mo20339gQ(boolean z) {
        if (this.f50656c.compareAndSet(false, true)) {
            this.f50657d.cancel(false);
            this.f50655b.f50663f.f155056f.mo54589f(z);
            this.f50655b.f50664g.f155056f.mo54589f(z);
            ((C2164c) this.f50655b.f50665h.get()).mo5437b(C17586a.m34877d(4));
            C59104x b = C17572v.f50658a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "TTS.Server");
            ((C59052c) ((C59052c) b).mo56372aa(42790)).mo56389s("Server synthesis succeeded for sessionToken %s", C17377g.m34655c(this.f50655b.f50659b));
            C17572v vVar = this.f50655b;
            C32432a aVar = vVar.f50661d;
            C17477am amVar = vVar.f50659b;
            C69664n.m101061g(amVar, "sessionToken");
            aVar.mo38058a(C37176a.f97054eM.mo40815i(C62722b.OK), amVar);
        }
    }

    /* renamed from: gR */
    public final void mo20340gR(Throwable th) {
        this.f50657d.cancel(false);
        this.f50655b.f50663f.f155056f.mo54590g(th);
        this.f50655b.f50664g.f155056f.mo54590g(th);
        C59104x d = C17572v.f50658a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "TTS.Server");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(42791)).mo56389s("Server synthesis failed for sessionToken %s", C17377g.m34655c(this.f50655b.f50659b));
        ((C2164c) this.f50655b.f50665h.get()).mo5437b(C17586a.m34876c(201));
    }
}
