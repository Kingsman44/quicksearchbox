package com.google.android.libraries.search.assistant.performer.p2753e;

import android.content.Context;
import androidx.core.content.FileProvider;
import java.io.File;

/* renamed from: com.google.android.libraries.search.assistant.performer.e.a */
/* compiled from: PG */
public final class C35988a extends FileProvider {

    /* renamed from: a */
    public static final /* synthetic */ int f94176a = 0;

    /* renamed from: b */
    static File m64378b(String str, Context context) {
        File file = new File(context.getCacheDir(), "personal_photos");
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str);
    }
}
