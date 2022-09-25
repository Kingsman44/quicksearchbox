package com.google.android.apps.gsa.staticplugins.opa.translator.util;

import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.translator.util.ad */
/* compiled from: PG */
public final /* synthetic */ class C113652ad implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ InterpreterMainTextView f314824a;

    public /* synthetic */ C113652ad(InterpreterMainTextView interpreterMainTextView) {
        this.f314824a = interpreterMainTextView;
    }

    public final void run() {
        InterpreterMainTextView interpreterMainTextView = this.f314824a;
        C58976aa aaVar = C58975e.f156826a;
        Runnable runnable = interpreterMainTextView.f314775t;
        interpreterMainTextView.f314774s = 0;
        interpreterMainTextView.f314775t = null;
        if (runnable != null) {
            runnable.run();
        }
    }
}
