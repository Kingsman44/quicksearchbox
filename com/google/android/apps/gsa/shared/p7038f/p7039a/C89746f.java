package com.google.android.apps.gsa.shared.p7038f.p7039a;

import android.content.pm.LauncherApps;
import com.google.android.apps.gsa.shared.p7066m.C90019by;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.search.assistant.verticals.p9880a.p9883b.C130333h;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.shared.f.a.f */
/* compiled from: PG */
public final class C89746f {

    /* renamed from: a */
    public static final C58974d f242925a = C58974d.m91136j();

    /* renamed from: b */
    public final LauncherApps f242926b;

    /* renamed from: c */
    private final C22871g f242927c;

    /* renamed from: d */
    private final Optional f242928d;

    /* renamed from: e */
    private final C90021c f242929e;

    /* renamed from: f */
    private final C22871g f242930f;

    public C89746f(LauncherApps launcherApps, C22871g gVar, Optional optional, C90021c cVar, C22871g gVar2) {
        this.f242926b = launcherApps;
        this.f242927c = gVar;
        this.f242928d = optional;
        this.f242929e = cVar;
        this.f242930f = gVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C60870cx mo83618a(LauncherApps.ShortcutQuery shortcutQuery, C58528ij ijVar) {
        C60870cx cxVar;
        C60870cx cxVar2;
        if (!this.f242929e.mo79746e(C90019by.f248086t)) {
            cxVar = C60856cj.m92900i(ijVar);
        } else if (this.f242928d.isEmpty()) {
            cxVar = C60856cj.m92900i(C58733pz.f156496a);
        } else {
            cxVar = this.f242930f.mo28209i(((C130333h) this.f242928d.get()).mo109665a(), "Use AppPreferenceData to filter Packages", new C89743c(ijVar));
        }
        LauncherApps launcherApps = this.f242926b;
        if (launcherApps == null) {
            ((C58970a) ((C58970a) f242925a.mo56225c()).mo56372aa(10197)).mo56386p("launcherapps handle is null");
            cxVar2 = C60856cj.m92900i(C58485gu.m89845m());
        } else if (!launcherApps.hasShortcutHostPermission()) {
            ((C58970a) ((C58970a) f242925a.mo56225c()).mo56372aa(10196)).mo56386p("AndroidShortcutFetcher is not being called from a package that has permissions to access shortcuts.");
            cxVar2 = C60856cj.m92900i(C58485gu.m89845m());
        } else {
            C22871g gVar = this.f242927c;
            cxVar2 = gVar.mo28205e(gVar.mo28201a("Fetch shortcuts", new C89744d(this, shortcutQuery)), "Fetch shortcuts from LauncherApps", IllegalStateException.class, C89745e.f242924a);
        }
        return C60856cj.m92895d(cxVar, cxVar2).mo57334a(new C89723a(cxVar2, cxVar), C60826bg.f164896a);
    }
}
