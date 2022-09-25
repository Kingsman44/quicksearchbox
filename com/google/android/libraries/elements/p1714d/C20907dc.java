package com.google.android.libraries.elements.p1714d;

import androidx.lifecycle.C2358bf;
import com.google.android.libraries.elements.interfaces.ComponentState;
import java.util.SortedMap;
import java.util.TreeMap;
import p5488io.p5490b.p5494b.C69803b;

/* renamed from: com.google.android.libraries.elements.d.dc */
/* compiled from: PG */
public final class C20907dc extends C2358bf implements C69803b {

    /* renamed from: a */
    private final SortedMap f58614a = new TreeMap();

    /* renamed from: b */
    private volatile boolean f58615b = false;

    /* renamed from: a */
    public final synchronized ComponentState mo26049a(String str) {
        return (ComponentState) this.f58614a.get(str);
    }

    /* renamed from: b */
    public final synchronized void mo26050b(String str, ComponentState componentState) {
        this.f58614a.put(str, componentState);
    }

    public final synchronized void dispose() {
        if (!this.f58615b) {
            for (ComponentState dispose : this.f58614a.values()) {
                dispose.dispose();
            }
            this.f58614a.clear();
            this.f58615b = true;
        }
    }

    /* renamed from: e */
    public final synchronized boolean mo25859e() {
        throw null;
    }
}
