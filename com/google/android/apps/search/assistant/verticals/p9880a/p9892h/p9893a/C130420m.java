package com.google.android.apps.search.assistant.verticals.p9880a.p9892h.p9893a;

import android.content.pm.LauncherApps;
import android.os.Process;
import android.os.UserHandle;
import com.google.apps.tiktok.concurrent.C46428ao;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.apps.search.assistant.verticals.a.h.a.m */
/* compiled from: PG */
public final class C130420m extends LauncherApps.Callback implements C130415h {

    /* renamed from: a */
    public static final C58974d f357376a = C58974d.m91136j();

    /* renamed from: b */
    public final Map f357377b = new ConcurrentHashMap();

    /* renamed from: c */
    private final LauncherApps f357378c;

    /* renamed from: d */
    private final C60887da f357379d;

    /* renamed from: e */
    private final C46428ao f357380e;

    /* renamed from: f */
    private final C130414g f357381f;

    public C130420m(LauncherApps launcherApps, C60887da daVar, C46428ao aoVar, C130414g gVar) {
        this.f357378c = launcherApps;
        this.f357379d = daVar;
        this.f357380e = aoVar;
        this.f357381f = gVar;
    }

    /* renamed from: a */
    public final C60870cx mo109694a() {
        this.f357378c.registerCallback(this, this.f357380e);
        return mo109695b();
    }

    /* renamed from: b */
    public final C60870cx mo109695b() {
        C60870cx a = this.f357381f.mo109692a();
        C130416i iVar = new C130416i(this);
        return C60922j.m93044g(a, C47810es.m84963c(iVar), this.f357379d);
    }

    /* renamed from: c */
    public final C60870cx mo109696c() {
        this.f357378c.unregisterCallback(this);
        return C60866ct.f164955a;
    }

    /* renamed from: d */
    public final List mo109697d(String str) {
        if (this.f357377b.containsKey(str)) {
            return (List) this.f357377b.get(str);
        }
        return Collections.synchronizedList(new ArrayList());
    }

    public final void onPackageAdded(String str, UserHandle userHandle) {
    }

    public final void onPackageChanged(String str, UserHandle userHandle) {
    }

    public final void onPackageRemoved(String str, UserHandle userHandle) {
        if (Process.myUserHandle().equals(userHandle)) {
            this.f357377b.remove(str);
        }
    }

    public final void onPackagesAvailable(String[] strArr, UserHandle userHandle, boolean z) {
    }

    public final void onPackagesUnavailable(String[] strArr, UserHandle userHandle, boolean z) {
    }

    public final void onShortcutsChanged(String str, List list, UserHandle userHandle) {
        if (Process.myUserHandle().equals(userHandle)) {
            C60870cx b = this.f357381f.mo109693b(new C58759qy(str));
            C130419l lVar = new C130419l(this, str);
            C60856cj.m92911t(b, C47810es.m84974n(lVar), this.f357379d);
        }
    }
}
