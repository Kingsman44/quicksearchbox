package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8478c;

import android.text.TextUtils;
import com.google.android.apps.gsa.n.b;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g.C112473ar;
import com.google.android.libraries.assistant.portable.p1586b.C19088t;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48633bv;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48635bx;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48653n;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48654o;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63070h;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65139d;
import com.google.protos.p5129p.p5131b.C65768az;
import com.google.protos.p5129p.p5131b.C65845n;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.c.g */
/* compiled from: PG */
public final class C111110g extends C112473ar {

    /* renamed from: a */
    public static final C59071e f309352a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.b.c.g");

    /* renamed from: b */
    public final C22871g f309353b;

    /* renamed from: c */
    public final b f309354c;

    /* renamed from: d */
    public final C21370a f309355d;

    /* renamed from: e */
    private final C86054o f309356e;

    public C111110g(C22871g gVar, b bVar, C86054o oVar, C21370a aVar) {
        this.f309353b = gVar;
        this.f309354c = bVar;
        this.f309356e = oVar;
        this.f309355d = aVar;
    }

    /* renamed from: d */
    public static C48654o m184884d(C65768az azVar) {
        C48653n nVar = (C48653n) C48654o.f125744d.createBuilder();
        try {
            C63070h hVar = azVar.f178799e;
            if (hVar == null) {
                hVar = C63070h.f170215c;
            }
            C65845n nVar2 = (C65845n) C62942bv.parseFrom((C62942bv) C65845n.f178992c, hVar.f170218b, C62921ba.f169869a);
            C19088t tVar = nVar2.f178995b;
            if (tVar == null) {
                tVar = C19088t.f53533p;
            }
            if ((tVar.f53535a & 1) != 0) {
                C19088t tVar2 = nVar2.f178995b;
                if (tVar2 == null) {
                    tVar2 = C19088t.f53533p;
                }
                String str = tVar2.f53536b;
                nVar.copyOnWrite();
                C48654o oVar = (C48654o) nVar.instance;
                str.getClass();
                oVar.f125746a |= 2;
                oVar.f125748c = str;
                C58976aa aaVar = C58975e.f156826a;
            }
        } catch (C62974ct e) {
            C59104x d = f309352a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "AssistantHistoryFetcher");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(27100)).mo56386p("Failed to parse AssistantHistoryElement data.");
        }
        C65139d dVar = azVar.f178796b;
        if (dVar == null) {
            dVar = C65139d.f176307e;
        }
        long j = dVar.f176310b;
        nVar.copyOnWrite();
        C48654o oVar2 = (C48654o) nVar.instance;
        oVar2.f125746a |= 1;
        oVar2.f125747b = j;
        return (C48654o) nVar.build();
    }

    /* renamed from: a */
    public final long mo99043a() {
        return TimeUnit.SECONDS.toMillis(10);
    }

    /* renamed from: b */
    public final C60870cx mo99044b() {
        String F = this.f309356e.mo79659F();
        if (F != null && !TextUtils.isEmpty(F)) {
            return this.f309353b.mo28202b("get assistant history snapshot from geller", new C111105b(this, F));
        }
        C48633bv bvVar = (C48633bv) C48635bx.f125704d.createBuilder();
        long b = this.f309355d.mo26870b();
        bvVar.copyOnWrite();
        ((C48635bx) bvVar.instance).f125708c = b;
        return C60856cj.m92900i((C48635bx) bvVar.build());
    }
}
