package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p787c.p790b.p793b.p794a.p795a;

import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.android.libraries.assistant.auto.tng.p1278u.p1281b.p1303b.C16606d;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4456g.C57981b;
import com.google.p4449cd.p4456g.p4458b.C57986e;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.c.b.b.a.a.p */
/* compiled from: PG */
public final class C12390p extends C68247h {

    /* renamed from: a */
    private final C68283d f39237a;

    /* renamed from: c */
    private final C68283d f39238c;

    /* renamed from: d */
    private final C68283d f39239d;

    /* renamed from: e */
    private final C68283d f39240e;

    /* renamed from: f */
    private final C68283d f39241f;

    public C12390p(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5) {
        super(aVar2, new C68277d(C12390p.class), aVar);
        this.f39237a = C68236af.m98549d(dVar);
        this.f39238c = C68236af.m98549d(dVar2);
        this.f39239d = C68236af.m98549d(dVar3);
        this.f39240e = C68236af.m98549d(dVar4);
        this.f39241f = C68236af.m98549d(dVar5);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C68283d dVar = this.f39237a;
        ((C59052c) ((C59052c) C12389o.f39236a.mo56224b()).mo56372aa(44225)).mo56386p("Producing s3Request source");
        C57986e eVar = new C57986e(C58485gu.m89847o((C57981b) list.get(0), (C57981b) list.get(1)));
        return C60856cj.m92900i(new C16606d((Executor) list.get(2), dVar.mo60297gq(), eVar, (C15481g) list.get(3)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f39238c.mo60297gq(), this.f39239d.mo60297gq(), this.f39240e.mo60297gq(), this.f39241f.mo60297gq());
    }
}
