package com.google.android.libraries.storage.protostore;

import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.libraries.storage.protostore.ai */
/* compiled from: PG */
public final /* synthetic */ class C42883ai implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C42905ba f112193a;

    public /* synthetic */ C42883ai(C42905ba baVar) {
        this.f112193a = baVar;
    }

    public final C60870cx apply(Object obj) {
        C42905ba baVar = this.f112193a;
        MessageLite messageLite = (MessageLite) obj;
        synchronized (baVar.f112253h) {
            C60870cx cxVar = baVar.f112254i;
            if (cxVar != null) {
                cxVar.cancel(false);
            }
        }
        return baVar.mo45987b();
    }
}
