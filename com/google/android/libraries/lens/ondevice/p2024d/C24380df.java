package com.google.android.libraries.lens.ondevice.p2024d;

import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.lens.p4701g.C62329cy;
import com.google.lens.p4701g.C62333db;
import com.google.lens.p4705i.p4706a.C62370ab;
import com.google.lens.p4705i.p4706a.C62383n;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.lens.ondevice.d.df */
/* compiled from: PG */
public final class C24380df extends C68247h {

    /* renamed from: a */
    private final C68283d f66774a;

    /* renamed from: c */
    private final C68283d f66775c;

    /* renamed from: d */
    private final C68283d f66776d;

    public C24380df(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C24380df.class), aVar);
        this.f66774a = C68236af.m98549d(dVar);
        this.f66775c = C68236af.m98549d(dVar2);
        this.f66776d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        boolean z = false;
        C62370ab abVar = (C62370ab) list.get(0);
        C62383n nVar = (C62383n) list.get(1);
        C68283d dVar = this.f66776d;
        ((C58970a) ((C58970a) C24373cz.f66760a.mo56224b()).mo56372aa(48772)).mo56386p("Executing: maybeRunShoppingClassifier");
        if (!nVar.f168407c && !nVar.f168408d) {
            z = true;
        }
        if (Boolean.valueOf(z).booleanValue() || abVar.equals(C62370ab.f168371f)) {
            return dVar.mo60297gq();
        }
        C62329cy cyVar = (C62329cy) C62333db.f168274e.createBuilder();
        cyVar.copyOnWrite();
        C62333db dbVar = (C62333db) cyVar.instance;
        dbVar.f168278c = 2;
        dbVar.f168276a |= 16;
        return C60856cj.m92900i((C62333db) cyVar.build());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f66774a.mo60297gq(), this.f66775c.mo60297gq());
    }
}
