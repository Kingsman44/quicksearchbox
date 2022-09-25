package com.google.android.apps.search.assistant.surfaces.onboarding.longpresspower;

import android.app.KeyguardManager;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.search.assistant.surfaces.onboarding.longpresspower.w */
/* compiled from: PG */
final class C126655w extends KeyguardManager.KeyguardDismissCallback {

    /* renamed from: a */
    final /* synthetic */ boolean f348784a;

    /* renamed from: b */
    final /* synthetic */ C126656x f348785b;

    public C126655w(C126656x xVar, boolean z) {
        this.f348785b = xVar;
        this.f348784a = z;
    }

    public final void onDismissCancelled() {
        ((C59052c) ((C59052c) C126656x.f348786a.mo56224b()).mo56372aa(37076)).mo56386p("keyguard dismiss cancelled");
    }

    public final void onDismissError() {
        ((C59052c) ((C59052c) C126656x.f348786a.mo56224b()).mo56372aa(37077)).mo56386p("failed to dismiss keyguard");
    }

    public final void onDismissSucceeded() {
        ((C59052c) ((C59052c) C126656x.f348786a.mo56224b()).mo56372aa(37078)).mo56386p("successfully dismissed keyguard");
        if (!this.f348784a) {
            this.f348785b.mo107663a();
        }
    }
}
