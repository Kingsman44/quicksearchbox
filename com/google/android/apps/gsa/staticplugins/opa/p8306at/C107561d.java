package com.google.android.apps.gsa.staticplugins.opa.p8306at;

import android.text.TextUtils;
import androidx.core.app.C1832s;
import com.google.android.apps.gsa.shared.notificationlistening.collection.C90394ab;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a.C107535n;
import com.google.assistant.p3897e.p3921j.aco;
import com.google.common.p4522b.C58431eu;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.at.d */
/* compiled from: PG */
public final class C107561d extends C107572o {
    public C107561d(C107535n nVar, C1832s sVar, String str, int i) {
        super(nVar, sVar, str, i);
    }

    /* renamed from: a */
    public final String mo96010a() {
        return this.f299285c.f299177c;
    }

    /* renamed from: d */
    public final String mo96013d() {
        return TextUtils.join(System.lineSeparator(), C58431eu.m89654f(this.f299285c.f299179e).mo55246e(C107559b.f299217a).mo55247g(C107560c.f299218a));
    }

    /* renamed from: e */
    public final boolean mo96014e() {
        return true;
    }

    /* renamed from: f */
    public final boolean mo96015f() {
        if (C90394ab.m147004b(this.f299287e)) {
            return true;
        }
        aco aco = this.f299285c.f299176b;
        if (aco == null) {
            aco = aco.f134821t;
        }
        return (aco.f134833k && this.f299286d != null) || this.f299289g;
    }
}
