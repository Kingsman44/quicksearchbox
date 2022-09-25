package com.bumptech.glide.p287f.p288a;

import android.util.Log;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: com.bumptech.glide.f.a.o */
/* compiled from: PG */
final class C5573o implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    private final WeakReference f16856a;

    public C5573o(C5574p pVar) {
        this.f16856a = new WeakReference(pVar);
    }

    public final boolean onPreDraw() {
        if (Log.isLoggable("ViewTarget", 2)) {
            Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=".concat(toString()));
        }
        C5574p pVar = (C5574p) this.f16856a.get();
        if (pVar == null || pVar.f16859c.isEmpty()) {
            return true;
        }
        int b = pVar.mo12009b();
        int a = pVar.mo12008a();
        if (!C5574p.m14449d(b, a)) {
            return true;
        }
        ArrayList arrayList = new ArrayList(pVar.f16859c);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C5571m) arrayList.get(i)).mo12006g(b, a);
        }
        pVar.mo12010c();
        return true;
    }
}
