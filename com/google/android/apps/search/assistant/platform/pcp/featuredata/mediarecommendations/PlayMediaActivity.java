package com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
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
import dagger.hilt.android.internal.managers.C68314a;

/* compiled from: PG */
public final class PlayMediaActivity extends C123974k implements C47231d, C47211g {

    /* renamed from: k */
    private C123943as f342265k;

    /* renamed from: l */
    private final C47851k f342266l = new C47851k(this, this);

    /* renamed from: m */
    private boolean f342267m;

    /* renamed from: n */
    private Context f342268n;

    /* renamed from: o */
    private C2393x f342269o;

    /* renamed from: p */
    private boolean f342270p;

    public PlayMediaActivity() {
        SystemClock.elapsedRealtime();
        this.f2705f.mo3343a(new C123942ar(this));
    }

    public final void applyOverrideConfiguration(Configuration configuration) {
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            baseContext = this.f342268n;
        }
        C47401a.m84249b(baseContext, configuration);
        super.applyOverrideConfiguration(configuration);
    }

    /* access modifiers changed from: protected */
    public final void attachBaseContext(Context context) {
        this.f342268n = context;
        super.attachBaseContext(C47401a.m84248a(context));
        this.f342268n = null;
    }

    public final C2384o getLifecycle() {
        if (this.f342269o == null) {
            this.f342269o = new C47212h(this);
        }
        return this.f342269o;
    }

    public final void invalidateOptionsMenu() {
        C47573bx w = C47831fm.m85028w();
        try {
            super.invalidateOptionsMenu();
            w.close();
            return;
        } catch (Throwable th) {
            C123941aq.m203257a(th, th);
        }
        throw th;
    }

    /* renamed from: k */
    public final /* synthetic */ C68314a mo106167k() {
        return new C47241j(this);
    }

    /* renamed from: l */
    public final void mo106168l() {
        if (this.f342265k != null) {
            return;
        }
        if (!this.f342267m) {
            throw new IllegalStateException("createPeer() called outside of onCreate");
        } else if (!this.f342270p || isFinishing()) {
            C47558bi a = C47831fm.m85006a("CreateComponent");
            try {
                mo106221j().mo17653jN();
                a.close();
                C47558bi a2 = C47831fm.m85006a("CreatePeer");
                try {
                    this.f342265k = ((C123944at) mo106221j().mo17653jN()).mo106204ab();
                    a2.close();
                    return;
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                } catch (Throwable th) {
                    C123941aq.m203257a(th, th);
                }
            } catch (Throwable th2) {
                C123941aq.m203257a(th, th2);
            }
        } else {
            throw new IllegalStateException("createPeer() called after destroyed.");
        }
        throw th;
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx r = this.f342266l.mo51691r();
        try {
            super.onActivityResult(i, i2, intent);
            if (r != null) {
                r.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C123941aq.m203257a(th, th);
        }
        throw th;
    }

    public final void onBackPressed() {
        C47573bx a = this.f342266l.mo51674a();
        try {
            this.f2707h.mo3340c();
            a.close();
            return;
        } catch (Throwable th) {
            C123941aq.m203257a(th, th);
        }
        throw th;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        C47573bx k = this.f342266l.mo51684k("onConfigurationChanged");
        try {
            super.onConfigurationChanged(configuration);
            if (k != null) {
                k.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C123941aq.m203257a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r13) {
        /*
            r12 = this;
            java.lang.String r0 = "PCP.PlayMedia"
            com.google.apps.tiktok.tracing.k r1 = r12.f342266l
            com.google.apps.tiktok.tracing.bx r1 = r1.mo51692s()
            r2 = 1
            r12.f342267m = r2     // Catch:{ all -> 0x01e1 }
            androidx.lifecycle.o r3 = r12.getLifecycle()     // Catch:{ all -> 0x01e1 }
            com.google.apps.tiktok.tracing.k r4 = r12.f342266l     // Catch:{ all -> 0x01e1 }
            com.google.apps.tiktok.inject.baseclasses.h r3 = (com.google.apps.tiktok.inject.baseclasses.C47212h) r3     // Catch:{ all -> 0x01e1 }
            r3.mo51120i(r4)     // Catch:{ all -> 0x01e1 }
            super.onCreate(r13)     // Catch:{ all -> 0x01e1 }
            r12.mo106168l()     // Catch:{ all -> 0x01e1 }
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.as r13 = r12.f342265k     // Catch:{ all -> 0x01e1 }
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.PlayMediaActivity r3 = r13.f342339b     // Catch:{ all -> 0x01e1 }
            android.content.Intent r3 = r3.getIntent()     // Catch:{ all -> 0x01e1 }
            java.lang.String r4 = r3.getAction()     // Catch:{ all -> 0x01e1 }
            com.google.common.f.e r5 = com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.C123943as.f342338a     // Catch:{ all -> 0x01e1 }
            com.google.common.f.x r5 = r5.mo56224b()     // Catch:{ all -> 0x01e1 }
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x01e1 }
            r5.mo56378ag(r6, r0)     // Catch:{ all -> 0x01e1 }
            java.lang.String r6 = "received action %s"
            r7 = 35314(0x89f2, float:4.9485E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r7)).mo56389s(r6, r4)     // Catch:{ all -> 0x01e1 }
            r5 = 0
            if (r4 != 0) goto L_0x0045
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.PlayMediaActivity r13 = r13.f342339b     // Catch:{ all -> 0x01e1 }
            r13.finish()     // Catch:{ all -> 0x01e1 }
            goto L_0x01d5
        L_0x0045:
            int r6 = r4.hashCode()     // Catch:{ all -> 0x01e1 }
            r7 = 4
            r8 = 3
            r9 = 2
            switch(r6) {
                case -2025178539: goto L_0x0078;
                case -2025107051: goto L_0x006e;
                case -528853325: goto L_0x0064;
                case -528827491: goto L_0x005a;
                case 785908365: goto L_0x0050;
                default: goto L_0x004f;
            }
        L_0x004f:
            goto L_0x0082
        L_0x0050:
            java.lang.String r6 = "ACTION_PAUSE"
            boolean r6 = r4.equals(r6)
            if (r6 == 0) goto L_0x0082
            r6 = 3
            goto L_0x0083
        L_0x005a:
            java.lang.String r6 = "ACTION_PLAY"
            boolean r6 = r4.equals(r6)
            if (r6 == 0) goto L_0x0082
            r6 = 0
            goto L_0x0083
        L_0x0064:
            java.lang.String r6 = "ACTION_OPEN"
            boolean r6 = r4.equals(r6)
            if (r6 == 0) goto L_0x0082
            r6 = 4
            goto L_0x0083
        L_0x006e:
            java.lang.String r6 = "ACTION_PLAY_PREV"
            boolean r6 = r4.equals(r6)
            if (r6 == 0) goto L_0x0082
            r6 = 2
            goto L_0x0083
        L_0x0078:
            java.lang.String r6 = "ACTION_PLAY_NEXT"
            boolean r6 = r4.equals(r6)
            if (r6 == 0) goto L_0x0082
            r6 = 1
            goto L_0x0083
        L_0x0082:
            r6 = -1
        L_0x0083:
            if (r6 == 0) goto L_0x013b
            java.lang.String r10 = "attempting action %s on package %s"
            java.lang.String r11 = "KEY_PACKAGE_NAME"
            if (r6 == r2) goto L_0x0111
            if (r6 == r9) goto L_0x00e7
            if (r6 == r8) goto L_0x00bd
            if (r6 == r7) goto L_0x0093
            goto L_0x01d0
        L_0x0093:
            java.lang.String r2 = r3.getStringExtra(r11)     // Catch:{ all -> 0x01e1 }
            com.google.common.f.e r3 = com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.C123943as.f342338a     // Catch:{ all -> 0x01e1 }
            com.google.common.f.x r3 = r3.mo56224b()     // Catch:{ all -> 0x01e1 }
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x01e1 }
            r3.mo56378ag(r6, r0)     // Catch:{ all -> 0x01e1 }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x01e1 }
            r0 = 35322(0x89fa, float:4.9497E-41)
            com.google.common.f.x r0 = r3.mo56372aa(r0)     // Catch:{ all -> 0x01e1 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x01e1 }
            r0.mo56354G(r10, r4, r2)     // Catch:{ all -> 0x01e1 }
            if (r2 == 0) goto L_0x01d0
            com.google.android.libraries.assistant.pcp.k.ac r0 = r13.f342340c     // Catch:{ all -> 0x01e1 }
            j$.util.Optional r3 = p3186j$.util.Optional.empty()     // Catch:{ all -> 0x01e1 }
            r0.mo24206a(r2, r3)     // Catch:{ all -> 0x01e1 }
            goto L_0x01d0
        L_0x00bd:
            java.lang.String r2 = r3.getStringExtra(r11)     // Catch:{ all -> 0x01e1 }
            com.google.common.f.e r3 = com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.C123943as.f342338a     // Catch:{ all -> 0x01e1 }
            com.google.common.f.x r3 = r3.mo56224b()     // Catch:{ all -> 0x01e1 }
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x01e1 }
            r3.mo56378ag(r6, r0)     // Catch:{ all -> 0x01e1 }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x01e1 }
            r0 = 35321(0x89f9, float:4.9495E-41)
            com.google.common.f.x r0 = r3.mo56372aa(r0)     // Catch:{ all -> 0x01e1 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x01e1 }
            r0.mo56354G(r10, r4, r2)     // Catch:{ all -> 0x01e1 }
            if (r2 == 0) goto L_0x01d0
            com.google.android.libraries.assistant.pcp.k.ac r0 = r13.f342340c     // Catch:{ all -> 0x01e1 }
            j$.util.Optional r3 = p3186j$.util.Optional.empty()     // Catch:{ all -> 0x01e1 }
            r0.mo24207b(r2, r3)     // Catch:{ all -> 0x01e1 }
            goto L_0x01d0
        L_0x00e7:
            java.lang.String r2 = r3.getStringExtra(r11)     // Catch:{ all -> 0x01e1 }
            com.google.common.f.e r3 = com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.C123943as.f342338a     // Catch:{ all -> 0x01e1 }
            com.google.common.f.x r3 = r3.mo56224b()     // Catch:{ all -> 0x01e1 }
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x01e1 }
            r3.mo56378ag(r6, r0)     // Catch:{ all -> 0x01e1 }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x01e1 }
            r0 = 35320(0x89f8, float:4.9494E-41)
            com.google.common.f.x r0 = r3.mo56372aa(r0)     // Catch:{ all -> 0x01e1 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x01e1 }
            r0.mo56354G(r10, r4, r2)     // Catch:{ all -> 0x01e1 }
            if (r2 == 0) goto L_0x01d0
            com.google.android.libraries.assistant.pcp.k.ac r0 = r13.f342340c     // Catch:{ all -> 0x01e1 }
            j$.util.Optional r3 = p3186j$.util.Optional.empty()     // Catch:{ all -> 0x01e1 }
            r0.mo24214i(r2, r3)     // Catch:{ all -> 0x01e1 }
            goto L_0x01d0
        L_0x0111:
            java.lang.String r2 = r3.getStringExtra(r11)     // Catch:{ all -> 0x01e1 }
            com.google.common.f.e r3 = com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.C123943as.f342338a     // Catch:{ all -> 0x01e1 }
            com.google.common.f.x r3 = r3.mo56224b()     // Catch:{ all -> 0x01e1 }
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x01e1 }
            r3.mo56378ag(r6, r0)     // Catch:{ all -> 0x01e1 }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x01e1 }
            r0 = 35319(0x89f7, float:4.9492E-41)
            com.google.common.f.x r0 = r3.mo56372aa(r0)     // Catch:{ all -> 0x01e1 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x01e1 }
            r0.mo56354G(r10, r4, r2)     // Catch:{ all -> 0x01e1 }
            if (r2 == 0) goto L_0x01d0
            com.google.android.libraries.assistant.pcp.k.ac r0 = r13.f342340c     // Catch:{ all -> 0x01e1 }
            j$.util.Optional r3 = p3186j$.util.Optional.empty()     // Catch:{ all -> 0x01e1 }
            r0.mo24208c(r2, r3)     // Catch:{ all -> 0x01e1 }
            goto L_0x01d0
        L_0x013b:
            java.lang.String r2 = "KEY_MEDIA_ITEM"
            java.lang.String r2 = r3.getStringExtra(r2)     // Catch:{ all -> 0x01e1 }
            com.google.common.f.e r4 = com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.C123943as.f342338a     // Catch:{ ct -> 0x01bc }
            com.google.common.f.x r4 = r4.mo56224b()     // Catch:{ ct -> 0x01bc }
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ ct -> 0x01bc }
            r4.mo56378ag(r6, r0)     // Catch:{ ct -> 0x01bc }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ ct -> 0x01bc }
            r6 = 35315(0x89f3, float:4.9487E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r6)     // Catch:{ ct -> 0x01bc }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ ct -> 0x01bc }
            java.lang.String r6 = "read media item %s"
            r4.mo56389s(r6, r2)     // Catch:{ ct -> 0x01bc }
            if (r2 == 0) goto L_0x01d0
            byte[] r2 = android.util.Base64.decode(r2, r5)     // Catch:{ ct -> 0x01bc }
            com.google.common.f.e r4 = com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.C123943as.f342338a     // Catch:{ ct -> 0x01bc }
            com.google.common.f.x r4 = r4.mo56224b()     // Catch:{ ct -> 0x01bc }
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ ct -> 0x01bc }
            r4.mo56378ag(r6, r0)     // Catch:{ ct -> 0x01bc }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ ct -> 0x01bc }
            r6 = 35316(0x89f4, float:4.9488E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r6)     // Catch:{ ct -> 0x01bc }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ ct -> 0x01bc }
            java.lang.String r6 = "copied to byte string %s"
            r4.mo56389s(r6, r2)     // Catch:{ ct -> 0x01bc }
            com.google.assistant.e.j.wg r4 = com.google.assistant.p3897e.p3921j.C52560wg.f137943j     // Catch:{ ct -> 0x01bc }
            com.google.protobuf.bv r2 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r4, (byte[]) r2)     // Catch:{ ct -> 0x01bc }
            com.google.assistant.e.j.wg r2 = (com.google.assistant.p3897e.p3921j.C52560wg) r2     // Catch:{ ct -> 0x01bc }
            java.lang.String r4 = "KEY_OPEN_IN_FOREGROUND"
            boolean r3 = r3.getBooleanExtra(r4, r5)     // Catch:{ all -> 0x01e1 }
            com.google.common.f.e r4 = com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.C123943as.f342338a     // Catch:{ all -> 0x01e1 }
            com.google.common.f.x r4 = r4.mo56224b()     // Catch:{ all -> 0x01e1 }
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x01e1 }
            r4.mo56378ag(r6, r0)     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = "attempting to play mediaItem in foreground? %b"
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x01e1 }
            r7 = 35317(0x89f5, float:4.949E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r7)).mo56389s(r0, r6)     // Catch:{ all -> 0x01e1 }
            if (r3 == 0) goto L_0x01ae
            com.google.android.libraries.assistant.pcp.k.ac r0 = r13.f342340c     // Catch:{ all -> 0x01e1 }
            j$.util.Optional r3 = p3186j$.util.Optional.empty()     // Catch:{ all -> 0x01e1 }
            r0.mo24213h(r2, r3)     // Catch:{ all -> 0x01e1 }
            goto L_0x01d0
        L_0x01ae:
            com.google.android.libraries.assistant.pcp.k.ac r0 = r13.f342340c     // Catch:{ all -> 0x01e1 }
            j$.util.Optional r3 = p3186j$.util.Optional.empty()     // Catch:{ all -> 0x01e1 }
            j$.util.Optional r4 = p3186j$.util.Optional.empty()     // Catch:{ all -> 0x01e1 }
            r0.mo24211f(r2, r3, r4)     // Catch:{ all -> 0x01e1 }
            goto L_0x01d0
        L_0x01bc:
            r2 = move-exception
            com.google.common.f.e r3 = com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.C123943as.f342338a     // Catch:{ all -> 0x01e1 }
            com.google.common.f.x r3 = r3.mo56226d()     // Catch:{ all -> 0x01e1 }
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x01e1 }
            r3.mo56378ag(r4, r0)     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = "unable to read media item. no-op."
            r4 = 35318(0x89f6, float:4.9491E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r2)).mo56372aa(r4)).mo56386p(r0)     // Catch:{ all -> 0x01e1 }
        L_0x01d0:
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.PlayMediaActivity r13 = r13.f342339b     // Catch:{ all -> 0x01e1 }
            r13.finish()     // Catch:{ all -> 0x01e1 }
        L_0x01d5:
            r12.f342267m = r5     // Catch:{ all -> 0x01e1 }
            if (r1 == 0) goto L_0x01e0
            com.google.apps.tiktok.tracing.f r1 = (com.google.apps.tiktok.tracing.C47818f) r1
            com.google.apps.tiktok.tracing.k r13 = r1.f123842a
            r13.mo51690q()
        L_0x01e0:
            return
        L_0x01e1:
            r13 = move-exception
            if (r1 == 0) goto L_0x01f0
            com.google.apps.tiktok.tracing.f r1 = (com.google.apps.tiktok.tracing.C47818f) r1     // Catch:{ all -> 0x01ec }
            com.google.apps.tiktok.tracing.k r0 = r1.f123842a     // Catch:{ all -> 0x01ec }
            r0.mo51690q()     // Catch:{ all -> 0x01ec }
            goto L_0x01f0
        L_0x01ec:
            r0 = move-exception
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.C123941aq.m203257a(r13, r0)
        L_0x01f0:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.PlayMediaActivity.onCreate(android.os.Bundle):void");
    }

    public final boolean onCreatePanelMenu(int i, Menu menu) {
        C47573bx t = this.f342266l.mo51693t();
        try {
            boolean onCreatePanelMenu = super.onCreatePanelMenu(i, menu);
            t.close();
            return onCreatePanelMenu;
        } catch (Throwable th) {
            C123941aq.m203257a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        C47573bx b = this.f342266l.mo51675b();
        try {
            super.onDestroy();
            this.f342270p = true;
            ((C47849i) b).f123902a.mo51685l();
            return;
        } catch (Throwable th) {
            C123941aq.m203257a(th, th);
        }
        throw th;
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        C47573bx u = this.f342266l.mo51694u();
        try {
            boolean onMenuItemSelected = super.onMenuItemSelected(i, menuItem);
            if (u != null) {
                u.close();
            }
            return onMenuItemSelected;
        } catch (Throwable th) {
            C123941aq.m203257a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        C47573bx c = this.f342266l.mo51676c(intent);
        try {
            super.onNewIntent(intent);
            if (c != null) {
                ((C47818f) c).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C123941aq.m203257a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx v = this.f342266l.mo51695v();
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (v != null) {
                v.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C123941aq.m203257a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        C47573bx d = this.f342266l.mo51677d();
        try {
            super.onPause();
            if (d != null) {
                d.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C123941aq.m203257a(th, th);
        }
        throw th;
    }

    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        C47573bx w = this.f342266l.mo51696w();
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            if (w != null) {
                w.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C123941aq.m203257a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPostCreate(Bundle bundle) {
        C47573bx x = this.f342266l.mo51697x();
        try {
            super.onPostCreate(bundle);
            if (x != null) {
                ((C47818f) x).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C123941aq.m203257a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPostResume() {
        C47573bx e = this.f342266l.mo51678e();
        try {
            super.onPostResume();
            ((C47762d) e).f123749a.mo51686m();
            return;
        } catch (Throwable th) {
            C123941aq.m203257a(th, th);
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
            C123941aq.m203257a(th, th);
        }
        throw th;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C47573bx k = this.f342266l.mo51684k("onRequestPermissionsResult");
        try {
            super.onRequestPermissionsResult(i, strArr, iArr);
            if (k != null) {
                k.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C123941aq.m203257a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        C47573bx f = this.f342266l.mo51679f();
        try {
            super.onResume();
            if (f != null) {
                ((C47818f) f).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C123941aq.m203257a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        C47573bx y = this.f342266l.mo51698y();
        try {
            super.onSaveInstanceState(bundle);
            if (y != null) {
                y.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C123941aq.m203257a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        C47573bx g = this.f342266l.mo51680g();
        try {
            super.onStart();
            if (g != null) {
                ((C47818f) g).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C123941aq.m203257a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        C47573bx h = this.f342266l.mo51681h();
        try {
            super.onStop();
            if (h != null) {
                h.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C123941aq.m203257a(th, th);
        }
        throw th;
    }

    public final void onUserInteraction() {
        C47573bx j = this.f342266l.mo51683j();
        try {
            super.onUserInteraction();
            if (j != null) {
                j.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C123941aq.m203257a(th, th);
        }
        throw th;
    }

    public final void startActivity(Intent intent) {
        if (C47214c.m83984a(intent, getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent);
    }

    /* renamed from: z */
    public final /* bridge */ /* synthetic */ Object mo17754z() {
        C123943as asVar = this.f342265k;
        if (asVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f342270p) {
            return asVar;
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
