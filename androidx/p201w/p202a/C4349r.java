package androidx.p201w.p202a;

import android.content.Context;
import java.io.File;
import java.io.InputStream;
import java.net.URLConnection;
import java.util.zip.GZIPInputStream;

/* renamed from: androidx.w.a.r */
/* compiled from: PG */
public final class C4349r {

    /* renamed from: a */
    public final Context f13964a;

    public C4349r(Context context) {
        this.f13964a = context;
    }

    /* renamed from: a */
    public static InputStream m12493a(String str, InputStream inputStream) {
        return str.endsWith(".svgz") ? new GZIPInputStream(inputStream) : inputStream;
    }

    /* renamed from: b */
    public static String m12494b(File file) {
        String canonicalPath = file.getCanonicalPath();
        return !canonicalPath.endsWith("/") ? String.valueOf(canonicalPath).concat("/") : canonicalPath;
    }

    /* renamed from: c */
    public static String m12495c(String str) {
        String guessContentTypeFromName = URLConnection.guessContentTypeFromName(str);
        return guessContentTypeFromName == null ? "text/plain" : guessContentTypeFromName;
    }
}
