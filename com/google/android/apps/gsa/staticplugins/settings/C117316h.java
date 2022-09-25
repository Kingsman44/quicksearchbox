package com.google.android.apps.gsa.staticplugins.settings;

import android.content.SharedPreferences;
import com.google.android.apps.gsa.assistant.settings.shared.p5799j.C73758e;
import com.google.android.apps.gsa.nga.api.C74718bv;
import com.google.android.apps.gsa.nga.api.NgaState;
import com.google.android.apps.gsa.search.core.p6802h.p6804b.C86091a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.staticplugins.settings.p8758a.C117297a;
import com.google.android.apps.gsa.staticplugins.settings.p8758a.C117298b;
import com.google.android.apps.gsa.staticplugins.settings.p8758a.C117299c;
import com.google.android.apps.gsa.staticplugins.settings.p8758a.C117302f;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3861at.C49883cn;
import com.google.assistant.p3861at.C49891cv;
import com.google.assistant.p3861at.C49920dx;
import com.google.assistant.p3861at.C49922dz;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.settings.h */
/* compiled from: PG */
public final class C117316h implements SharedPreferences.OnSharedPreferenceChangeListener, C86091a, C74718bv {

    /* renamed from: a */
    public final SharedPreferences f325661a;

    /* renamed from: b */
    private final C68214a f325662b;

    /* renamed from: c */
    private final C86124t f325663c;

    /* renamed from: d */
    private final C22871g f325664d;

    public C117316h(SharedPreferences sharedPreferences, C68214a aVar, C86124t tVar, C22871g gVar) {
        this.f325661a = sharedPreferences;
        this.f325662b = aVar;
        this.f325663c = tVar;
        this.f325664d = gVar;
    }

    /* renamed from: b */
    private final void m194960b() {
        C49883cn cnVar = (C49883cn) C49891cv.f129647N.createBuilder();
        C49920dx dxVar = (C49920dx) C49922dz.f129751p.createBuilder();
        boolean z = this.f325661a.getBoolean("continued_conversation_setting", this.f325663c.mo79746e(C90126fx.f251009ai));
        dxVar.copyOnWrite();
        C49922dz dzVar = (C49922dz) dxVar.instance;
        dzVar.f129753a |= 32;
        dzVar.f129759g = z;
        cnVar.copyOnWrite();
        C49891cv cvVar = (C49891cv) cnVar.instance;
        C49922dz dzVar2 = (C49922dz) dxVar.build();
        dzVar2.getClass();
        cvVar.f129682u = dzVar2;
        cvVar.f129663a |= 33554432;
        C49891cv cvVar2 = (C49891cv) cnVar.build();
        long millis = Duration.ofHours(6).toMillis();
        C117297a aVar = (C117297a) C117302f.f325630f.createBuilder();
        aVar.copyOnWrite();
        C117302f fVar = (C117302f) aVar.instance;
        cvVar2.getClass();
        fVar.f325633b = cvVar2;
        fVar.f325632a |= 1;
        C117298b bVar = (C117298b) C117299c.f325618e.createBuilder();
        bVar.copyOnWrite();
        C117299c cVar = (C117299c) bVar.instance;
        cVar.f325620a |= 1;
        cVar.f325621b = 8;
        bVar.copyOnWrite();
        C117299c cVar2 = (C117299c) bVar.instance;
        cVar2.f325620a |= 4;
        cVar2.f325623d = 15000;
        aVar.copyOnWrite();
        C117302f fVar2 = (C117302f) aVar.instance;
        C117299c cVar3 = (C117299c) bVar.build();
        cVar3.getClass();
        fVar2.f325636e = cVar3;
        fVar2.f325632a |= 8;
        C73758e.m108324b((C118561t) this.f325662b.mo27525b(), (C117302f) aVar.build(), millis, 0);
    }

    /* renamed from: a */
    public final void mo17497a(NgaState ngaState) {
        C58976aa aaVar = C58975e.f156826a;
        this.f325664d.mo28212l("[Settings] registerOnSharedPreferenceChangeListener", new C117315g(this, ngaState));
    }

    /* renamed from: c */
    public final void mo17494c(boolean z, boolean z2) {
        C58976aa aaVar = C58975e.f156826a;
        m194960b();
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        C58976aa aaVar = C58975e.f156826a;
        if ("continued_conversation_setting".equals(str)) {
            m194960b();
        }
    }
}
