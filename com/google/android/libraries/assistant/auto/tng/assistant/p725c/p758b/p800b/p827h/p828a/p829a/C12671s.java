package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p827h.p828a.p829a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p743f.p744a.p745a.C12115d;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13069o;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13071q;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13072r;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13073s;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13075u;
import com.google.android.libraries.search.p2904c.p2952o.p2959e.C37935b;
import com.google.common.p4526f.C59052c;
import com.google.p4449cd.p4456g.C57974a;
import com.google.p4449cd.p4456g.C57996c;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.h.a.a.s */
/* compiled from: PG */
final class C12671s implements C57974a {

    /* renamed from: a */
    private final C57974a f39718a;

    /* renamed from: b */
    private float f39719b = 75.0f;

    public C12671s(C57974a aVar) {
        this.f39718a = aVar;
    }

    /* renamed from: e */
    private final void m28919e() {
        C57974a aVar = this.f39718a;
        C13069o oVar = (C13069o) C13075u.f40569c.createBuilder();
        C13071q qVar = C13071q.f40563a;
        oVar.copyOnWrite();
        C13075u uVar = (C13075u) oVar.instance;
        qVar.getClass();
        uVar.f40572b = qVar;
        uVar.f40571a = 2;
        aVar.mo20337c(oVar.build());
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20337c(Object obj) {
        byte[] N = ((C12115d) obj).f38736b.mo59174N();
        float b = C37935b.m66964b(N, 0, N.length);
        float a = C37935b.m66963a(this.f39719b, b);
        this.f39719b = a;
        int c = C37935b.m66965c(a, b);
        C57974a aVar = this.f39718a;
        C13069o oVar = (C13069o) C13075u.f40569c.createBuilder();
        C13072r rVar = (C13072r) C13073s.f40565c.createBuilder();
        rVar.copyOnWrite();
        C13073s sVar = (C13073s) rVar.instance;
        sVar.f40567a |= 1;
        sVar.f40568b = c;
        C13073s sVar2 = (C13073s) rVar.build();
        oVar.copyOnWrite();
        C13075u uVar = (C13075u) oVar.instance;
        sVar2.getClass();
        uVar.f40572b = sVar2;
        uVar.f40571a = 1;
        aVar.mo20337c(oVar.build());
    }

    /* renamed from: d */
    public final void mo20338d(C57996c cVar) {
        this.f39718a.mo20338d(cVar);
    }

    /* renamed from: gQ */
    public final void mo20339gQ(boolean z) {
        m28919e();
        this.f39718a.mo20339gQ(z);
    }

    /* renamed from: gR */
    public final void mo20340gR(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C12673u.f39721a.mo56226d()).mo56382g(th)).mo56372aa(44371)).mo56386p("Sink failure.");
        m28919e();
        this.f39718a.mo20340gR(th);
    }
}
