package com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1177c.p1178a;

import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.C15785a;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1185e.C15838a;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.MessageLite;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.b.c.a.o */
/* compiled from: PG */
public final class C15829o {

    /* renamed from: a */
    final /* synthetic */ C15838a f47059a;

    /* renamed from: b */
    final /* synthetic */ C15830p f47060b;

    public C15829o(C15830p pVar, C15838a aVar) {
        this.f47060b = pVar;
        this.f47059a = aVar;
    }

    /* renamed from: a */
    public final C58833ax mo22578a() {
        return this.f47060b.f47062b.mo22575b(this.f47059a.mo22584a());
    }

    /* renamed from: b */
    public final void mo22579b(MessageLite messageLite) {
        C15830p pVar = this.f47060b;
        C15785a a = this.f47059a.mo22584a();
        C58833ax a2 = C15815a.m32602a(pVar.f47062b.f47041a.put(a, messageLite));
        if (!a2.mo56113h() || !((MessageLite) a2.mo56107c()).equals(messageLite)) {
            pVar.mo22581d(a, a2, messageLite);
            C58485gu guVar = (C58485gu) Collection.EL.stream(pVar.f47063c.mo54902c(a)).map(new C15826l(pVar)).map(C15827m.f47055a).collect(C58370cn.f155946a);
        }
    }
}
