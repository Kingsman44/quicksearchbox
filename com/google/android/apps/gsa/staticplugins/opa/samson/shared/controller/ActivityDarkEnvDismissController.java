package com.google.android.apps.gsa.staticplugins.opa.samson.shared.controller;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import androidx.lifecycle.C2333ah;
import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2391v;
import com.google.android.apps.gsa.staticplugins.opa.samson.lightness.C110254f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* compiled from: PG */
public final class ActivityDarkEnvDismissController {

    /* renamed from: a */
    public static final C59071e f307698a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.samson.shared.controller.ActivityDarkEnvDismissController");

    /* renamed from: b */
    public final C110254f f307699b;

    /* renamed from: c */
    public final SensorManager f307700c;

    /* renamed from: d */
    public final Sensor f307701d;

    /* renamed from: e */
    public final C2333ah f307702e;

    /* renamed from: f */
    private final LifecycleObserver f307703f = new LifecycleObserver();

    /* compiled from: PG */
    class LifecycleObserver implements C2376g {
        public LifecycleObserver() {
        }

        /* renamed from: gV */
        public final /* synthetic */ void mo3520gV(C2391v vVar) {
        }

        /* renamed from: gW */
        public final /* synthetic */ void mo3521gW(C2391v vVar) {
        }

        /* renamed from: gX */
        public final void mo3522gX(C2391v vVar) {
            if (ActivityDarkEnvDismissController.this.f307699b != null) {
                C59104x b = ActivityDarkEnvDismissController.f307698a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "ActivityDEDC");
                ((C59052c) ((C59052c) b).mo56372aa(25914)).mo56386p("unregister lightness listener");
                ActivityDarkEnvDismissController activityDarkEnvDismissController = ActivityDarkEnvDismissController.this;
                activityDarkEnvDismissController.f307700c.unregisterListener(activityDarkEnvDismissController.f307699b);
                ActivityDarkEnvDismissController activityDarkEnvDismissController2 = ActivityDarkEnvDismissController.this;
                activityDarkEnvDismissController2.f307699b.mo5679j(activityDarkEnvDismissController2.f307702e);
            }
        }

        /* renamed from: gY */
        public final void mo3523gY(C2391v vVar) {
            if (ActivityDarkEnvDismissController.this.f307701d != null) {
                C59104x b = ActivityDarkEnvDismissController.f307698a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "ActivityDEDC");
                ((C59052c) ((C59052c) b).mo56372aa(25915)).mo56386p("register lightness listener");
                ActivityDarkEnvDismissController activityDarkEnvDismissController = ActivityDarkEnvDismissController.this;
                activityDarkEnvDismissController.f307700c.registerListener(activityDarkEnvDismissController.f307699b, activityDarkEnvDismissController.f307701d, 0);
                ActivityDarkEnvDismissController activityDarkEnvDismissController2 = ActivityDarkEnvDismissController.this;
                activityDarkEnvDismissController2.f307699b.mo5705f(activityDarkEnvDismissController2.f307702e);
            }
        }

        /* renamed from: gZ */
        public final /* synthetic */ void mo3524gZ(C2391v vVar) {
        }

        /* renamed from: ha */
        public final /* synthetic */ void mo3525ha(C2391v vVar) {
        }
    }

    public ActivityDarkEnvDismissController(Runnable runnable, Context context, C110254f fVar) {
        this.f307699b = fVar;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f307700c = sensorManager;
        this.f307701d = sensorManager.getDefaultSensor(5);
        this.f307702e = new C110404a(runnable);
    }

    /* renamed from: a */
    public final void mo98643a(C2391v vVar) {
        vVar.getLifecycle().mo5790b(this.f307703f);
    }
}
