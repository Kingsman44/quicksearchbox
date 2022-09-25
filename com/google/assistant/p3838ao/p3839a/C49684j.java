package com.google.assistant.p3838ao.p3839a;

import com.google.assistant.p3838ao.p3839a.p3845e.C49577cg;
import com.google.assistant.p3838ao.p3839a.p3845e.C49626q;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.function.Function;

/* renamed from: com.google.assistant.ao.a.j */
/* compiled from: PG */
public final /* synthetic */ class C49684j implements Function {

    /* renamed from: a */
    public final /* synthetic */ C49689o f128243a;

    /* renamed from: b */
    public final /* synthetic */ C49692r f128244b;

    public /* synthetic */ C49684j(C49689o oVar, C49692r rVar) {
        this.f128243a = oVar;
        this.f128244b = rVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C49626q qVar;
        C49626q qVar2;
        C49689o oVar = this.f128243a;
        C49692r rVar = this.f128244b;
        String str = (String) obj;
        C49577cg cgVar = (C49577cg) oVar.f128253d.mo53324a(str);
        int i = 0;
        if (cgVar == null) {
            ((C58970a) ((C58970a) C49689o.f128250a.mo56226d()).mo56372aa(54809)).mo56389s("Predefined condition not found: %s", str);
            return false;
        }
        int i2 = cgVar.f127924a;
        boolean z = true;
        if (i2 == 0) {
            i = 3;
        } else if (i2 == 2) {
            i = 1;
        } else if (i2 == 3) {
            i = 2;
        }
        int i3 = i - 1;
        if (i != 0) {
            if (i3 == 0) {
                if (i2 == 2) {
                    qVar = (C49626q) cgVar.f127925b;
                } else {
                    qVar = C49626q.f128069h;
                }
                z = oVar.mo53326b(rVar, qVar, 1);
            } else if (i3 == 1) {
                if (i2 == 3) {
                    qVar2 = (C49626q) cgVar.f127925b;
                } else {
                    qVar2 = C49626q.f128069h;
                }
                z = oVar.mo53326b(rVar, qVar2, 2);
            }
            return Boolean.valueOf(z);
        }
        throw null;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
