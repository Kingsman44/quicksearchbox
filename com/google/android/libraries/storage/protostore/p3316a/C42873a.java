package com.google.android.libraries.storage.protostore.p3316a;

import android.net.Uri;
import android.system.Os;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.android.libraries.storage.p3304a.p3312f.C42788l;
import java.io.File;
import java.io.IOException;
import java.util.Locale;

/* renamed from: com.google.android.libraries.storage.protostore.a.a */
/* compiled from: PG */
public final class C42873a {
    /* renamed from: a */
    public static IOException m75728a(C42813k kVar, Uri uri, IOException iOException) {
        try {
            C42788l lVar = new C42788l();
            lVar.f112052a = true;
            File file = (File) kVar.mo45889c(uri, lVar);
            if (!file.exists()) {
                return m75730c(file, iOException);
            }
            if (file.isFile()) {
                if (file.canRead()) {
                    if (file.canWrite()) {
                        return m75730c(file, iOException);
                    }
                    return m75730c(file, iOException);
                } else if (file.canWrite()) {
                    return m75730c(file, iOException);
                } else {
                    return m75730c(file, iOException);
                }
            } else if (file.canRead()) {
                if (file.canWrite()) {
                    return m75730c(file, iOException);
                }
                return m75730c(file, iOException);
            } else if (file.canWrite()) {
                return m75730c(file, iOException);
            } else {
                return m75730c(file, iOException);
            }
        } catch (IOException unused) {
            return new IOException(iOException);
        }
    }

    /* renamed from: b */
    private static IOException m75729b(File file, IOException iOException) {
        String str;
        try {
            str = "Inoperable file:" + String.format(Locale.US, " canonical[%s] freeSpace[%d]", new Object[]{file.getCanonicalPath(), Long.valueOf(file.getFreeSpace())});
            try {
                str = str + String.format(Locale.US, " mode[%d]", new Object[]{Integer.valueOf(Os.stat(file.getCanonicalPath()).st_mode)});
            } catch (Exception unused) {
            }
        } catch (IOException unused2) {
            str = "Inoperable file:".concat(" failed");
        }
        return new IOException(str, iOException);
    }

    /* renamed from: c */
    private static IOException m75730c(File file, IOException iOException) {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return m75729b(file, iOException);
        }
        if (!parentFile.exists()) {
            return m75729b(file, iOException);
        }
        if (parentFile.isDirectory()) {
            if (parentFile.canRead()) {
                if (parentFile.canWrite()) {
                    return m75729b(file, iOException);
                }
                return m75729b(file, iOException);
            } else if (parentFile.canWrite()) {
                return m75729b(file, iOException);
            } else {
                return m75729b(file, iOException);
            }
        } else if (parentFile.canRead()) {
            if (parentFile.canWrite()) {
                return m75729b(file, iOException);
            }
            return m75729b(file, iOException);
        } else if (parentFile.canWrite()) {
            return m75729b(file, iOException);
        } else {
            return m75729b(file, iOException);
        }
    }
}
