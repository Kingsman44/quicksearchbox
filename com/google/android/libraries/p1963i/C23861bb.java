package com.google.android.libraries.p1963i;

import android.os.Process;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.i.bb */
/* compiled from: PG */
public final class C23861bb {
    /* renamed from: a */
    public static final C23851az m44418a(Thread thread) {
        C69664n.m101061g(thread, "currentThread");
        if (thread == C23863bd.f65308a) {
            C23851az azVar = C23863bd.f65309b;
            if (azVar != null) {
                return azVar;
            }
            C23851az azVar2 = new C23851az(C23863bd.f65308a, Process.myTid(), 0, 8);
            C23863bd.f65309b = azVar2;
            return azVar2;
        } else if (!(thread instanceof C23842aq)) {
            return C23862bc.f65307a.get();
        } else {
            C23842aq aqVar = (C23842aq) thread;
            throw null;
        }
    }
}
