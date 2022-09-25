package com.google.android.apps.gsa.staticplugins.opa.util;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.search.core.p6809l.C86152a;
import com.google.android.apps.gsa.search.shared.p6930h.C87565h;
import com.google.android.apps.gsa.search.shared.p6930h.C87566i;
import com.google.android.apps.gsa.staticplugins.opa.samson.shared.C110402b;
import com.google.common.base.C58881cr;
import dagger.C68214a;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.bw */
/* compiled from: PG */
public final class C113807bw {

    /* renamed from: a */
    public final C86152a f315198a;

    /* renamed from: b */
    private final Set f315199b;

    /* renamed from: c */
    private final C58881cr f315200c;

    /* renamed from: d */
    private final C68214a f315201d;

    /* renamed from: e */
    private final boolean f315202e;

    public C113807bw(Set set, C58881cr crVar, C86152a aVar, C68214a aVar2, C58881cr crVar2) {
        this.f315199b = set;
        this.f315200c = crVar;
        this.f315198a = aVar;
        this.f315201d = aVar2;
        this.f315202e = ((Boolean) crVar2.mo6453a()).booleanValue();
    }

    /* renamed from: c */
    public static boolean m188394c(String str) {
        if (str != null) {
            return str.equals("com.google.android.apps.gsa.staticplugins.opa.samson.activity.OpaAmbActivity");
        }
        return false;
    }

    /* renamed from: d */
    private final boolean m188395d() {
        if (((Integer) this.f315200c.mo6453a()).intValue() == 1 || ((Integer) this.f315200c.mo6453a()).intValue() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo100656a(Context context, Bundle bundle, C87565h hVar) {
        Bundle bundle2;
        boolean z;
        Intent y = C87566i.m142326y(bundle);
        if (y != null) {
            bundle2 = y.getExtras();
        } else {
            bundle2 = Bundle.EMPTY;
        }
        boolean z2 = false;
        boolean z3 = C87566i.m142297au(bundle) || C87566i.m142297au(bundle2);
        String string = bundle.getString("android.intent.extra.ASSIST_PACKAGE");
        if (string == null) {
            string = this.f315198a.f232820b.mo79804a();
        }
        String b = string != null ? this.f315198a.f232820b.mo79805b(string) : null;
        boolean z4 = C87566i.m142298av(bundle) || C87566i.m142298av(bundle2);
        boolean d = m188395d();
        if (!z3 || this.f315202e || ((!"com.google.android.apps.dreamliner".equals(string) || !"com.google.android.apps.dreamliner.MainActivity".equals(b)) && (!context.getPackageName().equals(string) || b == null || !this.f315199b.contains(b) || !m188395d()))) {
            z = false;
        } else {
            z = true;
        }
        if (((C110402b) this.f315201d.mo27525b()).mo98629a() && z3 && mo100657b(context, string, b)) {
            z2 = true;
        }
        if (z || z2 || (d && z4)) {
            hVar.f236503G = true;
        }
        if (z) {
            hVar.f236500D = true;
        }
        if (!z && z2) {
            hVar.f236501E = true;
        }
    }

    /* renamed from: b */
    public final boolean mo100657b(Context context, String str, String str2) {
        if (!context.getPackageName().equals(str) || str2 == null) {
            return false;
        }
        if (this.f315199b.contains(str2) || m188394c(str2)) {
            return true;
        }
        return false;
    }
}
