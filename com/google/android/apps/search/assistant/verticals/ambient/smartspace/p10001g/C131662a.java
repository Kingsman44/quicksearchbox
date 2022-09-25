package com.google.android.apps.search.assistant.verticals.ambient.smartspace.p10001g;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.google.protobuf.C63087y;
import com.google.protobuf.C63088z;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.smartspace.g.a */
/* compiled from: PG */
public final /* synthetic */ class C131662a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C131666e f359743a;

    /* renamed from: b */
    public final /* synthetic */ int f359744b;

    public /* synthetic */ C131662a(C131666e eVar, int i) {
        this.f359743a = eVar;
        this.f359744b = i;
    }

    public final Object call() {
        C131666e eVar = this.f359743a;
        Bitmap decodeResource = BitmapFactory.decodeResource(eVar.f359750b.getResources(), this.f359744b);
        C63087y v = C63088z.m96150v();
        decodeResource.compress(Bitmap.CompressFormat.PNG, 100, v);
        return v.mo59165b();
    }
}
