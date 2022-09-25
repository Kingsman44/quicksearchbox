package com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9276d;

import com.google.android.apps.search.assistant.platform.ondevice.datadownload.C122179b;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17036ac;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17067l;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17068m;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17069n;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17070o;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17072q;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17073r;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17074s;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17078w;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47632e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.List;
import p5488io.grpc.p5533i.C70862aj;
import p5488io.grpc.p5533i.C70883v;
import p5488io.grpc.p5533i.C70887z;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.d.bt */
/* compiled from: PG */
final class C122261bt implements C70862aj {

    /* renamed from: a */
    public static final C58974d f339018a = C58974d.m91136j();

    /* renamed from: b */
    public final C122179b f339019b;

    /* renamed from: c */
    public final C60888db f339020c;

    /* renamed from: d */
    public final C122277d f339021d;

    /* renamed from: e */
    public final C70883v f339022e;

    /* renamed from: f */
    public final List f339023f = new ArrayList();

    /* renamed from: g */
    public boolean f339024g = false;

    /* renamed from: h */
    private final C122264bw f339025h;

    /* renamed from: i */
    private final C47632e f339026i = new C47632e();

    public C122261bt(C122179b bVar, C60888db dbVar, C122277d dVar, C122264bw bwVar, C70883v vVar) {
        this.f339019b = bVar;
        this.f339020c = dbVar;
        this.f339021d = dVar;
        this.f339022e = vVar;
        this.f339025h = bwVar;
        vVar.mo62583d(new C122242ba(this));
    }

    /* renamed from: d */
    public static C17074s m201775d(C58485gu guVar) {
        C17067l lVar = (C17067l) C17074s.f49709b.createBuilder();
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            C122260bs bsVar = (C122260bs) guVar.get(i);
            C17068m mVar = (C17068m) C17073r.f49700h.createBuilder();
            C17069n nVar = (C17069n) C17070o.f49685d.createBuilder();
            String str = bsVar.f339010a;
            nVar.copyOnWrite();
            C17070o oVar = (C17070o) nVar.instance;
            str.getClass();
            oVar.f49687a |= 1;
            oVar.f49688b = str;
            String languageTag = bsVar.f339011b.toLanguageTag();
            nVar.copyOnWrite();
            C17070o oVar2 = (C17070o) nVar.instance;
            languageTag.getClass();
            oVar2.f49687a |= 2;
            oVar2.f49689c = languageTag;
            mVar.copyOnWrite();
            C17073r rVar = (C17073r) mVar.instance;
            C17070o oVar3 = (C17070o) nVar.build();
            oVar3.getClass();
            rVar.f49703b = oVar3;
            rVar.f49702a |= 1;
            long longValue = ((Long) bsVar.f339013d.orElse(-1L)).longValue();
            mVar.copyOnWrite();
            C17073r rVar2 = (C17073r) mVar.instance;
            rVar2.f49702a |= 8;
            rVar2.f49706e = longValue;
            long j = bsVar.f339014e;
            mVar.copyOnWrite();
            C17073r rVar3 = (C17073r) mVar.instance;
            rVar3.f49702a |= 16;
            rVar3.f49707f = j;
            C17072q qVar = bsVar.f339015f;
            mVar.copyOnWrite();
            C17073r rVar4 = (C17073r) mVar.instance;
            rVar4.f49704c = qVar.f49699h;
            rVar4.f49702a |= 2;
            if (bsVar.f339016g != null) {
                String str2 = bsVar.f339016g;
                mVar.copyOnWrite();
                C17073r rVar5 = (C17073r) mVar.instance;
                str2.getClass();
                rVar5.f49702a |= 4;
                rVar5.f49705d = str2;
            }
            boolean h = bsVar.f339012c.mo56113h();
            mVar.copyOnWrite();
            C17073r rVar6 = (C17073r) mVar.instance;
            rVar6.f49702a |= 32;
            rVar6.f49708g = !h;
            lVar.copyOnWrite();
            C17074s sVar = (C17074s) lVar.instance;
            C17073r rVar7 = (C17073r) mVar.build();
            rVar7.getClass();
            C62971cq cqVar = sVar.f49711a;
            if (!cqVar.mo58948c()) {
                sVar.f49711a = C62942bv.mutableCopy(cqVar);
            }
            sVar.f49711a.add(rVar7);
        }
        return (C17074s) lVar.build();
    }

    /* renamed from: a */
    public final void mo20121a() {
        if (!this.f339024g && !((C70887z) this.f339022e).f189070a.mo62063h()) {
            C60870cx a = this.f339026i.mo51511a(new C122235au(this), this.f339020c);
            C122250bi biVar = new C122250bi(this);
            C60856cj.m92911t(a, C47810es.m84974n(biVar), this.f339020c);
        }
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        this.f339024g = true;
        ((C58970a) ((C58970a) ((C58970a) f339018a.mo56225c()).mo56382g(th)).mo56372aa(34739)).mo56386p("DataDownloadRestrictedServiceServer.downloadFileGroupsWithUpdates received an error. Terminating.");
    }

    /* renamed from: c */
    public final /* synthetic */ void mo20123c(Object obj) {
        C17078w wVar = (C17078w) obj;
        if (this.f339024g || ((C70887z) this.f339022e).f189070a.mo62063h()) {
            ((C58970a) ((C58970a) f339018a.mo56225c()).mo56372aa(34740)).mo56386p("Received a downloadRequest but processing was aborted. Discarding.");
        }
        C60870cx b = this.f339026i.mo51512b(new C122228an(this, wVar), this.f339020c);
        C122249bh bhVar = new C122249bh();
        C60856cj.m92911t(b, C47810es.m84974n(bhVar), this.f339020c);
    }

    /* renamed from: e */
    public final C60870cx mo105579e(C17036ac acVar, C58833ax axVar) {
        return C47633f.m84733g(this.f339025h.mo105581a(acVar)).mo51515h(new C122230ap(this, acVar, axVar), this.f339020c);
    }
}
