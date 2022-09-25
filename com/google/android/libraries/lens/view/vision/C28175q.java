package com.google.android.libraries.lens.view.vision;

import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.vision.q */
/* compiled from: PG */
public abstract class C28175q {
    /* renamed from: a */
    public abstract int mo33632a();

    /* renamed from: b */
    public abstract int mo33633b();

    /* renamed from: c */
    public abstract int mo33634c();

    public final String toString() {
        return String.format(Locale.US, "NotTrackedFramesStats: %d, %d, %d", new Object[]{Integer.valueOf(mo33634c()), Integer.valueOf(mo33633b()), Integer.valueOf(mo33632a())});
    }
}
