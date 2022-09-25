package com.google.android.apps.search.assistant.surfaces.appactions.service;

import com.google.android.apps.gsa.binaries.satin.app.aeh;
import com.google.android.apps.gsa.binaries.satin.app.aej;
import com.google.android.apps.search.assistant.surfaces.appactions.service.C124378j;
import com.google.android.libraries.appactions.service.C147861c;
import com.google.android.libraries.appactions.service.ShortcutLookupRequest;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p386ak.C8398n;
import com.google.p386ak.C8402r;
import com.google.p386ak.C8403s;
import com.google.p4449cd.p4450a.C57934a;
import dagger.p5294a.C68225k;

/* renamed from: com.google.android.apps.search.assistant.surfaces.appactions.service.i */
/* compiled from: PG */
final class C124377i implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ ShortcutLookupRequest f343302a;

    /* renamed from: b */
    final /* synthetic */ int f343303b;

    /* renamed from: c */
    final /* synthetic */ C147861c f343304c;

    public C124377i(ShortcutLookupRequest shortcutLookupRequest, C147861c cVar, int i) {
        this.f343302a = shortcutLookupRequest;
        this.f343304c = cVar;
        this.f343303b = i;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C124378j.f343305a.mo56226d()).mo56382g(th)).mo56372aa(36228)).mo56386p("Failed to get the default Assistant account");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C124378j.C124379a aVar = (C124378j.C124379a) obj;
        if (aVar == null) {
            ((C59052c) ((C59052c) C124378j.f343305a.mo56225c()).mo56372aa(36230)).mo56386p("Failed to get Assistant account entry point");
        } else if (!aVar.mo106403mU()) {
            ((C59052c) ((C59052c) C124378j.f343305a.mo56224b()).mo56372aa(36229)).mo56386p("AppShortcutsService is disabled, ignoring connection.");
        } else {
            C124371c au = aVar.mo106401au();
            ShortcutLookupRequest shortcutLookupRequest = this.f343302a;
            boolean mT = aVar.mo106402mT();
            C147861c cVar = this.f343304c;
            int i = this.f343303b;
            ((C58970a) ((C58970a) C124371c.f343287a.mo56224b()).mo56372aa(36219)).mo56389s("Received shortcut lookup request: %s", shortcutLookupRequest);
            if (cVar == null) {
                ((C58970a) ((C58970a) C124371c.f343287a.mo56225c()).mo56372aa(36220)).mo56386p("Callback is null, quitting");
            } else if (shortcutLookupRequest == null) {
                C124371c.m203827a(cVar, 1, "Request is null.", (Throwable) null);
            } else if (shortcutLookupRequest.mo124520c() == null) {
                C124371c.m203827a(cVar, 1, "Missing app package.", (Throwable) null);
            } else {
                String[] packagesForUid = au.f343288b.getPackageManager().getPackagesForUid(i);
                if (packagesForUid != null) {
                    int length = packagesForUid.length;
                    int i2 = 0;
                    while (i2 < length) {
                        String str = packagesForUid[i2];
                        if (str == null || !str.equals(shortcutLookupRequest.mo124520c())) {
                            i2++;
                        } else if (shortcutLookupRequest.mo124518a() == null || shortcutLookupRequest.mo124519b() == null) {
                            C124371c.m203827a(cVar, 1, "App action intent or intentParams is null.", (Throwable) null);
                            return;
                        } else {
                            try {
                                String b = shortcutLookupRequest.mo124519b();
                                b.getClass();
                                C8398n b2 = C8403s.m23253b(b);
                                String a = shortcutLookupRequest.mo124518a();
                                a.getClass();
                                String c = shortcutLookupRequest.mo124520c();
                                c.getClass();
                                aeh aeh = au.f343290d;
                                aeh.f195562c = au.f343291e.mo54628a("OnDeviceAppShortcutsGraph");
                                C68225k.m98529a(aeh.f195562c, C57934a.class);
                                C60870cx gq = new aej(aeh.f195560a, aeh.f195561b, aeh.f195562c).b.mo60297gq();
                                C124370b bVar = new C124370b(au, c, mT, cVar, a, b2, shortcutLookupRequest);
                                C60856cj.m92911t(gq, C47810es.m84974n(bVar), au.f343289c);
                                return;
                            } catch (C8402r e) {
                                C124371c.m203827a(cVar, 1, "Failed to parse intent params.", e);
                                return;
                            }
                        }
                    }
                }
                C124371c.m203827a(cVar, 1, String.format("Package %s has a different UID than the calling package.", new Object[]{shortcutLookupRequest.mo124520c()}), (Throwable) null);
            }
        }
    }
}
