package com.google.android.apps.search.soundsearch.service;

import android.media.AudioFormat;
import android.media.MediaMetadata;
import android.media.musicrecognition.MusicRecognitionService;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import com.google.android.apps.search.soundsearch.p10657f.p10658a.C141664a;
import com.google.android.apps.search.soundsearch.p10660g.C141702k;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.libraries.search.p2871b.p2872a.p2883k.C37203a;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.android.libraries.search.p3047m.p3050b.C39227c;
import com.google.android.play.core.p3538g.C45121ag;
import com.google.android.play.core.p3538g.C45122ah;
import com.google.android.play.core.p3538g.C45187v;
import com.google.android.play.core.p3538g.C45188w;
import com.google.apps.tiktok.inject.C47266f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.net.p4726a.p4727a.C62722b;
import java.io.IOException;
import java.io.PushbackInputStream;
import p3186j$.time.Duration;

/* compiled from: PG */
public final class SoundSearchService extends MusicRecognitionService {

    /* renamed from: a */
    public static final C59071e f384699a = C59071e.m91332i("com.google.android.apps.search.soundsearch.service.SoundSearchService");

    /* renamed from: d */
    private static final Duration f384700d = Duration.ofSeconds(16);

    /* renamed from: b */
    public C141702k f384701b;

    /* renamed from: c */
    public C141664a f384702c;

    /* renamed from: e */
    private C45187v f384703e;

    /* renamed from: com.google.android.apps.search.soundsearch.service.SoundSearchService$a */
    /* compiled from: PG */
    public interface C141729a {
        /* renamed from: rg */
        void mo116694rg(SoundSearchService soundSearchService);
    }

    /* renamed from: b */
    public static void m229975b(MusicRecognitionService.Callback callback) {
        MediaMetadata build = new MediaMetadata.Builder().build();
        Bundle bundle = new Bundle();
        bundle.putBoolean("EXTRA_SOUND_SEARCH_FINGERPRINTER_INSTALLED", true);
        callback.onRecognitionSucceeded(build, bundle);
    }

    /* renamed from: a */
    public final void mo116690a(C62722b bVar) {
        C141664a aVar = this.f384702c;
        if (aVar != null && aVar.f384509b) {
            aVar.f384508a.mo19974a(C37203a.f98730i.mo40805c(bVar));
            aVar.f384509b = false;
        }
    }

    public final String getAttributionTag() {
        return C39227c.m68658b(C39226b.TAG_SOUND_SEARCH_NOW_PLAYING);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.content.Context, android.media.musicrecognition.MusicRecognitionService, com.google.android.apps.search.soundsearch.service.SoundSearchService] */
    public final void onCreate() {
        SoundSearchService.super.onCreate();
        ((C141729a) C47266f.m84076a(this, C141729a.class)).mo116694rg(this);
        this.f384703e = C45188w.m80459a(getApplicationContext());
    }

    public final void onRecognize(ParcelFileDescriptor parcelFileDescriptor, AudioFormat audioFormat, MusicRecognitionService.Callback callback) {
        C45187v vVar = this.f384703e;
        if (vVar == null) {
            ((C59052c) ((C59052c) f384699a.mo56224b()).mo56372aa(41818)).mo56386p("#SoSeFingerprinter SplitInstallManager is uninitialized");
            callback.onRecognitionFailed(3);
            return;
        }
        boolean contains = vVar.mo49000g().contains("sound_search_fingerprinter_split");
        C59071e eVar = f384699a;
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(41814)).mo56389s("#SoSeFingerprinter Install status of native split: %s", Boolean.valueOf(contains));
        if (!contains) {
            ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(41809)).mo56386p("#SoSeFingerprinter #installNativeSplit");
            C45187v vVar2 = this.f384703e;
            vVar2.getClass();
            vVar2.mo49001h(new C141730a(callback));
            C45187v vVar3 = this.f384703e;
            C45121ag agVar = new C45121ag();
            agVar.mo48957a("sound_search_fingerprinter_split");
            C146006ab e = vVar3.mo48998e(new C45122ah(agVar));
            e.mo122499r(C141731b.f384705a);
            e.mo122498q(new C141732c(callback));
        } else if (this.f384701b == null) {
            ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(41817)).mo56386p("#SoSeFingerprinter S3RecognizerFactory is uninitialized");
            callback.onRecognitionFailed(3);
        } else {
            PushbackInputStream pushbackInputStream = new PushbackInputStream(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), 1);
            try {
                int read = pushbackInputStream.read();
                if (read == -1) {
                    ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(41816)).mo56386p("#SoSeFingerprinter Special request");
                    m229975b(callback);
                    return;
                }
                pushbackInputStream.unread(read);
                C141664a aVar = this.f384702c;
                if (aVar != null && !aVar.f384509b) {
                    aVar.f384508a.mo19974a(C37203a.f98729h);
                    aVar.f384509b = true;
                }
                ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(41819)).mo56386p("#SoSeFingerprinter #startListening");
                C141702k kVar = this.f384701b;
                kVar.getClass();
                kVar.mo116661a(new C141733d(this, callback)).mo116660e(pushbackInputStream, f384700d, 7);
            } catch (IOException e2) {
                ((C59052c) ((C59052c) ((C59052c) f384699a.mo56226d()).mo56382g(e2)).mo56372aa(41815)).mo56386p("Exception when reading the input stream");
                callback.onRecognitionFailed(7);
            }
        }
    }
}
