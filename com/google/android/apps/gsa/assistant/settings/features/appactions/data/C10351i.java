package com.google.android.apps.gsa.assistant.settings.features.appactions.data;

import com.google.assistant.p3861at.C49826ak;
import com.google.assistant.p3861at.C49838aw;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.data.i */
/* compiled from: PG */
public final /* synthetic */ class C10351i implements Function {

    /* renamed from: a */
    public final /* synthetic */ String f35033a;

    /* renamed from: b */
    public final /* synthetic */ C49826ak f35034b;

    /* renamed from: c */
    public final /* synthetic */ long f35035c;

    public /* synthetic */ C10351i(String str, C49826ak akVar, long j) {
        this.f35033a = str;
        this.f35034b = akVar;
        this.f35035c = j;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String str = this.f35033a;
        C49826ak akVar = this.f35034b;
        long j = this.f35035c;
        C10339az azVar = (C10339az) obj;
        if (!str.equals(azVar.mo18432b().f129507b)) {
            return azVar;
        }
        C49838aw b = azVar.mo18432b();
        C58485gu d = azVar.mo18434d();
        C58480gp e = C58485gu.m89837e();
        int size = d.size();
        for (int i = 0; i < size; i++) {
            C10342bb bbVar = (C10342bb) d.get(i);
            if (j != bbVar.mo18442a()) {
                e.mo55395g(bbVar);
            } else if (akVar.f129465b.size() > 0 || (akVar.f129464a & 32) != 0) {
                e.mo55395g(new C10337ax(j, akVar));
            }
        }
        return C10339az.m25295e(b, e.mo55394f(), azVar.mo18433c());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
