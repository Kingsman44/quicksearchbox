package com.google.android.apps.gsa.shared.util.debug;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.android.apps.gsa.p5846e.C74507e;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
public class SelfDestructFileProvider extends C91021e {

    /* renamed from: a */
    private static Map f254182a;

    /* renamed from: b */
    static Map m148580b() {
        if (f254182a == null) {
            f254182a = new HashMap();
        }
        return f254182a;
    }

    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        C74507e.m120470f(5);
        ParcelFileDescriptor openFile = super.openFile(uri, str);
        List<String> pathSegments = uri.getPathSegments();
        File filesDir = getContext().getFilesDir();
        for (String file : pathSegments) {
            filesDir = new File(filesDir, file);
        }
        C91024h hVar = new C91024h(filesDir);
        m148580b().put(filesDir, hVar);
        hVar.startWatching();
        return openFile;
    }
}
