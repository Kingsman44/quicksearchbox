package com.google.android.libraries.micore.learning.base;

import android.content.Context;
import java.io.File;

/* renamed from: com.google.android.libraries.micore.learning.base.a */
/* compiled from: PG */
public final class C29709a implements C29715g {

    /* renamed from: a */
    private final Context f80469a;

    public C29709a(Context context) {
        context.getClass();
        this.f80469a = context;
    }

    /* renamed from: a */
    public final File mo34850a(String str, String str2) {
        return File.createTempFile(str, str2, this.f80469a.getCacheDir());
    }
}
