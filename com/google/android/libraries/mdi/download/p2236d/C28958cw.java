package com.google.android.libraries.mdi.download.p2236d;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.io.IOException;

/* renamed from: com.google.android.libraries.mdi.download.d.cw */
/* compiled from: PG */
public final /* synthetic */ class C28958cw implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29117fe f78661a;

    public /* synthetic */ C28958cw(C29117fe feVar) {
        this.f78661a = feVar;
    }

    public final C60870cx apply(Object obj) {
        C29117fe feVar = this.f78661a;
        if (((Boolean) obj).booleanValue()) {
            return C60866ct.f164955a;
        }
        feVar.f78973b.mo34543h(1036);
        return C60856cj.m92899h(new IOException("Failed to commit new group metadata to disk."));
    }
}
