package com.google.android.libraries.p10923ac.p10925b.p10934e;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4895aw.p4902b.C63999bi;
import com.google.protos.p4895aw.p4902b.C64002bl;
import com.google.protos.p4895aw.p4902b.C64014bx;
import com.google.protos.p4895aw.p4902b.C64057dm;
import com.google.protos.p4895aw.p4902b.C64064dt;
import com.google.protos.p4895aw.p4902b.C64098p;
import com.google.protos.p4895aw.p4902b.C64107y;
import com.google.protos.p4895aw.p4902b.C64108z;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.ac.b.e.db */
/* compiled from: PG */
public final class C146953db extends C68247h {

    /* renamed from: a */
    private final C68283d f396688a;

    /* renamed from: c */
    private final C68283d f396689c;

    /* renamed from: d */
    private final C68283d f396690d;

    /* renamed from: e */
    private final C68283d f396691e;

    public C146953db(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C146953db.class), aVar);
        this.f396688a = C68236af.m98549d(dVar);
        this.f396689c = C68236af.m98549d(dVar2);
        this.f396690d = C68236af.m98549d(dVar3);
        this.f396691e = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C64098p pVar = (C64098p) list.get(0);
        C64057dm dmVar = (C64057dm) list.get(1);
        C64064dt dtVar = (C64064dt) list.get(3);
        C63999bi biVar = (C63999bi) C64002bl.f173078f.createBuilder();
        C64107y yVar = (C64107y) C64108z.f173317c.createBuilder();
        yVar.copyOnWrite();
        C64108z zVar = (C64108z) yVar.instance;
        dtVar.getClass();
        zVar.f173320b = dtVar;
        zVar.f173319a = 2;
        C64108z zVar2 = (C64108z) yVar.build();
        biVar.copyOnWrite();
        C64002bl blVar = (C64002bl) biVar.instance;
        zVar2.getClass();
        blVar.f173082c = zVar2;
        blVar.f173080a |= 2;
        biVar.copyOnWrite();
        C64002bl blVar2 = (C64002bl) biVar.instance;
        pVar.getClass();
        blVar2.f173081b = pVar;
        blVar2.f173080a |= 1;
        biVar.copyOnWrite();
        C64002bl blVar3 = (C64002bl) biVar.instance;
        dmVar.getClass();
        blVar3.f173083d = dmVar;
        blVar3.f173080a |= 4;
        return ((C64014bx) list.get(2)).mo59248b((C64002bl) biVar.build());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f396688a.mo60297gq(), this.f396689c.mo60297gq(), this.f396690d.mo60297gq(), this.f396691e.mo60297gq());
    }
}
