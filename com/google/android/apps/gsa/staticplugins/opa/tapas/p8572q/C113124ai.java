package com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q;

import com.google.common.p4523c.C58929d;
import com.google.common.p4523c.C58943r;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.q.ai */
/* compiled from: PG */
public final /* synthetic */ class C113124ai implements Function {

    /* renamed from: a */
    public final /* synthetic */ String f313425a;

    public /* synthetic */ C113124ai(String str) {
        this.f313425a = str;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        double d;
        String str = this.f313425a;
        String str2 = (String) obj;
        double d2 = 1.0d;
        if (!(str == null || str2 == null)) {
            if (str.startsWith(str2) || str2.startsWith(str)) {
                d = (double) (Math.abs(str2.length() - str.length()) + 1);
            } else {
                d = 1.0d;
            }
            if (Math.abs(d) > 9.999999974752427E-7d) {
                C58943r a = C58929d.f156772a.mo56208a(str);
                d2 = a.f156787b.mo56203b(a.f156786a.mo56201b(str2)) / d;
            }
        }
        return Double.valueOf(d2);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
