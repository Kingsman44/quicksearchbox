package com.google.android.apps.gsa.shared.util.p7178p;

import com.google.common.p4526f.C59071e;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.google.android.apps.gsa.shared.util.p.a */
/* compiled from: PG */
public final class C91071a {

    /* renamed from: a */
    public static final C59071e f254336a = C59071e.m91332i("com.google.android.apps.gsa.shared.util.p.a");

    /* renamed from: b */
    public final Object f254337b = new Object();

    /* renamed from: c */
    public final Set f254338c = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: d */
    public final boolean f254339d;

    public C91071a(boolean z) {
        this.f254339d = z;
    }

    /* renamed from: a */
    public final void mo85337a(C91072b bVar) {
        synchronized (this.f254337b) {
            this.f254338c.add(bVar);
        }
    }
}
