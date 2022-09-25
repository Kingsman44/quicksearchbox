package com.google.android.apps.search.googleapp.customtabs.p10152d;

import android.content.ComponentName;
import android.content.Context;
import androidx.p104d.p105a.C2164c;
import com.google.android.libraries.p1703d.C20665u;
import com.google.android.libraries.p1703d.C20668x;
import com.google.common.p4526f.C59052c;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.d.c */
/* compiled from: PG */
final class C133742c extends C20668x {

    /* renamed from: b */
    private final C2164c f364271b;

    /* renamed from: c */
    private final C133745f f364272c;

    /* renamed from: d */
    private final Object f364273d = new Object();

    /* renamed from: e */
    private final Context f364274e;

    /* renamed from: f */
    private boolean f364275f = false;

    /* renamed from: g */
    private Runnable f364276g = null;

    public C133742c(Context context, C2164c cVar, C133745f fVar) {
        this.f364274e = context;
        this.f364272c = fVar;
        this.f364271b = cVar;
    }

    /* renamed from: b */
    public final void mo25656b(C20665u uVar) {
        ((C59052c) ((C59052c) C133746g.f364284b.mo56224b()).mo56372aa(40082)).mo56386p("Custom Tabs Service connected");
        synchronized (this.f364273d) {
            if (!this.f364275f) {
                C133746g gVar = new C133746g(uVar, this, this.f364272c.f364282c);
                Objects.requireNonNull(gVar);
                this.f364276g = new C133741b(gVar);
                this.f364271b.mo5437b(gVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0047, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo111377c() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f364273d
            monitor-enter(r0)
            boolean r1 = r4.f364275f     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return
        L_0x0009:
            r1 = 1
            r4.f364275f = r1     // Catch:{ all -> 0x0048 }
            android.content.Context r1 = r4.f364274e     // Catch:{ RuntimeException -> 0x0012 }
            r1.unbindService(r4)     // Catch:{ RuntimeException -> 0x0012 }
            goto L_0x002f
        L_0x0012:
            r1 = move-exception
            com.google.common.f.e r2 = com.google.android.apps.search.googleapp.customtabs.p10152d.C133746g.f364284b     // Catch:{ all -> 0x0048 }
            com.google.common.f.x r2 = r2.mo56226d()     // Catch:{ all -> 0x0048 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x0048 }
            com.google.common.f.x r1 = r2.mo56382g(r1)     // Catch:{ all -> 0x0048 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0048 }
            r2 = 40085(0x9c95, float:5.6171E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)     // Catch:{ all -> 0x0048 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0048 }
            java.lang.String r2 = "Unable to unbind Custom Tabs Service"
            r1.mo56386p(r2)     // Catch:{ all -> 0x0048 }
        L_0x002f:
            androidx.d.a.c r1 = r4.f364271b     // Catch:{ all -> 0x0048 }
            com.google.android.apps.search.googleapp.customtabs.d.a r2 = new com.google.android.apps.search.googleapp.customtabs.d.a     // Catch:{ all -> 0x0048 }
            java.lang.String r3 = "Service disconnected"
            r2.<init>((java.lang.String) r3)     // Catch:{ all -> 0x0048 }
            r1.mo5439d(r2)     // Catch:{ all -> 0x0048 }
            java.lang.Runnable r1 = r4.f364276g     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x0046
            com.google.android.apps.search.googleapp.customtabs.d.b r1 = (com.google.android.apps.search.googleapp.customtabs.p10152d.C133741b) r1     // Catch:{ all -> 0x0048 }
            com.google.android.apps.search.googleapp.customtabs.d.g r1 = r1.f364270a     // Catch:{ all -> 0x0048 }
            r1.mo111382a()     // Catch:{ all -> 0x0048 }
        L_0x0046:
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return
        L_0x0048:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.customtabs.p10152d.C133742c.mo111377c():void");
    }

    public final void onBindingDied(ComponentName componentName) {
        ((C59052c) ((C59052c) C133746g.f364284b.mo56226d()).mo56372aa(40081)).mo56386p("Custom Tabs binding died");
        mo111377c();
    }

    public final void onNullBinding(ComponentName componentName) {
        ((C59052c) ((C59052c) C133746g.f364284b.mo56226d()).mo56372aa(40083)).mo56386p("Custom Tabs connection responded with a null binding");
        mo111377c();
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        ((C59052c) ((C59052c) C133746g.f364284b.mo56226d()).mo56372aa(40084)).mo56386p("Custom Tabs connection lost");
        mo111377c();
    }
}
