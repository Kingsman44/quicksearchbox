package com.google.android.apps.search.podcasts.p10550b.p10556f;

import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97907bf;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97908bg;
import com.google.android.apps.search.podcasts.p10569h.C140385d;
import com.google.android.apps.search.podcasts.p10591p.C140747m;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.p4017at.p4082j.p4083a.C54364bq;
import com.google.p4017at.p4082j.p4083a.C54372by;
import com.google.p4017at.p4082j.p4083a.C54373bz;
import com.google.p4017at.p4082j.p4083a.C54418dq;
import com.google.p4017at.p4082j.p4083a.C54419dr;
import com.google.p4017at.p4082j.p4083a.C54421dt;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.search.podcasts.b.f.x */
/* compiled from: PG */
public final /* synthetic */ class C140121x implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C140097al f380762a;

    /* renamed from: b */
    public final /* synthetic */ C97908bg f380763b;

    public /* synthetic */ C140121x(C140097al alVar, C97908bg bgVar) {
        this.f380762a = alVar;
        this.f380763b = bgVar;
    }

    public final C60870cx apply(Object obj) {
        C140097al alVar = this.f380762a;
        C97908bg bgVar = this.f380763b;
        C140088ac acVar = (C140088ac) obj;
        C54364bq h = acVar.mo115454l() ? C140097al.m227767h(bgVar.f273368c) : null;
        C54418dq dqVar = (C54418dq) C54419dr.f142917c.createBuilder();
        int a = C97907bf.m162188a(bgVar.f273367b);
        if (a == 0) {
            a = 1;
        }
        long o = acVar.mo115457o(a);
        dqVar.copyOnWrite();
        ((C54419dr) dqVar.instance).f142919a = o;
        if (h != null) {
            dqVar.copyOnWrite();
            ((C54419dr) dqVar.instance).f142920b = h;
        }
        C140385d dVar = alVar.f380725e;
        C54419dr drVar = (C54419dr) dqVar.build();
        C140747m mVar = dVar.f381341b;
        C54372by byVar = dVar.f381340a;
        C70888j jVar = byVar.f189039a;
        C70338di diVar = C54373bz.f142822d;
        if (diVar == null) {
            synchronized (C54373bz.class) {
                diVar = C54373bz.f142822d;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("google.internal.podcasts.v1.PodcastsService", "SyncPlaylist");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C54419dr.f142917c);
                    d.f187486b = C70850d.m103697c(C54421dt.f142921c);
                    diVar = d.mo62040a();
                    C54373bz.f142822d = diVar;
                }
            }
        }
        C60870cx a2 = C70876o.m103760a(jVar.mo39510a(diVar, byVar.f189040b), drVar);
        mVar.mo115851a("PodcastsService", "SyncPlaylist", a2);
        return a2;
    }
}
