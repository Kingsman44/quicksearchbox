package com.google.android.libraries.assistant.pcp.p1555f.p1556a;

import com.google.android.libraries.assistant.pcp.p1546d.C18575c;
import com.google.android.libraries.assistant.pcp.p1557g.C18718c;
import com.google.assistant.p3803ag.p3809c.C49019dl;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58733pz;
import java.util.Set;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.pcp.f.a.b */
/* compiled from: PG */
public final /* synthetic */ class C18679b implements Function {

    /* renamed from: a */
    public final /* synthetic */ C18700w f52712a;

    /* renamed from: b */
    public final /* synthetic */ C58495hd f52713b;

    /* renamed from: c */
    public final /* synthetic */ C18718c f52714c;

    public /* synthetic */ C18679b(C18700w wVar, C58495hd hdVar, C18718c cVar) {
        this.f52712a = wVar;
        this.f52713b = hdVar;
        this.f52714c = cVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C18700w wVar = this.f52712a;
        C58495hd hdVar = this.f52713b;
        C49019dl dlVar = (C49019dl) obj;
        return wVar.mo24112e(dlVar, (Set) hdVar.getOrDefault(new C18575c(dlVar.f126795b), C58733pz.f156496a), this.f52714c);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
