package com.google.android.apps.gsa.assistant.settings.features.hotwordenrollment.voicematch;

import android.content.DialogInterface;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.app.C0391l;
import com.google.android.apps.gsa.assistant.settings.features.av.dn;
import com.google.android.apps.gsa.assistant.settings.shared.h;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.hotwordenrollment.voicematch.ad */
/* compiled from: PG */
public final class C73134ad {

    /* renamed from: a */
    public final dn f193898a;

    /* renamed from: b */
    public final h f193899b;

    public C73134ad(dn dnVar, h hVar) {
        this.f193898a = dnVar;
        this.f193899b = hVar;
    }

    /* renamed from: a */
    public final void mo64738a(Fragment fragment) {
        C0391l lVar = new C0391l(fragment.getContext());
        lVar.mo1307l(R.string.assistant_speaker_id_settings_retrain_dialog_title_v2);
        lVar.mo1300f(R.string.assistant_speaker_id_settings_retrain_dialog_message_v2);
        lVar.setPositiveButton(R.string.assistant_speaker_id_settings_retrain_dialog_positive_button, new C73133aa(this, fragment));
        lVar.setNegativeButton(17039360, (DialogInterface.OnClickListener) null).create().show();
    }
}
