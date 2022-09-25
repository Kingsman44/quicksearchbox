package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8515m;

import android.content.pm.ShortcutInfo;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8540g.C112036an;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113163bu;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113251ad;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113259al;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113286bk;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113341cl;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113324u;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.m.l */
/* compiled from: PG */
public final class C111587l implements C111585j {

    /* renamed from: a */
    private final C113251ad f310322a;

    /* renamed from: b */
    private final C113324u f310323b;

    public C111587l(C113251ad adVar, C113324u uVar) {
        this.f310322a = adVar;
        this.f310323b = uVar;
    }

    /* renamed from: a */
    public final C113286bk mo99183a(String str) {
        return C113259al.m187318c(this.f310323b.mo100116b(str));
    }

    /* renamed from: b */
    public final C113286bk mo99184b(ShortcutInfo shortcutInfo) {
        return mo99183a(shortcutInfo.getPackage());
    }

    /* renamed from: c */
    public final C113341cl mo99185c(String str) {
        C113163bu.m187179a(this.f310322a.mo99924a(str), "fetch app icon");
        C113163bu.m187179a(this.f310322a.mo99925b(str), "fetch app label");
        return C113341cl.m187504e(C113259al.m187316a(str));
    }

    /* renamed from: d */
    public final C58485gu mo99186d(C112036an anVar, String... strArr) {
        return (C58485gu) Collection.EL.stream(anVar.mo99339a(strArr)).map(new C111586k(this)).collect(C58370cn.f155946a);
    }
}
