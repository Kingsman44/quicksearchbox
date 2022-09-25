package com.google.android.apps.gsa.shared.util;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4541l.C59317ae;
import com.google.common.p4541l.C59332o;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipInputStream;

/* renamed from: com.google.android.apps.gsa.shared.util.bv */
/* compiled from: PG */
public final class C90778bv {

    /* renamed from: a */
    private static final C59071e f253870a = C59071e.m91332i("com.google.android.apps.gsa.shared.util.bv");

    /* renamed from: a */
    public static int m148331a(InputStream inputStream, File file, String str) {
        ZipInputStream zipInputStream;
        FileOutputStream fileOutputStream;
        try {
            zipInputStream = new ZipInputStream(new BufferedInputStream(inputStream));
            boolean z = false;
            while (true) {
                try {
                    ZipEntry nextEntry = zipInputStream.getNextEntry();
                    int i = 1;
                    if (nextEntry != null) {
                        try {
                            String name = nextEntry.getName();
                            File file2 = new File(file, name);
                            if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
                                String name2 = file2.getName();
                                if (str != null && str.equals(name2)) {
                                    z = true;
                                }
                                m148332b(file2.getParentFile());
                                if (file2.exists()) {
                                    if (!m148333c(file2)) {
                                        String name3 = file2.getName();
                                        throw new IOException("Could not delete existing dest file '" + name3 + "'");
                                    }
                                }
                                if (!nextEntry.isDirectory()) {
                                    fileOutputStream = new FileOutputStream(file2);
                                    try {
                                        C59332o.m92211b(zipInputStream, fileOutputStream);
                                        C59317ae.m92163a(fileOutputStream);
                                    } catch (IOException e) {
                                        ((C59052c) ((C59052c) ((C59052c) f253870a.mo56225c()).mo56382g(e)).mo56372aa(11348)).mo56386p("Error processing download");
                                        C59317ae.m92163a(fileOutputStream);
                                        zipInputStream.close();
                                        return 0;
                                    }
                                } else if (!file2.mkdirs()) {
                                    String name4 = file2.getName();
                                    throw new IOException("Could not create new directory '" + name4 + "'");
                                }
                            } else {
                                throw new ZipException("Illegal name: ".concat(String.valueOf(name)));
                            }
                        } catch (Exception e2) {
                            ((C59052c) ((C59052c) f253870a.mo56225c()).mo56372aa(11349)).mo56389s("%s", e2.getMessage());
                            zipInputStream.close();
                            return 0;
                        }
                    } else {
                        if (true == z) {
                            i = 2;
                        }
                        zipInputStream.close();
                        return i;
                    }
                } catch (Throwable th) {
                    th = th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            zipInputStream = null;
            if (zipInputStream != null) {
                zipInputStream.close();
            }
            throw th;
        }
    }

    /* renamed from: c */
    private static boolean m148333c(File file) {
        File[] listFiles;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File c : listFiles) {
                m148333c(c);
            }
        }
        return file.delete();
    }

    /* renamed from: b */
    private static synchronized void m148332b(File file) {
        synchronized (C90778bv.class) {
            if (file == null) {
                throw new IOException("Directory was null");
            } else if (file.exists()) {
                if (!file.isDirectory()) {
                    throw new IOException(file.toString().concat(" exists, but is not a directory"));
                }
            } else if (!file.mkdirs()) {
                if (!file.isDirectory()) {
                    throw new IOException("Can not create directory ".concat(file.toString()));
                }
            }
        }
    }
}
