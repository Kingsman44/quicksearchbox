package com.google.android.gms.learning.p10823d;

import java.io.File;
import java.io.FileFilter;

/* renamed from: com.google.android.gms.learning.d.r */
/* compiled from: PG */
public final /* synthetic */ class C144605r implements FileFilter {

    /* renamed from: a */
    public static final /* synthetic */ C144605r f391296a = new C144605r();

    private /* synthetic */ C144605r() {
    }

    public final boolean accept(File file) {
        return C144588ad.f391244a.matcher(file.getName()).matches() || C144588ad.f391245b.matcher(file.getName()).matches() || C144588ad.f391246c.matcher(file.getName()).matches();
    }
}
