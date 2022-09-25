package com.facebook.litho;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.litho.hq */
/* compiled from: PG */
public final class C6392hq {

    /* renamed from: a */
    public final Map f18915a = new HashMap();

    /* renamed from: c */
    private static String m17127c(String str, String str2) {
        return str + "_" + str2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo13401a(String str, C6407q qVar) {
        String c = m17127c(str, C6103an.m15882i(qVar));
        return this.f18915a.containsKey(c) && ((Integer) this.f18915a.get(c)).intValue() == 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo13402b(String str, C6407q qVar, int i) {
        this.f18915a.put(m17127c(str, C6103an.m15882i(qVar)), Integer.valueOf(i));
    }
}
