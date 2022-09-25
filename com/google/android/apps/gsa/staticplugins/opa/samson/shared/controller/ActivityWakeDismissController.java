package com.google.android.apps.gsa.staticplugins.opa.samson.shared.controller;

import android.content.Context;
import android.os.PowerManager;
import androidx.lifecycle.C2333ah;
import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2390u;
import androidx.lifecycle.C2391v;
import com.google.android.apps.gsa.assistant.shared.C73798aa;
import com.google.android.apps.gsa.assistant.shared.z;
import com.google.android.apps.gsa.staticplugins.opa.samson.charging.shared.C110121g;
import com.google.android.apps.gsa.staticplugins.opa.samson.charging.shared.OpaAmbientUiStatus;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8446q.C110397a;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
public final class ActivityWakeDismissController {

    /* renamed from: a */
    public static final C59071e f307718a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.samson.shared.controller.ActivityWakeDismissController");

    /* renamed from: j */
    private static final long f307719j = TimeUnit.SECONDS.toMillis(60);

    /* renamed from: b */
    public final Context f307720b;

    /* renamed from: c */
    public final Runnable f307721c;

    /* renamed from: d */
    public final C58833ax f307722d;

    /* renamed from: e */
    public final C2333ah f307723e;

    /* renamed from: f */
    public final C110397a f307724f;

    /* renamed from: g */
    public final OpaAmbientUiStatus f307725g;

    /* renamed from: h */
    public C2384o f307726h;

    /* renamed from: i */
    public final C110121g f307727i = new C110409f(this);

    /* renamed from: k */
    private final C2390u f307728k;

    /* compiled from: PG */
    class ChargingLifecycleObserver implements C2376g {
        public ChargingLifecycleObserver() {
        }

        /* renamed from: gV */
        public final /* synthetic */ void mo3520gV(C2391v vVar) {
        }

        /* renamed from: gW */
        public final /* synthetic */ void mo3521gW(C2391v vVar) {
        }

        /* renamed from: gX */
        public final void mo3522gX(C2391v vVar) {
            try {
                ActivityWakeDismissController activityWakeDismissController = ActivityWakeDismissController.this;
                activityWakeDismissController.f307725g.mo98394g(activityWakeDismissController.f307727i);
            } catch (Exception e) {
                C59104x d = ActivityWakeDismissController.f307718a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "AcWkDismCtrl");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(25922)).mo56386p("Exception when trying to unregister disconnect receiver.");
            }
        }

        /* renamed from: gY */
        public final void mo3523gY(C2391v vVar) {
            if (ActivityWakeDismissController.this.f307724f.mo98624b(true)) {
                ActivityWakeDismissController.m183852a(ActivityWakeDismissController.this.f307720b);
                ActivityWakeDismissController activityWakeDismissController = ActivityWakeDismissController.this;
                activityWakeDismissController.f307725g.mo98393f(activityWakeDismissController.f307727i);
                return;
            }
            ActivityWakeDismissController.this.f307721c.run();
        }

        /* renamed from: gZ */
        public final /* synthetic */ void mo3524gZ(C2391v vVar) {
        }

        /* renamed from: ha */
        public final /* synthetic */ void mo3525ha(C2391v vVar) {
        }
    }

    /* compiled from: PG */
    class DockLifecycleObserver implements C2376g {
        public DockLifecycleObserver() {
        }

        /* renamed from: gV */
        public final /* synthetic */ void mo3520gV(C2391v vVar) {
        }

        /* renamed from: gW */
        public final /* synthetic */ void mo3521gW(C2391v vVar) {
        }

        /* renamed from: gX */
        public final void mo3522gX(C2391v vVar) {
            if (ActivityWakeDismissController.this.f307722d.mo56113h()) {
                ((C73798aa) ActivityWakeDismissController.this.f307722d.mo56107c()).mo65278b().mo5679j(ActivityWakeDismissController.this.f307723e);
            }
        }

        /* renamed from: gY */
        public final void mo3523gY(C2391v vVar) {
            if (ActivityWakeDismissController.this.f307722d.mo56113h()) {
                ((C73798aa) ActivityWakeDismissController.this.f307722d.mo56107c()).mo65278b().mo5705f(ActivityWakeDismissController.this.f307723e);
                if (((C73798aa) ActivityWakeDismissController.this.f307722d.mo56107c()).mo65278b().mo3842a() != z.a) {
                    ActivityWakeDismissController.m183852a(ActivityWakeDismissController.this.f307720b);
                    return;
                }
                return;
            }
            ActivityWakeDismissController.this.f307721c.run();
        }

        /* renamed from: gZ */
        public final /* synthetic */ void mo3524gZ(C2391v vVar) {
        }

        /* renamed from: ha */
        public final /* synthetic */ void mo3525ha(C2391v vVar) {
        }
    }

    public ActivityWakeDismissController(Runnable runnable, boolean z, Context context, C58833ax axVar, C110397a aVar, OpaAmbientUiStatus opaAmbientUiStatus) {
        C2390u uVar;
        this.f307720b = context;
        this.f307721c = runnable;
        this.f307722d = axVar;
        this.f307724f = aVar;
        this.f307725g = opaAmbientUiStatus;
        if (z) {
            uVar = new ChargingLifecycleObserver();
        } else {
            uVar = new DockLifecycleObserver();
        }
        this.f307728k = uVar;
        this.f307723e = new C110408e(axVar, runnable);
    }

    /* renamed from: a */
    public static void m183852a(Context context) {
        PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(268435482, "googlequicksearchbox:samsonwake");
        newWakeLock.acquire(f307719j);
        try {
            newWakeLock.release();
        } catch (RuntimeException unused) {
        }
    }

    /* renamed from: b */
    public final void mo98645b(C2391v vVar) {
        this.f307726h = vVar.getLifecycle();
        vVar.getLifecycle().mo5790b(this.f307728k);
    }
}
