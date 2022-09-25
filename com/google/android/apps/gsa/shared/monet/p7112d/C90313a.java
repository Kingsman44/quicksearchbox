package com.google.android.apps.gsa.shared.monet.p7112d;

import android.graphics.Rect;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.google.android.apps.gsa.shared.monet.d.a */
/* compiled from: PG */
public final class C90313a implements C90314b {

    /* renamed from: a */
    public final Set f252239a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    public Rect f252240b;

    /* renamed from: a */
    public final void mo83994a(C90315c cVar) {
        this.f252239a.add(cVar);
        Rect rect = this.f252240b;
        if (rect != null) {
            cVar.mo83996a(rect);
        }
    }

    /* renamed from: b */
    public final void mo83995b(C90315c cVar) {
        this.f252239a.remove(cVar);
    }
}
