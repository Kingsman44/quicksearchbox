package com.google.android.libraries.web.webview.p3487i.p3490b;

import com.google.android.setupcompat.p3549a.C45240c;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashSet;
import p5462h.C69465a;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69764m;

/* renamed from: com.google.android.libraries.web.webview.i.b.a */
/* compiled from: PG */
public final class C44435a {
    /* renamed from: a */
    public final void mo47303a(File file, File file2) {
        File[] listFiles;
        LinkedHashSet<IOException> linkedHashSet = new LinkedHashSet<>();
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file3 : listFiles) {
                String canonicalPath = file3.getCanonicalPath();
                C69664n.m101060f(canonicalPath, "c.canonicalPath");
                String canonicalPath2 = file2.getCanonicalPath();
                C69664n.m101060f(canonicalPath2, "root.canonicalPath");
                if (C69764m.m101234m(canonicalPath, canonicalPath2)) {
                    try {
                        C69664n.m101060f(file3, C45240c.f118157a);
                        mo47303a(file3, file2);
                    } catch (IOException e) {
                        linkedHashSet.add(e);
                    }
                }
            }
        }
        if (!file.delete() || !linkedHashSet.isEmpty()) {
            new StringBuilder("Failed to delete file: ").append(file);
            FileNotFoundException fileNotFoundException = new FileNotFoundException("Failed to delete file: ".concat(String.valueOf(file)));
            for (IOException a : linkedHashSet) {
                C69465a.m100953a(fileNotFoundException, a);
            }
            throw fileNotFoundException;
        }
    }
}
