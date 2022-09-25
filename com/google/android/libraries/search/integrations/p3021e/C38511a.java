package com.google.android.libraries.search.integrations.p3021e;

import android.content.Context;
import android.util.Log;
import java.io.File;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.integrations.e.a */
/* compiled from: PG */
public final class C38511a {
    /* renamed from: a */
    public static final File m67760a(Context context, String str) {
        C69664n.m101061g(context, "<this>");
        File file = new File(context.getFilesDir(), str);
        if (!file.exists() && !file.mkdirs()) {
            Log.e("FileUtils", "Directory not created");
        }
        return file;
    }
}
