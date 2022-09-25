package com.google.android.libraries.geller;

import com.google.protos.p5129p.p5131b.C65753ak;
import java.io.File;
import java.io.FileFilter;

/* renamed from: com.google.android.libraries.geller.c */
/* compiled from: PG */
public final /* synthetic */ class C21759c implements FileFilter {

    /* renamed from: a */
    public static final /* synthetic */ C21759c f60059a = new C21759c();

    private /* synthetic */ C21759c() {
    }

    public final boolean accept(File file) {
        return file.getName().startsWith(C65753ak.PKG_ENTITIES.name());
    }
}
