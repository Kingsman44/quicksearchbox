package com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a;

import com.google.android.libraries.assistant.p1363c.p1386e.p1387a.p1390c.C17249n;
import com.google.android.libraries.assistant.p1363c.p1386e.p1387a.p1390c.C17250o;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.p5208h.C66652ds;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.Set;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.stream.Stream;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.assistant.platform.e.b.a.d */
/* compiled from: PG */
public final class C120269d extends C68247h {

    /* renamed from: a */
    private final C68283d f334642a;

    /* renamed from: c */
    private final C68283d f334643c;

    /* renamed from: d */
    private final C68283d f334644d;

    /* renamed from: e */
    private final C68283d f334645e;

    /* renamed from: f */
    private final C68283d f334646f;

    /* renamed from: g */
    private final C68283d f334647g;

    /* renamed from: h */
    private final C68283d f334648h;

    /* renamed from: i */
    private final C68283d f334649i;

    /* renamed from: j */
    private final C68283d f334650j;

    public C120269d(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5, C68283d dVar6, C68283d dVar7, C68283d dVar8, C68283d dVar9) {
        super(aVar2, new C68277d(C120269d.class), aVar);
        this.f334642a = C68236af.m98549d(dVar);
        this.f334643c = C68236af.m98549d(dVar2);
        this.f334644d = C68236af.m98549d(dVar3);
        this.f334645e = C68236af.m98549d(dVar4);
        this.f334646f = C68236af.m98549d(dVar5);
        this.f334647g = C68236af.m98549d(dVar6);
        this.f334648h = C68236af.m98549d(dVar7);
        this.f334649i = C68236af.m98549d(dVar8);
        this.f334650j = C68236af.m98549d(dVar9);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C120259cq cqVar = (C120259cq) list.get(5);
        C120261cs csVar = (C120261cs) list.get(7);
        C59104x b = C120237c.f334591a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ConvEngine.OnlineProcessing");
        ((C59052c) ((C59052c) b).mo56372aa(34674)).mo56386p("#connectTheConnection: creating ApaS3Connection");
        C58485gu j = C58485gu.m89842j((Set) list.get(2));
        Stream concat = Stream.CC.concat(Stream.CC.m71935of((C120292dt) list.get(4)), Collection.EL.stream((Set) list.get(3)));
        Objects.requireNonNull(csVar);
        C17249n a = ((C17250o) list.get(1)).mo23251a(j, (List) concat.map(new C120180a(csVar)).collect(C58370cn.f155946a), (C66652ds) list.get(6), (C120223bm) list.get(8));
        ((C120227bq) list.get(0)).f334569a.mo19974a(C37176a.f96911bc);
        C60870cx a2 = a.mo23243a();
        cqVar.mo104713a(new C120209b(a2), cqVar.f334623a);
        return a2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f334642a.mo60297gq(), this.f334643c.mo60297gq(), this.f334644d.mo60297gq(), this.f334645e.mo60297gq(), this.f334646f.mo60297gq(), this.f334647g.mo60297gq(), this.f334648h.mo60297gq(), this.f334649i.mo60297gq(), this.f334650j.mo60297gq());
    }
}
