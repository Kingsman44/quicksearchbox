package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p870d.p871a;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2169h;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13060f;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13078x;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13079y;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4456g.C57996c;
import com.google.p4449cd.p4456g.p4457a.C57975a;
import com.google.p4449cd.p4456g.p4458b.C57987f;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.d.a.y */
/* compiled from: PG */
final class C12955y extends C57975a {

    /* renamed from: a */
    public final C60870cx f40318a = C2169h.m6027a(new C12954x(this));

    /* renamed from: b */
    public C2164c f40319b;

    /* renamed from: c */
    private final C57987f f40320c;

    /* renamed from: d */
    private C57996c f40321d;

    /* renamed from: e */
    private C13060f f40322e;

    public C12955y(C57987f fVar) {
        this.f40320c = fVar;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20337c(Object obj) {
        C13060f fVar = (C13060f) obj;
        this.f40322e = fVar;
        C57987f fVar2 = this.f40320c;
        C13078x xVar = (C13078x) C13079y.f40577f.createBuilder();
        xVar.copyOnWrite();
        C13079y yVar = (C13079y) xVar.instance;
        fVar.getClass();
        yVar.f40581c = fVar;
        yVar.f40579a |= 2;
        fVar2.f155056f.mo54591h((C13079y) xVar.build());
    }

    /* renamed from: d */
    public final void mo20338d(C57996c cVar) {
        this.f40321d = cVar;
    }

    /* renamed from: gQ */
    public final void mo20339gQ(boolean z) {
        C2164c cVar = this.f40319b;
        cVar.getClass();
        cVar.mo5437b(C58833ax.m90833j(this.f40322e));
        C57996c cVar2 = this.f40321d;
        cVar2.getClass();
        cVar2.mo21018g();
    }

    /* renamed from: gR */
    public final void mo20340gR(Throwable th) {
        C2164c cVar = this.f40319b;
        cVar.getClass();
        if (th instanceof CancellationException) {
            cVar.mo5437b(C58833ax.m90833j(this.f40322e));
        } else {
            cVar.mo5439d(th);
        }
        C57996c cVar2 = this.f40321d;
        cVar2.getClass();
        cVar2.mo21018g();
    }
}
