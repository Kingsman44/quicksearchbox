package com.google.android.libraries.assistant.contexttrigger.p1462f;

import com.evernote.android.state.BuildConfig;
import com.google.assistant.p3803ag.p3807b.p3808a.C48893ah;
import com.google.assistant.p3803ag.p3807b.p3808a.C48897al;
import java.util.Map;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.f.e */
/* compiled from: PG */
public final /* synthetic */ class C17713e implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C17716h f50911a;

    public /* synthetic */ C17713e(C17716h hVar) {
        this.f50911a = hVar;
    }

    public final void accept(Object obj) {
        Map map = this.f50911a.f50920d;
        C48897al alVar = (C48897al) ((C48893ah) obj).instance;
        map.remove(alVar.f126529b == 4 ? (String) alVar.f126530c : BuildConfig.FLAVOR);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
