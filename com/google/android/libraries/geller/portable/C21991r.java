package com.google.android.libraries.geller.portable;

import com.google.common.p4526f.C59071e;
import java.io.File;
import java.io.FileFilter;

/* renamed from: com.google.android.libraries.geller.portable.r */
/* compiled from: PG */
public final /* synthetic */ class C21991r implements FileFilter {

    /* renamed from: a */
    public static final /* synthetic */ C21991r f60661a = new C21991r();

    private /* synthetic */ C21991r() {
    }

    public final boolean accept(File file) {
        C59071e eVar = Geller.f60378a;
        return file.getName().startsWith("portable_geller_") && file.getName().endsWith(".db");
    }
}
