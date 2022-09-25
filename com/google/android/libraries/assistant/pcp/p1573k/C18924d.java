package com.google.android.libraries.assistant.pcp.p1573k;

import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.nlp.p4739c.p4740a.C62844a;
import com.google.nlp.p4739c.p4740a.C62845b;
import com.google.nlp.p4739c.p4740a.C62846c;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.pcp.k.d */
/* compiled from: PG */
public final /* synthetic */ class C18924d implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C18924d f53224a = new C18924d();

    private /* synthetic */ C18924d() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C61752n nVar = (C61752n) obj;
        boolean z = false;
        if (nVar.f166811b.equals("Play_media") && nVar.f166812c.size() == 2 && !Collection.EL.stream(nVar.f166812c).filter(C62844a.f169720a).findAny().isEmpty()) {
            z = ((Boolean) Collection.EL.stream(nVar.f166812c).filter(C62845b.f169721a).findFirst().map(C62846c.f169722a).orElse(false)).booleanValue();
        }
        return Boolean.valueOf(z);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
