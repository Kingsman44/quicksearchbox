package com.google.android.apps.gsa.staticplugins.hotwordenrollment.deeplink;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.C0815b;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.deeplink.c */
/* compiled from: PG */
public final /* synthetic */ class C101787c implements C0815b {

    /* renamed from: a */
    public final /* synthetic */ EnterVoiceMatchActivity f283929a;

    public /* synthetic */ C101787c(EnterVoiceMatchActivity enterVoiceMatchActivity) {
        this.f283929a = enterVoiceMatchActivity;
    }

    public final void onActivityResult(Object obj) {
        EnterVoiceMatchActivity enterVoiceMatchActivity = this.f283929a;
        ActivityResult activityResult = (ActivityResult) obj;
        ((C89859i) enterVoiceMatchActivity.f283923j.mo27525b()).mo83702b(C89849ae.VOICE_MATCH_DEEPLINK_WELCOME_SCREEN_EXIT);
        enterVoiceMatchActivity.finish();
    }
}
