package com.google.android.libraries.assistant.pcp.p1573k.p1574a;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.libraries.assistant.pcp.p1573k.C18921aj;
import com.google.android.libraries.assistant.pcp.p1573k.C18926f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.protos.p5124m.p5125a.C65599b;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.pcp.k.a.h */
/* compiled from: PG */
public final class C18893h implements C18926f {

    /* renamed from: a */
    public final C69464a f53173a;

    /* renamed from: b */
    private final Context f53174b;

    /* renamed from: c */
    private final C60887da f53175c;

    /* renamed from: d */
    private final C18921aj f53176d;

    /* renamed from: e */
    private final C69464a f53177e;

    public C18893h(Context context, C60887da daVar, C18921aj ajVar, C69464a aVar, C69464a aVar2) {
        this.f53174b = context;
        this.f53176d = ajVar;
        this.f53175c = daVar;
        this.f53177e = aVar;
        this.f53173a = aVar2;
    }

    /* renamed from: a */
    public final C60870cx mo24216a(List list, C53306j jVar) {
        C60870cx cxVar;
        if (!((C65599b) this.f53177e.mo17428b()).f178301a.contains(Integer.valueOf(jVar.f139793X))) {
            return C60856cj.m92900i(Optional.empty());
        }
        C58485gu guVar = (C58485gu) Collection.EL.stream(list).filter(new C18891f(this)).collect(C58370cn.f155946a);
        if (guVar.isEmpty()) {
            cxVar = C60856cj.m92900i(Optional.empty());
        } else {
            ComponentName componentName = (ComponentName) guVar.get(0);
            if (!componentName.getPackageName().equals("com.google.android.apps.youtube.music")) {
                cxVar = C60856cj.m92900i(Optional.m71637of(componentName));
            } else {
                C60870cx a = this.f53176d.mo24222a(this.f53174b, jVar);
                C18892g gVar = new C18892g(componentName, guVar);
                cxVar = C60922j.m93044g(a, C47810es.m84963c(gVar), this.f53175c);
            }
        }
        C18881d dVar = C18881d.f53152a;
        return C60922j.m93044g(cxVar, C47810es.m84963c(dVar), this.f53175c);
    }
}
