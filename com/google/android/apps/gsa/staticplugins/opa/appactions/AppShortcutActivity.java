package com.google.android.apps.gsa.staticplugins.opa.appactions;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.p033v7.app.C0401v;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.googlequicksearchbox.R;
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
public final class AppShortcutActivity extends C107250as implements C47231d, C47211g {

    /* renamed from: k */
    private C107316q f298428k;

    /* renamed from: l */
    private final C47851k f298429l = new C47851k(this, this);

    /* renamed from: m */
    private boolean f298430m;

    /* renamed from: n */
    private Context f298431n;

    /* renamed from: o */
    private C2393x f298432o;

    /* renamed from: p */
    private boolean f298433p;

    public AppShortcutActivity() {
        SystemClock.elapsedRealtime();
    }

    /* renamed from: x */
    private final void m177977x() {
        if (this.f298428k != null) {
            return;
        }
        if (!this.f298430m) {
            throw new IllegalStateException("createPeer() called outside of onCreate");
        } else if (!this.f298433p || isFinishing()) {
            C47558bi a = C47831fm.m85006a("CreateComponent");
            try {
                mo95873w().mo17653jN();
                a.close();
                C47558bi a2 = C47831fm.m85006a("CreatePeer");
                try {
                    this.f298428k = ((C107321v) mo95873w().mo17653jN()).mo95909Z();
                    a2.close();
                    this.f298428k.f298666h = this;
                    return;
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                } catch (Throwable th) {
                    C107309j.m178145a(th, th);
                }
            } catch (Throwable th2) {
                C107309j.m178145a(th, th2);
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
            baseContext = this.f298431n;
        }
        C47401a.m84249b(baseContext, configuration);
        super.applyOverrideConfiguration(configuration);
    }

    /* access modifiers changed from: protected */
    public final void attachBaseContext(Context context) {
        this.f298431n = context;
        super.attachBaseContext(C47401a.m84248a(context));
        this.f298431n = null;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        m177977x();
        C107316q qVar = this.f298428k;
        if (motionEvent.getAction() == 0) {
            Rect rect = new Rect();
            View e = qVar.f298656a.mo1322k().mo1177e(R.id.fragment_container);
            e.getClass();
            e.getGlobalVisibleRect(rect);
            if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                qVar.f298656a.finish();
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void finish() {
        super.finish();
        m177977x();
        this.f298428k.f298656a.overridePendingTransition(R.anim.shortcut_overlay_slide_in, R.anim.shortcut_overlay_slide_out);
    }

    public final C2384o getLifecycle() {
        if (this.f298432o == null) {
            this.f298432o = new C47212h(this);
        }
        return this.f298432o;
    }

    public final void invalidateOptionsMenu() {
        C47573bx w = C47831fm.m85028w();
        try {
            mo1322k().mo1180i();
            w.close();
            return;
        } catch (Throwable th) {
            C107309j.m178145a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    /* renamed from: jA */
    public final void mo1321jA() {
    }

    /* renamed from: m */
    public final boolean mo1323m() {
        C47573bx i = this.f298429l.mo51682i();
        try {
            boolean m = super.mo1323m();
            if (i != null) {
                i.close();
            }
            return m;
        } catch (Throwable th) {
            C107309j.m178145a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo1324o() {
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx r = this.f298429l.mo51691r();
        try {
            super.onActivityResult(i, i2, intent);
            if (r != null) {
                r.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C107309j.m178145a(th, th);
        }
        throw th;
    }

    public final void onBackPressed() {
        C47573bx a = this.f298429l.mo51674a();
        try {
            super.onBackPressed();
            a.close();
            return;
        } catch (Throwable th) {
            C107309j.m178145a(th, th);
        }
        throw th;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        C47573bx k = this.f298429l.mo51684k("onConfigurationChanged");
        try {
            super.onConfigurationChanged(configuration);
            if (k != null) {
                k.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C107309j.m178145a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x010d A[Catch:{ ct -> 0x00c2, all -> 0x0240 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01da A[Catch:{ ct -> 0x00c2, all -> 0x0240 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            java.lang.String r0 = "app_actions_notifications_key"
            com.google.apps.tiktok.tracing.k r1 = r9.f298429l
            com.google.apps.tiktok.tracing.bx r1 = r1.mo51692s()
            r2 = 1
            r9.f298430m = r2     // Catch:{ all -> 0x0240 }
            r9.m177977x()     // Catch:{ all -> 0x0240 }
            androidx.lifecycle.o r3 = r9.getLifecycle()     // Catch:{ all -> 0x0240 }
            com.google.apps.tiktok.tracing.k r4 = r9.f298429l     // Catch:{ all -> 0x0240 }
            com.google.apps.tiktok.inject.baseclasses.h r3 = (com.google.apps.tiktok.inject.baseclasses.C47212h) r3     // Catch:{ all -> 0x0240 }
            r3.mo51120i(r4)     // Catch:{ all -> 0x0240 }
            dagger.hilt.android.internal.managers.a r3 = r9.mo95873w()     // Catch:{ all -> 0x0240 }
            java.lang.Object r3 = r3.mo17653jN()     // Catch:{ all -> 0x0240 }
            com.google.apps.tiktok.inject.d.f r3 = (com.google.apps.tiktok.inject.p3659d.C47237f) r3     // Catch:{ all -> 0x0240 }
            com.google.apps.tiktok.e.a r3 = r3.mo51141bP()     // Catch:{ all -> 0x0240 }
            r3.mo50899a()     // Catch:{ all -> 0x0240 }
            super.onCreate(r10)     // Catch:{ all -> 0x0240 }
            r9.m177977x()     // Catch:{ all -> 0x0240 }
            com.google.android.apps.gsa.staticplugins.opa.appactions.q r10 = r9.f298428k     // Catch:{ all -> 0x0240 }
            com.google.android.apps.gsa.e.f r3 = com.google.android.apps.gsa.e.f.ao     // Catch:{ all -> 0x0240 }
            com.google.android.apps.gsa.p5846e.C74504a.m120462a(r3)     // Catch:{ all -> 0x0240 }
            com.google.android.apps.gsa.assistant.shared.appactions.d.a r3 = r10.f298658c     // Catch:{ all -> 0x0240 }
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.APP_ACTIONS_SHORTCUTS_ACTIVITY_CREATED     // Catch:{ all -> 0x0240 }
            r3.mo65295b(r4)     // Catch:{ all -> 0x0240 }
            com.google.android.apps.gsa.staticplugins.opa.appactions.AppShortcutActivity r3 = r10.f298656a     // Catch:{ all -> 0x0240 }
            android.content.Intent r3 = r3.getIntent()     // Catch:{ all -> 0x0240 }
            com.google.android.apps.gsa.staticplugins.opa.appactions.AppShortcutActivity r4 = r10.f298656a     // Catch:{ all -> 0x0240 }
            r5 = 2130772147(0x7f0100b3, float:1.7147404E38)
            r6 = 0
            r4.overridePendingTransition(r5, r6)     // Catch:{ all -> 0x0240 }
            com.google.android.apps.gsa.staticplugins.opa.appactions.AppShortcutActivity r4 = r10.f298656a     // Catch:{ all -> 0x0240 }
            r5 = 2131624060(0x7f0e007c, float:1.887529E38)
            r4.setContentView((int) r5)     // Catch:{ all -> 0x0240 }
            android.support.p033v7.app.C0401v.m1321C()     // Catch:{ all -> 0x0240 }
            com.google.android.apps.gsa.search.core.google.gaia.o r4 = r10.f298660e     // Catch:{ all -> 0x0240 }
            java.lang.String r4 = r4.mo79659F()     // Catch:{ all -> 0x0240 }
            j$.util.Optional r4 = p3186j$.util.Optional.ofNullable(r4)     // Catch:{ all -> 0x0240 }
            boolean r5 = r4.isPresent()     // Catch:{ all -> 0x0240 }
            if (r5 == 0) goto L_0x0073
            java.lang.Object r4 = r4.get()     // Catch:{ all -> 0x0240 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0240 }
            com.google.android.libraries.logging.ve.g r4 = com.google.android.libraries.logging.p2185ve.p2186a.C28297a.m52922b(r4)     // Catch:{ all -> 0x0240 }
            goto L_0x0077
        L_0x0073:
            com.google.android.libraries.logging.ve.g r4 = com.google.android.libraries.logging.p2185ve.p2186a.C28297a.m52923c()     // Catch:{ all -> 0x0240 }
        L_0x0077:
            com.google.android.libraries.logging.ve.af r5 = r10.f298661f     // Catch:{ all -> 0x0240 }
            com.google.android.libraries.logging.ve.ab r5 = r5.f76997b     // Catch:{ all -> 0x0240 }
            r7 = 105509(0x19c25, float:1.4785E-40)
            com.google.android.libraries.logging.ve.h r7 = com.google.android.libraries.logging.p2185ve.C28427h.m53115a(r7)     // Catch:{ all -> 0x0240 }
            com.google.android.libraries.logging.ve.c r5 = r5.mo33800a(r7)     // Catch:{ all -> 0x0240 }
            r5.mo33859g(r4)     // Catch:{ all -> 0x0240 }
            r4 = 105432(0x19bd8, float:1.47742E-40)
            com.google.android.libraries.logging.ve.g r4 = com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak.m53061c(r4)     // Catch:{ all -> 0x0240 }
            r5.mo33859g(r4)     // Catch:{ all -> 0x0240 }
            com.google.android.apps.gsa.staticplugins.opa.appactions.AppShortcutActivity r4 = r10.f298656a     // Catch:{ all -> 0x0240 }
            r5.mo33810c(r4)     // Catch:{ all -> 0x0240 }
            android.support.v4.app.FragmentManager r4 = r10.f298657b     // Catch:{ all -> 0x0240 }
            android.support.v4.app.cc r4 = r4.f634a     // Catch:{ all -> 0x0240 }
            r5 = 2131431141(0x7f0b0ee5, float:1.8484003E38)
            android.support.v4.app.Fragment r4 = r4.mo670b(r5)     // Catch:{ all -> 0x0240 }
            if (r4 != 0) goto L_0x0203
            com.google.android.apps.gsa.staticplugins.opa.appactions.e.a r4 = r10.f298659d     // Catch:{ all -> 0x0240 }
            boolean r4 = r3.hasExtra(r0)     // Catch:{ all -> 0x0240 }
            java.lang.String r5 = "Failed to get AppActionsNotifications from the intent"
            java.lang.String r7 = "AANotificationsHelper"
            if (r4 == 0) goto L_0x00d3
            com.google.android.libraries.search.assistant.proactive.f.d r4 = com.google.android.libraries.search.assistant.proactive.p2774f.C36265d.f94713k     // Catch:{ ct -> 0x00c2 }
            com.google.protobuf.ba r8 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x00c2 }
            com.google.protobuf.MessageLite r0 = com.google.protobuf.contrib.android.ProtoParsers.m95519b(r3, r0, r4, r8)     // Catch:{ ct -> 0x00c2 }
            com.google.android.libraries.search.assistant.proactive.f.d r0 = (com.google.android.libraries.search.assistant.proactive.p2774f.C36265d) r0     // Catch:{ ct -> 0x00c2 }
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)     // Catch:{ ct -> 0x00c2 }
            goto L_0x0107
        L_0x00c2:
            r0 = move-exception
            com.google.common.f.e r4 = com.google.android.apps.gsa.staticplugins.opa.appactions.p8292e.C107298a.f298619a     // Catch:{ all -> 0x0240 }
            com.google.common.f.x r4 = r4.mo56225c()     // Catch:{ all -> 0x0240 }
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0240 }
            r4.mo56378ag(r8, r7)     // Catch:{ all -> 0x0240 }
            r8 = 23561(0x5c09, float:3.3016E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56382g(r0)).mo56372aa(r8)).mo56386p(r5)     // Catch:{ all -> 0x0240 }
        L_0x00d3:
            java.lang.String r0 = "app_actions_notifications_string_key"
            java.lang.String r0 = r3.getStringExtra(r0)     // Catch:{ all -> 0x0240 }
            if (r0 == 0) goto L_0x0103
            r4 = 10
            byte[] r0 = android.util.Base64.decode(r0, r4)     // Catch:{ ct -> 0x00f2 }
            com.google.protobuf.ba r4 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x00f2 }
            com.google.android.libraries.search.assistant.proactive.f.d r8 = com.google.android.libraries.search.assistant.proactive.p2774f.C36265d.f94713k     // Catch:{ ct -> 0x00f2 }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r8, (byte[]) r0, (com.google.protobuf.C62921ba) r4)     // Catch:{ ct -> 0x00f2 }
            com.google.android.libraries.search.assistant.proactive.f.d r0 = (com.google.android.libraries.search.assistant.proactive.p2774f.C36265d) r0     // Catch:{ ct -> 0x00f2 }
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)     // Catch:{ ct -> 0x00f2 }
            goto L_0x0107
        L_0x00f2:
            r0 = move-exception
            com.google.common.f.e r4 = com.google.android.apps.gsa.staticplugins.opa.appactions.p8292e.C107298a.f298619a     // Catch:{ all -> 0x0240 }
            com.google.common.f.x r4 = r4.mo56225c()     // Catch:{ all -> 0x0240 }
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0240 }
            r4.mo56378ag(r8, r7)     // Catch:{ all -> 0x0240 }
            r7 = 23560(0x5c08, float:3.3015E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56382g(r0)).mo56372aa(r7)).mo56386p(r5)     // Catch:{ all -> 0x0240 }
        L_0x0103:
            j$.util.Optional r0 = p3186j$.util.Optional.empty()     // Catch:{ all -> 0x0240 }
        L_0x0107:
            boolean r4 = r0.isPresent()     // Catch:{ all -> 0x0240 }
            if (r4 == 0) goto L_0x01da
            java.lang.Object r4 = r0.get()     // Catch:{ all -> 0x0240 }
            com.google.android.libraries.search.assistant.proactive.f.d r4 = (com.google.android.libraries.search.assistant.proactive.p2774f.C36265d) r4     // Catch:{ all -> 0x0240 }
            int r4 = r4.f94718d     // Catch:{ all -> 0x0240 }
            int r4 = com.google.android.libraries.search.assistant.proactive.p2774f.C36264c.m64730a(r4)     // Catch:{ all -> 0x0240 }
            r5 = 2
            if (r4 != 0) goto L_0x011e
            goto L_0x01af
        L_0x011e:
            if (r4 != r5) goto L_0x01af
            android.os.Bundle r3 = r3.getExtras()     // Catch:{ all -> 0x0240 }
            r3.getClass()
            java.lang.String r4 = "has_app_actions_failure_key"
            boolean r3 = r3.getBoolean(r4)     // Catch:{ all -> 0x0240 }
            if (r3 == 0) goto L_0x015d
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0240 }
            com.google.android.libraries.search.assistant.proactive.f.d r0 = (com.google.android.libraries.search.assistant.proactive.p2774f.C36265d) r0     // Catch:{ all -> 0x0240 }
            com.google.android.apps.gsa.staticplugins.opa.appactions.c.d r3 = com.google.android.apps.gsa.staticplugins.opa.appactions.p8290c.C107273d.f298572i     // Catch:{ all -> 0x0240 }
            com.google.protobuf.bn r3 = r3.createBuilder()     // Catch:{ all -> 0x0240 }
            com.google.android.apps.gsa.staticplugins.opa.appactions.c.c r3 = (com.google.android.apps.gsa.staticplugins.opa.appactions.p8290c.C107272c) r3     // Catch:{ all -> 0x0240 }
            r3.copyOnWrite()     // Catch:{ all -> 0x0240 }
            com.google.protobuf.bv r4 = r3.instance     // Catch:{ all -> 0x0240 }
            com.google.android.apps.gsa.staticplugins.opa.appactions.c.d r4 = (com.google.android.apps.gsa.staticplugins.opa.appactions.p8290c.C107273d) r4     // Catch:{ all -> 0x0240 }
            r0.getClass()     // Catch:{ all -> 0x0240 }
            r4.f298575b = r0     // Catch:{ all -> 0x0240 }
            int r0 = r4.f298574a     // Catch:{ all -> 0x0240 }
            r0 = r0 | r2
            r4.f298574a = r0     // Catch:{ all -> 0x0240 }
            com.google.protobuf.bv r0 = r3.build()     // Catch:{ all -> 0x0240 }
            com.google.android.apps.gsa.staticplugins.opa.appactions.c.d r0 = (com.google.android.apps.gsa.staticplugins.opa.appactions.p8290c.C107273d) r0     // Catch:{ all -> 0x0240 }
            com.google.android.apps.gsa.staticplugins.opa.appactions.ak r0 = com.google.android.apps.gsa.staticplugins.opa.appactions.C107242ak.m178031a(r0)     // Catch:{ all -> 0x0240 }
        L_0x0158:
            r10.mo95908b(r0)     // Catch:{ all -> 0x0240 }
            goto L_0x0203
        L_0x015d:
            java.lang.Object r3 = r0.get()     // Catch:{ all -> 0x0240 }
            com.google.android.libraries.search.assistant.proactive.f.d r3 = (com.google.android.libraries.search.assistant.proactive.p2774f.C36265d) r3     // Catch:{ all -> 0x0240 }
            int r3 = r3.f94715a     // Catch:{ all -> 0x0240 }
            r3 = r3 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x019d
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0240 }
            com.google.android.libraries.search.assistant.proactive.f.d r0 = (com.google.android.libraries.search.assistant.proactive.p2774f.C36265d) r0     // Catch:{ all -> 0x0240 }
            com.google.android.apps.gsa.staticplugins.opa.appactions.c.b r2 = com.google.android.apps.gsa.staticplugins.opa.appactions.p8290c.C107271b.f298567d     // Catch:{ all -> 0x0240 }
            com.google.protobuf.bn r2 = r2.createBuilder()     // Catch:{ all -> 0x0240 }
            com.google.android.apps.gsa.staticplugins.opa.appactions.c.a r2 = (com.google.android.apps.gsa.staticplugins.opa.appactions.p8290c.C107270a) r2     // Catch:{ all -> 0x0240 }
            r2.copyOnWrite()     // Catch:{ all -> 0x0240 }
            com.google.protobuf.bv r3 = r2.instance     // Catch:{ all -> 0x0240 }
            com.google.android.apps.gsa.staticplugins.opa.appactions.c.b r3 = (com.google.android.apps.gsa.staticplugins.opa.appactions.p8290c.C107271b) r3     // Catch:{ all -> 0x0240 }
            r0.getClass()     // Catch:{ all -> 0x0240 }
            r3.f298571c = r0     // Catch:{ all -> 0x0240 }
            int r0 = r3.f298569a     // Catch:{ all -> 0x0240 }
            r0 = r0 | r5
            r3.f298569a = r0     // Catch:{ all -> 0x0240 }
            com.google.protobuf.bv r0 = r2.build()     // Catch:{ all -> 0x0240 }
            com.google.android.apps.gsa.staticplugins.opa.appactions.c.b r0 = (com.google.android.apps.gsa.staticplugins.opa.appactions.p8290c.C107271b) r0     // Catch:{ all -> 0x0240 }
            com.google.android.apps.gsa.staticplugins.opa.appactions.b r2 = new com.google.android.apps.gsa.staticplugins.opa.appactions.b     // Catch:{ all -> 0x0240 }
            r2.<init>()     // Catch:{ all -> 0x0240 }
            dagger.hilt.android.internal.managers.C68324h.m98669f(r2)     // Catch:{ all -> 0x0240 }
            com.google.apps.tiktok.inject.p3659d.C47243l.m84039a(r2, r0)     // Catch:{ all -> 0x0240 }
            r10.mo95908b(r2)     // Catch:{ all -> 0x0240 }
            goto L_0x0203
        L_0x019d:
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0240 }
            com.google.android.libraries.search.assistant.proactive.f.d r0 = (com.google.android.libraries.search.assistant.proactive.p2774f.C36265d) r0     // Catch:{ all -> 0x0240 }
            com.google.assistant.at.ak r0 = r0.f94716b     // Catch:{ all -> 0x0240 }
            if (r0 != 0) goto L_0x01a9
            com.google.assistant.at.ak r0 = com.google.assistant.p3861at.C49826ak.f129462q     // Catch:{ all -> 0x0240 }
        L_0x01a9:
            java.lang.String r0 = r0.f129471h     // Catch:{ all -> 0x0240 }
            r10.mo95907a(r0, r2)     // Catch:{ all -> 0x0240 }
            goto L_0x0203
        L_0x01af:
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0240 }
            com.google.android.libraries.search.assistant.proactive.f.d r0 = (com.google.android.libraries.search.assistant.proactive.p2774f.C36265d) r0     // Catch:{ all -> 0x0240 }
            com.google.android.apps.gsa.staticplugins.opa.appactions.c.b r2 = com.google.android.apps.gsa.staticplugins.opa.appactions.p8290c.C107271b.f298567d     // Catch:{ all -> 0x0240 }
            com.google.protobuf.bn r2 = r2.createBuilder()     // Catch:{ all -> 0x0240 }
            com.google.android.apps.gsa.staticplugins.opa.appactions.c.a r2 = (com.google.android.apps.gsa.staticplugins.opa.appactions.p8290c.C107270a) r2     // Catch:{ all -> 0x0240 }
            r2.copyOnWrite()     // Catch:{ all -> 0x0240 }
            com.google.protobuf.bv r3 = r2.instance     // Catch:{ all -> 0x0240 }
            com.google.android.apps.gsa.staticplugins.opa.appactions.c.b r3 = (com.google.android.apps.gsa.staticplugins.opa.appactions.p8290c.C107271b) r3     // Catch:{ all -> 0x0240 }
            r0.getClass()     // Catch:{ all -> 0x0240 }
            r3.f298571c = r0     // Catch:{ all -> 0x0240 }
            int r0 = r3.f298569a     // Catch:{ all -> 0x0240 }
            r0 = r0 | r5
            r3.f298569a = r0     // Catch:{ all -> 0x0240 }
            com.google.protobuf.bv r0 = r2.build()     // Catch:{ all -> 0x0240 }
            com.google.android.apps.gsa.staticplugins.opa.appactions.c.b r0 = (com.google.android.apps.gsa.staticplugins.opa.appactions.p8290c.C107271b) r0     // Catch:{ all -> 0x0240 }
            com.google.android.apps.gsa.staticplugins.opa.appactions.y r0 = com.google.android.apps.gsa.staticplugins.opa.appactions.C107324y.m178154a(r0)     // Catch:{ all -> 0x0240 }
            goto L_0x0158
        L_0x01da:
            java.lang.String r0 = r3.getDataString()     // Catch:{ all -> 0x0240 }
            r0.getClass()
            com.google.android.apps.gsa.staticplugins.opa.appactions.c.b r3 = com.google.android.apps.gsa.staticplugins.opa.appactions.p8290c.C107271b.f298567d     // Catch:{ all -> 0x0240 }
            com.google.protobuf.bn r3 = r3.createBuilder()     // Catch:{ all -> 0x0240 }
            com.google.android.apps.gsa.staticplugins.opa.appactions.c.a r3 = (com.google.android.apps.gsa.staticplugins.opa.appactions.p8290c.C107270a) r3     // Catch:{ all -> 0x0240 }
            r3.copyOnWrite()     // Catch:{ all -> 0x0240 }
            com.google.protobuf.bv r4 = r3.instance     // Catch:{ all -> 0x0240 }
            com.google.android.apps.gsa.staticplugins.opa.appactions.c.b r4 = (com.google.android.apps.gsa.staticplugins.opa.appactions.p8290c.C107271b) r4     // Catch:{ all -> 0x0240 }
            int r5 = r4.f298569a     // Catch:{ all -> 0x0240 }
            r2 = r2 | r5
            r4.f298569a = r2     // Catch:{ all -> 0x0240 }
            r4.f298570b = r0     // Catch:{ all -> 0x0240 }
            com.google.protobuf.bv r0 = r3.build()     // Catch:{ all -> 0x0240 }
            com.google.android.apps.gsa.staticplugins.opa.appactions.c.b r0 = (com.google.android.apps.gsa.staticplugins.opa.appactions.p8290c.C107271b) r0     // Catch:{ all -> 0x0240 }
            com.google.android.apps.gsa.staticplugins.opa.appactions.y r0 = com.google.android.apps.gsa.staticplugins.opa.appactions.C107324y.m178154a(r0)     // Catch:{ all -> 0x0240 }
            goto L_0x0158
        L_0x0203:
            android.support.v7.app.v r10 = r9.mo1322k()     // Catch:{ all -> 0x0240 }
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r10 = r10.mo1177e(r0)     // Catch:{ all -> 0x0240 }
            com.google.apps.tiktok.l.c.m r0 = com.google.apps.tiktok.p3674l.p3679c.C47389c.m84226a(r9)     // Catch:{ all -> 0x0240 }
            r0.f123128b = r10     // Catch:{ all -> 0x0240 }
            com.google.android.apps.gsa.staticplugins.opa.appactions.q r10 = r9.f298428k     // Catch:{ all -> 0x0240 }
            com.google.android.apps.gsa.staticplugins.opa.appactions.r r0 = new com.google.android.apps.gsa.staticplugins.opa.appactions.r     // Catch:{ all -> 0x0240 }
            r0.<init>(r10)     // Catch:{ all -> 0x0240 }
            java.lang.Class<com.google.android.apps.gsa.staticplugins.opa.appactions.b.a> r2 = com.google.android.apps.gsa.staticplugins.opa.appactions.p8289b.C107259a.class
            com.google.apps.tiktok.p3674l.p3679c.C47393f.m84231b(r9, r2, r0)     // Catch:{ all -> 0x0240 }
            com.google.android.apps.gsa.staticplugins.opa.appactions.s r0 = new com.google.android.apps.gsa.staticplugins.opa.appactions.s     // Catch:{ all -> 0x0240 }
            r0.<init>(r10)     // Catch:{ all -> 0x0240 }
            java.lang.Class<com.google.android.apps.gsa.staticplugins.opa.appactions.b.b> r2 = com.google.android.apps.gsa.staticplugins.opa.appactions.p8289b.C107260b.class
            com.google.apps.tiktok.p3674l.p3679c.C47393f.m84231b(r9, r2, r0)     // Catch:{ all -> 0x0240 }
            com.google.android.apps.gsa.staticplugins.opa.appactions.t r0 = new com.google.android.apps.gsa.staticplugins.opa.appactions.t     // Catch:{ all -> 0x0240 }
            r0.<init>(r10)     // Catch:{ all -> 0x0240 }
            java.lang.Class<com.google.android.apps.gsa.staticplugins.opa.appactions.b.c> r10 = com.google.android.apps.gsa.staticplugins.opa.appactions.p8289b.C107261c.class
            com.google.apps.tiktok.p3674l.p3679c.C47393f.m84231b(r9, r10, r0)     // Catch:{ all -> 0x0240 }
            r9.f298430m = r6     // Catch:{ all -> 0x0240 }
            if (r1 == 0) goto L_0x023f
            com.google.apps.tiktok.tracing.f r1 = (com.google.apps.tiktok.tracing.C47818f) r1
            com.google.apps.tiktok.tracing.k r10 = r1.f123842a
            r10.mo51690q()
        L_0x023f:
            return
        L_0x0240:
            r10 = move-exception
            if (r1 == 0) goto L_0x024f
            com.google.apps.tiktok.tracing.f r1 = (com.google.apps.tiktok.tracing.C47818f) r1     // Catch:{ all -> 0x024b }
            com.google.apps.tiktok.tracing.k r0 = r1.f123842a     // Catch:{ all -> 0x024b }
            r0.mo51690q()     // Catch:{ all -> 0x024b }
            goto L_0x024f
        L_0x024b:
            r0 = move-exception
            com.google.android.apps.gsa.staticplugins.opa.appactions.C107309j.m178145a(r10, r0)
        L_0x024f:
            goto L_0x0251
        L_0x0250:
            throw r10
        L_0x0251:
            goto L_0x0250
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.appactions.AppShortcutActivity.onCreate(android.os.Bundle):void");
    }

    public final boolean onCreatePanelMenu(int i, Menu menu) {
        C47573bx t = this.f298429l.mo51693t();
        try {
            boolean onCreatePanelMenu = super.onCreatePanelMenu(i, menu);
            t.close();
            return onCreatePanelMenu;
        } catch (Throwable th) {
            C107309j.m178145a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        C47573bx b = this.f298429l.mo51675b();
        try {
            super.onDestroy();
            this.f298433p = true;
            ((C47849i) b).f123902a.mo51685l();
            return;
        } catch (Throwable th) {
            C107309j.m178145a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        C47573bx c = this.f298429l.mo51676c(intent);
        try {
            super.onNewIntent(intent);
            if (c != null) {
                ((C47818f) c).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C107309j.m178145a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx v = this.f298429l.mo51695v();
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (v != null) {
                v.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C107309j.m178145a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        C47573bx d = this.f298429l.mo51677d();
        try {
            super.onPause();
            if (d != null) {
                d.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C107309j.m178145a(th, th);
        }
        throw th;
    }

    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        C47573bx w = this.f298429l.mo51696w();
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            if (w != null) {
                w.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C107309j.m178145a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPostCreate(Bundle bundle) {
        C47573bx x = this.f298429l.mo51697x();
        try {
            super.onPostCreate(bundle);
            if (x != null) {
                ((C47818f) x).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C107309j.m178145a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onPostResume() {
        C47573bx e = this.f298429l.mo51678e();
        try {
            super.onPostResume();
            ((C47762d) e).f123749a.mo51686m();
            return;
        } catch (Throwable th) {
            C107309j.m178145a(th, th);
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
            C107309j.m178145a(th, th);
        }
        throw th;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C47573bx k = this.f298429l.mo51684k("onRequestPermissionsResult");
        try {
            super.onRequestPermissionsResult(i, strArr, iArr);
            if (k != null) {
                k.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C107309j.m178145a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        C47573bx f = this.f298429l.mo51679f();
        try {
            super.onResume();
            m177977x();
            C0401v.m1321C();
            if (f != null) {
                ((C47818f) f).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C107309j.m178145a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        C47573bx y = this.f298429l.mo51698y();
        try {
            super.onSaveInstanceState(bundle);
            if (y != null) {
                y.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C107309j.m178145a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        C47573bx g = this.f298429l.mo51680g();
        try {
            super.onStart();
            if (g != null) {
                ((C47818f) g).f123842a.mo51690q();
                return;
            }
            return;
        } catch (Throwable th) {
            C107309j.m178145a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        C47573bx h = this.f298429l.mo51681h();
        try {
            super.onStop();
            if (h != null) {
                h.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C107309j.m178145a(th, th);
        }
        throw th;
    }

    public final void onUserInteraction() {
        C47573bx j = this.f298429l.mo51683j();
        try {
            super.onUserInteraction();
            if (j != null) {
                j.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C107309j.m178145a(th, th);
        }
        throw th;
    }

    public final void startActivity(Intent intent) {
        if (C47214c.m83984a(intent, getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent);
    }

    /* renamed from: v */
    public final /* synthetic */ C68314a mo95840v() {
        return new C47241j(this);
    }

    /* renamed from: z */
    public final /* bridge */ /* synthetic */ Object mo17754z() {
        C107316q qVar = this.f298428k;
        if (qVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f298433p) {
            return qVar;
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
