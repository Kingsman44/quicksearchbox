package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6184j.p6185a;

import android.graphics.Bitmap;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.j.a.i */
/* compiled from: PG */
public final /* synthetic */ class C78593i implements C60931s {

    /* renamed from: a */
    public static final /* synthetic */ C78593i f216392a = new C78593i();

    private /* synthetic */ C78593i() {
    }

    public final C60870cx apply(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        C59071e eVar = C78583aa.f216340a;
        return C60856cj.m92900i(Bitmap.createScaledBitmap(bitmap, (int) ((720.0f / ((float) bitmap.getHeight())) * ((float) bitmap.getWidth())), 720, false));
    }
}
