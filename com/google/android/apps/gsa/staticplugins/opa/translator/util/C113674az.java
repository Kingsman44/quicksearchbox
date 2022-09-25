package com.google.android.apps.gsa.staticplugins.opa.translator.util;

import com.google.android.apps.gsa.staticplugins.opa.translator.p8590a.C113599l;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.translator.util.az */
/* compiled from: PG */
public final /* synthetic */ class C113674az implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ModeTogglePlateView f314861a;

    /* renamed from: b */
    public final /* synthetic */ C113599l f314862b;

    public /* synthetic */ C113674az(ModeTogglePlateView modeTogglePlateView, C113599l lVar) {
        this.f314861a = modeTogglePlateView;
        this.f314862b = lVar;
    }

    public final void run() {
        ModeTogglePlateView modeTogglePlateView = this.f314861a;
        C113599l lVar = this.f314862b;
        if (modeTogglePlateView.f314789d) {
            modeTogglePlateView.mo100455j(modeTogglePlateView.mo100447b());
            modeTogglePlateView.mo100451f(true);
            return;
        }
        lVar.mo100323a(true != modeTogglePlateView.f314790e ? R.string.auto_mic_not_supported : R.string.auto_mic_not_supported_offline);
    }
}
