package com.google.android.libraries.geller.p1818f;

import com.google.android.libraries.geller.portable.C21952d;
import com.google.android.libraries.geller.portable.Geller;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65139d;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65768az;
import com.google.protos.p5129p.p5131b.C65854w;
import com.google.protos.p5129p.p5131b.C65855x;
import java.util.ArrayList;
import java.util.Map;
import p5488io.grpc.Status;

/* renamed from: com.google.android.libraries.geller.f.w */
/* compiled from: PG */
public final /* synthetic */ class C21873w implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C21875y f60354a;

    /* renamed from: b */
    public final /* synthetic */ Map f60355b;

    public /* synthetic */ C21873w(C21875y yVar, Map map) {
        this.f60354a = yVar;
        this.f60355b = map;
    }

    public final C60870cx apply(Object obj) {
        C21875y yVar = this.f60354a;
        Map map = this.f60355b;
        Void voidR = (Void) obj;
        if (map.isEmpty()) {
            return C60866ct.f164955a;
        }
        yVar.f60362f.mo27221e(map, yVar.f60359c.mo27115a());
        C65855x a = yVar.f60359c.mo27115a();
        ArrayList arrayList = new ArrayList();
        for (C65854w wVar : a.f179023b) {
            C65753ak b = C65753ak.m96797b(wVar.f179014b);
            if (b == null) {
                b = C65753ak.UNKNOWN;
            }
            if (map.containsKey(b) && ((Status) map.get(b)).mo61679g()) {
                ArrayList arrayList2 = new ArrayList();
                for (C65768az azVar : wVar.f179018f) {
                    Geller geller = yVar.f60361e;
                    String str = yVar.f60363g;
                    C65753ak b2 = C65753ak.m96797b(wVar.f179014b);
                    if (b2 == null) {
                        b2 = C65753ak.UNKNOWN;
                    }
                    String str2 = azVar.f178798d;
                    C65139d dVar = azVar.f178796b;
                    if (dVar == null) {
                        dVar = C65139d.f176307e;
                    }
                    arrayList2.add(C60922j.m93044g(geller.mo27180g(str, b2, C58485gu.m89846n(C21952d.m41118c(str2, dVar.f176310b)), false), C47810es.m84963c(new C21864n(yVar, azVar, wVar)), yVar.f60364h));
                }
                arrayList.add(C60846c.m92878g(C60922j.m93044g(C60922j.m93044g(C60838bs.m92859i(C60922j.m93044g(C60838bs.m92859i(C60856cj.m92906o(arrayList2)), C47810es.m84963c(new C21865o(yVar, b)), yVar.f60364h)), C47810es.m84963c(new C21868r(yVar, b, wVar)), yVar.f60364h), C47810es.m84963c(new C21869s(yVar, b)), yVar.f60365i), Exception.class, C47810es.m84963c(new C21870t(yVar, b)), yVar.f60365i));
            }
        }
        return C60856cj.m92892a(arrayList).mo57334a(C47810es.m84978r(C21871u.f60353a), yVar.f60365i);
    }
}
