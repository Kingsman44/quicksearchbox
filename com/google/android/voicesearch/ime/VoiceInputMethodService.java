package com.google.android.voicesearch.ime;

import android.app.Service;
import android.inputmethodservice.InputMethodService;
import android.os.Bundle;
import android.os.PowerManager;
import android.support.p031v4.app.C0154a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputBinding;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;
import com.google.android.apps.gsa.binaries.satin.app.amb;
import com.google.android.apps.gsa.binaries.satin.app.aqy;
import com.google.android.apps.gsa.binaries.satin.app.aso;
import com.google.android.apps.gsa.shared.logger.C89838ab;
import com.google.android.apps.search.transcription.C141741b;
import com.google.android.apps.search.transcription.C141762c;
import com.google.android.apps.search.transcription.voiceime.C141975an;
import com.google.android.apps.search.transcription.voiceime.C141987ay;
import com.google.android.apps.search.transcription.voiceime.C141993bd;
import com.google.android.apps.search.transcription.voiceime.C141996bg;
import com.google.android.apps.search.transcription.voiceime.C141997bh;
import com.google.android.apps.search.transcription.voiceime.C141998bi;
import com.google.android.apps.search.transcription.voiceime.C141999bj;
import com.google.android.apps.search.transcription.voiceime.C142003f;
import com.google.android.apps.search.transcription.voiceime.C142004g;
import com.google.android.apps.search.transcription.voiceime.C142012o;
import com.google.android.apps.search.transcription.voiceime.C142021r;
import com.google.android.apps.search.transcription.voiceime.C142022s;
import com.google.android.apps.search.transcription.voiceime.C142040t;
import com.google.android.apps.search.transcription.voiceime.p10680a.C141960c;
import com.google.android.apps.search.transcription.voiceime.p10680a.C141961d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.android.libraries.search.p2871b.p2872a.p2884l.C37206a;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.C47211g;
import com.google.apps.tiktok.tracing.C47550bb;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58832aw;
import com.google.common.base.C58837ba;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.net.p4726a.p4727a.C62722b;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68225k;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.concurrent.atomic.DesugarAtomicReference;

/* compiled from: PG */
public final class VoiceInputMethodService extends C45419a implements C47231d {

    /* renamed from: a */
    private C45421c f118794a;

    /* renamed from: b */
    private boolean f118795b;

    /* renamed from: c */
    private final C47550bb f118796c = new C47550bb(this);

    @Deprecated
    public VoiceInputMethodService() {
        C19559g.m37304c();
    }

