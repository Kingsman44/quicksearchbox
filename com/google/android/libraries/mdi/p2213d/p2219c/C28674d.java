package com.google.android.libraries.mdi.p2213d.p2219c;

import android.os.Handler;
import android.os.HandlerThread;
import com.google.common.base.C58881cr;

/* renamed from: com.google.android.libraries.mdi.d.c.d */
/* compiled from: PG */
public final /* synthetic */ class C28674d implements C58881cr {

    /* renamed from: a */
    public static final /* synthetic */ C28674d f77941a = new C28674d();

    private /* synthetic */ C28674d() {
    }

    /* renamed from: a */
    public final Object mo6453a() {
        HandlerThread handlerThread = new HandlerThread("ProtoDataStore-Message-Handler");
        handlerThread.start();
        return new Handler(handlerThread.getLooper());
    }
}
