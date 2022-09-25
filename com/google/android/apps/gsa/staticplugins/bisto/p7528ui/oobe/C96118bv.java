package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.os.Bundle;
import com.google.android.apps.gsa.opaonboarding.C83869ac;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.C83956t;
import com.google.common.p4522b.C58480gp;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.bv */
/* compiled from: PG */
public final class C96118bv extends C83869ac {

    /* renamed from: a */
    private final List f269098a;

    public C96118bv(C96325jm jmVar) {
        this.f269098a = jmVar.f269538a.mo89959j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C83956t mo77207a() {
        C58480gp gpVar = new C58480gp(4);
        for (C96095az azVar : this.f269098a) {
            C96117bu buVar = new C96117bu();
            Bundle bundle = new Bundle();
            bundle.putString("title", azVar.f269040a);
            bundle.putString("url", azVar.f269041b);
            bundle.putString("url_description", azVar.f269042c);
            bundle.putString("message", azVar.f269043d);
            gpVar.mo55395g(C83875ai.m133540e(buVar, bundle));
        }
        return C83875ai.m133538c(gpVar.mo55394f());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo77208b() {
        return !this.f269098a.isEmpty();
    }
}
