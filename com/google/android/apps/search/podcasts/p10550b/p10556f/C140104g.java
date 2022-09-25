package com.google.android.apps.search.podcasts.p10550b.p10556f;

import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97907bf;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97908bg;
import com.google.android.apps.search.podcasts.p10569h.C140385d;
import com.google.android.apps.search.podcasts.p10591p.C140747m;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.p4017at.p4082j.p4083a.C54372by;
import com.google.p4017at.p4082j.p4083a.C54373bz;
import com.google.p4017at.p4082j.p4083a.C54374c;
import com.google.p4017at.p4082j.p4083a.C54401d;
import com.google.p4017at.p4082j.p4083a.C54441f;
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

/* renamed from: com.google.android.apps.search.podcasts.b.f.g */
/* compiled from: PG */
public final /* synthetic */ class C140104g implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C140097al f380738a;

    /* renamed from: b */
    public final /* synthetic */ C97908bg f380739b;

    public /* synthetic */ C140104g(C140097al alVar, C97908bg bgVar) {
        this.f380738a = alVar;
        this.f380739b = bgVar;
    }

    public final C60870cx apply(Object obj) {
        C140097al alVar = this.f380738a;
        C97908bg bgVar = this.f380739b;
        C140088ac acVar = (C140088ac) obj;
        C140385d dVar = alVar.f380725e;
        C54374c cVar = (C54374c) C54401d.f142883d.createBuilder();
        int a = C97907bf.m162188a(bgVar.f273367b);
        if (a == 0) {
            a = 1;
        }
        long o = acVar.mo115457o(a);
        cVar.copyOnWrite();
        ((C54401d) cVar.instance).f142885a = o;
        C62971cq cqVar = C140097al.m227767h(bgVar.f273368c).f142810a;
        cVar.copyOnWrite();
        C54401d dVar2 = (C54401d) cVar.instance;
        C62971cq cqVar2 = dVar2.f142886b;
        if (!cqVar2.mo58948c()) {
            dVar2.f142886b = C62942bv.mutableCopy(cqVar2);
        }
        C62947c.addAll((Iterable) cqVar, (List) dVar2.f142886b);
        boolean z = bgVar.f273369d;
        cVar.copyOnWrite();
        ((C54401d) cVar.instance).f142887c = z;
        C54401d dVar3 = (C54401d) cVar.build();
        C140747m mVar = dVar.f381341b;
        C54372by byVar = dVar.f381340a;
        C70888j jVar = byVar.f189039a;
        C70338di diVar = C54373bz.f142823e;
        if (diVar == null) {
            synchronized (C54373bz.class) {
                diVar = C54373bz.f142823e;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("google.internal.podcasts.v1.PodcastsService", "AddPlaylistItems");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C54401d.f142883d);
                    d.f187486b = C70850d.m103697c(C54441f.f142966c);
                    diVar = d.mo62040a();
                    C54373bz.f142823e = diVar;
                }
            }
        }
        C60870cx a2 = C70876o.m103760a(jVar.mo39510a(diVar, byVar.f189040b), dVar3);
        mVar.mo115851a("PodcastsService", "AddPlaylistItems", a2);
        return a2;
    }
}
