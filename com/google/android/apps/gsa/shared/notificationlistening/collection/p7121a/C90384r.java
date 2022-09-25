package com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.shared.notificationlistening.collection.a.r */
/* compiled from: PG */
public final /* synthetic */ class C90384r implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C90384r f252438a = new C90384r();

    private /* synthetic */ C90384r() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) obj).compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        Bitmap decodeStream = BitmapFactory.decodeStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
        decodeStream.getAllocationByteCount();
        return decodeStream;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
