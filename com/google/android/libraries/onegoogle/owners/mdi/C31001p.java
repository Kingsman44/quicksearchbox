package com.google.android.libraries.onegoogle.owners.mdi;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.google.common.base.C58817ah;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.libraries.onegoogle.owners.mdi.p */
/* compiled from: PG */
public final /* synthetic */ class C31001p implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C31001p f83498a = new C31001p();

    private /* synthetic */ C31001p() {
    }

    public final Object apply(Object obj) {
        InputStream inputStream = (InputStream) obj;
        if (inputStream == null) {
            return null;
        }
        Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
        try {
            inputStream.close();
        } catch (IOException unused) {
        }
        return decodeStream;
    }
}
