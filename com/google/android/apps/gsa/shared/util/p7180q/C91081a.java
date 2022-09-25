package com.google.android.apps.gsa.shared.util.p7180q;

import com.google.android.libraries.p11012aj.C147596b;
import com.google.common.base.C58838bb;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.gsa.shared.util.q.a */
/* compiled from: PG */
public final class C91081a {

    /* renamed from: a */
    static final AtomicReference f254357a = new AtomicReference((Object) null);

    /* renamed from: b */
    public static final AtomicReference f254358b = new AtomicReference((Object) null);

    /* renamed from: a */
    public static C91084c m148802a() {
        AtomicReference atomicReference = f254358b;
        C91084c cVar = (C91084c) atomicReference.get();
        if (cVar == null) {
            String str = (String) f254357a.get();
            if (str == null) {
                str = C147596b.m240671b();
            }
            cVar = C91084c.m148804a(str);
            atomicReference.set(cVar);
        }
        C58838bb.m90866a(cVar, "ApplicationProcess.id has not been initialized");
        return cVar;
    }
}
