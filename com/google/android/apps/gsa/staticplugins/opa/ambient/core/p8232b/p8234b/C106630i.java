package com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8234b;

import com.google.android.apps.gsa.opa.p6437d.p6439b.C83606a;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90048d;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8208a.p8209a.C106434a;
import com.google.android.libraries.search.assistant.p2566g.C33393a;
import com.google.android.libraries.search.assistant.p2566g.C33407b;
import com.google.android.libraries.search.assistant.p2566g.C33409d;
import com.google.android.libraries.search.assistant.p2566g.C33414i;
import com.google.android.libraries.search.assistant.p2566g.C33421p;
import com.google.android.libraries.search.assistant.p2566g.C33423r;
import com.google.android.libraries.search.assistant.p2566g.C33425t;
import com.google.android.libraries.search.assistant.p2566g.C33426u;
import com.google.android.libraries.search.assistant.p2566g.C33427v;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3886c.p3887a.C50672h;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63088z;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.b.b.i */
/* compiled from: PG */
public final class C106630i implements C33421p {

    /* renamed from: a */
    public static final C59071e f297277a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.ambient.core.b.b.i");

    /* renamed from: b */
    private final C60887da f297278b;

    /* renamed from: c */
    private final C83606a f297279c;

    /* renamed from: d */
    private final C106434a f297280d;

    /* renamed from: e */
    private final C90021c f297281e;

    public C106630i(C83606a aVar, C106434a aVar2, C90021c cVar, C60887da daVar) {
        this.f297279c = aVar;
        this.f297280d = aVar2;
        this.f297281e = cVar;
        this.f297278b = daVar;
    }

    /* renamed from: c */
    private final void m177400c(C33393a aVar, int i, C90048d dVar) {
        C33407b bVar = (C33407b) C33409d.f89473d.createBuilder();
        bVar.copyOnWrite();
        C33409d dVar2 = (C33409d) bVar.instance;
        dVar2.f89476b = i - 1;
        dVar2.f89475a |= 1;
        boolean e = this.f297281e.mo79746e(dVar);
        bVar.copyOnWrite();
        C33409d dVar3 = (C33409d) bVar.instance;
        dVar3.f89475a |= 2;
        dVar3.f89477c = e;
        aVar.copyOnWrite();
        C33414i iVar = (C33414i) aVar.instance;
        C33409d dVar4 = (C33409d) bVar.build();
        C33414i iVar2 = C33414i.f89489h;
        dVar4.getClass();
        C62971cq cqVar = iVar.f89493c;
        if (!cqVar.mo58948c()) {
            iVar.f89493c = C62942bv.mutableCopy(cqVar);
        }
        iVar.f89493c.add(dVar4);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo38837a(AccountId accountId, C33423r rVar) {
        C60870cx b = this.f297280d.mo95532b(C50672h.f131816d);
        C60870cx b2 = this.f297279c.mo76966b();
        return C47638k.m84751b(b, b2).mo51520a(new C106629h(this, b, b2), this.f297278b);
    }

    /* renamed from: b */
    public final C33427v mo95604b(C58485gu guVar, C33425t tVar) {
        C33393a aVar = (C33393a) C33414i.f89489h.createBuilder();
        Stream map = Collection.EL.stream(guVar).map(C106627f.f297272a);
        Objects.requireNonNull(aVar);
        map.forEach(new C106628g(aVar));
        if (tVar == C33425t.ON_DEVICE_MEDIA_APP_SUGGESTIONS) {
            m177400c(aVar, 2, C90017bw.f247973bi);
            m177400c(aVar, 3, C90017bw.f247917af);
            m177400c(aVar, 4, C90017bw.f247901aP);
        }
        C33426u uVar = (C33426u) C33427v.f89523e.createBuilder();
        uVar.copyOnWrite();
        C33427v vVar = (C33427v) uVar.instance;
        vVar.f89526b = tVar.f89522p;
        vVar.f89525a |= 1;
        C63088z byteString = ((C33414i) aVar.build()).toByteString();
        uVar.copyOnWrite();
        C33427v vVar2 = (C33427v) uVar.instance;
        byteString.getClass();
        vVar2.f89525a = 2 | vVar2.f89525a;
        vVar2.f89527c = byteString;
        return (C33427v) uVar.build();
    }
}
