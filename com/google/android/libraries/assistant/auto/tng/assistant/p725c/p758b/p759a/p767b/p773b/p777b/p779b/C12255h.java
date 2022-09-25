package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p767b.p773b.p777b.p779b;

import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.b.b.b.b.h */
/* compiled from: PG */
public final class C12255h extends C68247h {

    /* renamed from: a */
    private final C68283d f39014a;

    /* renamed from: c */
    private final C68283d f39015c;

    /* renamed from: d */
    private final C68283d f39016d;

    public C12255h(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C12255h.class), aVar);
        this.f39014a = C68236af.m98549d(dVar);
        this.f39015c = C68236af.m98549d(dVar2);
        this.f39016d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        boolean booleanValue = ((Boolean) list.get(0)).booleanValue();
        boolean booleanValue2 = ((Boolean) list.get(1)).booleanValue();
        C68283d dVar = this.f39016d;
        if (booleanValue || booleanValue2) {
            return dVar.mo60297gq();
        }
        return C60856cj.m92900i(C58836b.f156633a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f39014a.mo60297gq(), this.f39015c.mo60297gq());
    }
}
