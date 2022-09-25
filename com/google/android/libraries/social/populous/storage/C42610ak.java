package com.google.android.libraries.social.populous.storage;

import android.text.TextUtils;
import java.io.File;
import java.io.FileFilter;

/* renamed from: com.google.android.libraries.social.populous.storage.ak */
/* compiled from: PG */
public final /* synthetic */ class C42610ak implements FileFilter {

    /* renamed from: a */
    public static final /* synthetic */ C42610ak f111808a = new C42610ak();

    private /* synthetic */ C42610ak() {
    }

    public final boolean accept(File file) {
        return file.isDirectory() && TextUtils.isDigitsOnly(file.getName());
    }
}
