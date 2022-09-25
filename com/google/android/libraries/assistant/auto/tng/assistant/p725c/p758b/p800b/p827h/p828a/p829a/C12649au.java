package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p827h.p828a.p829a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p739d.C12094a;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p787c.p788a.p789a.C12321e;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68282c;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.h.a.a.au */
/* compiled from: PG */
public final class C12649au extends C68247h {

    /* renamed from: a */
    private final C68283d f39660a;

    /* renamed from: c */
    private final C68283d f39661c;

    /* renamed from: d */
    private final C68283d f39662d;

    /* renamed from: e */
    private final C68283d f39663e;

    public C12649au(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C12649au.class), aVar);
        this.f39660a = C68236af.m98549d(dVar);
        this.f39661c = C68236af.m98549d(dVar2);
        this.f39662d = C68236af.m98549d(dVar3);
        this.f39663e = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C68282c cVar = (C68282c) list.get(0);
        C12321e eVar = (C12321e) list.get(1);
        C12094a aVar = (C12094a) list.get(2);
        C58833ax axVar = (C58833ax) list.get(3);
        if (axVar.mo56113h()) {
            ((C60870cx) axVar.mo56107c()).cancel(false);
            aVar.mo20409b();
        }
        return eVar.f39128b.f42144c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(C68236af.m98546a(this.f39660a.mo60297gq()), this.f39661c.mo60297gq(), this.f39662d.mo60297gq(), this.f39663e.mo60297gq());
    }
}
