package androidx.core.content;

import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.core.content.j */
/* compiled from: PG */
public final class C1884j {

    /* renamed from: a */
    public final HashMap f5767a = new HashMap();

    /* renamed from: b */
    private final String f5768b;

    public C1884j(String str) {
        this.f5768b = str;
    }

    /* renamed from: a */
    public final Uri mo5044a(File file) {
        String str;
        try {
            String canonicalPath = file.getCanonicalPath();
            Map.Entry entry = null;
            for (Map.Entry entry2 : this.f5767a.entrySet()) {
                String path = ((File) entry2.getValue()).getPath();
                if (canonicalPath.startsWith(path) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                    entry = entry2;
                }
            }
            if (entry != null) {
                String path2 = ((File) entry.getValue()).getPath();
                if (path2.endsWith("/")) {
                    str = canonicalPath.substring(path2.length());
                } else {
                    str = canonicalPath.substring(path2.length() + 1);
                }
                return new Uri.Builder().scheme("content").authority(this.f5768b).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(str, "/")).build();
            }
            throw new IllegalArgumentException("Failed to find configured root that contains ".concat(String.valueOf(canonicalPath)));
        } catch (IOException unused) {
            new StringBuilder("Failed to resolve canonical path for ").append(file);
            throw new IllegalArgumentException("Failed to resolve canonical path for ".concat(String.valueOf(file)));
        }
    }

    /* renamed from: b */
    public final File mo5045b(Uri uri) {
        String encodedPath = uri.getEncodedPath();
        int indexOf = encodedPath.indexOf(47, 1);
        String decode = Uri.decode(encodedPath.substring(1, indexOf));
        String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
        File file = (File) this.f5767a.get(decode);
        if (file != null) {
            File file2 = new File(file, decode2);
            try {
                File canonicalFile = file2.getCanonicalFile();
                if (canonicalFile.getPath().startsWith(file.getPath())) {
                    return canonicalFile;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException unused) {
                new StringBuilder("Failed to resolve canonical path for ").append(file2);
                throw new IllegalArgumentException("Failed to resolve canonical path for ".concat(file2.toString()));
            }
        } else {
            new StringBuilder("Unable to find configured root for ").append(uri);
            throw new IllegalArgumentException("Unable to find configured root for ".concat(String.valueOf(uri)));
        }
    }
}
