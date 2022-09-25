package com.google.android.apps.gsa.staticplugins.avocado;

import android.graphics.Bitmap;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.p4526f.C59071e;
import java.io.ByteArrayOutputStream;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.cx */
/* compiled from: PG */
public final /* synthetic */ class C94245cx implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ Bitmap f263358a;

    public /* synthetic */ C94245cx(Bitmap bitmap) {
        this.f263358a = bitmap;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        Bitmap bitmap = this.f263358a;
        C59071e eVar = C94256dh.f263378a;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
        byteArrayOutputStream.flush();
        return byteArrayOutputStream;
    }
}
