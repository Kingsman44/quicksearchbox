package com.google.android.libraries.lens.view.vision;

import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.vision.y */
/* compiled from: PG */
public abstract class C28183y {
    /* renamed from: a */
    public abstract float mo33685a();

    /* renamed from: b */
    public abstract float mo33686b();

    /* renamed from: c */
    public abstract float mo33687c();

    public final String toString() {
        return String.format(Locale.US, "LatencyStats: (%.3f %.3f %.3f)", new Object[]{Float.valueOf(mo33685a()), Float.valueOf(mo33686b()), Float.valueOf(mo33687c())});
    }
}
