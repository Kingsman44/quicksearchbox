package com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8211b;

import com.google.android.apps.gsa.staticplugins.opa.ambient.p8229c.p8230a.C106601a;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8264h.p8273g.C107078r;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.b.b.o */
/* compiled from: PG */
public final /* synthetic */ class C106509o implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C106511q f297031a;

    public /* synthetic */ C106509o(C106511q qVar) {
        this.f297031a = qVar;
    }

    public final void accept(Object obj) {
        C106511q qVar = this.f297031a;
        C106510p pVar = (C106510p) obj;
        String d = pVar.f297033b.mo95551d();
        C107078r rVar = pVar.f297034c;
        int b = rVar.mo95752b();
        if (b != 0) {
            if (b == 2) {
                ((C58970a) ((C58970a) ((C58970a) qVar.f297035a.mo56226d()).mo56382g(rVar.mo95751a())).mo56372aa(23101)).mo56389s("%s failed", d);
                C106601a aVar = qVar.f297044j;
                Object[] objArr = {d};
                if (aVar.f297233b) {
                    String.format("%s failed", objArr);
                    aVar.mo95589c(1);
                }
                qVar.f297044j.mo95587a(4, "%s failed\n%s", d, pVar.f297034c.mo95751a());
            }
            if (pVar.f297034c.mo95774d()) {
                String a = pVar.f297033b.mo95548a().mo95553a(pVar.f297034c.mo95756c());
                qVar.f297044j.mo95588b(4, "%s: %s", d, a);
                return;
            }
            return;
        }
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
