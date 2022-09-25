package com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9402f;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.c.f.a */
/* compiled from: PG */
public final class C124606a {

    /* renamed from: a */
    private final Context f343724a;

    public C124606a(Context context) {
        this.f343724a = context;
    }

    /* renamed from: a */
    public final File mo106557a() {
        Context context = this.f343724a;
        C69664n.m101061g(context, "<this>");
        File file = new File(context.getCacheDir(), "assistant");
        if (!file.exists() && !file.mkdirs()) {
            Log.e("FileUtils", "Directory not created");
        }
        if (file.exists()) {
            return file;
        }
        throw new IOException("Unable to make storage directory: ".concat(file.toString()));
    }

    @Deprecated
    /* renamed from: b */
    public final File mo106558b() {
        File file = new File(this.f343724a.getExternalCacheDir(), "assistant");
        if (file.exists() || file.mkdirs() || file.exists()) {
            return file;
        }
        throw new IOException("Unable to make storage directory: ".concat(file.toString()));
    }
}
