package com.google.android.libraries.assistant.auto.tng.p1278u.p1281b.p1282a.p1283a.p1284a;

import com.google.assistant.p3897e.p3917i.p3918a.C51376fk;
import com.google.assistant.p3897e.p3917i.p3918a.C51378fm;
import com.google.assistant.p3897e.p3917i.p3918a.C51379fn;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.knowledge.p4671b.C61790ai;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.u.b.a.a.a.bi */
/* compiled from: PG */
public final class C16503bi extends C68247h {

    /* renamed from: a */
    private final C68283d f48469a;

    /* renamed from: c */
    private final C68283d f48470c;

    public C16503bi(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C16503bi.class), aVar);
        this.f48469a = C68236af.m98549d(dVar);
        this.f48470c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C61790ai aiVar = (C61790ai) list.get(0);
        C58833ax axVar = (C58833ax) list.get(1);
        C51376fk fkVar = (C51376fk) C51379fn.f133814i.createBuilder();
        fkVar.copyOnWrite();
        C51379fn fnVar = (C51379fn) fkVar.instance;
        aiVar.getClass();
        fnVar.f133817b = aiVar;
        fnVar.f133816a |= 1;
        if (axVar.mo56113h()) {
            fkVar.copyOnWrite();
            C51379fn fnVar2 = (C51379fn) fkVar.instance;
            fnVar2.f133821f = ((C51378fm) axVar.mo56107c()).f133813e;
            fnVar2.f133816a |= 256;
        }
        return C60856cj.m92900i((C51379fn) fkVar.build());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f48469a.mo60297gq(), this.f48470c.mo60297gq());
    }
}
