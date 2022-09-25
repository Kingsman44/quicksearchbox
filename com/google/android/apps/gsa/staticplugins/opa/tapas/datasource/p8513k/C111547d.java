package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8513k;

import com.google.android.apps.gsa.assistant.shared.l.x;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113414ey;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113303a;
import com.google.assistant.p3781ad.p3789d.C48580an;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.k.d */
/* compiled from: PG */
public final /* synthetic */ class C111547d implements Function {

    /* renamed from: a */
    public final /* synthetic */ C111550g f310249a;

    public /* synthetic */ C111547d(C111550g gVar) {
        this.f310249a = gVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C111550g gVar = this.f310249a;
        x xVar = (x) obj;
        Optional.empty();
        String str = xVar.b;
        if (str != null) {
            String str2 = xVar.f;
            if (str2 != null) {
                String str3 = xVar.d;
                if (str3 != null) {
                    String str4 = xVar.c;
                    if (str4 != null) {
                        Optional of = Optional.m71637of(xVar.h);
                        String str5 = xVar.i;
                        if (str5 != null) {
                            String str6 = xVar.j;
                            if (str6 != null) {
                                C113303a aVar = new C113303a(str, str2, str6, str3, str4, of, str5);
                                C113414ey q = gVar.mo100187q();
                                q.mo100180y(20001);
                                q.mo100177v(C48580an.ACTIVE_MESSAGE);
                                q.mo100167l(20001);
                                q.mo100157b(aVar);
                                q.mo100174s(1.0d);
                                return q.mo100156a();
                            }
                            throw new NullPointerException("Null lastNotificationMessage");
                        }
                        throw new NullPointerException("Null lastNotificationKey");
                    }
                    throw new NullPointerException("Null packageName");
                }
                throw new NullPointerException("Null appName");
            }
            throw new NullPointerException("Null concatenatedMessage");
        }
        throw new NullPointerException("Null lastSenderName");
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
