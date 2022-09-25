package com.google.android.apps.gsa.staticplugins.voiceaccess.session.dialogactivity;

import android.content.DialogInterface;
import android.content.Intent;

/* renamed from: com.google.android.apps.gsa.staticplugins.voiceaccess.session.dialogactivity.b */
/* compiled from: PG */
public final /* synthetic */ class C117669b implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ VoiceAccessDialogActivity f326612a;

    public /* synthetic */ C117669b(VoiceAccessDialogActivity voiceAccessDialogActivity) {
        this.f326612a = voiceAccessDialogActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        VoiceAccessDialogActivity voiceAccessDialogActivity = this.f326612a;
        Intent intent = new Intent("android.settings.ACCESSIBILITY_SETTINGS");
        intent.addFlags(67108864);
        voiceAccessDialogActivity.startActivity(intent);
        voiceAccessDialogActivity.finish();
    }
}
