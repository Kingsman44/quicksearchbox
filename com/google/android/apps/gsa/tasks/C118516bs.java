package com.google.android.apps.gsa.tasks;

import android.os.Parcelable;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.shared.util.DummyParcelable;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.util.concurrent.C60856cj;

/* renamed from: com.google.android.apps.gsa.tasks.bs */
/* compiled from: PG */
public final /* synthetic */ class C118516bs implements C22864c {

    /* renamed from: a */
    public static final /* synthetic */ C118516bs f328934a = new C118516bs();

    private /* synthetic */ C118516bs() {
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        Throwable th;
        ServiceEventData serviceEventData = (ServiceEventData) obj;
        long j = C118517bt.f328935a;
        if (!serviceEventData.mo81913d(Parcelable.class)) {
            th = null;
        } else {
            th = (Throwable) ((DummyParcelable) serviceEventData.mo81912b(Parcelable.class)).f253766a;
        }
        if (th == null) {
            return C118826c.f331423b;
        }
        return C60856cj.m92899h(th);
    }
}
