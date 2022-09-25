package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123744bk;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123745bl;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123746bm;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123749bp;
import com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.C14781a;
import com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.C14782b;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14218bb;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14219bc;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14220bd;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14221be;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14280dj;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14281dk;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14282dl;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14324f;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14499lm;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1243h.p1253e.C16269a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3994s.p3995a.C53270hr;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import java.util.ArrayList;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.concurrent.ConcurrentHashMap;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.au */
/* compiled from: PG */
public final class C14806au implements C14781a {

    /* renamed from: a */
    public final ConcurrentHashMap f44603a = new ConcurrentHashMap();

    /* renamed from: b */
    private final C16269a f44604b;

    /* renamed from: c */
    private final C60887da f44605c;

    public C14806au(C16269a aVar, C60887da daVar) {
        this.f44604b = aVar;
        this.f44605c = daVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo21501a() {
    }

    /* renamed from: b */
    public final /* synthetic */ void mo21502b() {
    }

    /* renamed from: c */
    public final /* synthetic */ void mo21503c() {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo21504d() {
    }

    /* renamed from: e */
    public final /* synthetic */ void mo21505e() {
    }

    /* renamed from: g */
    public final /* synthetic */ void mo21506g() {
    }

    /* renamed from: h */
    public final C14221be mo21727h(C14219bc bcVar) {
        C14280dj djVar;
        if (C14218bb.m30579a(bcVar.f43038a) != C14218bb.IMMERSIVE_PCP_DATA_REQUEST) {
            return C14221be.f43041c;
        }
        C123745bl blVar = (C123745bl) C123746bm.f341818b.createBuilder();
        if (bcVar.f43038a == 9) {
            djVar = (C14280dj) bcVar.f43039b;
        } else {
            djVar = C14280dj.f43192b;
        }
        for (C123749bp bpVar : djVar.f43194a) {
            C123744bk bkVar = (C123744bk) this.f44603a.get(Integer.valueOf(bpVar.f341825b));
            if (bkVar != null) {
                blVar.mo106126c(bkVar);
            }
        }
        C14220bd bdVar = (C14220bd) C14221be.f43041c.createBuilder();
        C14281dk dkVar = (C14281dk) C14282dl.f43195b.createBuilder();
        dkVar.copyOnWrite();
        C123746bm bmVar = (C123746bm) blVar.build();
        bmVar.getClass();
        ((C14282dl) dkVar.instance).f43197a = bmVar;
        bdVar.copyOnWrite();
        C14221be beVar = (C14221be) bdVar.instance;
        C14282dl dlVar = (C14282dl) dkVar.build();
        dlVar.getClass();
        beVar.f43044b = dlVar;
        beVar.f43043a = 7;
        return (C14221be) bdVar.build();
    }

    /* renamed from: i */
    public final C60870cx mo21728i(C14219bc bcVar) {
        C14280dj djVar;
        if (C14218bb.m30579a(bcVar.f43038a) != C14218bb.IMMERSIVE_PCP_DATA_REQUEST) {
            return C60856cj.m92900i(C14782b.FAILED);
        }
        ArrayList arrayList = new ArrayList();
        if (bcVar.f43038a == 9) {
            djVar = (C14280dj) bcVar.f43039b;
        } else {
            djVar = C14280dj.f43192b;
        }
        for (C123749bp bpVar : djVar.f43194a) {
            arrayList.add(Integer.valueOf(bpVar.f341825b));
        }
        Stream stream = Collection.EL.stream(arrayList);
        ConcurrentHashMap concurrentHashMap = this.f44603a;
        Objects.requireNonNull(concurrentHashMap);
        if (stream.allMatch(new C14804as(concurrentHashMap))) {
            C58976aa aaVar = C58975e.f156826a;
            return C60856cj.m92900i(C14782b.SUCCESS);
        }
        C60870cx a = this.f44604b.mo22867a(C53306j.MORRIS, arrayList, true, C53270hr.FOREGROUND, Optional.empty());
        C14805at atVar = new C14805at(this);
        return C60922j.m93045h(a, C47810es.m84966f(atVar), this.f44605c);
    }

    /* renamed from: t */
    public final void mo21729t(C14219bc bcVar, C14324f fVar, C14499lm lmVar) {
    }
}
