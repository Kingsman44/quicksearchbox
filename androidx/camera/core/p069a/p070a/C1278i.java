package androidx.camera.core.p069a.p070a;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.camera.core.a.a.i */
/* compiled from: PG */
public final class C1278i implements Enumeration {

    /* renamed from: a */
    final Enumeration f3689a;

    /* renamed from: b */
    final /* synthetic */ C1279j f3690b;

    public C1278i(C1279j jVar) {
        this.f3690b = jVar;
        this.f3689a = Collections.enumeration(jVar.f3695b);
    }

    public final boolean hasMoreElements() {
        return this.f3689a.hasMoreElements();
    }

    public final /* bridge */ /* synthetic */ Object nextElement() {
        return new HashMap((Map) this.f3689a.nextElement());
    }
}
