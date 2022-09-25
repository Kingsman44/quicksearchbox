package com.google.android.libraries.storage.p3304a.p3312f;

import com.google.android.libraries.storage.p3304a.C42738c;
import com.google.android.libraries.storage.p3304a.C42776f;
import com.google.android.libraries.storage.p3304a.C42797g;
import com.google.android.libraries.storage.p3304a.p3313g.C42801d;
import com.google.android.libraries.storage.p3304a.p3313g.C42803f;
import com.google.android.libraries.storage.p3304a.p3313g.C42805h;
import com.google.common.p4522b.C58557jl;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.libraries.storage.a.f.n */
/* compiled from: PG */
public final class C42790n implements C42797g {

    /* renamed from: a */
    public boolean f112055a = false;

    /* renamed from: b */
    public final InputStream mo34512a(C42776f fVar) {
        InputStream e = fVar.f112039b.mo45814e(fVar.f112043f);
        if (this.f112055a) {
            e = new BufferedInputStream(e);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(e);
        if (!fVar.f112041d.isEmpty()) {
            List<C42803f> list = fVar.f112041d;
            ArrayList arrayList2 = new ArrayList();
            for (C42803f h : list) {
                C42801d h2 = h.mo34694h();
                if (h2 != null) {
                    arrayList2.add(h2);
                }
            }
            C42738c cVar = !arrayList2.isEmpty() ? new C42738c(e, arrayList2) : null;
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        for (C42805h a : fVar.f112040c) {
            arrayList.add(a.mo45879a(fVar.f112042e, (InputStream) C58557jl.m90131l(arrayList)));
        }
        Collections.reverse(arrayList);
        return (InputStream) arrayList.get(0);
    }
}
