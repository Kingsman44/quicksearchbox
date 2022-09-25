package com.google.android.libraries.assistant.pcp.p1541b;

import com.google.android.libraries.assistant.pcp.p1546d.C18575c;
import com.google.android.libraries.assistant.pcp.p1555f.C18677a;
import com.google.android.libraries.assistant.pcp.p1555f.p1556a.C18696s;
import com.google.android.libraries.assistant.pcp.p1555f.p1556a.C18700w;
import com.google.android.libraries.assistant.pcp.p1557g.C18718c;
import com.google.android.libraries.assistant.pcp.p1578m.C18995y;
import com.google.android.libraries.assistant.pcp.p1583o.C19041r;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3803ag.p3809c.C49019dl;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58759qy;
import com.google.common.util.concurrent.C60856cj;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.pcp.b.e */
/* compiled from: PG */
public final /* synthetic */ class C18534e implements Function {

    /* renamed from: a */
    public final /* synthetic */ C18551v f52517a;

    /* renamed from: b */
    public final /* synthetic */ C53306j f52518b;

    /* renamed from: c */
    public final /* synthetic */ C18718c f52519c;

    /* renamed from: d */
    public final /* synthetic */ int f52520d;

    public /* synthetic */ C18534e(C18551v vVar, C53306j jVar, int i, C18718c cVar) {
        this.f52517a = vVar;
        this.f52518b = jVar;
        this.f52520d = i;
        this.f52519c = cVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C18551v vVar = this.f52517a;
        C53306j jVar = this.f52518b;
        int i = this.f52520d;
        C18718c cVar = this.f52519c;
        C18995y yVar = (C18995y) obj;
        C49019dl dlVar = yVar.f53369b;
        if (dlVar == null) {
            dlVar = C49019dl.f126792f;
        }
        int i2 = i - 1;
        if (i != 0) {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new AssertionError();
                        }
                    }
                }
                if (!C19041r.m36462e(dlVar, jVar)) {
                    C18677a aVar = vVar.f52558b;
                    C49019dl dlVar2 = yVar.f53369b;
                    if (dlVar2 == null) {
                        dlVar2 = C49019dl.f126792f;
                    }
                    C49019dl dlVar3 = dlVar2;
                    Optional of = Optional.m71637of(jVar);
                    C18575c cVar2 = new C18575c(dlVar3.f126795b);
                    C18700w wVar = (C18700w) aVar;
                    return C47633f.m84733g(wVar.f52762c.mo24052a(new C58759qy(cVar2))).mo51516i(new C18696s(wVar, dlVar3, cVar2, of, cVar), wVar.f52764e);
                }
            }
            return C60856cj.m92900i(yVar);
        }
        throw null;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
