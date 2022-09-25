package com.google.android.libraries.assistant.hotword;

import android.media.AudioRecord;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.assistant.hotword.f */
/* compiled from: PG */
public final /* synthetic */ class C18369f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C18371h f52106a;

    /* renamed from: b */
    public final /* synthetic */ C18370g f52107b;

    public /* synthetic */ C18369f(C18371h hVar, C18370g gVar) {
        this.f52106a = hVar;
        this.f52107b = gVar;
    }

    public final void run() {
        C18371h hVar = this.f52106a;
        C18370g gVar = this.f52107b;
        try {
            AudioRecord audioRecord = hVar.f52112e;
            int i = 0;
            if (audioRecord == null) {
                ((C59052c) ((C59052c) C18371h.f52108b.mo56225c()).mo56372aa(47155)).mo56386p("AudioRecord is null, can't start recording");
                C18371h.m35746o(gVar, false);
                return;
            }
            try {
                ((C59052c) ((C59052c) C18371h.f52108b.mo56224b()).mo56372aa(47148)).mo56386p("Audio Starting");
                audioRecord.startRecording();
                AudioRecord audioRecord2 = hVar.f52112e;
                if (audioRecord2 != null) {
                    if (audioRecord2.getRecordingState() != 3) {
                        ((C59052c) ((C59052c) C18371h.f52108b.mo56225c()).mo56372aa(47152)).mo56386p("recording stopped, not in RECORDSTATE_RECORDING state");
                        hVar.mo23808b();
                        C18371h.m35746o(gVar, false);
                        return;
                    }
                    ((C59052c) ((C59052c) C18371h.f52108b.mo56224b()).mo56372aa(47151)).mo56386p("Audio Started");
                }
                byte[] bArr = new byte[hVar.mo23853g()];
                hVar.f52118k = System.currentTimeMillis() * 1000;
                hVar.f52119l = 0;
                hVar.f52120m = 50;
                do {
                    AudioRecord audioRecord3 = hVar.f52112e;
                    if (audioRecord3 == null || i == -1) {
                        hVar.mo23808b();
                        C18371h.m35746o(gVar, true);
                    } else {
                        i = hVar.mo23854h(audioRecord3, bArr);
                    }
                } while (i != 0);
                hVar.mo23808b();
                C18371h.m35746o(gVar, true);
            } catch (IllegalStateException e) {
                ((C59052c) ((C59052c) ((C59052c) C18371h.f52108b.mo56225c()).mo56382g(e)).mo56372aa(47153)).mo56386p("Not able to start recording");
                hVar.mo23808b();
                C18371h.m35746o(gVar, false);
            } catch (NullPointerException unused) {
                ((C59052c) ((C59052c) C18371h.f52108b.mo56225c()).mo56372aa(47154)).mo56386p("Not able to start recording, AudioRecord is null");
                C18371h.m35746o(gVar, false);
            }
        } catch (IllegalStateException e2) {
            hVar.mo23808b();
            C18371h.m35746o(gVar, true);
            throw e2;
        } catch (C90457d e3) {
            ((C59052c) ((C59052c) ((C59052c) C18371h.f52108b.mo56225c()).mo56382g(e3)).mo56372aa(47150)).mo56386p("audioRecord read failed");
            hVar.mo23808b();
            C18371h.m35746o(gVar, true);
        } catch (RuntimeException e4) {
            ((C59052c) ((C59052c) ((C59052c) C18371h.f52108b.mo56225c()).mo56382g(e4)).mo56372aa(47146)).mo56386p("Uncaught exception occurred when recording audio.");
            C18371h.m35746o(gVar, true);
        }
    }
}
