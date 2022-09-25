package com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.LauncherActivityInfo;
import android.content.pm.LauncherApps;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Process;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113259al;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113425ff;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58881cr;
import com.google.common.base.C58882cs;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.q.aa */
/* compiled from: PG */
public final class C113116aa implements C113206m {

    /* renamed from: f */
    private static final C59071e f313401f = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.q.aa");

    /* renamed from: a */
    public final Object f313402a = new Object();

    /* renamed from: b */
    public final Context f313403b;

    /* renamed from: c */
    public final C22871g f313404c;

    /* renamed from: d */
    public final C113178ci f313405d;

    /* renamed from: e */
    public final Map f313406e;

    /* renamed from: g */
    private final Object f313407g = new Object();

    /* renamed from: h */
    private final C113425ff f313408h;

    /* renamed from: i */
    private final C86124t f313409i;

    /* renamed from: j */
    private final C68214a f313410j;

    /* renamed from: k */
    private C58881cr f313411k;

    /* renamed from: l */
    private List f313412l;

    /* renamed from: m */
    private LauncherApps f313413m;

    public C113116aa(Context context, C113425ff ffVar, C22871g gVar, C86124t tVar, C113178ci ciVar, C68214a aVar) {
        this.f313403b = context;
        this.f313408h = ffVar;
        this.f313404c = gVar;
        this.f313409i = tVar;
        this.f313405d = ciVar;
        this.f313410j = aVar;
        this.f313406e = new HashMap();
    }

    /* renamed from: p */
    private final Stream m187100p(List list) {
        return Collection.EL.stream(list).map(new C113217x(this)).filter(C113218y.f313552a).map(C113219z.f313553a).filter(C113207n.f313540a);
    }

    /* renamed from: a */
    public final Drawable mo99842a(ApplicationInfo applicationInfo) {
        return this.f313403b.getPackageManager().getApplicationIcon(applicationInfo);
    }

    /* renamed from: b */
    public final C58485gu mo99843b(List list) {
        return (C58485gu) m187100p(list).collect(C58370cn.f155946a);
    }

    /* renamed from: c */
    public final C60870cx mo99844c() {
        C60870cx cxVar;
        synchronized (this.f313407g) {
            C58881cr crVar = this.f313411k;
            if (crVar == null || ((C60870cx) crVar.mo6453a()).isCancelled()) {
                this.f313411k = new C58882cs(new C113214u(this), this.f313409i.mo79743a(C90063do.f249492eZ), TimeUnit.MINUTES);
            }
            cxVar = (C60870cx) this.f313411k.mo6453a();
        }
        return cxVar;
    }

