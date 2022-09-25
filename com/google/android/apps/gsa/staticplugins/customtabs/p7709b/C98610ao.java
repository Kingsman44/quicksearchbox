package com.google.android.apps.gsa.staticplugins.customtabs.p7709b;

import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.view.accessibility.AccessibilityManager;
import android.widget.RemoteViews;
import com.google.android.apps.gsa.search.core.google.C85929cw;
import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84474e;
import com.google.android.apps.gsa.search.core.p6519al.p6538ai.C84687a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.android.apps.gsa.shared.p7127q.C90452a;
import com.google.android.apps.gsa.staticplugins.customtabs.p7708a.C98572h;
import com.google.android.apps.gsa.staticplugins.customtabs.p7708a.C98573i;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1703d.C20670z;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60494rz;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.customtabs.b.ao */
/* compiled from: PG */
public final class C98610ao {

    /* renamed from: a */
    public static final C59071e f275402a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.customtabs.b.ao");

    /* renamed from: b */
    public final C86124t f275403b;

    /* renamed from: c */
    public final C68214a f275404c;

    /* renamed from: d */
    public final C84687a f275405d;

    /* renamed from: e */
    public final C22871g f275406e;

    /* renamed from: f */
    public final C22871g f275407f;

    /* renamed from: g */
    public final C98642y f275408g;

    /* renamed from: h */
    public final C98617av f275409h;

    /* renamed from: i */
    public final C60494rz f275410i;

    /* renamed from: j */
    public final C21370a f275411j;

    /* renamed from: k */
    public final long f275412k;

    /* renamed from: l */
    public Runnable f275413l;

    /* renamed from: m */
    public Runnable f275414m;

    /* renamed from: n */
    public Runnable f275415n;

    /* renamed from: o */
    public boolean f275416o = true;

    /* renamed from: p */
    private final Context f275417p;

    /* renamed from: q */
    private final C84474e f275418q;

    /* renamed from: r */
    private final C98609an f275419r;

    /* renamed from: s */
    private final C98573i f275420s;

    /* renamed from: t */
    private final Uri f275421t;

    public C98610ao(Context context, C86124t tVar, C84474e eVar, C68214a aVar, C84687a aVar2, C85929cw cwVar, C22871g gVar, C22871g gVar2, C98617av avVar, C21370a aVar3, C98573i iVar, C98642y yVar, C60494rz rzVar, Uri uri, long j) {
        this.f275417p = context;
        this.f275403b = tVar;
        this.f275418q = eVar;
        this.f275404c = aVar;
        this.f275405d = aVar2;
        this.f275406e = gVar;
        this.f275407f = gVar2;
        this.f275409h = avVar;
        C85929cw cwVar2 = cwVar;
        C98609an anVar = new C98609an(cwVar);
        this.f275419r = anVar;
        this.f275410i = rzVar;
        this.f275411j = aVar3;
        this.f275420s = iVar;
        this.f275408g = yVar;
        this.f275421t = anVar.mo91217a(uri);
        this.f275412k = j;
    }

    /* renamed from: a */
    public final void mo91218a() {
        C58976aa aaVar = C58975e.f156826a;
        this.f275408g.f275506k.f57939b.mo3594b(new RemoteViews(this.f275417p.getPackageName(), R.layout.empty_bottombar), new int[0], (PendingIntent) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo91219b(Uri uri) {
        C98572h a;
        C58976aa aaVar = C58975e.f156826a;
        if (this.f275403b.mo79743a(C90110fh.f250579D) > 0 && !this.f275418q.mo78133v()) {
            Runnable runnable = this.f275415n;
            if (runnable != null) {
                runnable.run();
                this.f275415n = null;
            }
            this.f275413l = null;
            this.f275414m = null;
            if (uri != null) {
                Uri a2 = this.f275419r.mo91217a(uri);
                long b = this.f275411j.mo26870b();
                if (a2.equals(this.f275421t) || (this.f275408g.f275506k.mo25668g() && (a = this.f275420s.mo91191a()) != null && a.mo79780c())) {
                    C98603ah ahVar = new C98603ah(this, a2, b);
                    if (!mo91221d()) {
                        this.f275413l = ahVar;
                    } else {
                        ahVar.run();
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo91220c(C98620c cVar) {
        if (this.f275403b.mo79746e(C90110fh.f250651aw)) {
            this.f275414m = null;
        }
        C20670z zVar = this.f275408g.f275506k;
        if (zVar.f57939b.mo3594b(cVar.mo91224b(), new int[]{R.id.customtabs_bottom_bar}, PendingIntent.getActivity(this.f275417p, 0, cVar.mo91223a(), 201326592))) {
            C58976aa aaVar = C58975e.f156826a;
            if (this.f275416o) {
                cVar.mo91225c();
            } else {
                this.f275414m = new C98606ak(cVar);
            }
        } else {
            C58976aa aaVar2 = C58975e.f156826a;
            ((C89911f) this.f275404c.mo27525b()).mo83756b(new C90452a(211, C89885b.CUSTOM_TABS_BOTTOMBAR_SETTING_FAILED_VALUE)).mo83721a();
        }
    }

    /* renamed from: d */
    public final boolean mo91221d() {
        return ((AccessibilityManager) this.f275417p.getSystemService("accessibility")).isTouchExplorationEnabled();
    }
}
