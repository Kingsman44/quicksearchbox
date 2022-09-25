package com.google.android.apps.gsa.staticplugins.opa.translator.util;

import android.content.Intent;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28285c;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.translator.util.ak */
/* compiled from: PG */
public final /* synthetic */ class C113659ak implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ InterpreterMainTextView f314837a;

    public /* synthetic */ C113659ak(InterpreterMainTextView interpreterMainTextView) {
        this.f314837a = interpreterMainTextView;
    }

    public final void run() {
        InterpreterMainTextView interpreterMainTextView = this.f314837a;
        C89949q.m146521e(C28285c.m52882i(interpreterMainTextView.mo100429q().findViewById(R.id.interpreter_speaking_practice_suggestion), 5, (Integer) null), false);
        String str = interpreterMainTextView.f314766k;
        Intent intent = new Intent();
        intent.setComponent(InterpreterMainTextView.f314756b).setFlags(813727744).putExtra("EXTRA_LOCALE", interpreterMainTextView.f314763h).putExtra("EXTRA_PHRASE", str).putExtra("EXTRA_TRIGGER_SOURCE", "INTERPRETER_UI").putExtra("EXTRA_HALF_SHEET", true).putExtra("EXTRA_LANGUAGE_PRACTICED", interpreterMainTextView.f314768m);
        String str2 = interpreterMainTextView.f314780y.f314531a.f314594v;
        if (str2 != null) {
            intent.putExtra("EXTRA_REQUEST_ID", str2);
        }
        interpreterMainTextView.getContext().startActivity(intent);
    }
}
