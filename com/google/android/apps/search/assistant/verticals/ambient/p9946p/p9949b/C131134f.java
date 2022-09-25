package com.google.android.apps.search.assistant.verticals.ambient.p9946p.p9949b;

import android.net.Uri;
import com.google.android.libraries.mdi.C29690f;
import com.google.android.libraries.storage.p3304a.p3312f.C42782f;
import com.google.assistant.p4016z.C53692aq;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4535g.C59127at;
import com.google.common.p4535g.C59167cf;
import com.google.common.p4535g.C59171cj;
import com.google.common.p4535g.C59218l;
import com.google.common.p4535g.C59224r;
import com.google.common.p4535g.C59226t;
import com.google.common.p4535g.C59227u;
import com.google.common.p4543n.p4551g.C59443c;
import com.google.common.p4575r.C60763t;
import com.google.p381aj.p382a.p383a.p384a.C8242v;
import com.google.p4479cg.C58079k;
import com.google.protobuf.C62897ae;
import com.google.protobuf.C62921ba;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.util.Map;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.p.b.f */
/* compiled from: PG */
public final /* synthetic */ class C131134f implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C131136h f358632a;

    /* renamed from: b */
    public final /* synthetic */ long f358633b;

    /* renamed from: c */
    public final /* synthetic */ C58079k f358634c;

    public /* synthetic */ C131134f(C131136h hVar, long j, C58079k kVar) {
        this.f358632a = hVar;
        this.f358633b = j;
        this.f358634c = kVar;
    }

    public final Object apply(Object obj) {
        C131136h hVar = this.f358632a;
        long j = this.f358633b;
        C58079k kVar = this.f358634c;
        C29690f fVar = (C29690f) obj;
        try {
            C131151w wVar = hVar.f358639b;
            if (fVar != null) {
                if (fVar.f80416g.size() != 0) {
                    C59224r c = C59224r.m91905c(C59127at.m91610b(kVar.f155252a, kVar.f155253b).mo56453d(), new C59218l(new C59443c(50.0d).mo56958a() / 6371010.0d));
                    C59167cf b = C59171cj.m91769b();
                    b.f157214a = 12;
                    C59227u a = new C59171cj(b).mo56548a(c);
                    for (Map.Entry entry : ((C58495hd) Collection.EL.stream(fVar.f80416g).filter(C131144p.f358656a).collect(C58370cn.m89403c(C131148t.f358660a, C131149u.f358661a, C131150v.f358662a))).entrySet()) {
                        C59226t tVar = (C59226t) entry.getKey();
                        if (a.mo56681c(tVar)) {
                            long j2 = tVar.f157334b;
                            C131142n nVar = new C131142n((MappedByteBuffer) wVar.f358663a.mo45889c((Uri) entry.getValue(), new C42782f()));
                            nVar.f358646a.position(nVar.f358649d + 4 + (nVar.f358648c * 12));
                            C62897ae N = C62897ae.m95111N(nVar.f358646a);
                            C58480gp e = C58485gu.m89837e();
                            while (!N.mo58661D()) {
                                C53692aq aqVar = (C53692aq) N.mo58689x(C53692aq.f140937k.getParserForType(), C62921ba.m95368a());
                                C8242v vVar = aqVar.f140942d;
                                if (vVar == null) {
                                    vVar = C8242v.f28952d;
                                }
                                if (C60763t.m92764a(vVar.f28956c, j) == 0) {
                                    e.mo55395g(aqVar);
                                }
                            }
                            C58485gu f = e.mo55394f();
                            if (!f.isEmpty()) {
                                return f;
                            }
                        }
                    }
                    return C58485gu.m89845m();
                }
            }
            return C58485gu.m89845m();
        } catch (IOException e2) {
            ((C58970a) ((C58970a) ((C58970a) hVar.f358638a.mo56226d()).mo56382g(e2)).mo56372aa(39039)).mo56386p("Failed to read places.");
            return C58485gu.m89845m();
        }
    }
}
