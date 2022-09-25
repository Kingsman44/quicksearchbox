package com.google.android.apps.gsa.voiceinteraction.hotword;

import android.os.PersistableBundle;
import android.os.SharedMemory;
import android.service.voice.HotwordDetector;
import com.google.android.apps.gsa.shared.speech.hotword.HotwordResult;

/* renamed from: com.google.android.apps.gsa.voiceinteraction.hotword.e */
/* compiled from: PG */
public interface C118717e {
    /* renamed from: a */
    HotwordDetector mo49464a(PersistableBundle persistableBundle, SharedMemory sharedMemory, HotwordDetector.Callback callback);

    /* renamed from: b */
    void mo49465b(boolean z);

    /* renamed from: c */
    void mo49466c(HotwordResult hotwordResult);

    /* renamed from: d */
    void mo49467d();

    /* renamed from: e */
    void mo49468e(HotwordResult hotwordResult);
}
