package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b;

import android.app.KeyguardManager;
import android.content.Intent;
import android.databinding.C0118a;
import com.google.common.p4526f.C58979ad;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.b.b */
/* compiled from: PG */
public final class C33243b extends KeyguardManager.KeyguardDismissCallback {

    /* renamed from: a */
    final /* synthetic */ Intent f88891a;

    /* renamed from: b */
    final /* synthetic */ C33245d f88892b;

    public C33243b(C33245d dVar, Intent intent) {
        this.f88892b = dVar;
        this.f88891a = intent;
    }

    public final void onDismissCancelled() {
    }

    public final void onDismissError() {
        C0118a.m96d(C33245d.f88893a.mo56225c(), "#show: User cancelled dismissing keyguard", 51164, C58979ad.SMALL);
    }

    public final void onDismissSucceeded() {
        C33245d dVar = this.f88892b;
        dVar.f88894b.mo38560b(this.f88891a, new C33242a(dVar));
    }
}
