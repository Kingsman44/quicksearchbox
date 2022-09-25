package com.google.android.libraries.geller.p1818f;

import com.google.android.libraries.geller.p1814b.C21758b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.protos.p5129p.p5131b.C65743aa;
import com.google.protos.p5129p.p5131b.C65744ab;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65819cw;
import com.google.protos.p5129p.p5131b.C65855x;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.libraries.geller.f.az */
/* compiled from: PG */
public final /* synthetic */ class C21816az implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C21826bi f60187a;

    /* renamed from: b */
    public final /* synthetic */ C65744ab f60188b;

    /* renamed from: c */
    public final /* synthetic */ Map f60189c;

    /* renamed from: d */
    public final /* synthetic */ Map f60190d;

    /* renamed from: e */
    public final /* synthetic */ Map f60191e;

    /* renamed from: f */
    public final /* synthetic */ C21876z f60192f;

    /* renamed from: g */
    public final /* synthetic */ C21758b f60193g;

    /* renamed from: h */
    public final /* synthetic */ Map f60194h;

    /* renamed from: i */
    public final /* synthetic */ int f60195i;

    public /* synthetic */ C21816az(C21826bi biVar, C65744ab abVar, Map map, Map map2, Map map3, C21876z zVar, C21758b bVar, int i, Map map4) {
        this.f60187a = biVar;
        this.f60188b = abVar;
        this.f60189c = map;
        this.f60190d = map2;
        this.f60191e = map3;
        this.f60192f = zVar;
        this.f60193g = bVar;
        this.f60195i = i;
        this.f60194h = map4;
    }

    public final C60870cx apply(Object obj) {
        List list;
        C65819cw cwVar;
        List list2;
        C65819cw cwVar2;
        C21826bi biVar = this.f60187a;
        C65744ab abVar = this.f60188b;
        Map map = this.f60189c;
        Map map2 = this.f60190d;
        Map map3 = this.f60191e;
        C21876z zVar = this.f60192f;
        C21758b bVar = this.f60193g;
        int i = this.f60195i;
        Map map4 = this.f60194h;
        C65855x xVar = (C65855x) obj;
        for (C65743aa aaVar : abVar.f178607a) {
            Map map5 = biVar.f60228l;
            C65753ak b = C65753ak.m96797b(aaVar.f178601c);
            if (b == null) {
                b = C65753ak.UNKNOWN;
            }
            if (map5.containsKey(b)) {
                C65753ak b2 = C65753ak.m96797b(aaVar.f178601c);
                if (b2 == null) {
                    b2 = C65753ak.UNKNOWN;
                }
                if (aaVar.f178599a == 1) {
                    map.remove(b2);
                } else {
                    if (map.containsKey(b2)) {
                        list = (List) map.get(b2);
                    } else {
                        list = new ArrayList();
                    }
                    if (aaVar.f178599a == 2) {
                        cwVar = (C65819cw) aaVar.f178600b;
                    } else {
                        cwVar = C65819cw.f178926i;
                    }
                    list.addAll(cwVar.f178932e);
                    map.put(b2, list);
                    if (map2.containsKey(b2)) {
                        list2 = (List) map2.get(b2);
                    } else {
                        list2 = new ArrayList();
                    }
                    if (aaVar.f178599a == 2) {
                        cwVar2 = (C65819cw) aaVar.f178600b;
                    } else {
                        cwVar2 = C65819cw.f178926i;
                    }
                    list2.addAll(cwVar2.f178933f);
                    map2.put(b2, list2);
                }
            }
        }
        if (xVar.f179023b.size() == 0) {
            return C60856cj.m92900i(map3);
        }
        return C60922j.m93044g(biVar.mo27129c(zVar, bVar, i, xVar, map, map2, map4), C47810es.m84963c(new C21823bf(map3)), biVar.f60224h);
    }
}
