package com.google.android.apps.gsa.staticplugins.hotwordenrollment.deeplink;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.C0815b;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.deeplink.b */
/* compiled from: PG */
public final /* synthetic */ class C101786b implements C0815b {

    /* renamed from: a */
    public final /* synthetic */ EnterVoiceMatchActivity f283928a;

    public /* synthetic */ C101786b(EnterVoiceMatchActivity enterVoiceMatchActivity) {
        this.f283928a = enterVoiceMatchActivity;
    }

    public final void onActivityResult(Object obj) {
        ActivityResult activityResult = (ActivityResult) obj;
        this.f283928a.finish();
    }
}
