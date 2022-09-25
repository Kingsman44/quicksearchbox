package com.google.android.apps.gsa.staticplugins.actions.p7361g;

import android.content.Context;
import com.google.android.apps.gsa.search.shared.actions.util.C87483e;
import com.google.android.apps.gsa.search.shared.actions.util.C87484f;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.g.a */
/* compiled from: PG */
public abstract class C93387a implements C87484f {

    /* renamed from: d */
    private static C87484f f260465d;

    /* renamed from: a */
    public volatile boolean f260466a;

    /* renamed from: b */
    public volatile C87483e f260467b;

    /* renamed from: c */
    public boolean f260468c;

    /* renamed from: f */
    public static C87484f m153629f(Context context) {
        if (f260465d == null) {
            f260465d = new C93394h(context);
        }
        return f260465d;
    }

    /* renamed from: a */
    public final void mo81470a(boolean z) {
        this.f260468c = z;
    }

    /* renamed from: b */
    public void mo81471b(C87483e eVar) {
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0022, code lost:
        return false;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo81472c(android.content.pm.PackageManager r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0024 }
            boolean r0 = r1.f260466a     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x000a
            monitor-exit(r1)
            r2 = 1
            return r2
        L_0x000a:
            java.lang.String r0 = "android.hardware.camera"
            boolean r0 = r2.hasSystemFeature(r0)     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = "android.hardware.camera.flash"
            boolean r2 = r2.hasSystemFeature(r0)     // Catch:{ all -> 0x0024 }
            if (r2 != 0) goto L_0x001b
            goto L_0x0021
        L_0x001b:
            boolean r2 = r1.mo87651h()     // Catch:{ all -> 0x0024 }
            monitor-exit(r1)
            return r2
        L_0x0021:
            monitor-exit(r1)
            r2 = 0
            return r2
        L_0x0024:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.actions.p7361g.C93387a.mo81472c(android.content.pm.PackageManager):boolean");
    }

    /* renamed from: d */
    public final boolean mo81473d() {
        C58976aa aaVar = C58975e.f156826a;
        return this.f260466a;
    }

    /* renamed from: e */
    public final boolean mo81474e(boolean z) {
        boolean i;
        C58976aa aaVar = C58975e.f156826a;
        if (z == this.f260466a) {
            return true;
        }
        synchronized (this) {
            i = mo87652i();
        }
        if (i) {
            mo87650g();
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo87650g() {
        C87483e eVar = this.f260467b;
        if (eVar != null) {
            eVar.mo81469a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract boolean mo87651h();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract boolean mo87652i();
}
