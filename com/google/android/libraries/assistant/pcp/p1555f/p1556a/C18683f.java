package com.google.android.libraries.assistant.pcp.p1555f.p1556a;

import com.google.android.libraries.assistant.pcp.p1546d.C18575c;
import com.google.android.libraries.assistant.pcp.p1583o.C19026c;
import com.google.assistant.p3803ag.p3809c.C49019dl;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58733pz;
import java.util.Set;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.pcp.f.a.f */
/* compiled from: PG */
public final /* synthetic */ class C18683f implements Function {

    /* renamed from: a */
    public final /* synthetic */ C18700w f52718a;

    /* renamed from: b */
    public final /* synthetic */ C58495hd f52719b;

    /* renamed from: c */
    public final /* synthetic */ Optional f52720c;

    public /* synthetic */ C18683f(C18700w wVar, C58495hd hdVar, Optional optional) {
        this.f52718a = wVar;
        this.f52719b = hdVar;
        this.f52720c = optional;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C18700w wVar = this.f52718a;
        C58495hd hdVar = this.f52719b;
        C49019dl dlVar = (C49019dl) obj;
        return wVar.f52761b.mo24133a(dlVar, C19026c.m36454a((Set) hdVar.getOrDefault(new C18575c(dlVar.f126795b), C58733pz.f156496a)), this.f52720c);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
