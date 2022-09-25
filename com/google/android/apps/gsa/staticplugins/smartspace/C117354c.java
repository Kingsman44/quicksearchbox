package com.google.android.apps.gsa.staticplugins.smartspace;

import com.google.android.apps.gsa.opa.smartspace.C83793i;
import com.google.android.apps.gsa.opa.smartspace.C83794j;
import com.google.android.apps.gsa.opa.smartspace.p6456e.C83784b;
import com.google.android.apps.gsa.search.core.p6802h.p6804b.C86091a;
import com.google.android.apps.gsa.search.core.p6805i.C86127w;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.search.core.preferences.C86341u;
import com.google.android.apps.gsa.search.core.preferences.C86346z;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.p8466q.C110907c;
import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;
import dagger.C68214a;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.smartspace.c */
/* compiled from: PG */
public final class C117354c implements C86091a {

    /* renamed from: a */
    private final C83794j f325783a;

    /* renamed from: b */
    private final C83793i f325784b;

    /* renamed from: c */
    private final C68214a f325785c;

    /* renamed from: d */
    private final C86127w f325786d;

    /* renamed from: e */
    private final C83784b f325787e;

    /* renamed from: f */
    private final C110907c f325788f;

    public C117354c(C83794j jVar, C83793i iVar, C68214a aVar, C86127w wVar, C110907c cVar, C83784b bVar) {
        this.f325783a = jVar;
        this.f325784b = iVar;
        this.f325785c = aVar;
        this.f325786d = wVar;
        this.f325788f = cVar;
        this.f325787e = bVar;
    }

    /* renamed from: c */
    public final void mo17494c(boolean z, boolean z2) {
        if (this.f325783a.mo77187z()) {
            C86338r a = this.f325786d.f232790a.mo79722a();
            if (a.getBoolean("weather_widget_enabled", false)) {
                C86341u uVar = new C86341u((C86346z) a);
                uVar.mo80085k("weather_widget_enabled", false);
                uVar.mo80086l(false);
            }
            C86338r a2 = this.f325786d.f232790a.mo79722a();
            Set stringSet = a2.getStringSet("smartspace_listeners", (Set) null);
            C86341u uVar2 = new C86341u((C86346z) a2);
            HashSet hashSet = new HashSet();
            if (stringSet != null) {
                hashSet.addAll(stringSet);
            }
            hashSet.add("smartspace_generic_intent_listener");
            uVar2.mo80074i("smartspace_listeners", hashSet);
            uVar2.mo80085k("smartspace_enabled", true);
            uVar2.mo80086l(false);
            C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
            long millis = TimeUnit.HOURS.toMillis(2);
            afVar.copyOnWrite();
            C118472ag agVar = (C118472ag) afVar.instance;
            agVar.f328821a |= 2;
            agVar.f328823c = millis;
            afVar.copyOnWrite();
            C118472ag agVar2 = (C118472ag) afVar.instance;
            agVar2.f328824d = 1;
            agVar2.f328821a |= 4;
            afVar.copyOnWrite();
            C118472ag agVar3 = (C118472ag) afVar.instance;
            agVar3.f328821a |= 16;
            agVar3.f328826f = false;
            afVar.copyOnWrite();
            C118472ag agVar4 = (C118472ag) afVar.instance;
            agVar4.f328821a |= 8;
            agVar4.f328825e = true;
            ((C118561t) this.f325785c.mo27525b()).mo103754e(C118522by.NOW_UPDATE_GCM_REGISTRATION, (C118472ag) afVar.build());
            if (this.f325783a.mo77178p()) {
                this.f325784b.mo77150f();
            }
            this.f325783a.f228395f.mo77149e();
            if (z) {
                this.f325788f.mo98928b();
            } else {
                this.f325788f.mo98927a();
            }
            this.f325787e.mo77116b();
        }
    }
}
