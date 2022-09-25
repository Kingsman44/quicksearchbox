package com.airbnb.lottie.p242d;

import com.airbnb.lottie.C4780a;
import com.evernote.android.state.BuildConfig;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

/* renamed from: com.airbnb.lottie.d.e */
/* compiled from: PG */
public final class C4900e {

    /* renamed from: a */
    private final C4780a f15637a;

    public C4900e(C4780a aVar) {
        this.f15637a = aVar;
    }

    /* renamed from: c */
    public static String m13595c(String str, C4898c cVar, boolean z) {
        String str2;
        String replaceAll = str.replaceAll("\\W+", BuildConfig.FLAVOR);
        if (z) {
            str2 = ".temp".concat(String.valueOf(cVar.f15636c));
        } else {
            str2 = cVar.f15636c;
        }
        return "lottie_cache_" + replaceAll + str2;
    }

    /* renamed from: a */
    public final File mo9837a() {
        File file = new File(this.f15637a.f15162a.getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: b */
    public final File mo9838b(String str, InputStream inputStream, C4898c cVar) {
        FileOutputStream fileOutputStream;
        File file = new File(mo9837a(), m13595c(str, cVar, true));
        try {
            fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    inputStream.close();
                    return file;
                }
            }
        } catch (Throwable th) {
            inputStream.close();
            throw th;
        }
    }
}
