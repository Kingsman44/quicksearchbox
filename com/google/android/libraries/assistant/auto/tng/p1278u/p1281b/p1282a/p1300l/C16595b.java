package com.google.android.libraries.assistant.auto.tng.p1278u.p1281b.p1282a.p1300l;

import com.google.android.libraries.assistant.auto.tng.p1278u.p1281b.p1282a.C16462a;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.p5224k.p5225a.C67187ae;
import com.google.speech.p5224k.p5225a.C67190ah;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.u.b.a.l.b */
/* compiled from: PG */
public final class C16595b extends C68247h {

    /* renamed from: a */
    private final C68283d f48660a;

    /* renamed from: c */
    private final C68283d f48661c;

    public C16595b(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C16595b.class), aVar);
        this.f48660a = C68236af.m98549d(dVar);
        this.f48661c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        C67187ae aeVar;
        List list = (List) obj;
        C58833ax axVar = (C58833ax) list.get(0);
        String str = (String) list.get(1);
        if (axVar.mo56113h()) {
            aeVar = (C67187ae) ((C67190ah) axVar.mo56107c()).toBuilder();
        } else {
            C67187ae aeVar2 = (C67187ae) C67190ah.f182619q.createBuilder();
            aeVar2.copyOnWrite();
            C67190ah ahVar = (C67190ah) aeVar2.instance;
            str.getClass();
            ahVar.f182622a |= 8192;
            ahVar.f182632k = str;
            aeVar = aeVar2;
        }
        aeVar.copyOnWrite();
        C67190ah ahVar2 = (C67190ah) aeVar.instance;
        ahVar2.f182628g = 4;
        ahVar2.f182622a |= 128;
        aeVar.copyOnWrite();
        C67190ah ahVar3 = (C67190ah) aeVar.instance;
        ahVar3.f182622a |= 512;
        ahVar3.f182629h = true;
        return C60856cj.m92900i(new C16462a(C58833ax.m90834k((C67190ah) aeVar.build()), C67190ah.f182620r));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f48660a.mo60297gq(), this.f48661c.mo60297gq());
    }
}
