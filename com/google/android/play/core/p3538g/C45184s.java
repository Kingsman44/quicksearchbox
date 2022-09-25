package com.google.android.play.core.p3538g;

import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.android.play.core.g.s */
/* compiled from: PG */
final class C45184s implements C45146c {

    /* renamed from: a */
    final /* synthetic */ C45137aw f117927a;

    /* renamed from: b */
    final /* synthetic */ Intent f117928b;

    /* renamed from: c */
    final /* synthetic */ Context f117929c;

    /* renamed from: d */
    final /* synthetic */ C45186u f117930d;

    public C45184s(C45186u uVar, C45137aw awVar, Intent intent, Context context) {
        this.f117930d = uVar;
        this.f117927a = awVar;
        this.f117928b = intent;
        this.f117929c = context;
    }

    /* renamed from: a */
    public final void mo48976a() {
        this.f117930d.mo49017h(this.f117927a, 5, 0);
    }

    /* renamed from: b */
    public final void mo48977b(int i) {
        this.f117930d.mo49017h(this.f117927a, 6, i);
    }

    /* renamed from: c */
    public final void mo48978c() {
        if (!this.f117928b.getBooleanExtra("triggered_from_app_after_verification", false)) {
            this.f117928b.putExtra("triggered_from_app_after_verification", true);
            this.f117929c.sendBroadcast(this.f117928b);
            return;
        }
        this.f117930d.f117689a.mo48884b("Splits copied and verified more than once.", new Object[0]);
    }
}
