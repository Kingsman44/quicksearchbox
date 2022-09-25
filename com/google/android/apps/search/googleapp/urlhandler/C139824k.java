package com.google.android.apps.search.googleapp.urlhandler;

import android.net.Uri;
import android.support.p031v4.app.Fragment;
import android.webkit.URLUtil;
import com.google.android.apps.gsa.h.e.a;
import com.google.android.apps.search.googleapp.p10335j.C136370a;
import com.google.android.apps.search.googleapp.urlhandler.internal.C139805g;
import com.google.android.apps.search.googleapp.urlhandler.internal.C139807h;
import com.google.android.apps.search.googleapp.urlhandler.internal.C139808i;
import com.google.android.apps.search.googleapp.urlhandler.internal.C139809j;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.concurrent.futuresmixin.C46436b;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.inject.p3657c.C47215a;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62921ba;
import dagger.p5294a.C68221g;

/* renamed from: com.google.android.apps.search.googleapp.urlhandler.k */
/* compiled from: PG */
public final class C139824k {

    /* renamed from: a */
    public final C139808i f380080a;

    /* renamed from: b */
    public C139805g f380081b;

    /* renamed from: c */
    private final Fragment f380082c;

    /* renamed from: d */
    private final C21370a f380083d;

    /* renamed from: e */
    private final C139807h f380084e;

    public C139824k(C139808i iVar, Fragment fragment, C21370a aVar, C139807h hVar) {
        this.f380080a = iVar;
        this.f380082c = fragment;
        this.f380083d = aVar;
        this.f380084e = hVar;
    }

    /* renamed from: a */
    public final void mo115292a() {
        if (this.f380081b == null) {
            throw new IllegalStateException("A callback must be registered through registerCallback() before using launchUrl()");
        }
    }

    /* renamed from: b */
    public final void mo115293b() {
        boolean z = false;
        if (this.f380082c.isAdded() && !this.f380082c.isStateSaved()) {
            z = true;
        }
        C58838bb.m90884s(z, "UrlHandler can only be used while the fragment is attached and state is not saved");
    }

    /* renamed from: c */
    public final void mo115294c(Uri uri, C139823j jVar) {
        C19559g.m37304c();
        mo115293b();
        mo115292a();
        mo115296e(jVar);
        C139808i iVar = this.f380080a;
        C139805g gVar = this.f380081b;
        iVar.f379995b.mo115285c(jVar);
        iVar.f379996c.mo115307d();
        iVar.f379997d.mo115233a(uri);
        C60870cx b = iVar.f379998e.mo115235b(C47633f.m84733g(C60856cj.m92900i(uri)));
        iVar.f379994a.mo50445g(new C46438d(iVar.f380000g.mo115288b(b, iVar.f379999f.mo115286a(b, jVar, iVar.mo115284b(), iVar.f380001h, iVar.mo115283a()))), C46436b.m82808a(jVar), gVar.f379983j);
    }

    /* renamed from: d */
    public final void mo115295d(C139796g gVar) {
        C19559g.m37304c();
        C58838bb.m90884s(this.f380081b == null, "A callback was already registered.");
        C139807h hVar = this.f380084e;
        gVar.getClass();
        Fragment fragment = (Fragment) ((C68221g) hVar.f379986a).f184583a;
        fragment.getClass();
        C47215a aVar = (C47215a) hVar.f379987b.mo17428b();
        aVar.getClass();
        C139809j jVar = (C139809j) hVar.f379988c.mo17428b();
        jVar.getClass();
        C62921ba baVar = (C62921ba) hVar.f379989d.mo17428b();
        baVar.getClass();
        C136370a aVar2 = (C136370a) hVar.f379990e.mo17428b();
        aVar2.getClass();
        Boolean bool = (Boolean) hVar.f379991f.mo17428b();
        bool.getClass();
        boolean booleanValue = bool.booleanValue();
        Boolean bool2 = (Boolean) hVar.f379992g.mo17428b();
        bool2.getClass();
        boolean booleanValue2 = bool2.booleanValue();
        a aVar3 = (a) hVar.f379993h.mo17428b();
        aVar3.getClass();
        C139805g gVar2 = new C139805g(gVar, fragment, aVar, jVar, baVar, aVar2, booleanValue, booleanValue2, aVar3);
        this.f380081b = gVar2;
        this.f380080a.f379994a.mo50429i(gVar2.f379983j);
    }

    /* renamed from: e */
    public final void mo115296e(C139823j jVar) {
        String str = jVar.f380073f;
        boolean z = false;
        if (!str.isEmpty()) {
            C58838bb.m90869d(URLUtil.isHttpUrl(str) || URLUtil.isHttpsUrl(str), "Only the HTTP and HTTPS schemes are supported in the preferred URL for embedded browsers");
        }
        String str2 = jVar.f380074g;
        if (!str2.isEmpty()) {
            C58838bb.m90869d(URLUtil.isHttpUrl(str2) || URLUtil.isHttpsUrl(str2), "Only the HTTP and HTTPS schemes are supported in the preferred Sonic foreground URL");
        }
        C58838bb.m90869d(str.isEmpty() || str2.isEmpty(), "Using both a preferred URL for embedded browsers and a preferred Sonic foreground URL is not supported");
        if ((jVar.f380068a & 2) != 0) {
            long j = jVar.f380070c;
            if (j >= 0 && j <= this.f380083d.mo26872d()) {
                z = true;
            }
            C58838bb.m90869d(z, "The provided click timestamp must be between 0 and the current time (inclusive).");
        }
    }
}
