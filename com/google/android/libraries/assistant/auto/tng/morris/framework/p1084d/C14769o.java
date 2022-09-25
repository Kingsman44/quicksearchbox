package com.google.android.libraries.assistant.auto.tng.morris.framework.p1084d;

import java.util.Iterator;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.d.o */
/* compiled from: PG */
public final class C14769o {

    /* renamed from: a */
    public final C14774t f44544a;

    public C14769o(C14774t tVar) {
        this.f44544a = tVar;
    }

    /* renamed from: a */
    public static Optional m31101a(List list, int i) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C14773s sVar = (C14773s) it.next();
            if (sVar.mo21721c() == i) {
                return Optional.m71637of(sVar.mo21720b());
            }
        }
        return Optional.empty();
    }
}
