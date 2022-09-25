package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7978c;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.settings.features.av.bh;
import com.google.android.apps.gsa.assistant.settings.features.av.dn;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.bp */
/* compiled from: PG */
public final /* synthetic */ class C101679bp implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C101687bx f283713a;

    public /* synthetic */ C101679bp(C101687bx bxVar) {
        this.f283713a = bxVar;
    }

    public final void run() {
        C101687bx bxVar = this.f283713a;
        dn dnVar = bxVar.f283725e;
        bh bhVar = bxVar.f283722b;
        dnVar.x(bhVar.a == 2 ? (String) bhVar.b : BuildConfig.FLAVOR, true, bxVar.mo92493a());
        bxVar.f283729i.mo83702b(C89849ae.VOICE_MATCH_INTRO_SCREEN_EXIT);
        bxVar.mo92494b();
    }
}
