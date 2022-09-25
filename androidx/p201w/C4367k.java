package androidx.p201w;

import android.content.Context;
import android.util.Log;
import android.webkit.WebResourceResponse;
import androidx.p201w.p202a.C4345n;
import androidx.p201w.p202a.C4349r;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: androidx.w.k */
/* compiled from: PG */
public final class C4367k implements C4368l {

    /* renamed from: a */
    private static final String[] f13975a = {"app_webview/", "databases/", "lib/", "shared_prefs/", "code_cache/"};

    /* renamed from: b */
    private final File f13976b;

    public C4367k(Context context, File file) {
        try {
            File file2 = new File(C4349r.m12494b(file));
            this.f13976b = file2;
            String b = C4349r.m12494b(file2);
            String b2 = C4349r.m12494b(context.getCacheDir());
            String b3 = C4349r.m12494b(C4345n.m12462f(context));
            if ((b.startsWith(b2) || b.startsWith(b3)) && !b.equals(b2) && !b.equals(b3)) {
                String[] strArr = f13975a;
                int i = 0;
                while (i < 5) {
                    if (!b.startsWith(String.valueOf(b3).concat(String.valueOf(strArr[i])))) {
                        i++;
                    }
                }
                return;
            }
            throw new IllegalArgumentException("The given directory \"" + file + "\" doesn't exist under an allowed app internal storage directory");
        } catch (IOException e) {
            throw new IllegalArgumentException("Failed to resolve the canonical path for the given directory: ".concat(String.valueOf(file.getPath())), e);
        }
    }

    /* renamed from: a */
    public final WebResourceResponse mo9290a(String str) {
        try {
            File file = this.f13976b;
            String b = C4349r.m12494b(file);
            String canonicalPath = new File(file, str).getCanonicalPath();
            File file2 = canonicalPath.startsWith(b) ? new File(canonicalPath) : null;
            if (file2 != null) {
                return new WebResourceResponse(C4349r.m12495c(str), (String) null, C4349r.m12493a(file2.getPath(), new FileInputStream(file2)));
            }
            Log.e("WebViewAssetLoader", String.format("The requested file: %s is outside the mounted directory: %s", new Object[]{str, this.f13976b}));
            return new WebResourceResponse((String) null, (String) null, (InputStream) null);
        } catch (IOException e) {
            Log.e("WebViewAssetLoader", "Error opening the requested path: ".concat(String.valueOf(str)), e);
        }
    }
}
