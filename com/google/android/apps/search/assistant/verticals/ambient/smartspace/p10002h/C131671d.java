package com.google.android.apps.search.assistant.verticals.ambient.smartspace.p10002h;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.google.protobuf.C63087y;
import com.google.protobuf.C63088z;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.smartspace.h.d */
/* compiled from: PG */
public final /* synthetic */ class C131671d implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C131672e f359761a;

    /* renamed from: b */
    public final /* synthetic */ int f359762b;

    public /* synthetic */ C131671d(C131672e eVar, int i) {
        this.f359761a = eVar;
        this.f359762b = i;
    }

    public final Object call() {
        C131672e eVar = this.f359761a;
        Bitmap decodeResource = BitmapFactory.decodeResource(eVar.f359764b.getResources(), this.f359762b);
        C63087y v = C63088z.m96150v();
        decodeResource.compress(Bitmap.CompressFormat.PNG, 100, v);
        return v.mo59165b();
    }
}
