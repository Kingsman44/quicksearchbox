package com.google.android.libraries.assistant.pcp.p1557g.p1561c.p1562a;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.libraries.assistant.pcp.p1557g.C18718c;
import com.google.android.libraries.assistant.pcp.p1557g.C18769h;
import com.google.android.libraries.assistant.pcp.p1557g.p1560b.C18711c;
import com.google.android.libraries.assistant.pcp.p1557g.p1560b.C18713e;
import com.google.android.libraries.assistant.pcp.p1557g.p1560b.C18717i;
import com.google.android.libraries.assistant.pcp.p1573k.C18921aj;
import com.google.android.libraries.assistant.pcp.p1573k.C18927g;
import com.google.android.libraries.assistant.pcp.p1573k.C18932l;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.libraries.assistant.pcp.g.c.a.ah */
/* compiled from: PG */
public final class C18727ah implements C18769h {

    /* renamed from: a */
    public static final C59071e f52807a = C59071e.m91332i("com.google.android.libraries.assistant.pcp.g.c.a.ah");

    /* renamed from: b */
    public final Context f52808b;

    /* renamed from: c */
    public final Map f52809c;

    /* renamed from: d */
    public final C18932l f52810d;

    /* renamed from: e */
    public final C60887da f52811e;

    /* renamed from: f */
    public final C18927g f52812f;

    /* renamed from: g */
    public final C18921aj f52813g;

    /* renamed from: h */
    private final C60887da f52814h;

    public C18727ah(Context context, Map map, C18932l lVar, C18927g gVar, C18921aj ajVar, C60887da daVar, C60887da daVar2) {
        this.f52808b = context;
        this.f52809c = map;
        this.f52810d = lVar;
        this.f52812f = gVar;
        this.f52813g = ajVar;
        this.f52814h = daVar;
        this.f52811e = daVar2;
    }

    /* renamed from: c */
    public static void m36142c(List list, C58528ij ijVar, LinkedHashSet linkedHashSet) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ComponentName componentName = (ComponentName) it.next();
            if (ijVar.contains(componentName.getPackageName())) {
                linkedHashSet.add(componentName);
            }
        }
    }

    /* renamed from: a */
    public final C18713e mo21204a() {
        return C18711c.f52784d;
    }

    /* renamed from: b */
    public final C60870cx mo21205b(C18718c cVar) {
        C60870cx a = cVar.mo24114a(C18711c.f52781a);
        C18724ae aeVar = new C18724ae(this);
        C60870cx g = C60922j.m93044g(a, C47810es.m84963c(aeVar), this.f52811e);
        C47633f h = C47633f.m84733g(cVar.mo24114a(C18717i.f52795a)).mo51516i(new C18747u(this), this.f52811e).mo51515h(new C18748v(this), this.f52811e);
        C18725af afVar = C18725af.f52805a;
        return C47633f.m84733g(C60856cj.m92907p(g, C60922j.m93044g(h, C47810es.m84963c(afVar), this.f52811e))).mo51515h(new C18726ag(this), this.f52814h).mo51516i(new C18744r(this, cVar), this.f52811e).mo51513e(Throwable.class, C18745s.f52851a, this.f52811e);
    }
}
