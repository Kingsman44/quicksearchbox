package com.bumptech.glide.load.p299c.p300a;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.C5960s;
import com.bumptech.glide.load.C5962u;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.p293a.C5679av;

/* renamed from: com.bumptech.glide.load.c.a.al */
/* compiled from: PG */
public final class C5833al implements C5962u {

    /* renamed from: a */
    private final C5876y f17425a;

    public C5833al(C5876y yVar) {
        this.f17425a = yVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C5679av mo12293a(Object obj, int i, int i2, C5960s sVar) {
        C5876y yVar = this.f17425a;
        return yVar.mo12334a(new C5829ah((ParcelFileDescriptor) obj, yVar.f17484g, yVar.f17483f), i, i2, sVar, C5876y.f17481e);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo12294b(Object obj, C5960s sVar) {
        return ((!"HUAWEI".equalsIgnoreCase(Build.MANUFACTURER) && !"HONOR".equalsIgnoreCase(Build.MANUFACTURER)) || ((ParcelFileDescriptor) obj).getStatSize() <= 536870912) && ParcelFileDescriptorRewinder.m15281c();
    }
}
