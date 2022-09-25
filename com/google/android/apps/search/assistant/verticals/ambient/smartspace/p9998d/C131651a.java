package com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9998d;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.google.android.googlequicksearchbox.R;
import com.google.protobuf.C63087y;
import com.google.protobuf.C63088z;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.smartspace.d.a */
/* compiled from: PG */
public final /* synthetic */ class C131651a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C131655e f359708a;

    public /* synthetic */ C131651a(C131655e eVar) {
        this.f359708a = eVar;
    }

    public final Object call() {
        Bitmap decodeResource = BitmapFactory.decodeResource(this.f359708a.f359718a.getResources(), R.drawable.quantum_gm_ic_flight_takeoff_white_24);
        C63087y v = C63088z.m96150v();
        decodeResource.compress(Bitmap.CompressFormat.PNG, 100, v);
        return v.mo59165b();
    }
}
