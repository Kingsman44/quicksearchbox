package com.google.android.libraries.lens.ondevice.p2024d;

import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.lens.p4701g.C62306cb;
import com.google.lens.p4705i.p4706a.C62383n;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.lens.ondevice.d.ef */
/* compiled from: PG */
public final class C24407ef extends C68247h {

    /* renamed from: a */
    private final C68283d f66828a;

    /* renamed from: c */
    private final C68283d f66829c;

    public C24407ef(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C24407ef.class), aVar);
        this.f66828a = C68236af.m98549d(dVar);
        this.f66829c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        C62383n nVar = (C62383n) obj;
        C68283d dVar = this.f66829c;
        ((C58970a) ((C58970a) C24403eb.f66820a.mo56224b()).mo56372aa(48779)).mo56386p("Executing: maybRunParticleExtractor");
        if ((nVar.f168405a & 1) == 0 || !nVar.f168406b) {
            ((C58970a) ((C58970a) C24403eb.f66820a.mo56224b()).mo56372aa(48780)).mo56386p("maybeRunParticleExtractor: application in allowlist; executing");
            return dVar.mo60297gq();
        }
        ((C58970a) ((C58970a) C24403eb.f66820a.mo56224b()).mo56372aa(48781)).mo56386p("maybeRunParticleExtractor: application not in allowlist");
        return C60856cj.m92900i(C62306cb.f168197b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return this.f66828a.mo60297gq();
    }
}
