package com.google.android.setupcompat.p3550b;

import android.content.Intent;
import java.util.Arrays;

/* renamed from: com.google.android.setupcompat.b.g */
/* compiled from: PG */
public final class C45250g {
    /* renamed from: a */
    public static void m80605a(Intent intent, Intent intent2) {
        intent2.putExtra("wizardBundle", intent.getBundleExtra("wizardBundle"));
        for (String str : Arrays.asList(new String[]{"firstRun", "deferredSetup", "preDeferredSetup", "portalSetup", "isSetupFlow", "isSuwSuggestedActionFlow"})) {
            intent2.putExtra(str, intent.getBooleanExtra(str, false));
        }
        for (String str2 : Arrays.asList(new String[]{"theme", "scriptUri", "actionId"})) {
            intent2.putExtra(str2, intent.getStringExtra(str2));
        }
    }

    /* renamed from: b */
    public static boolean m80606b(Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.getBooleanExtra("isSetupFlow", false);
    }

    /* renamed from: c */
    public static boolean m80607c(Intent intent) {
        return intent != null && intent.getBooleanExtra("deferredSetup", false);
    }
}
