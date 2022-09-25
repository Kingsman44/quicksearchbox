package com.google.android.libraries.search.assistant.p2716p.p2723c.p2724a.p2725a;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.p4152bb.p4153a.C55090fm;
import com.google.p4152bb.p4153a.C55093fp;
import java.util.concurrent.Callable;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.search.assistant.p.c.a.a.ah */
/* compiled from: PG */
public final /* synthetic */ class C34934ah implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C58485gu f92600a;

    /* renamed from: b */
    public final /* synthetic */ String f92601b;

    public /* synthetic */ C34934ah(C58485gu guVar, String str) {
        this.f92600a = guVar;
        this.f92601b = str;
    }

    public final Object call() {
        C58485gu guVar = this.f92600a;
        String str = this.f92601b;
        C59071e eVar = C34942ap.f92610a;
        C55090fm fmVar = (C55090fm) C55093fp.f144965l.createBuilder();
        Collection.EL.stream(guVar).forEach(new C34964r(fmVar));
        fmVar.copyOnWrite();
        C55093fp fpVar = (C55093fp) fmVar.instance;
        str.getClass();
        fpVar.f144967a |= 1;
        fpVar.f144968b = str;
        return (C55093fp) fmVar.build();
    }
}
