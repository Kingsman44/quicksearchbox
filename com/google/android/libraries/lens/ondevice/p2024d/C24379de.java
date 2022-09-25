package com.google.android.libraries.lens.ondevice.p2024d;

import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.lens.p4701g.C62321cq;
import com.google.lens.p4701g.C62324ct;
import com.google.lens.p4701g.C62333db;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.lens.ondevice.d.de */
/* compiled from: PG */
public final class C24379de extends C68247h {

    /* renamed from: a */
    private final C68283d f66772a;

    /* renamed from: c */
    private final C68283d f66773c;

    public C24379de(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C24379de.class), aVar);
        this.f66772a = C68236af.m98549d(dVar);
        this.f66773c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        C68283d dVar = this.f66773c;
        ((C58970a) ((C58970a) C24373cz.f66760a.mo56224b()).mo56372aa(48770)).mo56386p("Executing: maybeRunSensitivityClassifier");
        if (C24375da.m45433b((C62333db) obj)) {
            ((C58970a) ((C58970a) C24373cz.f66760a.mo56224b()).mo56372aa(48771)).mo56386p("maybeRunSensitivity: shopping image or bypassed");
            return dVar.mo60297gq();
        }
        C62321cq cqVar = (C62321cq) C62324ct.f168237e.createBuilder();
        cqVar.copyOnWrite();
        C62324ct ctVar = (C62324ct) cqVar.instance;
        ctVar.f168241c = 2;
        ctVar.f168239a = 2 | ctVar.f168239a;
        return C60856cj.m92900i((C62324ct) cqVar.build());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return this.f66772a.mo60297gq();
    }
}
