package com.google.android.voicesearch.ime;

import android.databinding.C0118a;
import android.inputmethodservice.InputMethodService;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import com.google.android.apps.search.transcription.voiceime.C141993bd;
import com.google.android.apps.search.transcription.voiceime.C141998bi;
import com.google.android.apps.search.transcription.voiceime.C141999bj;
import com.google.android.apps.search.transcription.voiceime.C142006i;
import com.google.android.apps.search.transcription.voiceime.C142040t;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.voicesearch.ime.c */
/* compiled from: PG */
public final class C45421c extends C45422d {

    /* renamed from: a */
    public static final C59071e f118800a = C59071e.m91332i("com.google.android.voicesearch.ime.c");

    /* renamed from: b */
    public final C141998bi f118801b;

    /* renamed from: c */
    public final InputMethodService f118802c;

    /* renamed from: d */
    public final AtomicBoolean f118803d = new AtomicBoolean(false);

    /* renamed from: e */
    public final C39141kp f118804e;

    /* renamed from: g */
    private final C68214a f118805g;

    public C45421c(VoiceInputMethodService voiceInputMethodService, C141999bj bjVar, C68214a aVar, C39141kp kpVar) {
        voiceInputMethodService.getClass();
        C141993bd bdVar = (C141993bd) bjVar.f385305a.mo17428b();
        bdVar.getClass();
        C142006i iVar = (C142006i) bjVar.f385306b.mo17428b();
        iVar.getClass();
        C142040t tVar = (C142040t) bjVar.f385307c.mo17428b();
        tVar.getClass();
        this.f118801b = new C141998bi(voiceInputMethodService, bdVar, iVar, tVar);
        this.f118802c = voiceInputMethodService;
        this.f118805g = aVar;
        this.f118804e = kpVar;
    }

    /* renamed from: a */
    public final void mo49546a(boolean z) {
        InputMethodSubtype currentInputMethodSubtype;
        if (!mo49547b() && (currentInputMethodSubtype = ((InputMethodManager) this.f118802c.getSystemService("input_method")).getCurrentInputMethodSubtype()) != null && currentInputMethodSubtype.getMode().equals("voice")) {
            try {
                this.f118806f.mo49533d(z);
            } catch (WindowManager.BadTokenException e) {
                C59104x d = f118800a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "VoiceInputMethodSvc");
                ((C59052c) ((C59052c) d).mo56372aa(54671)).mo56386p("BadTokenException: IME is done.");
                throw e;
            }
        }
    }

    /* renamed from: b */
    public final boolean mo49547b() {
        if (!this.f118803d.get()) {
            return false;
        }
        C59104x c = f118800a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "VoiceInputMethodSvc");
        C0118a.m96d(c, "Input method callback invoked after onDestroy()", 54672, C58979ad.SMALL);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        r0 = com.google.android.apps.search.transcription.C141762c.m230000c(r2.f118802c.getApplicationContext());
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo49548c() {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L_0x002a
            dagger.a r0 = r2.f118805g
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.ag.a.e r0 = (com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84474e) r0
            boolean r0 = r0.mo78099am()
            if (r0 == 0) goto L_0x002a
            android.inputmethodservice.InputMethodService r0 = r2.f118802c
            android.content.Context r0 = r0.getApplicationContext()
            java.lang.String r0 = com.google.android.apps.search.transcription.C141762c.m230000c(r0)
            if (r0 == 0) goto L_0x002a
            java.lang.String r1 = "com.google.android.tts"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x002a
            r0 = 1
            return r0
        L_0x002a:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.voicesearch.ime.C45421c.mo49548c():boolean");
    }
}
