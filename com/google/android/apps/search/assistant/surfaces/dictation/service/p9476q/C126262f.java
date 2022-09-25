package com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.android.libraries.search.p2904c.C37680i;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4526f.C59052c;
import java.io.IOException;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.q.f */
/* compiled from: PG */
public final /* synthetic */ class C126262f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C126264h f347909a;

    /* renamed from: b */
    public final /* synthetic */ C37680i f347910b;

    public /* synthetic */ C126262f(C126264h hVar, C37680i iVar) {
        this.f347909a = hVar;
        this.f347910b = iVar;
    }

    public final void run() {
        C126264h hVar = this.f347909a;
        C37680i iVar = this.f347910b;
        C47558bi a = C47831fm.m85006a("SD.AiAiAsrClient.SendAudio");
        try {
            if (hVar.f347916e.get()) {
                a.close();
                return;
            }
            hVar.f347920i.mo106866m().write(iVar.f100074b.mo59043o());
            a.close();
        } catch (IOException e) {
            if (hVar.f347916e.get()) {
                ((C59052c) ((C59052c) ((C59052c) C126264h.f347912a.mo56224b()).mo56382g(e)).mo56372aa(36888)).mo56386p("After stop requested: Error when writing audio data to piped stream. [SD]");
                a.close();
                return;
            }
            C59052c cVar = (C59052c) C126264h.f347912a.mo56225c();
            cVar.mo56378ag(C38505d.f101863a, Integer.valueOf(C89885b.ASSISTANT_DICTATION_ASR_AIAI_AUDIO_PIPE_ERROR_VALUE));
            ((C59052c) ((C59052c) cVar.mo56382g(e)).mo56372aa(36887)).mo56386p("Error when writing audio data to piped stream. [SD]");
            hVar.f347918g.mo107496b(e);
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th2});
                } catch (Exception unused) {
                }
            }
            throw th;
        }
    }
}
