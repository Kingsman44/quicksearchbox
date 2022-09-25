package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p854c;

import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.p1104b.C15471a;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.p1104b.C15474b;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.common.p4552o.C60003j;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import java.util.List;
import java.util.concurrent.Callable;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.c.n */
/* compiled from: PG */
public final /* synthetic */ class C12847n implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C12855v f40088a;

    /* renamed from: b */
    public final /* synthetic */ List f40089b;

    public /* synthetic */ C12847n(C12855v vVar, List list) {
        this.f40088a = vVar;
        this.f40089b = list;
    }

    public final Object call() {
        C12855v vVar = this.f40088a;
        List<C60870cx> list = this.f40089b;
        C15471a aVar = (C15471a) C15474b.f46404j.createBuilder();
        for (C60870cx r : list) {
            C60003j jVar = (C60003j) C60856cj.m92909r(r);
            aVar.copyOnWrite();
            C15474b bVar = (C15474b) aVar.instance;
            jVar.getClass();
            C62971cq cqVar = bVar.f46410e;
            if (!cqVar.mo58948c()) {
                bVar.f46410e = C62942bv.mutableCopy(cqVar);
            }
            bVar.f46410e.add(jVar);
        }
        Optional optional = vVar.f40102c.f40084h;
        if (optional.isPresent()) {
            String str = (String) optional.get();
            aVar.copyOnWrite();
            C15474b bVar2 = (C15474b) aVar.instance;
            str.getClass();
            bVar2.f46406a |= 4;
            bVar2.f46411f = str;
        }
        vVar.f40106g.mo22353c(C37179a.f97528bu.mo40779c(), Optional.m71637of((C15474b) aVar.build()));
        return null;
    }
}
