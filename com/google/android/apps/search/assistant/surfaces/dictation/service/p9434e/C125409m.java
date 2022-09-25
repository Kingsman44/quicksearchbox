package com.google.android.apps.search.assistant.surfaces.dictation.service.p9434e;

import com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q.C126277u;
import com.google.android.libraries.search.p2904c.C37362b;
import com.google.android.libraries.search.p2904c.C37680i;
import com.google.android.libraries.search.p2904c.C37776k;
import com.google.android.libraries.search.p2904c.C37819l;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4763a.p4767b.p4768a.p4769a.p4770a.p4771a.C63122a;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.e.m */
/* compiled from: PG */
final class C125409m implements C37362b {

    /* renamed from: a */
    final /* synthetic */ C125411o f345858a;

    /* renamed from: b */
    private final C125416t f345859b;

    public C125409m(C125411o oVar, C125416t tVar) {
        this.f345858a = oVar;
        this.f345859b = tVar;
    }

    /* renamed from: k */
    public final Executor mo39011k() {
        return this.f345858a.f345870j;
    }

    /* renamed from: b */
    public final void mo39010b(C37819l lVar) {
        C37680i iVar;
        C37680i iVar2;
        C37680i iVar3;
        int a = C37776k.m66678a(lVar.f100343b);
        int i = a - 1;
        if (a == 0) {
            throw null;
        } else if (i == 0) {
            C59071e eVar = C125411o.f345861a;
            if (lVar.f100343b == 1) {
                iVar = (C37680i) lVar.f100344c;
            } else {
                iVar = C37680i.f100071c;
            }
            iVar.f100074b.mo59031d();
            C125411o oVar = this.f345858a;
            C47558bi a2 = C47831fm.m85006a("SD.AudioSession.AudioReceived");
            try {
                if (lVar.f100343b == 1) {
                    iVar2 = (C37680i) lVar.f100344c;
                } else {
                    iVar2 = C37680i.f100071c;
                }
                iVar2.f100074b.mo59031d();
                if (oVar.f345875o.compareAndSet(false, true)) {
                    oVar.f345868h.mo107411j();
                }
                if (oVar.f345869i) {
                    C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(new C125398b(oVar, lVar)), oVar.f345872l), "Failed to handle audio in %s. [SD]", oVar.f345877q);
                } else {
                    C126277u uVar = (C126277u) oVar.f345876p.get();
                    if (uVar == null) {
                        ((C59052c) ((C59052c) C125411o.f345861a.mo56226d()).mo56372aa(36504)).mo56389s("Received audio data with no consumer in %s: Audio is dropped. [SD]", oVar.f345877q);
                        a2.close();
                        return;
                    }
                    if (lVar.f100343b == 1) {
                        iVar3 = (C37680i) lVar.f100344c;
                    } else {
                        iVar3 = C37680i.f100071c;
                    }
                    uVar.mo107503b(iVar3);
                }
                a2.close();
                return;
            } catch (Throwable th) {
                C125372a.m205353a(th, th);
            }
        } else if (i == 1) {
            C59071e eVar2 = C125411o.f345861a;
            if (this.f345858a.f345874n.compareAndSet(false, true)) {
                ((C59052c) ((C59052c) C125411o.f345861a.mo56226d()).mo56372aa(36491)).mo56386p("Unexpected audio/END_OF_DATA before end of capture. [SD]");
                C125374ab abVar = this.f345859b.f345889a;
                ((C59052c) ((C59052c) C125374ab.f345782a.mo56225c()).mo56372aa(36518)).mo56389s("Audio stopped unexpectedly in %s. Stopping dictation. [SD]", abVar.f345783b.f345877q);
                abVar.mo106943f(C63122a.FAILURE_AUDIO_LIBRARY_STOPPED);
                return;
            }
            return;
        } else if (i == 2) {
            ((C59052c) ((C59052c) C125411o.f345861a.mo56226d()).mo56372aa(36492)).mo56386p("Got unhandled AudioData.DATA_NOT_SET [SD]");
            return;
        } else {
            return;
        }
        throw th;
    }
}
