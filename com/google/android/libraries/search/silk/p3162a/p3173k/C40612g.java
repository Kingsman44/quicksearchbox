package com.google.android.libraries.search.silk.p3162a.p3173k;

import android.location.Location;
import com.google.lens.sdk.C62635a;
import com.google.lens.sdk.C62646l;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.silk.a.k.g */
/* compiled from: PG */
public final /* synthetic */ class C40612g implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C62646l f106582a;

    public /* synthetic */ C40612g(C62646l lVar) {
        this.f106582a = lVar;
    }

    public final void accept(Object obj) {
        ((C62635a) this.f106582a).f169116d = (Location) obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
