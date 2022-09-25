package com.google.android.libraries.lens.ondevice.p2034k;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import java.io.File;

/* renamed from: com.google.android.libraries.lens.ondevice.k.hn */
/* compiled from: PG */
public final class C24738hn {
    /* renamed from: a */
    public static C58833ax m45884a(String str, String str2, boolean z) {
        File[] listFiles = new File(str).listFiles();
        String str3 = true != z ? "en" : str2;
        if (true == z) {
            str2 = "en";
        }
        String format = String.format("nmt_rapid_response_%s_%s.pb.bin", new Object[]{str3, str2});
        if (listFiles == null) {
            return C58836b.f156633a;
        }
        for (File file : listFiles) {
            if (file.isFile() && file.getName().equals(format)) {
                return C58833ax.m90834k(file.getAbsolutePath());
            }
        }
        return C58836b.f156633a;
    }

    /* renamed from: b */
    public static String m45885b(String str, String str2) {
        File[] listFiles = new File(str).listFiles();
        if (listFiles != null && listFiles.length == 1 && listFiles[0].isDirectory()) {
            return listFiles[0].getAbsolutePath();
        }
        throw new IllegalStateException("Translation dictionary directory doesn't follow the structural convention for the model: ".concat(String.valueOf(str2)));
    }
}
