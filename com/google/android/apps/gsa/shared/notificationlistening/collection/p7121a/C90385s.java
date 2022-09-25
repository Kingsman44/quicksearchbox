package com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a;

import android.graphics.Bitmap;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.shared.notificationlistening.collection.a.s */
/* compiled from: PG */
public final class C90385s {

    /* renamed from: a */
    private static final C59071e f252439a = C59071e.m91332i("com.google.android.apps.gsa.shared.notificationlistening.collection.a.s");

    /* renamed from: a */
    public static Optional m146989a(Bitmap bitmap) {
        Optional optional;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i = 200;
        if (width < 200 || height < 200) {
            optional = Optional.empty();
        } else {
            double d = (double) width;
            double d2 = (double) height;
            Double.isNaN(d);
            Double.isNaN(d2);
            double d3 = d / d2;
            int i2 = d3 > 1.0d ? (int) (d3 * 200.0d) : 200;
            if (d3 <= 1.0d) {
                i = (int) (200.0d / d3);
            }
            try {
                bitmap.getAllocationByteCount();
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i2, i, true);
                createScaledBitmap.getAllocationByteCount();
                optional = Optional.m71637of(createScaledBitmap);
            } catch (IllegalArgumentException e) {
                ((C59052c) ((C59052c) ((C59052c) f252439a.mo56225c()).mo56382g(e)).mo56372aa(10883)).mo56386p("#ImageExtraction Couldn't resize image, using original image");
                optional = Optional.m71637of(bitmap);
            }
        }
        return optional.map(C90384r.f252438a);
    }
}
