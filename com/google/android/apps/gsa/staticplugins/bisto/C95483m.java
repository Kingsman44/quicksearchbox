package com.google.android.apps.gsa.staticplugins.bisto;

import android.content.Intent;
import android.service.voice.VoiceInteractionService;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.search.logging.p3041d.C39141kp;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.m */
/* compiled from: PG */
public final /* synthetic */ class C95483m implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ BistoRealService f267199a;

    /* renamed from: b */
    public final /* synthetic */ Intent f267200b;

    /* renamed from: c */
    public final /* synthetic */ boolean f267201c;

    public /* synthetic */ C95483m(BistoRealService bistoRealService, Intent intent, boolean z) {
        this.f267199a = bistoRealService;
        this.f267200b = intent;
        this.f267201c = z;
    }

    public final void run() {
        BistoRealService bistoRealService = this.f267199a;
        Intent intent = this.f267200b;
        boolean z = this.f267201c;
        String action = intent != null ? intent.getAction() : "null";
        if (action == null || !BistoRealService.f264671b.contains(action)) {
            action = BuildConfig.FLAVOR;
        }
        ((C19567d) ((C39141kp) bistoRealService.f264695s.mo27525b()).f102813X.mo6453a()).mo24822a(1, action, Boolean.valueOf(!z), Boolean.valueOf(VoiceInteractionService.isActiveService(bistoRealService.getBaseContext(), BistoRealService.f264672c)));
    }
}
