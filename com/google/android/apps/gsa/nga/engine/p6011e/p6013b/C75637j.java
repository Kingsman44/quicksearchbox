package com.google.android.apps.gsa.nga.engine.p6011e.p6013b;

import com.google.android.apps.gsa.nga.engine.recognition.p6109b.C77579g;
import com.google.android.apps.gsa.nga.engine.recognition.p6109b.C77580h;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.libraries.gsa.p1876k.C22868d;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.nga.engine.e.b.j */
/* compiled from: PG */
final class C75637j implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C75638k f209961a;

    public C75637j(C75638k kVar) {
        this.f209961a = kVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        C75633f fVar = (C75633f) obj;
        Iterator it = ((Set) this.f209961a.f209966e.mo27525b()).iterator();
        while (true) {
            int i = 0;
            if (it.hasNext()) {
                C77580h hVar = (C77580h) it.next();
                synchronized (hVar) {
                    hVar.f213722a = false;
                }
            } else {
                int bufferSizeInFrames = fVar.f209955b.getBufferSizeInFrames();
                int sampleRate = fVar.f209955b.getSampleRate();
                String str = fVar.f209956c;
                fVar.f209955b.play();
                long j = 0;
                int i2 = 0;
                while (true) {
                    if (i >= bufferSizeInFrames) {
                        break;
                    } else if (fVar.f209955b.getPlayState() != 3) {
                        String str2 = fVar.f209956c;
                        break;
                    } else {
                        long j2 = ((((long) bufferSizeInFrames) - ((long) i)) * 1000) / ((long) sampleRate);
                        long j3 = 50;
                        if (j2 >= 50) {
                            j3 = 50 * ((j2 / 50) + 1);
                            if (j3 > 500) {
                                j3 = 500;
                            }
                        }
                        String str3 = fVar.f209956c;
                        try {
                            C75632e eVar = fVar.f209954a;
                            Thread.sleep(j3);
                            i = fVar.f209955b.getPlaybackHeadPosition();
                            if (i == i2) {
                                j += j3;
                                if (j > 500) {
                                    String str4 = fVar.f209956c;
                                    break;
                                }
                            }
                            i2 = i;
                        } catch (InterruptedException unused) {
                            String str5 = fVar.f209956c;
                        }
                    }
                }
                String str6 = fVar.f209956c;
                fVar.f209955b.release();
                for (C77580h hVar2 : (Set) this.f209961a.f209966e.mo27525b()) {
                    hVar2.f213724c.mo28213m("[NGA] SpeechConfidenceController set can record", hVar2.f213725d.mo85399d(C90126fx.f251530kZ), new C77579g(hVar2));
                }
                return;
            }
        }
    }
}
