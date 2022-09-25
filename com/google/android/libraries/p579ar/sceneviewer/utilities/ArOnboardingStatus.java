package com.google.android.libraries.p579ar.sceneviewer.utilities;

import android.app.Activity;

@Deprecated
/* renamed from: com.google.android.libraries.ar.sceneviewer.utilities.ArOnboardingStatus */
/* compiled from: PG */
public final class ArOnboardingStatus {
    private static final String PREF_IS_AR_ONBOARDING_COMPLETE = "is_ar_onboarding_complete";

    private ArOnboardingStatus() {
    }

    @Deprecated
    public static boolean isArOnboardingCompleted(Activity activity) {
        return activity.getPreferences(0).getBoolean(PREF_IS_AR_ONBOARDING_COMPLETE, false);
    }

    @Deprecated
    public static void setIsArOnboardingCompleted(Activity activity, boolean z) {
        activity.getPreferences(0).edit().putBoolean(PREF_IS_AR_ONBOARDING_COMPLETE, z).apply();
    }
}
