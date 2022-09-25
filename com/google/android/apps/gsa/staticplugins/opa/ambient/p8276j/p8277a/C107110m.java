package com.google.android.apps.gsa.staticplugins.opa.ambient.p8276j.p8277a;

import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80905at;
import com.google.android.apps.gsa.opa.smartspace.C83739ak;
import com.google.android.apps.gsa.opa.smartspace.p6456e.C83785c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3886c.C50794cr;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.Objects;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.j.a.m */
/* compiled from: PG */
public final /* synthetic */ class C107110m implements Function {

    /* renamed from: a */
    public final /* synthetic */ C107115r f298182a;

    public /* synthetic */ C107110m(C107115r rVar) {
        this.f298182a = rVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C107115r rVar = this.f298182a;
        C83739ak akVar = (C83739ak) obj;
        C58528ij ijVar = C107115r.f298187a;
        C50794cr a = C50794cr.m85938a(akVar.f228239h);
        if (a == null) {
            a = C50794cr.UNDEFINED;
        }
        if (!ijVar.contains(a)) {
            Object[] objArr = new Object[1];
            C50794cr a2 = C50794cr.m85938a(akVar.f228239h);
            if (a2 == null) {
                a2 = C50794cr.UNDEFINED;
            }
            objArr[0] = a2.name();
            throw new IllegalArgumentException(String.format("Card of type %s not in the allowlist", objArr));
        }
        C58970a aVar = (C58970a) ((C58970a) rVar.f298188b.mo56224b()).mo56372aa(23495);
        C50794cr a3 = C50794cr.m85938a(akVar.f228239h);
        if (a3 == null) {
            a3 = C50794cr.UNDEFINED;
        }
        aVar.mo56389s("Sending card of type %s", a3.name());
        String str = akVar.f228234c;
        C50794cr a4 = C50794cr.m85938a(akVar.f228239h);
        if (a4 == null) {
            a4 = C50794cr.UNDEFINED;
        }
        a4.name();
        C60870cx d = rVar.f298191e.mo98939d(akVar);
        C83785c cVar = rVar.f298190d;
        Objects.requireNonNull(cVar);
        C107114q qVar = new C107114q(cVar);
        C60870cx h = C60922j.m93045h(d, C47810es.m84966f(qVar), rVar.f298189c);
        C80905at.m128763g(h, new C107102e(rVar, akVar));
        return h;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
