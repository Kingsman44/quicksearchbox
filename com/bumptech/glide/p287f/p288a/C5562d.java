package com.bumptech.glide.p287f.p288a;

import android.util.Log;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: com.bumptech.glide.f.a.d */
/* compiled from: PG */
final class C5562d implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    private final WeakReference f16844a;

    public C5562d(C5563e eVar) {
        this.f16844a = new WeakReference(eVar);
    }

    public final boolean onPreDraw() {
        if (Log.isLoggable("CustomViewTarget", 2)) {
            Log.v("CustomViewTarget", "OnGlobalLayoutListener called attachStateListener=".concat(toString()));
        }
        C5563e eVar = (C5563e) this.f16844a.get();
        if (eVar == null || eVar.f16847c.isEmpty()) {
            return true;
        }
        int b = eVar.mo11999b();
        int a = eVar.mo11998a();
        if (!C5563e.m14408d(b, a)) {
            return true;
        }
        ArrayList arrayList = new ArrayList(eVar.f16847c);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C5571m) arrayList.get(i)).mo12006g(b, a);
        }
        eVar.mo12000c();
        return true;
    }
}
