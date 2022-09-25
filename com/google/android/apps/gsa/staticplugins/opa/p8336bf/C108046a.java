package com.google.android.apps.gsa.staticplugins.opa.p8336bf;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.speech.dumper.EventForDump;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bf.a */
/* compiled from: PG */
public final /* synthetic */ class C108046a implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C108051f f300553a;

    /* renamed from: b */
    public final /* synthetic */ C28292j f300554b;

    public /* synthetic */ C108046a(C108051f fVar, C28292j jVar) {
        this.f300553a = fVar;
        this.f300554b = jVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C108051f fVar = this.f300553a;
        C89949q.m146521e(C28285c.m52883j(this.f300554b, 5, (Integer) null), false);
        if (((C89994f) fVar.f300564e.mo27525b()).mo83819h()) {
            ((SharedPreferences) fVar.f300565f.mo27525b()).edit().putBoolean("hotwordDetector", false).apply();
        }
        ((C89994f) fVar.f300564e.mo27525b()).mo83903aw(2, EventForDump.m147675d(17));
        Intent intent = new Intent("com.google.android.googlequicksearchbox.STOP_DSP_HOTWORD");
        intent.setPackage("com.google.android.googlequicksearchbox");
        fVar.f300567h.sendBroadcast(intent, "android.permission.MANAGE_VOICE_KEYPHRASES");
        dialogInterface.dismiss();
        fVar.f300566g.finish();
    }
}
