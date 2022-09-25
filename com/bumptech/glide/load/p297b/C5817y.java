package com.bumptech.glide.load.p297b;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.b.y */
/* compiled from: PG */
final class C5817y implements C5816x {
    /* renamed from: a */
    public final Class mo12289a() {
        return InputStream.class;
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo12290b(File file) {
        return new FileInputStream(file);
    }

    /* renamed from: c */
    public final /* synthetic */ void mo12291c(Object obj) {
        ((InputStream) obj).close();
    }
}
