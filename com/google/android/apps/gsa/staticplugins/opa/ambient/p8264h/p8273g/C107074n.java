package com.google.android.apps.gsa.staticplugins.opa.ambient.p8264h.p8273g;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.protobuf.C63087y;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.h.g.n */
/* compiled from: PG */
public final /* synthetic */ class C107074n implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C107076p f298124a;

    public /* synthetic */ C107074n(C107076p pVar) {
        this.f298124a = pVar;
    }

    public final Object apply(Object obj) {
        C107076p pVar = this.f298124a;
        Drawable drawable = (Drawable) obj;
        if (drawable instanceof BitmapDrawable) {
            C63087y v = C63088z.m96150v();
            ((BitmapDrawable) drawable).getBitmap().compress(Bitmap.CompressFormat.PNG, 100, v);
            ((C58970a) ((C58970a) pVar.f298127a.mo56224b()).mo56372aa(23479)).mo56387q("#bitmapDrawableToByteString: Loaded %d bytes.", v.mo59164a());
            return v.mo59165b();
        } else if (drawable instanceof VectorDrawable) {
            VectorDrawable vectorDrawable = (VectorDrawable) drawable;
            Bitmap createBitmap = Bitmap.createBitmap(200, 200, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            vectorDrawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            vectorDrawable.draw(canvas);
            C63087y v2 = C63088z.m96150v();
            createBitmap.compress(Bitmap.CompressFormat.PNG, 100, v2);
            ((C58970a) ((C58970a) pVar.f298127a.mo56224b()).mo56372aa(23485)).mo56387q("#vectorDrawableToByteString: Loaded %d bytes.", v2.mo59164a());
            return v2.mo59165b();
        } else {
            if (drawable == null) {
                ((C58970a) ((C58970a) pVar.f298127a.mo56225c()).mo56372aa(23483)).mo56386p("#drawableToByteSring: Drawable is null");
            } else {
                ((C58970a) ((C58970a) pVar.f298127a.mo56225c()).mo56372aa(23482)).mo56389s("#drawableToByteString: Unsupported drawable type: %s", drawable.getClass().getCanonicalName());
            }
            return C63088z.f170246b;
        }
    }
}
