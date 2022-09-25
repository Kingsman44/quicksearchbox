package com.google.android.apps.gsa.staticplugins.customtabs.p7708a;

import android.os.Bundle;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.android.libraries.p1703d.C20646b;
import com.google.android.libraries.p1703d.C20670z;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2895i.C37254c;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.customtabs.a.f */
/* compiled from: PG */
public final class C98570f {

    /* renamed from: a */
    public static final C59071e f275303a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.customtabs.a.f");

    /* renamed from: b */
    public final C68214a f275304b;

    /* renamed from: c */
    private final C86124t f275305c;

    /* renamed from: d */
    private final C37215b f275306d;

    public C98570f(C68214a aVar, C86124t tVar, C37215b bVar) {
        this.f275304b = aVar;
        this.f275305c = tVar;
        this.f275306d = bVar;
    }

    /* renamed from: a */
    public final void mo91184a(C37254c cVar) {
        if (this.f275305c.mo79746e(C90110fh.f250594S)) {
            this.f275306d.mo19974a(cVar);
        }
    }

    /* renamed from: b */
    public final void mo91185b(C20670z zVar) {
        boolean z = false;
        boolean g = this.f275305c.mo79746e(C90110fh.f250586K) ? zVar.mo25668g() : false;
        C20646b bVar = null;
        if (this.f275305c.mo79746e(C90110fh.f250585J)) {
            Bundle a = zVar.f57938a.f57933b.mo3580a("getAgsaExperimentParams", zVar.mo25662a());
            if (a != null) {
                bVar = C20646b.m38758c(a);
            }
        } else {
            z = true;
        }
        C60856cj.m92911t(((C42876ab) this.f275304b.mo27525b()).mo46039a(new C98566b(g, z, bVar), C60826bg.f164896a), new C98569e(this, z, bVar), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final boolean mo91186c() {
        return this.f275305c.mo79746e(C90110fh.f250586K) || this.f275305c.mo79746e(C90110fh.f250585J);
    }
}
