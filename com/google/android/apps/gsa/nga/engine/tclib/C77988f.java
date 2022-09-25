package com.google.android.apps.gsa.nga.engine.tclib;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.TextClassifierLib;

/* renamed from: com.google.android.apps.gsa.nga.engine.tclib.f */
/* compiled from: PG */
public final /* synthetic */ class C77988f implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ TcLibWrapper f214779a;

    public /* synthetic */ C77988f(TcLibWrapper tcLibWrapper) {
        this.f214779a = tcLibWrapper;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        TcLibWrapper tcLibWrapper = this.f214779a;
        synchronized (tcLibWrapper) {
            TextClassifierLib textClassifierLib = tcLibWrapper.f214755k;
            if (textClassifierLib != null) {
                textClassifierLib.mo58300a();
                tcLibWrapper.f214755k = null;
            }
        }
        return C118826c.f331422a;
    }
}
