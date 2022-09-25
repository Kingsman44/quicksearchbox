package com.google.android.libraries.lens.view.filecache;

import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;

/* compiled from: PG */
public final class LensFileProvider extends FileProvider {
    public final int delete(Uri uri, String str, String[] strArr) {
        if (uri.getPath() != null) {
            String path = uri.getPath();
            path.getClass();
            if (path.equals("/delete_all")) {
                Context context = getContext();
                context.getClass();
                File file = new File(context.getFilesDir(), "LensImages");
                if (!file.isDirectory()) {
                    return 0;
                }
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File file2 : listFiles) {
                        if (file2.isFile()) {
                            file2.delete();
                        }
                    }
                }
                file.delete();
                return 1;
            }
        }
        return super.delete(uri, str, strArr);
    }
}
