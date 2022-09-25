package com.google.android.apps.gsa.staticplugins.p8019j;

import com.google.android.apps.search.assistant.verticals.p9880a.p9883b.C130328c;
import com.google.android.apps.search.assistant.verticals.p9880a.p9883b.C130329d;
import com.google.assistant.p3897e.p3921j.C51694av;
import com.google.assistant.p3897e.p3921j.C51695aw;
import com.google.assistant.p3897e.p3921j.C51771cx;
import com.google.assistant.p3897e.p3921j.C51772cy;
import com.google.protobuf.C62995dn;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.j.x */
/* compiled from: PG */
public final /* synthetic */ class C102601x implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ C51771cx f286361a;

    public /* synthetic */ C102601x(C51771cx cxVar) {
        this.f286361a = cxVar;
    }

    public final void accept(Object obj, Object obj2) {
        C51771cx cxVar = this.f286361a;
        String str = (String) obj;
        int a = C130328c.m212774a(((C130329d) obj2).f357227b);
        if (a != 0 && a == 3) {
            C51694av avVar = (C51694av) C51695aw.f135619c.createBuilder();
            avVar.copyOnWrite();
            C51695aw awVar = (C51695aw) avVar.instance;
            awVar.f135622b = 1;
            awVar.f135621a = 1 | awVar.f135621a;
            C51695aw awVar2 = (C51695aw) avVar.build();
            str.getClass();
            awVar2.getClass();
            cxVar.copyOnWrite();
            C51772cy cyVar = (C51772cy) cxVar.instance;
            C51772cy cyVar2 = C51772cy.f135824p;
            C62995dn dnVar = cyVar.f135839n;
            if (!dnVar.f170058b) {
                cyVar.f135839n = dnVar.mo58980a();
            }
            cyVar.f135839n.put(str, awVar2);
        }
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
