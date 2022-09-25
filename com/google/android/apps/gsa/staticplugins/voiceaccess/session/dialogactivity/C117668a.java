package com.google.android.apps.gsa.staticplugins.voiceaccess.session.dialogactivity;

import android.content.DialogInterface;
import android.content.Intent;
import com.google.p5235u.p5236a.p5237a.C67484a;
import com.google.p5235u.p5236a.p5237a.C67485b;

/* renamed from: com.google.android.apps.gsa.staticplugins.voiceaccess.session.dialogactivity.a */
/* compiled from: PG */
public final /* synthetic */ class C117668a implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ VoiceAccessDialogActivity f326611a;

    public /* synthetic */ C117668a(VoiceAccessDialogActivity voiceAccessDialogActivity) {
        this.f326611a = voiceAccessDialogActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        VoiceAccessDialogActivity voiceAccessDialogActivity = this.f326611a;
        C67485b bVar = C67485b.OPEN_APP_OR_BROWSER;
        C67484a.m97480a();
        C67484a.m97480a();
        voiceAccessDialogActivity.startActivity(new Intent("android.intent.action.VIEW", bVar.f183421c.buildUpon().appendQueryParameter("id", "com.google.android.apps.accessibility.voiceaccess").build()));
        voiceAccessDialogActivity.finish();
    }
}
