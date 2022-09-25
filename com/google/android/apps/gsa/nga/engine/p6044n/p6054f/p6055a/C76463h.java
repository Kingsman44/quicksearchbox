package com.google.android.apps.gsa.nga.engine.p6044n.p6054f.p6055a;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.gsa.nga.engine.p6044n.p6054f.C76455a;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80086aa;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80087ab;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80094ai;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80095aj;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80112b;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80136bn;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80472k;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82344bs;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.shared.service.C88486g;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87789dq;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87877gx;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88045nc;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88046nd;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88047ne;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88367za;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88368zb;
import com.google.android.apps.gsa.search.shared.service.p6940d.C88483e;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4552o.amo;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62940bt;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65768az;
import java.util.ArrayList;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.f.a.h */
/* compiled from: PG */
public final class C76463h implements C76455a {

    /* renamed from: a */
    public static final C58974d f211635a = C58974d.m91136j();

    /* renamed from: b */
    public final C83305i f211636b;

    /* renamed from: c */
    private final C22871g f211637c;

    /* renamed from: d */
    private final C88483e f211638d;

    public C76463h(C88483e eVar, C22871g gVar, C83305i iVar) {
        this.f211638d = eVar;
        this.f211637c = gVar;
        this.f211636b = iVar;
    }

    /* renamed from: i */
    private static ClientConfig m123071i() {
        C88486g gVar = new C88486g();
        gVar.f239201c = amo.NGA;
        gVar.f239204f = "nga";
        gVar.f239202d = 1;
        return new ClientConfig(gVar);
    }

    /* renamed from: j */
    private static ClientEventData m123072j(C88047ne neVar) {
        C88489j jVar = new C88489j(C87739bu.NGA_CLIENT_EVENT);
        jVar.mo82014b(C88045nc.f238080a, neVar);
        return jVar.mo82013a();
    }

    /* renamed from: a */
    public final C60870cx mo72190a() {
        C80472k kVar = (C80472k) C80136bn.f219915c.createBuilder();
        C80094ai aiVar = (C80094ai) C80095aj.f219794c.createBuilder();
        aiVar.copyOnWrite();
        C80095aj ajVar = (C80095aj) aiVar.instance;
        ajVar.f219796a |= 1;
        ajVar.f219797b = true;
        C80095aj ajVar2 = (C80095aj) aiVar.build();
        kVar.copyOnWrite();
        C80136bn bnVar = (C80136bn) kVar.instance;
        ajVar2.getClass();
        bnVar.f219918b = ajVar2;
        bnVar.f219917a = 5;
        return C118826c.m197213c(mo72193d((C80136bn) kVar.build(), Optional.empty()));
    }

    /* renamed from: b */
    public final C60870cx mo72191b() {
        C22871g gVar = this.f211637c;
        C88483e eVar = this.f211638d;
        ClientConfig i = m123071i();
        C88046nd ndVar = (C88046nd) C88047ne.f238081c.createBuilder();
        C87789dq dqVar = C87789dq.f237572a;
        ndVar.copyOnWrite();
        C88047ne neVar = (C88047ne) ndVar.instance;
        dqVar.getClass();
        neVar.f238084b = dqVar;
        neVar.f238083a = 18;
        return gVar.mo28209i(eVar.mo82005d(i, m123072j((C88047ne) ndVar.build()), C88244um.GET_EMAIL_THREADS, 50000), "[NGA] NgaSearchServiceClientImpl.getEmailThreads.getEmailThreadsResponse", C76461f.f211633a);
    }

    /* renamed from: c */
    public final C60870cx mo72192c(C87877gx gxVar) {
        C22871g gVar = this.f211637c;
        C88483e eVar = this.f211638d;
        ClientConfig i = m123071i();
        C88046nd ndVar = (C88046nd) C88047ne.f238081c.createBuilder();
        ndVar.copyOnWrite();
        C88047ne neVar = (C88047ne) ndVar.instance;
        gxVar.getClass();
        neVar.f238084b = gxVar;
        neVar.f238083a = 19;
        return gVar.mo28209i(eVar.mo82005d(i, m123072j((C88047ne) ndVar.build()), C88244um.GET_ICING_DATA, 50000), "[NGA] NgaSearchServiceClientImpl.getIcingData.getIcingDataResponse", C76456a.f211628a);
    }

