package com.google.android.apps.gsa.staticplugins.p7382aj;

import android.content.Context;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6519al.p6528ad.C84639a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.C86610af;
import com.google.android.apps.gsa.search.core.service.C86626av;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87800ea;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87801eb;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87802ec;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.util.debug.C91027k;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import dagger.C68214a;
import java.util.Map;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.aj.b */
/* compiled from: PG */
public final class C93879b extends C86734a implements C84639a {

    /* renamed from: a */
    public static final C59071e f262188a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.aj.b");

    /* renamed from: b */
    public final C86124t f262189b;

    /* renamed from: c */
    C93884f f262190c;

    /* renamed from: f */
    private final Context f262191f;

    /* renamed from: g */
    private final C21370a f262192g;

    /* renamed from: h */
    private final C90931ca f262193h;

    /* renamed from: i */
    private final C22871g f262194i;

    /* renamed from: j */
    private final C86626av f262195j;

    /* renamed from: k */
    private final C86610af f262196k;

    /* renamed from: l */
    private final C68214a f262197l;

    /* renamed from: m */
    private final C69464a f262198m;

    /* renamed from: n */
    private boolean f262199n;

    public C93879b(Context context, C21370a aVar, C86124t tVar, C86626av avVar, C86610af afVar, C90931ca caVar, C22871g gVar, C68214a aVar2, C69464a aVar3) {
        super(C118575h.WORKER_DEBUG, "debug");
        this.f262191f = context;
        this.f262195j = avVar;
        this.f262192g = aVar;
        this.f262189b = tVar;
        this.f262196k = afVar;
        this.f262193h = caVar;
        this.f262194i = gVar;
        this.f262197l = aVar2;
        this.f262198m = aVar3;
    }

    /* renamed from: a */
    public final void mo78396a() {
        C87801eb ebVar = (C87801eb) C87802ec.f237592b.createBuilder();
        for (C118522by name : ((Map) this.f262197l.mo27525b()).keySet()) {
            String name2 = name.name();
            ebVar.copyOnWrite();
            C87802ec ecVar = (C87802ec) ebVar.instance;
            name2.getClass();
            C62971cq cqVar = ecVar.f237594a;
            if (!cqVar.mo58948c()) {
                ecVar.f237594a = C62942bv.mutableCopy(cqVar);
            }
            ecVar.f237594a.add(name2);
        }
        C87684al alVar = new C87684al(C88244um.FETCH_SEARCH_SERVICE_BACKGROUND_TASK_NAMES_RESULT);
        alVar.mo81965b(C87800ea.f237591a, (C87802ec) ebVar.build());
        this.f262196k.mo80228i(alVar.mo81964a());
    }

    /* renamed from: e */
    public final void mo78398e() {
        this.f262194i.mo28212l("Starting long running task on the EventBus", new C93877a(this));
    }

    /* renamed from: f */
    public final void mo78399f(int i) {
        this.f262195j.mo80249o(i);
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
    }

    /* renamed from: hY */
    public final void mo79108hY() {
        this.f262199n = true;
        mo78397c(false);
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }

    /* renamed from: c */
    public final void mo78397c(boolean z) {
        if (this.f262199n || !z) {
            C93884f fVar = this.f262190c;
            if (fVar != null) {
                if (fVar.f262216c) {
                    fVar.f262215b.mo88206b();
                    fVar.f262216c = false;
                }
                this.f262190c = null;
                return;
            }
            return;
        }
        if (this.f262190c == null) {
            this.f262190c = new C93884f(this.f262191f, (C91027k) this.f262198m.mo17428b(), this.f262192g, this.f262193h);
        }
        C93884f fVar2 = this.f262190c;
        if (!fVar2.f262216c) {
            C93886h hVar = fVar2.f262215b;
            if (hVar.mo88205a() == null) {
                ((C59052c) ((C59052c) C93886h.f262223a.mo56224b()).mo56372aa(19213)).mo56386p("Accelerometer not found");
            } else if (!hVar.f262224b.registerListener(hVar, hVar.mo88205a(), 2)) {
                ((C59052c) ((C59052c) C93886h.f262223a.mo56224b()).mo56372aa(19212)).mo56386p("Failed to register to SensorManager");
            }
            fVar2.f262216c = true;
        }
    }
}
