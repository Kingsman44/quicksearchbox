package com.google.android.libraries.p1703d;

import android.graphics.Bitmap;

/* renamed from: com.google.android.libraries.d.n */
/* compiled from: PG */
public abstract class C20658n {
    /* renamed from: a */
    public abstract C20659o mo25608a();

    /* renamed from: b */
    public abstract void mo25609b(String str);

    /* renamed from: c */
    public abstract void mo25610c(int i);

    /* renamed from: d */
    public abstract void mo25611d(Bitmap bitmap);

    /* renamed from: e */
    public final void mo25639e(Bitmap bitmap) {
        if (bitmap.isMutable()) {
            bitmap = bitmap.copy(bitmap.getConfig(), false);
        }
        mo25611d(bitmap);
    }
}
