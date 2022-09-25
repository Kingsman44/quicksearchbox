package com.google.android.apps.gsa.staticplugins.microdetection.p8042d;

import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7127q.C90452a;
import com.google.android.apps.gsa.shared.speech.C90574e;
import com.google.android.apps.gsa.shared.speech.C90603k;
import com.google.android.apps.gsa.shared.speech.hotword.HotwordResult;
import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.IOException;

/* renamed from: com.google.android.apps.gsa.staticplugins.microdetection.d.k */
/* compiled from: PG */
public final /* synthetic */ class C102842k implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C102845n f287218a;

    public /* synthetic */ C102842k(C102845n nVar) {
        this.f287218a = nVar;
    }

    public final void run() {
        C102845n nVar = this.f287218a;
        C59104x b = C102845n.f287219a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "MicroRecognitionRunner");
        ((C59052c) ((C59052c) b).mo56372aa(21300)).mo56386p("Starting detection.");
        try {
            C90603k b2 = nVar.mo93507b();
            if (b2 != null) {
                nVar.f287222b.mo70941c(b2);
                return;
            }
            int i = nVar.f287223c;
            if (i == 1) {
                ((C89911f) nVar.f287226f.mo27525b()).mo83755a((Throwable) null, 14488353, 29).mo83721a();
                nVar.f287222b.mo70941c(new C90574e((HotwordResult) null));
            } else if (i == 2) {
                nVar.f287222b.mo70941c(new C90574e((HotwordResult) null));
            }
        } catch (IOException e) {
            nVar.mo93508d(e, "Error reading from input stream", 2, C89885b.RECOGNIZER_HOTWORD_PROCESS_INPUT_STREAM_VALUE);
        } catch (InterruptedException e2) {
            nVar.mo93508d(e2, "Error processing input stream", 2, C89885b.RECOGNIZER_HOTWORD_PROCESS_INPUT_STREAM_VALUE);
        } catch (IllegalArgumentException e3) {
            nVar.mo93508d(e3, "Error creating or using GoogleHotwordRecognizer", 6, C89885b.RECOGNIZER_HOTWORD_RUNTIME_EXCEPTION_VALUE);
        } catch (IllegalStateException e4) {
            nVar.mo93508d(e4, "Error using GoogleHotwordRecognizer", 6, C89885b.RECOGNIZER_HOTWORD_RUNTIME_EXCEPTION_VALUE);
        } catch (C90452a e5) {
            nVar.mo93508d(e5, "Error using GoogleHotwordRecognizer", 6, e5.f252683a);
        }
    }
}
