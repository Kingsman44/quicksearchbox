package com.google.android.apps.search.soundsearch.service;

import android.media.musicrecognition.MusicRecognitionService;
import com.google.android.gms.tasks.C146039s;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.search.soundsearch.service.c */
/* compiled from: PG */
public final /* synthetic */ class C141732c implements C146039s {

    /* renamed from: a */
    public final /* synthetic */ MusicRecognitionService.Callback f384706a;

    public /* synthetic */ C141732c(MusicRecognitionService.Callback callback) {
        this.f384706a = callback;
    }

    /* renamed from: d */
    public final void mo18633d(Exception exc) {
        MusicRecognitionService.Callback callback = this.f384706a;
        ((C59052c) ((C59052c) ((C59052c) SoundSearchService.f384699a.mo56225c()).mo56382g(exc)).mo56372aa(41813)).mo56386p("#SoSeFingerprinter Failed to download native split.");
        callback.onRecognitionFailed(3);
    }
}
