package com.google.android.apps.gsa.speech.p7272e.p7275c;

import android.os.Process;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.p395al.p408c.p414c.p416b.C8476as;
import com.google.protos.p4816ai.p4818b.C63196b;
import com.google.speech.p5204e.C66492c;
import com.google.speech.p5204e.C66493d;
import com.google.speech.p5204e.C66495f;
import com.google.speech.p5204e.C66499j;
import com.google.speech.recognizer.p5233a.C67446ao;
import com.google.speech.recognizer.p5233a.C67453av;
import com.google.speech.recognizer.p5233a.C67454b;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.speech.e.c.c */
/* compiled from: PG */
public final /* synthetic */ class C92266c implements Callable {

    /* renamed from: a */
    public final /* synthetic */ long f257264a;

    /* renamed from: b */
    public final /* synthetic */ boolean f257265b;

    /* renamed from: c */
    public final /* synthetic */ C92274k f257266c;

    /* renamed from: d */
    public final /* synthetic */ C67453av f257267d;

    /* renamed from: e */
    public final /* synthetic */ C8476as f257268e;

    /* renamed from: f */
    public final /* synthetic */ C92275l f257269f;

    public /* synthetic */ C92266c(C92275l lVar, long j, boolean z, C92274k kVar, C67453av avVar, C8476as asVar) {
        this.f257269f = lVar;
        this.f257264a = j;
        this.f257265b = z;
        this.f257266c = kVar;
        this.f257267d = avVar;
        this.f257268e = asVar;
    }

    public final Object call() {
        C92275l lVar = this.f257269f;
        long j = this.f257264a;
        boolean z = this.f257265b;
        C92274k kVar = this.f257266c;
        C67453av avVar = this.f257267d;
        C8476as asVar = this.f257268e;
        if (lVar != null) {
            lVar.f257314b = System.currentTimeMillis();
        }
        int threadPriority = Process.getThreadPriority(Process.myTid());
        if (z) {
            try {
                Process.setThreadPriority(-16);
                C59104x b = C92271h.f257282a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "Greco3EngineManager");
                ((C59052c) ((C59052c) b).mo56372aa(12357)).mo56386p("Boosting recognizer thread priority to AUDIO");
            } catch (Throwable th) {
                if (z) {
                    Process.setThreadPriority(threadPriority);
                }
                throw th;
            }
        }
        C67454b run = kVar.run(avVar);
        C67446ao a = C67446ao.m97470a(run.f183341b);
        if (a == null) {
            a = C67446ao.STATUS_SUCCESS;
        }
        if (!(a == C67446ao.STATUS_SUCCESS || a == C67446ao.STATUS_CANCELED)) {
            C59104x c = C92271h.f257282a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "Greco3EngineManager");
            ((C59052c) ((C59052c) c).mo56372aa(12356)).mo56389s("Error running recognition: %s", a);
        }
        if (lVar != null) {
            C66499j jVar = run.f183342c;
            if (jVar == null) {
                jVar = C66499j.f180860d;
            }
            C66495f fVar = (C66495f) jVar.toBuilder();
            C66492c cVar = (C66492c) C66493d.f180800d.createBuilder();
            String str = asVar.f29417b;
            cVar.copyOnWrite();
            C66493d dVar = (C66493d) cVar.instance;
            str.getClass();
            dVar.f180802a |= 1;
            dVar.f180803b = str;
            String valueOf = String.valueOf(asVar.f29419d);
            cVar.copyOnWrite();
            C66493d dVar2 = (C66493d) cVar.instance;
            valueOf.getClass();
            dVar2.f180802a |= 2;
            dVar2.f180804c = valueOf;
            C66493d dVar3 = (C66493d) cVar.build();
            fVar.copyOnWrite();
            C66499j jVar2 = (C66499j) fVar.instance;
            dVar3.getClass();
            jVar2.f180864c = dVar3;
            jVar2.f180862a |= 134217728;
            String str2 = asVar.f29417b;
            fVar.copyOnWrite();
            C66499j jVar3 = (C66499j) fVar.instance;
            str2.getClass();
            jVar3.f180862a |= C89885b.NOW_VALUE;
            jVar3.f180863b = str2;
            C66499j jVar4 = (C66499j) fVar.build();
            long currentTimeMillis = System.currentTimeMillis() - lVar.f257314b;
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            int i = lVar.f257313a;
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = i;
            tzVar.copyOnWrite();
            C60555uf ufVar2 = (C60555uf) tzVar.instance;
            ufVar2.f164249d |= 16777216;
            ufVar2.f164143ax = currentTimeMillis;
            String b2 = C39191a.m68623b(j);
            tzVar.copyOnWrite();
            C60555uf ufVar3 = (C60555uf) tzVar.instance;
            b2.getClass();
            ufVar3.f164093a |= 4;
            ufVar3.f164259n = b2;
            if (lVar.f257313a == 89) {
                C66495f fVar2 = (C66495f) C66499j.f180860d.createBuilder();
                C66493d dVar4 = jVar4.f180864c;
                if (dVar4 == null) {
                    dVar4 = C66493d.f180800d;
                }
                fVar2.copyOnWrite();
                C66499j jVar5 = (C66499j) fVar2.instance;
                dVar4.getClass();
                jVar5.f180864c = dVar4;
                jVar5.f180862a |= 134217728;
                tzVar.copyOnWrite();
                C60555uf ufVar4 = (C60555uf) tzVar.instance;
                C66499j jVar6 = (C66499j) fVar2.build();
                jVar6.getClass();
                ufVar4.f164266u = jVar6;
                ufVar4.f164093a |= 8192;
            } else {
                tzVar.copyOnWrite();
                C60555uf ufVar5 = (C60555uf) tzVar.instance;
                jVar4.getClass();
                ufVar5.f164266u = jVar4;
                ufVar5.f164093a |= 8192;
            }
            C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
        }
        if (z) {
            Process.setThreadPriority(threadPriority);
        }
        return kVar;
    }
}
