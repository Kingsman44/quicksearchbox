package com.google.android.apps.search.pronunciationlearning.p10638ui.mic;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.pronunciationlearning.p10638ui.mic.logoview.C141479c;
import com.google.android.apps.search.pronunciationlearning.p10638ui.mic.logoview.C141494p;
import com.google.android.apps.search.pronunciationlearning.p10638ui.mic.logoview.LogoView;
import com.google.android.apps.search.pronunciationlearning.p10638ui.mic.logoview.p10644b.C141477b;
import com.google.android.apps.search.pronunciationlearning.p10638ui.shared.C141512e;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.search.pronunciationlearning.ui.mic.b */
/* compiled from: PG */
public final class C141466b {

    /* renamed from: a */
    public boolean f383982a;

    /* renamed from: b */
    public int f383983b;

    /* renamed from: c */
    private final MicView f383984c;

    /* renamed from: d */
    private final C141512e f383985d;

    public C141466b(MicView micView, C141512e eVar) {
        this.f383984c = micView;
        this.f383985d = eVar;
        LogoView logoView = (LogoView) micView.findViewById(R.id.pronunciationlearning_mic_icon);
        C141479c a = logoView.mo17754z();
        C141477b bVar = a.f384036b;
        bVar.f384028h = 30.0f;
        bVar.f384029i = 30.0f;
        a.mo116495e();
        a.f384035a.invalidate();
        C141469e eVar2 = new C141469e(new C141465a(this));
        C141494p pVar = logoView.mo17754z().f384039e;
        pVar.f384074e.put(1, eVar2);
        if (pVar.f384079j == 1) {
            eVar2.mo116464a();
        }
        logoView.mo17754z().mo116496f(3);
    }

    /* renamed from: a */
    public final void mo116460a(boolean z) {
        String str;
        this.f383982a = z;
        LogoView logoView = (LogoView) this.f383984c.findViewById(R.id.pronunciationlearning_mic_icon);
        C141479c a = logoView.mo17754z();
        int i = 1;
        if (true != z) {
            i = 3;
        }
        a.mo116496f(i);
        if (z) {
            str = (String) this.f383985d.f384126d.get("MicStopQueryDescriptionKey");
            str.getClass();
        } else {
            str = BuildConfig.FLAVOR;
        }
        logoView.setContentDescription(str);
    }

    /* renamed from: b */
    public final void mo116461b() {
        if (this.f383982a) {
            ((LogoView) this.f383984c.findViewById(R.id.pronunciationlearning_mic_icon)).mo17754z().mo116496f(2);
        }
    }
}
