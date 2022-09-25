package com.google.android.apps.gsa.search.core.p6502ae.p6503a;

import android.content.SharedPreferences;
import com.google.android.apps.gsa.search.core.p6502ae.C84463d;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.search.core.ae.a.g */
/* compiled from: PG */
public final /* synthetic */ class C84440g implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C84441h f229774a;

    /* renamed from: b */
    public final /* synthetic */ C84431am f229775b;

    /* renamed from: c */
    public final /* synthetic */ SharedPreferences f229776c;

    public /* synthetic */ C84440g(C84441h hVar, C84431am amVar, SharedPreferences sharedPreferences) {
        this.f229774a = hVar;
        this.f229775b = amVar;
        this.f229776c = sharedPreferences;
    }

    public final void run() {
        boolean c;
        C84441h hVar = this.f229774a;
        C84431am amVar = this.f229775b;
        SharedPreferences sharedPreferences = this.f229776c;
        C84425ag agVar = (C84425ag) hVar.f229780d.f229789b.mo27525b();
        C84433ao aoVar = (C84433ao) amVar;
        C58800sl lA = aoVar.f229753a.iterator();
        while (lA.hasNext()) {
            C84430al alVar = (C84430al) lA.next();
            C58976aa aaVar = C58975e.f156826a;
            String str = alVar.f229734b;
            if (!str.equals(aoVar.f229754b.getPackageName()) && sharedPreferences.contains("enable_corpus_".concat(String.valueOf(alVar.f229733a))) && alVar.f229744l != (c = C84463d.m134802c(sharedPreferences, alVar))) {
                agVar.mo77998e(str, "com.google.android.gms".equals(str) ? alVar.f229742j : null, c, (Runnable) null);
                alVar.f229744l = c;
            }
        }
        if (!hVar.f229780d.f229790c.isDone()) {
            hVar.f229780d.f229790c.mo57356n(true);
        }
    }
}
