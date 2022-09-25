package com.google.android.apps.gsa.staticplugins.bisto.p7464ab;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.settings.shared.ar;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.search.core.p6513aj.C84535at;
import com.google.android.apps.gsa.search.shared.service.p6940d.C88483e;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ab.h */
/* compiled from: PG */
public final class C94809h implements ar {

    /* renamed from: a */
    public static final C59071e f265108a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ab.h");

    /* renamed from: b */
    public final C88483e f265109b;

    /* renamed from: c */
    public final C84535at f265110c;

    /* renamed from: d */
    public final C22871g f265111d;

    /* renamed from: e */
    public final C91142g f265112e;

    /* renamed from: f */
    public final C68214a f265113f;

    /* renamed from: g */
    public final l f265114g;

    public C94809h(C88483e eVar, C84535at atVar, C22871g gVar, C91142g gVar2, C68214a aVar, l lVar) {
        C59104x b = f265108a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoSettingsListener");
        ((C59052c) ((C59052c) b).mo56372aa(16913)).mo56386p("listener created");
        this.f265109b = eVar;
        this.f265110c = atVar;
        this.f265111d = gVar;
        this.f265112e = gVar2;
        this.f265113f = aVar;
        this.f265114g = lVar;
    }

    /* renamed from: a */
    public final void mo88620a(String str, String str2) {
        C59104x b = f265108a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoSettingsListener");
        ((C59052c) ((C59052c) b).mo56372aa(16919)).mo56354G("onVoiceSettingsChanged: key is %s, voice is %s", str, str2);
        if (str2 != null && !str2.equals(this.f265112e.mo85402g(str, BuildConfig.FLAVOR))) {
            C90875ai.m148465b(C94802a.f265094a, mo88621b(str, str2), this.f265111d, "Notify Voice Changed").mo85223a(C94803b.f265095a);
        }
    }

    /* renamed from: b */
    public final C60870cx mo88621b(String str, String str2) {
        return this.f265111d.mo28207g("crossProcessUpdateSettings", new C94808g(this, str, str2));
    }
}
