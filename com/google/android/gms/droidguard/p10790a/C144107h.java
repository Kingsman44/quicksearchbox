package com.google.android.gms.droidguard.p10790a;

import java.io.File;

/* renamed from: com.google.android.gms.droidguard.a.h */
/* compiled from: PG */
public final class C144107h {

    /* renamed from: a */
    public final C144103d f390386a;

    /* renamed from: b */
    public final File f390387b;

    /* renamed from: c */
    public final File f390388c;

    public C144107h(C144103d dVar, File file, File file2) {
        this.f390386a = dVar;
        this.f390387b = file;
        this.f390388c = file2;
    }

    /* renamed from: a */
    public final boolean mo119655a() {
        if (this.f390386a.f390381b.isFile() && this.f390387b.isDirectory()) {
            return true;
        }
        return false;
    }
}
