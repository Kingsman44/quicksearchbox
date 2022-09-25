package com.google.android.apps.search.transcription.voiceime;

import android.view.MotionEvent;
import android.view.View;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.search.transcription.voiceime.a */
/* compiled from: PG */
public final /* synthetic */ class C141957a implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ C142000c f385211a;

    public /* synthetic */ C141957a(C142000c cVar) {
        this.f385211a = cVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C142000c cVar = this.f385211a;
        if (motionEvent.getAction() == 1) {
            cVar.mo116959a((C60870cx) null);
        }
        cVar.f385310c.onTouchEvent(motionEvent);
        return false;
    }
}
