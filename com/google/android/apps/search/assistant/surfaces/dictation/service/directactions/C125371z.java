package com.google.android.apps.search.assistant.surfaces.dictation.service.directactions;

import androidx.p104d.p105a.C2164c;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.z */
/* compiled from: PG */
public final /* synthetic */ class C125371z implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ String f345781a;

    public /* synthetic */ C125371z(String str) {
        this.f345781a = str;
    }

    public final void accept(Object obj) {
        ((C2164c) obj).mo5439d(new Exception(this.f345781a));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
