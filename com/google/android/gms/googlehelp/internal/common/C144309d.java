package com.google.android.gms.googlehelp.internal.common;

import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.util.C144004d;
import com.google.android.gms.feedback.p10795a.p10796a.C144191a;
import java.util.List;

/* renamed from: com.google.android.gms.googlehelp.internal.common.d */
/* compiled from: PG */
final class C144309d implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C144311f f390840a;

    public C144309d(C144311f fVar) {
        this.f390840a = fVar;
    }

    public final void run() {
        if (this.f390840a.mo119851a()) {
            Log.w("gH_GetSyncHelpPsd", "Getting sync help psd timed out.");
            List a = C144004d.m234183a(Pair.create("gms:googlehelp:sync_help_psd_failure", "timeout"));
            this.f390840a.f390841a.f390754d = C144191a.m234429a(a);
            C144311f fVar = this.f390840a;
            fVar.f390842b.mo119850a(fVar.f390841a);
        }
    }
}
