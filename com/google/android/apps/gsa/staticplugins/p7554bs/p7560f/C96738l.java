package com.google.android.apps.gsa.staticplugins.p7554bs.p7560f;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90129h;

/* renamed from: com.google.android.apps.gsa.staticplugins.bs.f.l */
/* compiled from: PG */
public final class C96738l {

    /* renamed from: a */
    public final C86124t f270612a;

    /* renamed from: b */
    public final C96751y f270613b;

    /* renamed from: c */
    public String f270614c = BuildConfig.FLAVOR;

    public C96738l(C86124t tVar, C96751y yVar) {
        this.f270612a = tVar;
        this.f270613b = yVar;
    }

    /* renamed from: b */
    static final int m160326b(String str, String str2) {
        String[] split = str.split("\\.", -1);
        String[] split2 = str2.split("\\.", -1);
        for (int i = 0; i < Math.min(split.length, split2.length); i++) {
            if (Integer.parseInt(split[i]) < Integer.parseInt(split2[i])) {
                return -1;
            }
            if (Integer.parseInt(split[i]) > Integer.parseInt(split2[i])) {
                return 1;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public final boolean mo90333a(C90129h hVar) {
        String x = this.f270612a.mo79758x(hVar);
        return !"0.0.0".equals(x) && m160326b(this.f270614c, x) >= 0;
    }
}
