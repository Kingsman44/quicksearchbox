package com.google.android.apps.gsa.staticplugins.opa.smartspace;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.apps.gsa.opa.smartspace.C83801q;
import com.google.android.apps.gsa.opa.smartspace.C83802r;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.f */
/* compiled from: PG */
public final /* synthetic */ class C110666f implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C83802r f308381a;

    public /* synthetic */ C110666f(C83802r rVar) {
        this.f308381a = rVar;
    }

    public final Object apply(Object obj) {
        C83802r rVar = this.f308381a;
        Bitmap bitmap = ((BitmapDrawable) ((Drawable) obj)).getBitmap();
        C83801q b = rVar.mo77092b();
        b.mo77070b(bitmap);
        return b.mo77069a();
    }
}
