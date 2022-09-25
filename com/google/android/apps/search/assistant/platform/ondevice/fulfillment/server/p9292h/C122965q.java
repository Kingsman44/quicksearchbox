package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9292h;

import com.google.common.p4522b.C58528ij;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.h.q */
/* compiled from: PG */
public final class C122965q {

    /* renamed from: a */
    private final Set f340506a = new HashSet();

    /* renamed from: a */
    public final synchronized C58528ij mo105805a() {
        return C58528ij.m90006F(this.f340506a);
    }

    /* renamed from: b */
    public final synchronized void mo105806b(String str) {
        if (!str.isEmpty()) {
            this.f340506a.add(str);
        }
    }

    /* renamed from: c */
    public final synchronized void mo105807c(String str) {
        this.f340506a.remove(str);
    }
}
