package com.google.android.libraries.assistant.gallium.framework.ipc.p1512a;

import com.google.android.libraries.assistant.gallium.framework.C18218av;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p5488io.grpc.C70761fa;
import p5488io.grpc.Status;

/* renamed from: com.google.android.libraries.assistant.gallium.framework.ipc.a.e */
/* compiled from: PG */
public final /* synthetic */ class C18259e implements C60931s {

    /* renamed from: a */
    public static final /* synthetic */ C18259e f51826a = new C18259e();

    private /* synthetic */ C18259e() {
    }

    public final C60870cx apply(Object obj) {
        Status status = ((C70761fa) obj).f188571a;
        throw C18218av.m35478a(status.getCode().value(), status.getDescription());
    }
}
