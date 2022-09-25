package com.google.android.play.core.p3534f;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: com.google.android.play.core.f.j */
/* compiled from: PG */
final class C45102j implements C45104l {

    /* renamed from: a */
    final /* synthetic */ Set f117769a;

    /* renamed from: b */
    final /* synthetic */ C45112t f117770b;

    /* renamed from: c */
    final /* synthetic */ ZipFile f117771c;

    public C45102j(Set set, C45112t tVar, ZipFile zipFile) {
        this.f117769a = set;
        this.f117770b = tVar;
        this.f117771c = zipFile;
    }

    /* renamed from: a */
    public final void mo48937a(C45105m mVar, File file, boolean z) {
        FileOutputStream fileOutputStream;
        this.f117769a.add(file);
        if (!z) {
            Log.i("SplitCompat", String.format("NativeLibraryExtractor: split '%s' has native library '%s' that does not exist; extracting from '%s!%s' to '%s'", new Object[]{this.f117770b.mo48920b(), mVar.f117772a, this.f117770b.mo48919a().getAbsolutePath(), mVar.f117773b.getName(), file.getAbsolutePath()}));
            ZipFile zipFile = this.f117771c;
            ZipEntry zipEntry = mVar.f117773b;
            int i = C45106n.f117774b;
            byte[] bArr = new byte[4096];
            if (file.exists()) {
                file.delete();
            }
            InputStream inputStream = zipFile.getInputStream(zipEntry);
            try {
                fileOutputStream = new FileOutputStream(file);
                C45097e.m80269l(file);
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
                fileOutputStream.close();
                if (inputStream != null) {
                    inputStream.close();
                    return;
                }
                return;
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th2) {
                        C45098f.m80281a(th, th2);
                    }
                }
                throw th;
            }
        } else {
            return;
        }
        throw th;
    }
}
