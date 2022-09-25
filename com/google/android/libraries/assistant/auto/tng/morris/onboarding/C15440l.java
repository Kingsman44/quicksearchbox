package com.google.android.libraries.assistant.auto.tng.morris.onboarding;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.C0815b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.onboarding.l */
/* compiled from: PG */
public final /* synthetic */ class C15440l implements C0815b {

    /* renamed from: a */
    public final /* synthetic */ AssistantOnboardingActivity f46306a;

    public /* synthetic */ C15440l(AssistantOnboardingActivity assistantOnboardingActivity) {
        this.f46306a = assistantOnboardingActivity;
    }

    public final void onActivityResult(Object obj) {
        AssistantOnboardingActivity assistantOnboardingActivity = this.f46306a;
        if (((ActivityResult) obj).f2755a != -1) {
            C59104x d = C15441m.f46307a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "MorrisOobe.AsstActivity");
            ((C59052c) ((C59052c) d).mo56372aa(45883)).mo56386p("Notification access result not ok");
        }
        assistantOnboardingActivity.finish();
    }
}
