package com.google.android.libraries.assistant.gallium.framework;

import com.google.android.libraries.p1635au.C19569f;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.gallium.framework.w */
/* compiled from: PG */
public final /* synthetic */ class C18320w implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ long f51960a;

    public /* synthetic */ C18320w(long j) {
        this.f51960a = j;
    }

    public final void accept(Object obj) {
        long j = this.f51960a;
        int i = GalliumIpc.f51688h;
        ((C19569f) ((C39141kp) obj).f103044p.mo6453a()).mo24824b((double) j, new Object[0]);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
