package com.google.android.apps.gsa.p8839t;

import android.accounts.Account;
import com.google.android.apps.gsa.assistant.settings.devices.p522c.p524b.C9684l;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.t.i */
/* compiled from: PG */
public final class C118451i {

    /* renamed from: a */
    public final C86054o f328784a;

    /* renamed from: b */
    public final C68214a f328785b;

    /* renamed from: c */
    private final C9684l f328786c;

    /* renamed from: d */
    private final C22871g f328787d;

    public C118451i(C86054o oVar, C68214a aVar, C9684l lVar, C22871g gVar) {
        this.f328784a = oVar;
        this.f328785b = aVar;
        this.f328786c = lVar;
        this.f328787d = gVar;
    }

    /* renamed from: a */
    public final C60870cx mo103704a(int i) {
        C60870cx i2 = C60856cj.m92900i(false);
        Account a = this.f328784a.mo79668a();
        if (a != null) {
            i2 = this.f328786c.mo17952a(a);
        }
        return this.f328787d.mo28209i(i2, "#isPersonalResponseAllowedFuture()", new C118379h(this, i));
    }

    /* renamed from: b */
    public final String mo103705b(String str, C53306j jVar) {
        return String.format("background_task_%s_%s_degradation_index_%s_%s.pb", new Object[]{str, jVar.name(), this.f328784a.mo79659F(), ((bm) this.f328785b.mo27525b()).b()});
    }

    /* renamed from: c */
    public final String mo103706c(String str, C53306j jVar) {
        return String.format("background_task_%s_%s_last_updated_time_millis_%s_%s.pb", new Object[]{str, jVar.name(), this.f328784a.mo79659F(), ((bm) this.f328785b.mo27525b()).b()});
    }

    /* renamed from: d */
    public final String mo103707d(C53306j jVar) {
        return String.format("client_sync_%s_last_updated_time_millis_%s_%s.pb", new Object[]{jVar.name(), this.f328784a.mo79659F(), ((bm) this.f328785b.mo27525b()).b()});
    }

    /* renamed from: e */
    public final String mo103708e() {
        return String.format("potter_preferred_media_provider_%s_%s.pb", new Object[]{this.f328784a.mo79659F(), ((bm) this.f328785b.mo27525b()).b()});
    }
}
