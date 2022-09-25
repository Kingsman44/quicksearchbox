package com.google.android.libraries.search.p2904c.p2916e.p2925c;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.NoiseSuppressor;
import com.google.android.libraries.search.p2904c.C37354as;
import com.google.android.libraries.search.p2904c.C37360ay;
import com.google.android.libraries.search.p2904c.C37512ds;
import com.google.android.libraries.search.p2904c.C37514du;
import com.google.android.libraries.search.p2904c.C37516dw;
import com.google.android.libraries.search.p2904c.C37519dz;
import com.google.android.libraries.search.p2904c.C37561eb;
import com.google.android.libraries.search.p2904c.p2906aa.C37331f;
import com.google.android.libraries.search.p2904c.p2916e.C37521a;
import com.google.android.libraries.search.p2904c.p2916e.C37558e;
import com.google.android.libraries.search.p2904c.p2916e.p2917a.C37522a;
import com.google.android.libraries.search.p2904c.p2916e.p2917a.p2919b.p2920a.C37527a;
import com.google.android.libraries.search.p2904c.p2916e.p2917a.p2919b.p2921b.C37531d;
import com.google.android.libraries.search.p2904c.p2916e.p2917a.p2922c.C37535b;
import com.google.android.libraries.search.p2904c.p2916e.p2925c.p2926a.C37543c;
import com.google.android.libraries.search.p2904c.p2942m.p2943a.C37846as;
import com.google.android.libraries.search.p2904c.p2951n.C37902d;
import com.google.android.libraries.search.p2904c.p2964r.C37957a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.search.c.e.c.g */
/* compiled from: PG */
public final class C37549g implements C37521a {

    /* renamed from: a */
    private static final C59071e f99761a = C59071e.m91332i("com.google.android.libraries.search.c.e.c.g");

    /* renamed from: b */
    private final C37360ay f99762b;

    /* renamed from: c */
    private final Context f99763c;

    /* renamed from: d */
    private final C37543c f99764d;

    /* renamed from: e */
    private final C37957a f99765e;

    /* renamed from: f */
    private final C37522a f99766f;

    /* renamed from: g */
    private final C58833ax f99767g;

    /* renamed from: h */
    private final C58833ax f99768h;

    /* renamed from: i */
    private final C58833ax f99769i;

    /* renamed from: j */
    private final C37535b f99770j;

    /* renamed from: k */
    private final C58833ax f99771k;

    /* renamed from: l */
    private C58833ax f99772l;

    /* renamed from: m */
    private C58833ax f99773m;

    /* renamed from: n */
    private C58833ax f99774n;

    /* renamed from: o */
    private final C37527a f99775o;

    /* renamed from: p */
    private C37554l f99776p = new C37554l();

    public C37549g(C37535b bVar, C58833ax axVar, Context context, C37543c cVar, C37957a aVar, C37527a aVar2, C37522a aVar3, C58833ax axVar2, C58833ax axVar3, C58833ax axVar4) {
        C58836b bVar2 = C58836b.f156633a;
        this.f99772l = bVar2;
        this.f99773m = bVar2;
        this.f99774n = bVar2;
        this.f99770j = bVar;
        this.f99771k = axVar;
        C37360ay ayVar = bVar.f99723d;
        this.f99762b = ayVar == null ? C37360ay.f99224l : ayVar;
        this.f99763c = context;
        this.f99764d = cVar;
        this.f99765e = aVar;
        this.f99775o = aVar2;
        this.f99766f = aVar3;
        this.f99767g = axVar2;
        this.f99768h = axVar3;
        this.f99769i = axVar4;
    }

    /* renamed from: d */
    private static C37902d m66550d(Context context) {
        int mode = ((AudioManager) context.getSystemService("audio")).getMode();
        if (mode == 2 || mode == 3) {
            return new C37902d("#createAudioRecord failed: microphone in call mode.", C37846as.m66803i(C37519dz.FAILED_OPENING_ERROR_MODE_IN_CALL));
        }
        return new C37902d("#createAudioRecord failed: audio record startRecording error.", C37846as.m66803i(C37519dz.FAILED_OPENING_ERROR_START_RECORDING));
    }

