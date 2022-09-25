package com.google.android.apps.gsa.search.core.state.p6872d;

import android.content.BroadcastReceiver;
import android.content.Intent;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.search.core.state.d.ay */
/* compiled from: PG */
public final /* synthetic */ class C86931ay implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C86932az f234762a;

    /* renamed from: b */
    public final /* synthetic */ Intent f234763b;

    /* renamed from: c */
    public final /* synthetic */ BroadcastReceiver.PendingResult f234764c;

    public /* synthetic */ C86931ay(C86932az azVar, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
        this.f234762a = azVar;
        this.f234763b = intent;
        this.f234764c = pendingResult;
    }

    public final void run() {
        C86932az azVar = this.f234762a;
        Intent intent = this.f234763b;
        BroadcastReceiver.PendingResult pendingResult = this.f234764c;
        try {
            C59071e eVar = C86938be.f234771a;
            C58976aa aaVar = C58975e.f156826a;
            String action = intent.getAction();
            if (action.equals("android.intent.action.USER_FOREGROUND")) {
                azVar.f234765a.mo80580H(true);
            } else if (action.equals("android.intent.action.USER_BACKGROUND")) {
                azVar.f234765a.mo80580H(false);
            }
            if (pendingResult != null) {
                pendingResult.finish();
            }
        } catch (Throwable th) {
            if (pendingResult != null) {
                pendingResult.finish();
            }
            throw th;
        }
    }
}
