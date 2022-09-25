package com.google.android.libraries.social.populous.storage;

import java.io.File;
import java.io.FileFilter;

/* renamed from: com.google.android.libraries.social.populous.storage.am */
/* compiled from: PG */
public final /* synthetic */ class C42612am implements FileFilter {

    /* renamed from: a */
    public static final /* synthetic */ C42612am f111810a = new C42612am();

    private /* synthetic */ C42612am() {
    }

    public final boolean accept(File file) {
        return file.isDirectory() && file.getName().equals("peopleCache");
    }
}
