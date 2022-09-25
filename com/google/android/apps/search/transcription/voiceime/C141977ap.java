package com.google.android.apps.search.transcription.voiceime;

import android.content.ComponentName;
import android.content.Intent;
import android.view.View;

/* renamed from: com.google.android.apps.search.transcription.voiceime.ap */
/* compiled from: PG */
public final /* synthetic */ class C141977ap implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C141981at f385254a;

    public /* synthetic */ C141977ap(C141981at atVar) {
        this.f385254a = atVar;
    }

    public final void onClick(View view) {
        C141981at atVar = this.f385254a;
        atVar.f385259b.startActivity(new Intent("android.intent.action.MAIN").setComponent(new ComponentName(atVar.f385266i.getPackageName(), atVar.f385262e)).setFlags(402653184));
    }
}
