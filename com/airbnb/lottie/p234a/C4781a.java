package com.airbnb.lottie.p234a;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.LocaleList;

/* renamed from: com.airbnb.lottie.a.a */
/* compiled from: PG */
public final class C4781a extends Paint {
    public C4781a() {
    }

    public final void setTextLocales(LocaleList localeList) {
    }

    public C4781a(int i) {
        super(i);
    }

    public C4781a(PorterDuff.Mode mode, byte[] bArr) {
        super(1);
        setXfermode(new PorterDuffXfermode(mode));
    }

    public C4781a(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }
}
