package com.google.android.apps.gsa.staticplugins.p7864du.p7866b;

import com.google.common.base.C58881cr;
import com.google.common.p4526f.C59071e;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.du.b.j */
/* compiled from: PG */
public final class C100184j implements C100181g {

    /* renamed from: a */
    public static final C59071e f280206a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.du.b.j");

    /* renamed from: b */
    public final String f280207b;

    public C100184j(String str) {
        this.f280207b = String.valueOf(str).concat("_blob_");
    }

    /* renamed from: a */
    public final C58881cr mo91783a(File file) {
        return new C100183i(file);
    }

    /* renamed from: b */
    public final File mo91784b(File file) {
        try {
            if (!file.exists()) {
                file.mkdirs();
            }
            return File.createTempFile(this.f280207b, ".bin", file);
        } catch (IOException e) {
            throw new RuntimeException("Error creating file", e);
        }
    }

    /* renamed from: c */
    public final void mo91785c(List list, List list2) {
        list.size();
        list2.size();
        ArrayList arrayList = new ArrayList(list2.size());
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new File((String) it.next()));
        }
        list.removeAll(arrayList);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((File) it2.next()).delete();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0046 A[SYNTHETIC, Splitter:B:21:0x0046] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0058 A[SYNTHETIC, Splitter:B:27:0x0058] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo91786d(java.io.File r4, byte[] r5) {
        /*
            r3 = this;
            java.lang.String r0 = "Failed to close stream"
            r1 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0026 }
            r2.<init>(r4)     // Catch:{ Exception -> 0x0026 }
            r2.write(r5)     // Catch:{ Exception -> 0x0021, all -> 0x001e }
            r4 = 1
            r2.close()     // Catch:{ Exception -> 0x0010 }
            goto L_0x0055
        L_0x0010:
            r5 = move-exception
            com.google.common.f.e r1 = f280206a
            com.google.common.f.x r1 = r1.mo56225c()
            r2 = 33186(0x81a2, float:4.6503E-41)
        L_0x001a:
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r5)).mo56372aa(r2)).mo56386p(r0)
            goto L_0x0055
        L_0x001e:
            r4 = move-exception
            r1 = r2
            goto L_0x0056
        L_0x0021:
            r4 = move-exception
            r1 = r2
            goto L_0x0027
        L_0x0024:
            r4 = move-exception
            goto L_0x0056
        L_0x0026:
            r4 = move-exception
        L_0x0027:
            com.google.common.f.e r5 = f280206a     // Catch:{ all -> 0x0024 }
            com.google.common.f.x r5 = r5.mo56225c()     // Catch:{ all -> 0x0024 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ all -> 0x0024 }
            com.google.common.f.x r4 = r5.mo56382g(r4)     // Catch:{ all -> 0x0024 }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ all -> 0x0024 }
            r5 = 33187(0x81a3, float:4.6505E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r5)     // Catch:{ all -> 0x0024 }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ all -> 0x0024 }
            java.lang.String r5 = "Failed to write file"
            r4.mo56386p(r5)     // Catch:{ all -> 0x0024 }
            r4 = 0
            if (r1 == 0) goto L_0x0055
            r1.close()     // Catch:{ Exception -> 0x004a }
            goto L_0x0055
        L_0x004a:
            r5 = move-exception
            com.google.common.f.e r1 = f280206a
            com.google.common.f.x r1 = r1.mo56225c()
            r2 = 33188(0x81a4, float:4.6506E-41)
            goto L_0x001a
        L_0x0055:
            return r4
        L_0x0056:
            if (r1 == 0) goto L_0x0069
            r1.close()     // Catch:{ Exception -> 0x005c }
            goto L_0x0069
        L_0x005c:
            r5 = move-exception
            com.google.common.f.e r1 = f280206a
            com.google.common.f.x r1 = r1.mo56225c()
            r2 = 33189(0x81a5, float:4.6508E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r5)).mo56372aa(r2)).mo56386p(r0)
        L_0x0069:
            goto L_0x006b
        L_0x006a:
            throw r4
        L_0x006b:
            goto L_0x006a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7864du.p7866b.C100184j.mo91786d(java.io.File, byte[]):boolean");
    }

    /* renamed from: e */
    public final File[] mo91787e(File file) {
        File[] listFiles = file.listFiles(new C100182h(this));
        return listFiles != null ? listFiles : new File[0];
    }
}
