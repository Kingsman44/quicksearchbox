package com.google.ads.interactivemedia.p367v3.internal;

import android.view.View;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import org.json.JSONObject;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aa */
/* compiled from: PG */
public final class C6780aa implements C7433y {

    /* renamed from: a */
    private final C7433y f20046a;

    public C6780aa(C7433y yVar) {
        this.f20046a = yVar;
    }

    /* renamed from: a */
    public final JSONObject mo14301a(View view) {
        return C6789ah.m18700b(0, 0, 0, 0);
    }

    /* renamed from: b */
    public final void mo14302b(View view, JSONObject jSONObject, C7406x xVar, boolean z) {
        ArrayList arrayList = new ArrayList();
        C7190p a = C7190p.m21443a();
        if (a != null) {
            Collection<C7001i> f = a.mo16268f();
            int size = f.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            for (C7001i j : f) {
                View j2 = j.mo16005j();
                if (j2 != null && j2.isAttachedToWindow() && j2.isShown()) {
                    View view2 = j2;
                    while (true) {
                        if (view2 != null) {
                            if (view2.getAlpha() == 0.0f) {
                                break;
                            }
                            ViewParent parent = view2.getParent();
                            view2 = parent instanceof View ? (View) parent : null;
                        } else {
                            View rootView = j2.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                float b = C6904ek.m20301b(rootView);
                                int size2 = arrayList.size();
                                while (size2 > 0) {
                                    int i = size2 - 1;
                                    if (C6904ek.m20301b((View) arrayList.get(i)) <= b) {
                                        break;
                                    }
                                    size2 = i;
                                }
                                arrayList.add(size2, rootView);
                            }
                        }
                    }
                }
            }
        }
        int size3 = arrayList.size();
        for (int i2 = 0; i2 < size3; i2++) {
            xVar.mo15162a((View) arrayList.get(i2), this.f20046a, jSONObject);
        }
    }
}
