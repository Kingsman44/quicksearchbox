package com.google.frameworks.client.data.android.server.p4646a.p4647a;

import com.google.common.p4522b.C58485gu;
import com.google.p4238bo.p4239a.p4240a.p4241a.C56125i;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;
import p5488io.grpc.C70297cz;
import p5488io.grpc.C70334de;

/* renamed from: com.google.frameworks.client.data.android.server.a.a.f */
/* compiled from: PG */
final class C61542f extends C69665o implements C69630p {

    /* renamed from: a */
    public static final C61542f f166339a = new C61542f();

    public C61542f() {
        super(2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        C58485gu guVar;
        C56125i iVar = (C56125i) obj;
        C70297cz czVar = (C70297cz) obj2;
        C69664n.m101061g(iVar, "$this$metadata");
        C69664n.m101061g(czVar, "it");
        czVar.getClass();
        C70334de deVar = iVar.f149529c;
        if (deVar == null) {
            guVar = C58485gu.m89845m();
        } else {
            synchronized (deVar) {
                Iterable a = iVar.f149529c.mo62026a(czVar);
                if (a == null) {
                    guVar = C58485gu.m89845m();
                } else {
                    guVar = C58485gu.m89841i(a);
                }
            }
        }
        C69664n.m101060f(guVar, "headers(it)");
        return guVar;
    }
}
