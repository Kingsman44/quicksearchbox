package com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9260c.p9261a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122099h;
import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122105n;
import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122106o;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.a.c.a.e */
/* compiled from: PG */
public final class C122114e {

    /* renamed from: a */
    private final C58495hd f338767a;

    public C122114e(C58495hd hdVar) {
        this.f338767a = hdVar;
    }

    /* renamed from: a */
    public final C60870cx mo105537a(C122099h hVar) {
        String str;
        C122106o oVar = hVar.f338747b;
        if (oVar == null) {
            oVar = C122106o.f338758c;
        }
        Function function = (Function) this.f338767a.get(oVar);
        if (function != null) {
            return (C60870cx) function.apply(hVar);
        }
        int i = oVar.f338760a;
        int a = C122105n.m201640a(i);
        int i2 = a - 1;
        if (a != 0) {
            if (i2 == 0) {
                str = "key { conversation_param = " + (i == 1 ? (String) oVar.f338761b : BuildConfig.FLAVOR) + " }";
            } else if (i2 == 1) {
                str = "key { generic_context = " + (i == 2 ? ((Integer) oVar.f338761b).intValue() : 0) + " }";
            } else if (i2 == 2) {
                str = "key { invalid }";
            } else {
                throw new AssertionError();
            }
            return C60856cj.m92899h(new IllegalArgumentException("Unsupported key: ".concat(str)));
        }
        throw null;
    }
}
