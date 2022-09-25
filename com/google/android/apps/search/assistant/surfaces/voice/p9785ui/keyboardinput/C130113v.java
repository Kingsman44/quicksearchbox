package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput;

import android.view.View;
import com.evernote.android.state.BuildConfig;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.v */
/* compiled from: PG */
final class C130113v implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C130109s f356771a;

    public C130113v(C130109s sVar) {
        this.f356771a = sVar;
    }

    public final void onClick(View view) {
        C130109s.m212407a(this.f356771a.f356752b).setText(BuildConfig.FLAVOR);
    }
}
