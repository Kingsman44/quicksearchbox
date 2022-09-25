package com.google.android.libraries.assistant.pcp.p1544c.p1545a;

import com.google.android.libraries.assistant.pcp.C18947l;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.libraries.assistant.pcp.c.a.o */
/* compiled from: PG */
public final /* synthetic */ class C18568o implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ C18571r f52582a;

    /* renamed from: b */
    public final /* synthetic */ List f52583b;

    /* renamed from: c */
    public final /* synthetic */ List f52584c;

    public /* synthetic */ C18568o(C18571r rVar, List list, List list2) {
        this.f52582a = rVar;
        this.f52583b = list;
        this.f52584c = list2;
    }

    public final void accept(Object obj, Object obj2) {
        C60870cx cxVar;
        C18571r rVar = this.f52582a;
        List list = this.f52583b;
        List list2 = this.f52584c;
        C53306j jVar = (C53306j) obj;
        list.add(jVar);
        C58528ij a = ((C18947l) obj2).mo24056a();
        if (a.isEmpty()) {
            cxVar = rVar.f52589b.mo24093a(jVar);
        } else {
            cxVar = C60856cj.m92900i(a);
        }
        list2.add(cxVar);
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
