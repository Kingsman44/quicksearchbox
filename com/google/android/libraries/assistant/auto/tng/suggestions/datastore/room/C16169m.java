package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.m */
/* compiled from: PG */
public enum C16169m {
    PRELOADED_ON_DEVICE(0),
    GENERATED_ON_DEVICE(1),
    PROACTIVE(2),
    SHORTCUT(3);
    

    /* renamed from: e */
    public final int f47720e;

    private C16169m(int i) {
        this.f47720e = i;
    }

    /* renamed from: a */
    public static C16169m m33196a(int i) {
        for (C16169m mVar : values()) {
            if (mVar.f47720e == i) {
                return mVar;
            }
        }
        throw new IllegalArgumentException(String.format("%s is not a valid number for Source", new Object[]{Integer.valueOf(i)}));
    }
}
