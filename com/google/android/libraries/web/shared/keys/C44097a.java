package com.google.android.libraries.web.shared.keys;

import android.os.Parcel;
import java.util.Map;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.web.shared.keys.a */
/* compiled from: PG */
public final /* synthetic */ class C44097a implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Parcel f114781a;

    public /* synthetic */ C44097a(Parcel parcel) {
        this.f114781a = parcel;
    }

    public final void accept(Object obj) {
        Parcel parcel = this.f114781a;
        Map.Entry entry = (Map.Entry) obj;
        parcel.writeString(((Class) entry.getKey()).getName());
        parcel.writeString(((Class) entry.getValue()).getName());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
