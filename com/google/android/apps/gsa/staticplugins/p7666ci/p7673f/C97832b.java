package com.google.android.apps.gsa.staticplugins.p7666ci.p7673f;

import android.graphics.Bitmap;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.base.C58833ax;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.ci.f.b */
/* compiled from: PG */
public final /* synthetic */ class C97832b implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ Consumer f273195a;

    public /* synthetic */ C97832b(Consumer consumer) {
        this.f273195a = consumer;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        boolean z;
        Consumer consumer = this.f273195a;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            consumer.accept((Bitmap) axVar.mo56107c());
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
