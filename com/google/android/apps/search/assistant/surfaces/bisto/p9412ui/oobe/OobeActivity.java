package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import androidx.lifecycle.C2368bp;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.p9415b.C124825a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.p9415b.C124827c;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.p9415b.C124828d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.p9415b.C124829e;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.C47211g;
import com.google.apps.tiktok.inject.baseclasses.C47212h;
import com.google.apps.tiktok.inject.p3659d.C47241j;
import com.google.apps.tiktok.p3674l.p3680d.C47401a;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47762d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47818f;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.apps.tiktok.tracing.C47849i;
import com.google.apps.tiktok.tracing.C47851k;
import com.google.common.p4526f.C59052c;
import com.google.common.p4552o.C60103kw;
import com.google.common.p4552o.C60106kz;
import com.google.common.p4552o.C60298nk;
import com.google.common.p4552o.C60300nm;
import com.google.protobuf.C63042fg;
import com.google.protobuf.contrib.android.ProtoParsers;
import com.google.protobuf.p4750c.C62950b;
import dagger.hilt.android.internal.managers.C68314a;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.OobeActivity */
/* compiled from: PG */
public final class OobeActivity extends C124811an implements C47231d, C47211g {

    /* renamed from: k */
    private C124838bi f344268k;

    /* renamed from: l */
    private final C47851k f344269l = new C47851k(this, this);

    /* renamed from: m */
    private boolean f344270m;

    /* renamed from: n */
    private Context f344271n;

    /* renamed from: o */
    private C2393x f344272o;

    /* renamed from: p */
    private boolean f344273p;

    public OobeActivity() {
        SystemClock.elapsedRealtime();
    }

    /* renamed from: x */
    private final void m204540x() {
        if (this.f344268k != null) {
            return;
        }
        if (!this.f344270m) {
            throw new IllegalStateException("createPeer() called outside of onCreate");
        } else if (!this.f344273p || isFinishing()) {
            C47558bi a = C47831fm.m85006a("CreateComponent");
            try {
                mo106651v().mo17653jN();
                a.close();
                C47558bi a2 = C47831fm.m85006a("CreatePeer");
                try {
                    this.f344268k = ((C124841bl) mo106651v().mo17653jN()).mo106668ac();
                    a2.close();
                    return;
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                } catch (Throwable th) {
                    C124832bc.m204620a(th, th);
                }
            } catch (Throwable th2) {
                C124832bc.m204620a(th, th2);
            }
        } else {
            throw new IllegalStateException("createPeer() called after destroyed.");
        }
        throw th;
        throw th;
    }

