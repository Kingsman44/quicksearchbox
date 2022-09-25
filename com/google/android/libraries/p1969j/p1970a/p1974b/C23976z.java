package com.google.android.libraries.p1969j.p1970a.p1974b;

import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.j.a.b.z */
/* compiled from: PG */
public final /* synthetic */ class C23976z implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C23945ac f65575a;

    public /* synthetic */ C23976z(C23945ac acVar) {
        this.f65575a = acVar;
    }

    public final C60870cx apply(Object obj) {
        C23945ac acVar = this.f65575a;
        Exception exc = (Exception) obj;
        synchronized (C23948af.f65490e) {
            C23948af.f65490e.remove(acVar);
        }
        throw exc;
    }
}