    /* renamed from: e */
    private final synchronized void m66551e() {
        if (this.f99773m.mo56113h()) {
            ((NoiseSuppressor) this.f99773m.mo56107c()).release();
        }
        if (this.f99774n.mo56113h()) {
            ((AcousticEchoCanceler) this.f99774n.mo56107c()).release();
        }
    }

    /* renamed from: f */
    private final synchronized void m66552f(AudioRecord audioRecord, C37354as asVar) {
        if (asVar.f99214b) {
            this.f99773m = C37540a.m66539a(audioRecord, C37547e.f99759a);
        }
        if (asVar.f99215c) {
            this.f99774n = C37540a.m66539a(audioRecord, C37548f.f99760a);
        }
    }

    /* renamed from: g */
    private final synchronized void m66553g() {
        this.f99776p.mo41019c();
        this.f99776p = new C37554l();
    }

    /* renamed from: a */
    public final synchronized C37514du mo41002a() {
        m66553g();
        if (!this.f99772l.mo56113h()) {
            C59104x d = f99761a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ALT.AudioRecordSource");
            ((C59052c) ((C59052c) d).mo56372aa(52725)).mo56389s("#audio# close audio source(%s) failed: no audio record", C37331f.m66337a(this));
            return C37846as.m66801g(C37512ds.FAILED_CLOSING_NO_AUDIO_RECORD);
        }
        AudioRecord audioRecord = (AudioRecord) this.f99772l.mo56107c();
        int audioSessionId = audioRecord.getAudioSessionId();
        C59104x b = f99761a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ALT.AudioRecordSource");
        ((C59052c) ((C59052c) b).mo56372aa(52723)).mo56352E("#audio# close audio source(identity(%s), recordId(%d))", C37331f.m66337a(this), audioSessionId);
        try {
            audioRecord.stop();
            this.f99775o.mo41007b(audioSessionId, C37531d.STOPPED_RECORDING);
            m66551e();
            audioRecord.release();
            return C37846as.m66802h(C37516dw.CLOSED);
        } catch (IllegalStateException e) {
            C59104x d2 = f99761a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "ALT.AudioRecordSource");
            ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e)).mo56372aa(52724)).mo56389s("#audio# close audio source(%s) failed: audio record error", C37331f.m66337a(this));
            this.f99775o.mo41007b(audioSessionId, C37531d.STOP_RECORDING_FAILED);
            return C37846as.m66801g(C37512ds.FAILED_CLOSING_AUDIO_RECORD_ERROR);
        }
    }

    /* renamed from: b */
    public final synchronized C37558e mo41003b() {
        return this.f99776p;
    }

    /* renamed from: c */
    public final synchronized C58833ax mo41004c() {
        AudioRecord audioRecord;
        AudioRecord audioRecord2;
        C37519dz dzVar;
        C59104x b = f99761a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ALT.AudioRecordSource");
        ((C59052c) ((C59052c) b).mo56372aa(52726)).mo56389s("#audio# open audio source(%s)", C37331f.m66337a(this));
        this.f99772l = C58836b.f156633a;
        try {
            C37535b bVar = this.f99770j;
            int i = bVar.f99720a;
            if ((i & 2) != 0) {
                if (this.f99769i.mo56113h()) {
                    audioRecord = ((C37522a) this.f99769i.mo56107c()).mo41005a(this.f99770j);
                } else {
                    throw new C37902d("#createAudioRecord failed: missing DSP mic implementation.", C37846as.m66803i(C37519dz.FAILED_OPENING_MISSING_DSP_MIC_IMPLEMENTATION));
                }
            } else if (bVar.f99725f) {
                if (this.f99767g.mo56113h()) {
                    audioRecord = ((C37522a) this.f99767g.mo56107c()).mo41005a(this.f99770j);
                } else {
                    throw new C37902d("#createAudioRecord failed: missing zero latency mic implementation.", C37846as.m66803i(C37519dz.FAILED_OPENING_MISSING_ZERO_LATENCY_MIC_IMPLEMENTATION));
                }
            } else if ((i & 32) == 0) {
                audioRecord = this.f99766f.mo41005a(bVar);
            } else if (this.f99768h.mo56113h()) {
                audioRecord = ((C37522a) this.f99768h.mo56107c()).mo41005a(this.f99770j);
            } else {
                throw new C37902d("#createAudioRecord failed: missing media sync mic implementation.", C37846as.m66803i(C37519dz.FAILED_OPENING_MISSING_MEDIA_SYNC_MIC_IMPLEMENTATION));
            }
        } catch (C37902d e) {
            C37561eb ebVar = e.f100480a;
            if (ebVar.f99802a == 2) {
                dzVar = C37519dz.m66524a(((Integer) ebVar.f99803b).intValue());
                if (dzVar == null) {
                    dzVar = C37519dz.UNKNOWN_OPENING_FAILURE;
                }
            } else {
                dzVar = C37519dz.UNKNOWN_OPENING_FAILURE;
            }
            if (dzVar == C37519dz.FAILED_OPENING_ERROR_INIT) {
                C59104x d = f99761a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "ALT.AudioRecordSource");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(52722)).mo56386p("#audio# Failed to open zlmAudioRecord. Fallback to non-zlm AudioRecord");
                audioRecord = this.f99766f.mo41005a(this.f99770j);
            } else {
                throw e;
            }
        } catch (Throwable th) {
            this.f99776p.mo41019c();
            throw th;
        }
        C58833ax k = C58833ax.m90834k(audioRecord);
        this.f99772l = k;
        audioRecord2 = (AudioRecord) k.mo56107c();
        C37360ay ayVar = this.f99762b;
        if ((ayVar.f99226a & 32) != 0) {
            C37354as asVar = ayVar.f99232g;
            if (asVar == null) {
                asVar = C37354as.f99211d;
            }
            m66552f(audioRecord2, asVar);
        }
        this.f99776p.mo41018b(audioRecord2.getAudioSessionId());
        int audioSessionId = audioRecord2.getAudioSessionId();
        if (this.f99762b.f99227b != 1999) {
            this.f99765e.mo41166a(audioSessionId);
        }
        Context context = this.f99763c;
        int audioSessionId2 = audioRecord2.getAudioSessionId();
        C59071e eVar = f99761a;
        C59104x b2 = eVar.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "ALT.AudioRecordSource");
        ((C59052c) ((C59052c) b2).mo56372aa(52727)).mo56352E("#audio# create audio stream for audio record source(identity(%s), recordId(%d))", C37331f.m66337a(this), audioSessionId2);
        try {
            audioRecord2.startRecording();
            this.f99775o.mo41007b(audioSessionId2, C37531d.STARTED_RECORDING);
            if (audioRecord2.getRecordingState() == 3) {
            } else {
                C59104x d2 = eVar.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "ALT.AudioRecordSource");
                ((C59052c) ((C59052c) d2).mo56372aa(52728)).mo56386p("#audio# openAudioSourceInternal failed: audio record recordingState error.");
                throw m66550d(context);
            }
        } catch (IllegalStateException e2) {
            C59104x d3 = f99761a.mo56226d();
            d3.mo56378ag(C58975e.f156826a, "ALT.AudioRecordSource");
            ((C59052c) ((C59052c) ((C59052c) d3).mo56382g(e2)).mo56372aa(52729)).mo56386p("#audio# openAudioSourceInternal failed: audio record startRecording error.");
            this.f99775o.mo41007b(audioSessionId2, C37531d.START_RECORDING_FAILED);
            throw m66550d(context);
        }
        return C58833ax.m90834k(this.f99764d.mo41014a(audioRecord2, this.f99770j, this.f99771k));
    }
}
