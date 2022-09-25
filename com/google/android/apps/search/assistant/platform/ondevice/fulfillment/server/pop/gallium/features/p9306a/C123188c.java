package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.p9306a;

import android.content.Context;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.knowledge.cerebra.sense.textclassifier.p4678b.C61845c;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.C61875al;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protos.p4985f.p5030q.C64985a;
import com.google.protos.p4985f.p5030q.C65167ea;
import com.google.protos.p4985f.p5030q.C65168eb;
import com.google.protos.p4985f.p5030q.C65169ec;
import com.google.protos.p4985f.p5030q.C65170ed;
import com.google.protos.p4985f.p5030q.C65172ef;
import com.google.protos.p4985f.p5030q.C65301o;
import com.google.protos.p4985f.p5030q.C65302p;
import com.google.protos.p4985f.p5030q.C65305s;
import com.google.protos.p4985f.p5030q.C65306t;
import java.util.List;
import p3186j$.util.function.Supplier;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.a.c */
/* compiled from: PG */
public final class C123188c implements C64985a {

    /* renamed from: a */
    public static final /* synthetic */ int f340878a = 0;

    /* renamed from: c */
    private static final C59071e f340879c = C59071e.m91332i("com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.a.c");

    /* renamed from: d */
    private final Context f340880d;

    /* renamed from: e */
    private final C69464a f340881e;

    /* renamed from: f */
    private final C69464a f340882f;

    /* renamed from: g */
    private final Supplier f340883g;

    public C123188c(Context context, C69464a aVar, C69464a aVar2, Supplier supplier) {
        this.f340880d = context;
        this.f340881e = aVar;
        this.f340882f = aVar2;
        this.f340883g = supplier;
    }

    /* renamed from: a */
    public final C60870cx mo59323a() {
        C123186a aVar = C123186a.f340876a;
        return C60922j.m93044g((C60870cx) this.f340882f.mo17428b(), C47810es.m84963c(aVar), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final C60870cx mo59324b() {
        List<C61845c> a = C61875al.m94540a(this.f340880d.getContentResolver());
        C65169ec ecVar = (C65169ec) C65170ed.f176372b.createBuilder();
        for (C61845c cVar : a) {
            C65167ea eaVar = (C65167ea) C65168eb.f176363h.createBuilder();
            if (!cVar.f167107b.isEmpty()) {
                String str = cVar.f167107b;
                eaVar.copyOnWrite();
                str.getClass();
                ((C65168eb) eaVar.instance).f176365a = str;
            } else {
                String str2 = cVar.f167108c;
                eaVar.copyOnWrite();
                str2.getClass();
                ((C65168eb) eaVar.instance).f176365a = str2;
            }
            String str3 = cVar.f167116k;
            eaVar.copyOnWrite();
            str3.getClass();
            ((C65168eb) eaVar.instance).f176371g = str3;
            String str4 = cVar.f167109d;
            eaVar.copyOnWrite();
            str4.getClass();
            ((C65168eb) eaVar.instance).f176366b = str4;
            String str5 = cVar.f167110e;
            eaVar.copyOnWrite();
            str5.getClass();
            ((C65168eb) eaVar.instance).f176367c = str5;
            String str6 = cVar.f167111f;
            eaVar.copyOnWrite();
            str6.getClass();
            ((C65168eb) eaVar.instance).f176368d = str6;
            String str7 = cVar.f167112g;
            eaVar.copyOnWrite();
            str7.getClass();
            ((C65168eb) eaVar.instance).f176369e = str7;
            String str8 = cVar.f167113h;
            eaVar.copyOnWrite();
            str8.getClass();
            ((C65168eb) eaVar.instance).f176370f = str8;
            ecVar.copyOnWrite();
            C65170ed edVar = (C65170ed) ecVar.instance;
            C65168eb ebVar = (C65168eb) eaVar.build();
            ebVar.getClass();
            C62971cq cqVar = edVar.f176374a;
            if (!cqVar.mo58948c()) {
                edVar.f176374a = C62942bv.mutableCopy(cqVar);
            }
            edVar.f176374a.add(ebVar);
        }
        C65170ed edVar2 = (C65170ed) ecVar.build();
        C59104x b = f340879c.mo56224b();
        b.mo56378ag(C58975e.f156826a, "AccountScopedContext");
        ((C59052c) ((C59052c) b).mo56372aa(34953)).mo56387q("Sending contactList with %d contacts.", edVar2.f176374a.size());
        C65301o oVar = (C65301o) C65302p.f176626c.createBuilder();
        oVar.copyOnWrite();
        C65302p pVar = (C65302p) oVar.instance;
        edVar2.getClass();
        pVar.f176629b = edVar2;
        pVar.f176628a |= 1;
        return C60856cj.m92900i((C65302p) oVar.build());
    }

    /* renamed from: c */
    public final C60870cx mo59325c() {
        C65172ef efVar = (C65172ef) this.f340881e.mo17428b();
        C59104x b = f340879c.mo56224b();
        b.mo56378ag(C58975e.f156826a, "AccountScopedContext");
        ((C59052c) ((C59052c) b).mo56372aa(34954)).mo56389s("Sending installedApps: \n%s", efVar);
        C65305s sVar = (C65305s) C65306t.f176632c.createBuilder();
        sVar.copyOnWrite();
        C65306t tVar = (C65306t) sVar.instance;
        efVar.getClass();
        tVar.f176635b = efVar;
        tVar.f176634a |= 1;
        return C60856cj.m92900i((C65306t) sVar.build());
    }

    /* renamed from: d */
    public final C60870cx mo59326d() {
        C123187b bVar = C123187b.f340877a;
        return C60922j.m93044g((C60870cx) this.f340883g.get(), C47810es.m84963c(bVar), C60826bg.f164896a);
    }
}
