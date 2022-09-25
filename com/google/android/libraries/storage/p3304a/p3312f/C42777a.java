package com.google.android.libraries.storage.p3304a.p3312f;

import android.net.Uri;
import com.google.android.libraries.storage.p3304a.C42769d;
import com.google.android.libraries.storage.p3304a.C42776f;
import com.google.android.libraries.storage.p3304a.C42797g;
import com.google.android.libraries.storage.p3304a.p3313g.C42802e;
import com.google.android.libraries.storage.p3304a.p3313g.C42803f;
import com.google.android.libraries.storage.p3304a.p3313g.C42805h;
import com.google.common.p4522b.C58557jl;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.libraries.storage.a.f.a */
/* compiled from: PG */
public final class C42777a implements C42797g {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo34512a(C42776f fVar) {
        OutputStream f = fVar.f112039b.mo45827f(fVar.f112043f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(f);
        if (!fVar.f112041d.isEmpty()) {
            List<C42803f> list = fVar.f112041d;
            Uri uri = fVar.f112042e;
            ArrayList arrayList2 = new ArrayList();
            for (C42803f a : list) {
                C42802e a2 = a.mo34689a(uri);
                if (a2 != null) {
                    arrayList2.add(a2);
                }
            }
            C42769d dVar = !arrayList2.isEmpty() ? new C42769d(f, arrayList2) : null;
            if (dVar != null) {
                arrayList.add(dVar);
            }
        }
        for (C42805h d : fVar.f112040c) {
            arrayList.add(d.mo45882d((OutputStream) C58557jl.m90131l(arrayList)));
        }
        Collections.reverse(arrayList);
        return (OutputStream) arrayList.get(0);
    }
}
