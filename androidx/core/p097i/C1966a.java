package androidx.core.p097i;

import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: androidx.core.i.a */
/* compiled from: PG */
public final class C1966a {

    /* renamed from: a */
    private final File f5885a;

    /* renamed from: b */
    private final File f5886b;

    /* renamed from: c */
    private final File f5887c;

    public C1966a(File file) {
        this.f5885a = file;
        this.f5886b = new File(String.valueOf(file.getPath()).concat(".new"));
        this.f5887c = new File(String.valueOf(file.getPath()).concat(".bak"));
    }

    /* renamed from: e */
    private static void m5297e(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            new StringBuilder("Failed to delete file which is a directory ").append(file2);
            Log.e("AtomicFile", "Failed to delete file which is a directory ".concat(String.valueOf(file2)));
        }
        if (!file.renameTo(file2)) {
            Log.e("AtomicFile", "Failed to rename " + file + " to " + file2);
        }
    }

    /* renamed from: f */
    private static boolean m5298f(FileOutputStream fileOutputStream) {
        try {
            fileOutputStream.getFD().sync();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final FileOutputStream mo5119a() {
        if (this.f5887c.exists()) {
            m5297e(this.f5887c, this.f5885a);
        }
        try {
            return new FileOutputStream(this.f5886b);
        } catch (FileNotFoundException unused) {
            if (this.f5886b.getParentFile().mkdirs()) {
                try {
                    return new FileOutputStream(this.f5886b);
                } catch (FileNotFoundException e) {
                    StringBuilder sb = new StringBuilder("Failed to create new file ");
                    File file = this.f5886b;
                    sb.append(file);
                    throw new IOException("Failed to create new file ".concat(file.toString()), e);
                }
            } else {
                StringBuilder sb2 = new StringBuilder("Failed to create directory for ");
                File file2 = this.f5886b;
                sb2.append(file2);
                throw new IOException("Failed to create directory for ".concat(file2.toString()));
            }
        }
    }

    /* renamed from: b */
    public final void mo5120b(FileOutputStream fileOutputStream) {
        if (!m5298f(fileOutputStream)) {
            Log.e("AtomicFile", "Failed to sync file output stream");
        }
        try {
            fileOutputStream.close();
        } catch (IOException e) {
            Log.e("AtomicFile", "Failed to close file output stream", e);
        }
        if (!this.f5886b.delete()) {
            StringBuilder sb = new StringBuilder("Failed to delete new file ");
            File file = this.f5886b;
            sb.append(file);
            Log.e("AtomicFile", "Failed to delete new file ".concat(file.toString()));
        }
    }

    /* renamed from: c */
    public final void mo5121c(FileOutputStream fileOutputStream) {
        if (!m5298f(fileOutputStream)) {
            Log.e("AtomicFile", "Failed to sync file output stream");
        }
        try {
            fileOutputStream.close();
        } catch (IOException e) {
            Log.e("AtomicFile", "Failed to close file output stream", e);
        }
        m5297e(this.f5886b, this.f5885a);
    }

    /* renamed from: d */
    public final byte[] mo5122d() {
        if (this.f5887c.exists()) {
            m5297e(this.f5887c, this.f5885a);
        }
        if (this.f5886b.exists() && this.f5885a.exists() && !this.f5886b.delete()) {
            StringBuilder sb = new StringBuilder("Failed to delete outdated new file ");
            File file = this.f5886b;
            sb.append(file);
            Log.e("AtomicFile", "Failed to delete outdated new file ".concat(file.toString()));
        }
        FileInputStream fileInputStream = new FileInputStream(this.f5885a);
        try {
            byte[] bArr = new byte[fileInputStream.available()];
            int i = 0;
            while (true) {
                int length = bArr.length;
                int read = fileInputStream.read(bArr, i, length - i);
                if (read <= 0) {
                    return bArr;
                }
                i += read;
                int available = fileInputStream.available();
                if (available > length - i) {
                    byte[] bArr2 = new byte[(available + i)];
                    System.arraycopy(bArr, 0, bArr2, 0, i);
                    bArr = bArr2;
                }
            }
        } finally {
            fileInputStream.close();
        }
    }
}
