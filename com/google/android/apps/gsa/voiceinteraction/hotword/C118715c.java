package com.google.android.apps.gsa.voiceinteraction.hotword;

import android.os.PersistableBundle;
import android.os.SharedMemory;
import android.service.voice.HotwordDetector;
import com.google.android.apps.gsa.shared.speech.hotword.HotwordResult;
import com.google.android.hotword.service.HotwordInformation;

/* renamed from: com.google.android.apps.gsa.voiceinteraction.hotword.c */
/* compiled from: PG */
public final class C118715c {

    /* renamed from: a */
    final /* synthetic */ C118719g f331135a;

    public C118715c(C118719g gVar) {
        this.f331135a = gVar;
    }

    /* renamed from: a */
    public final HotwordDetector mo103903a(PersistableBundle persistableBundle, SharedMemory sharedMemory, HotwordDetector.Callback callback) {
        return this.f331135a.f331141d.mo49464a(persistableBundle, sharedMemory, callback);
    }

    /* renamed from: b */
    public final void mo103904b() {
        C118717e eVar = this.f331135a.f331141d;
        if (eVar != null) {
            eVar.mo49465b(true);
        }
    }

    /* renamed from: c */
    public final void mo103905c(HotwordResult hotwordResult) {
        C118719g gVar = this.f331135a;
        HotwordInformation hotwordInformation = gVar.f331148k;
        if (hotwordInformation == null || hotwordInformation.f395878J) {
            gVar.mo103915g();
        }
        C118717e eVar = this.f331135a.f331141d;
        if (eVar != null) {
            eVar.mo49466c(hotwordResult);
        }
    }

    /* renamed from: d */
    public final void mo103906d() {
        C118717e eVar = this.f331135a.f331141d;
        if (eVar != null) {
            eVar.mo49467d();
        }
    }

    /* renamed from: e */
    public final void mo103907e(HotwordResult hotwordResult) {
        C118719g gVar = this.f331135a;
        HotwordInformation hotwordInformation = gVar.f331148k;
        if (hotwordInformation == null || hotwordInformation.f395878J) {
            gVar.mo103915g();
        }
        C118717e eVar = this.f331135a.f331141d;
        if (eVar != null) {
            eVar.mo49468e(hotwordResult);
        }
    }
}