    /* renamed from: b */
    public final C45421c mo17754z() {
        C45421c cVar = this.f118794a;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo49533d(boolean z) {
        super.showWindow(z);
    }

    public final void hideWindow() {
        C47573bx c = this.f118796c.mo51411c("hideWindow");
        try {
            C45421c b = mo17754z();
            if (!b.mo49547b()) {
                b.f118801b.f385302d.mo116962a();
            }
            c.close();
            return;
        } catch (Throwable th) {
            C45420b.m81046a(th, th);
        }
        throw th;
    }

    public final void onCreate() {
        C47558bi a;
        C47558bi a2;
        C47573bx b = this.f118796c.mo51410b();
        try {
            this.f118795b = true;
            C58838bb.m90883r(getApplication() instanceof C47211g);
            if (this.f118794a == null) {
                if (this.f118795b) {
                    a = C47831fm.m85006a("CreateComponent");
                    mo49545a().mo17653jN();
                    a.close();
                    a2 = C47831fm.m85006a("CreatePeer");
                    Object jN = mo49545a().mo17653jN();
                    Service service = ((amb) jN).f197754a;
                    if (service instanceof VoiceInputMethodService) {
                        VoiceInputMethodService voiceInputMethodService = (VoiceInputMethodService) service;
                        C68225k.m98532d(voiceInputMethodService);
                        aqy aqy = ((amb) jN).f197807b;
                        aso aso = aqy.d;
                        this.f118794a = new C45421c(voiceInputMethodService, new C141999bj(aso.f201713eM, aso.f201729ec, aso.f201710eJ), C68219e.m98518a(aqy.a.f202657bH), (C39141kp) ((amb) jN).f197807b.cd.mo17428b());
                        a2.close();
                        this.f118794a.f118806f = this;
                    } else {
                        String obj = C45421c.class.toString();
                        String valueOf = String.valueOf(service.getClass());
                        throw new IllegalStateException("Attempt to inject a Service wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                } else {
                    throw new IllegalStateException("createPeer() called outside of onCreate");
                }
            }
            super.onCreate();
            C45421c b2 = mo17754z();
            if (!b2.mo49548c()) {
                C89838ab.m146265i();
                C141998bi biVar = b2.f118801b;
                biVar.f385302d.mo116963b(new C141996bg(biVar));
            }
            this.f118795b = false;
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
                C45420b.m81046a(th, th2);
            }
            throw th;
        }
    }

    public final View onCreateInputView() {
        String str;
        C47573bx c = this.f118796c.mo51411c("onCreateInputView");
        try {
            super.onCreateInputView();
            C45421c b = mo17754z();
            View view = null;
            if (b.mo49548c()) {
                C59104x b2 = C45421c.f118800a.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "VoiceInputMethodSvc");
                ((C59052c) ((C59052c) b2).mo56372aa(54670)).mo56386p("Switch to Speech Services By Google voice ime");
                InputBinding currentInputBinding = b.f118802c.getCurrentInputBinding();
                if (currentInputBinding == null) {
                    str = "no.active.InputBinding";
                } else {
                    str = C58837ba.m90858g(b.f118802c.getApplicationContext().getPackageManager().getNameForUid(currentInputBinding.getUid()));
                }
                ((C19567d) b.f118804e.f102942cT.mo6453a()).mo24822a(1, str);
                InputMethodService inputMethodService = b.f118802c;
                String c2 = C141762c.m230000c(inputMethodService.getApplicationContext());
                c2.getClass();
                inputMethodService.switchInputMethod(c2);
            } else {
                C141998bi biVar = b.f118801b;
                biVar.mo116958a();
                View inflate = ((LayoutInflater) biVar.f385300b.getSystemService("layout_inflater")).inflate(R.layout.transcription_app_voice_ime_fragment_container_view, (ViewGroup) null);
                Window window = biVar.f385300b.getWindow().getWindow();
                C142003f fVar = new C142003f();
                fVar.mo51130t(window, inflate, inflate.getContext());
                biVar.f385304f = fVar;
                biVar.f385304f.mo19987jP((Bundle) null);
                biVar.f385304f.mo51128g();
                biVar.f385304f.mo51127f();
                view = inflate;
            }
            c.close();
            return view;
        } catch (Throwable th) {
            C45420b.m81046a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx d = this.f118796c.mo51412d();
        try {
            super.onDestroy();
            C45421c b = mo17754z();
            if (!b.mo49548c()) {
                C141998bi biVar = b.f118801b;
                biVar.f385302d.mo116963b(C141997bh.f385298a);
                biVar.mo116958a();
                biVar.f385301c.mo116953f();
            }
            b.f118803d.set(true);
            d.close();
            return;
        } catch (Throwable th) {
            C45420b.m81046a(th, th);
        }
        throw th;
    }

    public final boolean onEvaluateInputViewShown() {
        C47573bx c = this.f118796c.mo51411c("onEvaluateInputViewShown");
        try {
            super.onEvaluateInputViewShown();
            mo17754z();
            c.close();
            return true;
        } catch (Throwable th) {
            C45420b.m81046a(th, th);
        }
        throw th;
    }

    public final void onFinishInput() {
        C47573bx c = this.f118796c.mo51411c("onFinishInput");
        try {
            mo17754z().mo49547b();
            c.close();
            return;
        } catch (Throwable th) {
            C45420b.m81046a(th, th);
        }
        throw th;
    }

    public final void onFinishInputView(boolean z) {
        C47573bx c = this.f118796c.mo51411c("onFinishInputView");
        try {
            C45421c b = mo17754z();
            if (!b.mo49547b()) {
                C141998bi biVar = b.f118801b;
                biVar.f385301c.mo116953f();
                C142040t tVar = biVar.f385303e;
                C142021r rVar = (C142021r) tVar.f385387c.getAndSet((Object) null);
                if (rVar != null && ((C142022s) DesugarAtomicReference.updateAndGet(rVar.f385342b, C142012o.f385325a)).mo116974a()) {
                    tVar.f385385a.mo19974a(C37206a.f98800w.mo40808f("inputViewSessionId", rVar.f385341a).mo40781e(C62722b.OK));
                }
            }
            c.close();
            return;
        } catch (Throwable th) {
            C45420b.m81046a(th, th);
        }
        throw th;
    }

    public final boolean onShowInputRequested(int i, boolean z) {
        C47573bx c = this.f118796c.mo51411c("onShowInputRequested");
        try {
            super.onShowInputRequested(i, z);
            mo17754z();
            c.close();
            return true;
        } catch (Throwable th) {
            C45420b.m81046a(th, th);
        }
        throw th;
    }

    public final void onStartInputView(EditorInfo editorInfo, boolean z) {
        C141741b bVar;
        String str;
        C47573bx c = this.f118796c.mo51411c("onStartInputView");
        try {
            super.onStartInputView(editorInfo, z);
            C45421c b = mo17754z();
            if (!b.mo49547b()) {
                C141998bi biVar = b.f118801b;
                if (!((PowerManager) biVar.f385300b.getSystemService("power")).isScreenOn()) {
                    biVar.f385301c.mo116953f();
                    biVar.f385302d.mo116962a();
                } else {
                    C142040t tVar = biVar.f385303e;
                    C142021r rVar = new C142021r(tVar);
                    AtomicReference atomicReference = tVar.f385387c;
                    while (true) {
                        if (!atomicReference.compareAndSet((Object) null, rVar)) {
                            if (atomicReference.get() != null) {
                                break;
                            }
                        } else {
                            tVar.f385385a.mo19974a(C37206a.f98799v.mo40816j("inputViewSessionId", rVar.f385341a));
                            break;
                        }
                    }
                    if (!C142004g.m230533d(editorInfo)) {
                        ((C59052c) ((C59052c) C141998bi.f385299a.mo56224b()).mo56372aa(42012)).mo56386p("Voice IME cannot be started for this field");
                        Toast.makeText(biVar.f385300b, R.string.transcription_app_voice_ime_can_not_be_used, 1).show();
                        biVar.f385302d.mo116962a();
                    } else {
                        InputConnection currentInputConnection = biVar.f385300b.getCurrentInputConnection();
                        InputBinding currentInputBinding = biVar.f385300b.getCurrentInputBinding();
                        if (currentInputConnection != null) {
                            if (currentInputBinding != null) {
                                if (z) {
                                    biVar.f385301c.mo116956i(currentInputConnection, editorInfo, currentInputBinding.getUid());
                                }
                                if (biVar.f385304f != null) {
                                    C141993bd bdVar = biVar.f385301c;
                                    int uid = currentInputBinding.getUid();
                                    ((C59052c) ((C59052c) C141993bd.f385285a.mo56224b()).mo56372aa(41989)).mo56386p("#startOrContinue");
                                    if (!C58832aw.m90831a(currentInputConnection, bdVar.f385292h) || !C58832aw.m90831a(editorInfo, bdVar.f385293i) || !C58832aw.m90831a(Integer.valueOf(uid), bdVar.f385294j) || bdVar.f385295k == null) {
                                        bdVar.mo116956i(currentInputConnection, editorInfo, uid);
                                        if (bdVar.f385290f == null) {
                                            ((C59052c) ((C59052c) C141993bd.f385285a.mo56224b()).mo56372aa(41990)).mo56393w("initial selection %d %d", editorInfo.initialSelStart, editorInfo.initialSelEnd);
                                            if (editorInfo.initialSelStart != -1) {
                                                if (editorInfo.initialSelEnd != -1) {
                                                    bdVar.f385290f = new C141987ay(editorInfo.initialSelStart, editorInfo.initialSelEnd);
                                                }
                                            }
                                            ExtractedText extractedText = currentInputConnection.getExtractedText(new ExtractedTextRequest(), 0);
                                            if (extractedText == null) {
                                                bdVar.f385290f = new C141987ay(0, 0);
                                            } else {
                                                bdVar.f385290f = new C141987ay(extractedText.selectionStart, extractedText.selectionEnd);
                                            }
                                        }
                                        if (bdVar.f385291g == null) {
                                            bdVar.mo116954g();
                                        }
                                        bVar = bdVar.mo116949a(editorInfo, Integer.valueOf(uid).intValue());
                                    } else {
                                        ((C59052c) ((C59052c) C141993bd.f385285a.mo56224b()).mo56372aa(41991)).mo56386p("continuing");
                                        bVar = bdVar.f385295k;
                                    }
                                    C141960c cVar = (C141960c) C141961d.f385216d.createBuilder();
                                    cVar.copyOnWrite();
                                    C141961d dVar = (C141961d) cVar.instance;
                                    bVar.getClass();
                                    dVar.f385219b = bVar;
                                    dVar.f385218a |= 1;
                                    String name = biVar.f385300b.getClass().getName();
                                    InputMethodManager inputMethodManager = biVar.f385302d.f385319b;
                                    if (inputMethodManager != null) {
                                        Iterator<InputMethodInfo> it = inputMethodManager.getEnabledInputMethodList().iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                break;
                                            }
                                            InputMethodInfo next = it.next();
                                            if (next.getServiceName().equals(name)) {
                                                str = next.getSettingsActivity();
                                                break;
                                            }
                                        }
                                    }
                                    str = null;
                                    if (str != null) {
                                        cVar.copyOnWrite();
                                        C141961d dVar2 = (C141961d) cVar.instance;
                                        dVar2.f385218a |= 2;
                                        dVar2.f385220c = str;
                                    }
                                    C141975an f = C141975an.m230484f((C141961d) cVar.build());
                                    C0154a aVar = new C0154a(biVar.f385304f.mo51122q());
                                    aVar.mo689v(R.id.transcription_container, f, (String) null);
                                    aVar.mo509f();
                                }
                            }
                        }
                        ((C59052c) ((C59052c) C141998bi.f385299a.mo56224b()).mo56372aa(42011)).mo56386p("input connection is not ready");
                    }
                }
            }
            c.close();
            return;
        } catch (Throwable th) {
            C45420b.m81046a(th, th);
        }
        throw th;
    }

    public final void onUpdateSelection(int i, int i2, int i3, int i4, int i5, int i6) {
        C47573bx c = this.f118796c.mo51411c("onUpdateSelection");
        try {
            C45421c b = mo17754z();
            if (!b.mo49547b()) {
                C141998bi biVar = b.f118801b;
                if (!(i == i3 && i2 == i4)) {
                    C141993bd bdVar = biVar.f385301c;
                    C141987ay ayVar = new C141987ay(i3, i4);
                    bdVar.f385290f = ayVar;
                    if (ayVar.equals(bdVar.f385289e.peekFirst())) {
                        bdVar.f385289e.remove();
                    } else {
                        bdVar.f385289e.clear();
                        bdVar.f385287c.mo116931a(bdVar.f385295k);
                        bdVar.mo116954g();
                    }
                }
            }
            c.close();
            return;
        } catch (Throwable th) {
            C45420b.m81046a(th, th);
        }
        throw th;
    }

    public final void showWindow(boolean z) {
        C47573bx c = this.f118796c.mo51411c("showWindow");
        try {
            mo17754z().mo49546a(z);
            c.close();
            return;
        } catch (Throwable th) {
            C45420b.m81046a(th, th);
        }
        throw th;
    }
}
