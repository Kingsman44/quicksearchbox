package com.google.android.apps.gsa.nga.engine.p6044n.p6051d;

import android.widget.Toast;
import com.google.android.apps.gsa.nga.engine.p6044n.C76248a;
import com.google.android.apps.gsa.nga.engine.p6044n.C76401e;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82831ca;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.d.ad */
/* compiled from: PG */
public final /* synthetic */ class C76347ad implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C76363at f211439a;

    /* renamed from: b */
    public final /* synthetic */ C76401e f211440b;

    public /* synthetic */ C76347ad(C76363at atVar, C76401e eVar) {
        this.f211439a = atVar;
        this.f211440b = eVar;
    }

    public final void run() {
        C76363at atVar = this.f211439a;
        C82831ca a = C82831ca.m132406a(((C76248a) this.f211440b).f211268a.mo72527d().f225879d);
        if (a == null) {
            a = C82831ca.FULFILLMENT_ABORT_FULFILLER_UNKNOWN;
        }
        Toast makeText = Toast.makeText(atVar.f211463b, a == C82831ca.POP ? "On-device execution by POP" : "On-device execution", 0);
        makeText.setGravity(49, 0, 0);
        makeText.show();
    }
}
