package com.google.android.apps.gsa.shared.util.p7180q;

/* renamed from: com.google.android.apps.gsa.shared.util.q.c */
/* compiled from: PG */
public enum C91084c {
    DEFAULT("com.google.android.googlequicksearchbox"),
    AFW("com.google.android.googlequicksearchbox:afw"),
    CRASH_REPORT("com.google.android.googlequicksearchbox:crash_report"),
    CLIENT_LOGGING("com.google.android.googlequicksearchbox:client_logging"),
    DEV("com.google.android.googlequicksearchbox:dev"),
    INTERACTOR("com.google.android.googlequicksearchbox:interactor"),
    MANAGE_SPACE("com.google.android.googlequicksearchbox:managespace"),
    SEARCH("com.google.android.googlequicksearchbox:search"),
    UI("com.google.android.googlequicksearchbox:ui"),
    WALLPAPER_CHOOSER("com.google.android.googlequicksearchbox:wallpaper_chooser"),
    ASSISTANT("com.google.android.googlequicksearchbox:assistant"),
    TRAIN("com.google.android.googlequicksearchbox:train"),
    PLAYCORE_MISSING_SPLITS_ACTIVITY("com.google.android.googlequicksearchbox:playcore_missing_splits_activity"),
    PLAYCORE_DIALOG_WRAPPER_ACTIVITY("com.google.android.googlequicksearchbox:playcore_dialog_wrapper_activity"),
    PRIMES_LIFEBOAT("com.google.android.googlequicksearchbox:primes_lifeboat");
    

    /* renamed from: p */
    public final String f254376p;

    private C91084c(String str) {
        this.f254376p = str;
    }

    /* renamed from: a */
    public static C91084c m148804a(String str) {
        if (str == null) {
            return null;
        }
        for (C91084c cVar : values()) {
            if (cVar.f254376p.equals(str)) {
                return cVar;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final boolean mo85351b() {
        return this == SEARCH;
    }

    public final String toString() {
        return this.f254376p;
    }
}
