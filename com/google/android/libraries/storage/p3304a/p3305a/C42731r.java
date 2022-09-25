package com.google.android.libraries.storage.p3304a.p3305a;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Pair;

/* renamed from: com.google.android.libraries.storage.a.a.r */
/* compiled from: PG */
public final class C42731r {
    /* renamed from: a */
    public static Pair m75493a(ParcelFileDescriptor parcelFileDescriptor) {
        return Pair.create(new Uri.Builder().scheme("fd").opaquePart(String.valueOf(parcelFileDescriptor.getFd())).build(), new C42730q(parcelFileDescriptor));
    }
}
