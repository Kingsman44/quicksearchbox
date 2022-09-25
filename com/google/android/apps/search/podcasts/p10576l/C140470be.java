package com.google.android.apps.search.podcasts.p10576l;

import com.google.android.apps.search.podcasts.p10569h.C140385d;
import com.google.android.apps.search.podcasts.p10591p.C140747m;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.p4017at.p4082j.p4083a.C54362bo;
import com.google.p4017at.p4082j.p4083a.C54372by;
import com.google.p4017at.p4082j.p4083a.C54373bz;
import com.google.p4017at.p4082j.p4083a.C54422du;
import com.google.p4017at.p4082j.p4083a.C54423dv;
import com.google.p4017at.p4082j.p4083a.C54425dx;
import com.google.p4017at.p4082j.p4083a.C54433ee;
import com.google.p4017at.p4082j.p4083a.C54434ef;
import com.google.p4017at.p4082j.p4083a.C54435eg;
import com.google.p4017at.p4082j.p4083a.C54436eh;
import com.google.p4017at.p4082j.p4083a.C54437ei;
import com.google.p4017at.p4082j.p4083a.C54438ej;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;
import java.util.List;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.search.podcasts.l.be */
/* compiled from: PG */
public final /* synthetic */ class C140470be implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C140488bw f381553a;

    public /* synthetic */ C140470be(C140488bw bwVar) {
        this.f381553a = bwVar;
    }

    public final C60870cx apply(Object obj) {
        C140488bw bwVar = this.f381553a;
        C140450al alVar = (C140450al) obj;
        C140441ac acVar = alVar.f381515a;
        if (acVar == null) {
            acVar = C140441ac.f381485d;
        }
        C54422du duVar = (C54422du) C54423dv.f142925d.createBuilder();
        if (bwVar.f381579f && acVar.f381489c) {
            C54437ei eiVar = (C54437ei) C54438ej.f142957c.createBuilder();
            C62971cq cqVar = acVar.f381487a;
            eiVar.copyOnWrite();
            C54438ej ejVar = (C54438ej) eiVar.instance;
            C62971cq cqVar2 = ejVar.f142959a;
            if (!cqVar2.mo58948c()) {
                ejVar.f142959a = C62942bv.mutableCopy(cqVar2);
            }
            C62947c.addAll((Iterable) cqVar, (List) ejVar.f142959a);
            C63042fg i = C62953e.m95484i(acVar.f381488b);
            eiVar.copyOnWrite();
            i.getClass();
            ((C54438ej) eiVar.instance).f142960b = i;
            duVar.copyOnWrite();
            C54438ej ejVar2 = (C54438ej) eiVar.build();
            ejVar2.getClass();
            ((C54423dv) duVar.instance).f142927a = ejVar2;
        }
        C140439aa aaVar = alVar.f381516b;
        if (aaVar == null) {
            aaVar = C140439aa.f381480d;
        }
        if (bwVar.f381579f && aaVar.f381484c) {
            C54433ee eeVar = (C54433ee) C54434ef.f142949c.createBuilder();
            boolean z = aaVar.f381482a;
            eeVar.copyOnWrite();
            ((C54434ef) eeVar.instance).f142951a = z;
            C63042fg i2 = C62953e.m95484i(aaVar.f381483b);
            eeVar.copyOnWrite();
            i2.getClass();
            ((C54434ef) eeVar.instance).f142952b = i2;
            duVar.copyOnWrite();
            C54434ef efVar = (C54434ef) eeVar.build();
            efVar.getClass();
            ((C54423dv) duVar.instance).f142929c = efVar;
        }
        C140443ae aeVar = alVar.f381519e;
        if (aeVar == null) {
            aeVar = C140443ae.f381490d;
        }
        if (aeVar.f381494c) {
            C54435eg egVar = (C54435eg) C54436eh.f142953c.createBuilder();
            C54362bo a = C54362bo.m87369a(aeVar.f381492a);
            if (a == null) {
                a = C54362bo.UNRECOGNIZED;
            }
            egVar.copyOnWrite();
            ((C54436eh) egVar.instance).f142955a = a.getNumber();
            C63042fg i3 = C62953e.m95484i(aeVar.f381493b);
            egVar.copyOnWrite();
            i3.getClass();
            ((C54436eh) egVar.instance).f142956b = i3;
            duVar.copyOnWrite();
            C54436eh ehVar = (C54436eh) egVar.build();
            ehVar.getClass();
            ((C54423dv) duVar.instance).f142928b = ehVar;
        }
        C140385d dVar = bwVar.f381578e;
        C54423dv dvVar = (C54423dv) duVar.build();
        C140747m mVar = dVar.f381341b;
        C54372by byVar = dVar.f381340a;
        C70888j jVar = byVar.f189039a;
        C70338di diVar = C54373bz.f142828j;
        if (diVar == null) {
            synchronized (C54373bz.class) {
                diVar = C54373bz.f142828j;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("google.internal.podcasts.v1.PodcastsService", "SyncPreferences");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C54423dv.f142925d);
                    d.f187486b = C70850d.m103697c(C54425dx.f142930d);
                    diVar = d.mo62040a();
                    C54373bz.f142828j = diVar;
                }
            }
        }
        C60870cx a2 = C70876o.m103760a(jVar.mo39510a(diVar, byVar.f189040b), dvVar);
        mVar.mo115851a("PodcastsService", "SyncPreferences", a2);
        return C47633f.m84733g(a2).mo51516i(new C140479bn(bwVar), C60826bg.f164896a);
    }
}
