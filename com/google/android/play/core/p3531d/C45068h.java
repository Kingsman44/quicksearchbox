package com.google.android.play.core.p3531d;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.C146010af;
import com.google.android.play.core.p3529c.C45053a;
import com.google.android.play.core.p3533e.C45079k;
import com.google.android.play.core.p3542h.C45195d;

/* renamed from: com.google.android.play.core.d.h */
/* compiled from: PG */
public final class C45068h {

    /* renamed from: a */
    public static final C45053a f117709a = new C45053a("PrewarmService");

    /* renamed from: d */
    private static final Intent f117710d = new Intent("com.google.android.play.core.prewarm.BIND_PREWARM_SERVICE").setPackage("com.android.vending");

    /* renamed from: b */
    final C45079k f117711b;

    /* renamed from: c */
    public final String f117712c;

    public C45068h(Context context) {
        if (C45195d.m80473a(context)) {
            this.f117711b = new C45079k(context.getApplicationContext(), f117709a, "PrewarmService", f117710d, C45065e.f117704a);
        } else {
            this.f117711b = null;
        }
        this.f117712c = context.getPackageName();
    }

    /* renamed from: a */
    public final void mo48899a() {
        if (this.f117711b != null) {
            f117709a.mo48886d("detach", new Object[0]);
            this.f117711b.mo48911e();
        }
    }

    /* renamed from: b */
    public final void mo48900b(C45062b bVar) {
        C45053a aVar = f117709a;
        aVar.mo48886d("prewarm(%s)", this.f117712c);
        if (this.f117711b == null) {
            aVar.mo48884b("error: %s", "Play Store not found.");
            return;
        }
        C146010af afVar = new C146010af();
        this.f117711b.mo48909c(new C45066f(this, afVar, bVar, afVar), afVar);
    }
}
