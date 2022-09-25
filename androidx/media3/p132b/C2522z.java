package androidx.media3.p132b;

import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.common.p136b.C2612ak;
import com.google.android.libraries.p579ar.sceneviewer.p589ui.SimpleSnackbar;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: androidx.media3.b.z */
/* compiled from: PG */
public final class C2522z extends C2499c {

    /* renamed from: a */
    private RandomAccessFile f6937a;

    /* renamed from: b */
    private Uri f6938b;

    /* renamed from: c */
    private long f6939c;

    /* renamed from: d */
    private boolean f6940d;

    public C2522z() {
        super(false);
    }

    /* renamed from: a */
    public final int mo5879a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (this.f6939c == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f6937a;
            int i3 = C2612ak.f7249a;
            int read = randomAccessFile.read(bArr, i, (int) Math.min(this.f6939c, (long) i2));
            if (read > 0) {
                this.f6939c -= (long) read;
                mo5927g(read);
            }
            return read;
        } catch (IOException e) {
            throw new C2521y(e, SimpleSnackbar.LENGTH_SHORT);
        }
    }

    /* renamed from: b */
    public final long mo5880b(C2510n nVar) {
        Uri uri = nVar.f6891a;
        this.f6938b = uri;
        mo5929i(nVar);
        int i = 2006;
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, C33259r.f88929b);
            this.f6937a = randomAccessFile;
            try {
                randomAccessFile.seek(nVar.f6896f);
                long j = nVar.f6897g;
                if (j == -1) {
                    j = this.f6937a.length() - nVar.f6896f;
                }
                this.f6939c = j;
                if (j >= 0) {
                    this.f6940d = true;
                    mo5930j(nVar);
                    return this.f6939c;
                }
                throw new C2521y((String) null, (Throwable) null, 2008);
            } catch (IOException e) {
                throw new C2521y(e, SimpleSnackbar.LENGTH_SHORT);
            }
        } catch (FileNotFoundException e2) {
            if (!TextUtils.isEmpty(uri.getQuery()) || !TextUtils.isEmpty(uri.getFragment())) {
                throw new C2521y(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", new Object[]{uri.getPath(), uri.getQuery(), uri.getFragment()}), e2, 1004);
            }
            int i2 = C2612ak.f7249a;
            if (true != C2519w.m6645a(e2.getCause())) {
                i = 2005;
            }
            throw new C2521y(e2, i);
        } catch (SecurityException e3) {
            throw new C2521y(e3, 2006);
        } catch (RuntimeException e4) {
            throw new C2521y(e4, SimpleSnackbar.LENGTH_SHORT);
        }
    }

    /* renamed from: c */
    public final Uri mo5881c() {
        return this.f6938b;
    }

    /* renamed from: d */
    public final void mo5882d() {
        this.f6938b = null;
        try {
            RandomAccessFile randomAccessFile = this.f6937a;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.f6937a = null;
            if (this.f6940d) {
                this.f6940d = false;
                mo5928h();
            }
        } catch (IOException e) {
            throw new C2521y(e, SimpleSnackbar.LENGTH_SHORT);
        } catch (Throwable th) {
            this.f6937a = null;
            if (this.f6940d) {
                this.f6940d = false;
                mo5928h();
            }
            throw th;
        }
    }
}
