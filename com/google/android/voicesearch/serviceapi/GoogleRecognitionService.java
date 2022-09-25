package com.google.android.voicesearch.serviceapi;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextParams;
import android.content.Intent;
import android.speech.RecognitionService;
import android.speech.SpeechRecognizer;
import androidx.core.p094f.C1888a;
import com.google.android.apps.gsa.binaries.satin.app.amb;
import com.google.android.apps.gsa.shared.logger.C89838ab;
import com.google.android.apps.search.transcription.C141762c;
import com.google.android.apps.search.transcription.p10670f.C141803av;
import com.google.android.apps.search.transcription.p10670f.p10678g.C141886am;
import com.google.android.apps.search.transcription.p10670f.p10678g.C141888ao;
import com.google.android.apps.search.transcription.p10670f.p10678g.C141897j;
import com.google.android.apps.search.transcription.p10670f.p10678g.C141908u;
import com.google.android.apps.search.transcription.p10670f.p10678g.C141909v;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.C47211g;
import com.google.apps.tiktok.tracing.C47550bb;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58837ba;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68225k;

/* compiled from: PG */
public final class GoogleRecognitionService extends C45437m implements C47231d {

    /* renamed from: a */
    private C45436l f118811a;

    /* renamed from: b */
    private boolean f118812b;

    /* renamed from: c */
    private final C47550bb f118813c = new C47550bb(this);

