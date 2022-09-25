package com.google.android.apps.gsa.staticplugins.opa.samson.shared.controller;

import android.content.Context;
import androidx.core.app.C1800aq;
import androidx.lifecycle.C2333ah;
import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2391v;
import com.google.android.apps.gsa.assistant.shared.bo;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.staticplugins.opa.samson.charging.lifecycleobservers.C110114a;
import com.google.android.apps.gsa.staticplugins.opa.samson.charging.shared.OpaAmbientUiStatus;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8430e.C110130e;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.libraries.search.assistant.proactive.C36337r;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* compiled from: PG */
public final class ActivityIdleDismissController {

    /* renamed from: a */
    public static final C59071e f307705a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.samson.shared.controller.ActivityIdleDismissController");

    /* renamed from: b */
    public final Context f307706b;

    /* renamed from: c */
    public final C36337r f307707c;

    /* renamed from: d */
    public final C68214a f307708d;

    /* renamed from: e */
    public final C1800aq f307709e;

    /* renamed from: f */
    public final OpaAmbientUiStatus f307710f;

    /* renamed from: g */
    public final C118561t f307711g;

    /* renamed from: h */
    public final C86124t f307712h;

    /* renamed from: i */
    public final bo f307713i;

    /* renamed from: j */
    public final C2333ah f307714j;

    /* renamed from: k */
    public final C110130e f307715k;

    /* renamed from: l */
    private final LifecycleObserver f307716l = new LifecycleObserver();

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
        public final /* synthetic */ void mo3522gX(C2391v vVar) {
        }

        /* renamed from: gY */
        public final /* synthetic */ void mo3523gY(C2391v vVar) {
        }

        /* renamed from: gZ */
        public final void mo3524gZ(C2391v vVar) {
            if (!ActivityIdleDismissController.this.f307715k.mo5709m()) {
                C59104x b = ActivityIdleDismissController.f307705a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "ActivityIDC");
                ((C59052c) ((C59052c) b).mo56372aa(25918)).mo56386p("no active observers, unidle ambient mode");
                ActivityIdleDismissController.this.f307709e.f5622a.cancel("com.google.android.apps.gsa.staticplugins.opa.samson.activity.OpaAmbActivity.RestartActivity", 2200);
                ActivityIdleDismissController.this.f307711g.mo103752c(C118522by.AMBIENT_MODE_RELAUNCH);
                ActivityIdleDismissController.this.f307710f.f306845c = false;
            }
            C59104x b2 = ActivityIdleDismissController.f307705a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "ActivityIDC");
            ((C59052c) ((C59052c) b2).mo56372aa(25917)).mo56386p("register idle listener");
            ActivityIdleDismissController activityIdleDismissController = ActivityIdleDismissController.this;
            activityIdleDismissController.f307715k.mo5705f(activityIdleDismissController.f307714j);
        }

        /* renamed from: ha */
        public final void mo3525ha(C2391v vVar) {
            C59104x b = ActivityIdleDismissController.f307705a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "ActivityIDC");
            ((C59052c) ((C59052c) b).mo56372aa(25919)).mo56386p("unregister idle listener");
            ActivityIdleDismissController activityIdleDismissController = ActivityIdleDismissController.this;
            activityIdleDismissController.f307715k.mo5679j(activityIdleDismissController.f307714j);
        }
    }

    public ActivityIdleDismissController(Context context, C110114a aVar, C36337r rVar, C68214a aVar2, OpaAmbientUiStatus opaAmbientUiStatus, C118561t tVar, C86124t tVar2, bo boVar, C110407d dVar, C110130e eVar) {
        this.f307706b = context;
        this.f307707c = rVar;
        this.f307708d = aVar2;
        this.f307709e = new C1800aq(context);
        this.f307710f = opaAmbientUiStatus;
        this.f307711g = tVar;
        this.f307712h = tVar2;
        this.f307713i = boVar;
        this.f307715k = eVar;
        this.f307714j = new C110406c(this, aVar, dVar);
    }

    /* renamed from: a */
    public final void mo98644a(C2391v vVar) {
        vVar.getLifecycle().mo5790b(this.f307716l);
    }
}
