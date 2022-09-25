package com.google.android.apps.search.googleapp.recents;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.io.File;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.googleapp.recents.h */
/* compiled from: PG */
public final /* synthetic */ class C137174h implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C137177k f373259a;

    /* renamed from: b */
    public final /* synthetic */ long f373260b;

    public /* synthetic */ C137174h(C137177k kVar, long j) {
        this.f373259a = kVar;
        this.f373260b = j;
    }

    public final C60870cx apply(Object obj) {
        C137177k kVar = this.f373259a;
        long j = this.f373260b;
        String format = String.format(Locale.US, "%s-%d.jpg", new Object[]{(String) obj, Long.valueOf(j)});
        try {
            File file = new File(kVar.f373271e.getFilesDir(), "recently");
            if (!file.exists()) {
                file.mkdir();
            }
            File file2 = new File(file, format);
            if (!file2.exists()) {
                file2.createNewFile();
            }
            return C60856cj.m92900i(file2);
        } catch (Exception e) {
            return C60856cj.m92899h(e);
        }
    }
}
