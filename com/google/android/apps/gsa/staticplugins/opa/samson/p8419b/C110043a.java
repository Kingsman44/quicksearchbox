package com.google.android.apps.gsa.staticplugins.opa.samson.p8419b;

import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.p6988al.C89193a;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8419b.p8420a.C110045b;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.b.a */
/* compiled from: PG */
public final class C110043a implements C89193a {

    /* renamed from: a */
    private final C68214a f306606a;

    /* renamed from: b */
    private final C68214a f306607b;

    public C110043a(C68214a aVar, C68214a aVar2) {
        this.f306606a = aVar;
        this.f306607b = aVar2;
    }

    /* renamed from: a */
    public final String mo19980a(String str, String str2) {
        boolean z;
        if (!"amb_chips_opt_in_value".equals(str)) {
            return null;
        }
        String F = ((C86054o) this.f306607b.mo27525b()).mo79659F();
        if (F == null) {
            z = false;
        } else {
            z = ((C110045b) this.f306606a.mo27525b()).mo98332a(F);
        }
        return String.valueOf(z);
    }
}
