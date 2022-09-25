package com.google.android.libraries.assistant.auto.tng.p1026k.p1027a;

import android.os.Bundle;
import com.google.assistant.p3897e.p3921j.C52144gw;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.auto.tng.k.a.a */
/* compiled from: PG */
public final /* synthetic */ class C13710a implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Bundle f41817a;

    public /* synthetic */ C13710a(Bundle bundle) {
        this.f41817a = bundle;
    }

    public final void accept(Object obj) {
        Bundle bundle = this.f41817a;
        C52144gw gwVar = (C52144gw) obj;
        Bundle bundle2 = new Bundle();
        bundle2.putString(gwVar.f136823a, gwVar.f136824b);
        bundle.putBundle(gwVar.f136823a, bundle2);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
