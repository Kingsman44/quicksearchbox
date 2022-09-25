package com.google.android.libraries.assistant.soda.p1611f;

import com.google.android.libraries.assistant.soda.C19245ah;
import com.google.common.p4526f.C59052c;
import com.google.speech.p5218j.C66938fa;
import com.google.speech.p5218j.C67171p;
import com.google.speech.p5218j.C67178w;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.soda.f.g */
/* compiled from: PG */
public final /* synthetic */ class C19327g implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C19329i f54083a;

    /* renamed from: b */
    public final /* synthetic */ C66938fa f54084b;

    public /* synthetic */ C19327g(C19329i iVar, C66938fa faVar) {
        this.f54083a = iVar;
        this.f54084b = faVar;
    }

    public final Object call() {
        C19329i iVar = this.f54083a;
        C66938fa faVar = this.f54084b;
        if (iVar.f54090e != null) {
            int i = faVar.f181947b;
            if (i == 2) {
                if (iVar.f54091f) {
                    C67171p pVar = (C67171p) faVar.f181948c;
                    if ((pVar.f182577a & 4) == 0) {
                        int d = pVar.f182578b.mo59031d();
                        ((C59052c) ((C59052c) C19329i.f54086a.mo56225c()).mo56372aa(47763)).mo56387q("pushAudioRequest: missing required timestamp, dropping %d bytes", d);
                        throw new Exception(String.format("pushAudioRequest: missing required timestamp, dropping %d bytes", new Object[]{Integer.valueOf(d)}));
                    }
                }
                C67171p pVar2 = (C67171p) faVar.f181948c;
                int d2 = pVar2.f182578b.mo59031d();
                ByteBuffer a = iVar.f54094i.mo24395a(d2);
                a.put(pVar2.f182578b.mo59174N(), 0, d2);
                if (iVar.f54091f) {
                    long j = pVar2.f182580d;
                    ByteBuffer a2 = iVar.f54095j.mo24395a(16);
                    a2.putLong(Long.reverseBytes(iVar.f54092g));
                    a2.putLong(Long.reverseBytes(j));
                    iVar.f54090e.mo24337i(a, d2, a2, a2.capacity());
                    iVar.f54092g += (long) (d2 / C19245ah.m36694b(iVar.f54093h));
                    return null;
                }
                iVar.f54090e.mo24332h(a, d2);
                return null;
            } else if (i == 3) {
                int b = C67178w.m97434b(((Integer) faVar.f181948c).intValue());
                if (b == 0) {
                    b = 1;
                }
                if (b == 3) {
                    iVar.f54090e.mo24332h(C19329i.f54087b, 0);
                    ((C59052c) ((C59052c) C19329i.f54086a.mo56224b()).mo56372aa(47762)).mo56386p("Audio push ended.");
                    return null;
                }
                ((C59052c) ((C59052c) C19329i.f54086a.mo56225c()).mo56372aa(47761)).mo56389s("audioSourceError:  %s not handled!", C67178w.m97433a(b));
                throw new Exception(String.format("audioSourceError:  %s not handled!", new Object[]{C67178w.m97433a(b)}));
            } else {
                ((C59052c) ((C59052c) C19329i.f54086a.mo56225c()).mo56372aa(47760)).mo56389s("%s", "PushAudioRequest not handled!");
                throw new Exception("PushAudioRequest not handled!");
            }
        } else {
            ((C59052c) ((C59052c) C19329i.f54086a.mo56225c()).mo56372aa(47759)).mo56386p("Soda is not initialized!");
            throw new Exception("Soda is not initialized!");
        }
    }
}