    public final void applyOverrideConfiguration(Configuration configuration) {
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            baseContext = this.f344271n;
        }
        C47401a.m84249b(baseContext, configuration);
        super.applyOverrideConfiguration(configuration);
    }

    /* access modifiers changed from: protected */
    public final void attachBaseContext(Context context) {
        this.f344271n = context;
        super.attachBaseContext(C47401a.m84248a(context));
        this.f344271n = null;
    }

    public final C2384o getLifecycle() {
        if (this.f344272o == null) {
            this.f344272o = new C47212h(this);
        }
        return this.f344272o;
    }

    public final void invalidateOptionsMenu() {
        C47573bx w = C47831fm.m85028w();
        try {
            mo1322k().mo1180i();
            w.close();
            return;
        } catch (Throwable th) {
            C124832bc.m204620a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    /* renamed from: jA */
    public final void mo1321jA() {
    }

    /* renamed from: m */
    public final boolean mo1323m() {
        C47573bx i = this.f344269l.mo51682i();
        try {
            boolean m = super.mo1323m();
            if (i != null) {
                i.close();
            }
            return m;
        } catch (Throwable th) {
            C124832bc.m204620a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo1324o() {
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx r = this.f344269l.mo51691r();
        try {
            super.onActivityResult(i, i2, intent);
            if (r != null) {
                r.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C124832bc.m204620a(th, th);
        }
        throw th;
    }

    public final void onBackPressed() {
        C47573bx a = this.f344269l.mo51674a();
        try {
            super.onBackPressed();
            a.close();
            return;
        } catch (Throwable th) {
            C124832bc.m204620a(th, th);
        }
        throw th;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        C47573bx k = this.f344269l.mo51684k("onConfigurationChanged");
        try {
            super.onConfigurationChanged(configuration);
            if (k != null) {
                k.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C124832bc.m204620a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            java.lang.String r0 = "Logger"
            java.lang.String r1 = "args"
            com.google.apps.tiktok.tracing.k r2 = r9.f344269l
            com.google.apps.tiktok.tracing.bx r2 = r2.mo51692s()
            r3 = 1
            r9.f344270m = r3     // Catch:{ all -> 0x019d }
            r9.m204540x()     // Catch:{ all -> 0x019d }
            androidx.lifecycle.o r4 = r9.getLifecycle()     // Catch:{ all -> 0x019d }
            com.google.apps.tiktok.tracing.k r5 = r9.f344269l     // Catch:{ all -> 0x019d }
            com.google.apps.tiktok.inject.baseclasses.h r4 = (com.google.apps.tiktok.inject.baseclasses.C47212h) r4     // Catch:{ all -> 0x019d }
            r4.mo51120i(r5)     // Catch:{ all -> 0x019d }
            dagger.hilt.android.internal.managers.a r4 = r9.mo106651v()     // Catch:{ all -> 0x019d }
            java.lang.Object r4 = r4.mo17653jN()     // Catch:{ all -> 0x019d }
            com.google.apps.tiktok.inject.d.f r4 = (com.google.apps.tiktok.inject.p3659d.C47237f) r4     // Catch:{ all -> 0x019d }
            com.google.apps.tiktok.e.a r4 = r4.mo51141bP()     // Catch:{ all -> 0x019d }
            r4.mo50899a()     // Catch:{ all -> 0x019d }
            super.onCreate(r10)     // Catch:{ all -> 0x019d }
            r9.m204540x()     // Catch:{ all -> 0x019d }
            com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.bi r4 = r9.f344268k     // Catch:{ all -> 0x019d }
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x019d }
            com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.OobeActivity r5 = r4.f344409b     // Catch:{ all -> 0x019d }
            android.content.Intent r5 = r5.getIntent()     // Catch:{ all -> 0x019d }
            boolean r6 = r5.hasExtra(r1)     // Catch:{ all -> 0x019d }
            java.lang.String r7 = "OobeActivity"
            if (r6 != 0) goto L_0x0059
            com.google.common.f.e r10 = com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.C124838bi.f344408a     // Catch:{ all -> 0x019d }
            com.google.common.f.x r10 = r10.mo56225c()     // Catch:{ all -> 0x019d }
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x019d }
            r10.mo56378ag(r0, r7)     // Catch:{ all -> 0x019d }
            java.lang.String r0 = "Missing args"
            r1 = 36344(0x8df8, float:5.0929E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r1)).mo56386p(r0)     // Catch:{ all -> 0x019d }
            goto L_0x0170
        L_0x0059:
            com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.bo r6 = com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.C124844bo.f344417m     // Catch:{ ct -> 0x015d }
            com.google.protobuf.ba r8 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x015d }
            com.google.protobuf.MessageLite r1 = com.google.protobuf.contrib.android.ProtoParsers.m95519b(r5, r1, r6, r8)     // Catch:{ ct -> 0x015d }
            com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.bo r1 = (com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.C124844bo) r1     // Catch:{ ct -> 0x015d }
            r4.f344410c = r1     // Catch:{ ct -> 0x015d }
            com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.bo r1 = r4.f344410c     // Catch:{ all -> 0x019d }
            int r1 = r1.f344419a     // Catch:{ all -> 0x019d }
            r1 = r1 & r3
            if (r1 == 0) goto L_0x0149
            if (r10 == 0) goto L_0x00df
            androidx.lifecycle.bp r1 = new androidx.lifecycle.bp     // Catch:{ ct -> 0x00c8 }
            com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.OobeActivity r5 = r4.f344409b     // Catch:{ ct -> 0x00c8 }
            r1.<init>(r5)     // Catch:{ ct -> 0x00c8 }
            java.lang.Class<com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.OobeActivityViewModel> r5 = com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.OobeActivityViewModel.class
            androidx.lifecycle.bf r1 = r1.mo5770a(r5)     // Catch:{ ct -> 0x00c8 }
            com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.OobeActivityViewModel r1 = (com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.OobeActivityViewModel) r1     // Catch:{ ct -> 0x00c8 }
            com.google.common.f.e r5 = com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.OobeActivityViewModel.f344274a     // Catch:{ ct -> 0x00c8 }
            com.google.common.f.x r5 = r5.mo56224b()     // Catch:{ ct -> 0x00c8 }
            java.lang.String r6 = "onRestoreInstanceState"
            r8 = 36348(0x8dfc, float:5.0934E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r8)).mo56386p(r6)     // Catch:{ ct -> 0x00c8 }
            com.google.protobuf.ba r5 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x00c8 }
            java.lang.String r6 = "Datalayer"
            com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.watches.z r8 = com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.watches.C124979z.f344847e     // Catch:{ ct -> 0x00c8 }
            com.google.protobuf.MessageLite r6 = com.google.protobuf.contrib.android.ProtoParsers.m95520c(r10, r6, r8, r5)     // Catch:{ ct -> 0x00c8 }
            com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.watches.z r6 = (com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.watches.C124979z) r6     // Catch:{ ct -> 0x00c8 }
            r1.f344277d = r6     // Catch:{ ct -> 0x00c8 }
            boolean r6 = r10.containsKey(r0)     // Catch:{ ct -> 0x00c8 }
            if (r6 == 0) goto L_0x00bf
            com.google.android.apps.gsa.binaries.satin.app.ayy r6 = r1.f344280g     // Catch:{ ct -> 0x00c8 }
            com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.b.e r8 = com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.p9415b.C124829e.f344393d     // Catch:{ ct -> 0x00c8 }
            com.google.protobuf.MessageLite r0 = com.google.protobuf.contrib.android.ProtoParsers.m95520c(r10, r0, r8, r5)     // Catch:{ ct -> 0x00c8 }
            com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.b.e r0 = (com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.p9415b.C124829e) r0     // Catch:{ ct -> 0x00c8 }
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)     // Catch:{ ct -> 0x00c8 }
            j$.util.Optional r5 = p3186j$.util.Optional.empty()     // Catch:{ ct -> 0x00c8 }
            j$.util.Optional r8 = p3186j$.util.Optional.empty()     // Catch:{ ct -> 0x00c8 }
            com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.b.c r0 = r6.a(r0, r5, r8)     // Catch:{ ct -> 0x00c8 }
            r1.f344278e = r0     // Catch:{ ct -> 0x00c8 }
        L_0x00bf:
            java.lang.String r0 = "vm_enabled"
            boolean r10 = r10.getBoolean(r0)     // Catch:{ ct -> 0x00c8 }
            r1.f344279f = r10     // Catch:{ ct -> 0x00c8 }
            goto L_0x00df
        L_0x00c8:
            r10 = move-exception
            com.google.common.f.e r0 = com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.C124838bi.f344408a     // Catch:{ all -> 0x019d }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ all -> 0x019d }
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x019d }
            r0.mo56378ag(r1, r7)     // Catch:{ all -> 0x019d }
            java.lang.String r1 = "Invalid saved state"
            r5 = 36341(0x8df5, float:5.0925E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56382g(r10)).mo56372aa(r5)).mo56386p(r1)     // Catch:{ all -> 0x019d }
            r4.mo106667a()     // Catch:{ all -> 0x019d }
        L_0x00df:
            com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.OobeActivity r10 = r4.f344409b     // Catch:{ all -> 0x019d }
            com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.bo r0 = r4.f344410c     // Catch:{ all -> 0x019d }
            boolean r1 = r0.f344429k     // Catch:{ all -> 0x019d }
            if (r3 == r1) goto L_0x00eb
            r1 = 2132150613(0x7f160955, float:1.9943265E38)
            goto L_0x00ee
        L_0x00eb:
            r1 = 2132150612(0x7f160954, float:1.9943263E38)
        L_0x00ee:
            r10.setTheme(r1)     // Catch:{ all -> 0x019d }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x019d }
            r5 = 31
            if (r1 < r5) goto L_0x0109
            android.content.res.Resources$Theme r10 = r10.getTheme()     // Catch:{ all -> 0x019d }
            boolean r0 = r0.f344429k     // Catch:{ all -> 0x019d }
            if (r3 == r0) goto L_0x0103
            r0 = 2132148333(0x7f16006d, float:1.9938641E38)
            goto L_0x0106
        L_0x0103:
            r0 = 2132148332(0x7f16006c, float:1.993864E38)
        L_0x0106:
            r10.applyStyle(r0, r3)     // Catch:{ all -> 0x019d }
        L_0x0109:
            com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.OobeActivity r10 = r4.f344409b     // Catch:{ all -> 0x019d }
            r0 = 2131624169(0x7f0e00e9, float:1.887551E38)
            r10.setContentView((int) r0)     // Catch:{ all -> 0x019d }
            com.google.apps.tiktok.account.api.controller.b r10 = r4.f344411d     // Catch:{ all -> 0x019d }
            com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.OobeActivity r0 = r4.f344409b     // Catch:{ all -> 0x019d }
            com.google.apps.tiktok.account.api.controller.bw r0 = com.google.apps.tiktok.account.api.controller.C46013bx.m82202f(r0)     // Catch:{ all -> 0x019d }
            com.google.common.b.gp r1 = r0.mo50147b()     // Catch:{ all -> 0x019d }
            java.lang.Class<com.google.apps.tiktok.account.e.d.h> r3 = com.google.apps.tiktok.account.p3616e.p3620d.C46348h.class
            r1.mo55395g(r3)     // Catch:{ all -> 0x019d }
            com.google.common.b.gp r1 = r0.mo50147b()     // Catch:{ all -> 0x019d }
            java.lang.Class<com.google.apps.tiktok.account.e.a.a> r3 = com.google.apps.tiktok.account.p3616e.p3617a.C46332a.class
            r1.mo55395g(r3)     // Catch:{ all -> 0x019d }
            com.google.apps.tiktok.account.api.controller.bx r0 = r0.mo50146a()     // Catch:{ all -> 0x019d }
            r10.mo50083f(r0)     // Catch:{ all -> 0x019d }
            com.google.apps.tiktok.account.api.controller.b r10 = r4.f344411d     // Catch:{ all -> 0x019d }
            com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.bh r0 = new com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.bh     // Catch:{ all -> 0x019d }
            r0.<init>(r4)     // Catch:{ all -> 0x019d }
            r10.mo50082e(r0)     // Catch:{ all -> 0x019d }
            com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.OobeActivity r10 = r4.f344409b     // Catch:{ all -> 0x019d }
            androidx.activity.OnBackPressedDispatcher r0 = r10.f2707h     // Catch:{ all -> 0x019d }
            com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.bg r1 = new com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.bg     // Catch:{ all -> 0x019d }
            r1.<init>(r4)     // Catch:{ all -> 0x019d }
            r0.mo3339b(r10, r1)     // Catch:{ all -> 0x019d }
            goto L_0x0173
        L_0x0149:
            com.google.common.f.e r10 = com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.C124838bi.f344408a     // Catch:{ all -> 0x019d }
            com.google.common.f.x r10 = r10.mo56225c()     // Catch:{ all -> 0x019d }
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x019d }
            r10.mo56378ag(r0, r7)     // Catch:{ all -> 0x019d }
            java.lang.String r0 = "No DeviceId"
            r1 = 36342(0x8df6, float:5.0926E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r1)).mo56386p(r0)     // Catch:{ all -> 0x019d }
            goto L_0x0170
        L_0x015d:
            com.google.common.f.e r10 = com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.C124838bi.f344408a     // Catch:{ all -> 0x019d }
            com.google.common.f.x r10 = r10.mo56225c()     // Catch:{ all -> 0x019d }
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x019d }
            r10.mo56378ag(r0, r7)     // Catch:{ all -> 0x019d }
            java.lang.String r0 = "Invalid args"
            r1 = 36343(0x8df7, float:5.0927E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r1)).mo56386p(r0)     // Catch:{ all -> 0x019d }
        L_0x0170:
            r4.mo106667a()     // Catch:{ all -> 0x019d }
        L_0x0173:
            android.support.v7.app.v r10 = r9.mo1322k()     // Catch:{ all -> 0x019d }
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r10 = r10.mo1177e(r0)     // Catch:{ all -> 0x019d }
            com.google.apps.tiktok.l.c.m r0 = com.google.apps.tiktok.p3674l.p3679c.C47389c.m84226a(r9)     // Catch:{ all -> 0x019d }
            r0.f123128b = r10     // Catch:{ all -> 0x019d }
            com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.bi r10 = r9.f344268k     // Catch:{ all -> 0x019d }
            com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.bj r0 = new com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.bj     // Catch:{ all -> 0x019d }
            r0.<init>(r10)     // Catch:{ all -> 0x019d }
            java.lang.Class<com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.ag> r10 = com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.C124804ag.class
            com.google.apps.tiktok.p3674l.p3679c.C47393f.m84231b(r9, r10, r0)     // Catch:{ all -> 0x019d }
            r10 = 0
            r9.f344270m = r10     // Catch:{ all -> 0x019d }
            if (r2 == 0) goto L_0x019c
            com.google.apps.tiktok.tracing.f r2 = (com.google.apps.tiktok.tracing.C47818f) r2
            com.google.apps.tiktok.tracing.k r10 = r2.f123842a
            r10.mo51690q()
        L_0x019c:
            return
        L_0x019d:
            r10 = move-exception
            if (r2 == 0) goto L_0x01ac
            com.google.apps.tiktok.tracing.f r2 = (com.google.apps.tiktok.tracing.C47818f) r2     // Catch:{ all -> 0x01a8 }
            com.google.apps.tiktok.tracing.k r0 = r2.f123842a     // Catch:{ all -> 0x01a8 }
            r0.mo51690q()     // Catch:{ all -> 0x01a8 }
            goto L_0x01ac
        L_0x01a8:
            r0 = move-exception
            com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.C124832bc.m204620a(r10, r0)
        L_0x01ac:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.OobeActivity.onCreate(android.os.Bundle):void");
    }

    public final boolean onCreatePanelMenu(int i, Menu menu) {
        C47573bx t = this.f344269l.mo51693t();
        try {
            boolean onCreatePanelMenu = super.onCreatePanelMenu(i, menu);
            t.close();
            return onCreatePanelMenu;
        } catch (Throwable th) {
            C124832bc.m204620a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        C47573bx b = this.f344269l.mo51675b();
        try {
            super.onDestroy();
            this.f344273p = true;
            ((C47849i) b).f123902a.mo51685l();
            return;
        } catch (Throwable th) {
            C124832bc.m204620a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        C47573bx c = this.f344269l.mo51676c(intent);
        try {
            super.onNewIntent(intent);
            if (c != null) {
                ((C47818f) c).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C124832bc.m204620a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx v = this.f344269l.mo51695v();
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (v != null) {
                v.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C124832bc.m204620a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        C47573bx d = this.f344269l.mo51677d();
        try {
            super.onPause();
            if (d != null) {
                d.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C124832bc.m204620a(th, th);
        }
        throw th;
    }

    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        C47573bx w = this.f344269l.mo51696w();
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            if (w != null) {
                w.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C124832bc.m204620a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPostCreate(Bundle bundle) {
        C47573bx x = this.f344269l.mo51697x();
        try {
            super.onPostCreate(bundle);
            if (x != null) {
                ((C47818f) x).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C124832bc.m204620a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPostResume() {
        C47573bx e = this.f344269l.mo51678e();
        try {
            super.onPostResume();
            ((C47762d) e).f123749a.mo51686m();
            return;
        } catch (Throwable th) {
            C124832bc.m204620a(th, th);
        }
        throw th;
    }

    public final boolean onPrepareOptionsMenu(Menu menu) {
        C47573bx w = C47831fm.m85028w();
        try {
            boolean onPrepareOptionsMenu = super.onPrepareOptionsMenu(menu);
            w.close();
            return onPrepareOptionsMenu;
        } catch (Throwable th) {
            C124832bc.m204620a(th, th);
        }
        throw th;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C47573bx k = this.f344269l.mo51684k("onRequestPermissionsResult");
        try {
            super.onRequestPermissionsResult(i, strArr, iArr);
            if (k != null) {
                k.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C124832bc.m204620a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        C47573bx f = this.f344269l.mo51679f();
        try {
            super.onResume();
            if (f != null) {
                ((C47818f) f).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C124832bc.m204620a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        C47573bx y = this.f344269l.mo51698y();
        try {
            super.onSaveInstanceState(bundle);
            m204540x();
            OobeActivityViewModel oobeActivityViewModel = (OobeActivityViewModel) new C2368bp(this.f344268k.f344409b).mo5770a(OobeActivityViewModel.class);
            ((C59052c) ((C59052c) OobeActivityViewModel.f344274a.mo56224b()).mo56372aa(36350)).mo56386p("onSaveInstanceState");
            bundle.putParcelable("Datalayer", new ProtoParsers.InternalDontUse((byte[]) null, oobeActivityViewModel.f344277d));
            C124825a aVar = oobeActivityViewModel.f344278e;
            if (aVar != null) {
                C60298nk nkVar = ((C124827c) aVar).f344387c;
                C60103kw kwVar = ((C124827c) aVar).f344386b;
                nkVar.copyOnWrite();
                C60300nm nmVar = (C60300nm) nkVar.instance;
                C60106kz kzVar = (C60106kz) kwVar.build();
                C60300nm nmVar2 = C60300nm.f163138H;
                kzVar.getClass();
                nmVar.f163163q = kzVar;
                nmVar.f163147a |= 268435456;
                C124828d dVar = (C124828d) C124829e.f344393d.createBuilder();
                C60298nk nkVar2 = ((C124827c) aVar).f344387c;
                dVar.copyOnWrite();
                C124829e eVar = (C124829e) dVar.instance;
                C60300nm nmVar3 = (C60300nm) nkVar2.build();
                nmVar3.getClass();
                eVar.f344396b = nmVar3;
                eVar.f344395a |= 1;
                C63042fg c = C62950b.m95472c(((C124827c) aVar).f344389e);
                dVar.copyOnWrite();
                C124829e eVar2 = (C124829e) dVar.instance;
                c.getClass();
                eVar2.f344397c = c;
                eVar2.f344395a |= 2;
                bundle.putParcelable("Logger", new ProtoParsers.InternalDontUse((byte[]) null, (C124829e) dVar.build()));
            }
            bundle.putBoolean("vm_enabled", oobeActivityViewModel.f344279f);
            if (y != null) {
                y.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C124832bc.m204620a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        C47573bx g = this.f344269l.mo51680g();
        try {
            super.onStart();
            if (g != null) {
                ((C47818f) g).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C124832bc.m204620a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        C47573bx h = this.f344269l.mo51681h();
        try {
            super.onStop();
            if (h != null) {
                h.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C124832bc.m204620a(th, th);
        }
        throw th;
    }

    public final void onUserInteraction() {
        C47573bx j = this.f344269l.mo51683j();
        try {
            super.onUserInteraction();
            if (j != null) {
                j.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C124832bc.m204620a(th, th);
        }
        throw th;
    }

    public final void startActivity(Intent intent) {
        if (C47214c.m83984a(intent, getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent);
    }

    /* renamed from: w */
    public final /* synthetic */ C68314a mo106636w() {
        return new C47241j(this);
    }

    /* renamed from: z */
    public final /* bridge */ /* synthetic */ Object mo17754z() {
        C124838bi biVar = this.f344268k;
        if (biVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f344273p) {
            return biVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    public final void startActivity(Intent intent, Bundle bundle) {
        if (C47214c.m83984a(intent, getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent, bundle);
    }
}
