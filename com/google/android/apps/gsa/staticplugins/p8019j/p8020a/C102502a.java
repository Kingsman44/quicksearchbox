package com.google.android.apps.gsa.staticplugins.p8019j.p8020a;

import com.google.android.apps.gsa.staticplugins.p8019j.C102588k;
import com.google.assistant.p3897e.p3910e.p3911a.C51188c;
import com.google.assistant.p3897e.p3910e.p3911a.C51189d;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p395al.p398b.p399a.p400a.C8423g;
import com.google.p4017at.p4060h.p4068b.p4069a.C54188e;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.j.a.a */
/* compiled from: PG */
public final class C102502a extends C68247h {

    /* renamed from: a */
    private final C68283d f286085a;

    /* renamed from: c */
    private final C68283d f286086c;

    /* renamed from: d */
    private final C68283d f286087d;

    /* renamed from: e */
    private final C68283d f286088e;

    /* renamed from: f */
    private final C68283d f286089f;

    public C102502a(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5) {
        super(aVar2, new C68277d(C102502a.class), aVar);
        this.f286085a = C68236af.m98549d(dVar);
        this.f286086c = C68236af.m98549d(dVar2);
        this.f286087d = C68236af.m98549d(dVar3);
        this.f286088e = C68236af.m98549d(dVar4);
        this.f286089f = C68236af.m98549d(dVar5);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C102588k kVar = (C102588k) list.get(0);
        C52081en enVar = (C52081en) list.get(1);
        C58833ax axVar = (C58833ax) list.get(2);
        C54188e eVar = (C54188e) list.get(3);
        C8423g gVar = (C8423g) list.get(4);
        C51188c cVar = (C51188c) C51189d.f133247h.createBuilder();
        if (axVar.mo56113h()) {
            String str = (String) axVar.mo56107c();
            cVar.copyOnWrite();
            C51189d dVar = (C51189d) cVar.instance;
            str.getClass();
            dVar.f133249a |= 8;
            dVar.f133253e = str;
        }
        cVar.copyOnWrite();
        C51189d dVar2 = (C51189d) cVar.instance;
        gVar.getClass();
        dVar2.f133250b = gVar;
        dVar2.f133249a |= 1;
        cVar.copyOnWrite();
        C51189d dVar3 = (C51189d) cVar.instance;
        eVar.getClass();
        dVar3.f133251c = eVar;
        dVar3.f133249a |= 2;
        kVar.mo93343f(cVar);
        cVar.copyOnWrite();
        C51189d dVar4 = (C51189d) cVar.instance;
        enVar.getClass();
        dVar4.f133255g = enVar;
        dVar4.f133249a |= 64;
        C58976aa aaVar = C58975e.f156826a;
        return C60856cj.m92900i((C51189d) cVar.build());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f286085a.mo60297gq(), this.f286086c.mo60297gq(), this.f286087d.mo60297gq(), this.f286088e.mo60297gq(), this.f286089f.mo60297gq());
    }
}
