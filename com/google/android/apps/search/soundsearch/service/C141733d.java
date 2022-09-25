package com.google.android.apps.search.soundsearch.service;

import android.media.MediaMetadata;
import android.media.musicrecognition.MusicRecognitionService;
import android.os.Bundle;
import com.google.android.apps.search.soundsearch.p10654c.C141648c;
import com.google.android.apps.search.soundsearch.p10654c.C141649d;
import com.google.android.apps.search.soundsearch.p10660g.C141703l;
import com.google.audio.p4107b.p4108a.C54586i;
import com.google.audio.p4107b.p4108a.C54591n;
import com.google.common.p4526f.C59052c;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.speech.p5224k.p5225a.C67184ab;

/* renamed from: com.google.android.apps.search.soundsearch.service.d */
/* compiled from: PG */
final class C141733d implements C141703l {

    /* renamed from: a */
    final /* synthetic */ MusicRecognitionService.Callback f384707a;

    /* renamed from: b */
    final /* synthetic */ SoundSearchService f384708b;

    public C141733d(SoundSearchService soundSearchService, MusicRecognitionService.Callback callback) {
        this.f384708b = soundSearchService;
        this.f384707a = callback;
    }

    /* renamed from: a */
    public final void mo116647a(C141648c cVar) {
        ((C59052c) ((C59052c) ((C59052c) SoundSearchService.f384699a.mo56226d()).mo56382g(cVar)).mo56372aa(41807)).mo56386p("#onError received SoundSearchException");
        if (cVar instanceof C141649d) {
            this.f384708b.mo116690a(C62722b.NOT_FOUND);
            this.f384707a.onRecognitionFailed(1);
            return;
        }
        this.f384708b.mo116690a(C62722b.INTERNAL);
        this.f384707a.onRecognitionFailed(-1);
    }

    /* renamed from: b */
    public final void mo116648b(C67184ab abVar) {
        C54591n nVar = abVar.f182607b;
        if (nVar == null) {
            nVar = C54591n.f143323c;
        }
        if (nVar.f143325a.size() == 0) {
            ((C59052c) ((C59052c) SoundSearchService.f384699a.mo56226d()).mo56372aa(41808)).mo56386p("#onResult unexpected empty result");
            this.f384708b.mo116690a(C62722b.INTERNAL);
            this.f384707a.onRecognitionFailed(-1);
            return;
        }
        MediaMetadata build = new MediaMetadata.Builder().build();
        Bundle bundle = new Bundle();
        C54591n nVar2 = abVar.f182607b;
        if (nVar2 == null) {
            nVar2 = C54591n.f143323c;
        }
        bundle.putByteArray("EXTRA_SOUND_SEARCH_EARS_RESULT", ((C54586i) nVar2.f143325a.get(0)).toByteArray());
        this.f384708b.mo116690a(C62722b.OK);
        this.f384707a.onRecognitionSucceeded(build, bundle);
    }
}
