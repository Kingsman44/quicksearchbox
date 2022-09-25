package com.google.android.libraries.elements.p1728g;

import android.content.Context;
import com.bumptech.glide.C6007z;
import com.bumptech.glide.p287f.C5588e;
import com.bumptech.glide.p287f.C5592i;
import com.bumptech.glide.p291h.C5622i;
import com.google.android.libraries.elements.interfaces.C21237ag;
import com.google.android.libraries.elements.interfaces.C21259bb;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.elements.interfaces.ImageProxy;
import com.google.android.libraries.elements.p1714d.C20818bb;
import com.google.protos.youtube.elements.C66260r;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.libraries.elements.g.d */
/* compiled from: PG */
public final class C21176d implements C21237ag {

    /* renamed from: b */
    private final Set f59400b = new HashSet();

    /* renamed from: a */
    public final void mo26205a() {
        for (C5588e c : this.f59400b) {
            c.mo12015c();
        }
        this.f59400b.clear();
    }

    /* renamed from: b */
    public final void mo26206b(Context context, ImageProxy imageProxy, ImageProxy imageProxy2, ImageProxy imageProxy3, int i, int i2, C20818bb bbVar, C21259bb bbVar2, boolean z) {
        C6007z c = C21195w.m39830c(context, imageProxy, imageProxy2, imageProxy3, i, i2, z);
        if (c != null) {
            C21175c cVar = new C21175c(imageProxy, bbVar, i, i2, C21195w.m39829b(imageProxy.contentMode()), bbVar2);
            c.mo12455s(cVar, (C5592i) null, c, C5622i.f16959a);
            C5588e eVar = cVar.f16843c;
            if (eVar == null) {
                bbVar2.mo25782a(C66260r.LOG_TYPE_MISSING_FIELD, "Unexpected null requester", C21319z.f59680u, (Throwable) null);
                return;
            }
            this.f59400b.add(eVar);
            return;
        }
    }
}
