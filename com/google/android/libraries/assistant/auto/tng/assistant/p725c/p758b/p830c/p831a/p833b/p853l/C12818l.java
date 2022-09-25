package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p853l;

import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.C16626a;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16349aw;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.l.l */
/* compiled from: PG */
public final /* synthetic */ class C12818l implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ int f40026a;

    public /* synthetic */ C12818l(int i) {
        this.f40026a = i;
    }

    public final Object apply(Object obj) {
        int i = this.f40026a;
        C16349aw awVar = (C16349aw) obj;
        C59071e eVar = C12830x.f40040a;
        awVar.f48129b.size();
        C58485gu guVar = (C58485gu) Collection.EL.stream(awVar.f48129b).filter(new C12828v(i)).filter(C12829w.f40039a).collect(C58370cn.f155946a);
        if (guVar.isEmpty()) {
            return new C16626a().mo22941a();
        }
        C16626a aVar = new C16626a();
        aVar.f48716b = Optional.m71637of(guVar);
        return aVar.mo22941a();
    }
}
