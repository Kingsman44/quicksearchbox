package com.google.android.libraries.lens.view.p2070an.p2072b;

import android.graphics.Bitmap;
import android.os.Trace;

/* renamed from: com.google.android.libraries.lens.view.an.b.g */
/* compiled from: PG */
abstract class C25409g {
    /* renamed from: a */
    public abstract Bitmap mo30428a();

    /* renamed from: b */
    public abstract C25411i mo30429b();

    /* renamed from: c */
    public abstract void mo30430c(Bitmap bitmap);

    /* renamed from: d */
    public abstract void mo30431d(int i);

    /* renamed from: e */
    public final C25411i mo30466e() {
        if (mo30428a().isMutable()) {
            Trace.beginSection("copyMutableBitmap");
            try {
                mo30430c(mo30428a().copy(mo30428a().getConfig(), false));
            } finally {
                Trace.endSection();
            }
        }
        return mo30429b();
    }
}
