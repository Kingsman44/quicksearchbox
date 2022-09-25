package com.google.android.apps.gsa.staticplugins.opa.translator.util;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Build;
import android.widget.Toast;
import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84469a;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28285c;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.translator.util.ai */
/* compiled from: PG */
public final /* synthetic */ class C113657ai implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ InterpreterMainTextView f314832a;

    /* renamed from: b */
    public final /* synthetic */ C84469a f314833b;

    public /* synthetic */ C113657ai(InterpreterMainTextView interpreterMainTextView, C84469a aVar) {
        this.f314832a = interpreterMainTextView;
        this.f314833b = aVar;
    }

    public final void run() {
        InterpreterMainTextView interpreterMainTextView = this.f314832a;
        C84469a aVar = this.f314833b;
        C89949q.m146521e(C28285c.m52882i(interpreterMainTextView.mo100417e(), 5, (Integer) null), false);
        String str = interpreterMainTextView.f314766k;
        ((ClipboardManager) interpreterMainTextView.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(str, str));
        if (Build.VERSION.SDK_INT < 33 || !aVar.mo78050x()) {
            Toast.makeText(interpreterMainTextView.getContext(), C113672ax.m188247b(interpreterMainTextView.getContext(), R.string.translation_copied, interpreterMainTextView.f314763h), 0).show();
        }
    }
}
