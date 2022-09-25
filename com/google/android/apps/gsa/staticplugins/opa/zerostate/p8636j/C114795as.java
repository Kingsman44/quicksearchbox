package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j;

import android.content.SharedPreferences;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import dagger.C68214a;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.j.as */
/* compiled from: PG */
final class C114795as {

    /* renamed from: a */
    public final SharedPreferences f318529a;

    /* renamed from: b */
    private final C86054o f318530b;

    /* renamed from: c */
    private final C68214a f318531c;

    public C114795as(C86054o oVar, SharedPreferences sharedPreferences, C68214a aVar) {
        this.f318529a = sharedPreferences;
        this.f318530b = oVar;
        this.f318531c = aVar;
    }

    /* renamed from: a */
    public final String mo101592a() {
        return String.format("%s%s_%s", new Object[]{"opa_zero_state_dismissed_card_types_", this.f318530b.mo79659F(), ((bm) this.f318531c.mo27525b()).b()});
    }

    /* renamed from: b */
    public final void mo101593b(Set set) {
        SharedPreferences.Editor edit = this.f318529a.edit();
        edit.putStringSet(mo101592a(), set);
        edit.apply();
    }
}
