package com.bumptech.glide.p280a;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: com.bumptech.glide.a.i */
/* compiled from: PG */
final class C5510i {

    /* renamed from: a */
    static final Charset f16683a = Charset.forName("US-ASCII");

    static {
        Charset.forName("UTF-8");
    }

    /* renamed from: a */
    static void m14250a(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    static void m14251b(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            int i = 0;
            while (i < length) {
                File file2 = listFiles[i];
                if (file2.isDirectory()) {
                    m14251b(file2);
                }
                if (file2.delete()) {
                    i++;
                } else {
                    throw new IOException("failed to delete file: ".concat(String.valueOf(String.valueOf(file2))));
                }
            }
            return;
        }
        throw new IOException("not a readable directory: ".concat(String.valueOf(String.valueOf(file))));
    }
}
