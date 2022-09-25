package com.google.android.apps.search.soundsearch.service;

import android.media.musicrecognition.MusicRecognitionService;
import com.google.android.play.core.p3538g.C45137aw;
import com.google.android.play.core.p3538g.C45140az;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.search.soundsearch.service.a */
/* compiled from: PG */
public final /* synthetic */ class C141730a implements C45140az {

    /* renamed from: a */
    public final /* synthetic */ MusicRecognitionService.Callback f384704a;

    public /* synthetic */ C141730a(MusicRecognitionService.Callback callback) {
        this.f384704a = callback;
    }

    /* renamed from: a */
    public final void mo33446a(Object obj) {
        MusicRecognitionService.Callback callback = this.f384704a;
        C45137aw awVar = (C45137aw) obj;
        ((C59052c) ((C59052c) SoundSearchService.f384699a.mo56224b()).mo56372aa(41810)).mo56359L("#SoSeFingerprinter Install update: status %s, bytesDownloaded %d, totalBytesToDownload %d", Integer.valueOf(awVar.mo48947c()), Long.valueOf(awVar.mo48948d()), Long.valueOf(awVar.mo48949e()));
        if (awVar.mo48947c() == 5) {
            ((C59052c) ((C59052c) SoundSearchService.f384699a.mo56224b()).mo56372aa(41811)).mo56386p("#SoSeFingerprinter INSTALLED");
            SoundSearchService.m229975b(callback);
        }
    }
}
