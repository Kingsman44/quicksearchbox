package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p809d.p810a.p812b;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p809d.p810a.p811a.C12497q;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p809d.p810a.p811a.C12498r;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.d.a.b.g */
/* compiled from: PG */
public final class C12511g extends C68247h {

    /* renamed from: a */
    private final C68283d f39424a;

    /* renamed from: c */
    private final C68283d f39425c;

    /* renamed from: d */
    private final C68283d f39426d;

    public C12511g(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C12511g.class), aVar);
        this.f39424a = C68236af.m98549d(dVar);
        this.f39425c = C68236af.m98549d(dVar2);
        this.f39426d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C12991i iVar = (C12991i) list.get(0);
        C58833ax axVar = (C58833ax) list.get(1);
        C12498r rVar = (C12498r) list.get(2);
        iVar.getClass();
        axVar.getClass();
        Executor executor = (Executor) rVar.f39409a.mo17428b();
        executor.getClass();
        Map map = (Map) rVar.f39410b.mo17428b();
        map.getClass();
        return C60856cj.m92900i(new C12497q(iVar, axVar, executor, map, rVar.f39411c));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f39424a.mo60297gq(), this.f39425c.mo60297gq(), this.f39426d.mo60297gq());
    }
}
