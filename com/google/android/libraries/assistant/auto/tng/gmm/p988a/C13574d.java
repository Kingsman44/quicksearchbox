package com.google.android.libraries.assistant.auto.tng.gmm.p988a;

import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12989g;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4522b.C58759qy;
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

/* renamed from: com.google.android.libraries.assistant.auto.tng.gmm.a.d */
/* compiled from: PG */
public final class C13574d extends C68247h {

    /* renamed from: a */
    private final C68283d f41568a;

    /* renamed from: c */
    private final C68283d f41569c;

    /* renamed from: d */
    private final C68283d f41570d;

    public C13574d(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C13574d.class), aVar);
        this.f41568a = C68236af.m98549d(dVar);
        this.f41569c = C68236af.m98549d(dVar2);
        this.f41570d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        Object obj2;
        List list = (List) obj;
        C12991i iVar = (C12991i) list.get(0);
        Map map = (Map) list.get(1);
        C13573c cVar = (C13573c) list.get(2);
        C12989g a = C12989g.m29225a(iVar.f40385d);
        if (a == null) {
            a = C12989g.UNKNOWN;
        }
        C69464a aVar = (C69464a) map.get(a);
        if (aVar == null) {
            obj2 = C58733pz.f156496a;
        } else {
            iVar.getClass();
            Executor executor = (Executor) cVar.f41567a.mo17428b();
            executor.getClass();
            obj2 = new C58759qy(new C13572b(aVar, iVar, executor));
        }
        return C60856cj.m92900i(obj2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f41568a.mo60297gq(), this.f41569c.mo60297gq(), this.f41570d.mo60297gq());
    }
}
