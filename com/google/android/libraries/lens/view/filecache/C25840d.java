package com.google.android.libraries.lens.view.filecache;

import androidx.core.content.FileProvider;
import com.google.android.libraries.lens.view.p2078at.C25542y;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.filecache.d */
/* compiled from: PG */
public final /* synthetic */ class C25840d implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C25848l f70195a;

    /* renamed from: b */
    public final /* synthetic */ C25542y f70196b;

    /* renamed from: c */
    public final /* synthetic */ C25838b f70197c;

    public /* synthetic */ C25840d(C25848l lVar, C25542y yVar, C25838b bVar) {
        this.f70195a = lVar;
        this.f70196b = yVar;
        this.f70197c = bVar;
    }

    public final C60870cx apply(Object obj) {
        C25848l lVar = this.f70195a;
        C25542y yVar = this.f70196b;
        C25838b bVar = this.f70197c;
        Integer num = (Integer) obj;
        File file = new File(lVar.f70210a.getFilesDir(), "LensImages");
        if (!file.isDirectory()) {
            file.mkdir();
        }
        String format = String.format("File_%s.%s", new Object[]{new SimpleDateFormat("yyyyMMdd-HHmmss", Locale.US).format(new Date(lVar.f70211b.mo26870b())), (String) yVar.f69532d.get(0)});
        File file2 = new File(file, format);
        FileOutputStream openFileOutput = lVar.f70210a.openFileOutput(format, 0);
        try {
            bVar.mo30984b(openFileOutput);
            if (openFileOutput != null) {
                openFileOutput.close();
            }
            new File(lVar.f70210a.getFilesDir(), format).renameTo(file2);
            return C60856cj.m92900i(FileProvider.m5057a(lVar.f70210a, lVar.f70213d).mo5044a(file2));
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}
