package com.google.android.libraries.storage.p3304a.p3312f;

import android.net.Uri;
import com.google.android.libraries.storage.p3304a.C42776f;
import com.google.android.libraries.storage.p3304a.C42797g;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.common.p4522b.C58557jl;
import java.io.FileNotFoundException;
import java.util.ArrayDeque;

/* renamed from: com.google.android.libraries.storage.a.f.q */
/* compiled from: PG */
public final class C42793q implements C42797g {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo34512a(C42776f fVar) {
        ArrayDeque arrayDeque = new ArrayDeque();
        C42813k kVar = fVar.f112038a;
        C58557jl.m90136q(arrayDeque, kVar.mo45888b(fVar.f112042e.buildUpon().fragment((String) null).build()));
        long j = 0;
        while (!arrayDeque.isEmpty()) {
            Uri uri = (Uri) arrayDeque.remove();
            if (kVar.mo45895i(uri)) {
                C58557jl.m90136q(arrayDeque, kVar.mo45888b(uri));
            } else if (kVar.mo45894h(uri)) {
                j += kVar.mo45887a(uri);
            } else {
                throw new FileNotFoundException(String.format("Child %s could not be opened", new Object[]{uri}));
            }
        }
        return Long.valueOf(j);
    }
}
