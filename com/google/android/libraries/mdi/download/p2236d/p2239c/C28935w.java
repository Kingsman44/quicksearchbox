package com.google.android.libraries.mdi.download.p2236d.p2239c;

import android.net.Uri;
import com.google.android.libraries.storage.p3304a.C42776f;
import com.google.android.libraries.storage.p3304a.C42797g;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.android.libraries.storage.p3304a.p3312f.C42790n;
import com.google.android.libraries.storage.p3304a.p3312f.C42796t;
import com.google.common.p4541l.C59332o;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipInputStream;

/* renamed from: com.google.android.libraries.mdi.download.d.c.w */
/* compiled from: PG */
public final class C28935w implements C42797g {

    /* renamed from: a */
    private final Uri f78598a;

    public C28935w(Uri uri) {
        this.f78598a = uri;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo34512a(C42776f fVar) {
        OutputStream outputStream;
        C42813k kVar = fVar.f112038a;
        try {
            C42790n nVar = new C42790n();
            nVar.f112055a = true;
            ZipInputStream zipInputStream = new ZipInputStream(nVar.mo34512a(fVar));
            while (true) {
                try {
                    ZipEntry nextEntry = zipInputStream.getNextEntry();
                    if (nextEntry != null) {
                        String name = nextEntry.getName();
                        if (name.contains("..")) {
                            File file = new File(name);
                            while (file != null) {
                                if (!file.getName().equals("..")) {
                                    file = file.getParentFile();
                                } else {
                                    throw new ZipException("Illegal name: ".concat(String.valueOf(name)));
                                }
                            }
                        }
                        Uri build = this.f78598a.buildUpon().appendPath(name).build();
                        if (nextEntry.isDirectory()) {
                            kVar.mo45890d(build);
                        } else {
                            outputStream = (OutputStream) kVar.mo45889c(build, new C42796t());
                            C59332o.m92211b(zipInputStream, outputStream);
                            if (outputStream != null) {
                                outputStream.close();
                            }
                        }
                    } else {
                        zipInputStream.close();
                        return null;
                    }
                } catch (Throwable th) {
                    zipInputStream.close();
                    throw th;
                }
            }
            throw th;
        } catch (IOException e) {
            kVar.mo45896j(this.f78598a);
            throw e;
        } catch (Throwable th2) {
            C28934v.m53856a(th, th2);
        }
    }
}
