package com.bumptech.glide.load.p297b;

import android.os.ParcelFileDescriptor;
import java.io.File;

/* renamed from: com.bumptech.glide.load.b.u */
/* compiled from: PG */
final class C5813u implements C5816x {
    /* renamed from: a */
    public final Class mo12289a() {
        return ParcelFileDescriptor.class;
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo12290b(File file) {
        return ParcelFileDescriptor.open(file, 268435456);
    }

    /* renamed from: c */
    public final /* synthetic */ void mo12291c(Object obj) {
        ((ParcelFileDescriptor) obj).close();
    }
}
