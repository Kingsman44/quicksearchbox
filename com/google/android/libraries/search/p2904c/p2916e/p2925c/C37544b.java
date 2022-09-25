package com.google.android.libraries.search.p2904c.p2916e.p2925c;

import android.content.Context;
import android.media.AudioRecord;
import com.google.android.apps.gsa.c.d.b;
import com.google.android.apps.gsa.p5836c.p5838d.C74452d;
import com.google.android.libraries.search.p2904c.C37360ay;
import com.google.android.libraries.search.p2904c.C37512ds;
import com.google.android.libraries.search.p2904c.C37514du;
import com.google.android.libraries.search.p2904c.C37516dw;
import com.google.android.libraries.search.p2904c.p2906aa.C37331f;
import com.google.android.libraries.search.p2904c.p2916e.C37521a;
import com.google.android.libraries.search.p2904c.p2916e.C37558e;
import com.google.android.libraries.search.p2904c.p2916e.p2917a.p2922c.C37535b;
import com.google.android.libraries.search.p2904c.p2916e.p2925c.p2926a.C37543c;
import com.google.android.libraries.search.p2904c.p2942m.p2943a.C37846as;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.search.c.e.c.b */
/* compiled from: PG */
public final class C37544b implements C37521a {

    /* renamed from: a */
    private static final C59071e f99747a = C59071e.m91332i("com.google.android.libraries.search.c.e.c.b");

    /* renamed from: b */
    private final C37360ay f99748b;

    /* renamed from: c */
    private final Context f99749c;

    /* renamed from: d */
    private final C37543c f99750d;

    /* renamed from: e */
    private C58833ax f99751e = C58836b.f156633a;

    /* renamed from: f */
    private C37554l f99752f = new C37554l();

    public C37544b(C37360ay ayVar, Context context, C37543c cVar) {
        this.f99748b = ayVar;
        this.f99749c = context;
        this.f99750d = cVar;
    }

    /* renamed from: d */
    private final synchronized void m66542d() {
        this.f99752f.mo41019c();
        this.f99752f = new C37554l();
    }

    /* renamed from: a */
    public final synchronized C37514du mo41002a() {
        m66542d();
        if (this.f99751e.mo56113h()) {
            AudioRecord audioRecord = (AudioRecord) this.f99751e.mo56107c();
            try {
                audioRecord.stop();
                audioRecord.release();
                return C37846as.m66802h(C37516dw.CLOSED);
            } catch (IllegalStateException e) {
                C59104x d = f99747a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "ALT.EmuAudioSource");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(52711)).mo56386p("#audio# closeAudioSource failed: audio record error.");
                return C37846as.m66801g(C37512ds.FAILED_CLOSING_AUDIO_RECORD_ERROR);
            }
        } else {
            C59104x d2 = f99747a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "ALT.EmuAudioSource");
            ((C59052c) ((C59052c) d2).mo56372aa(52710)).mo56386p("#audio# closeAudioSource failed: no audio record.");
            return C37846as.m66801g(C37512ds.FAILED_CLOSING_NO_AUDIO_RECORD);
        }
    }

    /* renamed from: b */
    public final synchronized C37558e mo41003b() {
        return this.f99752f;
    }

    /* renamed from: c */
    public final synchronized C58833ax mo41004c() {
        C58833ax axVar;
        C58833ax axVar2;
        C59104x b = f99747a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ALT.EmuAudioSource");
        ((C59052c) ((C59052c) b).mo56372aa(52713)).mo56389s("#audio# open audio source(%s)", C37331f.m66337a(this));
        try {
            Context context = this.f99749c;
            int i = this.f99748b.f99228c;
            C59104x b2 = C74452d.f208530a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "EmulatedMicFactory");
            ((C59052c) ((C59052c) b2).mo56372aa(1842)).mo56386p("createEmulatedAudioRecord");
            axVar = C58833ax.m90834k(new b(i, context));
        } catch (IllegalArgumentException e) {
            C59104x d = f99747a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ALT.EmuAudioSource");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(52712)).mo56386p("#audio# createAudioRecord failed: error creating audio record.");
            axVar = C58836b.f156633a;
        }
        this.f99751e = axVar;
        if (axVar.mo56113h()) {
            AudioRecord audioRecord = (AudioRecord) this.f99751e.mo56107c();
            this.f99752f.mo41018b(audioRecord.getAudioSessionId());
            try {
                audioRecord.startRecording();
                if (audioRecord.getRecordingState() != 3) {
                    C59104x d2 = f99747a.mo56226d();
                    d2.mo56378ag(C58975e.f156826a, "ALT.EmuAudioSource");
                    ((C59052c) ((C59052c) d2).mo56372aa(52714)).mo56386p("#audio# openAudioSourceInternal failed: audio record recordingState error.");
                    axVar2 = C58836b.f156633a;
                } else {
                    axVar2 = C58833ax.m90834k(this.f99750d.mo41014a(audioRecord, C37535b.f99718h, C58836b.f156633a));
                }
            } catch (IllegalStateException e2) {
                C59104x d3 = f99747a.mo56226d();
                d3.mo56378ag(C58975e.f156826a, "ALT.EmuAudioSource");
                ((C59052c) ((C59052c) ((C59052c) d3).mo56382g(e2)).mo56372aa(52715)).mo56386p("#audio# openAudioSourceInternal failed: audio record startRecording error.");
                axVar2 = C58836b.f156633a;
            }
        } else {
            this.f99752f.mo41019c();
            return C58836b.f156633a;
        }
        return axVar2;
    }
}
