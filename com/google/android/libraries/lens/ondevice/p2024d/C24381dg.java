package com.google.android.libraries.lens.ondevice.p2024d;

import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.lens.p4705i.p4706a.C62370ab;
import com.google.lens.p4705i.p4706a.C62383n;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.lens.ondevice.d.dg */
/* compiled from: PG */
public final class C24381dg extends C68247h {

    /* renamed from: a */
    private final C68283d f66777a;

    /* renamed from: c */
    private final C68283d f66778c;

    public C24381dg(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C24381dg.class), aVar);
        this.f66777a = C68236af.m98549d(dVar);
        this.f66778c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        C68283d dVar = this.f66778c;
        ((C58970a) ((C58970a) C24373cz.f66760a.mo56224b()).mo56372aa(48773)).mo56386p("Executing: maybRunTextPipeline");
        if (((C62370ab) obj).equals(C62370ab.f168371f)) {
            return C60856cj.m92900i(C62383n.f168403e);
        }
        ((C58970a) ((C58970a) C24373cz.f66760a.mo56224b()).mo56372aa(48774)).mo56386p("maybeRunTextPipeline: non-default webcontext");
        return dVar.mo60297gq();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return this.f66777a.mo60297gq();
    }
}