    /* renamed from: d */
    public final Optional mo99845d(String str) {
        try {
            return Optional.m71637of(this.f313403b.getPackageManager().getApplicationIcon(str));
        } catch (PackageManager.NameNotFoundException e) {
            C59104x c = f313401f.mo56225c();
            c.mo56378ag(C58975e.f156826a, "TapasAppUtils");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(27947)).mo56389s("Logo for app %s could not be loaded", str);
            return Optional.empty();
        }
    }

    /* renamed from: e */
    public final Optional mo99846e(String str) {
        try {
            ApplicationInfo applicationInfo = this.f313403b.getPackageManager().getApplicationInfo(str, 0);
            C58976aa aaVar = C58975e.f156826a;
            return Optional.m71637of(applicationInfo);
        } catch (PackageManager.NameNotFoundException unused) {
            C58976aa aaVar2 = C58975e.f156826a;
            return Optional.empty();
        }
    }

    /* renamed from: f */
    public final Optional mo99847f(String str) {
        if (this.f313413m == null) {
            this.f313413m = (LauncherApps) this.f313403b.getSystemService("launcherapps");
        }
        LauncherApps launcherApps = this.f313413m;
        if (launcherApps == null) {
            return Optional.empty();
        }
        List<LauncherActivityInfo> activityList = launcherApps.getActivityList(str, Process.myUserHandle());
        if (activityList.isEmpty()) {
            return Optional.empty();
        }
        return Optional.m71637of(activityList.get(0).getLabel());
    }

    /* renamed from: g */
    public final Optional mo99848g(List list) {
        return m187100p(list).findFirst();
    }

    /* renamed from: h */
    public final Optional mo99849h() {
        if (!this.f313408h.mo100139e()) {
            return Optional.empty();
        }
        return Optional.m71637of((C58485gu) Collection.EL.stream(this.f313403b.getPackageManager().getInstalledApplications(0)).filter(C113212s.f313546a).map(C113213t.f313547a).collect(C58370cn.f155946a));
    }

    /* renamed from: i */
    public final Optional mo99850i(PackageManager packageManager, String str) {
        return Optional.ofNullable(packageManager.getLaunchIntentForPackage(str));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: com.google.assistant.ad.d.b.a.j} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p3186j$.util.Optional mo99851j(java.lang.String r4) {
        /*
            r3 = this;
            dagger.a r0 = r3.f313410j
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.tapas.l.g.ap r0 = (com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g.C112471ap) r0
            j$.util.Optional r0 = r0.mo99533d()
            boolean r1 = r0.isPresent()
            if (r1 == 0) goto L_0x003c
            java.lang.Object r0 = r0.get()
            com.google.assistant.ad.d.b.a.m r0 = (com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48652m) r0
            com.google.assistant.ad.d.b.a.j r1 = com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48649j.f125734d
            r4.getClass()
            com.google.protobuf.dn r0 = r0.f125743b
            boolean r2 = r0.containsKey(r4)
            if (r2 == 0) goto L_0x002c
            java.lang.Object r0 = r0.get(r4)
            r1 = r0
            com.google.assistant.ad.d.b.a.j r1 = (com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48649j) r1
        L_0x002c:
            java.lang.String r0 = r1.f125738c
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0035
            goto L_0x003c
        L_0x0035:
            java.lang.String r4 = r1.f125738c
            j$.util.Optional r4 = p3186j$.util.Optional.m71637of(r4)
            return r4
        L_0x003c:
            java.lang.Object r0 = r3.f313402a
            monitor-enter(r0)
            java.util.Map r1 = r3.f313406e     // Catch:{ all -> 0x0067 }
            boolean r1 = r1.containsKey(r4)     // Catch:{ all -> 0x0067 }
            if (r1 == 0) goto L_0x0055
            java.util.Map r1 = r3.f313406e     // Catch:{ all -> 0x0067 }
            java.lang.Object r4 = r1.get(r4)     // Catch:{ all -> 0x0067 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0067 }
            j$.util.Optional r4 = p3186j$.util.Optional.m71637of(r4)     // Catch:{ all -> 0x0067 }
            monitor-exit(r0)     // Catch:{ all -> 0x0067 }
            return r4
        L_0x0055:
            monitor-exit(r0)     // Catch:{ all -> 0x0067 }
            com.google.android.libraries.gsa.k.g r0 = r3.f313404c
            com.google.android.apps.gsa.staticplugins.opa.tapas.q.o r1 = new com.google.android.apps.gsa.staticplugins.opa.tapas.q.o
            r1.<init>(r3, r4)
            java.lang.String r4 = "get packageNameToAppNameMap for a package name"
            r0.mo28212l(r4, r1)
            j$.util.Optional r4 = p3186j$.util.Optional.empty()
            return r4
        L_0x0067:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0067 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113116aa.mo99851j(java.lang.String):j$.util.Optional");
    }

    /* renamed from: k */
    public final Optional mo99852k(String str) {
        if (this.f313409i.mo79746e(C90063do.f249262aH)) {
            return Optional.m71637of(C113259al.m187316a(str));
        }
        return mo99845d(str).map(C113211r.f313545a);
    }

    /* renamed from: l */
    public final CharSequence mo99853l(ApplicationInfo applicationInfo) {
        return this.f313403b.getPackageManager().getApplicationLabel(applicationInfo);
    }

    /* renamed from: m */
    public final boolean mo99854m(String str) {
        Optional e = mo99846e(str);
        return e.isPresent() && ((ApplicationInfo) e.get()).enabled;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo99855n(java.lang.String r5) {
        /*
            r4 = this;
            android.content.Context r0 = r4.f313403b
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            r3 = 0
            if (r1 < r2) goto L_0x001f
            android.content.pm.InstallSourceInfo r1 = r0.getInstallSourceInfo(r5)     // Catch:{ NameNotFoundException -> 0x001d }
            java.lang.String r3 = r1.getInstallingPackageName()
            if (r3 == 0) goto L_0x0018
            goto L_0x0023
        L_0x0018:
            java.lang.String r3 = r1.getInitiatingPackageName()
            goto L_0x0023
        L_0x001d:
            goto L_0x0023
        L_0x001f:
            java.lang.String r3 = r0.getInstallerPackageName(r5)     // Catch:{  }
        L_0x0023:
            java.lang.String r1 = "com.android.vending"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x002d
            r5 = 0
            return r5
        L_0x002d:
            java.util.List r1 = r4.f313412l
            if (r1 != 0) goto L_0x0039
            r1 = 1048576(0x100000, float:1.469368E-39)
            java.util.List r0 = r0.getInstalledApplications(r1)
            r4.f313412l = r0
        L_0x0039:
            java.util.List r0 = r4.f313412l
            j$.util.stream.Stream r0 = p3186j$.util.Collection.EL.stream(r0)
            com.google.android.apps.gsa.staticplugins.opa.tapas.q.p r1 = new com.google.android.apps.gsa.staticplugins.opa.tapas.q.p
            r1.<init>(r5)
            boolean r5 = r0.noneMatch(r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113116aa.mo99855n(java.lang.String):boolean");
    }

    /* renamed from: o */
    public final boolean mo99856o(ApplicationInfo applicationInfo) {
        return (applicationInfo.flags & 129) == 0;
    }
}
