package com.google.android.apps.search.transcription;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4543n.p4546c.C59401i;

/* renamed from: com.google.android.apps.search.transcription.c */
/* compiled from: PG */
public final class C141762c {

    /* renamed from: a */
    private static final C59071e f384732a = C59071e.m91332i("com.google.android.apps.search.transcription.c");

    static {
        new C59401i(500, 1.2d, 15);
        new C59401i(5000, 1.5d, 13);
    }

    /* renamed from: a */
    public static ComponentName m229998a(Context context) {
        ComponentName componentName = null;
        for (ResolveInfo next : context.getPackageManager().queryIntentActivities(new Intent("android.speech.action.RECOGNIZE_SPEECH"), 0)) {
            if (next.activityInfo.packageName.equals("com.google.android.tts") && Build.VERSION.SDK_INT >= 31) {
                return new ComponentName(next.activityInfo.packageName, next.activityInfo.name);
            }
            if (next.activityInfo.packageName.equals("com.google.android.googlequicksearchbox")) {
                componentName = new ComponentName(next.activityInfo.packageName, next.activityInfo.name);
            }
        }
        if (componentName != null) {
            return componentName;
        }
        ((C59052c) ((C59052c) f384732a.mo56226d()).mo56372aa(41820)).mo56386p("No Intent API provided by Google.");
        return null;
    }

    /* renamed from: b */
    public static ComponentName m229999b(Context context) {
        ComponentName componentName = null;
        for (ResolveInfo next : context.getPackageManager().queryIntentServices(new Intent("android.speech.RecognitionService"), 0)) {
            if (next.serviceInfo.packageName.equals("com.google.android.tts") && Build.VERSION.SDK_INT >= 31) {
                return new ComponentName(next.serviceInfo.packageName, next.serviceInfo.name);
            }
            if (next.serviceInfo.packageName.equals("com.google.android.googlequicksearchbox")) {
                componentName = new ComponentName(next.serviceInfo.packageName, next.serviceInfo.name);
            }
        }
        if (componentName != null) {
            return componentName;
        }
        ((C59052c) ((C59052c) f384732a.mo56226d()).mo56372aa(41821)).mo56386p("No speech services provided by Google.");
        return null;
    }

    /* renamed from: c */
    public static String m230000c(Context context) {
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        if (inputMethodManager == null) {
            ((C59052c) ((C59052c) f384732a.mo56226d()).mo56372aa(41823)).mo56386p("No input method service");
            return null;
        }
        String str = null;
        for (InputMethodInfo next : inputMethodManager.getInputMethodList()) {
            if (next.getPackageName().equals("com.google.android.tts") && next.getId().contains("VoiceInputMethodService") && Build.VERSION.SDK_INT >= 31) {
                return next.getId();
            }
            if (next.getPackageName().equals("com.google.android.googlequicksearchbox") && next.getId().contains("VoiceInputMethodService")) {
                str = next.getId();
            }
        }
        if (str != null) {
            return str;
        }
        ((C59052c) ((C59052c) f384732a.mo56226d()).mo56372aa(41822)).mo56386p("No voice input method provided by Google");
        return null;
    }
}
