package com.google.android.libraries.lens.ondevice.p2034k;

import android.graphics.Bitmap;
import com.google.android.libraries.barhopper.Barcode;
import com.google.android.libraries.barhopper.Barhopper;
import com.google.android.libraries.barhopper.RecognitionOptions;

/* renamed from: com.google.android.libraries.lens.ondevice.k.f */
/* compiled from: PG */
public final /* synthetic */ class C24670f {

    /* renamed from: a */
    public static final /* synthetic */ C24670f f67489a = new C24670f();

    private /* synthetic */ C24670f() {
    }

    /* renamed from: a */
    public final Barcode[] mo29980a(Bitmap bitmap, RecognitionOptions recognitionOptions) {
        return Barhopper.recognize(bitmap, recognitionOptions);
    }
}
