package com.google.android.libraries.storage.p3304a.p3312f;

import android.content.res.AssetFileDescriptor;
import android.os.ParcelFileDescriptor;
import com.google.android.libraries.storage.p3304a.C42776f;
import com.google.android.libraries.storage.p3304a.C42797g;

/* renamed from: com.google.android.libraries.storage.a.f.b */
/* compiled from: PG */
public final class C42778b implements C42797g {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo34512a(C42776f fVar) {
        ParcelFileDescriptor b = C42785i.m75551b(fVar);
        return new AssetFileDescriptor(b, 0, b.getStatSize());
    }
}
