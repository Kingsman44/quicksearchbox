package com.google.android.apps.gsa.staticplugins.p7800di.p7805e;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.staticplugins.p7800di.p7802b.C99554d;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.google.android.apps.gsa.staticplugins.di.e.c */
/* compiled from: PG */
public final class C99593c implements C118549h {

    /* renamed from: a */
    private static final C59071e f278713a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.di.e.c");

    /* renamed from: b */
    private final C99554d f278714b;

    /* renamed from: c */
    private final int f278715c;

    public C99593c(C99554d dVar, int i) {
        this.f278714b = dVar;
        this.f278715c = i;
    }

    /* renamed from: a */
    public final C60870cx mo65234a(C118476ak akVar) {
        File[] listFiles;
        C59104x b = f278713a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SProtoFileCleanerTask");
        ((C59052c) ((C59052c) b).mo56372aa(32658)).mo56389s("Cleaning session proto files to be within %.1f MB", Float.valueOf(((float) this.f278715c) / 1000000.0f));
        File a = this.f278714b.mo91494a();
        int i = this.f278715c;
        if (a.exists() && a.isDirectory() && (listFiles = a.listFiles()) != null) {
            ArrayList<File> arrayList = new ArrayList<>(r2);
            for (File file : listFiles) {
                if (file.isFile()) {
                    arrayList.add(file);
                }
            }
            Collections.sort(arrayList, C99592b.f278712b);
            long j = 0;
            for (File length : arrayList) {
                j += length.length();
            }
            for (File file2 : arrayList) {
                if (j <= ((long) i)) {
                    break;
                }
                long length2 = file2.length();
                try {
                    if (file2.delete()) {
                        j -= length2;
                    } else {
                        C59104x c = C99592b.f278711a.mo56225c();
                        c.mo56378ag(C58975e.f156826a, "LRMFileCleaner");
                        ((C59052c) ((C59052c) c).mo56372aa(32655)).mo56389s("Failed to delete file[%s]. I don't know why :-/", file2);
                    }
                } catch (SecurityException e) {
                    C59104x c2 = C99592b.f278711a.mo56225c();
                    c2.mo56378ag(C58975e.f156826a, "LRMFileCleaner");
                    ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(32656)).mo56389s("Failed to delete file[%s]", file2);
                }
            }
            if (j > ((long) i)) {
                C59104x c3 = C99592b.f278711a.mo56225c();
                c3.mo56378ag(C58975e.f156826a, "LRMFileCleaner");
                ((C59052c) ((C59052c) c3).mo56372aa(32654)).mo56389s("Unable to clean up enough files from directory[%s]", a);
            }
        }
        return C118826c.f331423b;
    }
}
