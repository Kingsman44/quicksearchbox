package com.evernote.android.state;

import android.app.Application;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import java.util.LinkedHashMap;

/* compiled from: PG */
public final class StateSaver {
    public static final String ANDROID_PREFIX = "android.";
    private static final StateSaverImpl IMPL = new StateSaverImpl(new LinkedHashMap());
    public static final String JAVA_PREFIX = "java.";
    public static final String SUFFIX = "$$StateSaver";

    private StateSaver() {
        throw new UnsupportedOperationException();
    }

    public static Parcelable restoreInstanceState(View view, Parcelable parcelable) {
        return IMPL.restoreInstanceState(view, parcelable);
    }

    public static Parcelable saveInstanceState(View view, Parcelable parcelable) {
        return IMPL.saveInstanceState(view, parcelable);
    }

    public static void setEnabledForAllActivitiesAndSupportFragments(Application application, boolean z) {
        IMPL.setEnabledForAllActivitiesAndSupportFragments(application, z);
    }

    public static void restoreInstanceState(Object obj, Bundle bundle) {
        IMPL.restoreInstanceState(obj, bundle);
    }

    public static void saveInstanceState(Object obj, Bundle bundle) {
        IMPL.saveInstanceState(obj, bundle);
    }
}