    @Deprecated
    public GoogleRecognitionService() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C45436l mo17754z() {
        C45436l lVar = this.f118811a;
        if (lVar != null) {
            return lVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    /* access modifiers changed from: protected */
    public final void onCancel(RecognitionService.Callback callback) {
        C47573bx c = this.f118813c.mo51411c("onCancel");
        try {
            C45436l a = mo17754z();
            if (a.mo49568a()) {
                SpeechRecognizer speechRecognizer = (SpeechRecognizer) a.f118831b.remove(callback);
                if (speechRecognizer != null) {
                    speechRecognizer.cancel();
                }
            } else {
                C141888ao aoVar = (C141888ao) a.f118833d.mo27525b();
                C141908u uVar = (C141908u) aoVar.f385001b.remove(callback);
                if (uVar != null) {
                    C141909v vVar = aoVar.f385002c;
                    ((C59052c) ((C59052c) C141909v.f385031a.mo56224b()).mo56372aa(41935)).mo56386p("RecognitionService#onCancel");
                    C141803av avVar = (C141803av) vVar.f385034d.remove(uVar);
                    if (avVar != null) {
                        avVar.mo116754a();
                    }
                    vVar.f385036f.ifPresent(C141897j.f385016a);
                }
            }
            c.close();
            return;
        } catch (Throwable th) {
            C45425a.m81054a(th, th);
        }
        throw th;
    }

    public final void onCreate() {
        C47558bi a;
        C47558bi a2;
        C47573bx b = this.f118813c.mo51410b();
        try {
            this.f118812b = true;
            C58838bb.m90883r(getApplication() instanceof C47211g);
            if (this.f118811a == null) {
                if (this.f118812b) {
                    a = C47831fm.m85006a("CreateComponent");
                    mo49569b().mo17653jN();
                    a.close();
                    a2 = C47831fm.m85006a("CreatePeer");
                    Object jN = mo49569b().mo17653jN();
                    Service service = ((amb) jN).f197754a;
                    if (service instanceof GoogleRecognitionService) {
                        GoogleRecognitionService googleRecognitionService = (GoogleRecognitionService) service;
                        C68225k.m98532d(googleRecognitionService);
                        this.f118811a = new C45436l(googleRecognitionService, C68219e.m98518a(((amb) jN).f197807b.d.f201785ff), C68219e.m98518a(((amb) jN).f197807b.a.f202657bH), (C39141kp) ((amb) jN).f197807b.cd.mo17428b());
                        a2.close();
                    } else {
                        String obj = C45436l.class.toString();
                        String valueOf = String.valueOf(service.getClass());
                        throw new IllegalStateException("Attempt to inject a Service wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                } else {
                    throw new IllegalStateException("createPeer() called outside of onCreate");
                }
            }
            super.onCreate();
            mo17754z();
            C89838ab.m146265i();
            this.f118812b = false;
            b.close();
            return;
            throw th;
            throw th;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                C45425a.m81054a(th, th2);
            }
            throw th;
        }
    }

    public final void onDestroy() {
        C47573bx d = this.f118813c.mo51412d();
        try {
            super.onDestroy();
            C45436l a = mo17754z();
            if (a.mo49568a()) {
                for (SpeechRecognizer destroy : a.f118831b.values()) {
                    destroy.destroy();
                }
                a.f118831b.clear();
            } else {
                C141888ao aoVar = (C141888ao) a.f118833d.mo27525b();
                C141909v vVar = aoVar.f385002c;
                ((C59052c) ((C59052c) C141909v.f385031a.mo56224b()).mo56372aa(41936)).mo56386p("RecognitionService#onDestroy");
                for (C141803av a2 : vVar.f385034d.values()) {
                    a2.mo116754a();
                }
                vVar.f385034d.clear();
                aoVar.f385001b.clear();
            }
            d.close();
            return;
        } catch (Throwable th) {
            C45425a.m81054a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onStartListening(Intent intent, RecognitionService.Callback callback) {
        C47573bx c = this.f118813c.mo51411c("onStartListening");
        try {
            C45436l a = mo17754z();
            a.f118835f = C58837ba.m90858g(a.f118832c.getPackageManager().getNameForUid(callback.getCallingUid()));
            if (a.mo49568a()) {
                String str = a.f118835f;
                ((C59052c) ((C59052c) C45436l.f118830a.mo56224b()).mo56372aa(54674)).mo56386p("Forwarding the request to Speech Services By Google");
                ((C19567d) a.f118834e.f102941cS.mo6453a()).mo24822a(1, str);
                Context context = a.f118832c;
                if (C1888a.m5149c()) {
                    context = context.createContext(new ContextParams.Builder().setNextAttributionSource(callback.getCallingAttributionSource()).build());
                }
                if (!a.f118831b.containsKey(callback) || a.f118831b.get(callback) == null) {
                    ComponentName b = C141762c.m229999b(a.f118832c);
                    b.getClass();
                    SpeechRecognizer createSpeechRecognizer = SpeechRecognizer.createSpeechRecognizer(context, b);
                    createSpeechRecognizer.setRecognitionListener(new C45434j(callback));
                    a.f118831b.put(callback, createSpeechRecognizer);
                }
                ((SpeechRecognizer) a.f118831b.get(callback)).startListening(intent);
            } else {
                C141888ao aoVar = (C141888ao) a.f118833d.mo27525b();
                C141886am amVar = new C141886am(aoVar, callback, intent);
                aoVar.f385001b.put(callback, amVar);
                aoVar.f385002c.mo116877a((Context) null, intent, amVar, callback.getCallingUid());
            }
            c.close();
            return;
        } catch (Throwable th) {
            C45425a.m81054a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void onStopListening(RecognitionService.Callback callback) {
        C47573bx c = this.f118813c.mo51411c("onStopListening");
        try {
            C45436l a = mo17754z();
            if (a.mo49568a()) {
                SpeechRecognizer speechRecognizer = (SpeechRecognizer) a.f118831b.get(callback);
                if (speechRecognizer != null) {
                    speechRecognizer.stopListening();
                }
            } else {
                C141888ao aoVar = (C141888ao) a.f118833d.mo27525b();
                C141908u uVar = (C141908u) aoVar.f385001b.get(callback);
                if (uVar != null) {
                    aoVar.f385002c.mo116878b(uVar);
                }
            }
            c.close();
            return;
        } catch (Throwable th) {
            C45425a.m81054a(th, th);
        }
        throw th;
    }
}
