package com.google.android.libraries.storage.p3304a.p3312f;

import com.google.android.libraries.storage.p3304a.C42776f;
import com.google.android.libraries.storage.p3304a.C42797g;
import com.google.common.p4541l.C59316ad;
import java.io.File;
import java.io.RandomAccessFile;

/* renamed from: com.google.android.libraries.storage.a.f.j */
/* compiled from: PG */
public final class C42786j implements C42797g {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo34512a(C42776f fVar) {
        C42788l lVar = new C42788l();
        lVar.f112052a = true;
        File b = lVar.mo34512a(fVar);
        C59316ad.m92162b(b);
        return new RandomAccessFile(b, "rw");
    }
}
