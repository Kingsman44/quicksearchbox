package com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9962e;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.google.protobuf.C63087y;
import com.google.protobuf.C63088z;
import java.util.concurrent.Callable;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.q.e.q */
/* compiled from: PG */
public final /* synthetic */ class C131248q implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C131251t f358890a;

    /* renamed from: b */
    public final /* synthetic */ int f358891b;

    public /* synthetic */ C131248q(C131251t tVar, int i) {
        this.f358890a = tVar;
        this.f358891b = i;
    }

    public final Object call() {
        C131251t tVar = this.f358890a;
        Bitmap decodeResource = BitmapFactory.decodeResource(tVar.f358896b.getResources(), this.f358891b);
        C63087y v = C63088z.m96150v();
        decodeResource.compress(Bitmap.CompressFormat.PNG, 100, v);
        return Optional.m71637of(v.mo59165b());
    }
}
