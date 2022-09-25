package com.google.android.libraries.elements.p1714d.p1718d;

import android.view.View;
import com.google.android.libraries.elements.interfaces.C21309p;
import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.elements.interfaces.IntersectionObserver;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.libraries.elements.d.d.h */
/* compiled from: PG */
public abstract class C20886h extends IntersectionObserver {

    /* renamed from: d */
    final C21311r f58578d;

    /* renamed from: e */
    public final AtomicReference f58579e = new AtomicReference((Object) null);

    public C20886h(C21311r rVar) {
        if (rVar == null) {
            C21309p k = C21311r.m40252k();
            k.mo26700c(C21319z.f59680u);
            rVar = k.mo26698a();
        }
        this.f58578d = rVar;
    }

    /* renamed from: a */
    public final C21311r mo26019a() {
        View view = (View) this.f58579e.get();
        if (view == null) {
            return this.f58578d;
        }
        C21309p c = this.f58578d.mo26733c();
        c.mo26703f(view);
        return c.mo26698a();
    }
}
