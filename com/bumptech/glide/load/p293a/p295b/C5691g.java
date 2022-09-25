package com.bumptech.glide.load.p293a.p295b;

import java.io.File;

/* renamed from: com.bumptech.glide.load.a.b.g */
/* compiled from: PG */
public class C5691g {

    /* renamed from: a */
    private final long f17155a;

    /* renamed from: b */
    private final C5693i f17156b;

    public C5691g(C5693i iVar, long j) {
        this.f17155a = j;
        this.f17156b = iVar;
    }

    /* renamed from: a */
    public final C5686b mo12195a() {
        File file;
        C5693i iVar = this.f17156b;
        File cacheDir = iVar.f17162a.getCacheDir();
        if (cacheDir == null) {
            file = null;
        } else {
            file = new File(cacheDir, iVar.f17163b);
        }
        if (file == null) {
            return null;
        }
        if (file.isDirectory() || file.mkdirs()) {
            return new C5692h(file, this.f17155a);
        }
        return null;
    }
}
