package com.google.android.apps.gsa.staticplugins.opa.translator.util;

import com.google.android.apps.gsa.staticplugins.opa.translator.p8590a.C113599l;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.translator.util.ba */
/* compiled from: PG */
public final /* synthetic */ class C113676ba implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ModeTogglePlateView f314864a;

    /* renamed from: b */
    public final /* synthetic */ C113599l f314865b;

    public /* synthetic */ C113676ba(ModeTogglePlateView modeTogglePlateView, C113599l lVar) {
        this.f314864a = modeTogglePlateView;
        this.f314865b = lVar;
    }

    public final void run() {
        ModeTogglePlateView modeTogglePlateView = this.f314864a;
        C113599l lVar = this.f314865b;
        if (modeTogglePlateView.f314791f) {
            modeTogglePlateView.mo100455j(modeTogglePlateView.mo100449d());
            modeTogglePlateView.mo100453h(true);
            return;
        }
        lVar.mo100323a(R.string.manual_mic_not_supported);
    }
}
