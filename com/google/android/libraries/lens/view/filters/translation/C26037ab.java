package com.google.android.libraries.lens.view.filters.translation;

import android.os.Environment;
import android.os.StatFs;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.ab */
/* compiled from: PG */
public final /* synthetic */ class C26037ab implements Callable {

    /* renamed from: a */
    public static final /* synthetic */ C26037ab f70757a = new C26037ab();

    private /* synthetic */ C26037ab() {
    }

    public final Object call() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
        return Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
    }
}
