package com.google.android.libraries.assistant.p1363c.p1398g.p1441n.p1442a;

import com.google.android.libraries.assistant.p1363c.p1398g.p1409g.p1410a.p1414b.p1428c.C17425c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4456g.C57981b;
import com.google.p4449cd.p4456g.p4458b.C57986e;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.c.g.n.a.f */
/* compiled from: PG */
public final class C17543f extends C68247h {

    /* renamed from: a */
    private final C68283d f50589a;

    /* renamed from: c */
    private final C68283d f50590c;

    /* renamed from: d */
    private final C68283d f50591d;

    /* renamed from: e */
    private final C68283d f50592e;

    public C17543f(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C17543f.class), aVar);
        this.f50589a = C68236af.m98549d(dVar);
        this.f50590c = C68236af.m98549d(dVar2);
        this.f50591d = C68236af.m98549d(dVar3);
        this.f50592e = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C68283d dVar = this.f50589a;
        Optional optional = (Optional) list.get(0);
        Optional optional2 = (Optional) list.get(1);
        Executor executor = (Executor) list.get(2);
        C59104x b = C17540c.f50583a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TTS.Server");
        ((C59052c) ((C59052c) b).mo56372aa(42769)).mo56386p("Producing s3Request source");
        ArrayList arrayList = new ArrayList();
        if (optional2.isPresent()) {
            arrayList.add((C57981b) optional2.get());
        } else if (optional.isPresent()) {
            arrayList.add((C57981b) optional.get());
        }
        return C60856cj.m92900i(new C17425c(executor, dVar.mo60297gq(), new C57986e(arrayList)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f50590c.mo60297gq(), this.f50591d.mo60297gq(), this.f50592e.mo60297gq());
    }
}
