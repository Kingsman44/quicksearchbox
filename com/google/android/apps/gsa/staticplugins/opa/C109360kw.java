package com.google.android.apps.gsa.staticplugins.opa;

import android.content.Context;
import com.google.android.apps.gsa.assistant.shared.C73841bf;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68226l;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.kw */
/* compiled from: PG */
public final class C109360kw {

    /* renamed from: a */
    public static final C58528ij f304635a = C58528ij.m90011K(2, 3);

    /* renamed from: b */
    public final C68214a f304636b;

    /* renamed from: c */
    public final C109351kn f304637c;

    /* renamed from: d */
    private final C68214a f304638d;

    /* renamed from: e */
    private final C68214a f304639e;

    public C109360kw(C109430lc lcVar, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4) {
        this.f304638d = aVar;
        this.f304639e = aVar2;
        this.f304636b = aVar3;
        C109352ko koVar = (C109352ko) aVar4.mo27525b();
        Context context = (Context) koVar.f304625a.mo17428b();
        context.getClass();
        C68214a a = C68219e.m98518a(((C68226l) koVar.f304626b).f184585a);
        a.getClass();
        C68214a a2 = C68219e.m98518a(((C68226l) koVar.f304627c).f184585a);
        a2.getClass();
        C68214a a3 = C68219e.m98518a(((C68226l) koVar.f304628d).f184585a);
        a3.getClass();
        Boolean bool = (Boolean) koVar.f304629e.mo17428b();
        bool.getClass();
        boolean booleanValue = bool.booleanValue();
        C68214a a4 = C68219e.m98518a(((C68226l) koVar.f304630f).f184585a);
        a4.getClass();
        this.f304637c = new C109351kn(lcVar, context, a, a2, a3, booleanValue, a4);
    }

    /* renamed from: a */
    public final C58485gu mo97800a(int i, C109354kq kqVar) {
        return C58485gu.m89846n(C109355kr.m182051e(((C73841bf) this.f304639e.mo27525b()).mo65322a().getString(i)).mo97799g(kqVar));
    }

    /* renamed from: b */
    public final C58485gu mo97801b(int i, Function function, C109354kq kqVar) {
        C58480gp e = C58485gu.m89837e();
        e.mo55396h(mo97800a(i, kqVar));
        e.mo55395g((C109355kr) function.apply(kqVar));
        return e.mo55394f();
    }

    /* renamed from: c */
    public final C58485gu mo97802c(int i, int i2, Function function, C109354kq kqVar) {
        if (true == ((C89037bh) this.f304638d.mo27525b()).mo27386l()) {
            i = i2;
        }
        return mo97801b(i, function, kqVar);
    }
}
