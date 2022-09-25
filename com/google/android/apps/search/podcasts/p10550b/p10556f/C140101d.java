package com.google.android.apps.search.podcasts.p10550b.p10556f;

import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97907bf;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97908bg;
import com.google.android.apps.search.podcasts.p10569h.C140385d;
import com.google.android.apps.search.podcasts.p10591p.C140747m;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.p4017at.p4082j.p4083a.C54372by;
import com.google.p4017at.p4082j.p4083a.C54373bz;
import com.google.p4017at.p4082j.p4083a.C54379ce;
import com.google.p4017at.p4082j.p4083a.C54380cf;
import com.google.p4017at.p4082j.p4083a.C54382ch;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.search.podcasts.b.f.d */
/* compiled from: PG */
public final /* synthetic */ class C140101d implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C140097al f380734a;

    /* renamed from: b */
    public final /* synthetic */ C97908bg f380735b;

    public /* synthetic */ C140101d(C140097al alVar, C97908bg bgVar) {
        this.f380734a = alVar;
        this.f380735b = bgVar;
    }

    public final C60870cx apply(Object obj) {
        C140097al alVar = this.f380734a;
        C97908bg bgVar = this.f380735b;
        C140088ac acVar = (C140088ac) obj;
        C140385d dVar = alVar.f380725e;
        C54379ce ceVar = (C54379ce) C54380cf.f142839c.createBuilder();
        int a = C97907bf.m162188a(bgVar.f273367b);
        if (a == 0) {
            a = 1;
        }
        long o = acVar.mo115457o(a);
        ceVar.copyOnWrite();
        ((C54380cf) ceVar.instance).f142841a = o;
        C62971cq cqVar = C140097al.m227767h(bgVar.f273368c).f142810a;
        ceVar.copyOnWrite();
        C54380cf cfVar = (C54380cf) ceVar.instance;
        C62971cq cqVar2 = cfVar.f142842b;
        if (!cqVar2.mo58948c()) {
            cfVar.f142842b = C62942bv.mutableCopy(cqVar2);
        }
        C62947c.addAll((Iterable) cqVar, (List) cfVar.f142842b);
        C54380cf cfVar2 = (C54380cf) ceVar.build();
        C140747m mVar = dVar.f381341b;
        C54372by byVar = dVar.f381340a;
        C70888j jVar = byVar.f189039a;
        C70338di diVar = C54373bz.f142824f;
        if (diVar == null) {
            synchronized (C54373bz.class) {
                diVar = C54373bz.f142824f;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("google.internal.podcasts.v1.PodcastsService", "RemovePlaylistItems");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C54380cf.f142839c);
                    d.f187486b = C70850d.m103697c(C54382ch.f142843c);
                    diVar = d.mo62040a();
                    C54373bz.f142824f = diVar;
                }
            }
        }
        C60870cx a2 = C70876o.m103760a(jVar.mo39510a(diVar, byVar.f189040b), cfVar2);
        mVar.mo115851a("PodcastsService", "RemovePlaylistItem", a2);
        return a2;
    }
}
