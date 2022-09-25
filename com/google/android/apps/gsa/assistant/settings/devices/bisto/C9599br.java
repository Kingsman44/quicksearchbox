package com.google.android.apps.gsa.assistant.settings.devices.bisto;

import android.support.p033v7.app.C0391l;
import android.support.p033v7.app.C0392m;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.bisto.br */
/* compiled from: PG */
public final /* synthetic */ class C9599br implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C9619ck f33208a;

    public /* synthetic */ C9599br(C9619ck ckVar) {
        this.f33208a = ckVar;
    }

    public final void run() {
        C0391l gh;
        C9619ck ckVar = this.f33208a;
        if (ckVar.f33283q != null && (gh = ckVar.mo17796gh()) != null) {
            boolean z = ckVar.f33283q.f12789a;
            gh.mo1307l(z ? R.string.confirm_enable_personal_results_title : R.string.confirm_disable_personal_results_title);
            gh.mo1300f(true != z ? R.string.confirm_disable_personal_results_message : R.string.confirm_enable_personal_results_message);
            C0392m create = gh.setPositiveButton(true != z ? R.string.confirm_disable_personal_results_button : R.string.confirm_enable_personal_results_button, new C9578ax(ckVar, z)).setNegativeButton(true != z ? 17039360 : R.string.assistant_settings_no_thanks, new C9579ay(ckVar, z)).create();
            create.setCancelable(false);
            create.setCanceledOnTouchOutside(false);
            create.show();
            TextView textView = (TextView) create.mo1197b().mo1177e(16908299);
            if (textView != null) {
                textView.setMovementMethod(LinkMovementMethod.getInstance());
            }
        }
    }
}
