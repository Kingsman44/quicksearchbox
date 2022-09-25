package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f;

import android.graphics.Bitmap;
import com.google.common.base.C58817ah;
import p3186j$.util.Optional;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.f.m */
/* compiled from: PG */
public final /* synthetic */ class C15339m implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Consumer f46033a;

    public /* synthetic */ C15339m(Consumer consumer) {
        this.f46033a = consumer;
    }

    public final Object apply(Object obj) {
        boolean z;
        Consumer consumer = this.f46033a;
        Optional optional = (Optional) obj;
        if (optional.isPresent()) {
            consumer.accept((Bitmap) optional.get());
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
