package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8260d;

import android.accounts.Account;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.smartspace.p7259c.C92094j;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106596h;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.C106864c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.d.x */
/* compiled from: PG */
public final /* synthetic */ class C107013x implements Function {

    /* renamed from: a */
    public final /* synthetic */ C106989ao f298031a;

    /* renamed from: b */
    public final /* synthetic */ C106596h f298032b;

    public /* synthetic */ C107013x(C106989ao aoVar, C106596h hVar) {
        this.f298031a = aoVar;
        this.f298032b = hVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Account a;
        C106989ao aoVar = this.f298031a;
        C106596h hVar = this.f298032b;
        Map.Entry entry = (Map.Entry) obj;
        C106864c cVar = (C106864c) entry.getValue();
        C92094j a2 = C92094j.m151126a(((Integer) entry.getKey()).intValue());
        if (!aoVar.f297980c.mo79746e(C90017bw.f247906aU) || (a = aoVar.f297982e.a()) == null) {
            return aoVar.mo95726b(cVar, a2, hVar);
        }
        C60870cx a3 = aoVar.f297981d.mo17952a(a);
        C107011v vVar = new C107011v(aoVar, cVar, a2, hVar);
        return C60922j.m93045h(a3, C47810es.m84966f(vVar), aoVar.f297983f);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
