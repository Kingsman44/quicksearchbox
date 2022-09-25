package com.google.android.apps.gsa.voiceinteraction.hotword;

import android.os.SharedMemory;
import android.service.voice.AlwaysOnHotwordDetector;
import android.service.voice.HotwordDetector;
import android.service.voice.HotwordRejectedResult;
import com.google.android.apps.gsa.hotword.hotworddetectionservice.k;
import com.google.android.apps.gsa.shared.speech.hotword.HotwordResult;
import com.google.android.libraries.assistant.hotword.data.AutoValue_HotwordData;
import com.google.android.libraries.assistant.hotword.data.HotwordData;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.voiceinteraction.hotword.l */
/* compiled from: PG */
final class C118724l implements HotwordDetector.Callback {

    /* renamed from: a */
    final /* synthetic */ C118725m f331172a;

    public C118724l(C118725m mVar) {
        this.f331172a = mVar;
    }

    /* renamed from: a */
    public final void mo103929a(AlwaysOnHotwordDetector.EventPayload eventPayload) {
        boolean j;
        ((C58970a) ((C58970a) C118725m.f331173a.mo56224b()).mo56372aa(34117)).mo56386p("#handleOnDetected");
        synchronized (this.f331172a.f331174b) {
            j = C118725m.m197081j(this.f331172a.f331184l);
        }
        C118725m mVar = this.f331172a;
        if (mVar.f331181i == null) {
            mVar.f331181i = new k();
        }
        C118725m mVar2 = this.f331172a;
        HotwordResult d = C118726n.m197096d(eventPayload, j, !mVar2.f331176d, mVar2.f331178f ? mVar2.f331177e : null, mVar2.f331180h, mVar2.f331182j, C58833ax.m90834k(mVar2.f331181i), C58833ax.m90834k(this.f331172a.f331185m));
        ((C58970a) ((C58970a) C118725m.f331173a.mo56224b()).mo56372aa(34118)).mo56386p("onHotwordDetected()");
        C118715c cVar = this.f331172a.f331187o;
        if (cVar != null && d != null) {
            cVar.mo103907e(d);
        } else if (d != null || cVar == null) {
            ((C58970a) ((C58970a) C118725m.f331173a.mo56225c()).mo56372aa(34119)).mo56386p("Hotword triggered, but no callback to inform.");
        } else {
            ((C58970a) ((C58970a) C118725m.f331173a.mo56225c()).mo56372aa(34120)).mo56386p("No HotwordResult could be created from the hotword trigger.");
        }
    }

    public final void onDetected(AlwaysOnHotwordDetector.EventPayload eventPayload) {
        ((C58970a) ((C58970a) C118725m.f331173a.mo56224b()).mo56372aa(34125)).mo56386p("onDetected");
        this.f331172a.f331183k.set(false);
        C60888db dbVar = this.f331172a.f52150q;
        if (dbVar != null) {
            dbVar.execute(new C118722j(this, eventPayload));
            return;
        }
        ((C58970a) ((C58970a) C118725m.f331173a.mo56225c()).mo56372aa(34126)).mo56386p("No background executor provided.");
        mo103929a(eventPayload);
    }

    public final void onError() {
        ((C58970a) ((C58970a) C118725m.f331173a.mo56225c()).mo56372aa(34127)).mo56386p("#onError");
        C118725m mVar = this.f331172a;
        mVar.f331179g = false;
        mVar.f331175c = null;
        C118715c cVar = mVar.f331187o;
        if (cVar != null) {
            cVar.mo103906d();
        } else {
            ((C58970a) ((C58970a) C118725m.f331173a.mo56225c()).mo56372aa(34128)).mo56386p("No callback provided, cannot notify of error.");
        }
        this.f331172a.f52150q.mo29164d(new C118723k(this), 1000, TimeUnit.MILLISECONDS);
    }

    public final void onHotwordDetectionServiceInitialized(int i) {
        ((C58970a) ((C58970a) C118725m.f331173a.mo56224b()).mo56372aa(34129)).mo56387q("#onHotwordDetectionServiceInitialized: %s", i);
        this.f331172a.f331179g = true;
    }

    public final void onHotwordDetectionServiceRestarted() {
        ((C58970a) ((C58970a) C118725m.f331173a.mo56224b()).mo56372aa(34130)).mo56386p("#onHotwordDetectionServiceRestarted");
        synchronized (this.f331172a.f331174b) {
            C118725m mVar = this.f331172a;
            if (mVar.f331175c == null) {
                ((C58970a) ((C58970a) C118725m.f331173a.mo56225c()).mo56372aa(34134)).mo56386p("Notified of service restart, but missing hotword detector.");
                return;
            }
            HotwordData hotwordData = mVar.f331184l;
            if (hotwordData == null) {
                ((C58970a) ((C58970a) C118725m.f331173a.mo56225c()).mo56372aa(34133)).mo56386p("Notified of service restart, but missing hotword data");
                return;
            }
            byte[] bArr = ((AutoValue_HotwordData) hotwordData).f52057c;
            SharedMemory b = C118726n.m197094b(bArr, ((AutoValue_HotwordData) hotwordData).f52056b);
            boolean j = C118725m.m197081j(this.f331172a.f331184l);
            try {
                C118725m mVar2 = this.f331172a;
                mVar2.f331175c.updateState(C118726n.m197093a(bArr.length, ((AutoValue_HotwordData) mVar2.f331184l).f52056b, j), b);
            } catch (Exception e) {
                ((C58970a) ((C58970a) ((C58970a) C118725m.f331173a.mo56225c()).mo56382g(e)).mo56372aa(34131)).mo56386p("Error when calling updateState");
            }
        }
    }

    public final void onRecognitionPaused() {
        ((C58970a) ((C58970a) C118725m.f331173a.mo56224b()).mo56372aa(34135)).mo56386p("#onRecognitionPaused");
    }

    public final void onRecognitionResumed() {
        ((C58970a) ((C58970a) C118725m.f331173a.mo56224b()).mo56372aa(34136)).mo56386p("#onRecognitionResumed");
    }

    public final void onRejected(HotwordRejectedResult hotwordRejectedResult) {
        ((C58970a) ((C58970a) C118725m.f331173a.mo56224b()).mo56372aa(34137)).mo56389s("#onRejected: %s", hotwordRejectedResult);
        this.f331172a.f331183k.set(false);
        C118715c cVar = this.f331172a.f331187o;
        if (cVar != null) {
            cVar.mo103905c((HotwordResult) null);
        } else {
            ((C58970a) ((C58970a) C118725m.f331173a.mo56225c()).mo56372aa(34138)).mo56386p("Hotword was rejected, but there is no callback to inform.");
        }
    }
}
