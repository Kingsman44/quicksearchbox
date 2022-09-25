package com.google.android.apps.gsa.staticplugins.bisto.p7531w;

import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.android.apps.gsa.staticplugins.bisto.util.C96462at;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124721s;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.w.as */
/* compiled from: PG */
public final class C96533as {

    /* renamed from: a */
    public C124548d f270074a;

    /* renamed from: b */
    private final C89656k f270075b;

    /* renamed from: c */
    private final C95355bf f270076c;

    public C96533as(C89656k kVar, C68214a aVar, C95355bf bfVar) {
        C124548d b = ((C89492cd) aVar.mo27525b()).mo83401b(bfVar.mo89270k());
        b.getClass();
        this.f270074a = b;
        this.f270075b = kVar;
        this.f270076c = bfVar;
    }

    /* renamed from: a */
    static String m159940a(String str, C124721s sVar) {
        int[] b = C96462at.m159832b(str, sVar);
        if (b.length == 0) {
            C58976aa aaVar = C58975e.f156826a;
            return str;
        }
        String num = Integer.toString(b[0]);
        for (int i = 1; i < b.length; i++) {
            num = num + "." + b[i];
        }
        return num;
    }

    /* renamed from: b */
    static boolean m159941b(String str, String str2, C124721s sVar) {
        if (str == null || str2 == null) {
            return str == null && str2 == null;
        }
        return m159940a(str, sVar).equals(m159940a(str2, sVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo90222c() {
        if (!this.f270074a.mo106489ac()) {
            return true;
        }
        Integer num = (Integer) this.f270074a.mo106468I().orElse(null);
        if (num != null) {
            C58976aa aaVar = C58975e.f156826a;
            if (((long) num.intValue()) >= this.f270075b.mo83546a("ota_min_battery")) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo90223d() {
        return this.f270076c.mo89278w();
    }
}
