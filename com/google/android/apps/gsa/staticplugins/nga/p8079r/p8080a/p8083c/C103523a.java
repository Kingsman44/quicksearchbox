package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a.p8083c;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.assistant.hotword.C18381r;
import com.google.android.libraries.assistant.hotword.C18382s;
import com.google.android.libraries.p579ar.sceneviewer.p589ui.SimpleSnackbar;
import com.google.speech.micro.C67363a;
import com.google.speech.micro.GoogleEndpointer;
import java.io.IOException;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.a.c.a */
/* compiled from: PG */
public final /* synthetic */ class C103523a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C103542d f288438a;

    public /* synthetic */ C103523a(C103542d dVar) {
        this.f288438a = dVar;
    }

    public final Object call() {
        int i;
        char c;
        C103542d dVar = this.f288438a;
        try {
            int idealBufferBytes = dVar.f288483b.idealBufferBytes();
            int i2 = dVar.f288486e;
            int i3 = (idealBufferBytes * 1000) / (((i2 + i2) / 1000) * 1000);
            int i4 = (i3 + SimpleSnackbar.LENGTH_SHORT) * i2;
            C18382s sVar = new C18382s(idealBufferBytes, (i4 + i4) / 1000, 2, 1);
            if (i3 >= 200) {
                i = 1;
            } else {
                i = 200 / i3;
            }
            long j = 0;
            if (dVar.mo93815e(0)) {
                long j2 = 0;
                int i5 = 0;
                char c2 = 10;
                GoogleEndpointer.GoogleEndpointerResult googleEndpointerResult = null;
                while (dVar.f288487f) {
                    C18381r a = sVar.mo23887a(dVar.f288482a);
                    GoogleEndpointer.GoogleEndpointerResult process = dVar.f288484c.process(sVar.mo23890d(), a.f52173a, a.f52174b);
                    i5++;
                    j += (long) i3;
                    if (a.f52174b != idealBufferBytes || (i5 % i == 0 && !dVar.mo93815e(j))) {
                        break;
                    }
                    if (c2 == 10 && process.getEvent() == C67363a.SPEECH) {
                        if (!dVar.mo93814d(process)) {
                            break;
                        }
                        process = googleEndpointerResult;
                        c2 = 20;
                    } else {
                        if (c2 != 20) {
                            c = c2;
                        } else if (process.getEvent() == C67363a.NO_SPEECH && googleEndpointerResult == null) {
                            j2 = dVar.f288485d + j;
                        } else {
                            c = 20;
                        }
                        if (c2 == 20 && process.getEvent() == C67363a.SPEECH && googleEndpointerResult != null) {
                            c2 = c;
                            process = null;
                        } else {
                            c2 = c;
                            process = googleEndpointerResult;
                        }
                    }
                    if (process != null && j2 <= j) {
                        if (!dVar.mo93814d(process)) {
                            break;
                        }
                        c2 = 30;
                        googleEndpointerResult = null;
                    } else {
                        googleEndpointerResult = process;
                    }
                }
            }
        } catch (IOException e) {
            dVar.mo93813c(false, e);
        }
        return C118826c.f331422a;
    }
}
