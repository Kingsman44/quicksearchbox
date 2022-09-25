package com.google.android.libraries.assistant.auto.tng.p1118r.p1119a.p1131g.p1132a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122417bi;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122419bk;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.common.p4580v.C60951j;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.a.g.a.d */
/* compiled from: PG */
public final class C15577d extends C68247h {

    /* renamed from: a */
    private final C68283d f46595a;

    /* renamed from: c */
    private final C68283d f46596c;

    /* renamed from: d */
    private final C68283d f46597d;

    public C15577d(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C15577d.class), aVar);
        this.f46595a = C68236af.m98549d(dVar);
        this.f46596c = C68236af.m98549d(dVar2);
        this.f46597d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        String str = (String) list.get(1);
        long longValue = ((Long) list.get(2)).longValue();
        C122417bi biVar = (C122417bi) C122419bk.f339392l.createBuilder();
        biVar.copyOnWrite();
        ((C122419bk) biVar.instance).f339394a = (int) longValue;
        biVar.copyOnWrite();
        str.getClass();
        ((C122419bk) biVar.instance).f339395b = str;
        String id = C60951j.f165070a.getId();
        biVar.copyOnWrite();
        id.getClass();
        ((C122419bk) biVar.instance).f339398e = id;
        C52091ex exVar = ((C52081en) list.get(0)).f136685e;
        if (exVar == null) {
            exVar = C52091ex.f136710b;
        }
        biVar.copyOnWrite();
        exVar.getClass();
        ((C122419bk) biVar.instance).f339396c = exVar;
        return C60856cj.m92900i((C122419bk) biVar.build());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f46595a.mo60297gq(), this.f46596c.mo60297gq(), this.f46597d.mo60297gq());
    }
}