    /* renamed from: d */
    public final C60870cx mo72193d(C80136bn bnVar, Optional optional) {
        C88489j jVar = new C88489j(C87739bu.NGA_CLIENT_EVENT);
        C62940bt btVar = C88045nc.f238080a;
        C88046nd ndVar = (C88046nd) C88047ne.f238081c.createBuilder();
        ndVar.copyOnWrite();
        C88047ne neVar = (C88047ne) ndVar.instance;
        bnVar.getClass();
        neVar.f238084b = bnVar;
        neVar.f238083a = 13;
        jVar.mo82014b(btVar, (C88047ne) ndVar.build());
        if (optional.isPresent()) {
            jVar.mo82015c((Parcelable) optional.get());
        }
        return C60922j.m93045h(this.f211638d.mo82005d(m123071i(), jVar.mo82013a(), C88244um.NGA_SERVICE_EVENT, 50000), C76462g.f211634a, C60826bg.f164896a);
    }

    /* renamed from: e */
    public final C60870cx mo72194e(Uri uri, int i) {
        C88483e eVar = this.f211638d;
        ClientConfig i2 = m123071i();
        C88046nd ndVar = (C88046nd) C88047ne.f238081c.createBuilder();
        C88367za zaVar = (C88367za) C88368zb.f238965d.createBuilder();
        String uri2 = uri.toString();
        zaVar.copyOnWrite();
        C88368zb zbVar = (C88368zb) zaVar.instance;
        uri2.getClass();
        zbVar.f238967a |= 1;
        zbVar.f238968b = uri2;
        zaVar.copyOnWrite();
        C88368zb zbVar2 = (C88368zb) zaVar.instance;
        zbVar2.f238967a |= 2;
        zbVar2.f238969c = i;
        C88368zb zbVar3 = (C88368zb) zaVar.build();
        ndVar.copyOnWrite();
        C88047ne neVar = (C88047ne) ndVar.instance;
        zbVar3.getClass();
        neVar.f238084b = zbVar3;
        neVar.f238083a = 7;
        return eVar.mo82004b(i2, m123072j((C88047ne) ndVar.build()), 50000);
    }

    /* renamed from: f */
    public final C60870cx mo72195f(C65753ak akVar, C65768az azVar, boolean z) {
        C80472k kVar = (C80472k) C80136bn.f219915c.createBuilder();
        C80086aa aaVar = (C80086aa) C80087ab.f219777e.createBuilder();
        aaVar.copyOnWrite();
        C80087ab abVar = (C80087ab) aaVar.instance;
        abVar.f219780b = akVar.f178757bE;
        abVar.f219779a |= 1;
        aaVar.copyOnWrite();
        C80087ab abVar2 = (C80087ab) aaVar.instance;
        azVar.getClass();
        abVar2.f219781c = azVar;
        abVar2.f219779a |= 2;
        aaVar.copyOnWrite();
        C80087ab abVar3 = (C80087ab) aaVar.instance;
        abVar3.f219779a |= 4;
        abVar3.f219782d = z;
        kVar.copyOnWrite();
        C80136bn bnVar = (C80136bn) kVar.instance;
        C80087ab abVar4 = (C80087ab) aaVar.build();
        abVar4.getClass();
        bnVar.f219918b = abVar4;
        bnVar.f219917a = 14;
        return C118826c.m197213c(mo72193d((C80136bn) kVar.build(), Optional.empty()));
    }

    /* renamed from: g */
    public final void mo72196g(C80112b bVar, C58485gu guVar) {
        this.f211636b.mo75579d(new C82344bs("NGA_FEEDBACK_REQUEST"));
        C88489j jVar = new C88489j(C87739bu.NGA_CLIENT_EVENT);
        C62940bt btVar = C88045nc.f238080a;
        C88046nd ndVar = (C88046nd) C88047ne.f238081c.createBuilder();
        ndVar.copyOnWrite();
        C88047ne neVar = (C88047ne) ndVar.instance;
        bVar.getClass();
        neVar.f238084b = bVar;
        neVar.f238083a = 3;
        jVar.mo82014b(btVar, (C88047ne) ndVar.build());
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("SCREENSHOTS", new ArrayList(guVar));
        jVar.mo82015c(bundle);
        C90875ai.m148465b(new C76459d(this), this.f211638d.mo82004b(m123071i(), jVar.mo82013a(), 50000), this.f211637c, "[NGA] Send feedback request event to :search process.").mo85223a(new C76460e(this));
    }

    /* renamed from: h */
    public final void mo72197h() {
        C90875ai.m148465b(C76457b.f211629a, this.f211638d.mo82004b(m123071i(), new C88489j(C87739bu.TTS_STOP_SPEAKING).mo82013a(), 50000), this.f211637c, "[NGA] stopTts").mo85223a(C76458c.f211630a);
    }
}
