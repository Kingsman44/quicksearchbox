package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p767b.p773b.p777b.p779b;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p760a.p761a.C12175a;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4456g.C57981b;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.b.b.b.b.p */
/* compiled from: PG */
public final class C12263p extends C68247h {

    /* renamed from: a */
    private final C68283d f39031a;

    /* renamed from: c */
    private final C68283d f39032c;

    public C12263p(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C12263p.class), aVar);
        this.f39031a = C68236af.m98549d(dVar);
        this.f39032c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C58833ax axVar = (C58833ax) list.get(1);
        C12175a aVar = new C12175a();
        aVar.mo20467b((C57981b) list.get(0));
        if (axVar != null) {
            aVar.f38879b = axVar;
            return C60856cj.m92900i(aVar.mo20466a());
        }
        throw new NullPointerException("Null offlineLoggingMetadata");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f39031a.mo60297gq(), this.f39032c.mo60297gq());
    }
}
