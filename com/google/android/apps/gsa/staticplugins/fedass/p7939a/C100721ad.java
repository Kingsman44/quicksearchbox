package com.google.android.apps.gsa.staticplugins.fedass.p7939a;

import com.google.android.apps.gsa.staticplugins.fedass.p7946e.C100846b;
import com.google.android.apps.search.fedora.p10099e.C132798f;
import com.google.android.apps.search.fedora.p10099e.C132800h;
import com.google.android.apps.search.fedora.p10099e.C132815w;
import com.google.android.apps.search.fedora.p10099e.C132818z;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.a.ad */
/* compiled from: PG */
public final class C100721ad {

    /* renamed from: a */
    private static final C59071e f281605a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.fedass.a.ad");

    /* renamed from: b */
    private final C68214a f281606b;

    /* renamed from: c */
    private final C100846b f281607c;

    public C100721ad(C100846b bVar, C68214a aVar) {
        this.f281607c = bVar;
        this.f281606b = aVar;
    }

    /* renamed from: b */
    public static boolean m166921b(C132800h hVar) {
        C132818z zVar = hVar.f362336d;
        if (zVar == null) {
            zVar = C132818z.f362393h;
        }
        C132815w wVar = zVar.f362397c;
        if (wVar == null) {
            wVar = C132815w.f362363x;
        }
        return wVar.f362370f;
    }

    /* renamed from: a */
    public final C60870cx mo92027a() {
        return C100742h.m166944c(((C100719ab) this.f281606b.mo27525b()).mo92020d()).mo92034d(new C100720ac(this)).f281631a;
    }

    /* renamed from: c */
    public final boolean mo92028c(C132800h hVar) {
        C59104x b = this.f281607c.f281810a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "FedAssSettingsBuildTypeHelper");
        ((C59052c) ((C59052c) b).mo56372aa(19585)).mo56386p("BuildType: Release");
        if (m166921b(hVar)) {
            ((C59052c) ((C59052c) f281605a.mo56224b()).mo56372aa(19519)).mo56386p("getFlSettingEnabledWithDogfood: true");
            return true;
        }
        C59052c cVar = (C59052c) ((C59052c) f281605a.mo56224b()).mo56372aa(19518);
        C132798f fVar = hVar.f362335c;
        if (fVar == null) {
            fVar = C132798f.f362315o;
        }
        cVar.mo56389s("getFlSettingEnabledWithSettingsToggle: %b", Boolean.valueOf(fVar.f362318b));
        C132798f fVar2 = hVar.f362335c;
        if (fVar2 == null) {
            fVar2 = C132798f.f362315o;
        }
        return fVar2.f362318b;
    }
}
