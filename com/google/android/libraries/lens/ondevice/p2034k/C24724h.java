package com.google.android.libraries.lens.ondevice.p2034k;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Size;
import com.google.android.libraries.barhopper.Barcode;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.android.libraries.lens.view.session.ondevice.p2168c.C27940n;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56220aa;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56328z;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.lens.ondevice.k.h */
/* compiled from: PG */
public final class C24724h {

    /* renamed from: a */
    static final RecognitionOptions f67584a;

    /* renamed from: b */
    public static final C24670f f67585b = C24670f.f67489a;

    /* renamed from: c */
    public static final C24697g f67586c = C24697g.f67542a;

    static {
        RecognitionOptions recognitionOptions = new RecognitionOptions();
        recognitionOptions.setBarcodeFormats(256);
        f67584a = recognitionOptions;
    }

    /* renamed from: a */
    static C56220aa m45859a(C58485gu guVar, Bitmap bitmap) {
        C56328z zVar = (C56328z) C56220aa.f149748b.createBuilder();
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            zVar.mo54357b(C27940n.m52004e((Barcode) guVar.get(i), new Size(bitmap.getWidth(), bitmap.getHeight())));
        }
        return (C56220aa) zVar.build();
    }

    /* renamed from: b */
    static C58485gu m45860b(Context context, Bitmap bitmap, C24670f fVar, C24697g gVar) {
        long nanoTime = System.nanoTime();
        Bitmap a = gVar.mo29984a(context, bitmap);
        ((C58970a) ((C58970a) C24739i.f67617a.mo56224b()).mo56372aa(48836)).mo56388r("Blurring Barhopper input took %dms", TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime));
        try {
            return C58485gu.m89844l(fVar.mo29980a(a, f67584a));
        } finally {
            a.recycle();
        }
    }
}
